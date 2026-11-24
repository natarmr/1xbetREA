package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class wli0 extends i3t0 {
    public static final /* synthetic */ int x = 0;
    public final i1w0 o;
    public final ctf0 p;
    public final duj q;
    public final ovt r;
    public final es s;
    public final csi0 t;
    public final mne u;
    public bby v;
    public final c4m0 w;

    public wli0(vzg0 vzg0Var, i1w0 i1w0Var, ctf0 ctf0Var, duj dujVar, ovt ovtVar, es esVar, csi0 csi0Var, ocl oclVar, m1e m1eVar, mne mneVar, int i) {
        ctf0Var.getClass();
        ovtVar.getClass();
        csi0Var.getClass();
        m1eVar.getClass();
        uli0 uli0Var = new uli0(i, (byte) 0);
        gpb0 gpb0Var = new gpb0(ctf0Var, oclVar, (byte) 9);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(vzg0Var, uli0Var, gpb0Var, cvm0.p(vs10Var, rwjVar));
        this.o = i1w0Var;
        this.p = ctf0Var;
        this.q = dujVar;
        this.r = ovtVar;
        this.s = esVar;
        this.t = csi0Var;
        this.u = mneVar;
        c4m0 c4m0Var = this.w;
        byte b = 1;
        yje yjeVar = null;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            this.w = sac.T(new fnq(m1eVar.b(), new yng0(this, yjeVar, (byte) 12), (byte) 4), d5c.S(jiu0.a(this), rwjVar), new bai0(this, yjeVar, (byte) 5));
        }
        sac.V(jiu0.a(this), new vli0(this, b), null, mneVar.b, new tmg0(this, yjeVar, (byte) 7), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        hli0 hli0Var = (hli0) obj;
        hli0Var.getClass();
        super.x(hli0Var);
        boolean zEquals = hli0Var.equals(bli0.f2797a);
        byte b = 0;
        p0w0 p0w0Var = p0w0.f26173a;
        i1w0 i1w0Var = this.o;
        if (zEquals) {
            bby bbyVar = this.v;
            if (bbyVar != null && bbyVar.isActive()) {
                return;
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (hli0Var instanceof eli0) {
                int i = ((eli0) hli0Var).f7999a;
                niq0 niq0Var = ((sli0) D()).e;
                if (niq0Var != null && i >= 0 && i < niq0Var.i.size()) {
                    p7m0 p7m0Var = this.i.f25029a;
                    do {
                        value = p7m0Var.getValue();
                        value.getClass();
                        oyg0 oyg0Var = this.f;
                        oyg0Var.getClass();
                        q7x.F(oyg0Var, Integer.valueOf(i), "SELECTED_VALUE_INDEX_KEY");
                    } while (!p7m0Var.m(value, sli0.a((sli0) value, false, false, false, false, null, 0, i, 191)));
                    return;
                }
                return;
            }
            if (hli0Var.equals(ali0.f1069a)) {
                G(oli0.f25457a);
                return;
            }
            boolean zEquals2 = hli0Var.equals(cli0.f4562a);
            yje yjeVar = null;
            mne mneVar = this.u;
            if (zEquals2) {
                niq0 niq0Var2 = ((sli0) D()).e;
                if (niq0Var2 == null) {
                    return;
                }
                v85 v85Var = (v85) CollectionsKt.W(((sli0) D()).g, niq0Var2.i);
                if (v85Var == null) {
                    return;
                }
                this.v = I(mneVar.b, new vli0(this, b), new hr(this, v85Var, yjeVar, (byte) 28));
                return;
            }
            if (!hli0Var.equals(dli0.f6283a) && !hli0Var.equals(fli0.f9740a)) {
                if (hli0Var.equals(gli0.f11492a)) {
                    I(mneVar.b, new vli0(this, (byte) 2), new hhb0(this, yjeVar, (byte) 10));
                    return;
                } else if (hli0Var.equals(zki0.f44535a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar2.next());
                }
            }
        }
    }
}
