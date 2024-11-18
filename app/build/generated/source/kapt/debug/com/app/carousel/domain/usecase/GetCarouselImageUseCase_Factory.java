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
public final class GetCarouselImageUseCase_Factory implements Factory<GetCarouselImageUseCase> {
  private final Provider<CarouselRepository> catalogRepositoryProvider;

  public GetCarouselImageUseCase_Factory(Provider<CarouselRepository> catalogRepositoryProvider) {
    this.catalogRepositoryProvider = catalogRepositoryProvider;
  }

  @Override
  public GetCarouselImageUseCase get() {
    return newInstance(catalogRepositoryProvider.get());
  }

  public static GetCarouselImageUseCase_Factory create(
      Provider<CarouselRepository> catalogRepositoryProvider) {
    return new GetCarouselImageUseCase_Factory(catalogRepositoryProvider);
  }

  public static GetCarouselImageUseCase newInstance(CarouselRepository catalogRepository) {
    return new GetCarouselImageUseCase(catalogRepository);
  }
}
