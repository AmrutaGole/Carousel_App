package com.app.carousel.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0010B\u000f\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\"\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0094@\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\t8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lcom/app/carousel/domain/usecase/GetCarouselListUseCase;", "Lcom/app/carousel/base/BaseUseCase;", "Lcom/app/carousel/domain/usecase/GetCarouselListUseCase$Params;", "", "Lcom/app/carousel/data/model/CarouselList;", "carouselRepository", "Lcom/app/carousel/domain/respository/CarouselRepository;", "(Lcom/app/carousel/domain/respository/CarouselRepository;)V", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "execute", "Lkotlinx/coroutines/flow/Flow;", "params", "(Lcom/app/carousel/domain/usecase/GetCarouselListUseCase$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Params", "app_debug"})
public final class GetCarouselListUseCase extends com.app.carousel.base.BaseUseCase<com.app.carousel.domain.usecase.GetCarouselListUseCase.Params, java.util.List<? extends com.app.carousel.data.model.CarouselList>> {
    @org.jetbrains.annotations.NotNull()
    private final com.app.carousel.domain.respository.CarouselRepository carouselRepository = null;
    
    @javax.inject.Inject()
    public GetCarouselListUseCase(@org.jetbrains.annotations.NotNull()
    com.app.carousel.domain.respository.CarouselRepository carouselRepository) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    protected java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    com.app.carousel.domain.usecase.GetCarouselListUseCase.Params params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.app.carousel.data.model.CarouselList>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected kotlinx.coroutines.CoroutineDispatcher getDispatcher() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0014"}, d2 = {"Lcom/app/carousel/domain/usecase/GetCarouselListUseCase$Params;", "", "carouselType", "Lcom/app/carousel/data/model/CarouselType;", "searchQuery", "", "(Lcom/app/carousel/data/model/CarouselType;Ljava/lang/String;)V", "getCarouselType", "()Lcom/app/carousel/data/model/CarouselType;", "getSearchQuery", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class Params {
        @org.jetbrains.annotations.NotNull()
        private final com.app.carousel.data.model.CarouselType carouselType = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String searchQuery = null;
        
        public Params(@org.jetbrains.annotations.NotNull()
        com.app.carousel.data.model.CarouselType carouselType, @org.jetbrains.annotations.NotNull()
        java.lang.String searchQuery) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.carousel.data.model.CarouselType getCarouselType() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getSearchQuery() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.carousel.data.model.CarouselType component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.carousel.domain.usecase.GetCarouselListUseCase.Params copy(@org.jetbrains.annotations.NotNull()
        com.app.carousel.data.model.CarouselType carouselType, @org.jetbrains.annotations.NotNull()
        java.lang.String searchQuery) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        @org.jetbrains.annotations.NotNull()
        public java.lang.String toString() {
            return null;
        }
    }
}