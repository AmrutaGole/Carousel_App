package com.app.carousel.di;

@dagger.Module()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0006H\u0007\u00a8\u0006\u000e"}, d2 = {"Lcom/app/carousel/di/AppModule;", "", "()V", "provideCarouselStore", "Lcom/app/carousel/data/store/CarouselStore;", "provideCatalogAnalysisUseCase", "Lcom/app/carousel/domain/usecase/GetCarouselAnalysisUseCase;", "provideHomePageBaseUseCase", "Lcom/app/carousel/domain/model/CarouselBaseUseCase;", "getCatalogListUseCase", "Lcom/app/carousel/domain/usecase/GetCarouselImageUseCase;", "getCatalogRangeUseCase", "Lcom/app/carousel/domain/usecase/GetCarouselListUseCase;", "getCatalogAnalysisUseCase", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class AppModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.app.carousel.di.AppModule INSTANCE = null;
    
    private AppModule() {
        super();
    }
    
    @javax.inject.Singleton()
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.app.carousel.data.store.CarouselStore provideCarouselStore() {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.app.carousel.domain.model.CarouselBaseUseCase provideHomePageBaseUseCase(@org.jetbrains.annotations.NotNull()
    com.app.carousel.domain.usecase.GetCarouselImageUseCase getCatalogListUseCase, @org.jetbrains.annotations.NotNull()
    com.app.carousel.domain.usecase.GetCarouselListUseCase getCatalogRangeUseCase, @org.jetbrains.annotations.NotNull()
    com.app.carousel.domain.usecase.GetCarouselAnalysisUseCase getCatalogAnalysisUseCase) {
        return null;
    }
    
    @dagger.Provides()
    @org.jetbrains.annotations.NotNull()
    public final com.app.carousel.domain.usecase.GetCarouselAnalysisUseCase provideCatalogAnalysisUseCase() {
        return null;
    }
}