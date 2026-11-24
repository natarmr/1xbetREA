package a;

import java.io.Serializable;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.betting.core.zip.model.zip.BetZip;
import org.xplatform.betting.core.zip.model.zip.bet.BetGroupZip;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedsChampsItemsScreenParams;
import org.xplatform.feed.linelive.presentation.feeds.child.champs.models.FeedsChampsItemsSelectionState;

/* JADX INFO: loaded from: classes4.dex */
public final class nnp extends i3t0 {
    public static final /* synthetic */ int a0 = 0;
    public final lef0 A;
    public final vjp B;
    public final i1w0 C;
    public final rpt D;
    public final mne E;
    public final ivn F;
    public final lbu G;
    public final pru H;
    public final ik4 I;
    public final zr1 J;
    public final yo4 K;
    public final njt0 L;
    public final luu M;
    public final y3v N;
    public final m1e O;
    public final cmt P;
    public final imf0 Q;
    public final h3c R;
    public final duj S;
    public final FeedsChampsItemsScreenParams T;
    public final spc U;
    public c4m0 V;
    public bby W;
    public c4m0 X;
    public c4m0 Y;
    public final bby Z;
    public final vzg0 o;
    public final tzi p;
    public final vd1 q;
    public final hjd r;
    public final r9u s;
    public final fvt0 t;
    public final nv20 u;
    public final oeg0 v;
    public final zyt w;
    public final pmi x;
    public final qv2 y;
    public final dxt z;

