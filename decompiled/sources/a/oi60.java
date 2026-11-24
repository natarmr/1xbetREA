package a;

import com.huawei.hms.api.ConnectionResult;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;
import org.xplatform.onboarding_section.impl.navigation.OnboardingScreens$OnboardingCyberSectionsFragmentScreen;
import org.xplatform.onboarding_section.impl.navigation.OnboardingScreens$OnboardingSectionsFragmentScreen;

/* JADX INFO: loaded from: classes5.dex */
public final class oi60 extends i3t0 {
    public final vah A;
    public final fk60 A0;
    public final psc B;
    public bby B0;
    public final prc C;
    public final epi0 D;
    public final a1d E;
    public final h4f F;
    public final vt6 G;
    public final cad H;
    public final zng I;
    public final psc J;
    public final vqc K;
    public final yqc L;
    public final mag M;
    public final psc N;
    public final dpi0 O;
    public final eyu P;
    public final u650 Q;
    public final lp1 R;
    public final peg0 S;
    public final qh00 T;
    public final wf1 U;
    public final bzu V;
    public final w4p0 W;
    public final ocl X;
    public final lsn Y;
    public final epi0 Z;
    public final pmi0 a0;
    public final lri b0;
    public final yhi c0;
    public final gbi d0;
    public final duj e0;
    public final i1w0 f0;
    public final ouu g0;
    public final evz h0;
    public final dgu i0;
    public final xlu j0;
    public final ok50 k0;
    public final hru l0;
    public final yf1 m0;
    public final h03 n0;
    public final bst o;
    public final zg o0;
    public final mrs p;
    public final bzu p0;
    public final sdj0 q;
    public final ani0 q0;
    public final j4f r;
    public final ctf0 r0;
    public final h03 s;
    public final fou s0;
    public final wyu t;
    public final eyg0 t0;
    public final bst u;
    public final khf0 u0;
    public final gst v;
    public final nnu v0;
    public final a1d w;
    public final nnu w0;
    public final vqc x;
    public final au0 x0;
    public final prc y;
    public final bbw0 y0;
    public final rhh z;
    public final eyg0 z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi60(vzg0 vzg0Var, mne mneVar, bst bstVar, mrs mrsVar, sdj0 sdj0Var, j4f j4fVar, h03 h03Var, wyu wyuVar, bst bstVar2, gst gstVar, a1d a1dVar, vqc vqcVar, prc prcVar, rhh rhhVar, vah vahVar, psc pscVar, prc prcVar2, epi0 epi0Var, a1d a1dVar2, h4f h4fVar, vt6 vt6Var, cad cadVar, zng zngVar, psc pscVar2, vqc vqcVar2, yqc yqcVar, mag magVar, psc pscVar3, dpi0 dpi0Var, eyu eyuVar, u650 u650Var, lp1 lp1Var, peg0 peg0Var, qh00 qh00Var, wf1 wf1Var, bzu bzuVar, w4p0 w4p0Var, ocl oclVar, lsn lsnVar, epi0 epi0Var2, pmi0 pmi0Var, lri lriVar, yhi yhiVar, gbi gbiVar, duj dujVar, i1w0 i1w0Var, ouu ouuVar, evz evzVar, dgu dguVar, xlu xluVar, ok50 ok50Var, hru hruVar, yf1 yf1Var, h03 h03Var2, zg zgVar, bzu bzuVar2, ani0 ani0Var, ctf0 ctf0Var, fou fouVar, eyg0 eyg0Var, khf0 khf0Var, nnu nnuVar, nnu nnuVar2, au0 au0Var, bbw0 bbw0Var, eyg0 eyg0Var2, int i) {
        super(null, new a540((Object) ctf0Var, (Object) wyuVar, (byte) 16), new v510(ctf0Var, (byte) 20), cvm0.p(mneVar.c, mneVar.f22085a), null);
        wyuVar.getClass();
        i1w0Var.getClass();
        ctf0Var.getClass();
        this.o = bstVar;
        this.p = mrsVar;
        this.q = sdj0Var;
        this.r = j4fVar;
        this.s = h03Var;
        this.t = wyuVar;
        this.u = bstVar2;
        this.v = gstVar;
        this.w = a1dVar;
        this.x = vqcVar;
        this.y = prcVar;
        this.z = rhhVar;
        this.A = vahVar;
        this.B = pscVar;
        this.C = prcVar2;
        this.D = epi0Var;
        this.E = a1dVar2;
        this.F = h4fVar;
        this.G = vt6Var;
        this.H = cadVar;
        this.I = zngVar;
        this.J = pscVar2;
        this.K = vqcVar2;
        this.L = yqcVar;
        this.M = magVar;
        this.N = pscVar3;
        this.O = dpi0Var;
        this.P = eyuVar;
        this.Q = u650Var;
        this.R = lp1Var;
        this.S = peg0Var;
        this.T = qh00Var;
        this.U = wf1Var;
        this.V = bzuVar;
        this.W = w4p0Var;
        this.X = oclVar;
        this.Y = lsnVar;
        this.Z = epi0Var2;
        this.a0 = pmi0Var;
        this.b0 = lriVar;
        this.c0 = yhiVar;
        this.d0 = gbiVar;
        this.e0 = dujVar;
        this.f0 = i1w0Var;
        this.g0 = ouuVar;
        this.h0 = evzVar;
        this.i0 = dguVar;
        this.j0 = xluVar;
        this.k0 = ok50Var;
        this.l0 = hruVar;
        this.m0 = yf1Var;
        this.n0 = h03Var2;
        this.o0 = zgVar;
        this.p0 = bzuVar2;
        this.q0 = ani0Var;
        this.r0 = ctf0Var;
        this.s0 = fouVar;
        this.t0 = eyg0Var;
        this.u0 = khf0Var;
        this.v0 = nnuVar;
        this.w0 = nnuVar2;
        this.x0 = au0Var;
        this.y0 = bbw0Var;
        this.z0 = eyg0Var2;
        fk60.b.getClass();
        this.A0 = uuz.e(i);
    }

