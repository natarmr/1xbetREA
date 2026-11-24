package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class byn extends i3t0 {
    public final cyn o;
    public final nr p;
    public final zsr q;
    public final duj r;
    public final rqj0 s;
    public final woc t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public byn(cyn cynVar, nr nrVar, zsr zsrVar, duj dujVar, rqj0 rqj0Var, mne mneVar, woc wocVar, ctf0 ctf0Var) {
        super(null, new ntl(cynVar, (byte) 14), new bcn(ctf0Var, (byte) 3), cvm0.p(mneVar.c, mneVar.f22085a), null);
        zsrVar.getClass();
        ctf0Var.getClass();
        this.o = cynVar;
        this.p = nrVar;
        this.q = zsrVar;
        this.r = dujVar;
        this.s = rqj0Var;
        this.t = wocVar;
        sac.V(jiu0.a(this), new yhn((Object) this, (byte) 7), null, mneVar.c, new hij(this, null, (byte) 9), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        xxn xxnVar = (xxn) obj;
        xxnVar.getClass();
        if (Intrinsics.d(xxnVar, txn.f34709a) || Intrinsics.d(xxnVar, uxn.f36449a) || Intrinsics.d(xxnVar, vxn.f38208a)) {
            G(fyn.f10366a);
            return;
        }
        if (Intrinsics.d(xxnVar, wxn.f39939a)) {
            G(gyn.f12139a);
        } else if (Intrinsics.d(xxnVar, sxn.f32984a)) {
            E();
        } else {
            t9f.b();
        }
    }
}
