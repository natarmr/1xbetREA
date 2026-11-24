package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class l7t0 extends lne {
    public static final l7t0 c = new l7t0();

    @Override // a.lne
    public final void q(CoroutineContext coroutineContext, Runnable runnable) {
        x2w0 x2w0Var = (x2w0) coroutineContext.get(x2w0.c);
        if (x2w0Var != null) {
            x2w0Var.b = true;
        } else {
            v4i0.p("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
    }

    @Override // a.lne
    public final String toString() {
        return "Dispatchers.Unconfined";
    }

    @Override // a.lne
    public final lne w(int i) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }
}
