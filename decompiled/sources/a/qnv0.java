package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class qnv0 extends i3t0 {
    public static final /* synthetic */ int x = 0;
    public final g2v o;
    public final mne p;
    public final i1w0 q;
    public final duj r;
    public final String s;
    public final long t;
    public final rl70 u;
    public final c4m0 v;
    public bby w;

    public qnv0(g2v g2vVar, m1e m1eVar, mne mneVar, i1w0 i1w0Var, duj dujVar, String str, long j, ocl oclVar, ctf0 ctf0Var, rl70 rl70Var) {
        m1eVar.getClass();
        ctf0Var.getClass();
        byte b = 1;
        whh whhVar = new whh(b, j);
        gpb0 gpb0Var = new gpb0(oclVar, ctf0Var, (byte) 23);
        rwj rwjVar = mneVar.f22085a;
        super(null, whhVar, gpb0Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = g2vVar;
        this.p = mneVar;
        this.q = i1w0Var;
        this.r = dujVar;
        this.s = str;
        this.t = j;
        this.u = rl70Var;
        c4m0 c4m0Var = this.v;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            yje yjeVar = null;
            this.v = sac.T(new fnq(m1eVar.b(), new onv0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new pnv0((Object) this, yjeVar, (byte) 0));
        }
        M();
    }

    public final void M() {
        Object value;
        bby bbyVar = this.w;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, jnv0.a((jnv0) value, true, false, false, null, 24)));
            this.w = sac.V(jiu0.a(this), new gdv0((Object) this, (byte) 5), null, this.p.b, new onv0(this, null, (byte) 0), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        cnv0 cnv0Var = (cnv0) obj;
        cnv0Var.getClass();
        super.x(cnv0Var);
        boolean zEquals = cnv0Var.equals(zmv0.f44644a);
        i1w0 i1w0Var = this.q;
        if (!zEquals) {
            if (cnv0Var instanceof anv0) {
                i1w0Var.d(new zfv0(this, cnv0Var, (byte) 6));
                return;
            } else if (cnv0Var.equals(bnv0.f2904a)) {
                M();
                return;
            } else {
                t9f.b();
                return;
            }
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
