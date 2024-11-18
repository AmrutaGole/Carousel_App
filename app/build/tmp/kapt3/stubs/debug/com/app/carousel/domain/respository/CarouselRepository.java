package com.app.carousel.domain.respository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a6@\u00a2\u0006\u0002\u0010\u0006J\"\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00040\u00032\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/app/carousel/domain/respository/CarouselRepository;", "", "getCarouselImage", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/app/carousel/data/model/Carousel;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCarouselList", "Lcom/app/carousel/data/model/CarouselList;", "carouselType", "Lcom/app/carousel/data/model/CarouselType;", "(Lcom/app/carousel/data/model/CarouselType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface CarouselRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCarouselImage(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.app.carousel.data.model.Carousel>>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCarouselList(@org.jetbrains.annotations.NotNull()
    com.app.carousel.data.model.CarouselType carouselType, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.app.carousel.data.model.CarouselList>>> $completion);
}