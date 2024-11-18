// Generated by Dagger (https://dagger.dev).
package com.app.carousel.presentation.home;

import com.app.carousel.domain.model.HomePageBaseUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class CarouselViewModel_Factory implements Factory<CarouselViewModel> {
  private final Provider<HomePageBaseUseCase> homePageBaseUseCaseProvider;

  public CarouselViewModel_Factory(Provider<HomePageBaseUseCase> homePageBaseUseCaseProvider) {
    this.homePageBaseUseCaseProvider = homePageBaseUseCaseProvider;
  }

  @Override
  public CarouselViewModel get() {
    return newInstance(homePageBaseUseCaseProvider.get());
  }

  public static CarouselViewModel_Factory create(
      Provider<HomePageBaseUseCase> homePageBaseUseCaseProvider) {
    return new CarouselViewModel_Factory(homePageBaseUseCaseProvider);
  }

  public static CarouselViewModel newInstance(HomePageBaseUseCase homePageBaseUseCase) {
    return new CarouselViewModel(homePageBaseUseCase);
  }
}