    public nnp(vzg0 vzg0Var, tzi tziVar, g2v g2vVar, vd1 vd1Var, hjd hjdVar, r9u r9uVar, fvt0 fvt0Var, nv20 nv20Var, mci mciVar, oeg0 oeg0Var, zyt zytVar, pmi pmiVar, qv2 qv2Var, dxt dxtVar, lef0 lef0Var, vjp vjpVar, i1w0 i1w0Var, rpt rptVar, mne mneVar, ivn ivnVar, lbu lbuVar, ctf0 ctf0Var, pru pruVar, ik4 ik4Var, zr1 zr1Var, yo4 yo4Var, njt0 njt0Var, luu luuVar, y3v y3vVar, m1e m1eVar, cmt cmtVar, imf0 imf0Var, h3c h3cVar, duj dujVar, FeedsChampsItemsScreenParams feedsChampsItemsScreenParams, spc spcVar) {
        rwj rwjVar;
        r9uVar.getClass();
        oeg0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        g8l g8lVar = new g8l(vzg0Var, ctf0Var, feedsChampsItemsScreenParams, (byte) 12);
        o20 o20Var = new o20(ctf0Var, g2vVar, (byte) 8);
        rwj rwjVar2 = mneVar.f22085a;
        super(null, g8lVar, o20Var, cvm0.p(rwjVar2, rwjVar2), null);
        this.o = vzg0Var;
        this.p = tziVar;
        this.q = vd1Var;
        this.r = hjdVar;
        this.s = r9uVar;
        this.t = fvt0Var;
        this.u = nv20Var;
        this.v = oeg0Var;
        this.w = zytVar;
        this.x = pmiVar;
        this.y = qv2Var;
        this.z = dxtVar;
        this.A = lef0Var;
        this.B = vjpVar;
        this.C = i1w0Var;
        this.D = rptVar;
        this.E = mneVar;
        this.F = ivnVar;
        this.G = lbuVar;
        this.H = pruVar;
        this.I = ik4Var;
        this.J = zr1Var;
        this.K = yo4Var;
        this.L = njt0Var;
        this.M = luuVar;
        this.N = y3vVar;
        this.O = m1eVar;
        this.P = cmtVar;
        this.Q = imf0Var;
        this.R = h3cVar;
        this.S = dujVar;
        this.T = feedsChampsItemsScreenParams;
        this.U = spcVar;
        bby bbyVar = this.Z;
        if (bbyVar == null || !bbyVar.isActive()) {
            rwjVar = rwjVar2;
            this.Z = sac.V(jiu0.a(this), bnp.f2895a, null, rwjVar2, new cin(this, null, (byte) 5), 10);
        } else {
            rwjVar = rwjVar2;
        }
        i3t0.F(this, hjdVar, rwjVar, null, new jbp((byte) 9), 118);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    public static BetZip N(ygs ygsVar, long j, xgl0 xgl0Var) {
        ArrayList arrayList;
        Object next;
        List list;
        List list2 = ygsVar.x;
        Object obj = null;
        if (list2 != null) {
            Iterator it = list2.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((BetGroupZip) next).b != j);
            BetGroupZip betGroupZip = (BetGroupZip) next;
            if (betGroupZip == null || (list = betGroupZip.f) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    BetZip betZip = (BetZip) obj2;
                    if (betZip.b != 0.0d || betZip.t.length() != 0) {
                        arrayList.add(obj2);
                    }
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        for (Object obj3 : arrayList) {
            BetZip betZip2 = (BetZip) obj3;
            if (betZip2.f46426a == xgl0Var.f40846a && betZip2.d == xgl0Var.b && betZip2.b == xgl0Var.c && betZip2.c == j && Intrinsics.d(betZip2.t, xgl0Var.d)) {
                obj = obj3;
                break;
            }
        }
        return (BetZip) obj;
    }

    public static void Q(nnp nnpVar, int i) {
        nnpVar.P(((xmp) nnpVar.D()).i, (i & 1) == 0, false);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object M(ygs ygsVar, BetZip betZip, ctc ctcVar, zje zjeVar) {
        anp anpVar;
        if (zjeVar instanceof anp) {
            anpVar = (anp) zjeVar;
            int i = anpVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                anpVar.l = i - Integer.MIN_VALUE;
            } else {
                anpVar = new anp(this, zjeVar);
            }
        } else {
            anpVar = new anp(this, zjeVar);
        }
        Object objF = anpVar.j;
        wne wneVar = wne.f39444a;
        int i2 = anpVar.l;
        if (i2 == 0) {
            z1x.P(objF);
            if (this.G.j()) {
                return Unit.f46060a;
            }
            m0k0 m0k0VarX = q0x.X(ygsVar);
            zxj0 zxj0VarN0 = ucx.n0(betZip);
            gs2 gs2Var = new gs2();
            anpVar.i = ctcVar;
            anpVar.l = 1;
            pmi pmiVar = this.x;
            pmiVar.getClass();
            objF = gud.f((gud) pmiVar.b, m0k0VarX, zxj0VarN0, phu0.Y(gs2Var), anpVar);
            if (objF == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ctcVar = anpVar.i;
            z1x.P(objF);
        }
        G(new ump(new njd((aud) objF, ctcVar, new gs2())));
        return Unit.f46060a;
    }

    public final ygs O(long j) {
        Object next;
        List<rbb> list = ((xmp) D()).f41139a.f16804a.f18576a;
        ArrayList arrayList = new ArrayList();
        for (rbb rbbVar : list) {
            List list2 = rbbVar.p;
            List list3 = rbbVar.d;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                w3d.u(arrayList2, ((sum0) it.next()).m);
            }
            w3d.u(arrayList, CollectionsKt.q0(list2, arrayList2));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (((ygs) next).f42600a == j) {
                return (ygs) next;
            }
        }
        next = null;
        return (ygs) next;
    }

    public final void P(List list, boolean z, boolean z2) {
        bby bbyVar;
        if (z && (bbyVar = this.W) != null) {
            bbyVar.cancel(null);
        }
        bby bbyVar2 = this.W;
        if (bbyVar2 == null || !bbyVar2.isActive()) {
            this.W = sac.V(jiu0.a(this), new k4p(1, this, nnp.class, "onDataLoadingError", "onDataLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, this.E.f22085a, new mu3((yje) null, this, list, z, z2), 10);
        }
    }

    public final void R(long j, long j2, long j3, boolean z) {
        vd1 vd1Var = this.q;
        vd1Var.getClass();
        Object obj = z ? "live" : "line";
        kt2 kt2Var = vd1Var.f37210a;
        if (j3 == 0) {
            kt2Var.a("bet_menu_filter_champ_call", xp20.f(new Pair("championship_id", Long.valueOf(j)), new Pair("sport_id", Long.valueOf(j2)), new Pair("point", obj)));
        } else {
            kt2Var.a("bet_menu_filter_champ_call", xp20.f(new Pair("championship_id", Long.valueOf(j)), new Pair("sport_id", Long.valueOf(j2)), new Pair("sub_sport_id", Long.valueOf(j3))));
        }
        int i = (int) j;
        int i2 = (int) j2;
        int i3 = (int) j3;
        ik4 ik4Var = this.I;
        ik4Var.getClass();
        String str = z ? "live" : "line";
        ik4Var.f14907a.a(i3 == 0 ? tx3.l0(new k1p[]{new i1p(i, (byte) 2), new i1p(i2, (byte) 0), new j1p(str, (byte) 0)}) : tx3.l0(new k1p[]{new i1p(i, (byte) 2), new i1p(i2, (byte) 0), new i1p(i3, (byte) 1), new j1p(str, (byte) 0)}), 3161L);
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [java.io.Serializable, long[]] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.io.Serializable, long[]] */
    public final void S(boolean z) {
        List list = ((xmp) D()).f41139a.f16804a.f18576a;
        ArrayList<rbb> arrayList = new ArrayList();
        for (Object obj : list) {
            if (((xmp) D()).e.b.contains(Long.valueOf(((rbb) obj).f30176a))) {
                arrayList.add(obj);
            }
        }
        List list2 = ((xmp) D()).f41139a.f16804a.f18576a;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            w3d.u(arrayList2, ((rbb) it.next()).d);
        }
        ArrayList<sum0> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((xmp) D()).e.b.contains(Long.valueOf(((sum0) obj2).f32829a))) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(Long.valueOf(((rbb) it2.next()).f30176a));
        }
        ArrayList arrayList5 = new ArrayList(r3d.q(arrayList3, 10));
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            arrayList5.add(Long.valueOf(((sum0) it3.next()).f32829a));
        }
        ArrayList arrayListQ0 = CollectionsKt.q0(arrayList4, arrayList5);
        ArrayList arrayList6 = new ArrayList(r3d.q(arrayList, 10));
        for (rbb rbbVar : arrayList) {
            arrayList6.add(new Pair(Long.valueOf(rbbVar.n), Long.valueOf(rbbVar.j)));
        }
        ArrayList arrayList7 = new ArrayList(r3d.q(arrayList3, 10));
        for (sum0 sum0Var : arrayList3) {
            arrayList7.add(new Pair(Long.valueOf(sum0Var.l), Long.valueOf(sum0Var.i)));
        }
        ArrayList arrayListQ1 = CollectionsKt.q0(arrayList6, arrayList7);
        FeedsChampsItemsScreenParams feedsChampsItemsScreenParams = this.T;
        String str = t9x.O(feedsChampsItemsScreenParams.b).f32224a;
        yo4 yo4Var = this.K;
        yo4Var.getClass();
        ArrayList arrayList8 = new ArrayList(r3d.q(arrayListQ1, 10));
        Iterator it4 = arrayListQ1.iterator();
        while (it4.hasNext()) {
            arrayList8.add(Long.valueOf(((Number) ((Pair) it4.next()).f46059a).longValue()));
        }
        List listL0 = CollectionsKt.L0(CollectionsKt.P0(arrayList8));
        ArrayList arrayList9 = new ArrayList();
        for (Object obj3 : arrayListQ1) {
            Pair pair = (Pair) obj3;
            if (((Number) pair.f46059a).longValue() == 40 && ((Number) pair.b).longValue() != 0) {
                arrayList9.add(obj3);
            }
        }
        ArrayList arrayList10 = new ArrayList(r3d.q(arrayList9, 10));
        Iterator it5 = arrayList9.iterator();
        while (it5.hasNext()) {
            arrayList10.add(Long.valueOf(((Number) ((Pair) it5.next()).b).longValue()));
        }
        yo4Var.g(arrayListQ0, listL0, CollectionsKt.L0(CollectionsKt.P0(arrayList10)), str, "champs_feed", z);
        String str2 = t9x.O(feedsChampsItemsScreenParams.b).f32224a;
        zr1 zr1Var = this.J;
        zr1Var.getClass();
        ArrayList arrayList11 = new ArrayList(r3d.q(arrayListQ1, 10));
        Iterator it6 = arrayListQ1.iterator();
        while (it6.hasNext()) {
            arrayList11.add(Long.valueOf(((Number) ((Pair) it6.next()).f46059a).longValue()));
        }
        long[] jArrM0 = CollectionsKt.M0(CollectionsKt.P0(arrayList11));
        ArrayList arrayList12 = new ArrayList();
        for (Object obj4 : arrayListQ1) {
            Pair pair2 = (Pair) obj4;
            if (((Number) pair2.f46059a).longValue() == 40 && ((Number) pair2.b).longValue() != 0) {
                arrayList12.add(obj4);
            }
        }
        ArrayList arrayList13 = new ArrayList(r3d.q(arrayList12, 10));
        Iterator it7 = arrayList12.iterator();
        while (it7.hasNext()) {
            arrayList13.add(Long.valueOf(((Number) ((Pair) it7.next()).b).longValue()));
        }
        ?? M0 = CollectionsKt.M0(CollectionsKt.P0(arrayList13));
        s1p s1pVar = zr1Var.f44833a;
        yni0 yni0Var = new yni0();
        yni0Var.add(new i1p(jArrM0));
        if (M0.length != 0) {
            yni0Var.add(new i1p((Serializable) M0, (byte) 0));
        }
        yni0Var.add(new i1p((Serializable) CollectionsKt.M0(arrayListQ0), (byte) 1));
        yni0Var.add(new j1p("champs_feed", (byte) 0));
        yni0Var.add(new j1p(str2, (byte) 1));
        yni0Var.add(new j1p(z ? "select" : "cancel", (byte) 2));
        s1pVar.a(cui0.a(yni0Var), 10385L);
    }

