package a;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import org.xplatform.statistic.tennis.impl.biography.presentation.screen.PlayerBiographyScreens;
import org.xplatform.statistic.tennis.impl.earned_points.presentation.screen.EarnedPointsScreen;
import org.xplatform.statistic.tennis.impl.summary.presentation.screen.TennisSummaryScreens;
import org.xplatform.statistic.tennis.impl.wins_and_losses.presentation.actual.TennisWinLossScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class xja0 extends i3t0 {
    public static final /* synthetic */ int v = 0;
    public final String o;
    public final boolean p;
    public final vzg0 q;
    public final n4u r;
    public final clc s;
    public final i1w0 t;
    public final duj u;

    public xja0(String str, boolean z, vzg0 vzg0Var, uyu uyuVar, n4u n4uVar, clc clcVar, i1w0 i1w0Var, m1e m1eVar, mne mneVar, duj dujVar, wyu wyuVar, ocl oclVar, ctf0 ctf0Var) {
        str.getClass();
        i1w0Var.getClass();
        m1eVar.getClass();
        wyuVar.getClass();
        ctf0Var.getClass();
        wja0 wja0Var = new wja0(vzg0Var, wyuVar);
        cz czVar = new cz(oclVar, ctf0Var, (byte) 28);
        vs10 vs10Var = mneVar.c;
        dvj dvjVar = mneVar.b;
        g090 g090VarP = cvm0.p(vs10Var, dvjVar);
        yje yjeVar = null;
        super(null, wja0Var, czVar, g090VarP, null);
        this.o = str;
        this.p = z;
        this.q = vzg0Var;
        this.r = n4uVar;
        this.s = clcVar;
        this.t = i1w0Var;
        this.u = dujVar;
        J(new fnq(m1eVar.b(), new c670(this, yjeVar, (byte) 15), (byte) 4), dvjVar, new yi90(1, this, xja0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 25));
        M();
        i3t0.L(this, new fnq(uyuVar.f36509a.h(), new s980(this, yjeVar, (byte) 21), (byte) 4), null, null, 3);
    }

    public final void M() {
        i3t0.K(this, null, new yi90(1, this, xja0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 24), new epp(this, null, (byte) 25), 1);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        List list;
        ufp0 ufp0Var;
        nha0 nha0Var = (nha0) obj;
        nha0Var.getClass();
        super.x(nha0Var);
        boolean z = nha0Var instanceof kha0;
        String str = null;
        i1w0 i1w0Var = this.t;
        if (z) {
            if (!this.p) {
                ((bca0) ((w5z) this.s.b).c).f2347a = null;
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
        } else {
            if (nha0Var instanceof mha0) {
                int i = ((mha0) nha0Var).f21781a;
                cca0 cca0Var = ((rja0) D()).f30583a;
                if (cca0Var != null && (list = cca0Var.b) != null && (ufp0Var = (ufp0) CollectionsKt.W(i, list)) != null) {
                    str = ufp0Var.f35586a;
                }
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                Integer numValueOf = Integer.valueOf(i);
                vzg0 vzg0Var = this.q;
                vzg0Var.e("KEY_CURRENT_TAB", numValueOf);
                vzg0Var.e("KEY_SINGLE_PLAYER_ID", str2);
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, rja0.a((rja0) value, null, false, i, false, false, false, false, str2, false, 379)));
                return;
            }
            if (!(nha0Var instanceof lha0)) {
                if (nha0Var instanceof jha0) {
                    M();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            jnw jnwVar = ((lha0) nha0Var).f20045a;
            if (jnwVar instanceof dxp0) {
                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                k0w0VarI.h(new PlayerBiographyScreens(((rja0) D()).h));
                ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                }
            } else if (jnwVar instanceof exp0) {
                k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
                k0w0VarI2.h(new EarnedPointsScreen(((rja0) D()).h));
                ListIterator listIteratorO2 = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorO2;
                    if (!pawVar3.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar3.next());
                    }
                }
            } else if (jnwVar instanceof fxp0) {
                k0w0 k0w0VarI3 = cs0.i(i1w0Var, i1w0Var);
                k0w0VarI3.h(new TennisSummaryScreens(((rja0) D()).h));
                ListIterator listIteratorO3 = b1j.o(i1w0Var, k0w0VarI3.f17489a, 0);
                while (true) {
                    paw pawVar4 = (paw) listIteratorO3;
                    if (!pawVar4.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar4.next());
                    }
                }
            } else if (!(jnwVar instanceof hxp0)) {
                if (jnwVar instanceof gxp0) {
                    return;
                }
                t9f.b();
            } else {
                k0w0 k0w0VarI4 = cs0.i(i1w0Var, i1w0Var);
                k0w0VarI4.h(new TennisWinLossScreen(((rja0) D()).h));
                ListIterator listIteratorO4 = b1j.o(i1w0Var, k0w0VarI4.f17489a, 0);
                while (true) {
                    paw pawVar5 = (paw) listIteratorO4;
                    if (!pawVar5.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar5.next());
                    }
                }
            }
        }
    }
}
