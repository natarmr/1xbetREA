package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class ch40 extends vs10 implements vzj {
    @Override // a.vzj
    public final void a(long j, n5a n5aVar) {
        y();
        throw null;
    }

    @Override // a.vzj
    public final nwk c(long j, Runnable runnable, CoroutineContext coroutineContext) {
        y();
        throw null;
    }

    @Override // a.lne
    public final void q(CoroutineContext coroutineContext, Runnable runnable) {
        y();
        throw null;
    }

    @Override // a.vs10, a.lne
    public final String toString() {
        return "Dispatchers.Main[missing]";
    }

    @Override // a.lne
    public final boolean v(CoroutineContext coroutineContext) {
        y();
        throw null;
    }

    @Override // a.vs10, a.lne
    public final lne w(int i) {
        y();
        throw null;
    }

    public final void y() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
