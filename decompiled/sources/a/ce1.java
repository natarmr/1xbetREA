package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class ce1 extends i3t0 {
    public final i1w0 o;
    public final peg0 p;
    public final b4j q;
    public final je r;

    public ce1(i1w0 i1w0Var, ctf0 ctf0Var, peg0 peg0Var, b4j b4jVar, je jeVar, List list, mne mneVar) {
        ctf0Var.getClass();
        c51 c51Var = new c51((byte) 3);
        k1 k1Var = new k1(list, ctf0Var, (byte) 29);
        rwj rwjVar = mneVar.f22085a;
        super(null, c51Var, k1Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = i1w0Var;
        this.p = peg0Var;
        this.q = b4jVar;
        this.r = jeVar;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        wec0 wec0Var = (wec0) obj;
        wec0Var.getClass();
        if (wec0Var.equals(tec0.f33814a)) {
            E();
            return;
        }
        boolean zEquals = wec0Var.equals(vec0.f37279a);
        xec0 xec0Var = xec0.f40739a;
        if (!zEquals) {
            if (wec0Var.equals(uec0.f35520a)) {
                G(xec0Var);
                return;
            } else {
                t9f.b();
                return;
            }
        }
        this.q.f1961a.c("msg_promocode_presents_call");
        this.r.f16351a.a(xun.f41520a, 3140L);
        this.o.d(new m51(this, (byte) 4));
        G(xec0Var);
    }
}
