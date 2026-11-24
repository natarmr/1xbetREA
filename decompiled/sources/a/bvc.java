package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class bvc implements AutoCloseable, vne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f3272a;

    public bvc(CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.f3272a = coroutineContext;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        zvw.F(this.f3272a, null);
    }

    @Override // a.vne
    public final CoroutineContext getCoroutineContext() {
        return this.f3272a;
    }
}
