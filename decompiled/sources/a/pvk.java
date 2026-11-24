package a;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes2.dex */
public final class pvk extends a3h0 {
    public static final /* synthetic */ long f = defpackage.a.f0a.objectFieldOffset(pvk.class.getDeclaredField("_decision$volatile"));
    private volatile /* synthetic */ int _decision$volatile;

    @Override // a.a3h0, a.pby
    public final void o(Object obj) throws mvk {
        p(obj);
    }

    @Override // a.a3h0, a.pby
    public final void p(Object obj) throws mvk {
        while (true) {
            Unsafe unsafe = defpackage.a.f0a;
            long j = f;
            int intVolatile = unsafe.getIntVolatile(this, j);
            if (intVolatile != 0) {
                if (intVolatile == 1) {
                    ovk.a(pnx.b(this.e), qzb.S0(obj));
                    return;
                } else {
                    jf4.n("Already resumed");
                    return;
                }
            }
            pvk pvkVar = this;
            if (unsafe.compareAndSwapInt(pvkVar, j, 0, 2)) {
                return;
            } else {
                this = pvkVar;
            }
        }
    }
}
