package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class ykp0 extends i3t0 {
    public static final /* synthetic */ int y = 0;
    public final vzg0 o;
    public final svu p;
    public final mne q;
    public final i1w0 r;
    public final duj s;
    public final String t;
    public final String u;
    public final rl70 v;
    public final c4m0 w;
    public bby x;

    public ykp0(vzg0 vzg0Var, svu svuVar, m1e m1eVar, mne mneVar, i1w0 i1w0Var, duj dujVar, String str, String str2, ocl oclVar, ctf0 ctf0Var, rl70 rl70Var) {
        m1eVar.getClass();
        ctf0Var.getClass();
        wg2 wg2Var = new wg2(vzg0Var, (byte) 11);
        gpb0 gpb0Var = new gpb0(oclVar, ctf0Var, (byte) 13);
        rwj rwjVar = mneVar.f22085a;
        super(null, wg2Var, gpb0Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = vzg0Var;
        this.p = svuVar;
        this.q = mneVar;
        this.r = i1w0Var;
        this.s = dujVar;
        this.t = str;
        this.u = str2;
        this.v = rl70Var;
        c4m0 c4m0Var = this.w;
        byte b = 1;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            this.w = sac.T(new fnq(m1eVar.b(), new xkp0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new ssl0((Object) this, yjeVar, (byte) 16));
        }
        M();
    }

    public final void M() {
        Object value;
        bby bbyVar = this.x;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, qkp0.a((qkp0) value, 0L, true, false, null, 0L, 25)));
            this.x = sac.V(jiu0.a(this), new ttn0(this, (byte) 27), null, this.q.b, new xkp0(this, null, (byte) 0), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        gkp0 gkp0Var = (gkp0) obj;
        gkp0Var.getClass();
        super.x(gkp0Var);
        boolean z = gkp0Var instanceof ckp0;
        i1w0 i1w0Var = this.r;
        if (!z) {
            if (gkp0Var instanceof fkp0) {
                M();
                return;
            }
            if (!(gkp0Var instanceof dkp0)) {
                if (gkp0Var instanceof ekp0) {
                    i1w0Var.d(new itn0(this, gkp0Var, (byte) 26));
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            this.o.e("CHECKED_CHIPS_ID_KEY", Long.valueOf(((dkp0) gkp0Var).f6244a));
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, qkp0.a((qkp0) value, 0L, false, false, null, ((dkp0) gkp0Var).f6244a, 15)));
            return;
        }
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
