package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class rox extends eby {
    public static final /* synthetic */ long f = defpackage.a.f0a.objectFieldOffset(rox.class.getDeclaredField("_invoked$volatile"));
    private volatile /* synthetic */ int _invoked$volatile;
    public final Function1 e;

    public rox(Function1 function1) {
        this.e = function1;
    }

    @Override // a.eby
    public final boolean l() {
        return true;
    }

    @Override // a.eby
    public final void m(Throwable th) {
        if (defpackage.a.f0a.compareAndSwapInt(this, f, 0, 1)) {
            this.e.invoke(th);
        }
    }
}
