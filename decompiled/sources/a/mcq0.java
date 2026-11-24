package a;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class mcq0 extends eby {
    public static final /* synthetic */ long g = defpackage.a.f0a.objectFieldOffset(mcq0.class.getDeclaredField("_state$volatile"));
    private volatile /* synthetic */ int _state$volatile;
    public final Thread e = Thread.currentThread();
    public nwk f;

    public static void o(int i) {
        throw new IllegalStateException(("Illegal state " + i).toString());
    }

    @Override // a.eby
    public final boolean l() {
        return true;
    }

    @Override // a.eby
    public final void m(Throwable th) {
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = g;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1 || intVolatile == 2 || intVolatile == 3) {
                    return;
                }
                o(intVolatile);
                throw null;
            }
            mcq0 mcq0Var = this;
            if (unsafe.compareAndSwapInt(mcq0Var, g, intVolatile, 2)) {
                mcq0Var.e.interrupt();
                unsafe.putIntVolatile(mcq0Var, j, 3);
                return;
            }
            this = mcq0Var;
        }
    }

    public final void n() {
        mcq0 mcq0Var;
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = g;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile == 0) {
                mcq0Var = this;
                if (unsafe.compareAndSwapInt(mcq0Var, j, intVolatile, 1)) {
                    nwk nwkVar = mcq0Var.f;
                    if (nwkVar != null) {
                        nwkVar.a();
                        return;
                    }
                    return;
                }
            } else {
                if (intVolatile != 2) {
                    if (intVolatile == 3) {
                        Thread.interrupted();
                        return;
                    } else {
                        o(intVolatile);
                        throw null;
                    }
                }
                mcq0Var = this;
            }
            this = mcq0Var;
        }
    }
}
