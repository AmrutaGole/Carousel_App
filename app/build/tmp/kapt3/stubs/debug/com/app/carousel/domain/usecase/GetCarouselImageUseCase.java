package com.app.carousel.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\"\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0094@\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/app/carousel/domain/usecase/GetCarouselImageUseCase;", "Lcom/app/carousel/base/BaseUseCase;", "", "", "Lcom/app/carousel/data/model/Carousel;", "carouselRepository", "Lcom/app/carousel/domain/respository/CarouselRepository;", "(Lcom/app/carousel/domain/respository/CarouselRepository;)V", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "execute", "Lkotlinx/coroutines/flow/Flow;", "params", "(Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class GetCarouselImageUseCase extends com.app.carousel.base.BaseUseCase<kotlin.Unit, java.util.List<? extends com.app.carousel.data.model.Carousel>> {
    @org.jetbrains.annotations.NotNull()
    private final com.app.carousel.domain.respository.CarouselRepository carouselRepository = null;
    
    @javax.inject.Inject()
    public GetCarouselImageUseCase(@org.jetbrains.annotations.NotNull()
    com.app.carousel.domain.respository.CarouselRepository carouselRepository) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    protected java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    kotlin.Unit params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.app.carousel.data.model.Carousel>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected kotlinx.coroutines.CoroutineDispatcher getDispatcher() {
        return null;
    }
}