package a;

import android.gov.nist.core.Separators;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class mzj extends lne {
    public static final /* synthetic */ long e = defpackage.a.f0a.objectFieldOffset(mzj.class.getDeclaredField("d"));
    public final lne c;
    public volatile /* synthetic */ int d = 1;

    public mzj(lne lneVar) {
        this.c = lneVar;
    }

    @Override // a.lne
    public final void q(CoroutineContext coroutineContext, Runnable runnable) {
        x().q(coroutineContext, runnable);
    }

    @Override // a.lne
    public final void r(CoroutineContext coroutineContext, Runnable runnable) {
        x().r(coroutineContext, runnable);
    }

    @Override // a.lne
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.c + Separators.RPAREN;
    }

    @Override // a.lne
    public final boolean v(CoroutineContext coroutineContext) {
        return x().v(coroutineContext);
    }

    @Override // a.lne
    public final lne w(int i) {
        return x().w(i);
    }

    public final lne x() {
        return defpackage.a.f0a.getIntVolatile(this, e) == 1 ? tvk.b : this.c;
    }
}
