package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class cg5 extends vw5 {
    public final hcp0 d;
    public final iqt e;
    public final mne f;
    public final kh3 g;
    public final hst0 h;
    public final List i;
    public final p7m0 j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg5(o8f o8fVar, xqt0 xqt0Var, hcp0 hcp0Var, iqt iqtVar, mne mneVar, duj dujVar) {
        super(o8fVar, mneVar, dujVar);
        o8fVar.getClass();
        xqt0Var.getClass();
        this.d = hcp0Var;
        this.e = iqtVar;
        this.f = mneVar;
        this.g = kh3.USER;
        this.h = hst0.BALANCE;
        this.i = kotlin.collections.a.c(xqt0Var);
        this.j = q7m0.a(i8d.f14333a);
    }

    @Override // a.vw5
    public final void a(sje sjeVar) {
        sjeVar.getClass();
        this.j.o(null, i8d.b);
        sac.V(sjeVar, new ys3(this, sjeVar, (byte) 28), null, this.f.b, new qv3(this, null, (byte) 7), 10);
    }

    @Override // a.vw5
    public final kh3 b() {
        return this.g;
    }

    @Override // a.vw5
    public final p7m0 c() {
        return this.j;
    }

    @Override // a.vw5
    public final List d() {
        return this.i;
    }

    @Override // a.vw5
    public final fnf0 e() {
        return this.h;
    }
}
