import { ComponentFixture, TestBed } from '@angular/core/testing';

import { EditionwhoiamComponent } from './editionwhoiam.component';

describe('EditionwhoiamComponent', () => {
  let component: EditionwhoiamComponent;
  let fixture: ComponentFixture<EditionwhoiamComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ EditionwhoiamComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(EditionwhoiamComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
