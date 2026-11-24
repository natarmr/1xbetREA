package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class qke0 extends i3t0 {
    public static final /* synthetic */ int u = 0;
    public final b8u o;
    public final mne p;
    public final i1w0 q;
    public final duj r;
    public final String s;
    public bby t;

    public qke0(b8u b8uVar, m1e m1eVar, mne mneVar, i1w0 i1w0Var, duj dujVar, String str, ocl oclVar, ctf0 ctf0Var) {
        m1eVar.getClass();
        ctf0Var.getClass();
        o6e0 o6e0Var = new o6e0((byte) 16);
        gpb0 gpb0Var = new gpb0(oclVar, ctf0Var, (byte) 3);
        rwj rwjVar = mneVar.f22085a;
        super(null, o6e0Var, gpb0Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = b8uVar;
        this.p = mneVar;
        this.q = i1w0Var;
        this.r = dujVar;
        this.s = str;
        sac.T(new fnq(m1eVar.b(), new pke0(this, null, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), foe.h);
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
            } while (!p7m0Var.m(value, new ike0(true, false, ((ike0) value).c)));
            this.t = sac.V(jiu0.a(this), new v6d0(this, (byte) 28), null, this.p.b, new pke0(this, null, b), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void x(wje0 wje0Var) {
        wje0Var.getClass();
        super.x(wje0Var);
        if (!wje0Var.equals(uje0.f35775a)) {
            if (wje0Var.equals(vje0.f37524a)) {
                M();
                return;
            } else {
                t9f.b();
                return;
            }
        }
        i1w0 i1w0Var = this.q;
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
