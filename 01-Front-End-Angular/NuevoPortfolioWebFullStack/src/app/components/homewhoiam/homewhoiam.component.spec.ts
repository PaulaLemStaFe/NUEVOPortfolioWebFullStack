import { ComponentFixture, TestBed } from '@angular/core/testing';

import { HomewhoiamComponent } from './homewhoiam.component';

describe('HomewhoiamComponent', () => {
  let component: HomewhoiamComponent;
  let fixture: ComponentFixture<HomewhoiamComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HomewhoiamComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HomewhoiamComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
