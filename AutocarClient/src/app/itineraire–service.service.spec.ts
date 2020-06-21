import { TestBed } from '@angular/core/testing';

import { Itineraire–serviceService } from './itineraire–service.service';

describe('Itineraire–serviceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: Itineraire–serviceService = TestBed.get(Itineraire–serviceService);
    expect(service).toBeTruthy();
  });
});
