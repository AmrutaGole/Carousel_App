package com.app.carousel.presentation;

@dagger.hilt.android.AndroidEntryPoint()
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0002H\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0014H\u0016J\b\u0010\u0016\u001a\u00020\u0014H\u0014J\b\u0010\u0017\u001a\u00020\u0014H\u0014J\b\u0010\u0018\u001a\u00020\u0014H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/app/carousel/presentation/MainActivity;", "Lcom/app/carousel/base/BaseActivity;", "Lcom/app/carousel/databinding/ActivityMainBinding;", "()V", "carouselImageAdapter", "Lcom/app/carousel/presentation/adapter/CarouselImageAdapter;", "carouselListAdapter", "Lcom/app/carousel/presentation/adapter/CarouselListAdapter;", "onCarouselPageChanged", "Landroidx/viewpager2/widget/ViewPager2$OnPageChangeCallback;", "searchTextListener", "Landroidx/appcompat/widget/SearchView$OnQueryTextListener;", "viewModel", "Lcom/app/carousel/presentation/CarouselViewModel;", "getViewModel", "()Lcom/app/carousel/presentation/CarouselViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "getViewBinding", "initialize", "", "observeViewModel", "onPause", "onResume", "setupOnClickListeners", "app_debug"})
public final class MainActivity extends com.app.carousel.base.BaseActivity<com.app.carousel.databinding.ActivityMainBinding> {
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.app.carousel.presentation.adapter.CarouselImageAdapter carouselImageAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final com.app.carousel.presentation.adapter.CarouselListAdapter carouselListAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.appcompat.widget.SearchView.OnQueryTextListener searchTextListener = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback onCarouselPageChanged = null;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    protected com.app.carousel.databinding.ActivityMainBinding getViewBinding() {
        return null;
    }
    
    @java.lang.Override()
    public void observeViewModel() {
    }
    
    @java.lang.Override()
    protected void initialize() {
    }
    
    private final com.app.carousel.presentation.CarouselViewModel getViewModel() {
        return null;
    }
    
    private final void setupOnClickListeners() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
}