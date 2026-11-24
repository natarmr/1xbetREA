package a;

import android.gov.nist.core.Separators;
import android.javax.sip.message.Response;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.coupon.impl.coupon.presentation.models.CouponTypeUiModel;
import org.xplatform.coupon.impl.generate_coupon.presentation.screen.GenerateCouponsScreen;

/* JADX INFO: loaded from: classes.dex */
public final class r7f extends w46 {
    public final gqt A;
    public final bhu A0;
    public boolean A1;
    public final o4a B;
    public final ort B0;
    public boolean B1;
    public final jtt C;
    public final onv C0;
    public w4f C1;
    public final ert D;
    public final v88 D0;
    public Boolean D1;
    public final hst E;
    public final qv2 E0;
    public bby E1;
    public final u8u F;
    public final eke0 F0;
    public bby F1;
    public final z220 G;
    public final std G0;
    public bby G1;
    public final ppt H;
    public final y3j0 H0;
    public c4m0 H1;
    public final lhf0 I;
    public final qu I0;
    public c4m0 I1;
    public final jtj J;
    public final ag3 J0;
    public c4m0 J1;
    public final qv2 K;
    public final x20 K0;
    public c4m0 K1;
    public final s7u L;
    public final x20 L0;
    public c4m0 L1;
    public final wdu M;
    public final s31 M0;
    public bby M1;
    public final pv00 N;
    public final ih5 N0;
    public bby N1;
    public final lri O;
    public final s64 O0;
    public bby O1;
    public final gbi P;
    public final cmt P0;
    public bby P1;
    public final khf0 Q;
    public final l7k Q0;
    public bby Q1;
    public final xzp R;
    public final cyu R0;
    public bby R1;
    public final chf0 S;
    public final poq0 S0;
    public bby S1;
    public final ywq0 T;
    public final ctf0 T0;
    public final boolean T1;
    public final daf U;
    public final duj U0;
    public final boolean U1;
    public final tzi V;
    public final i1w0 V0;
    public final boolean V1;
    public final wsu W;
    public final String W0;
    public final p7m0 W1;
    public final ni9 X;
    public final boolean X0;
    public final p7m0 X1;
    public final h9c Y;
    public final mne Y0;
    public final p7m0 Y1;
    public final mii0 Z;
    public final m1e Z0;
    public final p7m0 Z1;
    public final gxu a0;
    public final u0u a1;
    public final p7m0 a2;
    public final hsj b;
    public final ni9 b0;
    public final qru b1;
    public final ol60 b2;
    public final j9c c;
    public final mpc c0;
    public final xzp c1;
    public final p7m0 c2;
    public final j9c d;
    public final j9c d0;
    public final yiu d1;
    public final ol60 d2;
    public final znt e;
    public final ymv e0;
    public final mpc e1;
    public final ol60 e2;
    public final h9c f;
    public final nmo f0;
    public final rq f1;
    public final mpc g;
    public final k52 g0;
    public final mpc g1;
    public final fqc h;
    public final j9c h0;
    public final jtt h1;
    public final j9c i;
    public final ppt i0;
    public final rpt i1;
    public final mpc j;
    public final r9u j0;
    public final f4u j1;
    public final xzt k;
    public final vyt k0;
    public final bhu k1;
    public final p4u l;
    public final s4v l0;
    public final o4a l1;
    public final wrc m;
    public final wsc m0;
    public final tqc m1;
    public final wrc n;
    public final fuj0 n0;
    public final ocl n1;
    public final ert o;
    public final czu o0;
    public final xre o1;
    public final gs p;
    public final wdu p0;
    public final bhu p1;
    public final k52 q;
    public final lhf0 q0;
    public final h3c q1;
    public final ert r;
    public final j9c r0;
    public final dmt r1;
    public final jtt s;
    public final ert s0;
    public final phf0 s1;
    public final pmi t;
    public final ni9 t0;
    public final mii0 t1;
    public final ipc u;
    public final rqt u0;
    public final n0o0 u1;
    public final vit0 v;
    public final b8u v0;
    public final n0o0 v1;
    public final ert w;
    public final khf0 w0;
    public boolean w1;
    public final x4u x;
    public final ot x0;
    public boolean x1;
    public final eyg0 y;
    public final k52 y0;
    public boolean y1;
    public final ni9 z;
    public final m0u z0;
    public boolean z1;

