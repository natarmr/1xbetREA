package a;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class dna0 extends i3t0 {
    public static final /* synthetic */ int E = 0;
    public bby A;
    public bby B;
    public c4m0 C;
    public bby D;
    public final String o;
    public final long p;
    public final vzg0 q;
    public final f4u r;
    public final jwu s;
    public final wyu t;
    public final f7u u;
    public final fhj v;
    public final bbw0 w;
    public final mne x;
    public final duj y;
    public final i1w0 z;

    public dna0(String str, long j, vzg0 vzg0Var, f4u f4uVar, jwu jwuVar, qzt qztVar, wyu wyuVar, f7u f7uVar, weu weuVar, fhj fhjVar, uyn uynVar, bbw0 bbw0Var, m1e m1eVar, uyu uyuVar, mne mneVar, duj dujVar, i1w0 i1w0Var, r9u r9uVar, ctf0 ctf0Var, ocl oclVar) {
        str.getClass();
        wyuVar.getClass();
        m1eVar.getClass();
        i1w0Var.getClass();
        r9uVar.getClass();
        ctf0Var.getClass();
        wuh wuhVar = new wuh(qztVar, weuVar, str, fhjVar, j, wyuVar, vzg0Var);
        byte b = 1;
        tla0 tla0Var = new tla0(oclVar, ctf0Var, r9uVar, b);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, wuhVar, tla0Var, cvm0.p(vs10Var, rwjVar), null);
        this.o = str;
        this.p = j;
        this.q = vzg0Var;
        this.r = f4uVar;
        this.s = jwuVar;
        this.t = wyuVar;
        this.u = f7uVar;
        this.v = fhjVar;
        this.w = bbw0Var;
        this.x = mneVar;
        this.y = dujVar;
        this.z = i1w0Var;
        yje yjeVar = null;
        sac.T(new fnq(uyuVar.f36509a.h(), new ana0(this, yjeVar, (byte) 3), (byte) 4), d5c.S(jiu0.a(this), rwjVar), cna0.h);
        sac.T(new fnq(m1eVar.b(), new yma0(this, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new ana0(this, yjeVar, b));
        N();
        slb.U(new fnq(vtb.N(((eja0) ((z220) uynVar.f36498a).d).f7900a), new ana0(this, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), mneVar.b));
    }

    public final void M() {
        Object value;
        bby bbyVar = this.B;
        if (bbyVar == null || !bbyVar.isActive()) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, pma0.a((pma0) value, null, null, null, null, 0, false, true, false, 127)));
            this.B = i3t0.K(this, null, new wma0(1, this, dna0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 0), new epp(this, null, (byte) 27), 1);
        }
    }

    public final void N() {
        c4m0 c4m0Var;
        bby bbyVar;
        bby bbyVar2 = this.A;
        byte b = 1;
        yje yjeVar = null;
        if (bbyVar2 != null && bbyVar2.isActive() && (bbyVar = this.A) != null) {
            bbyVar.cancel(null);
        }
        boolean z = ((pma0) D()).g;
        mne mneVar = this.x;
        this.A = z ? sac.X(jiu0.a(this), 30L, mneVar.b, xma0.f41116a, new yma0(this, yjeVar, (byte) 0)) : sac.V(jiu0.a(this), zma0.f44616a, null, mneVar.b, new yma0(this, yjeVar, b), 10);
        c4m0 c4m0Var2 = this.C;
        if (c4m0Var2 != null && c4m0Var2.isActive() && (c4m0Var = this.C) != null) {
            c4m0Var.cancel(null);
        }
        this.C = sac.T(new fnq(this.u.n(this.o), new ana0(this, yjeVar, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), mneVar.b), bna0.h);
        M();
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        List list;
        z5i0 z5i0Var;
        List list2;
        z5i0 z5i0Var2;
        Object value;
        dka0 dka0Var = (dka0) obj;
        dka0Var.getClass();
        super.x(dka0Var);
        if (!(dka0Var instanceof zja0)) {
            if (dka0Var instanceof cka0) {
                int i = ((cka0) dka0Var).f4496a;
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, pma0.a((pma0) value, null, null, null, null, i, false, false, false, 479)));
                this.q.e("KEY_SELECTED_TAB", Integer.valueOf(i));
                return;
            }
            if (dka0Var instanceof bka0) {
                M();
                return;
            }
            if (!(dka0Var instanceof yja0)) {
                if (dka0Var.equals(aka0.f1013a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            if (((yja0) dka0Var).f42731a == 1) {
                fja0 fja0Var = ((pma0) D()).d;
                if (fja0Var == null || (list2 = fja0Var.d) == null || (z5i0Var2 = (z5i0) CollectionsKt.W(((pma0) D()).f, list2)) == null) {
                    return;
                }
                G(new mma0(z5i0Var2.c));
                return;
            }
            fja0 fja0Var2 = ((pma0) D()).d;
            if (fja0Var2 == null || (list = fja0Var2.d) == null || (z5i0Var = (z5i0) CollectionsKt.W(((pma0) D()).f, list)) == null) {
                return;
            }
            G(new nma0(z5i0Var.c));
            return;
        }
        eja0 eja0Var = (eja0) ((z220) this.w.b).d;
        eja0Var.f7900a.n(iun.f15405a);
        eja0Var.b = fja0.e;
        eja0Var.c.clear();
        i1w0 i1w0Var = this.z;
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
