package a;

import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class gkc0 extends w46 {
    public final i1w0 b;
    public final tpx c;
    public final ikt0 d;
    public final m1e e;
    public final wsf0 f;
    public final trm0 g;
    public final ilt0 h;
    public final mne i;
    public final ljf0 j;
    public final s470 k;
    public final ddu l;
    public final duj m;
    public final p7m0 n;
    public final p7m0 o;
    public final p7m0 p;
    public final ol60 q;
    public boolean r;

    public gkc0(i1w0 i1w0Var, tpx tpxVar, ikt0 ikt0Var, m1e m1eVar, wsf0 wsf0Var, trm0 trm0Var, ilt0 ilt0Var, mne mneVar, ljf0 ljf0Var, s470 s470Var, ddu dduVar, duj dujVar) {
        i1w0Var.getClass();
        this.b = i1w0Var;
        this.c = tpxVar;
        this.d = ikt0Var;
        this.e = m1eVar;
        this.f = wsf0Var;
        this.g = trm0Var;
        this.h = ilt0Var;
        this.i = mneVar;
        this.j = ljf0Var;
        this.k = s470Var;
        this.l = dduVar;
        this.m = dujVar;
        this.n = q7m0.a(xjc0.f40979a);
        this.o = q7m0.a(njc0.f23628a);
        this.p = q7m0.a(pjc0.f27083a);
        this.q = new ol60(3);
        yje yjeVar = null;
        sac.V(jiu0.a(this), new wyb0((byte) 29), null, null, new ekc0(this, yjeVar, (byte) 0), 14);
        sac.V(jiu0.a(this), new ljc0((byte) 0), null, mneVar.f22085a, new ekc0(this, yjeVar, (byte) 1), 10);
    }

    public final void w() {
        i1w0 i1w0Var = this.b;
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

    public final void x() {
        String strN;
        boolean zC = this.e.c();
        Object mjc0Var = njc0.f23628a;
        if (zC) {
            s470 s470Var = this.k;
            s470Var.getClass();
            int iOrdinal = s470Var.ordinal();
            if (iOrdinal == 1) {
                strN = ohs0.n(ujn.h, "/static/img/android/games/background/1xMemory/background.webp");
            } else if (iOrdinal == 2) {
                strN = ohs0.n(ujn.h, "/static/img/android/games/background/safe/background.webp");
            } else if (iOrdinal != 3) {
                strN = iOrdinal != 4 ? null : ohs0.n(ujn.h, "/static/img/android/games/background/1xLottery/background.webp");
            } else {
                strN = ohs0.n(ujn.h, "/static/img/android/games/background/chest/background.webp");
            }
            if (strN != null) {
                mjc0Var = new mjc0(strN);
            }
        }
        p7m0 p7m0Var = this.o;
        p7m0Var.getClass();
        p7m0Var.o(null, mjc0Var);
    }

    public final void y() {
        p7m0 p7m0Var = this.n;
        p7m0Var.getClass();
        p7m0Var.o(null, xjc0.f40979a);
        this.j.d(false);
        x();
        bvc bvcVarA = jiu0.a(this);
        rwj rwjVar = this.i.f22085a;
        sac.V(bvcVarA, ckc0.f4500a, null, rwjVar, new o690((Object) this, (Object) g16.f10495a, (yje) null, (byte) 20), 10);
        if (this.e.c()) {
            p7m0 p7m0Var2 = this.p;
            p7m0Var2.getClass();
            p7m0Var2.o(null, pjc0.f27083a);
        }
    }

    public final void z() {
        p7m0 p7m0Var = this.p;
        if (p7m0Var.getValue() instanceof tjc0) {
            return;
        }
        p7m0Var.getClass();
        p7m0Var.o(null, tjc0.f34040a);
    }
}
