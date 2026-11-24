package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes6.dex */
public final class pup extends i3t0 {
    public static final /* synthetic */ int C = 0;
    public bby A;
    public bby B;
    public final String o;
    public final long p;
    public final i1w0 q;
    public final mne r;
    public final ctf0 s;
    public final m1e t;
    public final jwu u;
    public final fhj v;
    public final duj w;
    public final a7q x;
    public final ocl y;
    public bby z;

    public pup(String str, long j, i1w0 i1w0Var, mne mneVar, ctf0 ctf0Var, m1e m1eVar, jwu jwuVar, f7u f7uVar, qzt qztVar, fhj fhjVar, weu weuVar, uyu uyuVar, wyu wyuVar, duj dujVar, a7q a7qVar, r9u r9uVar, ocl oclVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        wyuVar.getClass();
        r9uVar.getClass();
        kup kupVar = new kup(weuVar, str, qztVar, ctf0Var, fhjVar, j, wyuVar, r9uVar);
        rnp rnpVar = new rnp((byte) 1);
        rwj rwjVar = mneVar.f22085a;
        super(null, kupVar, rnpVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = str;
        this.p = j;
        this.q = i1w0Var;
        this.r = mneVar;
        this.s = ctf0Var;
        this.t = m1eVar;
        this.u = jwuVar;
        this.v = fhjVar;
        this.w = dujVar;
        this.x = a7qVar;
        this.y = oclVar;
        yje yjeVar = null;
        sac.T(new fnq(uyuVar.f36509a.h(), new sxk(this, yjeVar, (byte) 21), (byte) 4), d5c.S(jiu0.a(this), rwjVar), oup.h);
        sac.T(new fnq(f7uVar.n(str), new g6g((Object) this, (Object) qztVar.a(), yjeVar, (byte) 17), (byte) 4), jiu0.a(this), nup.h);
        N();
        M(true);
    }

    public final void M(boolean z) {
        bby bbyVar = this.B;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.B = i3t0.K(this, null, new pop(1, this, pup.class, "handleDataLoadError", "handleDataLoadError(Ljava/lang/Throwable;)V", 0, (byte) 6), new vnn((byte) 2, (yje) null, (i3t0) this, z), 1);
        }
    }

    public final void N() {
        bby bbyVar = this.z;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.z = sac.a0(jiu0.a(this), ibc.w0(30L, bfn.SECONDS), null, null, new lup(this, null, (byte) 2), 6);
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        mtp mtpVar = (mtp) obj;
        mtpVar.getClass();
        byte b = 0;
        if (!mtpVar.equals(itp.f15365a)) {
            if (mtpVar.equals(jtp.f17110a)) {
                M(true);
                return;
            }
            yje yjeVar = null;
            if (!mtpVar.equals(ktp.f18877a)) {
                if (mtpVar.equals(ltp.f20638a)) {
                    sac.T(new fnq(dtb.z(this.t.b(), 1), new lup(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), this.r.f22085a), mup.h);
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            bby bbyVar = this.A;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            bby bbyVar2 = this.z;
            if (bbyVar2 != null) {
                bbyVar2.cancel(null);
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
