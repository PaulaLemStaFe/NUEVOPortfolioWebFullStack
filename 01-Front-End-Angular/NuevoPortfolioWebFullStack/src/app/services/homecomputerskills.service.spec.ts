import { TestBed } from '@angular/core/testing';

import { HomecomputerskillsService } from './homecomputerskills.service';

describe('HomecomputerskillsService', () => {
  let service: HomecomputerskillsService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HomecomputerskillsService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
