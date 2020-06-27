package com.example.demo;

import java.util.Collections;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.example.demo.repository.Arret_BusRepository;
import com.example.demo.repository.VilleRepository;
@RunWith(SpringRunner.class)
@WebMvcTest
public class UnitTest {
@Autowired
MockMvc mockMvc;
@MockBean
VilleRepository villeRepository;
@MockBean 
Arret_BusRepository arret_BusRepository;
@Test
public void contestLoads() throws Exception
{
	Mockito.when(villeRepository.findAll()).thenReturn(Collections.emptyList());
	MvcResult mvcResult=mockMvc.perform(
			MockMvcRequestBuilders.get("/GetItiniraires")
			.accept(org.springframework.http.MediaType.APPLICATION_JSON))
	.andReturn();
	
		System.out.println(mvcResult.getResponse());
	Mockito.verify(villeRepository).findAll();
	Mockito.verify(arret_BusRepository).findAll();

	
}
	public UnitTest() {
		// TODO Auto-generated constructor stub
	}

}
