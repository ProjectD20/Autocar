/**
 * 
 */
package com.example.demo.controllers;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.models.Arret_Bus;
import com.example.demo.models.Ville;
import com.example.demo.repository.Arret_BusRepository;
import com.example.demo.repository.VilleRepository;

/**
 * @author Mahmoud
 *
 */
@RestController
@CrossOrigin(origins= "http://localhost:4200")

public class ItineraireController {


	@Autowired
	 VilleRepository villeReposotery; 
	@Autowired
	Arret_BusRepository arret_BusRepository;
	public int min ;// Nombre minimum de ville d'arret dans le voyage
	public int Max;// Nombre Maximal de ville d'arret dans le voyage
	public long id_D; //id de la ville destinataire du voyage
	public long id_S; // id de la ville Source du voyage
	public long budjetL; // Budjet convertit en long
	private Ville sourceObj; // objet representent la ville Source(id et Nom)
	private Ville destinationObj;// objet representent la ville destination(id et Nom)
	private java.util.List<Arret_Bus> l;
	private static java.util.List<String[]> result;	
	private static int indexRes;
	
	public ItineraireController() {
		indexRes=0;
		}
	
		//principale fonctionalité : retourne les itineraire possible entre S et D verifiant B et H
	@RequestMapping(value = "/GetItiniraires", method = RequestMethod.GET)
	public List<String[]> GetItiniraires(@RequestParam("Source") String Source,
            @RequestParam("Budjet") String Budjet,
            @RequestParam("Duree") String Duree) {
		//get Ville destination and ville Sources IDs
		sourceObj = this.villeReposotery.findBynomVille(Source);
		destinationObj=this.villeReposotery.findBynomVille("Paris");
		result =new ArrayList<String[]>() ;

		//System.out.println(s.getId());
		//System.out.println(d.getId());
		//Calculer min:(Nombre minimum d'arret dans le voyage) et Max( nombre Maximal d'arret dans le voyage
		budjetL=Long.parseLong(Budjet);
		min=0;

		if(budjetL==10)
		{
			min=0;
		}else if(budjetL==8)
		{
			min=1;
		}else if(budjetL==6)
		{
			min=2;
		}else if(budjetL==4)
		{
			min=3;
		}else if(budjetL==2)
		{
			min=4;
		}
		
		// calcule de la valeur de Max nombre maximal d'arret dans le voyage
		//System.out.println(Duree);
		switch (Duree) {
		case "3h00":
			Max=0;
			break;
		case "3h30":
			Max=1;
			break;
		case "4h00":
			Max=2;
			break;
		case "4h30":
			Max=3;
			break;
		case "5h00":
			Max=4;
			break;
		default:
			Max=0;
			break;
		}
	
		//System.out.println("Valeur de Min");
    	//System.out.println(min);
    	//System.out.println("Valeur de Max");
    	//System.out.println(Max);
    	//get all itiniraire with s /D in list L 
    	this.l = arret_BusRepository.findByIdsIdd(sourceObj.getId(), destinationObj.getId());
    	//System.out.println(l.get(0));
    	//System.out.println(l.get(1));
    	//let's sort that list of itiniraire 
    	Collections.sort(this.l);
    	//System.out.println(l.get(0));
    	//System.out.println(l.get(1));
    	//convert List itiniraire to tab Name string sorted
    	 List<String> itiniraires = new ArrayList<>();//tableau contenant les nom des ville itiniraire possible entre D et S

        for (int i = 0; i < l.size(); ++i) {
        	String name=villeReposotery.findById(l.get(i).getId_Ville_Arret()).get().getNomVille();
        	itiniraires.add(i, name);
        	//System.out.println(villeReposotery.findById(l.get(i).getId_Ville_Arret()).get().getNomVille());
          //  System.out.println(itiniraires.get(i));	
        }
        
    	//Combination :: of Itiniraires Call
        //System.out.println("itiniraire size");
       // System.out.println(itiniraires.size());
       // String arr[] = {"1", "2", "3", "4", "5"}; 
        
        String[] itiniraire=new String[itiniraires.size()];
        for(int  i=0;i<itiniraires.size();i++) {
        	//System.out.print(itiniraires.get(i));
        	itiniraire[i]=itiniraires.get(i);
        }
        
        for(int  i=0;i<itiniraire.length;i++) {
        	//System.out.print(itiniraire[i]);
        }
        //System.out.println(itiniraire.length);
        int n = itiniraire.length;

        System.out.println(min);
        System.out.println(Max);
        if(min==0)
        {
        	String[] v=new String[1];
        	v[0]="direct";
        	result.add(v);
        }
        
        for(int r=min;r<Max+1;r++)
        {
       printCombination(itiniraire, n, r); 
        }
		//return (String[][]) villeReposotery.findAll();
      //	String [][] matrix =  { {"Lille","Compiègne","Paris"}, {"Lille","Arras","Paris"} };
 		return this.result;
    }

	
	
	///////////////////////////////////////////////////////////////////////////////////////////
	
	
	
//cambination functions	
static void combinationUtil(String arr[], int n, int r, int index, 
             String[] data, int i) 
{ 
// Current combination is ready to be printed, print it 
if (index == r) 
{ 
	String[] v=new String[r];

for (int j=0; j<r; j++) 
{
	v[j]=data[j];
	indexRes++;
	
}
if(v.length>0)
result.add(v);
return; 
} 

// When no more elements are there to put in data[] 
if (i >= n) 
return; 

// current is included, put next at next location 
data[index] = arr[i]; 
combinationUtil(arr, n, r, index+1, data, i+1); 

// current is excluded, replace it with next (Note that 
// i+1 is passed, but index is not changed) 
combinationUtil(arr, n, r, index, data, i+1); 
} 





///////////////////////////////////////////////////////////////////////////////////////////////////



// The main function that prints all combinations of size r 
// in arr[] of size n. This function mainly uses combinationUtil() 


static void printCombination(String arr[], int n, int r) 
{ 
// A temporary array to store all combination one by one 
String data[]=new String[r]; 

// Print all combination using temprary array 'data[]' 
combinationUtil(arr, n, r, 0, data, 0); 
} 
	
	
}