    public final boolean M() {
        fk60 fk60Var = this.A0;
        if (fk60Var == null) {
            return false;
        }
        byte b = fk60Var.f9675a;
        fk60.b.getClass();
        return CollectionsKt.L(fk60.c, uuz.e(b));
    }

    public final void N(int i, int i2, int i3, jf3 jf3Var) {
        fk60 fk60Var;
        if (!M() || (fk60Var = this.A0) == null) {
            return;
        }
        this.o0.a(i, i2 + 1, i3, fk60Var.a(), jf3Var);
    }

    public final void O(int i, int i2, int i3, if3 if3Var) {
        fk60 fk60Var;
        if (!M() || (fk60Var = this.A0) == null) {
            return;
        }
        String strA = fk60Var.a();
        au0 au0Var = this.x0;
        au0Var.getClass();
        au0Var.f1455a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new i1p(i2 + 1, (byte) 0), new i1p(i3, (byte) 1), new j1p(strA, (byte) 0), new j1p(if3Var.f14666a, (byte) 1)}), 11484L);
    }

    public final void P() {
        ((t91) this.a0.f27236a).f33539a.b = false;
        i1w0 i1w0Var = this.f0;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        this.h0.getClass();
        k0w0VarI.c(new OnboardingScreens$OnboardingCyberSectionsFragmentScreen());
        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void Q() {
        this.Z.j(false);
        fk60 fk60Var = this.A0;
        if ((fk60Var == null ? -1 : li60.f20089a[fk60Var.ordinal()]) == 3) {
            ((qe50) this.g0.b).a(new ab50(0), false);
            return;
        }
        i1w0 i1w0Var = this.f0;
        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
        this.h0.getClass();
        k0w0VarI.c(new OnboardingScreens$OnboardingSectionsFragmentScreen());
        ListIterator listIteratorO = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
        while (true) {
            paw pawVar = (paw) listIteratorO;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        gi60 gi60Var = (gi60) obj;
        gi60Var.getClass();
        boolean z = gi60Var instanceof ai60;
        ocl oclVar = this.X;
        fk60 fk60Var = this.A0;
        lsn lsnVar = this.Y;
        if (z) {
            ai60 ai60Var = (ai60) gi60Var;
            if (ai60Var.equals(yh60.f42623a)) {
                e3c.n(this.B0);
                this.B0 = sac.V(jiu0.a(this), new jw50(1, this.e0, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, null, new e3p(this, null, (byte) 23), 14);
                return;
            }
            if (ai60Var.equals(zh60.f44377a)) {
                e3c.n(this.B0);
                return;
            }
            if (!ai60Var.equals(xh60.f40873a)) {
                if (ai60Var.equals(wh60.f39151a)) {
                    E();
                    return;
                } else {
                    t9f.b();
                    return;
                }
            }
            if (oclVar.m() || lsnVar.f() || fk60Var == null) {
                return;
            }
            this.b0.c(fk60Var, false);
            this.d0.D(fk60Var);
            return;
        }
        if (gi60Var instanceof fi60) {
            fi60 fi60Var = (fi60) gi60Var;
            if (fi60Var instanceof ci60) {
                ci60 ci60Var = (ci60) fi60Var;
                int i = ci60Var.f4397a;
                int i2 = ci60Var.b;
                int i3 = ci60Var.c;
                N(i, i2, i3, jf3.CLOSE);
                O(i, i2, i3, if3.CLOSE);
                if (oclVar.m()) {
                    Q();
                    return;
                } else {
                    if (lsnVar.f()) {
                        P();
                        return;
                    }
                    return;
                }
            }
            boolean z2 = fi60Var instanceof bi60;
            ti60 ti60Var = ti60.f33994a;
            a1d a1dVar = this.E;
            epi0 epi0Var = this.D;
            h4f h4fVar = this.F;
            vt6 vt6Var = this.G;
            cad cadVar = this.H;
            dpi0 dpi0Var = this.O;
            eyu eyuVar = this.P;
            u650 u650Var = this.Q;
            lp1 lp1Var = this.R;
            qh00 qh00Var = this.T;
            wf1 wf1Var = this.U;
            peg0 peg0Var = this.S;
            eyg0 eyg0Var = this.t0;
            zng zngVar = this.I;
            psc pscVar = this.J;
            vqc vqcVar = this.K;
            yqc yqcVar = this.L;
            mag magVar = this.M;
            psc pscVar2 = this.N;
            eyg0 eyg0Var2 = this.z0;
            if (z2) {
                bi60 bi60Var = (bi60) fi60Var;
                int i4 = bi60Var.b;
                int i5 = bi60Var.f2645a;
                int i6 = i4 + 1;
                int i7 = bi60Var.c;
                boolean z3 = i6 == i7;
                boolean z4 = z3;
                jf3 jf3Var = z3 ? jf3.CLOSE : jf3.NEXT;
                if3 if3Var = z4 ? if3.CLOSE : if3.NEXT;
                N(i5, i4, i7, jf3Var);
                O(i5, i4, i7, if3Var);
                if (z4) {
                    if (!oclVar.m()) {
                        if (!lsnVar.f()) {
                            switch (fk60Var != null ? li60.f20089a[fk60Var.ordinal()] : -1) {
                                case 1:
                                    ((lrs) a1dVar.b).f20548a.e(2, "TIPS_GAMES_SHOWED_v3");
                                    break;
                                case 2:
                                    ((rdj0) epi0Var.b).f30295a.e(2, "SETTINGS_TIPS_SHOWED");
                                    break;
                                case 3:
                                    h4fVar.f12430a.f14143a.e(2, "COUPON_TIPS_SHOWED");
                                    break;
                                case 4:
                                    vt6Var.f37988a.f39724a.e(2, "BET_CONSTRUCTOR_TIPS_SHOWED");
                                    break;
                                case 5:
                                    ((g0h) cadVar.b).f10459a.e(2, "TIPS_CYBER_GAMES_SHOWED");
                                    break;
                                case 6:
                                    dpi0Var.j();
                                    break;
                                case 7:
                                    eyuVar.f8644a.f40279a.e(2, "TIPS_TEAM_BET_SHOWED");
                                    break;
                                case 8:
                                    u650Var.f35122a.f36857a.e(1, "TIPS_MY_AGGREGATOR_SHOWED");
                                    break;
                                case 9:
                                    lp1Var.f20418a.f22155a.e(1, "TIPS_AGGREGATOR_SLOTS_SHOWED");
                                    break;
                                case 10:
                                    qh00Var.f28713a.f30464a.e(1, "TIPS_LIVE_AGGREGATOR_SHOWED");
                                    break;
                                case 11:
                                    wf1Var.f39046a.f40769a.e(1, "TIPS_AGGREGATOR_PROMO_SHOWED");
                                    break;
                                case 12:
                                    ((iz1) peg0Var.b).f15613a.e(1, "TIPS_AGGREGATOR_TOURNAMENTS_SHOWED");
                                    break;
                                case 14:
                                    ((khb0) eyg0Var.b).f18283a.e(2, "TIPS_POPULAR_PERSONALIZATION");
                                    break;
                                case 15:
                                    zngVar.f44673a.f1199a.e(2, "TIPS_CYBER_EVENT_SHOWED");
                                    break;
                                case 16:
                                    ((pnh) pscVar.b).f27286a.e(2, "TIPS_CYBER_TOURNAMENT_SHOWED");
                                    break;
                                case 17:
                                    ((qhh) vqcVar.b).f28738a.e(2, "TIPS_CYBER_TEAM_SHOWED");
                                    break;
                                case 18:
                                    ((uah) yqcVar.b).f35328a.e(2, "TIPS_CYBER_PROMO_SHOWED");
                                    break;
                                case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                                    magVar.f21455a.f23189a.e(2, "TIPS_CYBER_CALENDAR_SHOWED");
                                    break;
                                case 20:
                                    ((bah) pscVar2.b).f2256a.e(2, "TIPS_CYBER_PARTNERS_SHOWED");
                                    break;
                                case 21:
                                    eyg0Var2.l();
                                    break;
                                case 22:
                                    this.o.f(this.t.a());
                                    break;
                                case 23:
                                    ((uur0) this.q0.f1155a).b.e(2, "TOTO_TIPS_SHOWED");
                                    break;
                            }
                        } else {
                            P();
                        }
                    } else {
                        Q();
                    }
                    G(ti60Var);
                    return;
                }
                return;
            }
            if (!(fi60Var instanceof ei60)) {
                if (!(fi60Var instanceof di60)) {
                    t9f.b();
                    return;
                }
                di60 di60Var = (di60) fi60Var;
                int i8 = di60Var.f6125a;
                if (!M() || fk60Var == null) {
                    return;
                }
                int i9 = di60Var.c;
                int i10 = di60Var.b + 1;
                this.o0.b(i8, i10, i9, fk60Var.a());
                String strA = fk60Var.a();
                au0 au0Var = this.x0;
                au0Var.getClass();
                au0Var.f1455a.a(tx3.l0(new k1p[]{new i1p(i8, (byte) 2), new i1p(i10, (byte) 0), new i1p(i9, (byte) 1), new j1p(strA, (byte) 0)}), 11483L);
                return;
            }
            ei60 ei60Var = (ei60) fi60Var;
            int i11 = ei60Var.f7844a;
            int i12 = ei60Var.b;
            int i13 = ei60Var.c;
            N(i11, i12, i13, jf3.MISS);
            O(i11, i12, i13, if3.MISS);
            if (!oclVar.m()) {
                if (!lsnVar.f()) {
                    switch (fk60Var != null ? li60.f20089a[fk60Var.ordinal()] : -1) {
                        case 1:
                            ((lrs) a1dVar.b).f20548a.e(2, "TIPS_GAMES_SHOWED_v3");
                            break;
                        case 2:
                            ((rdj0) epi0Var.b).f30295a.e(2, "SETTINGS_TIPS_SHOWED");
                            break;
                        case 3:
                            h4fVar.f12430a.f14143a.e(2, "COUPON_TIPS_SHOWED");
                            break;
                        case 4:
                            vt6Var.f37988a.f39724a.e(2, "BET_CONSTRUCTOR_TIPS_SHOWED");
                            break;
                        case 5:
                            ((g0h) cadVar.b).f10459a.e(2, "TIPS_CYBER_GAMES_SHOWED");
                            break;
                        case 6:
                            dpi0Var.j();
                            break;
                        case 7:
                            eyuVar.f8644a.f40279a.e(2, "TIPS_TEAM_BET_SHOWED");
                            break;
                        case 8:
                            u650Var.f35122a.f36857a.e(1, "TIPS_MY_AGGREGATOR_SHOWED");
                            break;
                        case 9:
                            lp1Var.f20418a.f22155a.e(1, "TIPS_AGGREGATOR_SLOTS_SHOWED");
                            break;
                        case 10:
                            qh00Var.f28713a.f30464a.e(1, "TIPS_LIVE_AGGREGATOR_SHOWED");
                            break;
                        case 11:
                            wf1Var.f39046a.f40769a.e(1, "TIPS_AGGREGATOR_PROMO_SHOWED");
                            break;
                        case 12:
                            ((iz1) peg0Var.b).f15613a.e(1, "TIPS_AGGREGATOR_TOURNAMENTS_SHOWED");
                            break;
                        case 13:
                            j0b0 j0b0Var = this.w0.f23841a;
                            j0b0Var.f15675a.d("TIPS_POPULAR_AGGREGATOR_SHOWED", true);
                            j0b0Var.b.g = true;
                            break;
                        case 14:
                            ((khb0) eyg0Var.b).f18283a.e(2, "TIPS_POPULAR_PERSONALIZATION");
                            break;
                        case 15:
                            zngVar.f44673a.f1199a.e(2, "TIPS_CYBER_EVENT_SHOWED");
                            break;
                        case 16:
                            ((pnh) pscVar.b).f27286a.e(2, "TIPS_CYBER_TOURNAMENT_SHOWED");
                            break;
                        case 17:
                            ((qhh) vqcVar.b).f28738a.e(2, "TIPS_CYBER_TEAM_SHOWED");
                            break;
                        case 18:
                            ((uah) yqcVar.b).f35328a.e(2, "TIPS_CYBER_PROMO_SHOWED");
                            break;
                        case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                            magVar.f21455a.f23189a.e(2, "TIPS_CYBER_CALENDAR_SHOWED");
                            break;
                        case 20:
                            ((bah) pscVar2.b).f2256a.e(2, "TIPS_CYBER_PARTNERS_SHOWED");
                            break;
                        case 21:
                            eyg0Var2.l();
                            break;
                    }
                } else {
                    P();
                }
            } else {
                Q();
            }
            G(ti60Var);
        }
    }
}
