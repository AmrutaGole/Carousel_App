// Generated by Dagger (https://dagger.dev).
package com.app.carousel.di;

import com.app.carousel.domain.model.CarouselBaseUseCase;
import com.app.carousel.domain.usecase.GetCarouselAnalysisUseCase;
import com.app.carousel.domain.usecase.GetCarouselImageUseCase;
import com.app.carousel.domain.usecase.GetCarouselListUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class AppModule_ProvideHomePageBaseUseCaseFactory implements Factory<CarouselBaseUseCase> {
  private final Provider<GetCarouselImageUseCase> getCatalogListUseCaseProvider;

  private final Provider<GetCarouselListUseCase> getCatalogRangeUseCaseProvider;

  private final Provider<GetCarouselAnalysisUseCase> getCatalogAnalysisUseCaseProvider;

  public AppModule_ProvideHomePageBaseUseCaseFactory(
      Provider<GetCarouselImageUseCase> getCatalogListUseCaseProvider,
      Provider<GetCarouselListUseCase> getCatalogRangeUseCaseProvider,
      Provider<GetCarouselAnalysisUseCase> getCatalogAnalysisUseCaseProvider) {
    this.getCatalogListUseCaseProvider = getCatalogListUseCaseProvider;
    this.getCatalogRangeUseCaseProvider = getCatalogRangeUseCaseProvider;
    this.getCatalogAnalysisUseCaseProvider = getCatalogAnalysisUseCaseProvider;
  }

  @Override
  public CarouselBaseUseCase get() {
    return provideHomePageBaseUseCase(getCatalogListUseCaseProvider.get(), getCatalogRangeUseCaseProvider.get(), getCatalogAnalysisUseCaseProvider.get());
  }

  public static AppModule_ProvideHomePageBaseUseCaseFactory create(
      Provider<GetCarouselImageUseCase> getCatalogListUseCaseProvider,
      Provider<GetCarouselListUseCase> getCatalogRangeUseCaseProvider,
      Provider<GetCarouselAnalysisUseCase> getCatalogAnalysisUseCaseProvider) {
    return new AppModule_ProvideHomePageBaseUseCaseFactory(getCatalogListUseCaseProvider, getCatalogRangeUseCaseProvider, getCatalogAnalysisUseCaseProvider);
  }

  public static CarouselBaseUseCase provideHomePageBaseUseCase(
      GetCarouselImageUseCase getCatalogListUseCase, GetCarouselListUseCase getCatalogRangeUseCase,
      GetCarouselAnalysisUseCase getCatalogAnalysisUseCase) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideHomePageBaseUseCase(getCatalogListUseCase, getCatalogRangeUseCase, getCatalogAnalysisUseCase));
  }
}
