package a;

import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class urp0 extends w46 {
    public final vzg0 b;
    public final mne c;
    public final int d;
    public final long e;
    public final m1e f;
    public final duj g;
    public final ctf0 h;
    public final g2v i;
    public final nyu j;
    public final nyu k;
    public final hnu l;
    public final i1w0 m;
    public final yo4 n;
    public final zr1 o;
    public final p7m0 p;
    public final p7m0 q;
    public List r;
    public final xae0 s;
    public final ol60 t;
    public bby u;
    public bby v;

    public urp0(vzg0 vzg0Var, mne mneVar, int i, long j, m1e m1eVar, duj dujVar, ctf0 ctf0Var, g2v g2vVar, nyu nyuVar, nyu nyuVar2, hnu hnuVar, i1w0 i1w0Var, yo4 yo4Var, zr1 zr1Var) {
        m1eVar.getClass();
        ctf0Var.getClass();
        this.b = vzg0Var;
        this.c = mneVar;
        this.d = i;
        this.e = j;
        this.f = m1eVar;
        this.g = dujVar;
        this.h = ctf0Var;
        this.i = g2vVar;
        this.j = nyuVar;
        this.k = nyuVar2;
        this.l = hnuVar;
        this.m = i1w0Var;
        this.n = yo4Var;
        this.o = zr1Var;
        this.p = q7m0.a(orp0.f25746a);
        this.q = q7m0.a(new frp0(ctf0Var.f(R.string.selector_teams, 0, 10), false, false, true));
        this.r = iun.f15405a;
        this.s = vzg0Var.c(drp0.f6574a, "SELECTED_IDS");
        this.t = new ol60(3);
        y();
        sac.V(jiu0.a(this), new brp0(this, (byte) 2), null, mneVar.b, new rrp0(this, null, (byte) 0), 10);
        z();
    }

    public final void A(j1i0 j1i0Var, List list) {
        String str = j1i0Var.f15736a;
        yo4 yo4Var = this.n;
        yo4Var.getClass();
        list.getClass();
        kt2 kt2Var = yo4Var.f42966a;
        jo20 jo20Var = new jo20();
        int i = this.d;
        jo20Var.put("championship_id", Integer.valueOf(i));
        long j = this.e;
        jo20Var.put("sport_id", Long.valueOf(j));
        if (!list.isEmpty()) {
            jo20Var.put("option", String.valueOf(list));
        }
        jo20Var.put("action", str);
        kt2Var.a("sport_champ_team_alert_approve", jo20Var.b());
        zr1 zr1Var = this.o;
        zr1Var.getClass();
        s1p s1pVar = zr1Var.f44833a;
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p(i, (byte) 2));
        yni0Var.add(new i1p((byte) 0, j));
        if (!list.isEmpty()) {
            yni0Var.add(new j1p(String.valueOf(list), (byte) 0));
        }
        yni0Var.add(new j1p(str, (byte) 1));
        s1pVar.a(cui0.a(yni0Var), 3120L);
    }

    public final void B(j1i0 j1i0Var, List list) {
        String str = j1i0Var.f15736a;
        yo4 yo4Var = this.n;
        yo4Var.getClass();
        list.getClass();
        kt2 kt2Var = yo4Var.f42966a;
        jo20 jo20Var = new jo20();
        int i = this.d;
        jo20Var.put("championship_id", Integer.valueOf(i));
        long j = this.e;
        jo20Var.put("sport_id", Long.valueOf(j));
        if (!list.isEmpty()) {
            jo20Var.put("option", String.valueOf(list));
        }
        jo20Var.put("action", str);
        kt2Var.a("sport_champ_team_choose", jo20Var.b());
        zr1 zr1Var = this.o;
        zr1Var.getClass();
        s1p s1pVar = zr1Var.f44833a;
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p(i, (byte) 2));
        yni0Var.add(new i1p((byte) 0, j));
        if (!list.isEmpty()) {
            yni0Var.add(new j1p(String.valueOf(list), (byte) 0));
        }
        yni0Var.add(new j1p(str, (byte) 1));
        s1pVar.a(cui0.a(yni0Var), 3105L);
    }

    public final void C(Throwable th) {
        nrp0 nrp0Var = new nrp0(x());
        p7m0 p7m0Var = this.p;
        p7m0Var.getClass();
        p7m0Var.o(null, nrp0Var);
        this.g.b(th, new zgp0((byte) 14));
    }

    public final void D(lrp0 lrp0Var) {
        sac.V(jiu0.a(this), new g0p0(1, this, urp0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, this.c.c, new ssl0((Object) this, (Object) lrp0Var, (yje) null, (byte) 18), 10);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0049 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    public final void E(erp0 erp0Var) {
        frp0 frp0Var;
        boolean z = erp0Var instanceof crp0;
        ctf0 ctf0Var = this.h;
        boolean z2 = false;
        if (z) {
            Set set = ((crp0) erp0Var).f4856a;
            boolean z3 = set.size() < 1;
            vzg0 vzg0Var = this.b;
            Set set2 = (Set) vzg0Var.a("INITIAL_SELECTED_IDS");
            if (set2 == null) {
                set2 = xun.f41520a;
            }
            if (set2.size() == set.size()) {
                Set set3 = (Set) vzg0Var.a("INITIAL_SELECTED_IDS");
                if (set3 == null) {
                    set3 = xun.f41520a;
                }
                if (!set3.containsAll(set)) {
                    if (!z3) {
                        z2 = true;
                    }
                }
            } else if (!z3) {
                z2 = true;
            }
            frp0Var = new frp0(ctf0Var.f(R.string.selector_teams, Integer.valueOf(set.size()), 10), !set.equals(CollectionsKt.P0(this.r)), z2, !set.isEmpty());
        } else {
            if (!Intrinsics.d(erp0Var, drp0.f6574a)) {
                t9f.b();
                return;
            }
            frp0Var = new frp0(ctf0Var.f(R.string.selector_teams, 0, 10), false, false, true);
        }
        p7m0 p7m0Var = this.q;
        p7m0Var.getClass();
        p7m0Var.o(null, frp0Var);
    }

    public final void a() {
        Set set;
        erp0 erp0Var = (erp0) this.s.f40549a.getValue();
        crp0 crp0Var = erp0Var instanceof crp0 ? (crp0) erp0Var : null;
        if (crp0Var == null || (set = crp0Var.f4856a) == null) {
            set = xun.f41520a;
        }
        if (set.size() < 1) {
            D(jrp0.f17015a);
            return;
        }
        if (((frp0) this.q.getValue()).b) {
            D(grp0.f11792a);
            return;
        }
        i1w0 i1w0Var = this.m;
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

    public final void w(boolean z) {
        erp0 erp0Var = (erp0) this.s.f40549a.getValue();
        if (erp0Var instanceof crp0) {
            List listL0 = CollectionsKt.L0(((crp0) erp0Var).f4856a);
            if (z) {
                A(j1i0.APPLY, listL0);
            } else {
                B(j1i0.APPLY, listL0);
            }
            sac.V(jiu0.a(this), new brp0(this, (byte) 1), null, this.c.b, new lcl0(this, listL0, null, (byte) 22), 10);
        }
    }

    public final jkm x() {
        return g2v.d(this.i, pb10.g, null, null, R.string.error_get_data, R.string.repeat_again, new cym0(0, this, urp0.class, "retryRequest", "retryRequest()V", 0, (byte) 12), 94);
    }

    public final void y() {
        if (((erp0) this.s.f40549a.getValue()) instanceof crp0) {
            return;
        }
        sac.V(jiu0.a(this), new brp0(this, (byte) 0), null, this.c.b, new rrp0(this, null, (byte) 1), 10);
    }

    public final void z() {
        v3c.N(this.u);
        this.u = sac.V(jiu0.a(this), new brp0(this, (byte) 4), null, this.c.b, new lcl0(this, null, (byte) 23), 10);
    }
}