    public r7f(hsj hsjVar, j9c j9cVar, j9c j9cVar2, znt zntVar, h9c h9cVar, mpc mpcVar, fqc fqcVar, j9c j9cVar3, mpc mpcVar2, xzt xztVar, p4u p4uVar, wrc wrcVar, wrc wrcVar2, ert ertVar, gs gsVar, k52 k52Var, ert ertVar2, jtt jttVar, pmi pmiVar, ipc ipcVar, vit0 vit0Var, ert ertVar3, x4u x4uVar, eyg0 eyg0Var, ni9 ni9Var, gqt gqtVar, o4a o4aVar, jtt jttVar2, ert ertVar4, hst hstVar, u8u u8uVar, z220 z220Var, ppt pptVar, lhf0 lhf0Var, jtj jtjVar, qv2 qv2Var, s7u s7uVar, wdu wduVar, pv00 pv00Var, lri lriVar, gbi gbiVar, khf0 khf0Var, xzp xzpVar, chf0 chf0Var, ywq0 ywq0Var, daf dafVar, tzi tziVar, wsu wsuVar, ni9 ni9Var2, h9c h9cVar2, mii0 mii0Var, gxu gxuVar, ni9 ni9Var3, mpc mpcVar3, j9c j9cVar4, ymv ymvVar, nmo nmoVar, k52 k52Var2, j9c j9cVar5, ppt pptVar2, r9u r9uVar, vyt vytVar, s4v s4vVar, wsc wscVar, fuj0 fuj0Var, czu czuVar, wdu wduVar2, lhf0 lhf0Var2, j9c j9cVar6, ert ertVar5, ni9 ni9Var4, rqt rqtVar, b8u b8uVar, khf0 khf0Var2, ot otVar, k52 k52Var3, m0u m0uVar, bhu bhuVar, ort ortVar, onv onvVar, v88 v88Var, qv2 qv2Var2, eke0 eke0Var, std stdVar, y3j0 y3j0Var, qu quVar, ag3 ag3Var, x20 x20Var, x20 x20Var2, s31 s31Var, ih5 ih5Var, s64 s64Var, cmt cmtVar, l7k l7kVar, cyu cyuVar, poq0 poq0Var, uf3 uf3Var, ctf0 ctf0Var, duj dujVar, i1w0 i1w0Var, ouu ouuVar, String str, boolean z, mne mneVar, m1e m1eVar, u0u u0uVar, qru qruVar, xzp xzpVar2, yiu yiuVar, mpc mpcVar4, rq rqVar, mpc mpcVar5, jtt jttVar3, rpt rptVar, f4u f4uVar, bhu bhuVar2, o4a o4aVar2, tqc tqcVar, ocl oclVar, xre xreVar, bhu bhuVar3, h3c h3cVar, dmt dmtVar, phf0 phf0Var, mii0 mii0Var2, pru pruVar, lk5 lk5Var) {
        int i;
        r9uVar.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        this.b = hsjVar;
        this.c = j9cVar;
        this.d = j9cVar2;
        this.e = zntVar;
        this.f = h9cVar;
        this.g = mpcVar;
        this.h = fqcVar;
        this.i = j9cVar3;
        this.j = mpcVar2;
        this.k = xztVar;
        this.l = p4uVar;
        this.m = wrcVar;
        this.n = wrcVar2;
        this.o = ertVar;
        this.p = gsVar;
        this.q = k52Var;
        this.r = ertVar2;
        this.s = jttVar;
        this.t = pmiVar;
        this.u = ipcVar;
        this.v = vit0Var;
        this.w = ertVar3;
        this.x = x4uVar;
        this.y = eyg0Var;
        this.z = ni9Var;
        this.A = gqtVar;
        this.B = o4aVar;
        this.C = jttVar2;
        this.D = ertVar4;
        this.E = hstVar;
        this.F = u8uVar;
        this.G = z220Var;
        this.H = pptVar;
        this.I = lhf0Var;
        this.J = jtjVar;
        this.K = qv2Var;
        this.L = s7uVar;
        this.M = wduVar;
        this.N = pv00Var;
        this.O = lriVar;
        this.P = gbiVar;
        this.Q = khf0Var;
        this.R = xzpVar;
        this.S = chf0Var;
        this.T = ywq0Var;
        this.U = dafVar;
        this.V = tziVar;
        this.W = wsuVar;
        this.X = ni9Var2;
        this.Y = h9cVar2;
        this.Z = mii0Var;
        this.a0 = gxuVar;
        this.b0 = ni9Var3;
        this.c0 = mpcVar3;
        this.d0 = j9cVar4;
        this.e0 = ymvVar;
        this.f0 = nmoVar;
        this.g0 = k52Var2;
        this.h0 = j9cVar5;
        this.i0 = pptVar2;
        this.j0 = r9uVar;
        this.k0 = vytVar;
        this.l0 = s4vVar;
        this.m0 = wscVar;
        this.n0 = fuj0Var;
        this.o0 = czuVar;
        this.p0 = wduVar2;
        this.q0 = lhf0Var2;
        this.r0 = j9cVar6;
        this.s0 = ertVar5;
        this.t0 = ni9Var4;
        this.u0 = rqtVar;
        this.v0 = b8uVar;
        this.w0 = khf0Var2;
        this.x0 = otVar;
        this.y0 = k52Var3;
        this.z0 = m0uVar;
        this.A0 = bhuVar;
        this.B0 = ortVar;
        this.C0 = onvVar;
        this.D0 = v88Var;
        this.E0 = qv2Var2;
        this.F0 = eke0Var;
        this.G0 = stdVar;
        this.H0 = y3j0Var;
        this.I0 = quVar;
        this.J0 = ag3Var;
        this.K0 = x20Var;
        this.L0 = x20Var2;
        this.M0 = s31Var;
        this.N0 = ih5Var;
        this.O0 = s64Var;
        this.P0 = cmtVar;
        this.Q0 = l7kVar;
        this.R0 = cyuVar;
        this.S0 = poq0Var;
        this.T0 = ctf0Var;
        this.U0 = dujVar;
        this.V0 = i1w0Var;
        this.W0 = str;
        this.X0 = z;
        this.Y0 = mneVar;
        this.Z0 = m1eVar;
        this.a1 = u0uVar;
        this.b1 = qruVar;
        this.c1 = xzpVar2;
        this.d1 = yiuVar;
        this.e1 = mpcVar4;
        this.f1 = rqVar;
        this.g1 = mpcVar5;
        this.h1 = jttVar3;
        this.i1 = rptVar;
        this.j1 = f4uVar;
        this.k1 = bhuVar2;
        this.l1 = o4aVar2;
        this.m1 = tqcVar;
        this.n1 = oclVar;
        this.o1 = xreVar;
        this.p1 = bhuVar3;
        this.q1 = h3cVar;
        this.r1 = dmtVar;
        this.s1 = phf0Var;
        this.t1 = mii0Var2;
        this.u1 = maz.b(new hc0(pruVar, (byte) 17));
        byte b = 1;
        this.v1 = maz.b(new s4f(this, b));
        this.w1 = true;
        this.y1 = true;
        this.z1 = true;
        this.B1 = true;
        this.C1 = w4f.f38539a;
        j820 j820Var = j820.b;
        this.T1 = lk5Var.c(j820Var) == ua20.MEDIUM_NO_GAME_INFO;
        boolean z2 = lk5Var.c(j820Var) == ua20.LITE_NO_TABS;
        this.U1 = z2;
        boolean z3 = lk5Var.c(j820Var) == ua20.FULLSCREEN_SLIDER;
        this.V1 = z3;
        int iOrdinal = N().i.ordinal();
        byte b2 = 2;
        int i2 = R.layout.coupon_card_skeleton_item;
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                i2 = R.layout.coupon_card_compact_skeleton_item;
            } else if (iOrdinal == 2) {
                i2 = R.layout.coupon_card_champ_name_skeleton_item;
            }
        }
        this.W1 = q7m0.a(new n9h0(false, i2, false, false, "", 0, false, false, false, false, false));
        this.X1 = q7m0.a(new pwq0(z2, z2 || z3, !z2, gqtVar.f11749a.a(), "", iun.f15405a, false, false, false, false, 0, null, false));
        int iOrdinal2 = dmtVar.b().ordinal();
        byte b3 = 4;
        yje yjeVar = null;
        if (iOrdinal2 == 0) {
            i = R.style.Widget_DSAccountSelection_Primary;
        } else if (iOrdinal2 == 1) {
            i = R.style.Widget_DSAccountSelection_Secondary;
        } else if (iOrdinal2 == 2) {
            i = R.style.Widget_DSAccountSelection_Tertiary;
        } else if (iOrdinal2 == 3) {
            i = R.style.Widget_DSAccountSelection_Quaternary;
        } else {
            if (iOrdinal2 != 4) {
                t9f.b();
                throw null;
            }
            i = R.style.Widget_DSAccountSelection_Fivefold;
        }
        this.Y1 = q7m0.a(new hn5(i, "", "", "", false));
        this.Z1 = q7m0.a(aje.f970a);
        this.a2 = q7m0.a(new et7(true, lwf.l));
        this.b2 = new ol60(3);
        this.c2 = q7m0.a(Boolean.FALSE);
        this.d2 = new ol60(3);
        this.e2 = new ol60(3);
        sac.V(jiu0.a(this), new z6e(1, this, r7f.class, "showLoginOrIgnore", "showLoginOrIgnore(Ljava/lang/Throwable;)V", 0, (byte) 27), null, mneVar.b, new d5f(this, yjeVar, b2), 10);
        sac.T(new fnq(new va(((qe50) ouuVar.b).b, (byte) 11), new a6f(this, yjeVar, b), b3), d5c.S(jiu0.a(this), mneVar.f22085a), e6f.h);
        sac.T(new c00(ortVar.a(), this, (byte) 29), d5c.S(jiu0.a(this), mneVar.b), foe.h);
    }

    public static f0f G(q4f q4fVar) {
        int iOrdinal = q4fVar.ordinal();
        if (iOrdinal != 5 && iOrdinal != 6) {
            if (iOrdinal == 10) {
                return f0f.c;
            }
            if (iOrdinal != 11) {
                return f0f.f8714a;
            }
        }
        return f0f.b;
    }

    public final void A(long j) {
        p7m0 p7m0Var;
        Object value;
        p7m0 p7m0Var2;
        Object value2;
        if (j != 0) {
            e0();
        }
        do {
            p7m0Var = this.X1;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, pwq0.a((pwq0) value, false, P(q4f.b), iun.f15405a, false, false, false, false, 0, K(), false, 4111)));
        do {
            p7m0Var2 = this.W1;
            value2 = p7m0Var2.getValue();
        } while (!p7m0Var2.m(value2, n9h0.a((n9h0) value2, false, false, j == 0, M(((xre) this.x.f40284a).f41366a.d), L(), ((n9h0) p7m0Var2.getValue()).g, false, false, false, false, 1923)));
        r0();
        this.b2.f(new p720(this.T1));
    }

    public final void B() {
        if (this.B1) {
            y(new t4f(this, (byte) 1));
            return;
        }
        bhu bhuVar = this.k1;
        if (bhuVar.a() <= 0 || !this.z.c() || this.A1) {
            A(bhuVar.a());
        }
    }

    public final et7 C() {
        List list;
        if (!((n9h0) this.W1.getValue()).c) {
            return (et7) this.a2.getValue();
        }
        Object value = this.Z1.getValue();
        eje ejeVar = value instanceof eje ? (eje) value : null;
        if (ejeVar != null && (list = ejeVar.f7904a) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (obj instanceof dt7) {
                    arrayList.add(obj);
                }
            }
            dt7 dt7Var = (dt7) CollectionsKt.firstOrNull(arrayList);
            if (dt7Var != null) {
                return dt7Var.f6647a;
            }
        }
        return null;
    }

    public final List D() {
        Object next;
        iun iunVar;
        ArrayList arrayList = ((ave) this.X.f23572a.c).n;
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((l820) next).b != i2o.NeedToConfirmEula);
        return (((l820) next) == null || (iunVar = iun.f15405a) == null) ? arrayList : iunVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Serializable E(q4f q4fVar, List list, List list2, List list3, List list4, boolean z, zje zjeVar) {
        q5f q5fVar;
        boolean z2;
        Object objQ;
        fb9 fb9Var;
        Object next;
        char c;
        r7f r7fVar = this;
        if (zjeVar instanceof q5f) {
            q5fVar = (q5f) zjeVar;
            int i = q5fVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                q5fVar.l = i - Integer.MIN_VALUE;
            } else {
                q5fVar = new q5f(r7fVar, zjeVar);
            }
        } else {
            q5fVar = new q5f(r7fVar, zjeVar);
        }
        q5f q5fVar2 = q5fVar;
        Object obj = q5fVar2.j;
        wne wneVar = wne.f39444a;
        int i2 = q5fVar2.l;
        char c2 = 1;
        uoy uoyVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            ql5 ql5Var = r7fVar.W.f39709a.f41366a.c;
            if (ql5Var != null) {
                String str = ql5Var.f;
            }
            boolean z3 = ((n9h0) r7fVar.W1.getValue()).g;
            List listD = r7fVar.D();
            LinkedHashMap linkedHashMapO = O(q4fVar);
            z2 = z;
            q5fVar2.i = z2;
            q5fVar2.l = 1;
            objQ = r7fVar.V.q(list, list2, list3, list4, q4fVar, z3, listD, linkedHashMapO, q5fVar2);
            if (objQ == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z4 = q5fVar2.i;
            z1x.P(obj);
            objQ = obj;
            z2 = z4;
        }
        Iterable iterable = (Iterable) objQ;
        int i3 = 10;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            tue tueVar = (tue) it.next();
            ate ateVar = r7fVar.N().j;
            tueVar.getClass();
            ArrayList arrayList2 = tueVar.d;
            ctf0 ctf0Var = r7fVar.T0;
            ctf0Var.getClass();
            p0g0 p0g0Var = tueVar.f34546a;
            vb9 vb9Var = tueVar.c;
            wue wueVar = (wue) CollectionsKt.firstOrNull(arrayList2);
            char c3 = ((wueVar != null ? wueVar.f39789a.w : uoyVar) != uoy.LIVE || wueVar.b.s) ? (char) 0 : c2;
            ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, i3));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                wue wueVar2 = (wue) it2.next();
                List<rb9> list5 = vb9Var.c;
                ArrayList arrayList4 = new ArrayList();
                for (rb9 rb9Var : list5) {
                    boolean z5 = z2;
                    List list6 = rb9Var.c;
                    Iterator it3 = it;
                    Iterator it4 = it2;
                    char c4 = c3;
                    ArrayList arrayList5 = new ArrayList(r3d.q(list6, 10));
                    Iterator it5 = list6.iterator();
                    while (it5.hasNext()) {
                        arrayList5.add(new Pair(Long.valueOf(rb9Var.f30173a), (gb9) it5.next()));
                        ctf0Var = ctf0Var;
                    }
                    w3d.u(arrayList4, arrayList5);
                    it2 = it4;
                    c3 = c4;
                    z2 = z5;
                    it = it3;
                }
                boolean z6 = z2;
                Iterator it6 = it;
                Iterator it7 = it2;
                ctf0 ctf0Var2 = ctf0Var;
                char c5 = c3;
                Iterator it8 = arrayList4.iterator();
                while (true) {
                    if (!it8.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it8.next();
                    Pair pair = (Pair) next;
                    long jLongValue = ((Number) pair.f46059a).longValue();
                    gb9 gb9Var = (gb9) pair.b;
                    m97 m97Var = wueVar2.b;
                    if (jLongValue == m97Var.f21398a && gb9Var.f11006a == m97Var.h && gb9Var.b == m97Var.k && gb9Var.d == m97Var.f) {
                        break;
                    }
                }
                Pair pair2 = (Pair) next;
                gb9 gb9Var2 = pair2 != null ? (gb9) pair2.b : null;
                rc9 rc9Var = new rc9(vdb.f0(wueVar2.f39789a.u, ctf0Var2));
                if (gb9Var2 != null) {
                    c = 1;
                    qc9 qc9Var = gb9Var2.f ? new qc9() : null;
                    sc9[] sc9VarArr = new sc9[2];
                    sc9VarArr[0] = rc9Var;
                    sc9VarArr[c] = qc9Var;
                    i4 i4VarR0 = dyb.r0(tx3.z(sc9VarArr));
                    qu6 qu6Var = wueVar2.f39789a;
                    arrayList3.add(new kc9(qu6Var.f29333a, i4VarR0, vdb.d0(qu6Var.p, qu6Var.v), ((gb9Var2 == null && gb9Var2.f == c) || vb9Var.d) ? 0 : c));
                    c3 = c5;
                    ctf0Var = ctf0Var2;
                    c2 = c;
                    z2 = z6;
                    it = it6;
                    it2 = it7;
                } else {
                    c = 1;
                }
                sc9[] sc9VarArr2 = new sc9[2];
                sc9VarArr2[0] = rc9Var;
                sc9VarArr2[c] = qc9Var;
                i4 i4VarR1 = dyb.r0(tx3.z(sc9VarArr2));
                qu6 qu6Var2 = wueVar2.f39789a;
                arrayList3.add(new kc9(qu6Var2.f29333a, i4VarR1, vdb.d0(qu6Var2.p, qu6Var2.v), ((gb9Var2 == null && gb9Var2.f == c) || vb9Var.d) ? 0 : c));
                c3 = c5;
                ctf0Var = ctf0Var2;
                c2 = c;
                z2 = z6;
                it = it6;
                it2 = it7;
            }
            boolean z7 = z2;
            Iterator it9 = it;
            ctf0 ctf0Var3 = ctf0Var;
            boolean z8 = c3;
            char c6 = c2;
            qu6 qu6VarO = wueVar != null ? wueVar.f39789a : j120.O();
            String strL = qu6VarO.n;
            if (strL.length() == 0) {
                String str2 = qu6VarO.j;
                String str3 = str2.length() > 0 ? " - " : null;
                if (str3 == null) {
                    str3 = "";
                }
                strL = kng0.l(str2, str3, qu6VarO.m);
            }
            String str4 = strL;
            String str5 = p0g0Var.b;
            double d = p0g0Var.f26149a;
            String str6 = tueVar.b.b;
            try {
                char c7 = str6.length() == 0 ? c6 : (char) 0;
                double d2 = Double.parseDouble(sj3.j0(str6, "0"));
                fb9Var = (d <= d2 || c7 != 0 || z7) ? (d >= d2 || c7 != 0 || z7) ? fb9.f9246a : fb9.c : fb9.b;
            } catch (Exception unused) {
                fb9Var = fb9.f9246a;
            }
            eb9 eb9Var = new eb9(str5, fb9Var);
            long j = vb9Var.f37130a;
            String strY = vdb.Y("", "", wueVar != null ? wueVar.f39789a.u : new tv6("", "", "", "", 0L), ctf0Var3, xte.COEF_WITH_BIG_ACCENT_TEAM, z8);
            String strA = ctf0Var3.b.a(R.string.coefficient_with_colon, Arrays.copyOf(new Object[0], 0));
            if (p0g0Var.b.length() <= 0) {
                strA = null;
            }
            arrayList.add(new mm6(new pc9(j, str4, strY, strA == null ? "" : strA, eb9Var, dyb.r0(arrayList3)), vbc.e0(ateVar.f1428a)));
            r7fVar = this;
            c2 = c6;
            z2 = z7;
            it = it9;
            i3 = 10;
            uoyVar = null;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Serializable F(q4f q4fVar, List list, List list2, List list3, List list4, List list5, boolean z, zje zjeVar) {
        r5f r5fVar;
        boolean z2;
        Object obj;
        q4f q4fVar2;
        String str;
        int i;
        String strA;
        String strX0;
        boolean z3;
        String strA2;
        r7f r7fVar = this;
        if (zjeVar instanceof r5f) {
            r5fVar = (r5f) zjeVar;
            int i2 = r5fVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r5fVar.m = i2 - Integer.MIN_VALUE;
            } else {
                r5fVar = new r5f(r7fVar, zjeVar);
            }
        } else {
            r5fVar = new r5f(r7fVar, zjeVar);
        }
        r5f r5fVar2 = r5fVar;
        Object obj2 = r5fVar2.k;
        wne wneVar = wne.f39444a;
        int i3 = r5fVar2.m;
        p7m0 p7m0Var = r7fVar.W1;
        if (i3 == 0) {
            z1x.P(obj2);
            ql5 ql5Var = r7fVar.W.f39709a.f41366a.c;
            String str2 = (ql5Var == null || (str = ql5Var.f) == null) ? "" : str;
            boolean z4 = ((n9h0) p7m0Var.getValue()).g;
            List listD = r7fVar.D();
            LinkedHashMap linkedHashMapO = O(q4fVar);
            r5fVar2.i = q4fVar;
            r5fVar2.j = z;
            r5fVar2.m = 1;
            Object objH = r7fVar.U.H(list, list2, list3, list4, list5, q4fVar, str2, z4, listD, linkedHashMapO, r5fVar2);
            if (objH == wneVar) {
                return wneVar;
            }
            z2 = z;
            obj = objH;
            q4fVar2 = q4fVar;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = r5fVar2.j;
            q4fVar2 = r5fVar2.i;
            z1x.P(obj2);
            obj = obj2;
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            uue uueVar = (uue) it.next();
            double d = ((ave) r7fVar.o.f8297a.c).e;
            boolean z5 = ((n9h0) p7m0Var.getValue()).g;
            xte xteVar = r7fVar.N().i;
            ate ateVar = r7fVar.N().j;
            ygp ygpVar = ygp.t;
            r9u r9uVar = r7fVar.j0;
            r9uVar.getClass();
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            boolean zD = j1q0Var.f15748a.d(ygpVar);
            uueVar.getClass();
            q4fVar2.getClass();
            ctf0 ctf0Var = r7fVar.T0;
            ctf0Var.getClass();
            boolean z6 = uueVar.i;
            boolean z7 = z2;
            double d2 = uueVar.c;
            int i4 = z6 ? R.string.multisingle_block_title_v2 : R.string.block_v2;
            if (uueVar.e) {
                if (d2 > 0.0d) {
                    pn40 pn40Var = pn40.f27267a;
                    strA = pn40.d(d2, uueVar.f, p3u0.c);
                    i = 0;
                } else {
                    i = 0;
                    strA = ctf0Var.b.a(R.string.enter_amount, Arrays.copyOf(new Object[0], 0));
                }
                strX0 = !uueVar.j ? "" : b34.x0(uueVar.d, ctf0Var);
            } else {
                d2 = d2;
                it = it;
                i = 0;
                strA = ctf0Var.b.a(R.string.enter_amount, Arrays.copyOf(new Object[0], 0));
                strX0 = "";
            }
            String str3 = strA;
            boolean z8 = uueVar.g;
            int i5 = uueVar.b;
            if (z8) {
                strA2 = ctf0Var.b.a(R.string.lobby_, Arrays.copyOf(new Object[i], i));
                z3 = true;
            } else {
                z3 = true;
                strA2 = String.format(ctf0Var.b.a(i4, Arrays.copyOf(new Object[i], i)), Arrays.copyOf(new Object[]{String.valueOf(i5)}, 1));
            }
            String str4 = strA2;
            List list6 = uueVar.k;
            ArrayList arrayList2 = new ArrayList(r3d.q(list6, 10));
            Iterator it2 = list6.iterator();
            while (it2.hasNext()) {
                xte xteVar2 = xteVar;
                ate ateVar2 = ateVar;
                boolean z9 = zD;
                ctf0 ctf0Var2 = ctf0Var;
                arrayList2.add(vdb.n0((wue) it2.next(), z7, true, xteVar2, ateVar2, z9, ctf0Var2));
                xteVar = xteVar2;
                ateVar = ateVar2;
                zD = z9;
                ctf0Var = ctf0Var2;
            }
            boolean z10 = uueVar.h;
            boolean z11 = (z10 && z5) ? z3 : false;
            int i6 = uueVar.f36295a;
            int i7 = (d2 <= 0.0d || !z5) ? R.drawable.glyph_plus_rounded_square : R.drawable.ic_glyph_edit;
            boolean zIsEmpty = arrayList2.isEmpty();
            List listC = arrayList2;
            if (zIsEmpty) {
                listC = kotlin.collections.a.c(fwe.f10254a);
            }
            List list7 = listC;
            list7.getClass();
            arrayList.add(new ra8(i6, str4, i7, str3, z10, z11, (z11 && ((q4fVar2 == q4f.h && uueVar.f36295a == 0 && d <= 0.0d) || (q4fVar2 == q4f.m && d <= 0.0d))) ? z3 : false, strX0, list7));
            r7fVar = this;
            z2 = z7;
            it = it;
        }
        return arrayList;
    }

    /* JADX WARN: Failed to calculate best type for var: r13v13 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v13 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v9 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r13v9 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v9 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v4 ??, new type: a.lsm0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r14v4 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r14v4 ??, new type: a.lsm0
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r36v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r36v0 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r36v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r36v1 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r36v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r36v2 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r38v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r38v0 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r38v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r38v1 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r38v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r38v2 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v6 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v6 ??, new type: java.lang.Integer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v7 ??, new type: java.lang.Integer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r8v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r8v8 ??, new type: java.lang.Integer
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r13v9 ??, new type: java.lang.CharSequence
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderAllow(TypeUpdate.java:66)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryWiderObjects(FixTypesVisitor.java:795)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:249)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final java.io.Serializable H(a.q4f r44, java.util.List r45, java.util.List r46, java.util.List r47, java.util.List r48, boolean r49, a.zje r50) {
        /*
            Method dump skipped, instruction units count: 718
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r7f.H(a.q4f, java.util.List, java.util.List, java.util.List, java.util.List, boolean, a.zje):java.io.Serializable");
    }

    public final ArrayList I() {
        ygp ygpVar = ygp.J1;
        r9u r9uVar = this.j0;
        r9uVar.getClass();
        j1q0 j1q0Var = r9uVar.f30104a;
        j1q0Var.getClass();
        return this.k.a(j1q0Var.f15748a.d(ygpVar));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r0 == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J(a.q4f r8, java.util.List r9, java.util.List r10, java.util.List r11, java.util.List r12, java.util.List r13, boolean r14, a.zje r15) {
        /*
            r7 = this;
            boolean r0 = r15 instanceof a.t5f
            if (r0 == 0) goto L14
            r0 = r15
            a.t5f r0 = (a.t5f) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.l = r1
        L12:
            r15 = r0
            goto L1a
        L14:
            a.t5f r0 = new a.t5f
            r0.<init>(r7, r15)
            goto L12
        L1a:
            java.lang.Object r0 = r15.j
            a.wne r1 = a.wne.f39444a
            int r2 = r15.l
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L44
            if (r2 == r6) goto L3e
            if (r2 == r5) goto L38
            if (r2 != r4) goto L32
            java.util.List r10 = r15.i
            a.z1x.P(r0)
            goto L67
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r3
        L38:
            java.util.List r10 = r15.i
            a.z1x.P(r0)
            goto L7b
        L3e:
            java.util.List r10 = r15.i
            a.z1x.P(r0)
            goto L90
        L44:
            a.z1x.P(r0)
            a.f0f r0 = G(r8)
            int r0 = r0.ordinal()
            if (r0 == 0) goto L7e
            if (r0 == r6) goto L6e
            if (r0 != r5) goto L6a
            r15.i = r10
            r15.l = r4
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            java.io.Serializable r0 = r7.E(r8, r9, r10, r11, r12, r13, r14)
            r10 = r9
            if (r0 != r1) goto L67
            goto L8e
        L67:
            java.util.List r0 = (java.util.List) r0
            goto L92
        L6a:
            a.t9f.b()
            return r3
        L6e:
            r15.i = r10
            r15.l = r5
            java.io.Serializable r0 = r7.F(r8, r9, r10, r11, r12, r13, r14, r15)
            r9 = r10
            if (r0 != r1) goto L7a
            goto L8e
        L7a:
            r10 = r9
        L7b:
            java.util.List r0 = (java.util.List) r0
            goto L92
        L7e:
            r9 = r10
            r10 = r11
            r11 = r12
            r12 = r13
            r13 = r14
            r14 = r15
            r14.i = r9
            r14.l = r6
            java.io.Serializable r0 = r7.H(r8, r9, r10, r11, r12, r13, r14)
            if (r0 != r1) goto L8f
        L8e:
            return r1
        L8f:
            r10 = r9
        L90:
            java.util.List r0 = (java.util.List) r0
        L92:
            boolean r8 = r7.U1
            if (r8 != 0) goto L9a
            boolean r7 = r7.V1
            if (r7 == 0) goto La7
        L9a:
            int r7 = r10.size()
            if (r7 <= r6) goto La7
            a.xpc r7 = a.xpc.f41262a
            java.util.ArrayList r7 = kotlin.collections.CollectionsKt.r0(r0, r7)
            return r7
        La7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r7f.J(a.q4f, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, boolean, a.zje):java.lang.Object");
    }

    public final hao0 K() {
        int i;
        q4f q4fVarA = this.i.a();
        if (!this.U1) {
            return null;
        }
        if (q4fVarA != q4f.e && q4fVarA != q4f.g) {
            return null;
        }
        en7 en7Var = ((lye) this.C.f17117a.f10647a).k;
        hao0 hao0Var = ((pwq0) this.X1.getValue()).l;
        boolean z = hao0Var != null ? hao0Var.b : false;
        en7Var.getClass();
        int i2 = en7Var.c;
        if (i2 == 0 || (i = en7Var.f8078a) == 0) {
            return null;
        }
        return new hao0(w6x.n(i2, i, Separators.SLASH), z);
    }

    public final int L() {
        boolean z = ((n9h0) this.W1.getValue()).g;
        ctf0 ctf0Var = this.T0;
        return z ? ctf0Var.d(R.dimen.space_24) : ctf0Var.d(R.dimen.space_8);
    }

    public final String M(String str) {
        boolean z = ((n9h0) this.W1.getValue()).g;
        ctf0 ctf0Var = this.T0;
        return z ? ua80.i(ctf0Var.f(R.string.your_balance, new Object[0]), " \u202d", str, "\u202c") : ctf0Var.f(R.string.refill_account, new Object[0]);
    }

    public final b3f N() {
        return (b3f) this.v1.getValue();
    }

    public final LinkedHashMap O(q4f q4fVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (g0f g0fVar : q4fVar == q4f.m ? ((m0f) this.t0.f23572a.b).f20951a : kotlin.collections.a.c(this.s0.a())) {
            Iterator it = g0fVar.q.iterator();
            while (it.hasNext()) {
                linkedHashMap.put(Integer.valueOf(((Number) it.next()).intValue()), g0fVar.p);
            }
        }
        return linkedHashMap;
    }

    public final String P(q4f q4fVar) {
        q4f q4fVar2 = q4f.b;
        ctf0 ctf0Var = this.T0;
        if (q4fVar == q4fVar2) {
            return ctf0Var.b.a(R.string.coupon, Arrays.copyOf(new Object[0], 0));
        }
        return ctf0Var.b.a(lgb.V(q4fVar), Arrays.copyOf(new Object[0], 0));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.List] */
    public final Object Q(ArrayList arrayList, List list, boolean z, zje zjeVar) {
        u5f u5fVar;
        ?? r9;
        if (zjeVar instanceof u5f) {
            u5fVar = (u5f) zjeVar;
            int i = u5fVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                u5fVar.n = i - Integer.MIN_VALUE;
            } else {
                u5fVar = new u5f(this, zjeVar);
            }
        } else {
            u5fVar = new u5f(this, zjeVar);
        }
        Object obj = u5fVar.l;
        wne wneVar = wne.f39444a;
        int i2 = u5fVar.n;
        if (i2 == 0) {
            ArrayList arrayListT = twn.t(obj);
            for (Object obj2 : arrayList) {
                if (((m97) obj2).s) {
                    arrayListT.add(obj2);
                }
            }
            ?? arrayList2 = new ArrayList();
            for (Object obj3 : list) {
                qu6 qu6Var = (qu6) obj3;
                if (!arrayListT.isEmpty()) {
                    Iterator it = arrayListT.iterator();
                    while (it.hasNext()) {
                        if (ozb.X((m97) it.next(), qu6Var)) {
                            arrayList2.add(obj3);
                            break;
                        }
                    }
                }
            }
            List listN0 = CollectionsKt.n0(list, CollectionsKt.P0(arrayList2));
            if (listN0 != null && listN0.isEmpty()) {
                arrayList2 = list;
                break;
            }
            Iterator it2 = listN0.iterator();
            do {
                if (!it2.hasNext()) {
                    arrayList2 = list;
                    break;
                }
            } while (((qu6) it2.next()).x == 707);
            ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                axq.t(((qu6) it3.next()).f29333a, arrayList3);
            }
            u5fVar.i = list;
            u5fVar.j = arrayList2;
            u5fVar.k = z;
            u5fVar.n = 1;
            r9 = arrayList2;
            if (this.p0.x(arrayList3, u5fVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = u5fVar.k;
            List list2 = u5fVar.j;
            list = u5fVar.i;
            z1x.P(obj);
            r9 = list2;
        }
        a0();
        if (r9.size() == list.size()) {
            this.d2.f(e3f.f7131a);
        }
        h0(z, true, new s4f(this, (byte) 5));
        return Unit.f46060a;
    }

    public final void R(c4f c4fVar) {
        sac.V(jiu0.a(this), w5f.f38581a, null, this.Y0.f22085a, new fob(this, c4fVar, null, (byte) 19), 10);
    }

    public final void S(String str) {
        str.getClass();
        sac.V(jiu0.a(this), new z6e(1, this, r7f.class, "showSnackBarError", "showSnackBarError(Ljava/lang/Throwable;)V", 0, (byte) 28), new s4f(this, (byte) 0), this.Y0.b, new fr9(this, str, null, (byte) 9), 8);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object T(rue rueVar, zje zjeVar) {
        y5f y5fVar;
        if (zjeVar instanceof y5f) {
            y5fVar = (y5f) zjeVar;
            int i = y5fVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                y5fVar.l = i - Integer.MIN_VALUE;
            } else {
                y5fVar = new y5f(this, zjeVar);
            }
        } else {
            y5fVar = new y5f(this, zjeVar);
        }
        Object objP = y5fVar.j;
        Object obj = wne.f39444a;
        int i2 = y5fVar.l;
        if (i2 == 0) {
            z1x.P(objP);
            y5fVar.i = rueVar;
            y5fVar.l = 1;
            objP = this.e.f44690a.p(y5fVar);
            if (objP == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rueVar = y5fVar.i;
            z1x.P(objP);
        }
        String strB0 = CollectionsKt.b0((Iterable) objP, Separators.COMMA, null, null, new vzd((byte) 23), 30);
        yre yreVarN0 = lgb.n0(this.i.a());
        String str = yreVarN0 != null ? yreVarN0.f43118a : null;
        String str2 = rueVar.f31123a;
        qu quVar = this.I0;
        quVar.getClass();
        jo20 jo20Var = new jo20();
        jo20Var.put("action", str2);
        jo20Var.put("option", strB0);
        if (str != null) {
            jo20Var.put("bet_type", str);
        }
        quVar.f29324a.a("coupon_clear_confirm", jo20Var.b());
        String str3 = rueVar.f31123a;
        x20 x20Var = this.K0;
        x20Var.getClass();
        s1p s1pVar = x20Var.f40143a;
        yni0 yni0Var = new yni0();
        yni0Var.add(new j1p(str3, (byte) 0));
        yni0Var.add(new j1p(strB0, (byte) 1));
        if (str != null) {
            yni0Var.add(new j1p(str, (byte) 2));
        }
        s1pVar.a(cui0.a(yni0Var), 12675L);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object U(p0f p0fVar, long j, zje zjeVar) {
        z5f z5fVar;
        Object g0g0Var;
        if (zjeVar instanceof z5f) {
            z5fVar = (z5f) zjeVar;
            int i = z5fVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                z5fVar.m = i - Integer.MIN_VALUE;
            } else {
                z5fVar = new z5f(this, zjeVar);
            }
        } else {
            z5fVar = new z5f(this, zjeVar);
        }
        Object objB = z5fVar.k;
        wne wneVar = wne.f39444a;
        int i2 = z5fVar.m;
        try {
            if (i2 == 0) {
                z1x.P(objB);
                e0g0 e0g0Var = j0g0.b;
                s7u s7uVar = this.L;
                z5fVar.i = p0fVar;
                z5fVar.j = this;
                z5fVar.m = 1;
                objB = s7uVar.f31768a.B(j, z5fVar);
                if (objB == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = z5fVar.j;
                p0fVar = z5fVar.i;
                z1x.P(objB);
            }
            long j2 = ((qu6) objB).x;
            yre yreVarN0 = lgb.n0(this.i.a());
            String str = yreVarN0 != null ? yreVarN0.f43118a : null;
            qu quVar = this.I0;
            String str2 = p0fVar.f26147a;
            quVar.getClass();
            jo20 jo20Var = new jo20();
            jo20Var.put("action", str2);
            jo20Var.put("option", Long.valueOf(j2));
            if (str != null) {
                jo20Var.put("bet_type", str);
            }
            quVar.f29324a.a("coupon_outcome_delete_confirm", jo20Var.b());
            x20 x20Var = this.K0;
            String str3 = p0fVar.f26147a;
            s1p s1pVar = x20Var.f40143a;
            yni0 yni0Var = new yni0();
            yni0Var.add(new i1p((byte) 2, j2));
            yni0Var.add(new j1p(str3, (byte) 0));
            if (str != null) {
                yni0Var.add(new j1p(str, (byte) 1));
            }
            s1pVar.a(cui0.a(yni0Var), 12677L);
            g0g0Var = Unit.f46060a;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA != null) {
            thA.printStackTrace();
        }
        return Unit.f46060a;
    }

    public final void V(boolean z) {
        sac.V(jiu0.a(this), new x6f(1, this, r7f.class, "handleSaveCouponError", "handleSaveCouponError(Ljava/lang/Throwable;)V", 0, (byte) 0), new s4f(this, (byte) 7), this.Y0.b, new y6f(this, z, null), 8);
    }

    public final void W() {
        v3c.N(this.G1);
        ert ertVar = this.w;
        ertVar.getClass();
        long jCurrentTimeMillis = 120000 - (System.currentTimeMillis() - ((ave) ertVar.f8297a.c).b);
        if (jCurrentTimeMillis < 0) {
            return;
        }
        this.G1 = sac.f0(jiu0.a(this), jCurrentTimeMillis, TimeUnit.MILLISECONDS, this.Y0.b, new x6f(1, this, r7f.class, "showSnackBarError", "showSnackBarError(Ljava/lang/Throwable;)V", 0, (byte) 1), new a6f(this, null, (byte) 4), 32);
    }

    public final void X() {
        this.w1 = true;
        bby bbyVar = this.F1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.F1 = sac.c0(jiu0.a(this), ibc.v0(8, bfn.SECONDS), this.Y0.b, new x6f(1, this, r7f.class, "showSnackBarError", "showSnackBarError(Ljava/lang/Throwable;)V", 0, (byte) 2), new a6f(this, null, (byte) 5));
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00f5, code lost:
    
        if (r2 == r3) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Y(a.q4f r17, java.util.List r18, a.zje r19) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r7f.Y(a.q4f, java.util.List, a.zje):java.lang.Object");
    }

    public final void Z() {
        q4f q4fVarA = this.i.a();
        sac.V(jiu0.a(this), a7f.f366a, null, this.Y0.b, new ex1((Object) this, (Object) q4fVarA, (yje) null, (byte) 24), 10);
    }

    public final void a0() {
        if (this.o0.a() && this.z1) {
            this.d2.f(new a4f(this.T0.f(R.string._ompleted_events_have_been_deleted_res_0x7f13185b, new Object[0]), "", pek0.f26859a));
            this.z1 = false;
        }
    }

    public final void b0() {
        i1w0 i1w0Var = this.V0;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        FragmentScreen generateCouponsScreen = new GenerateCouponsScreen(iun.f15405a);
        if (generateCouponsScreen instanceof DialogScreen) {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) generateCouponsScreen)));
        } else {
            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(generateCouponsScreen)));
        }
        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void c0() {
        if (((n9h0) this.W1.getValue()).f23139a) {
            return;
        }
        this.E1 = sac.f0(jiu0.a(this), 300L, TimeUnit.MILLISECONDS, this.Y0.b, new x6f(1, this, r7f.class, "showSnackBarError", "showSnackBarError(Ljava/lang/Throwable;)V", 0, (byte) 3), new a6f(this, null, (byte) 6), 32);
    }

    public final void d0(Throwable th) {
        if (!(th instanceof j7t0)) {
            return;
        }
        i1w0 i1w0Var = this.V0;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        c8d c8dVar = new c8d(y7d.f42146a, n0w0.f22721a);
        ListIterator listIterator = cs0.h(copyOnWriteArrayListQ, c8dVar, c8dVar, i1w0Var, copyOnWriteArrayListQ).listIterator(0);
        while (true) {
            paw pawVar = (paw) listIterator;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void e0() {
        xie xieVar = new xie(ocl.b(this.n1, pb10.g, null, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
        p7m0 p7m0Var = this.Z1;
        p7m0Var.getClass();
        p7m0Var.o(null, xieVar);
    }

    public final void f0(Throwable th) {
        this.U0.b(th, new u4f(this, (byte) 0));
    }

    public final void g0() {
        p7m0 p7m0Var;
        Object value;
        p7m0 p7m0Var2;
        Object value2;
        pwq0 pwq0Var;
        hao0 hao0Var;
        do {
            p7m0Var = this.W1;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, n9h0.a((n9h0) value, true, false, false, null, 0, false, false, false, false, false, 2046)));
        do {
            p7m0Var2 = this.X1;
            value2 = p7m0Var2.getValue();
            pwq0Var = (pwq0) value2;
            hao0Var = pwq0Var.l;
        } while (!p7m0Var2.m(value2, pwq0.a(pwq0Var, false, null, null, false, false, false, false, 0, hao0Var != null ? hao0.a(hao0Var, true) : null, false, 6143)));
        this.o1.a(kit0.f18353a);
    }

    public final void h0(boolean z, boolean z2, Function0 function0) {
        bby bbyVar = this.M1;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.M1 = sac.V(jiu0.a(this), new v4f(this, function0, (byte) 0), null, this.Y0.b, new e2c(this, z, z2, null), 10);
    }

    public final void i0(ql5 ql5Var) {
        p7m0 p7m0Var;
        Object value;
        pn40 pn40Var = pn40.f27267a;
        double d = ql5Var.b;
        String strF = ql5Var.j;
        String strC = pn40.c(d, p3u0.c);
        String str = ql5Var.f;
        if (this.r1.b() == kg.SECONDARY) {
            strF = this.T0.f(R.string.all_balances, new Object[0]);
        } else if (strF.length() <= 0) {
            strF = ql5Var.k;
        }
        String str2 = strF;
        do {
            p7m0Var = this.Y1;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, hn5.a((hn5) value, str2, strC, str, false, 24)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j0(ql5 ql5Var, zje zjeVar) {
        h7f h7fVar;
        if (zjeVar instanceof h7f) {
            h7fVar = (h7f) zjeVar;
            int i = h7fVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                h7fVar.k = i - Integer.MIN_VALUE;
            } else {
                h7fVar = new h7f(this, zjeVar);
            }
        } else {
            h7fVar = new h7f(this, zjeVar);
        }
        Object objC = h7fVar.i;
        wne wneVar = wne.f39444a;
        int i2 = h7fVar.k;
        if (i2 == 0) {
            z1x.P(objC);
            wrc wrcVar = this.m;
            wrcVar.getClass();
            ql5Var.getClass();
            ave aveVar = wrcVar.f39634a.f41366a;
            aveVar.getClass();
            aveVar.c = ql5Var;
            i0(ql5Var);
            long j = ql5Var.e;
            h7fVar.k = 1;
            objC = this.z0.f20973a.c(j, h7fVar);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        ((ave) this.A0.f2626a.c).f = ((xuf) objC).i;
        this.p.b();
        return Unit.f46060a;
    }

    public final void k0(List list, boolean z) {
        q4f q4fVarA = this.i.a();
        this.S1 = sac.V(jiu0.a(this), new t4f(this, (byte) 2), new s4f(this, (byte) 3), this.Y0.b, new i7f(this, q4fVarA, list, z, null), 8);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ad A[LOOP:0: B:35:0x00a7->B:37:0x00ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object l0(boolean z, boolean z2, zje zjeVar) {
        j7f j7fVar;
        boolean z3;
        boolean z4;
        mpc mpcVar;
        ArrayList arrayListB;
        ArrayList arrayList;
        Iterator it;
        if (zjeVar instanceof j7f) {
            j7fVar = (j7f) zjeVar;
            int i = j7fVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                j7fVar.n = i - Integer.MIN_VALUE;
            } else {
                j7fVar = new j7f(this, zjeVar);
            }
        } else {
            j7fVar = new j7f(this, zjeVar);
        }
        j7f j7fVar2 = j7fVar;
        Object obj = j7fVar2.l;
        wne wneVar = wne.f39444a;
        int i2 = j7fVar2.n;
        if (i2 == 0) {
            z1x.P(obj);
            n0o0 n0o0Var = this.u1;
            boolean z5 = ((sff0) n0o0Var.getValue()).J1;
            boolean z6 = this.d1.a() || ((sff0) n0o0Var.getValue()).O1;
            j7fVar2.i = z;
            j7fVar2.j = z2;
            j7fVar2.n = 1;
            if (this.c1.Q(z, z2, z5, z6, j7fVar2) != wneVar) {
                z3 = z;
                z4 = z2;
            }
            return wneVar;
        }
        if (i2 == 1) {
            z4 = j7fVar2.j;
            z3 = j7fVar2.i;
            z1x.P(obj);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mpcVar = j7fVar2.k;
            z1x.P(obj);
        }
        arrayListB = mpcVar.b((List) obj);
        if (arrayListB.isEmpty()) {
            o0(false, m2a.m);
        } else {
            arrayList = new ArrayList(r3d.q(arrayListB, 10));
            it = arrayListB.iterator();
            while (it.hasNext()) {
                arrayList.add(qjj.a0((tg7) it.next(), this.T0));
            }
            o0(false, new j3p(arrayList));
        }
        return Unit.f46060a;
        mpc mpcVar2 = this.e1;
        j7fVar2.k = mpcVar2;
        j7fVar2.i = z3;
        j7fVar2.j = z4;
        j7fVar2.n = 2;
        Serializable serializableP = this.e.f44690a.p(j7fVar2);
        if (serializableP != wneVar) {
            obj = serializableP;
            mpcVar = mpcVar2;
            arrayListB = mpcVar.b((List) obj);
            if (arrayListB.isEmpty()) {
                arrayList = new ArrayList(r3d.q(arrayListB, 10));
                it = arrayListB.iterator();
                while (it.hasNext()) {
                    arrayList.add(qjj.a0((tg7) it.next(), this.T0));
                }
                o0(false, new j3p(arrayList));
            } else {
                o0(false, m2a.m);
            }
            return Unit.f46060a;
        }
        return wneVar;
    }

    public final void m0() {
        if (N().g) {
            v3c.N(this.O1);
            this.O1 = sac.V(jiu0.a(this), new t4f(this, (byte) 8), null, this.Y0.b, new g5f(this, null, (byte) 1), 10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object n0(q4f q4fVar, List list, List list2, List list3, List list4, List list5, boolean z, zje zjeVar) {
        k7f k7fVar;
        q4f q4fVar2;
        List list6;
        List list7;
        List list8;
        List list9;
        List list10;
        boolean z2;
        boolean z3;
        if (zjeVar instanceof k7f) {
            k7fVar = (k7f) zjeVar;
            int i = k7fVar.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                k7fVar.r = i - Integer.MIN_VALUE;
            } else {
                k7fVar = new k7f(this, zjeVar);
            }
        } else {
            k7fVar = new k7f(this, zjeVar);
        }
        k7f k7fVar2 = k7fVar;
        Object obj = k7fVar2.p;
        Object obj2 = wne.f39444a;
        int i2 = k7fVar2.r;
        if (i2 == 0) {
            z1x.P(obj);
            k7fVar2.i = q4fVar;
            k7fVar2.j = list;
            k7fVar2.k = list2;
            k7fVar2.l = list3;
            k7fVar2.m = list4;
            k7fVar2.n = list5;
            k7fVar2.o = z;
            k7fVar2.r = 1;
            Object objJ = J(q4fVar, list, list2, list3, list4, list5, z, k7fVar2);
            if (objJ == obj2) {
                return obj2;
            }
            q4fVar2 = q4fVar;
            list6 = list;
            list7 = list2;
            list8 = list3;
            list9 = list4;
            list10 = list5;
            obj = objJ;
            z2 = z;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z4 = k7fVar2.o;
            List list11 = k7fVar2.n;
            List list12 = k7fVar2.m;
            list8 = k7fVar2.l;
            List list13 = k7fVar2.k;
            List list14 = k7fVar2.j;
            q4f q4fVar3 = k7fVar2.i;
            z1x.P(obj);
            z2 = z4;
            list7 = list13;
            list9 = list12;
            list6 = list14;
            list10 = list11;
            q4fVar2 = q4fVar3;
        }
        List list15 = (List) obj;
        boolean z5 = G(q4fVar2) == f0f.b;
        p7m0 p7m0Var = this.Z1;
        ije ijeVar = (ije) p7m0Var.getValue();
        if (ijeVar == null) {
            z3 = false;
        } else if (ijeVar instanceof eje) {
            if (z5) {
                List list16 = ((eje) ijeVar).f7904a;
                if (list16 == null || !list16.isEmpty()) {
                    Iterator it = list16.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((r4f) it.next()) instanceof ra8) {
                                if (((eje) ijeVar).f7904a.size() == list15.size()) {
                                    z3 = false;
                                }
                            }
                        }
                    }
                }
            } else {
                List list17 = ((eje) ijeVar).f7904a;
                if (list17 == null || !list17.isEmpty()) {
                    Iterator it2 = list17.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((r4f) it2.next()) instanceof ra8) {
                            }
                        } else if (((eje) ijeVar).f7904a.size() == list15.size()) {
                            z3 = false;
                        }
                    }
                } else if (((eje) ijeVar).f7904a.size() == list15.size()) {
                    z3 = false;
                }
            }
            z3 = true;
        } else if (ijeVar instanceof aje) {
            z3 = true;
        } else {
            z3 = false;
        }
        eje ejeVar = new eje(list15, q4fVar2 == q4f.f, z3, z5);
        p7m0Var.getClass();
        p7m0Var.o(null, ejeVar);
        bby bbyVar = this.R1;
        if (bbyVar != null) {
            v3c.N(bbyVar);
        }
        this.R1 = sac.f0(jiu0.a(this), 4000L, TimeUnit.MILLISECONDS, this.Y0.b, new t4f(this, (byte) 5), new v5f(this, list7, q4fVar2, list6, list8, list9, list10, z2, z3, z5, null), 32);
        return Unit.f46060a;
    }

    public final void o0(boolean z, k3p k3pVar) {
        bby bbyVar;
        ArrayList arrayList;
        p7m0 p7m0Var = this.a2;
        et7 et7Var = (et7) p7m0Var.getValue();
        boolean z2 = z ? !et7Var.f8363a : et7Var.f8363a;
        et7 et7Var2 = new et7(z2, k3pVar);
        p7m0Var.getClass();
        p7m0Var.o(null, et7Var2);
        if (z) {
            qu quVar = this.I0;
            quVar.getClass();
            i8i.D("action", z2 ? "expand" : "hide", quVar.f29324a, "bet_on_favorite_expand");
            this.K0.f40143a.a(cui0.b(new j1p(z2 ? "expand" : "hide", (byte) 0)), 12215L);
        }
        if (!((n9h0) this.W1.getValue()).c || (bbyVar = this.M1) == null || bbyVar.isActive()) {
            return;
        }
        p7m0 p7m0Var2 = this.Z1;
        ije ijeVar = (ije) p7m0Var2.getValue();
        if (ijeVar instanceof eje) {
            eje ejeVar = (eje) ijeVar;
            List<r4f> list = ejeVar.f7904a;
            if (list == null || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((r4f) it.next()) instanceof dt7) {
                        arrayList = new ArrayList(r3d.q(list, 10));
                        for (r4f dt7Var : list) {
                            if (dt7Var instanceof dt7) {
                                dt7 dt7Var2 = (dt7) dt7Var;
                                boolean z3 = dt7Var2.f6647a.f8363a;
                                if (z) {
                                    z3 = !z3;
                                }
                                dt7Var = new dt7(new et7(z3, k3pVar), dt7Var2.b);
                            }
                            arrayList.add(dt7Var);
                        }
                    }
                }
                arrayList = CollectionsKt.r0(list, new dt7(new et7(true, k3pVar), vbc.e0(N().j.f1428a)));
            } else {
                arrayList = CollectionsKt.r0(list, new dt7(new et7(true, k3pVar), vbc.e0(N().j.f1428a)));
            }
            eje ejeVar2 = new eje(arrayList, ejeVar.b, ejeVar.c, ejeVar.d);
            p7m0Var2.getClass();
            p7m0Var2.o(null, ejeVar2);
        }
    }

    public final void p0(String str, boolean z) {
        p7m0 p7m0Var;
        Object value;
        boolean z2 = this.T1;
        this.b2.f(z ? new q720(z2) : new p720(z2));
        do {
            p7m0Var = this.W1;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, n9h0.a((n9h0) value, false, z, !z, M(str), L(), ((n9h0) p7m0Var.getValue()).g, false, false, false, false, 1923)));
        r0();
    }

    public final void q0(int i, boolean z) {
        sac.V(jiu0.a(this), m7f.f21317a, null, this.Y0.b, new n7f(this, i, z, null), 10);
    }

    public final void r0() {
        p7m0 p7m0Var;
        Object value;
        hn5 hn5Var;
        p7m0 p7m0Var2;
        boolean z;
        p7m0 p7m0Var3;
        p7m0 p7m0Var4;
        Object value2;
        do {
            p7m0Var = this.Y1;
            value = p7m0Var.getValue();
            hn5Var = (hn5) value;
            p7m0Var2 = this.Z1;
            z = this.V1;
            p7m0Var3 = this.W1;
        } while (!p7m0Var.m(value, hn5.a(hn5Var, null, null, null, z && ((n9h0) p7m0Var3.getValue()).g && !((n9h0) p7m0Var3.getValue()).d && !(p7m0Var2.getValue() instanceof xie), 15)));
        do {
            p7m0Var4 = this.X1;
            value2 = p7m0Var4.getValue();
        } while (!p7m0Var4.m(value2, pwq0.a((pwq0) value2, false, null, null, false, false, false, false, 0, null, (!z || ((n9h0) p7m0Var3.getValue()).d || (p7m0Var2.getValue() instanceof xie)) ? false : true, 4095)));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object s0(zje zjeVar, List list, boolean z) {
        o7f o7fVar;
        boolean z2;
        ArrayList arrayList;
        String str;
        if (zjeVar instanceof o7f) {
            o7fVar = (o7f) zjeVar;
            int i = o7fVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                o7fVar.m = i - Integer.MIN_VALUE;
            } else {
                o7fVar = new o7f(this, zjeVar);
            }
        } else {
            o7fVar = new o7f(this, zjeVar);
        }
        o7f o7fVar2 = o7fVar;
        Object obj = o7fVar2.k;
        wne wneVar = wne.f39444a;
        int i2 = o7fVar2.m;
        if (i2 == 0) {
            z1x.P(obj);
            q4f q4fVarA = this.i.a();
            ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                cit0 cit0Var = (cit0) it.next();
                if (q4fVarA == q4f.m) {
                    str = "-";
                } else {
                    List list2 = cit0Var.e;
                    if (list2 == null || !list2.isEmpty()) {
                        Iterator it2 = list2.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                m97 m97Var = (m97) it2.next();
                                if (Intrinsics.d(m97Var.m, "SP") || Intrinsics.d(m97Var.n, "SP")) {
                                    str = "-";
                                }
                            }
                        }
                    }
                    str = cit0Var.K;
                }
                String str2 = str;
                int i3 = cit0Var.f4430a;
                int i4 = cit0Var.b;
                int i5 = cit0Var.c;
                int i6 = cit0Var.d;
                List list3 = cit0Var.e;
                int i7 = cit0Var.f;
                int i8 = cit0Var.g;
                List list4 = cit0Var.h;
                String str3 = cit0Var.i;
                boolean z3 = cit0Var.j;
                int i9 = cit0Var.k;
                int i10 = cit0Var.l;
                Iterator it3 = it;
                double d = cit0Var.m;
                String str4 = cit0Var.n;
                int i11 = cit0Var.o;
                int i12 = cit0Var.p;
                int i13 = cit0Var.q;
                int i14 = cit0Var.r;
                boolean z4 = cit0Var.s;
                boolean z5 = cit0Var.t;
                String str5 = cit0Var.u;
                boolean z6 = cit0Var.v;
                int i15 = cit0Var.w;
                boolean z7 = cit0Var.x;
                boolean z8 = cit0Var.y;
                int i16 = cit0Var.z;
                String str6 = cit0Var.A;
                double d2 = cit0Var.B;
                double d3 = cit0Var.C;
                List list5 = cit0Var.D;
                double d4 = cit0Var.E;
                double d5 = cit0Var.F;
                List list6 = cit0Var.G;
                boolean z9 = cit0Var.H;
                boolean z10 = cit0Var.I;
                double d6 = cit0Var.J;
                double d7 = cit0Var.L;
                boolean z11 = cit0Var.M;
                double d8 = cit0Var.N;
                List list7 = cit0Var.O;
                int i17 = cit0Var.P;
                double d9 = cit0Var.Q;
                double d10 = cit0Var.R;
                String str7 = cit0Var.S;
                boolean z12 = cit0Var.T;
                ozc ozcVar = cit0Var.U;
                String str8 = cit0Var.V;
                List list8 = cit0Var.W;
                int i18 = cit0Var.X;
                String str9 = cit0Var.Y;
                boolean z13 = cit0Var.Z;
                int i19 = cit0Var.a0;
                oxk0 oxk0Var = cit0Var.b0;
                double d11 = cit0Var.c0;
                String str10 = cit0Var.d0;
                double d12 = cit0Var.e0;
                boolean z14 = cit0Var.f0;
                vb9 vb9Var = cit0Var.g0;
                rz4.B(list3, list4, list5, list6, list7);
                list8.getClass();
                cit0 cit0Var2 = new cit0(i3, i4, i5, i6, list3, i7, i8, list4, str3, z3, i9, i10, d, str4, i11, i12, i13, i14, z4, z5, str5, z6, i15, z7, z8, i16, str6, d2, d3, list5, d4, d5, list6, z9, z10, d6, str2, d7, z11, d8, list7, i17, d9, d10, str7, z12, ozcVar, str8, list8, i18, str9, z13, i19, oxk0Var, d11, str10, d12, z14, vb9Var);
                if (q4fVarA != q4f.m) {
                    ljf0 ljf0Var = new ljf0(new pyu((cuw) ((yqc) this.C0.f25567a).b));
                    duw duwVar = new duw(d9, d10, i17);
                    cuw cuwVar = (cuw) ((pyu) ljf0Var.f20148a).f27815a;
                    cuwVar.getClass();
                    cuwVar.f5005a = duwVar;
                }
                arrayList2.add(cit0Var2);
                it = it3;
            }
            if (!list.isEmpty()) {
                Iterator it4 = list.iterator();
                do {
                    if (!it4.hasNext()) {
                        ((ave) this.j.f22172a.c).b = System.currentTimeMillis();
                        break;
                    }
                } while (!Intrinsics.d((cit0) it4.next(), knm0.j()));
            } else {
                ((ave) this.j.f22172a.c).b = System.currentTimeMillis();
                break;
            }
            long jB = this.l.b();
            List listA = this.q0.A();
            o7fVar2.i = arrayList2;
            z2 = z;
            o7fVar2.j = z2;
            o7fVar2.m = 1;
            if (this.O.b(arrayList2, jB, listA, o7fVar2) == wneVar) {
                return wneVar;
            }
            arrayList = arrayList2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z15 = o7fVar2.j;
            arrayList = o7fVar2.i;
            z1x.P(obj);
            z2 = z15;
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it5 = arrayList.iterator();
        while (it5.hasNext()) {
            arrayList3.add(((cit0) it5.next()).e);
        }
        k0(r3d.r(arrayList3), z2);
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bb  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r6v18, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v14 */
    public final void t0(q4f q4fVar, List list, boolean z, boolean z2) {
        List listA0;
        boolean z3;
        Object next;
        String strP;
        ?? arrayList;
        p7m0 p7m0Var;
        Object value;
        boolean z4;
        int size;
        int size2;
        boolean z5;
        int size3;
        pmi pmiVar = this.t;
        pmiVar.getClass();
        list.getClass();
        int i = 1;
        if (list.isEmpty()) {
            listA0 = iun.f15405a;
        } else {
            g0f g0fVarA = ((ert) pmiVar.d).a();
            r9u r9uVar = (r9u) pmiVar.e;
            ygp ygpVar = ygp.J1;
            r9uVar.getClass();
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            ArrayList<q4f> arrayListA = ((xzt) pmiVar.b).a(j1q0Var.f15748a.d(ygpVar));
            ArrayList arrayList2 = new ArrayList(r3d.q(arrayListA, 10));
            for (q4f q4fVar2 : arrayListA) {
                int iA = ((o4a) pmiVar.c).a(q4fVar2);
                int iE = tqt.e(q4fVar2);
                if (q4fVar2 != q4f.d && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((qu6) it.next()).x == 707) {
                                z4 = true;
                                break;
                            }
                        } else {
                            z4 = false;
                            break;
                        }
                    }
                } else {
                    z4 = false;
                    break;
                }
                if (!list.isEmpty()) {
                    if (!list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (((qu6) it2.next()).E != q4f.l.a()) {
                                    if (q4fVar2 == q4f.i) {
                                        z5 = true;
                                    } else {
                                        z5 = true;
                                    }
                                }
                            }
                        }
                    }
                    if (q4fVar2 != q4f.l || iE > (size3 = list.size()) || size3 > iA) {
                        z5 = false;
                    } else {
                        z5 = true;
                    }
                } else if (q4fVar2 == q4f.i ? (q4fVar2 == q4f.d || g0fVarA.f != 1) && iE <= (size = list.size()) && size <= iA && (!z4 || g0fVarA.n) : iE <= (size2 = list.size()) && size2 <= iA && g0fVarA.h > 1.01d) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                arrayList2.add(new d4f(q4fVar2, z5));
            }
            listA0 = CollectionsKt.A0(arrayList2, new vvt((byte) 6));
        }
        if (listA0 != null && listA0.isEmpty()) {
            z3 = false;
            break;
        }
        Iterator it3 = listA0.iterator();
        while (true) {
            if (it3.hasNext()) {
                if (((d4f) it3.next()).b) {
                    z3 = true;
                    break;
                }
            } else {
                z3 = false;
                break;
            }
        }
        Iterator it4 = I().iterator();
        int i2 = 0;
        while (true) {
            if (!it4.hasNext()) {
                i2 = -1;
                break;
            } else if (Intrinsics.d(((q4f) it4.next()).name(), q4fVar.name())) {
                break;
            } else {
                i2++;
            }
        }
        if (listA0.isEmpty()) {
            strP = P(q4f.b);
        } else if (i2 < 0 || i2 >= listA0.size()) {
            Iterator it5 = listA0.iterator();
            do {
                if (!it5.hasNext()) {
                    next = null;
                    break;
                }
                next = it5.next();
            } while (!((d4f) next).b);
            d4f d4fVar = (d4f) next;
            strP = P(d4fVar != null ? d4fVar.f5451a : q4f.b);
        } else {
            strP = P(((d4f) listA0.get(i2)).f5451a);
        }
        String str = strP;
        if (z3) {
            arrayList = new ArrayList(r3d.q(listA0, 10));
            int i3 = 0;
            for (Object obj : listA0) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    q3d.p();
                    throw null;
                }
                d4f d4fVar2 = (d4f) obj;
                ?? r12 = q4fVar == d4fVar2.f5451a ? i : 0;
                ?? r7 = i3 == listA0.size() - i ? i : 0;
                ctf0 ctf0Var = this.T0;
                ctf0Var.getClass();
                arrayList.add(new CouponTypeUiModel(ctf0Var.f(lgb.V(d4fVar2.f5451a), new Object[0]), r12, d4fVar2.b, r7));
                i3 = i4;
                i = 1;
            }
        } else {
            arrayList = iun.f15405a;
        }
        ?? r13 = arrayList;
        boolean z6 = N().b || N().d;
        boolean z7 = this.C1 == w4f.b;
        do {
            p7m0Var = this.X1;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, pwq0.a((pwq0) value, z2, str, r13, z7 && z3 && !list.isEmpty(), z6, z, z, z ? R.menu.coupon_menu : 0, K(), false, 4103)));
    }

    public final void u0() {
        this.K0.o(ptn.b);
        this.I0.c(koc.b);
        sac.V(jiu0.a(this), q7f.f28246a, null, this.Y0.b, new d5f(this, null, (byte) 9), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        if (z(r8, false, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object w(a.zje r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof a.a5f
            if (r0 == 0) goto L13
            r0 = r8
            a.a5f r0 = (a.a5f) r0
            int r1 = r0.k
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.k = r1
            goto L18
        L13:
            a.a5f r0 = new a.a5f
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.i
            a.wne r1 = a.wne.f39444a
            int r2 = r0.k
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2e
            a.z1x.P(r8)
            goto L6e
        L2e:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r7)
            return r6
        L34:
            a.z1x.P(r8)
            goto L5e
        L38:
            a.z1x.P(r8)
            goto L4c
        L3c:
            a.z1x.P(r8)
            a.bm5 r8 = a.bm5.i
            r0.k = r5
            a.khf0 r2 = r7.w0
            java.io.Serializable r8 = a.khf0.G(r2, r8, r0)
            if (r8 != r1) goto L4c
            goto L6d
        L4c:
            a.ql5 r8 = (a.ql5) r8
            a.ot r2 = r7.x0
            a.bm5 r5 = a.bm5.i
            r2.a(r5, r8)
            r0.k = r4
            java.lang.Object r8 = r7.j0(r8, r0)
            if (r8 != r1) goto L5e
            goto L6d
        L5e:
            a.j9c r8 = r7.i
            a.q4f r8 = r8.a()
            r0.k = r3
            r2 = 0
            java.lang.Object r8 = r7.z(r8, r2, r0)
            if (r8 != r1) goto L6e
        L6d:
            return r1
        L6e:
            a.b8u r8 = r7.v0
            a.bm5 r0 = a.bm5.i
            a.i89 r8 = r8.a(r0)
            a.c00 r0 = new a.c00
            r1 = 27
            r0.<init>(r8, r7, r1)
            a.fr9 r8 = new a.fr9
            r1 = 8
            r8.<init>(r7, r6, r1)
            a.fnq r1 = new a.fnq
            r2 = 4
            r1.<init>(r0, r8, r2)
            a.b5f r8 = a.b5f.h
            a.bvc r7 = a.jiu0.a(r7)
            a.sac.T(r1, r7, r8)
            kotlin.Unit r7 = kotlin.Unit.f46060a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r7f.w(a.zje):java.lang.Object");
    }

    public final void x(long j) {
        if (j > 1) {
            v3c.N(this.O1);
            v3c.N(this.P1);
            v3c.N(this.Q1);
            lye lyeVar = (lye) this.g1.f22172a.f10647a;
            lyeVar.e.clear();
            lyeVar.f.clear();
        }
        if ((j == 1 || j == 0) && this.C1 != w4f.c) {
            m0();
        }
    }

    public final void y(Function1 function1) {
        sac.V(jiu0.a(this), e5f.f7232a, null, this.Y0.b, new fze((Object) function1, (Object) this, (yje) null, (byte) 8), 10);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009b  */
    /* JADX WARN: Code duplicated, block: B:39:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r13 == r1) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
    
        if (r10.K.s(r4, r0) == r1) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [int] */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object z(a.q4f r11, boolean r12, a.zje r13) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r7f.z(a.q4f, boolean, a.zje):java.lang.Object");
    }
}
