package com.app.carousel.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0096@\u00a2\u0006\u0002\u0010\tJ\"\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u00062\u0006\u0010\f\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/app/carousel/data/repository/CarouselRepositoryImpl;", "Lcom/app/carousel/domain/respository/CarouselRepository;", "dataStore", "Lcom/app/carousel/data/store/CarouselStore;", "(Lcom/app/carousel/data/store/CarouselStore;)V", "getCarouselImage", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/app/carousel/data/model/Carousel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCarouselList", "Lcom/app/carousel/data/model/CarouselList;", "carouselType", "Lcom/app/carousel/data/model/CarouselType;", "(Lcom/app/carousel/data/model/CarouselType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class CarouselRepositoryImpl implements com.app.carousel.domain.respository.CarouselRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.app.carousel.data.store.CarouselStore dataStore = null;
    
    @javax.inject.Inject()
    public CarouselRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.app.carousel.data.store.CarouselStore dataStore) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCarouselImage(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.app.carousel.data.model.Carousel>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getCarouselList(@org.jetbrains.annotations.NotNull()
    com.app.carousel.data.model.CarouselType carouselType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.app.carousel.data.model.CarouselList>>> $completion) {
        return null;
    }
}