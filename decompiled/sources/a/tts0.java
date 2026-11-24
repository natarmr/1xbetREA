package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class tts0 extends i3t0 {
    public static final /* synthetic */ int w = 0;
    public final i1w0 o;
    public final mne p;
    public final g2v q;
    public final m0u r;
    public final ahu s;
    public final gle0 t;
    public bby u;
    public final c4m0 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public tts0(i1w0 i1w0Var, mne mneVar, g2v g2vVar, m0u m0uVar, ahu ahuVar, bzt bztVar, gle0 gle0Var, m1e m1eVar, String str, boolean z, ctf0 ctf0Var) {
        m1eVar.getClass();
        ctf0Var.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        yje yjeVar = null;
        super(new lf2(z, bztVar, str, (byte) 12), g090VarP, new h0j0(ctf0Var, (byte) 29), (yzn0) null);
        this.o = i1w0Var;
        this.p = mneVar;
        this.q = g2vVar;
        this.r = m0uVar;
        this.s = ahuVar;
        this.t = gle0Var;
        c4m0 c4m0Var = this.v;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.v = sac.T(new fnq(m1eVar.b(), new k6s0(this, yjeVar, (byte) 6), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), sts0.h);
        }
    }

    public final void M() {
        Object value;
        bby bbyVar = this.u;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, fts0.a((fts0) value, hts0.f13649a, 0L, false, null, 245)));
            this.u = sac.V(jiu0.a(this), new rts0(this, (byte) 0), null, this.p.b, new jc1((Object) this, (yje) null, (byte) 11), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        jss0 jss0Var = (jss0) obj;
        jss0Var.getClass();
        if (!jss0Var.equals(fss0.f10080a)) {
            if (jss0Var.equals(gss0.f11846a)) {
                M();
                return;
            }
            if (jss0Var.equals(hss0.f13599a)) {
                bww.R(jiu0.a(this), null, kotlin.collections.a.c(this.u), this.p.b, null, null, new wup0(this, null, (byte) 6), 56);
                return;
            }
            if (!(jss0Var instanceof iss0)) {
                t9f.b();
                return;
            }
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, fts0.a((fts0) value, null, ((iss0) jss0Var).f15321a, false, null, 251)));
            return;
        }
        i1w0 i1w0Var = this.o;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }
}
