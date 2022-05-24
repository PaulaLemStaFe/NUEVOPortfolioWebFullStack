import { TestBed } from '@angular/core/testing';

import { HomeprojectsService } from './homeprojects.service';

describe('HomeprojectsService', () => {
  let service: HomeprojectsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HomeprojectsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
