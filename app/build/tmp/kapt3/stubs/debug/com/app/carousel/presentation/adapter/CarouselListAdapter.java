package com.app.carousel.presentation.adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003R\u00020\u00000\u0001:\u0002\u000e\u000fB\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0005\u001a\u00020\u00062\n\u0010\u0007\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0016J\u001c\u0010\n\u001a\u00060\u0003R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0016\u00a8\u0006\u0010"}, d2 = {"Lcom/app/carousel/presentation/adapter/CarouselListAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/app/carousel/data/model/CarouselList;", "Lcom/app/carousel/presentation/adapter/CarouselListAdapter$ViewHolder;", "()V", "onBindViewHolder", "", "holder", "position", "", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "CarouselListDiff", "ViewHolder", "app_debug"})
public final class CarouselListAdapter extends androidx.recyclerview.widget.ListAdapter<com.app.carousel.data.model.CarouselList, com.app.carousel.presentation.adapter.CarouselListAdapter.ViewHolder> {
    
    public CarouselListAdapter() {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.app.carousel.presentation.adapter.CarouselListAdapter.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.app.carousel.presentation.adapter.CarouselListAdapter.ViewHolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\t"}, d2 = {"Lcom/app/carousel/presentation/adapter/CarouselListAdapter$CarouselListDiff;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/app/carousel/data/model/CarouselList;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_debug"})
    public static final class CarouselListDiff extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.app.carousel.data.model.CarouselList> {
        
        public CarouselListDiff() {
            super();
        }
        
        @java.lang.Override()
        public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull()
        com.app.carousel.data.model.CarouselList oldItem, @org.jetbrains.annotations.NotNull()
        com.app.carousel.data.model.CarouselList newItem) {
            return false;
        }
        
        @java.lang.Override()
        public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull()
        com.app.carousel.data.model.CarouselList oldItem, @org.jetbrains.annotations.NotNull()
        com.app.carousel.data.model.CarouselList newItem) {
            return false;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/app/carousel/presentation/adapter/CarouselListAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/app/carousel/databinding/CarouselListItemBinding;", "(Lcom/app/carousel/presentation/adapter/CarouselListAdapter;Lcom/app/carousel/databinding/CarouselListItemBinding;)V", "bindData", "", "data", "Lcom/app/carousel/data/model/CarouselList;", "app_debug"})
    public final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.app.carousel.databinding.CarouselListItemBinding binding = null;
        
        public ViewHolder(@org.jetbrains.annotations.NotNull()
        com.app.carousel.databinding.CarouselListItemBinding binding) {
            super(null);
        }
        
        public final void bindData(@org.jetbrains.annotations.NotNull()
        com.app.carousel.data.model.CarouselList data) {
        }
    }
}