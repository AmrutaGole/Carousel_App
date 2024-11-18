package com.app.carousel.presentation.components;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\b\u0007H\u0007\u001a3\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u00a2\u0006\u0002\b\u0007H\u0007\u001a\u001a\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a\"\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u001a\b\u0010\u0011\u001a\u00020\u0001H\u0003\u001a\b\u0010\u0012\u001a\u00020\u0001H\u0003\u001a\b\u0010\u0013\u001a\u00020\u0001H\u0003\u00a8\u0006\u0014"}, d2 = {"Carousel", "", "pagerState", "Landroidx/compose/foundation/pager/PagerState;", "pagerContent", "Lkotlin/Function1;", "", "Landroidx/compose/runtime/Composable;", "CarouselWithIndicator", "modifier", "Landroidx/compose/ui/Modifier;", "IndicatorDots", "isSelected", "", "PageIndicator", "pageCount", "currentPage", "PreviewPageIndicator", "SelectedIndicatorPreview", "UnSelectedIndicatorPreview", "app_debug"})
public final class CarouselWithIndicatorKt {
    
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    @androidx.compose.runtime.Composable()
    public static final void CarouselWithIndicator(@org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier, @org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.pager.PagerState pagerState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> pagerContent) {
    }
    
    @kotlin.OptIn(markerClass = {androidx.compose.foundation.ExperimentalFoundationApi.class})
    @androidx.compose.runtime.Composable()
    public static final void Carousel(@org.jetbrains.annotations.NotNull()
    androidx.compose.foundation.pager.PagerState pagerState, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> pagerContent) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void PageIndicator(int pageCount, int currentPage, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.runtime.Composable()
    public static final void IndicatorDots(boolean isSelected, @org.jetbrains.annotations.NotNull()
    androidx.compose.ui.Modifier modifier) {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    private static final void SelectedIndicatorPreview() {
    }
    
    @androidx.compose.ui.tooling.preview.Preview()
    @androidx.compose.runtime.Composable()
    private static final void UnSelectedIndicatorPreview() {
    }
    
    @androidx.compose.ui.tooling.preview.Preview(showSystemUi = true)
    @androidx.compose.runtime.Composable()
    private static final void PreviewPageIndicator() {
    }
}