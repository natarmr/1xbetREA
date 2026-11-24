package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes6.dex */
public final class sje implements vne {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoroutineContext f32300a;

    public sje(CoroutineContext coroutineContext) {
        this.f32300a = coroutineContext;
    }

    @Override // a.vne
    public final CoroutineContext getCoroutineContext() {
        return this.f32300a;
    }

    public final String toString() {
        return "CoroutineScope(coroutineContext=" + this.f32300a + ')';
    }
}
