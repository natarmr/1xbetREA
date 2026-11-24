package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class wgp extends i3t0 {
    public static final /* synthetic */ int v = 0;
    public final duj o;
    public final b8u p;
    public final i1w0 q;
    public final kki r;
    public final String s;
    public final mne t;
    public bby u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wgp(duj dujVar, b8u b8uVar, m1e m1eVar, i1w0 i1w0Var, kki kkiVar, ocl oclVar, String str, r9u r9uVar, mne mneVar, ctf0 ctf0Var, vjp vjpVar) {
        super(null, new dfp((byte) 5), new ifd(ctf0Var, oclVar, vjpVar, r9uVar), cvm0.p(mneVar.c, mneVar.f22085a), null);
        m1eVar.getClass();
        r9uVar.getClass();
        ctf0Var.getClass();
        this.o = dujVar;
        this.p = b8uVar;
        this.q = i1w0Var;
        this.r = kkiVar;
        this.s = str;
        this.t = mneVar;
        sac.T(new fnq(m1eVar.b(), new hij(this, null, (byte) 21), (byte) 4), d5c.S(d5c.S(jiu0.a(this), mneVar.b), new ax5(this)), foe.h);
        M();
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
            } while (!p7m0Var.m(value, rgp.a((rgp) value, true, false, false)));
            this.u = sac.V(jiu0.a(this), new g7p((Object) this, (byte) 3), null, this.t.b, new j0l(this, null, (byte) 23), 10);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        ngp ngpVar = (ngp) obj;
        ngpVar.getClass();
        super.x(ngpVar);
        if (!ngpVar.equals(kgp.f18249a)) {
            if (!(ngpVar instanceof lgp)) {
                if (ngpVar.equals(mgp.f21753a)) {
                    M();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            ugp ugpVar = ((lgp) ngpVar).f20018a;
            if (ugpVar instanceof sgp) {
                i3t0.K(this, null, null, new ffd(this, ugpVar, null, (byte) 9), 3);
                return;
            }
            return;
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