    public final void T(Throwable th) {
        Object value;
        Object value2;
        Object value3;
        th.printStackTrace();
        boolean z = th instanceof SocketTimeoutException;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (z || (th instanceof UnknownHostException)) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value, xmp.a((xmp) value, null, null, null, null, null, false, true, null, false, null, false, 16255)));
        } else {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value3 = p7m0Var2.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value3, xmp.a((xmp) value3, null, null, null, null, null, false, true, null, false, null, false, 16255)));
            this.S.b(th, new jbp((byte) 10));
        }
        p7m0 p7m0Var3 = ocjVar.f25029a;
        do {
            value2 = p7m0Var3.getValue();
            value2.getClass();
            oyg0Var.getClass();
        } while (!p7m0Var3.m(value2, xmp.a((xmp) value2, null, null, null, null, null, false, false, null, false, null, false, 16287)));
    }

    public final void U(long j) {
        Object next;
        Object next2;
        List list = ((xmp) D()).f41139a.f16804a.f18576a;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((rbb) next).f30176a != j);
        rbb rbbVar = (rbb) next;
        if (rbbVar != null) {
            sum0 sum0Var = (sum0) CollectionsKt.firstOrNull(rbbVar.d);
            i3t0.K(this, null, null, new inp(this, j, rbbVar.m, rbbVar.p, rbbVar.n, sum0Var != null ? sum0Var.f32829a : 0L, rbbVar.c, rbbVar.b, null), 3);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            w3d.u(arrayList, ((rbb) it2.next()).d);
        }
        Iterator it3 = arrayList.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
        } while (((sum0) next2).f32829a != j);
        sum0 sum0Var2 = (sum0) next2;
        if (sum0Var2 != null) {
            String str = sum0Var2.c;
            long j2 = sum0Var2.l;
            i3t0.K(this, null, null, new inp(this, j, false, sum0Var2.m, j2, j2, str, sum0Var2.b, null), 3);
        }
    }

    public final void V(long j) {
        FeedsChampsItemsSelectionState feedsChampsItemsSelectionStateA;
        Object value;
        FeedsChampsItemsSelectionState feedsChampsItemsSelectionState = ((xmp) D()).e;
        Set set = feedsChampsItemsSelectionState.b;
        if (set.contains(Long.valueOf(j))) {
            feedsChampsItemsSelectionStateA = FeedsChampsItemsSelectionState.a(feedsChampsItemsSelectionState, eui0.e(set, Long.valueOf(j)));
        } else if (set.size() >= 10) {
            return;
        } else {
            feedsChampsItemsSelectionStateA = FeedsChampsItemsSelectionState.a(feedsChampsItemsSelectionState, eui0.h(set, Long.valueOf(j)));
        }
        FeedsChampsItemsSelectionState feedsChampsItemsSelectionState2 = feedsChampsItemsSelectionStateA;
        boolean z = feedsChampsItemsSelectionState2.f46666a;
        this.o.e("SELECTION_STATE_KEY", feedsChampsItemsSelectionState2);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, xmp.a((xmp) value, null, null, null, null, feedsChampsItemsSelectionState2, false, false, null, z, null, false, 15343)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W(gmp gmpVar, zje zjeVar) {
        jnp jnpVar;
        if (zjeVar instanceof jnp) {
            jnpVar = (jnp) zjeVar;
            int i = jnpVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                jnpVar.l = i - Integer.MIN_VALUE;
            } else {
                jnpVar = new jnp(this, zjeVar);
            }
        } else {
            jnpVar = new jnp(this, zjeVar);
        }
        Object objB = jnpVar.j;
        wne wneVar = wne.f39444a;
        int i2 = jnpVar.l;
        if (i2 == 0) {
            z1x.P(objB);
            long j = gmpVar.f11551a.c;
            jnpVar.i = gmpVar;
            jnpVar.l = 1;
            objB = this.R.b(j, jnpVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            gmpVar = jnpVar.i;
            z1x.P(objB);
        }
        this.C.d(new r91((Object) this, (Object) gmpVar, ((Boolean) objB).booleanValue(), (byte) 16));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object X(ygs ygsVar, zje zjeVar) {
        knp knpVar;
        if (zjeVar instanceof knp) {
            knpVar = (knp) zjeVar;
            int i = knpVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                knpVar.l = i - Integer.MIN_VALUE;
            } else {
                knpVar = new knp(this, zjeVar);
            }
        } else {
            knpVar = new knp(this, zjeVar);
        }
        Object objB = knpVar.j;
        wne wneVar = wne.f39444a;
        int i2 = knpVar.l;
        if (i2 == 0) {
            z1x.P(objB);
            long j = ygsVar.d;
            knpVar.i = ygsVar;
            knpVar.l = 1;
            objB = this.R.b(j, knpVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ygsVar = knpVar.i;
            z1x.P(objB);
        }
        this.C.d(new r91((Object) this, (Object) ygsVar, ((Boolean) objB).booleanValue(), (byte) 15));
        return Unit.f46060a;
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        List list;
        Object value;
        Object value2;
        boolean z;
        Object value3;
        smp smpVar = (smp) obj;
        smpVar.getClass();
        super.x(smpVar);
        yje yjeVar = null;
        if (!smpVar.equals(pmp.f27247a) && !smpVar.equals(qmp.f28996a) && !smpVar.equals(mmp.f22051a) && !smpVar.equals(lmp.f20308a) && !smpVar.equals(amp.f1120a)) {
            i3t0.K(this, null, null, new pn(this, yjeVar, (byte) 29), 3);
        }
        boolean z2 = smpVar instanceof pmp;
        byte b = 2;
        byte b2 = 1;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        m1e m1eVar = this.O;
        boolean z3 = true;
        if (z2) {
            Q(this, 7);
            c4m0 c4m0Var = this.V;
            mne mneVar = this.E;
            if (c4m0Var == null || !c4m0Var.isActive()) {
                this.V = sac.T(new fnq(m1eVar.b(), new cnp(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), lnp.h);
            }
            if (!m1eVar.c()) {
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value3 = p7m0Var.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value3, xmp.a((xmp) value3, null, null, null, null, null, false, true, null, false, null, false, 16255)));
            }
            c4m0 c4m0Var2 = this.X;
            if (c4m0Var2 == null || !c4m0Var2.isActive()) {
                this.X = sac.T(new fnq(this.D.d(), new sxk(this, yjeVar, (byte) 19), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), mnp.h);
            }
            c4m0 c4m0Var3 = this.Y;
            if (c4m0Var3 == null || !c4m0Var3.isActive()) {
                rlp rlpVar = ((xmp) D()).b;
                if ((rlpVar != null ? rlpVar.d : null) == j8l0.MEDIUM_ITEMS_LINE_SEPARATOR_WITH_EVENTS) {
                    return;
                }
                this.Y = sac.T(new fnq(((hkp) this.P.b).f13218a.c, new cnp(this, yjeVar, b2), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), gnp.h);
                return;
            }
            return;
        }
        if (smpVar instanceof qmp) {
            bby bbyVar = this.W;
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
            c4m0 c4m0Var4 = this.Y;
            if (c4m0Var4 != null) {
                c4m0Var4.cancel(null);
            }
            c4m0 c4m0Var5 = this.X;
            if (c4m0Var5 != null) {
                c4m0Var5.cancel(null);
            }
            c4m0 c4m0Var6 = this.V;
            if (c4m0Var6 != null) {
                c4m0Var6.cancel(null);
                return;
            }
            return;
        }
        if (smpVar instanceof kmp) {
            Q(this, 6);
            return;
        }
        boolean z4 = smpVar instanceof hmp;
        lef0 lef0Var = this.A;
        zr1 zr1Var = this.J;
        FeedsChampsItemsScreenParams feedsChampsItemsScreenParams = this.T;
        byte b3 = 10;
        if (z4) {
            long j = ((hmp) smpVar).f13320a;
            String str = t9x.O(feedsChampsItemsScreenParams.b).f32224a;
            yo4 yo4Var = this.K;
            yo4Var.getClass();
            yo4Var.f42966a.a("bet_menu_filter_multy_call", xp20.f(new Pair("point", str), new Pair("screen", "champs_feed")));
            String str2 = t9x.O(feedsChampsItemsScreenParams.b).f32224a;
            zr1Var.getClass();
            zr1Var.j(str2, "champs_feed");
            if (!((xmp) D()).k) {
                List<rbb> list2 = ((xmp) D()).f41139a.f16804a.f18576a;
                ArrayList arrayList = new ArrayList();
                for (rbb rbbVar : list2) {
                    lc00 lc00VarB = kotlin.collections.a.b();
                    if (rbbVar.d.isEmpty()) {
                        lc00VarB.add(Long.valueOf(rbbVar.f30176a));
                    }
                    List list3 = rbbVar.d;
                    ArrayList arrayList2 = new ArrayList(r3d.q(list3, 10));
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(Long.valueOf(((sum0) it.next()).f32829a));
                    }
                    lc00VarB.addAll(arrayList2);
                    w3d.u(arrayList, kotlin.collections.a.a(lc00VarB));
                }
                if (!arrayList.isEmpty()) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (((Number) it2.next()).longValue() == j) {
                            V(j);
                            break;
                        }
                    }
                }
            }
            lef0Var.j(true);
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value2 = p7m0Var2.getValue();
                value2.getClass();
                z = z3;
                oyg0Var.getClass();
                z3 = z;
            } while (!p7m0Var2.m(value2, xmp.a((xmp) value2, null, null, null, null, null, false, false, null, z, null, false, 15359)));
            return;
        }
        if (smpVar instanceof mmp) {
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value = p7m0Var3.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value, xmp.a((xmp) value, null, null, null, null, null, false, false, null, false, null, false, 8191)));
            return;
        }
        boolean z5 = smpVar instanceof zlp;
        vzg0 vzg0Var = this.o;
        if (z5) {
            zlp zlpVar = (zlp) smpVar;
            String strK = f7k.K(((xmp) D()).m, zlpVar.f44591a, zlpVar.b);
            LinkedHashSet linkedHashSetO0 = CollectionsKt.O0(((xmp) D()).d);
            if (linkedHashSetO0.contains(strK)) {
                linkedHashSetO0.remove(strK);
            } else {
                linkedHashSetO0.add(strK);
            }
            vzg0Var.e("EXPANDED_STATE_KEY", linkedHashSetO0);
            p7m0 p7m0Var4 = ocjVar.f25029a;
            while (true) {
                Object value4 = p7m0Var4.getValue();
                value4.getClass();
                oyg0Var.getClass();
                LinkedHashSet linkedHashSet = linkedHashSetO0;
                if (p7m0Var4.m(value4, xmp.a((xmp) value4, null, null, null, linkedHashSetO0, null, false, false, null, false, null, false, 16375))) {
                    return;
                } else {
                    linkedHashSetO0 = linkedHashSet;
                }
            }
        } else {
            if (smpVar instanceof emp) {
                long j2 = ((emp) smpVar).f8059a;
                ArrayList arrayListN0 = CollectionsKt.N0(((xmp) D()).i);
                if (arrayListN0.contains(Long.valueOf(j2))) {
                    arrayListN0.remove(Long.valueOf(j2));
                } else {
                    arrayListN0.add(Long.valueOf(j2));
                }
                List listE0 = CollectionsKt.E0(10, arrayListN0);
                vzg0Var.e("EXPANDED_GAMES_STATE_KEY", listE0);
                p7m0 p7m0Var5 = ocjVar.f25029a;
                while (true) {
                    Object value5 = p7m0Var5.getValue();
                    value5.getClass();
                    oyg0Var.getClass();
                    list = listE0;
                    if (p7m0Var5.m(value5, xmp.a((xmp) value5, null, null, null, null, null, false, false, list, false, null, false, 16127))) {
                        break;
                    } else {
                        listE0 = list;
                    }
                }
                bby bbyVar2 = this.W;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                if (m1eVar.c()) {
                    P(list, true, true);
                    return;
                }
                return;
            }
            boolean z6 = smpVar instanceof ylp;
            i1w0 i1w0Var = this.C;
            vd1 vd1Var = this.q;
            if (z6) {
                ylp ylpVar = (ylp) smpVar;
                npn npnVar = ylpVar.f42855a;
                long j3 = npnVar.f23922a;
                boolean z7 = ylpVar.b;
                long j4 = npnVar.c;
                String str3 = t9x.O(feedsChampsItemsScreenParams.b).f32224a;
                Long l = (Long) npnVar.d;
                long jLongValue = l != null ? l.longValue() : 0L;
                vd1Var.getClass();
                Object obj2 = z7 ? "on" : "off";
                kt2 kt2Var = vd1Var.f37210a;
                if (jLongValue == 0) {
                    kt2Var.a("bet_menu_filter_favor_call", xp20.f(new Pair("championship_id", Long.valueOf(j3)), new Pair("action", obj2), new Pair("sport_id", Long.valueOf(j4)), new Pair("option", str3)));
                } else {
                    kt2Var.a("bet_menu_filter_favor_call", xp20.f(new Pair("championship_id", Long.valueOf(j3)), new Pair("action", obj2), new Pair("sport_id", Long.valueOf(j4)), new Pair("option", str3), new Pair("sub_sport_id", Long.valueOf(jLongValue))));
                }
                int i = (int) j3;
                int i2 = (int) j4;
                int iLongValue = (int) (l != null ? l.longValue() : 0L);
                String str4 = t9x.O(feedsChampsItemsScreenParams.b).f32224a;
                ik4 ik4Var = this.I;
                ik4Var.getClass();
                String str5 = z7 != 0 ? "on" : "off";
                ik4Var.f14907a.a(iLongValue == 0 ? tx3.l0(new k1p[]{new i1p(i2, (byte) 2), new i1p(i, (byte) 0), new j1p(str5, (byte) 0), new j1p(str4, (byte) 1)}) : tx3.l0(new k1p[]{new i1p(i2, (byte) 2), new i1p(i, (byte) 0), new i1p(iLongValue, (byte) 1), new j1p(str5, (byte) 0), new j1p(str4, (byte) 1)}), 3162L);
                i1w0Var.d(new r91((Object) this, z7, (Object) npnVar, (byte) 14));
                return;
            }
            if (smpVar instanceof omp) {
                V(((omp) smpVar).f25514a);
                return;
            }
            if (smpVar instanceof nmp) {
                List<rbb> list4 = ((xmp) D()).f41139a.f16804a.f18576a;
                ArrayList arrayList3 = new ArrayList();
                for (rbb rbbVar2 : list4) {
                    List listC = kotlin.collections.a.c(Long.valueOf(rbbVar2.f30176a));
                    List list5 = rbbVar2.d;
                    ArrayList arrayList4 = new ArrayList(r3d.q(list5, 10));
                    Iterator it3 = list5.iterator();
                    while (it3.hasNext()) {
                        arrayList4.add(Long.valueOf(((sum0) it3.next()).f32829a));
                    }
                    w3d.u(arrayList3, CollectionsKt.q0(listC, arrayList4));
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : arrayList3) {
                    if (((xmp) D()).e.b.contains(Long.valueOf(((Number) obj3).longValue()))) {
                        arrayList5.add(obj3);
                    }
                }
                ArrayList arrayList6 = new ArrayList(r3d.q(arrayList5, 10));
                Iterator it4 = arrayList5.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(Long.valueOf(((Number) it4.next()).longValue()));
                }
                S(true);
                if (arrayList6.size() <= 1) {
                    Long l2 = (Long) CollectionsKt.firstOrNull(arrayList6);
                    if (l2 != null) {
                        U(l2.longValue());
                        return;
                    }
                    return;
                }
                List list6 = ((xmp) D()).f41139a.f16804a.f18576a;
                ArrayList<rbb> arrayList7 = new ArrayList();
                for (Object obj4 : list6) {
                    if (((xmp) D()).e.b.contains(Long.valueOf(((rbb) obj4).f30176a))) {
                        arrayList7.add(obj4);
                    }
                }
                for (rbb rbbVar3 : arrayList7) {
                    R(rbbVar3.f30176a, rbbVar3.n, rbbVar3.j, rbbVar3.m);
                }
                i1w0Var.d(new as0((Object) this, (Object) "", (Object) CollectionsKt.P0(arrayList6), -1L, (byte) 5));
                return;
            }
            if (!(smpVar instanceof cmp)) {
                if (smpVar instanceof rmp) {
                    rmp rmpVar = (rmp) smpVar;
                    long j5 = rmpVar.f30753a;
                    long j6 = rmpVar.b;
                    aj00 aj00Var = rmpVar.c;
                    String str6 = rmpVar.d;
                    if (j5 != -2) {
                        U(j5);
                        return;
                    }
                    vd1Var.f37210a.a("bet_champ_type_call", xp20.f(new Pair("sport_id", Long.valueOf(j6)), new Pair("tab_id", Integer.valueOf(aj00Var.getId()))));
                    zr1Var.f44833a.a(tx3.l0(new k1p[]{new i1p((int) j6, (byte) 2), new i1p(aj00Var.getId(), (byte) 0)}), 3165L);
                    i1w0Var.d(new as0((i3t0) this, j6, (Serializable) aj00Var, str6, (byte) 4));
                    return;
                }
                if (smpVar instanceof bmp) {
                    U(((bmp) smpVar).f2846a);
                    return;
                }
                if (smpVar instanceof lmp) {
                    this.Q.f15023a.f13218a.b.f(Unit.f46060a);
                    return;
                }
                if (smpVar instanceof amp) {
                    E();
                    return;
                }
                if (smpVar instanceof gmp) {
                    i3t0.K(this, null, null, new ffd(this, (gmp) smpVar, null, b3), 3);
                    return;
                }
                yje yjeVar2 = null;
                if (smpVar instanceof fmp) {
                    ygs ygsVarO = O(((fmp) smpVar).f9795a);
                    if (ygsVarO == null) {
                        return;
                    }
                    this.v.c().d(new f5p(this, ygsVarO, (byte) 9));
                    return;
                }
                if (smpVar instanceof imp) {
                    imp impVar = (imp) smpVar;
                    ygs ygsVarO2 = O(impVar.f15037a);
                    if (ygsVarO2 == null) {
                        return;
                    }
                    i3t0.K(this, null, null, new xg0(this, ygsVarO2, impVar, yjeVar2, (byte) 10), 3);
                    return;
                }
                if (!(smpVar instanceof jmp)) {
                    if (smpVar instanceof dmp) {
                        i3t0.B(this, this.r, new vid[]{((dmp) smpVar).f6333a});
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                jmp jmpVar = (jmp) smpVar;
                ygs ygsVarO3 = O(jmpVar.f16776a);
                if (ygsVarO3 == null) {
                    return;
                }
                i3t0.K(this, null, null, new xg0(this, ygsVarO3, jmpVar, yjeVar2, (byte) 11), 3);
                return;
            }
            boolean z8 = false;
            S(false);
            lef0Var.j(false);
            p7m0 p7m0Var6 = ocjVar.f25029a;
            while (true) {
                Object value6 = p7m0Var6.getValue();
                value6.getClass();
                oyg0Var.getClass();
                boolean z9 = z8;
                if (p7m0Var6.m(value6, xmp.a((xmp) value6, null, null, null, null, null, false, false, null, z9, null, false, 15359))) {
                    return;
                } else {
                    z8 = z9;
                }
            }
        }
    }
}
