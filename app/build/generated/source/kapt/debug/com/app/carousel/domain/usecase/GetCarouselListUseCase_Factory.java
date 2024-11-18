// Generated by Dagger (https://dagger.dev).
package com.app.carousel.domain.usecase;

import com.app.carousel.domain.respository.CarouselRepository;
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
public final class GetCarouselListUseCase_Factory implements Factory<GetCarouselListUseCase> {
  private final Provider<CarouselRepository> catalogRepositoryProvider;

  public GetCarouselListUseCase_Factory(Provider<CarouselRepository> catalogRepositoryProvider) {
    this.catalogRepositoryProvider = catalogRepositoryProvider;
  }

  @Override
  public GetCarouselListUseCase get() {
    return newInstance(catalogRepositoryProvider.get());
  }

  public static GetCarouselListUseCase_Factory create(
      Provider<CarouselRepository> catalogRepositoryProvider) {
    return new GetCarouselListUseCase_Factory(catalogRepositoryProvider);
  }

  public static GetCarouselListUseCase newInstance(CarouselRepository catalogRepository) {
    return new GetCarouselListUseCase(catalogRepository);
  }
}
