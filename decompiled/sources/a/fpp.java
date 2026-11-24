package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xplatform.feed.linelive.presentation.feeds.child.sports.models.SportItemsSelectionState;

/* JADX INFO: loaded from: classes4.dex */
public final class fpp extends i3t0 {
    public static final /* synthetic */ int P = 0;
    public final mne A;
    public final zr1 B;
    public final yo4 C;
    public final m1e D;
    public final duj E;
    public final cmt F;
    public final imf0 G;
    public final spc H;
    public c4m0 I;
    public bby J;
    public final bby K;
    public c4m0 L;
    public bby M;
    public c4m0 N;
    public c4m0 O;
    public final vzg0 o;
    public final ikp p;
    public final pru q;
    public final i1w0 r;
    public final String s;
    public final dgu t;
    public final vjp u;
    public final rpt v;
    public final lef0 w;
    public final yuu x;
    public final svu y;
    public final j700 z;

    public fpp(vzg0 vzg0Var, mne mneVar, ikp ikpVar, pru pruVar, i1w0 i1w0Var, String str, dgu dguVar, vjp vjpVar, rpt rptVar, lef0 lef0Var, yuu yuuVar, svu svuVar, g2v g2vVar, j700 j700Var, mne mneVar2, zr1 zr1Var, yo4 yo4Var, m1e m1eVar, duj dujVar, ctf0 ctf0Var, cmt cmtVar, imf0 imf0Var, spc spcVar) {
        m1eVar.getClass();
        ctf0Var.getClass();
        g8l g8lVar = new g8l(vzg0Var, ctf0Var, j700Var, (byte) 13);
        o20 o20Var = new o20(ctf0Var, g2vVar, (byte) 9);
        rwj rwjVar = mneVar.f22085a;
        super(null, g8lVar, o20Var, cvm0.p(rwjVar, rwjVar), null);
        this.o = vzg0Var;
        this.p = ikpVar;
        this.q = pruVar;
        this.r = i1w0Var;
        this.s = str;
        this.t = dguVar;
        this.u = vjpVar;
        this.v = rptVar;
        this.w = lef0Var;
        this.x = yuuVar;
        this.y = svuVar;
        this.z = j700Var;
        this.A = mneVar2;
        this.B = zr1Var;
        this.C = yo4Var;
        this.D = m1eVar;
        this.E = dujVar;
        this.F = cmtVar;
        this.G = imf0Var;
        this.H = spcVar;
        bby bbyVar = this.K;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.K = sac.V(jiu0.a(this), top.f34296a, null, mneVar2.f22085a, new cin(this, null, (byte) 6), 10);
        }
    }

    public final void M(List list) {
        SportItemsSelectionState sportItemsSelectionState = ((ngl0) D()).f;
        xww.q(sportItemsSelectionState.b, list, new jbp((byte) 12), new f5p(sportItemsSelectionState, this, (byte) 10));
    }

    public final void N(boolean z) {
        bby bbyVar;
        yje yjeVar = null;
        if (z && (bbyVar = this.J) != null) {
            bbyVar.cancel(null);
        }
        bby bbyVar2 = this.J;
        if (bbyVar2 == null || !bbyVar2.isActive()) {
            this.J = sac.V(jiu0.a(this), new pop(1, this, fpp.class, "onDataLoadingError", "onDataLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, this.A.f22085a, new u88((Object) this, z, yjeVar, (byte) 17), 10);
        }
    }

    public final void O(ArrayList arrayList, boolean z) {
        j700 j700Var = this.z;
        String str = t9x.O(j700Var).f32224a;
        yo4 yo4Var = this.C;
        yo4Var.getClass();
        iun iunVar = iun.f15405a;
        yo4Var.g(iunVar, arrayList, iunVar, str, "sports_feed", z);
        String str2 = t9x.O(j700Var).f32224a;
        zr1 zr1Var = this.B;
        zr1Var.getClass();
        zr1Var.f44833a.a(tx3.l0(new k1p[]{new i1p(CollectionsKt.M0(arrayList)), new j1p("sports_feed", (byte) 0), new j1p(str2, (byte) 1), new j1p(z ? "select" : "cancel", (byte) 2)}), 10385L);
    }

    public final void P(Throwable th) {
        Object value;
        Object value2;
        Object value3;
        th.printStackTrace();
        boolean z = th instanceof SocketTimeoutException;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z || (th instanceof UnknownHostException)) {
            c4m0 c4m0Var = this.I;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.I = sac.T(new fnq(this.D.b(), new uop(this, (yje) null, (byte) 2), (byte) 4), d5c.S(jiu0.a(this), this.A.f22085a), cpp.h);
            }
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value, ngl0.a((ngl0) value, null, null, null, null, null, false, false, true, false, 7679)));
        } else {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, ngl0.a((ngl0) value3, null, null, null, null, null, false, false, true, false, 7679)));
            this.E.b(th, new jbp((byte) 11));
        }
        p7m0 p7m0Var3 = ocjVar.f25029a;
        do {
            value2 = p7m0Var3.getValue();
            value2.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var3.m(value2, ngl0.a((ngl0) value2, null, null, null, null, null, false, false, false, false, 7999)));
    }

    public final void Q(long j) {
        SportItemsSelectionState sportItemsSelectionState;
        Object value;
        SportItemsSelectionState sportItemsSelectionState2 = ((ngl0) D()).f;
        boolean z = sportItemsSelectionState2.f46668a;
        Set set = sportItemsSelectionState2.b;
        if (set.contains(Long.valueOf(j))) {
            sportItemsSelectionState = new SportItemsSelectionState(eui0.e(set, Long.valueOf(j)), z);
        } else if (set.size() >= 10) {
            return;
        } else {
            sportItemsSelectionState = new SportItemsSelectionState(eui0.h(set, Long.valueOf(j)), z);
        }
        SportItemsSelectionState sportItemsSelectionState3 = sportItemsSelectionState;
        this.o.e("SELECTION_STATE_KEY", sportItemsSelectionState3);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, ngl0.a((ngl0) value, null, null, null, null, sportItemsSelectionState3, false, false, false, sportItemsSelectionState3.f46668a, 4063)));
        M(((ngl0) D()).b);
    }

    public final void R(Set set) {
        bby bbyVar = this.M;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.M = sac.V(jiu0.a(this), bpp.f2996a, null, this.A.f22085a, new j0l((Object) this, (Object) set, yjeVar, (byte) 24), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object value;
        Object value2;
        dgl0 dgl0Var = (dgl0) obj;
        dgl0Var.getClass();
        super.x(dgl0Var);
        byte b = 0;
        yje yjeVar = null;
        if (!dgl0Var.equals(bgl0.f2560a) && !dgl0Var.equals(cgl0.f4318a) && !dgl0Var.equals(xfl0.f40796a) && !dgl0Var.equals(wfl0.f39077a)) {
            i3t0.K(this, null, null, new epp(this, yjeVar, b), 3);
        }
        boolean z = dgl0Var instanceof bgl0;
        byte b2 = 1;
        byte b3 = 2;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        boolean z2 = true;
        if (z) {
            if (!this.D.c()) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value2 = p7m0Var.getValue();
                    value2.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value2, ngl0.a((ngl0) value2, null, null, null, null, null, false, false, true, false, 7679)));
            }
            c4m0 c4m0Var = this.L;
            mne mneVar = this.A;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.L = sac.T(new fnq(this.v.d(), new vop(this, yjeVar, b3), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), dpp.h);
            }
            c4m0 c4m0Var2 = this.N;
            if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                this.N = sac.T(new fnq(((hkp) this.F.b).f13218a.c, new uop(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), zop.h);
            }
            c4m0 c4m0Var3 = this.O;
            if (c4m0Var3 == null || !c4m0Var3.isActive()) {
                this.O = sac.T(new fnq(this.x.m(Integer.MAX_VALUE), new vop(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), app.h);
            }
            N(false);
            return;
        }
        if (dgl0Var instanceof cgl0) {
            bby bbyVar = this.J;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            c4m0 c4m0Var4 = this.L;
            if (c4m0Var4 != null) {
                v3c.N(c4m0Var4);
            }
            c4m0 c4m0Var5 = this.N;
            if (c4m0Var5 != null) {
                v3c.N(c4m0Var5);
            }
            c4m0 c4m0Var6 = this.O;
            if (c4m0Var6 != null) {
                v3c.N(c4m0Var6);
                return;
            }
            return;
        }
        if (dgl0Var instanceof vfl0) {
            N(true);
            return;
        }
        if (dgl0Var instanceof xfl0) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value, ngl0.a((ngl0) value, null, null, null, null, null, false, false, false, false, 7935)));
            return;
        }
        boolean z3 = dgl0Var instanceof agl0;
        yo4 yo4Var = this.C;
        j700 j700Var = this.z;
        zr1 zr1Var = this.B;
        if (z3) {
            long j = ((agl0) dgl0Var).f829a;
            okp okpVarQ = t9x.Q(j700Var);
            zr1Var.getClass();
            zr1Var.f44833a.a(tx3.l0(new k1p[]{new j1p(okpVarQ.f25415a, (byte) 0), new i1p((int) j, (byte) 2)}), 3078L);
            String str = t9x.Q(j700Var).f25415a;
            yo4Var.getClass();
            yo4Var.f42966a.a("bet_menu_filter_game_call", xp20.f(new Pair("sport_id", String.valueOf(j)), new Pair("feed", str)));
            R(cui0.b(Long.valueOf(j)));
            return;
        }
        if (dgl0Var instanceof zfl0) {
            Q(((zfl0) dgl0Var).f44305a);
            return;
        }
        if (dgl0Var instanceof yfl0) {
            List list = ((ngl0) D()).b;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((ngl0) D()).f.b.contains(Long.valueOf(((jfl0) obj2).f16433a))) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(Long.valueOf(((jfl0) it.next()).f16433a));
            }
            O(arrayList2, true);
            R(CollectionsKt.P0(arrayList2));
            return;
        }
        boolean z4 = dgl0Var instanceof tfl0;
        lef0 lef0Var = this.w;
        if (z4) {
            List list2 = ((ngl0) D()).b;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : list2) {
                if (((ngl0) D()).f.b.contains(Long.valueOf(((jfl0) obj3).f16433a))) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(Long.valueOf(((jfl0) it2.next()).f16433a));
            }
            boolean z5 = false;
            O(arrayList4, false);
            lef0Var.j(false);
            p7m0 p7m0Var3 = ocjVar.f25029a;
            while (true) {
                Object value3 = p7m0Var3.getValue();
                value3.getClass();
                oyg0Var.getClass();
                boolean z6 = z5;
                if (p7m0Var3.m(value3, ngl0.a((ngl0) value3, null, null, null, null, null, false, false, false, z6, 4095))) {
                    return;
                } else {
                    z5 = z6;
                }
            }
        } else {
            if (!(dgl0Var instanceof ufl0)) {
                if (dgl0Var instanceof wfl0) {
                    this.G.f15023a.f13218a.b.f(Unit.f46060a);
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            long j2 = ((ufl0) dgl0Var).f35583a;
            String str2 = t9x.O(j700Var).f32224a;
            yo4Var.getClass();
            yo4Var.f42966a.a("bet_menu_filter_multy_call", xp20.f(new Pair("point", str2), new Pair("screen", "sports_feed")));
            String str3 = t9x.O(j700Var).f32224a;
            zr1Var.getClass();
            zr1Var.j(str3, "sports_feed");
            if (!((ngl0) D()).m) {
                Q(j2);
            }
            lef0Var.j(true);
            p7m0 p7m0Var4 = ocjVar.f25029a;
            while (true) {
                Object value4 = p7m0Var4.getValue();
                value4.getClass();
                boolean z7 = z2;
                oyg0Var.getClass();
                if (p7m0Var4.m(value4, ngl0.a((ngl0) value4, null, null, null, null, null, false, false, false, z7, 4095))) {
                    return;
                } else {
                    z2 = z7;
                }
            }
        }
    }
}
