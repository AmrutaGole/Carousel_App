package com.app.carousel.base;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = CarouselApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface CarouselApp_GeneratedInjector {
  void injectCarouselApp(CarouselApp carouselApp);
}
