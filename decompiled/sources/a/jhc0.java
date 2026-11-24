package a;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class jhc0 extends w46 {
    public final p4u b;
    public final ctf0 c;
    public final mne d;
    public final fht0 e;
    public final nou f;
    public final rqt g;
    public final x4u h;
    public final epi0 i;
    public final peg0 j;
    public final ort k;
    public final pru l;
    public final bby m;
    public final p7m0 n;
    public final ol60 o;

    public jhc0(p4u p4uVar, ctf0 ctf0Var, mne mneVar, fht0 fht0Var, nou nouVar, rqt rqtVar, x4u x4uVar, epi0 epi0Var, peg0 peg0Var, ort ortVar, m1e m1eVar, pru pruVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        this.b = p4uVar;
        this.c = ctf0Var;
        this.d = mneVar;
        this.e = fht0Var;
        this.f = nouVar;
        this.g = rqtVar;
        this.h = x4uVar;
        this.i = epi0Var;
        this.j = peg0Var;
        this.k = ortVar;
        this.l = pruVar;
        p7m0 p7m0VarA = q7m0.a(zgc0.f44339a);
        this.n = p7m0VarA;
        this.o = new ol60(3);
        yje yjeVar = null;
        if (!(p7m0VarA.getValue() instanceof ahc0)) {
            this.m = sac.f0(jiu0.a(this), 200L, TimeUnit.MILLISECONDS, mneVar.b, hhc0.f13056a, new d7a0(this, yjeVar, (byte) 5), 32);
        }
        sac.T(new fnq(m1eVar.b(), new c670(this, yjeVar, (byte) 28), (byte) 4), jiu0.a(this), ehc0.h);
    }

    @Override // a.diu0
    public final void v() {
        v3c.N(this.m);
        ((lgc0) ((onv) this.j.b).f25567a).b.clear();
    }
}
