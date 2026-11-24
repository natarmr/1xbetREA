package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class fiq0 extends i3t0 {
    public final nr o;
    public final zsr p;
    public final duj q;
    public final rqj0 r;
    public final woc s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fiq0(String str, nr nrVar, zsr zsrVar, duj dujVar, rqj0 rqj0Var, mne mneVar, woc wocVar) {
        super(null, new l00(str, (byte) 9), eiq0.f7873a, cvm0.p(mneVar.c, mneVar.f22085a), null);
        zsrVar.getClass();
        this.o = nrVar;
        this.p = zsrVar;
        this.q = dujVar;
        this.r = rqj0Var;
        this.s = wocVar;
        sac.V(jiu0.a(this), new nop0((Object) this, (byte) 19), null, mneVar.c, new z2n0(this, null, (byte) 18), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        aiq0 aiq0Var = (aiq0) obj;
        aiq0Var.getClass();
        if (Intrinsics.d(aiq0Var, xhq0.f40908a)) {
            E();
        } else if (Intrinsics.d(aiq0Var, yhq0.f42651a) || Intrinsics.d(aiq0Var, zhq0.f44407a)) {
            G(giq0.f11362a);
        } else {
            t9f.b();
        }
    }
}
