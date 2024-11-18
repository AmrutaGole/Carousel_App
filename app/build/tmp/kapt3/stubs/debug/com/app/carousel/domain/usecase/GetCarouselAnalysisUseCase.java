package com.app.carousel.domain.usecase;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0094@\u00a2\u0006\u0002\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00068TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000e"}, d2 = {"Lcom/app/carousel/domain/usecase/GetCarouselAnalysisUseCase;", "Lcom/app/carousel/base/BaseUseCase;", "Lcom/app/carousel/domain/usecase/GetCarouselAnalysisUseCase$Params;", "Lcom/app/carousel/domain/model/CarouselAnalysis;", "()V", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "execute", "Lkotlinx/coroutines/flow/Flow;", "params", "(Lcom/app/carousel/domain/usecase/GetCarouselAnalysisUseCase$Params;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Params", "app_debug"})
public final class GetCarouselAnalysisUseCase extends com.app.carousel.base.BaseUseCase<com.app.carousel.domain.usecase.GetCarouselAnalysisUseCase.Params, com.app.carousel.domain.model.CarouselAnalysis> {
    
    public GetCarouselAnalysisUseCase() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    protected java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    com.app.carousel.domain.usecase.GetCarouselAnalysisUseCase.Params params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.app.carousel.domain.model.CarouselAnalysis>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected kotlinx.coroutines.CoroutineDispatcher getDispatcher() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\bH\u00c6\u0003J/\u0010\u0013\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lcom/app/carousel/domain/usecase/GetCarouselAnalysisUseCase$Params;", "", "carouselLists", "", "Lcom/app/carousel/data/model/CarouselList;", "analysisOutputCount", "", "carouselType", "Lcom/app/carousel/data/model/CarouselType;", "(Ljava/util/List;ILcom/app/carousel/data/model/CarouselType;)V", "getAnalysisOutputCount", "()I", "getCarouselLists", "()Ljava/util/List;", "getCarouselType", "()Lcom/app/carousel/data/model/CarouselType;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
    public static final class Params {
        @org.jetbrains.annotations.Nullable()
        private final java.util.List<com.app.carousel.data.model.CarouselList> carouselLists = null;
        private final int analysisOutputCount = 0;
        @org.jetbrains.annotations.NotNull()
        private final com.app.carousel.data.model.CarouselType carouselType = null;
        
        public Params(@org.jetbrains.annotations.Nullable()
        java.util.List<com.app.carousel.data.model.CarouselList> carouselLists, int analysisOutputCount, @org.jetbrains.annotations.NotNull()
        com.app.carousel.data.model.CarouselType carouselType) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.app.carousel.data.model.CarouselList> getCarouselLists() {
            return null;
        }
        
        public final int getAnalysisOutputCount() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.carousel.data.model.CarouselType getCarouselType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.List<com.app.carousel.data.model.CarouselList> component1() {
            return null;
        }
        
        public final int component2() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.carousel.data.model.CarouselType component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.app.carousel.domain.usecase.GetCarouselAnalysisUseCase.Params copy(@org.jetbrains.annotations.Nullable()
        java.util.List<com.app.carousel.data.model.CarouselList> carouselLists, int analysisOutputCount, @org.jetbrains.annotations.NotNull()
        com.app.carousel.data.model.CarouselType carouselType) {
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