package com.app.carousel.base;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0000*\u0006\b\u0001\u0010\u0002 \u00012\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u00a4@\u00a2\u0006\u0002\u0010\fJ\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0086\u0002\u00a2\u0006\u0002\u0010\u000eR\u0012\u0010\u0005\u001a\u00020\u0006X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u000f"}, d2 = {"Lcom/app/carousel/base/BaseUseCase;", "Params", "Result", "", "()V", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "execute", "Lkotlinx/coroutines/flow/Flow;", "params", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "invoke", "(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", "app_debug"})
public abstract class BaseUseCase<Params extends java.lang.Object, Result extends java.lang.Object> {
    
    public BaseUseCase() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    protected abstract java.lang.Object execute(Params params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends Result>> $completion);
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<Result> invoke(Params params) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract kotlinx.coroutines.CoroutineDispatcher getDispatcher();
}