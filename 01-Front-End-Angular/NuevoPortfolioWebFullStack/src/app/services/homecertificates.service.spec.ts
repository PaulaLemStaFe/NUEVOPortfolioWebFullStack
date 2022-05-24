import { TestBed } from '@angular/core/testing';

import { HomecertificatesService } from './homecertificates.service';

describe('HomecertificatesService', () => {
  let service: HomecertificatesService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HomecertificatesService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
