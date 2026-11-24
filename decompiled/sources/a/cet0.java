package a;

import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes2.dex */
public final class cet0 extends lne {
    public static final cet0 c = new cet0();

    @Override // a.lne
    public final void q(CoroutineContext coroutineContext, Runnable runnable) {
        rwj.d.c.c(runnable, true, false);
    }

    @Override // a.lne
    public final void r(CoroutineContext coroutineContext, Runnable runnable) {
        rwj.d.c.c(runnable, true, true);
    }

    @Override // a.lne
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // a.lne
    public final lne w(int i) {
        g7x.x(i);
        return i >= xuo0.d ? this : super.w(i);
    }
}
