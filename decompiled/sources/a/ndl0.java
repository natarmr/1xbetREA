package a;

import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;
import org.xplatform.special_event.impl.filter.navigation.SportGameFilterSelectionScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final class ndl0 extends w46 {
    public final SportGameFilterSelectionScreenParams b;
    public final mne c;
    public final duj d;
    public final g2v e;
    public final i1w0 f;
    public final fhj g;
    public final zas0 h;
    public final b8u i;
    public final z220 j;
    public final yfu k;
    public c4m0 l;
    public final p7m0 m = q7m0.a(tcl0.f33724a);
    public final p7m0 n;

    public ndl0(SportGameFilterSelectionScreenParams sportGameFilterSelectionScreenParams, vzg0 vzg0Var, mne mneVar, duj dujVar, g2v g2vVar, i1w0 i1w0Var, fhj fhjVar, zas0 zas0Var, b8u b8uVar, z220 z220Var, yfu yfuVar) {
        this.b = sportGameFilterSelectionScreenParams;
        this.c = mneVar;
        this.d = dujVar;
        this.e = g2vVar;
        this.f = i1w0Var;
        this.g = fhjVar;
        this.h = zas0Var;
        this.i = b8uVar;
        this.j = z220Var;
        this.k = yfuVar;
        iun iunVar = iun.f15405a;
        xun xunVar = xun.f41520a;
        this.n = q7m0.a(new odl0(true, false, false, false, true, false, false, "", iunVar, iunVar, xunVar, xunVar, g2v.d(g2vVar, pb10.r1, null, null, 0, 0, null, 510), 0L));
        y();
    }

    public final void A(ycl0 ycl0Var) {
        sac.V(jiu0.a(this), new kcl0(1, this, ndl0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, this.c.c, new lcl0(this, ycl0Var, null, (byte) 1), 10);
    }

    public final void B(boolean z) {
        p7m0 p7m0Var;
        Object value;
        odl0 odl0Var;
        if (z) {
            z220 z220Var = this.j;
            yo4 yo4Var = (yo4) z220Var.b;
            wgh0 wgh0Var = wgh0.MY_AGGREGATOR;
            yo4Var.m("sports");
            ((zr1) z220Var.c).q("sports");
        }
        do {
            p7m0Var = this.n;
            value = p7m0Var.getValue();
            odl0Var = (odl0) value;
        } while (!p7m0Var.m(value, odl0.a(odl0Var, false, false, false, false, z, false, !z ? "" : odl0Var.h, null, null, null, null, null, 16223)));
    }

    public final void a() {
        p7m0 p7m0Var = this.n;
        Set set = ((odl0) p7m0Var.getValue()).k;
        boolean z = ((odl0) p7m0Var.getValue()).b || ((odl0) p7m0Var.getValue()).f25082a;
        if (set.size() < 1 && !z) {
            A(xcl0.f40651a);
        } else if (((odl0) p7m0Var.getValue()).d) {
            A(ucl0.f35436a);
        } else {
            z();
        }
    }

    @Override // a.diu0
    public final void v() {
        v3c.N(this.l);
    }

    public final void w() {
        Set set = ((odl0) this.n.getValue()).k;
        if (set.size() < 1) {
            A(xcl0.f40651a);
            return;
        }
        this.h.c(set);
        i1w0 i1w0Var = this.f;
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

    public final jkm x() {
        return g2v.d(this.e, pb10.g, null, null, R.string.error_get_data, R.string.repeat_again, new lph0(0, this, ndl0.class, "onReloadScreenContent", "onReloadScreenContent()V", 0, (byte) 20), 94);
    }

    public final void y() {
        c4m0 c4m0Var = this.l;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            fhj fhjVar = this.g;
            yje yjeVar = null;
            this.l = sac.T(new fnq(dub.f0(new a1g(((v8l0) ((ani0) fhjVar.f9543a).f1155a).e, fhjVar, (byte) 26), new qaf0(((v8l0) ((ani0) this.i.f2175a).f1155a).f, (byte) 6), this.k.a(), new xo1(this, yjeVar, (byte) 6)), new bai0(this, yjeVar, (byte) 27), (byte) 4), d5c.S(jiu0.a(this), this.c.f22085a), new tmg0(this, yjeVar, (byte) 20));
        }
    }

    public final void z() {
        i1w0 i1w0Var = this.f;
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
