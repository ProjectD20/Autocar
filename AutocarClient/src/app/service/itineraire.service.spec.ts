import { TestBed } from '@angular/core/testing';

import { ItineraireService } from './itineraire.service';

describe('ItineraireService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ItineraireService = TestBed.get(ItineraireService);
    expect(service).toBeTruthy();
  });
});
