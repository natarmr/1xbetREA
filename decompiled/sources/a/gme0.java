package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class gme0 extends i3t0 {
    public static final /* synthetic */ int u = 0;
    public final f4u o;
    public final String p;
    public final duj q;
    public final i1w0 r;
    public final mne s;
    public bby t;

    public gme0(f4u f4uVar, ocl oclVar, ctf0 ctf0Var, m1e m1eVar, String str, duj dujVar, i1w0 i1w0Var, mne mneVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        o6e0 o6e0Var = new o6e0((byte) 20);
        gpb0 gpb0Var = new gpb0(oclVar, ctf0Var, (byte) 4);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, o6e0Var, gpb0Var, cvm0.p(vs10Var, rwjVar), null);
        this.o = f4uVar;
        this.p = str;
        this.q = dujVar;
        this.r = i1w0Var;
        this.s = mneVar;
        gmq gmqVarB = m1eVar.b();
        yje yjeVar = null;
        sac.T(new fnq(gmqVarB, new fme0(this, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new s9c0(this, yjeVar, (byte) 27));
        M();
    }

    public final void M() {
        Object value;
        bby bbyVar = this.t;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, new yle0(true, false, false, ((yle0) value).d)));
            this.t = sac.V(jiu0.a(this), new eme0(this, (byte) 0), null, this.s.b, new fme0(this, null, b), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        tke0 tke0Var = (tke0) obj;
        tke0Var.getClass();
        if (!tke0Var.equals(rke0.f30645a)) {
            if (tke0Var.equals(ske0.f32344a)) {
                M();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        i1w0 i1w0Var = this.r;
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
