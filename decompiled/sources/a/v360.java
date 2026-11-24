package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import org.xplatform.favorites.impl.FavoritesInternalNavigation$favoriteChampsDashboardFragment$1;
import org.xplatform.favorites.impl.FavoritesInternalNavigation$favoriteDashboardEventsFragment$1;
import org.xplatform.favorites.impl.FavoritesInternalNavigation$favoriteDashboardFiltersFragment$1;
import org.xplatform.favorites.impl.FavoritesInternalNavigation$favoriteDashboardViewedFragment$1;
import org.xplatform.favorites.impl.FavoritesInternalNavigation$favoriteTeamsDashboardFragment$1;
import org.xplatform.favorites.impl.FavoritesInternalNavigation$favoriteTrackedDashboardFragment$1;
import org.xplatform.favorites.impl.FavoritesInternalNavigation$getTeamBetTeamsScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class v360 extends i3t0 {
    public static final /* synthetic */ int x0 = 0;
    public final w5z A;
    public final yfm0 B;
    public final kd30 C;
    public final pru D;
    public final n4u E;
    public final z8u F;
    public final h6i G;
    public final kki H;
    public final bzu I;
    public final n4u J;
    public final a6u K;
    public final abu L;
    public final w5z M;
    public final zpu N;
    public final phf0 O;
    public final khf0 P;
    public final luu Q;
    public final mne R;
    public final i1w0 S;
    public final hzg T;
    public final ifp U;
    public final s31 V;
    public final m1e W;
    public final j3c X;
    public final yzn0 Y;
    public final duj Z;
    public final ivn a0;
    public final oct b0;
    public final phf0 c0;
    public final jqt d0;
    public final ix0 e0;
    public final u58 f0;
    public final svu g0;
    public final msu h0;
    public final gg5 i0;
    public final y3v j0;
    public final rrc k0;
    public final vjp l0;
    public final peg0 m0;
    public final o3c n0;
    public final vzg0 o;
    public final hjd o0;
    public final jdk0 p;
    public final nn60 p0;
    public final xr q;
    public final eyg0 q0;
    public final y78 r;
    public final lbu r0;
    public final bn6 s;
    public final r9u s0;
    public final je t;
    public final hsj t0;
    public final ctf0 u;
    public c4m0 u0;
    public final v88 v;
    public bby v0;
    public final urt w;
    public bby w0;
    public final h3c x;
    public final qv2 y;
    public final prc z;

    public v360(vzg0 vzg0Var, jdk0 jdk0Var, xr xrVar, y78 y78Var, bn6 bn6Var, je jeVar, ctf0 ctf0Var, v88 v88Var, urt urtVar, fhj fhjVar, h3c h3cVar, qv2 qv2Var, prc prcVar, w5z w5zVar, yfm0 yfm0Var, kd30 kd30Var, pru pruVar, n4u n4uVar, z8u z8uVar, h6i h6iVar, kki kkiVar, bzu bzuVar, n4u n4uVar2, a6u a6uVar, abu abuVar, w5z w5zVar2, zpu zpuVar, phf0 phf0Var, khf0 khf0Var, luu luuVar, mne mneVar, g2v g2vVar, i1w0 i1w0Var, hzg hzgVar, ifp ifpVar, s31 s31Var, m1e m1eVar, j3c j3cVar, yzn0 yzn0Var, duj dujVar, ivn ivnVar, oct octVar, phf0 phf0Var2, jqt jqtVar, iqt iqtVar, ix0 ix0Var, u58 u58Var, svu svuVar, msu msuVar, gg5 gg5Var, y3v y3vVar, rrc rrcVar, vjp vjpVar, kc60 kc60Var, peg0 peg0Var, o3c o3cVar, hjd hjdVar, nn60 nn60Var, eyg0 eyg0Var, lbu lbuVar, r9u r9uVar, hsj hsjVar, r8i r8iVar) {
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        mr0 mr0Var = new mr0(g2vVar, iqtVar, ctf0Var, vzg0Var, (byte) 22);
        v510 v510Var = new v510(ctf0Var, (byte) 19);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, mr0Var, v510Var, cvm0.p(vs10Var, rwjVar), null);
        this.o = vzg0Var;
        this.p = jdk0Var;
        this.q = xrVar;
        this.r = y78Var;
        this.s = bn6Var;
        this.t = jeVar;
        this.u = ctf0Var;
        this.v = v88Var;
        this.w = urtVar;
        this.x = h3cVar;
        this.y = qv2Var;
        this.z = prcVar;
        this.A = w5zVar;
        this.B = yfm0Var;
        this.C = kd30Var;
        this.D = pruVar;
        this.E = n4uVar;
        this.F = z8uVar;
        this.G = h6iVar;
        this.H = kkiVar;
        this.I = bzuVar;
        this.J = n4uVar2;
        this.K = a6uVar;
        this.L = abuVar;
        this.M = w5zVar2;
        this.N = zpuVar;
        this.O = phf0Var;
        this.P = khf0Var;
        this.Q = luuVar;
        this.R = mneVar;
        this.S = i1w0Var;
        this.T = hzgVar;
        this.U = ifpVar;
        this.V = s31Var;
        this.W = m1eVar;
        this.X = j3cVar;
        this.Y = yzn0Var;
        this.Z = dujVar;
        this.a0 = ivnVar;
        this.b0 = octVar;
        this.c0 = phf0Var2;
        this.d0 = jqtVar;
        this.e0 = ix0Var;
        this.f0 = u58Var;
        this.g0 = svuVar;
        this.h0 = msuVar;
        this.i0 = gg5Var;
        this.j0 = y3vVar;
        this.k0 = rrcVar;
        this.l0 = vjpVar;
        this.m0 = peg0Var;
        this.n0 = o3cVar;
        this.o0 = hjdVar;
        this.p0 = nn60Var;
        this.q0 = eyg0Var;
        this.r0 = lbuVar;
        this.s0 = r9uVar;
        this.t0 = hsjVar;
        yje yjeVar = null;
        byte b = 21;
        i3t0.K(this, null, null, new hr(this, yjeVar, b), 3);
        byte b2 = 4;
        sac.T(new fnq(kc60Var.a(), new z260(this, yjeVar, (byte) 2), b2), d5c.S(jiu0.a(this), rwjVar), foe.h);
        byte b3 = 1;
        sac.V(jiu0.a(this), s360.f31541a, null, mneVar.b, new r360(this, yjeVar, b3), 10);
        sff0 sff0VarA = ((pru) fhjVar.b).a();
        xep xepVar = (xep) ((rrc) ((cmt) fhjVar.f9543a).b).b;
        sac.T(new fnq(new zj2(new fnq(xepVar.b, new j0l(xepVar, yjeVar, b)), fhjVar, sff0VarA, (byte) 9), new z260(this, yjeVar, b3), b2), d5c.S(jiu0.a(this), rwjVar), e360.h);
        i3t0.F(this, nn60Var, null, null, new rj50(b), 119);
        if (r8iVar.r(fk60.TEAM_BET)) {
            G(z160.f43603a);
        }
    }

    public static boolean M(rz50 rz50Var) {
        List<nz50> listJ = q3d.j(rz50Var.f31342a, rz50Var.b, rz50Var.c, rz50Var.d, rz50Var.e, rz50Var.f, rz50Var.g);
        if (listJ == null || !listJ.isEmpty()) {
            for (nz50 nz50Var : listJ) {
                nz50Var.getClass();
                if (nz50Var instanceof mz50) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean O(rz50 rz50Var) {
        ArrayList arrayListQ0 = CollectionsKt.q0(CollectionsKt.q0(CollectionsKt.q0(m7x.A(rz50Var.f), m7x.A(rz50Var.e)), m7x.A(rz50Var.d)), m7x.A(rz50Var.c));
        wcs0 wcs0Var = (wcs0) m7x.B(rz50Var.b);
        List list = wcs0Var != null ? wcs0Var.f38939a : null;
        if (list == null) {
            list = iun.f15405a;
        }
        return CollectionsKt.q0(CollectionsKt.q0(arrayListQ0, list), m7x.A(rz50Var.g)).size() == 1 && m7x.A(rz50Var.f31342a).isEmpty();
    }

    public static boolean Q(rz50 rz50Var) {
        return !((ArrayList) tx3.z(new Throwable[]{m7x.D(rz50Var.f31342a), m7x.D(rz50Var.f), m7x.D(rz50Var.e), m7x.D(rz50Var.d), m7x.D(rz50Var.c), m7x.D(rz50Var.g), m7x.D(rz50Var.b)})).isEmpty() && R(rz50Var);
    }

    public static boolean R(rz50 rz50Var) {
        if (!m7x.A(rz50Var.f31342a).isEmpty() || !m7x.A(rz50Var.f).isEmpty() || !m7x.A(rz50Var.e).isEmpty() || !m7x.A(rz50Var.d).isEmpty() || !m7x.A(rz50Var.c).isEmpty() || !m7x.A(rz50Var.g).isEmpty()) {
            return false;
        }
        wcs0 wcs0Var = (wcs0) m7x.B(rz50Var.b);
        List list = wcs0Var != null ? wcs0Var.f38939a : null;
        return list == null || list.isEmpty();
    }

    public final dnq N(gmq gmqVar, boolean z, Object obj) {
        yje yjeVar = null;
        return new dnq(new fnq(new wk30(gmqVar, (byte) 6), new ys8(z, (Object) this, yjeVar, (byte) 24)), new fe0(this, obj, yjeVar, (byte) 12), (byte) 1);
    }

    public final String P(mlr mlrVar) {
        nz50 nz50Var;
        List listA;
        tz50 tz50Var = ((c260) D()).j;
        Integer numValueOf = null;
        rz50 rz50Var = tz50Var instanceof rz50 ? (rz50) tz50Var : null;
        if (rz50Var != null && (nz50Var = rz50Var.f) != null && (listA = m7x.A(nz50Var)) != null) {
            Iterator it = listA.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (((mlr) it.next()).f22006a == mlrVar.f22006a) {
                    break;
                }
                i++;
            }
            numValueOf = Integer.valueOf(i);
        }
        return this.q0.k(new lu0(0L, numValueOf, "bet_favor_other", hne.r(0L, "favorite")));
    }

    public final gmq S() {
        oz50 oz50Var;
        oz50 oz50Var2 = ((c260) D()).b;
        return ((oz50Var2 == null || !oz50Var2.g) && ((oz50Var = ((c260) D()).b) == null || !oz50Var.h)) ? new eu4(iun.f15405a, (byte) 12) : new dnq(this.M.O(), new oz0(3, null, (byte) 27), (byte) 1);
    }

    public final gmq T() {
        boolean z = ((c260) D()).c;
        a6u a6uVar = this.K;
        yje yjeVar = null;
        if (z) {
            a6uVar.getClass();
        } else {
            a6uVar.f = null;
        }
        vsg0 vsg0VarH0 = bkb.h0(8L, TimeUnit.SECONDS, new gkr(a6uVar, yjeVar, (byte) 17));
        gmq gmqVarB = this.I.b(true);
        abu abuVar = this.L;
        return i120.W(aoq.a(new dnq(uvw.Q(dub.f0(vsg0VarH0, gmqVarB, new ewt(((gst0) abuVar.c).f11847a.c, abuVar, (byte) 11), new ql2(this, yjeVar, (byte) 1)), false), new x5v(3, yjeVar, (byte) 5), (byte) 1), new st20(2, yjeVar, (byte) 7)));
    }

    /* JADX WARN: Code duplicated, block: B:112:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:113:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:118:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:124:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:127:0x0215  */
    /* JADX WARN: Code duplicated, block: B:128:0x0218  */
    /* JADX WARN: Code duplicated, block: B:140:0x0234  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final Object U(zje zjeVar) {
        n260 n260Var;
        gmq gmqVar;
        gmq gmqVar2;
        v360 v360Var;
        nz50 nz50Var;
        nz50 nz50Var2;
        oz50 oz50Var;
        oz50 oz50Var2;
        oz50 oz50Var3;
        dnq dnqVarN;
        dnq dnqVarN2;
        gmq gmqVar3;
        gmq gmqVar4;
        v360 v360Var2;
        nz50 nz50Var3;
        nz50 nz50Var4;
        nz50 nz50Var5;
        tz50 tz50Var;
        rz50 rz50Var;
        List list;
        boolean z;
        tz50 tz50Var2;
        rz50 rz50Var2;
        boolean z2;
        nz50 nz50Var6;
        wcs0 wcs0Var;
        nz50 nz50Var7;
        if (zjeVar instanceof n260) {
            n260Var = (n260) zjeVar;
            int i = n260Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                n260Var.q = i - Integer.MIN_VALUE;
            } else {
                n260Var = new n260(this, zjeVar);
            }
        } else {
            n260Var = new n260(this, zjeVar);
        }
        Object obj = n260Var.o;
        wne wneVar = wne.f39444a;
        int i2 = n260Var.q;
        byte b = 4;
        ?? r7 = 0;
        r7 = 0;
        r7 = 0;
        if (i2 == 0) {
            z1x.P(obj);
            a1t a1tVarB = this.E.b();
            tz50 tz50Var3 = ((c260) D()).j;
            rz50 rz50Var3 = tz50Var3 instanceof rz50 ? (rz50) tz50Var3 : null;
            List list2 = (rz50Var3 == null || (nz50Var2 = rz50Var3.c) == null) ? null : (List) m7x.B(nz50Var2);
            boolean z3 = list2 == null || list2.isEmpty();
            iun iunVar = iun.f15405a;
            dnq dnqVarN3 = N(a1tVarB, z3, iunVar);
            a1t a1tVarA = this.F.a();
            tz50 tz50Var4 = ((c260) D()).j;
            rz50 rz50Var4 = tz50Var4 instanceof rz50 ? (rz50) tz50Var4 : null;
            List list3 = (rz50Var4 == null || (nz50Var = rz50Var4.d) == null) ? null : (List) m7x.B(nz50Var);
            dnq dnqVarN4 = N(a1tVarA, list3 == null || list3.isEmpty(), iunVar);
            n260Var.i = dnqVarN3;
            n260Var.j = dnqVarN4;
            n260Var.k = this;
            n260Var.q = 1;
            Object objW = W(true, n260Var);
            if (objW != wneVar) {
                gmqVar = dnqVarN3;
                gmqVar2 = dnqVarN4;
                obj = objW;
                v360Var = this;
            }
            return wneVar;
        }
        if (i2 == 1) {
            v360Var = (v360) n260Var.k;
            gmq gmqVar5 = n260Var.j;
            gmqVar = n260Var.i;
            z1x.P(obj);
            gmqVar2 = gmqVar5;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v360Var2 = n260Var.n;
            dnqVarN2 = n260Var.m;
            dnqVarN = n260Var.l;
            gmqVar3 = (gmq) n260Var.k;
            gmqVar2 = n260Var.j;
            gmqVar4 = n260Var.i;
            z1x.P(obj);
        }
        gmq gmqVar6 = (gmq) obj;
        tz50Var = ((c260) D()).j;
        if (tz50Var instanceof rz50) {
            rz50Var = (rz50) tz50Var;
        } else {
            rz50Var = null;
        }
        if (rz50Var != null || (nz50Var7 = rz50Var.g) == null) {
            list = null;
        } else {
            list = (List) m7x.B(nz50Var7);
        }
        if (list != null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        iun iunVar2 = iun.f15405a;
        dnq dnqVarN5 = v360Var2.N(gmqVar6, z, iunVar2);
        gmq gmqVarT = T();
        tz50Var2 = ((c260) D()).j;
        if (tz50Var2 instanceof rz50) {
            rz50Var2 = (rz50) tz50Var2;
        } else {
            rz50Var2 = null;
        }
        if (rz50Var2 != null && (nz50Var6 = rz50Var2.b) != null && (wcs0Var = (wcs0) m7x.B(nz50Var6)) != null) {
            r7 = wcs0Var.f38939a;
        }
        if (r7 != 0 || r7.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        return i120.W(new pxt(new gmq[]{gmqVar4, gmqVar2, gmqVar3, dnqVarN, dnqVarN2, dnqVarN5, N(gmqVarT, z2, new wcs0(iunVar2, lunVar))}, (byte) 4));
        gmq gmqVar7 = (gmq) obj;
        tz50 tz50Var5 = ((c260) D()).j;
        rz50 rz50Var5 = tz50Var5 instanceof rz50 ? (rz50) tz50Var5 : null;
        List list4 = (rz50Var5 == null || (nz50Var5 = rz50Var5.e) == null) ? null : (List) m7x.B(nz50Var5);
        boolean z4 = (list4 == null || list4.isEmpty()) && (oz50Var = ((c260) D()).b) != null && oz50Var.e;
        iun iunVar3 = iun.f15405a;
        dnq dnqVarN6 = v360Var.N(gmqVar7, z4, iunVar3);
        gmq gmqVarS = S();
        tz50 tz50Var6 = ((c260) D()).j;
        rz50 rz50Var6 = tz50Var6 instanceof rz50 ? (rz50) tz50Var6 : null;
        List list5 = (rz50Var6 == null || (nz50Var4 = rz50Var6.f) == null) ? null : (List) m7x.B(nz50Var4);
        dnqVarN = N(gmqVarS, (list5 == null || list5.isEmpty()) && (((oz50Var2 = ((c260) D()).b) != null && oz50Var2.g) || ((oz50Var3 = ((c260) D()).b) != null && oz50Var3.h)), iunVar3);
        fnq fnqVar = new fnq(new hpt(this.A.P(((c260) D()).m, false), (byte) 2), new j940((Object) this, (yje) r7, (byte) 17), b);
        tz50 tz50Var7 = ((c260) D()).j;
        rz50 rz50Var7 = tz50Var7 instanceof rz50 ? (rz50) tz50Var7 : null;
        List list6 = (rz50Var7 == null || (nz50Var3 = rz50Var7.f31342a) == null) ? null : (List) m7x.B(nz50Var3);
        dnqVarN2 = N(fnqVar, list6 == null || list6.isEmpty(), iunVar3);
        n260Var.i = gmqVar;
        n260Var.j = gmqVar2;
        n260Var.k = dnqVarN6;
        n260Var.l = dnqVarN;
        n260Var.m = dnqVarN2;
        n260Var.n = this;
        n260Var.q = 2;
        Object objZ = Z(n260Var);
        if (objZ != wneVar) {
            gmq gmqVar8 = gmqVar;
            gmqVar3 = dnqVarN6;
            obj = objZ;
            gmqVar4 = gmqVar8;
            v360Var2 = this;
            gmq gmqVar9 = (gmq) obj;
            tz50Var = ((c260) D()).j;
            if (tz50Var instanceof rz50) {
                rz50Var = (rz50) tz50Var;
            } else {
                rz50Var = null;
            }
            if (rz50Var != null) {
                list = null;
            } else {
                list = null;
            }
            if (list != null) {
                z = true;
            } else {
                z = true;
            }
            iun iunVar4 = iun.f15405a;
            dnq dnqVarN7 = v360Var2.N(gmqVar9, z, iunVar4);
            gmq gmqVarT2 = T();
            tz50Var2 = ((c260) D()).j;
            if (tz50Var2 instanceof rz50) {
                rz50Var2 = (rz50) tz50Var2;
            } else {
                rz50Var2 = null;
            }
            if (rz50Var2 != null) {
                r7 = wcs0Var.f38939a;
            }
            if (r7 != 0) {
                z2 = true;
            } else {
                z2 = true;
            }
            lun lunVar2 = lun.f20680a;
            lunVar2.getClass();
            return i120.W(new pxt(new gmq[]{gmqVar4, gmqVar2, gmqVar3, dnqVarN, dnqVarN2, dnqVarN7, N(gmqVarT2, z2, new wcs0(iunVar4, lunVar2))}, (byte) 4));
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:67:0x0101  */
    /* JADX WARN: Code duplicated, block: B:68:0x0104  */
    /* JADX WARN: Code duplicated, block: B:73:0x0112  */
    /* JADX WARN: Code duplicated, block: B:79:0x011e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:82:0x0135  */
    /* JADX WARN: Code duplicated, block: B:83:0x0138  */
    /* JADX WARN: Code duplicated, block: B:90:0x014a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0156  */
    public final Object V(zje zjeVar) {
        o260 o260Var;
        v360 v360Var;
        oz50 oz50Var;
        oz50 oz50Var2;
        oz50 oz50Var3;
        dnq dnqVarN;
        gmq gmqVar;
        v360 v360Var2;
        nz50 nz50Var;
        nz50 nz50Var2;
        tz50 tz50Var;
        rz50 rz50Var;
        List list;
        boolean z;
        tz50 tz50Var2;
        rz50 rz50Var2;
        List list2;
        boolean z2;
        nz50 nz50Var3;
        wcs0 wcs0Var;
        nz50 nz50Var4;
        if (zjeVar instanceof o260) {
            o260Var = (o260) zjeVar;
            int i = o260Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                o260Var.n = i - Integer.MIN_VALUE;
            } else {
                o260Var = new o260(this, zjeVar);
            }
        } else {
            o260Var = new o260(this, zjeVar);
        }
        Object objW = o260Var.l;
        wne wneVar = wne.f39444a;
        int i2 = o260Var.n;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objW);
            o260Var.i = this;
            o260Var.n = 1;
            objW = W(false, o260Var);
            if (objW != wneVar) {
                v360Var = this;
            }
            return wneVar;
        }
        if (i2 == 1) {
            v360Var = (v360) o260Var.i;
            z1x.P(objW);
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            v360Var2 = o260Var.k;
            dnqVarN = o260Var.j;
            gmqVar = (gmq) o260Var.i;
            z1x.P(objW);
        }
        gmq gmqVar2 = (gmq) objW;
        tz50Var = ((c260) D()).j;
        if (tz50Var instanceof rz50) {
            rz50Var = (rz50) tz50Var;
        } else {
            rz50Var = null;
        }
        if (rz50Var != null || (nz50Var4 = rz50Var.g) == null) {
            list = null;
        } else {
            list = (List) m7x.B(nz50Var4);
        }
        if (list != null || list.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        iun iunVar = iun.f15405a;
        dnq dnqVarN2 = v360Var2.N(gmqVar2, z, iunVar);
        gmq gmqVarT = T();
        tz50Var2 = ((c260) D()).j;
        if (tz50Var2 instanceof rz50) {
            rz50Var2 = (rz50) tz50Var2;
        } else {
            rz50Var2 = null;
        }
        if (rz50Var2 != null || (nz50Var3 = rz50Var2.b) == null || (wcs0Var = (wcs0) m7x.B(nz50Var3)) == null) {
            list2 = null;
        } else {
            list2 = wcs0Var.f38939a;
        }
        if (list2 != null || list2.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        return i120.W(new vsg0(new g6q(new gmq[]{gmqVar, dnqVarN, dnqVarN2, N(gmqVarT, z2, new wcs0(iunVar, lunVar))}, yjeVar, (wdr) new psh(null), (byte) 12)));
        gmq gmqVar3 = (gmq) objW;
        tz50 tz50Var3 = ((c260) D()).j;
        rz50 rz50Var3 = tz50Var3 instanceof rz50 ? (rz50) tz50Var3 : null;
        List list3 = (rz50Var3 == null || (nz50Var2 = rz50Var3.e) == null) ? null : (List) m7x.B(nz50Var2);
        boolean z3 = (list3 == null || list3.isEmpty()) && (oz50Var = ((c260) D()).b) != null && oz50Var.e;
        iun iunVar2 = iun.f15405a;
        dnq dnqVarN3 = v360Var.N(gmqVar3, z3, iunVar2);
        gmq gmqVarS = S();
        tz50 tz50Var4 = ((c260) D()).j;
        rz50 rz50Var4 = tz50Var4 instanceof rz50 ? (rz50) tz50Var4 : null;
        List list4 = (rz50Var4 == null || (nz50Var = rz50Var4.f) == null) ? null : (List) m7x.B(nz50Var);
        dnqVarN = N(gmqVarS, (list4 == null || list4.isEmpty()) && (((oz50Var2 = ((c260) D()).b) != null && oz50Var2.g) || ((oz50Var3 = ((c260) D()).b) != null && oz50Var3.h)), iunVar2);
        o260Var.i = dnqVarN3;
        o260Var.j = dnqVarN;
        o260Var.k = this;
        o260Var.n = 2;
        Object objZ = Z(o260Var);
        if (objZ != wneVar) {
            gmqVar = dnqVarN3;
            objW = objZ;
            v360Var2 = this;
            gmq gmqVar4 = (gmq) objW;
            tz50Var = ((c260) D()).j;
            if (tz50Var instanceof rz50) {
                rz50Var = (rz50) tz50Var;
            } else {
                rz50Var = null;
            }
            if (rz50Var != null) {
                list = null;
            } else {
                list = null;
            }
            if (list != null) {
                z = true;
            } else {
                z = true;
            }
            iun iunVar3 = iun.f15405a;
            dnq dnqVarN4 = v360Var2.N(gmqVar4, z, iunVar3);
            gmq gmqVarT2 = T();
            tz50Var2 = ((c260) D()).j;
            if (tz50Var2 instanceof rz50) {
                rz50Var2 = (rz50) tz50Var2;
            } else {
                rz50Var2 = null;
            }
            if (rz50Var2 != null) {
                list2 = null;
            } else {
                list2 = null;
            }
            if (list2 != null) {
                z2 = true;
            } else {
                z2 = true;
            }
            lun lunVar2 = lun.f20680a;
            lunVar2.getClass();
            return i120.W(new vsg0(new g6q(new gmq[]{gmqVar, dnqVarN, dnqVarN4, N(gmqVarT2, z2, new wcs0(iunVar3, lunVar2))}, yjeVar, (wdr) new psh(null), (byte) 12)));
        }
        return wneVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object W(boolean z, zje zjeVar) {
        t260 t260Var;
        Object g0g0Var;
        v360 v360Var;
        if (zjeVar instanceof t260) {
            t260Var = (t260) zjeVar;
            int i = t260Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                t260Var.l = i - Integer.MIN_VALUE;
            } else {
                t260Var = new t260(this, zjeVar);
            }
        } else {
            t260Var = new t260(this, zjeVar);
        }
        Object obj = t260Var.j;
        wne wneVar = wne.f39444a;
        int i2 = t260Var.l;
        byte b = 12;
        try {
            if (i2 == 0) {
                z1x.P(obj);
                oz50 oz50Var = ((c260) D()).b;
                if (oz50Var == null || !oz50Var.e) {
                    return new eu4(iun.f15405a, b);
                }
                e0g0 e0g0Var = j0g0.b;
                if (z) {
                    o3c o3cVar = this.n0;
                    t260Var.i = this;
                    t260Var.l = 1;
                    if (o3c.p(o3cVar, false, t260Var, 3) == wneVar) {
                        return wneVar;
                    }
                }
                v360Var = this;
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                v360Var = t260Var.i;
                z1x.P(obj);
            }
            g0g0Var = v360Var.N.g();
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        return j0g0.a(g0g0Var) == null ? new s260((gmq) g0g0Var, this, (byte) 0) : new eu4(iun.f15405a, b);
    }

    public final gmq X(Throwable th) {
        return i120.W(new dnq(new m430(Y(), th, (byte) 4), new fe0(this, (Object) th, (yje) null, (byte) 13), (byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final fnq Y() {
        boolean z;
        boolean z2 = ((c260) D()).g;
        oz50 oz50Var = ((c260) D()).b;
        byte b = 0;
        if (oz50Var != null) {
            z = oz50Var.i;
        }
        return new fnq(this.C.M(z2, z), new z260(this, null, b), (byte) 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Z(zje zjeVar) {
        c360 c360Var;
        h6i h6iVar;
        if (zjeVar instanceof c360) {
            c360Var = (c360) zjeVar;
            int i = c360Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                c360Var.l = i - Integer.MIN_VALUE;
            } else {
                c360Var = new c360(this, zjeVar);
            }
        } else {
            c360Var = new c360(this, zjeVar);
        }
        Object obj = c360Var.j;
        wne wneVar = wne.f39444a;
        int i2 = c360Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            h6i h6iVar2 = this.G;
            c360Var.i = h6iVar2;
            c360Var.l = 1;
            Object objO = this.H.o(c360Var);
            if (objO == wneVar) {
                return wneVar;
            }
            h6iVar = h6iVar2;
            obj = objO;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            h6iVar = c360Var.i;
            z1x.P(obj);
        }
        return new s260(i120.W(h6iVar.g((List) obj)), this, (byte) 1);
    }

    public final void a0() {
        v3c.N(this.v0);
        this.v0 = sac.V(jiu0.a(this), new h260(this, (byte) 1), null, this.R.b, new fhq(this, null, (byte) 29), 10);
    }

    public final void b0(Throwable th) {
        H(new rj50((byte) 18));
        this.Z.b(th, new rj50((byte) 19));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c0(Throwable th, zje zjeVar) {
        f360 f360Var;
        if (zjeVar instanceof f360) {
            f360Var = (f360) zjeVar;
            int i = f360Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                f360Var.l = i - Integer.MIN_VALUE;
            } else {
                f360Var = new f360(this, zjeVar);
            }
        } else {
            f360Var = new f360(this, zjeVar);
        }
        Object objV = f360Var.j;
        Object obj = wne.f39444a;
        int i2 = f360Var.l;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objV);
            f360Var.i = th;
            f360Var.l = 1;
            objV = V(f360Var);
            if (objV == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            th = f360Var.i;
            z1x.P(objV);
        }
        return aoq.c((gmq) objV, new kh1(this, th, yjeVar, (byte) 12));
    }

    public final void d0(mlr mlrVar) {
        sac.V(jiu0.a(this), new jw50(1, this, v360.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 7), null, this.R.f22085a, new xr10(this, mlrVar, null, (byte) 29), 10);
    }

    public final void e0(long j) {
        nz50 nz50Var;
        List listA;
        Object next;
        d0t d0tVar;
        tz50 tz50Var = ((c260) D()).j;
        yje yjeVar = null;
        rz50 rz50Var = tz50Var instanceof rz50 ? (rz50) tz50Var : null;
        if (rz50Var == null || (nz50Var = rz50Var.g) == null || (listA = m7x.A(nz50Var)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            if (obj instanceof mxy) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((mxy) next).b.f5282a != j);
        mxy mxyVar = (mxy) next;
        if (mxyVar == null || (d0tVar = mxyVar.b) == null) {
            return;
        }
        sac.V(jiu0.a(this), null, null, this.R.f22085a, new j940(this, d0tVar, yjeVar, (byte) 21), 11);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f0(zje zjeVar) {
        n360 n360Var;
        if (zjeVar instanceof n360) {
            n360Var = (n360) zjeVar;
            int i = n360Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                n360Var.k = i - Integer.MIN_VALUE;
            } else {
                n360Var = new n360(this, zjeVar);
            }
        } else {
            n360Var = new n360(this, zjeVar);
        }
        Object objU = n360Var.i;
        Object obj = wne.f39444a;
        int i2 = n360Var.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objU);
            n360Var.k = 1;
            objU = U(n360Var);
            if (objU == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objU);
        }
        return aoq.c((gmq) objU, new eh2(this, yjeVar, (byte) 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r4v5, types: [a.vzg0] */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        nz50 nz50Var;
        List listA;
        nz50 nz50Var2;
        List listA2;
        Object next;
        Object next2;
        qbs0 qbs0Var;
        nz50 nz50Var3;
        wcs0 wcs0Var;
        List list;
        Object next3;
        nz50 nz50Var4;
        List listA3;
        nz50 nz50Var5;
        List listA4;
        Object value;
        nz50 nz50Var6;
        List listA5;
        Object value2;
        jz50 jz50Var = (jz50) obj;
        jz50Var.getClass();
        super.x(jz50Var);
        boolean z = jz50Var instanceof fy50;
        byte b = 6;
        byte b2 = 3;
        ifp ifpVar = this.U;
        byte b3 = 0;
        i1w0 i1w0Var = this.S;
        s31 s31Var = this.V;
        gg5 gg5Var = this.i0;
        if (z) {
            fy50 fy50Var = (fy50) jz50Var;
            if (fy50Var instanceof dy50) {
                j460 j460Var = ((dy50) fy50Var).f6878a;
                if (j460Var.equals(h460.f12420a)) {
                    i1w0Var.getClass();
                    k0w0 k0w0Var = new k0w0(i1w0Var);
                    ifpVar.getClass();
                    k0w0Var.h(new FavoritesInternalNavigation$favoriteDashboardViewedFragment$1());
                    ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
                    while (true) {
                        paw pawVar = (paw) listIteratorO;
                        if (!pawVar.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar.next());
                        }
                    }
                } else if (j460Var.equals(b460.f1944a)) {
                    s31Var.f(at2.AGGREGATOR);
                    gg5Var.a(g2p.AGGREGATOR);
                    i1w0Var.getClass();
                    k0w0 k0w0Var2 = new k0w0(i1w0Var);
                    k0w0Var2.h(this.m0.q(new gr1()));
                    ListIterator listIteratorO2 = b1j.o(i1w0Var, k0w0Var2.f17489a, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorO2;
                        if (!pawVar2.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar2.next());
                        }
                    }
                } else if (j460Var.equals(c460.f3710a)) {
                    i1w0Var.getClass();
                    k0w0 k0w0Var3 = new k0w0(i1w0Var);
                    ifpVar.getClass();
                    k0w0Var3.h(new FavoritesInternalNavigation$favoriteChampsDashboardFragment$1());
                    ListIterator listIteratorO3 = b1j.o(i1w0Var, k0w0Var3.f17489a, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorO3;
                        if (!pawVar3.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar3.next());
                        }
                    }
                } else if (j460Var.equals(g460.f10650a)) {
                    oz50 oz50Var = ((c260) D()).b;
                    if (oz50Var == null || !oz50Var.f) {
                        i1w0Var.getClass();
                        k0w0 k0w0Var4 = new k0w0(i1w0Var);
                        ifpVar.getClass();
                        k0w0Var4.h(new FavoritesInternalNavigation$favoriteTeamsDashboardFragment$1());
                        ListIterator listIteratorO4 = b1j.o(i1w0Var, k0w0Var4.f17489a, 0);
                        while (true) {
                            paw pawVar4 = (paw) listIteratorO4;
                            if (!pawVar4.hasNext()) {
                                return;
                            } else {
                                i1w0Var.a((oe50) pawVar4.next());
                            }
                        }
                    } else {
                        i1w0Var.getClass();
                        k0w0 k0w0Var5 = new k0w0(i1w0Var);
                        ifpVar.getClass();
                        k0w0Var5.h(new FavoritesInternalNavigation$getTeamBetTeamsScreen$1());
                        ListIterator listIteratorO5 = b1j.o(i1w0Var, k0w0Var5.f17489a, 0);
                        while (true) {
                            paw pawVar5 = (paw) listIteratorO5;
                            if (!pawVar5.hasNext()) {
                                return;
                            } else {
                                i1w0Var.a((oe50) pawVar5.next());
                            }
                        }
                    }
                } else if (j460Var.equals(d460.f5441a)) {
                    i1w0Var.getClass();
                    k0w0 k0w0Var6 = new k0w0(i1w0Var);
                    ifpVar.getClass();
                    k0w0Var6.h(new FavoritesInternalNavigation$favoriteTrackedDashboardFragment$1());
                    ListIterator listIteratorO6 = b1j.o(i1w0Var, k0w0Var6.f17489a, 0);
                    while (true) {
                        paw pawVar6 = (paw) listIteratorO6;
                        if (!pawVar6.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar6.next());
                        }
                    }
                } else if (j460Var.equals(i460.f14132a)) {
                    s31Var.f(at2.XGAMES);
                    gg5Var.a(g2p.XGAMES);
                    i1w0Var.d(new h260(this, b2));
                } else {
                    if (!j460Var.equals(e460.f7169a)) {
                        return;
                    }
                    i1w0Var.getClass();
                    k0w0 k0w0Var7 = new k0w0(i1w0Var);
                    ifpVar.getClass();
                    k0w0Var7.h(new FavoritesInternalNavigation$favoriteDashboardEventsFragment$1());
                    ListIterator listIteratorO7 = b1j.o(i1w0Var, k0w0Var7.f17489a, 0);
                    while (true) {
                        paw pawVar7 = (paw) listIteratorO7;
                        if (!pawVar7.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar7.next());
                        }
                    }
                }
            } else {
                if (!(fy50Var instanceof ey50)) {
                    if (fy50Var instanceof cy50) {
                        v88.b(this.v, i1w0Var, 0L, 6);
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                i1w0Var.getClass();
                k0w0 k0w0Var8 = new k0w0(i1w0Var);
                ifpVar.getClass();
                k0w0Var8.h(new FavoritesInternalNavigation$favoriteDashboardFiltersFragment$1());
                ListIterator listIteratorO8 = b1j.o(i1w0Var, k0w0Var8.f17489a, 0);
                while (true) {
                    paw pawVar8 = (paw) listIteratorO8;
                    if (!pawVar8.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar8.next());
                    }
                }
            }
        } else {
            boolean z2 = jz50Var instanceof ly50;
            byte b4 = 4;
            byte b5 = 20;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            mne mneVar = this.R;
            ?? r15 = 0;
            Object obj2 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj5 = null;
            str = null;
            str = null;
            str = null;
            String str = null;
            if (z2) {
                ly50 ly50Var = (ly50) jz50Var;
                if (ly50Var.equals(gy50.f12110a)) {
                    E();
                    return;
                }
                if (ly50Var.equals(hy50.f13845a)) {
                    v3c.N(this.w0);
                    this.w0 = i3t0.F(this, this.o0, null, null, new rj50(b5), 119);
                    c4m0 c4m0Var = this.u0;
                    if (c4m0Var == null || !c4m0Var.isActive()) {
                        this.u0 = slb.U(new dnq(new fnq(this.W.b(), new r360(this, r15, b3), b4), new qos((Object) this, (yje) r15, (byte) 21), (byte) 1), d5c.S(jiu0.a(this), mneVar.f22085a));
                        return;
                    }
                    return;
                }
                if (ly50Var.equals(jy50.f17344a)) {
                    v3c.N(this.v0);
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var.m(value2, c260.a((c260) value2, null, true, false, false, null, false, null, null, null, null, 262135)));
                    a0();
                    return;
                }
                if (!ly50Var.equals(ky50.f19092a)) {
                    if (ly50Var.equals(iy50.f15574a)) {
                        sac.V(jiu0.a(this), u360.f34982a, null, mneVar.b, new r360(this, r15, (byte) 2), 10);
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                bby bbyVar = this.w0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                c4m0 c4m0Var2 = this.u0;
                if (c4m0Var2 != null) {
                    c4m0Var2.cancel(null);
                }
                v3c.N(this.v0);
                return;
            }
            if (jz50Var instanceof by50) {
                by50 by50Var = (by50) jz50Var;
                if (by50Var instanceof yx50) {
                    s31Var.c(ys2.AGGREGATOR);
                    gg5Var.j(ldp.AGGREGATOR);
                    oz50 oz50Var2 = ((c260) D()).b;
                    if (oz50Var2 == null || !oz50Var2.g) {
                        i1w0Var.d(new h260(this, b3));
                        return;
                    } else {
                        i1w0Var.d(new h260(this, (byte) 7));
                        return;
                    }
                }
                if (by50Var instanceof ay50) {
                    long j = ((ay50) by50Var).f1655a;
                    tz50 tz50Var = ((c260) D()).j;
                    if (tz50Var instanceof rz50) {
                        List listA6 = m7x.A(((rz50) tz50Var).f);
                        for (Object obj6 : listA6) {
                            if (((mlr) obj6).f22006a == j) {
                                obj2 = obj6;
                                break;
                            }
                        }
                        mlr mlrVar = (mlr) obj2;
                        if (mlrVar == null) {
                            return;
                        }
                        sac.V(jiu0.a(this), new jw50(1, this, v360.class, "handleFavoriteClickError", "handleFavoriteClickError(Ljava/lang/Throwable;)V", 0, (byte) 10), null, mneVar.f22085a, new wmq((Object) this, (Object) mlrVar, (Object) tz50Var, (Object) listA6, (yje) null, (byte) 11), 10);
                        return;
                    }
                    return;
                }
                if (!(by50Var instanceof zx50)) {
                    t9f.b();
                    return;
                }
                long j2 = ((zx50) by50Var).f45142a;
                tz50 tz50Var2 = ((c260) D()).j;
                rz50 rz50Var = tz50Var2 instanceof rz50 ? (rz50) tz50Var2 : null;
                if (rz50Var == null || (nz50Var6 = rz50Var.f) == null || (listA5 = m7x.A(nz50Var6)) == null) {
                    return;
                }
                for (Object obj7 : listA5) {
                    if (((mlr) obj7).f22006a == j2) {
                        obj3 = obj7;
                        break;
                    }
                }
                mlr mlrVar2 = (mlr) obj3;
                if (mlrVar2 != null) {
                    d0(mlrVar2);
                    return;
                }
                return;
            }
            boolean z3 = jz50Var instanceof iz50;
            nn60 nn60Var = this.p0;
            if (z3) {
                iz50 iz50Var = (iz50) jz50Var;
                if (iz50Var instanceof ez50) {
                    if (!((ez50) iz50Var).f8657a.equals(on60.f25532a)) {
                        t9f.b();
                        return;
                    }
                    v3c.N(this.v0);
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value, c260.a((c260) value, null, false, false, false, null, true, null, null, null, null, 261631)));
                    return;
                }
                if (iz50Var instanceof gz50) {
                    i3t0.B(this, nn60Var, new en60[]{((gz50) iz50Var).f12164a});
                    return;
                }
                if (iz50Var instanceof cz50) {
                    cz50 cz50Var = (cz50) iz50Var;
                    tz50 tz50Var3 = ((c260) D()).j;
                    rz50 rz50Var2 = tz50Var3 instanceof rz50 ? (rz50) tz50Var3 : null;
                    if (rz50Var2 == null || (nz50Var5 = rz50Var2.e) == null || (listA4 = m7x.A(nz50Var5)) == null) {
                        return;
                    }
                    for (Object obj8 : listA4) {
                        if (((pbv) obj8).f26728a == cz50Var.f5210a) {
                            obj4 = obj8;
                            break;
                        }
                    }
                    pbv pbvVar = (pbv) obj4;
                    if (pbvVar != null) {
                        i3t0.B(this, nn60Var, new en60[]{new bn60(pbvVar, cz50Var.b, -1)});
                        return;
                    }
                    return;
                }
                if (!(iz50Var instanceof dz50)) {
                    if (iz50Var instanceof hz50) {
                        s31Var.f(at2.XGAMES);
                        gg5Var.a(g2p.XGAMES);
                        i1w0Var.d(new h260(this, (byte) 2));
                        return;
                    } else if (iz50Var instanceof fz50) {
                        a0();
                        return;
                    } else {
                        t9f.b();
                        return;
                    }
                }
                long j3 = ((dz50) iz50Var).f6925a;
                tz50 tz50Var4 = ((c260) D()).j;
                rz50 rz50Var3 = tz50Var4 instanceof rz50 ? (rz50) tz50Var4 : null;
                if (rz50Var3 == null || (nz50Var4 = rz50Var3.e) == null || (listA3 = m7x.A(nz50Var4)) == null) {
                    return;
                }
                for (Object obj9 : listA3) {
                    if (((pbv) obj9).f26728a == j3) {
                        obj5 = obj9;
                        break;
                    }
                }
                pbv pbvVar2 = (pbv) obj5;
                if (pbvVar2 != null) {
                    i3t0.B(this, nn60Var, new en60[]{new ym60(pbvVar2)});
                    return;
                }
                return;
            }
            if (!(jz50Var instanceof az50)) {
                if (!(jz50Var instanceof bz50)) {
                    t9f.b();
                    return;
                }
                bz50 bz50Var = (bz50) jz50Var;
                tdp tdpVar = bz50Var.f3450a;
                String str2 = bz50Var.b;
                if (tdpVar == null) {
                    return;
                }
                if (tdpVar instanceof qdp) {
                    e0(((qdp) tdpVar).f28546a);
                    return;
                }
                if (tdpVar instanceof sdp) {
                    long j4 = ((sdp) tdpVar).f32044a;
                    tz50 tz50Var5 = ((c260) D()).j;
                    rz50 rz50Var4 = tz50Var5 instanceof rz50 ? (rz50) tz50Var5 : null;
                    if (rz50Var4 == null || (nz50Var = rz50Var4.g) == null || (listA = m7x.A(nz50Var)) == null) {
                        return;
                    }
                    for (Object obj10 : listA) {
                        if (((oxy) obj10).a() == j4) {
                            r15 = obj10;
                            break;
                        }
                    }
                    oxy oxyVar = (oxy) r15;
                    if (oxyVar != null) {
                        if (oxyVar instanceof kxy) {
                            mlr mlrVar3 = new mlr(0L, 0L, 0L, 0L, "", "", "", (String) null, false, false, false, false, false, false, false, (List) iun.f15405a, false, 131200);
                            js0 js0Var = ((kxy) oxyVar).b;
                            d0(mlr.a(mlrVar3, js0Var.f17026a, js0Var.f, js0Var.e, null, js0Var.g, js0Var.h, js0Var.i, 247800));
                            return;
                        } else if (oxyVar instanceof lxy) {
                            nxy nxyVar = ((lxy) oxyVar).b;
                            i3t0.B(this, nn60Var, new en60[]{new bn60(new pbv(nxyVar.f24305a, iun.f15405a, nxyVar.b, hcs.NONE, nxyVar.c, "", false, false, false, false, false, false, false, nxyVar.d, false, nxyVar.e, nxyVar.f, false), str2, -1)});
                            return;
                        } else if (oxyVar instanceof mxy) {
                            e0(j4);
                            return;
                        } else {
                            t9f.b();
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            az50 az50Var = (az50) jz50Var;
            if (az50Var.equals(my50.f22589a)) {
                s31Var.c(ys2.CHAMPS);
                gg5Var.j(ldp.CHAMPS);
                i1w0Var.d(new h260(this, b));
                return;
            }
            if (az50Var.equals(ny50.f24314a)) {
                s31Var.c(ys2.TEAMS);
                gg5Var.j(ldp.TEAMS);
                i1w0Var.d(new h260(this, b4));
                return;
            }
            if (az50Var.equals(xy50.f41692a)) {
                i1w0Var.getClass();
                k0w0 k0w0Var9 = new k0w0(i1w0Var);
                ifpVar.getClass();
                k0w0Var9.h(new FavoritesInternalNavigation$getTeamBetTeamsScreen$1());
                ListIterator listIteratorO9 = b1j.o(i1w0Var, k0w0Var9.f17489a, 0);
                while (true) {
                    paw pawVar9 = (paw) listIteratorO9;
                    if (!pawVar9.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar9.next());
                    }
                }
            } else {
                boolean z4 = az50Var instanceof py50;
                ?? r4 = this.o;
                if (z4) {
                    qbs0 qbs0Var2 = ((py50) az50Var).f27791a;
                    long j5 = qbs0Var2.f28453a.f2368a;
                    mbs0 mbs0Var = qbs0Var2.b;
                    s4i0 s4i0Var = new s4i0(j5, mbs0Var.h);
                    p7m0 p7m0Var3 = ocjVar.f25029a;
                    while (true) {
                        Object value3 = p7m0Var3.getValue();
                        value3.getClass();
                        oyg0Var.getClass();
                        s4i0 s4i0Var2 = s4i0Var;
                        if (p7m0Var3.m(value3, c260.a((c260) value3, null, false, false, false, null, false, null, null, s4i0Var2, null, 196607))) {
                            r4.e("SELECTED_TRACK_COEF_KEY", s4i0Var2);
                            G(new y160(q0x.Z(ycm0.A(qbs0Var2.f28453a)), dj8.c0(mbs0Var)));
                            return;
                        }
                        s4i0Var = s4i0Var2;
                    }
                } else {
                    if (az50Var instanceof qy50) {
                        i3t0.K(this, null, null, new ffd(this, ((qy50) az50Var).f29519a, r15, (byte) 29), 3);
                        return;
                    }
                    if (az50Var.equals(ry50.f31297a)) {
                        s4i0 s4i0Var3 = ((c260) D()).p;
                        if (s4i0Var3 != null) {
                            tz50 tz50Var6 = ((c260) D()).j;
                            rz50 rz50Var5 = tz50Var6 instanceof rz50 ? (rz50) tz50Var6 : null;
                            if (rz50Var5 == null || (nz50Var3 = rz50Var5.b) == null || (wcs0Var = (wcs0) m7x.B(nz50Var3)) == null || (list = wcs0Var.f38939a) == null) {
                                qbs0Var = null;
                            } else {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        next3 = null;
                                        break;
                                    }
                                    next3 = it.next();
                                    qbs0 qbs0Var3 = (qbs0) next3;
                                    if (qbs0Var3.f28453a.f2368a == s4i0Var3.f31607a && qbs0Var3.b.h == s4i0Var3.b) {
                                        break;
                                    }
                                }
                                qbs0Var = (qbs0) next3;
                            }
                            if (qbs0Var == null) {
                                return;
                            }
                            i3t0.K(this, null, null, new r72(qbs0Var, this, r15, (byte) 13), 3);
                            return;
                        }
                        return;
                    }
                    if (az50Var instanceof sy50) {
                        m5p m5pVar = ((sy50) az50Var).f33011a;
                        i8i.D("menu", "other", s31Var.f31532a, "bet_favor_championship_opened");
                        gg5Var.f11237a.a(tx3.l0(new k1p[]{new i1p((byte) 2, m5pVar.f21231a), new j1p("other", (byte) 0)}), 3191L);
                        if (!(m5pVar.e instanceof qgb)) {
                            i1w0Var.d(new rw40(this, m5pVar, (byte) 18));
                            return;
                        }
                        Iterator it2 = this.Q.f20692a.a().iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it2.next();
                            lok0 lok0Var = (lok0) next2;
                            if (lok0Var.f20396a == m5pVar.d && lok0Var.t.contains(1)) {
                                break;
                            }
                        }
                        lok0 lok0Var2 = (lok0) next2;
                        if (lok0Var2 == null) {
                            sac.V(jiu0.a(this), new mb50((byte) 20), null, mneVar.b, new q360(m5pVar, this, null), 10);
                            return;
                        }
                        k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                        k0w0VarI.h(this.j0.h(lok0Var2.f20396a, lok0Var2.b));
                        ListIterator listIteratorO10 = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                        while (true) {
                            paw pawVar10 = (paw) listIteratorO10;
                            if (!pawVar10.hasNext()) {
                                return;
                            } else {
                                i1w0Var.a((oe50) pawVar10.next());
                            }
                        }
                    } else {
                        if (az50Var instanceof ty50) {
                            ty50 ty50Var = (ty50) az50Var;
                            tnp0 tnp0Var = ty50Var.f34737a;
                            String str3 = ty50Var.b;
                            i8i.D("menu", "other", s31Var.f31532a, "bet_favor_team_opened");
                            b1j.v("other", gg5Var.f11237a, 3190L);
                            long j6 = tnp0Var instanceof rnp0 ? ((rnp0) tnp0Var).c : 0L;
                            tz50 tz50Var7 = ((c260) D()).j;
                            rz50 rz50Var6 = tz50Var7 instanceof rz50 ? (rz50) tz50Var7 : null;
                            if (rz50Var6 != null && (nz50Var2 = rz50Var6.c) != null && (listA2 = m7x.A(nz50Var2)) != null) {
                                Iterator it3 = listA2.iterator();
                                do {
                                    if (!it3.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it3.next();
                                } while (((xcp) next).b.a() != tnp0Var.a());
                                xcp xcpVar = (xcp) next;
                                if (xcpVar != null) {
                                    str = xcpVar.i;
                                }
                            }
                            if (str == null) {
                                str = "";
                            }
                            i1w0Var.d(new fj1(this, tnp0Var, str3, j6, str));
                            return;
                        }
                        if (az50Var instanceof uy50) {
                            sac.V(jiu0.a(this), new jw50(1, this, v360.class, "handleFavoriteClickError", "handleFavoriteClickError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, mneVar.b, new j940(this, ((uy50) az50Var).f36474a, r15, (byte) 19), 10);
                            return;
                        }
                        if (az50Var instanceof zy50) {
                            i3t0.A(this, this.o0, ((zy50) az50Var).f45189a, null, null, 6);
                            return;
                        }
                        if (az50Var instanceof yy50) {
                            i3t0.A(this, this.o0, ebc.n0(((yy50) az50Var).f43452a), null, null, 6);
                            return;
                        }
                        if (az50Var instanceof wy50) {
                            sac.V(jiu0.a(this), new jw50(1, this, v360.class, "handleFavoriteClickError", "handleFavoriteClickError(Ljava/lang/Throwable;)V", 0, (byte) 9), null, mneVar.f22085a, new j940(this, ((wy50) az50Var).f39961a, r15, (byte) 20), 10);
                            return;
                        }
                        if (az50Var instanceof oy50) {
                            zia ziaVar = ((oy50) az50Var).f26046a;
                            if (ziaVar instanceof xia) {
                                G(v160.f36614a);
                                return;
                            }
                            if (ziaVar instanceof yia) {
                                G(w160.f38383a);
                                return;
                            } else if (ziaVar instanceof via) {
                                G(u160.f34888a);
                                return;
                            } else {
                                if (ziaVar.equals(wia.f39205a)) {
                                    return;
                                }
                                t9f.b();
                                return;
                            }
                        }
                        if (!(az50Var instanceof vy50)) {
                            t9f.b();
                            return;
                        }
                        qbs0 qbs0Var4 = ((vy50) az50Var).f38233a;
                        s4i0 s4i0Var4 = new s4i0(qbs0Var4.f28453a.f2368a, qbs0Var4.b.h);
                        p7m0 p7m0Var4 = ocjVar.f25029a;
                        while (true) {
                            Object value4 = p7m0Var4.getValue();
                            value4.getClass();
                            oyg0Var.getClass();
                            s4i0 s4i0Var5 = s4i0Var4;
                            if (p7m0Var4.m(value4, c260.a((c260) value4, null, false, false, false, null, false, null, null, null, s4i0Var5, 131071))) {
                                r4.e("REMOVING_TRACK_COEF_KEY", s4i0Var5);
                                G(a260.f109a);
                                return;
                            }
                            s4i0Var4 = s4i0Var5;
                        }
                    }
                }
            }
        }
    }
}
