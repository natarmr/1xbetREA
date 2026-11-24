package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.favorites.impl.FavoritesInternalNavigation$favoriteCategory$1;
import org.xplatform.favorites.impl.FavoritesInternalNavigation$getTeamBetTeamsScreen$1;
import org.xplatform.favorites.impl.presentation.adapters.models.FavoriteGroupHeaderUiItem;
import org.xplatform.favorites.impl.presentation.category.FavoriteCategoryUiState;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getChampionshipFragmentScreen$1;
import org.xplatform.ufc.impl.navigation.UfcScreensFactoryImpl$getFighterFragmentScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class ccp extends i3t0 {
    public static final /* synthetic */ int u0 = 0;
    public final phf0 A;
    public final kqc B;
    public final khf0 C;
    public final chf0 D;
    public final o470 E;
    public final luu F;
    public final ehf0 G;
    public final mne H;
    public final i1w0 I;
    public final hzg J;
    public final ifp K;
    public final s31 L;
    public final m1e M;
    public final j3c N;
    public final yzn0 O;
    public final duj P;
    public final ivn Q;
    public final oct R;
    public final r7v S;
    public final ix0 T;
    public final u58 U;
    public final svu V;
    public final msu W;
    public final gg5 X;
    public final y3v Y;
    public final f7u Z;
    public final r9u a0;
    public final rrc b0;
    public final vjp c0;
    public final fvt0 d0;
    public final nv20 e0;
    public final peg0 f0;
    public final a7q g0;
    public final o3c h0;
    public final hjd i0;
    public final nn60 j0;
    public final eyg0 k0;
    public final lbu l0;
    public final yoc m0;
    public final yoc n0;
    public final vzg0 o;
    public final kys0 o0;
    public final jdk0 p;
    public c4m0 p0;
    public final xr q;
    public bby q0;
    public final peg0 r;
    public bby r0;
    public final y78 s;
    public bby s0;
    public final ctf0 t;
    public bby t0;
    public final kd30 u;
    public final pru v;
    public final n4u w;
    public final z8u x;
    public final w5z y;
    public final zpu z;

    public ccp(vzg0 vzg0Var, jdk0 jdk0Var, xr xrVar, peg0 peg0Var, y78 y78Var, ctf0 ctf0Var, kd30 kd30Var, pru pruVar, n4u n4uVar, z8u z8uVar, w5z w5zVar, zpu zpuVar, phf0 phf0Var, kqc kqcVar, khf0 khf0Var, chf0 chf0Var, o470 o470Var, luu luuVar, ehf0 ehf0Var, mne mneVar, g2v g2vVar, i1w0 i1w0Var, hzg hzgVar, ifp ifpVar, s31 s31Var, m1e m1eVar, j3c j3cVar, yzn0 yzn0Var, duj dujVar, ivn ivnVar, oct octVar, r7v r7vVar, iqt iqtVar, ix0 ix0Var, u58 u58Var, svu svuVar, msu msuVar, gg5 gg5Var, y3v y3vVar, f7u f7uVar, r9u r9uVar, rrc rrcVar, vjp vjpVar, fvt0 fvt0Var, nv20 nv20Var, kc60 kc60Var, peg0 peg0Var2, a7q a7qVar, o3c o3cVar, hjd hjdVar, nn60 nn60Var, eyg0 eyg0Var, lbu lbuVar, yoc yocVar, yoc yocVar2, kys0 kys0Var) {
        ctf0Var.getClass();
        m1eVar.getClass();
        r9uVar.getClass();
        fbp fbpVar = new fbp(g2vVar, iqtVar, (byte) 0);
        bcn bcnVar = new bcn(ctf0Var, (byte) 9);
        vs10 vs10Var = mneVar.c;
        rwj rwjVar = mneVar.f22085a;
        super(null, fbpVar, bcnVar, cvm0.p(vs10Var, rwjVar), null);
        this.o = vzg0Var;
        this.p = jdk0Var;
        this.q = xrVar;
        this.r = peg0Var;
        this.s = y78Var;
        this.t = ctf0Var;
        this.u = kd30Var;
        this.v = pruVar;
        this.w = n4uVar;
        this.x = z8uVar;
        this.y = w5zVar;
        this.z = zpuVar;
        this.A = phf0Var;
        this.B = kqcVar;
        this.C = khf0Var;
        this.D = chf0Var;
        this.E = o470Var;
        this.F = luuVar;
        this.G = ehf0Var;
        this.H = mneVar;
        this.I = i1w0Var;
        this.J = hzgVar;
        this.K = ifpVar;
        this.L = s31Var;
        this.M = m1eVar;
        this.N = j3cVar;
        this.O = yzn0Var;
        this.P = dujVar;
        this.Q = ivnVar;
        this.R = octVar;
        this.S = r7vVar;
        this.T = ix0Var;
        this.U = u58Var;
        this.V = svuVar;
        this.W = msuVar;
        this.X = gg5Var;
        this.Y = y3vVar;
        this.Z = f7uVar;
        this.a0 = r9uVar;
        this.b0 = rrcVar;
        this.c0 = vjpVar;
        this.d0 = fvt0Var;
        this.e0 = nv20Var;
        this.f0 = peg0Var2;
        this.g0 = a7qVar;
        this.h0 = o3cVar;
        this.i0 = hjdVar;
        this.j0 = nn60Var;
        this.k0 = eyg0Var;
        this.l0 = lbuVar;
        this.m0 = yocVar;
        this.n0 = yocVar2;
        this.o0 = kys0Var;
        yje yjeVar = null;
        i3t0.K(this, null, null, new hr(this, yjeVar, (byte) 12), 3);
        byte b = 4;
        sac.T(new fnq(kc60Var.a(), new sxk(this, yjeVar, (byte) 13), b), d5c.S(jiu0.a(this), rwjVar), foe.h);
        i3t0.F(this, nn60Var, null, null, new jbp(b), 119);
    }

    public final lc00 M(List list, List list2, Pair pair, List list3) {
        Object obj = pair.b;
        lc00 lc00VarB = kotlin.collections.a.b();
        boolean zIsEmpty = list.isEmpty();
        ctf0 ctf0Var = this.t;
        if (!zIsEmpty) {
            lc00VarB.add(new q9p(ctf0Var.b.a(R.string.favorites_teams, Arrays.copyOf(new Object[0], 0)), list.size()));
        }
        if (!list2.isEmpty()) {
            lc00VarB.add(new m9p(ctf0Var.b.a(R.string.champs, Arrays.copyOf(new Object[0], 0)), list2.size()));
        }
        if (!((Collection) obj).isEmpty()) {
            ed80 ed80Var = ((dd80) D()).i;
            String str = ed80Var != null ? ed80Var.c : null;
            if (str == null) {
                str = "";
            }
            lc00VarB.add(new r9p(str, ((Collection) obj).size()));
        }
        if (!list3.isEmpty()) {
            ed80 ed80Var2 = ((dd80) D()).i;
            lc00VarB.add(new k9p((ed80Var2 == null || !ed80Var2.f) ? ctf0Var.b.a(R.string.cases_casino, Arrays.copyOf(new Object[0], 0)) : ctf0Var.b.a(R.string.virtual, Arrays.copyOf(new Object[0], 0)), list3.size()));
        }
        return kotlin.collections.a.a(lc00VarB);
    }

    public final String N(mlr mlrVar) {
        List list;
        hc80 hc80Var = ((dd80) D()).h;
        Integer numValueOf = null;
        ec80 ec80Var = hc80Var instanceof ec80 ? (ec80) hc80Var : null;
        if (ec80Var != null && (list = ec80Var.d) != null) {
            Iterator it = list.iterator();
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
        return this.k0.k(new lu0(0L, numValueOf, "bet_favor_other", hne.r(0L, "favorite")));
    }

    public final Pair O(Pair pair) {
        bby bbyVar;
        List list = (List) pair.b;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            pbv pbvVar = (pbv) obj;
            if (pbvVar.p || !pbvVar.q) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Long.valueOf(((pbv) it.next()).f26728a));
        }
        if (!arrayList2.isEmpty() && ((bbyVar = this.t0) == null || !bbyVar.isActive())) {
            this.t0 = sac.f0(jiu0.a(this), this.m0.a(), TimeUnit.MILLISECONDS, this.H.b, new hbp(this, (byte) 4), new j0l((Object) this, (Object) arrayList2, (yje) null, (byte) 19), 32);
        }
        Object obj2 = pair.f46059a;
        Iterable iterable = (Iterable) pair.b;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : iterable) {
            if (((pbv) obj3).q) {
                arrayList3.add(obj3);
            }
        }
        return new Pair(obj2, arrayList3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P(zje zjeVar) {
        nbp nbpVar;
        a1t a1tVarB;
        a1t a1tVarA;
        gmq eu4Var;
        a1t a1tVar;
        Throwable th;
        ccp ccpVar;
        Object g0g0Var;
        ed80 ed80Var;
        if (zjeVar instanceof nbp) {
            nbpVar = (nbp) zjeVar;
            int i = nbpVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                nbpVar.n = i - Integer.MIN_VALUE;
            } else {
                nbpVar = new nbp(this, zjeVar);
            }
        } else {
            nbpVar = new nbp(this, zjeVar);
        }
        Object obj = nbpVar.l;
        wne wneVar = wne.f39444a;
        int i2 = nbpVar.n;
        byte b = 12;
        int i3 = 3;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            a1tVarB = this.w.b();
            a1tVarA = this.x.a();
            ed80 ed80Var2 = ((dd80) D()).i;
            if (ed80Var2 == null || !ed80Var2.d) {
                iun iunVar = iun.f15405a;
                eu4Var = new eu4(new Pair(iunVar, iunVar), b);
            } else {
                try {
                    e0g0 e0g0Var = j0g0.b;
                    o3c o3cVar = this.h0;
                    nbpVar.i = this;
                    nbpVar.j = a1tVarB;
                    nbpVar.k = a1tVarA;
                    nbpVar.n = 1;
                    if (o3c.p(o3cVar, false, nbpVar, 3) == wneVar) {
                        return wneVar;
                    }
                    ccpVar = this;
                    a1tVar = a1tVarA;
                } catch (Throwable th2) {
                    a1tVar = a1tVarA;
                    th = th2;
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
            }
            ed80 ed80Var3 = ((dd80) D()).i;
            return i120.W(new vsg0(new g6q(new gmq[]{a1tVarB, a1tVarA, eu4Var, (!(ed80Var3 == null && ed80Var3.f) && ((ed80Var = ((dd80) D()).i) == null || !ed80Var.g)) ? new eu4(iun.f15405a, b) : new dnq(this.y.O(), new oz0(i3, yjeVar, (byte) 8), (byte) 1)}, yjeVar, (wdr) new obp(this, null), b)));
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        a1tVar = nbpVar.k;
        a1tVarB = nbpVar.j;
        ccpVar = nbpVar.i;
        try {
            z1x.P(obj);
        } catch (Throwable th3) {
            th = th3;
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        g0g0Var = ccpVar.z.g();
        e0g0 e0g0Var4 = j0g0.b;
        if (j0g0.a(g0g0Var) != null) {
            iun iunVar2 = iun.f15405a;
            g0g0Var = new eu4(new Pair(iunVar2, iunVar2), b);
        }
        a1t a1tVar2 = a1tVar;
        eu4Var = (gmq) g0g0Var;
        a1tVarA = a1tVar2;
        ed80 ed80Var4 = ((dd80) D()).i;
        return i120.W(new vsg0(new g6q(new gmq[]{a1tVarB, a1tVarA, eu4Var, (!(ed80Var4 == null && ed80Var4.f) && ((ed80Var = ((dd80) D()).i) == null || !ed80Var.g)) ? new eu4(iun.f15405a, b) : new dnq(this.y.O(), new oz0(i3, yjeVar, (byte) 8), (byte) 1)}, yjeVar, (wdr) new obp(this, null), b)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q(zje zjeVar) {
        sbp sbpVar;
        if (zjeVar instanceof sbp) {
            sbpVar = (sbp) zjeVar;
            int i = sbpVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                sbpVar.k = i - Integer.MIN_VALUE;
            } else {
                sbpVar = new sbp(this, zjeVar);
            }
        } else {
            sbpVar = new sbp(this, zjeVar);
        }
        Object objR = sbpVar.i;
        Object obj = wne.f39444a;
        int i2 = sbpVar.k;
        yje yjeVar = null;
        byte b = 1;
        if (i2 == 0) {
            z1x.P(objR);
            sbpVar.k = 1;
            f7u f7uVar = this.Z;
            f7uVar.getClass();
            lie0 lie0Var = new lie0();
            lie0Var.f20100a = System.currentTimeMillis();
            hie0 hie0Var = new hie0();
            hie0Var.f13108a = true;
            objR = ahb.R(new d2c(new p6d(((m0o0) ((ocl) f7uVar.c).f25032a).b(), bkb.h0(30L, TimeUnit.SECONDS, new atj(f7uVar, yjeVar, (byte) 21)), new c4u(3, yjeVar, (byte) 2), b), lie0Var, hie0Var, f7uVar, (byte) 2), new umu((byte) 11));
            if (objR == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objR);
        }
        return i120.W(new i89((gmq) objR, (byte) 19));
    }

    public final void R(Throwable th) {
        this.Q.f(th, new hbp(this, (byte) 3));
    }

    public final void S() {
        Object value;
        bby bbyVar = this.q0;
        yje yjeVar = null;
        if (bbyVar != null) {
            if (!bbyVar.isActive()) {
                bbyVar = null;
            }
            if (bbyVar != null) {
                bbyVar.cancel(null);
            }
        }
        if ((((dd80) D()).h instanceof dc80) && ((dd80) D()).f) {
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, dd80.a((dd80) value, false, false, false, false, false, false, gc80.f11047a, null, false, 8063)));
        }
        this.q0 = sac.V(jiu0.a(this), new k4p(1, this, ccp.class, "onDataLoadingError", "onDataLoadingError(Ljava/lang/Throwable;)V", 0, (byte) 13), null, this.H.b, new fr9(this, yjeVar, (byte) 27), 10);
    }

    public final void T(Throwable th) {
        Object value;
        wep wepVar = wep.b;
        r7v r7vVar = this.S;
        r7vVar.getClass();
        ((rrc) r7vVar.f29996a).J(wepVar, iun.f15405a);
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, dd80.a((dd80) value, false, false, false, false, false, true, new dc80(th, iun.f15405a), null, false, 7997)));
        this.P.b(th, new jbp((byte) 1));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object U(zje zjeVar) {
        ybp ybpVar;
        if (zjeVar instanceof ybp) {
            ybpVar = (ybp) zjeVar;
            int i = ybpVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ybpVar.k = i - Integer.MIN_VALUE;
            } else {
                ybpVar = new ybp(this, zjeVar);
            }
        } else {
            ybpVar = new ybp(this, zjeVar);
        }
        Object objP = ybpVar.i;
        Object obj = wne.f39444a;
        int i2 = ybpVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objP);
            ybpVar.k = 1;
            objP = P(ybpVar);
            if (objP == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objP);
        }
        return aoq.c((gmq) objP, new kh1((Object) this, yjeVar, (byte) 2));
    }

    /* JADX WARN: Code duplicated, block: B:168:0x03a8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1, types: [a.vzg0] */
    /* JADX WARN: Type inference failed for: r13v0, types: [a.gg5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        Object obj2;
        List list;
        String str;
        Object value;
        Object value2;
        Object next;
        List list2;
        rbb rbbVar;
        final boolean z;
        List list3;
        Object next2;
        List list4;
        Object value3;
        Object value4;
        Object value5;
        List list5;
        Object next3;
        Object next4;
        ac80 ac80Var = (ac80) obj;
        ac80Var.getClass();
        super.x(ac80Var);
        boolean z2 = ac80Var instanceof ob80;
        mne mneVar = this.H;
        ?? r9 = 0;
        Object obj3 = null;
        r9 = 0;
        r9 = 0;
        if (z2) {
            long j = ((ob80) ac80Var).f24966a;
            hc80 hc80Var = ((dd80) D()).h;
            if (hc80Var instanceof ec80) {
                Iterator it = ((ec80) hc80Var).d.iterator();
                do {
                    if (!it.hasNext()) {
                        next4 = null;
                        break;
                    }
                    next4 = it.next();
                } while (((mlr) next4).f22006a != j);
                mlr mlrVar = (mlr) next4;
                if (mlrVar == null) {
                    return;
                }
                sac.V(jiu0.a(this), new k4p(1, this, ccp.class, "handleFavoriteClickError", "handleFavoriteClickError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, mneVar.f22085a, new ofl((diu0) this, (Serializable) mlrVar, (Object) hc80Var, (yje) r9, (byte) 24), 10);
                return;
            }
            return;
        }
        if (ac80Var instanceof xa80) {
            E();
            return;
        }
        if (ac80Var instanceof nb80) {
            sac.V(jiu0.a(this), new k4p(1, this, ccp.class, "handleFavoriteClickError", "handleFavoriteClickError(Ljava/lang/Throwable;)V", 0, (byte) 16), null, mneVar.f22085a, new j0l((Object) this, (Object) ((nb80) ac80Var).f23228a, (yje) r9, (byte) 18), 10);
            return;
        }
        boolean z3 = ac80Var instanceof db80;
        final byte b = 0;
        i1w0 i1w0Var = this.I;
        s31 s31Var = this.L;
        ?? r13 = this.X;
        if (z3) {
            qc80 qc80Var = ((db80) ac80Var).f5791a;
            if (!qc80Var.equals(lc80.f19788a)) {
                if (qc80Var.equals(mc80.f21539a)) {
                    s31Var.f(at2.CHAMP);
                    r13.a(g2p.CHAMP);
                    i1w0Var.d(new hbp(this, (byte) 5));
                    return;
                } else {
                    if (qc80Var.equals(pc80.f26746a)) {
                        s31Var.f(at2.XGAMES);
                        r13.a(g2p.XGAMES);
                        i1w0Var.d(new hbp(this, (byte) 6));
                        return;
                    }
                    return;
                }
            }
            s31Var.f(at2.AGGREGATOR);
            r13.a(g2p.AGGREGATOR);
            i1w0Var.getClass();
            k0w0 k0w0Var = new k0w0(i1w0Var);
            k0w0Var.h(this.f0.q(new gr1()));
            ListIterator listIteratorO = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
            while (true) {
                paw pawVar = (paw) listIteratorO;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0Var.a((oe50) pawVar.next());
                }
            }
        } else {
            if (ac80Var instanceof cb80) {
                long j2 = ((cb80) ac80Var).f4050a;
                hc80 hc80Var2 = ((dd80) D()).h;
                ec80 ec80Var = hc80Var2 instanceof ec80 ? (ec80) hc80Var2 : null;
                if (ec80Var == null || (list5 = ec80Var.d) == null) {
                    return;
                }
                Iterator it2 = list5.iterator();
                do {
                    if (!it2.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it2.next();
                } while (((mlr) next3).f22006a != j2);
                mlr mlrVar2 = (mlr) next3;
                if (mlrVar2 == null) {
                    return;
                }
                sac.V(jiu0.a(this), new k4p(1, this, ccp.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, mneVar.f22085a, new sxk(this, mlrVar2, r9, (byte) 14), 10);
                return;
            }
            boolean z4 = ac80Var instanceof tb80;
            oyg0 oyg0Var = this.f;
            ocj ocjVar = this.i;
            if (z4) {
                bby bbyVar = this.q0;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value5 = p7m0Var.getValue();
                    value5.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var.m(value5, dd80.a((dd80) value5, true, false, false, false, true, false, null, null, false, 8157)));
                S();
                return;
            }
            byte b2 = 2;
            final byte b3 = 1;
            if (ac80Var instanceof ya80) {
                v3c.N(this.r0);
                this.r0 = i3t0.F(this, this.i0, null, null, new jbp(b), 119);
                c4m0 c4m0Var = this.p0;
                if (c4m0Var == null || !c4m0Var.isActive()) {
                    this.p0 = slb.U(new dnq(new fnq(this.M.b(), new lbp(this, r9, b2), (byte) 4), new xbp(this, r9, b3), (byte) 1), d5c.S(jiu0.a(this), mneVar.f22085a));
                    return;
                }
                return;
            }
            if (ac80Var instanceof yb80) {
                bby bbyVar2 = this.r0;
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                c4m0 c4m0Var2 = this.p0;
                if (c4m0Var2 != null) {
                    c4m0Var2.cancel(null);
                }
                bby bbyVar3 = this.q0;
                if (bbyVar3 != null) {
                    bbyVar3.cancel(null);
                }
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value4 = p7m0Var2.getValue();
                    value4.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var2.m(value4, dd80.a((dd80) value4, false, false, false, false, false, false, null, null, false, 8189)));
                return;
            }
            if (ac80Var instanceof bb80) {
                s31Var.c(ys2.AGGREGATOR);
                r13.j(ldp.AGGREGATOR);
                i1w0Var.d(new hbp(this, (byte) 7));
                return;
            }
            if (ac80Var instanceof kb80) {
                if (!((kb80) ac80Var).f18001a.equals(on60.f25532a)) {
                    t9f.b();
                    return;
                }
                bby bbyVar4 = this.q0;
                if (bbyVar4 != null) {
                    bbyVar4.cancel(null);
                }
                p7m0 p7m0Var3 = ocjVar.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    oyg0Var.getClass();
                } while (!p7m0Var3.m(value3, dd80.a((dd80) value3, false, false, false, false, false, true, null, null, false, 8127)));
                return;
            }
            boolean z5 = ac80Var instanceof rb80;
            nn60 nn60Var = this.j0;
            if (z5) {
                i3t0.B(this, nn60Var, new en60[]{((rb80) ac80Var).f30172a});
                return;
            }
            if (ac80Var instanceof jb80) {
                jb80 jb80Var = (jb80) ac80Var;
                hc80 hc80Var3 = ((dd80) D()).h;
                ec80 ec80Var2 = hc80Var3 instanceof ec80 ? (ec80) hc80Var3 : null;
                if (ec80Var2 == null || (list4 = ec80Var2.c) == null) {
                    return;
                }
                for (Object obj4 : list4) {
                    if (((pbv) obj4).f26728a == jb80Var.f16226a) {
                        obj3 = obj4;
                        break;
                    }
                }
                pbv pbvVar = (pbv) obj3;
                if (pbvVar != null) {
                    i3t0.B(this, nn60Var, new en60[]{new bn60(pbvVar, jb80Var.b, -1)});
                    return;
                }
                return;
            }
            boolean z6 = ac80Var instanceof ib80;
            pru pruVar = this.v;
            if (z6) {
                ib80 ib80Var = (ib80) ac80Var;
                final tnp0 tnp0Var = ib80Var.f14475a;
                final String str2 = ib80Var.b;
                i8i.D("menu", "other", s31Var.f31532a, "bet_favor_team_opened");
                b1j.v("other", r13.f11237a, 3190L);
                final long j3 = tnp0Var instanceof rnp0 ? ((rnp0) tnp0Var).c : 0L;
                hc80 hc80Var4 = ((dd80) D()).h;
                ec80 ec80Var3 = hc80Var4 instanceof ec80 ? (ec80) hc80Var4 : null;
                if (ec80Var3 != null && (list3 = ec80Var3.f7552a) != null) {
                    Iterator it3 = list3.iterator();
                    do {
                        if (!it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (((xcp) next2).b.a() != tnp0Var.a());
                    xcp xcpVar = (xcp) next2;
                    if (xcpVar != null) {
                        r9 = xcpVar.i;
                    }
                }
                if (r9 == 0) {
                    r9 = "";
                }
                if (pruVar.a().B0) {
                    ygp ygpVar = ygp.u;
                    r9u r9uVar = this.a0;
                    r9uVar.getClass();
                    j1q0 j1q0Var = r9uVar.f30104a;
                    j1q0Var.getClass();
                    if (j1q0Var.f15748a.d(ygpVar)) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                final boolean z7 = tnp0Var.c() == 189 && pruVar.a().c.d;
                final ?? r7 = r9;
                i1w0Var.d(new Function1() { // from class: a.kbp
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj5) {
                        FragmentScreen favoritesInternalNavigation$favoriteCategory$1;
                        k0w0 k0w0Var2 = (k0w0) obj5;
                        k0w0Var2.getClass();
                        boolean z8 = z;
                        ccp ccpVar = this;
                        tnp0 tnp0Var2 = tnp0Var;
                        String str3 = str2;
                        long j4 = j3;
                        if (z8) {
                            favoritesInternalNavigation$favoriteCategory$1 = ccpVar.K.a(tnp0Var2.a(), tnp0Var2, str3, tnp0Var2.c(), j4, r7);
                        } else if (z7) {
                            kys0 kys0Var = ccpVar.o0;
                            long jA = tnp0Var2.a();
                            kys0Var.getClass();
                            favoritesInternalNavigation$favoriteCategory$1 = new UfcScreensFactoryImpl$getFighterFragmentScreen$1(jA);
                        } else {
                            ifp ifpVar = ccpVar.K;
                            FavoriteCategoryUiState.Team team = new FavoriteCategoryUiState.Team(tnp0Var2.a(), tnp0Var2.c(), j4, str3);
                            ifpVar.getClass();
                            favoritesInternalNavigation$favoriteCategory$1 = new FavoritesInternalNavigation$favoriteCategory$1(ifpVar, team);
                        }
                        k0w0Var2.h(favoritesInternalNavigation$favoriteCategory$1);
                        return Unit.f46060a;
                    }
                });
                return;
            }
            if (ac80Var instanceof mb80) {
                sac.V(jiu0.a(this), new k4p(1, this, ccp.class, "handleFavoriteClickError", "handleFavoriteClickError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, mneVar.b, new j0l((Object) this, (Object) ((mb80) ac80Var).f21496a, (yje) r9, (byte) 17), 10);
                return;
            }
            if (ac80Var instanceof eb80) {
                int i = ((eb80) ac80Var).f7508a;
                hc80 hc80Var5 = ((dd80) D()).h;
                ec80 ec80Var4 = hc80Var5 instanceof ec80 ? (ec80) hc80Var5 : null;
                if (ec80Var4 == null || (list2 = ec80Var4.e) == null || (rbbVar = (rbb) CollectionsKt.W(i, list2)) == null) {
                    return;
                }
                boolean z8 = rbbVar.l;
                long j4 = rbbVar.f30176a;
                long j5 = rbbVar.n;
                ygs ygsVar = (ygs) CollectionsKt.firstOrNull(rbbVar.p);
                npn npnVar = new npn(j4, j5, ygsVar != null ? Long.valueOf(ygsVar.B) : null, rbbVar.m);
                bby bbyVar5 = this.s0;
                if (bbyVar5 == null || !bbyVar5.isActive()) {
                    this.s0 = sac.V(jiu0.a(this), new k4p(1, this, ccp.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, null, new xj1(z8, (Object) this, (Object) npnVar, (yje) r9, (byte) 7), 14);
                    return;
                }
                return;
            }
            yje yjeVar = null;
            if (ac80Var instanceof za80) {
                s31Var.c(ys2.CHAMPS);
                r13.j(ldp.CHAMPS);
                i1w0Var.d(new hbp(this, (byte) 8));
                return;
            }
            if (ac80Var instanceof ab80) {
                s31Var.c(ys2.TEAMS);
                r13.j(ldp.TEAMS);
                i1w0Var.d(new hbp(this, b));
                return;
            }
            if (ac80Var instanceof qb80) {
                k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
                this.K.getClass();
                k0w0VarI.h(new FavoritesInternalNavigation$getTeamBetTeamsScreen$1());
                ListIterator listIteratorO2 = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO2;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                }
            } else {
                if (ac80Var instanceof sb80) {
                    s31Var.f(at2.XGAMES);
                    r13.a(g2p.XGAMES);
                    i1w0Var.d(new hbp(this, b2));
                    return;
                }
                if (ac80Var instanceof hb80) {
                    final m5p m5pVar = ((hb80) ac80Var).f12759a;
                    i8i.D("menu", "other", s31Var.f31532a, "bet_favor_championship_opened");
                    r13.f11237a.a(tx3.l0(new k1p[]{new i1p((byte) 2, m5pVar.f21231a), new j1p("other", (byte) 0)}), 3191L);
                    if (pruVar.a().c.d && m5pVar.b == 189 && m5pVar.l > 0) {
                        i1w0Var.d(new Function1(this) { // from class: a.gbp
                            public final /* synthetic */ ccp b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                byte b4 = b3;
                                m5p m5pVar2 = m5pVar;
                                ccp ccpVar = this.b;
                                k0w0 k0w0Var2 = (k0w0) obj5;
                                switch (b4) {
                                    case 0:
                                        k0w0Var2.getClass();
                                        ifp ifpVar = ccpVar.K;
                                        FavoriteCategoryUiState.Championship championship = new FavoriteCategoryUiState.Championship(m5pVar2.f21231a, m5pVar2.f);
                                        ifpVar.getClass();
                                        k0w0Var2.h(new FavoritesInternalNavigation$favoriteCategory$1(ifpVar, championship));
                                        break;
                                    default:
                                        k0w0Var2.getClass();
                                        kys0 kys0Var = ccpVar.o0;
                                        long jB = m5pVar2.e.b();
                                        String str3 = m5pVar2.f;
                                        kys0Var.getClass();
                                        k0w0Var2.h(new UfcScreensFactoryImpl$getChampionshipFragmentScreen$1(jB, str3));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        return;
                    }
                    if (!(m5pVar.e instanceof qgb)) {
                        i1w0Var.d(new Function1(this) { // from class: a.gbp
                            public final /* synthetic */ ccp b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj5) {
                                byte b4 = b;
                                m5p m5pVar2 = m5pVar;
                                ccp ccpVar = this.b;
                                k0w0 k0w0Var2 = (k0w0) obj5;
                                switch (b4) {
                                    case 0:
                                        k0w0Var2.getClass();
                                        ifp ifpVar = ccpVar.K;
                                        FavoriteCategoryUiState.Championship championship = new FavoriteCategoryUiState.Championship(m5pVar2.f21231a, m5pVar2.f);
                                        ifpVar.getClass();
                                        k0w0Var2.h(new FavoritesInternalNavigation$favoriteCategory$1(ifpVar, championship));
                                        break;
                                    default:
                                        k0w0Var2.getClass();
                                        kys0 kys0Var = ccpVar.o0;
                                        long jB = m5pVar2.e.b();
                                        String str3 = m5pVar2.f;
                                        kys0Var.getClass();
                                        k0w0Var2.h(new UfcScreensFactoryImpl$getChampionshipFragmentScreen$1(jB, str3));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        return;
                    }
                    Iterator it4 = this.F.f20692a.a().iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                        lok0 lok0Var = (lok0) next;
                        if (lok0Var.f20396a == m5pVar.d && lok0Var.t.contains(1)) {
                            break;
                        }
                    }
                    lok0 lok0Var2 = (lok0) next;
                    if (lok0Var2 == null) {
                        sac.V(jiu0.a(this), new e4p((byte) 16), null, null, new bcp(m5pVar, this, null), 14);
                        return;
                    }
                    k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
                    k0w0VarI2.h(this.Y.h(lok0Var2.f20396a, lok0Var2.b));
                    ListIterator listIteratorO3 = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
                    while (true) {
                        paw pawVar3 = (paw) listIteratorO3;
                        if (!pawVar3.hasNext()) {
                            return;
                        } else {
                            i1w0Var.a((oe50) pawVar3.next());
                        }
                    }
                } else {
                    if (ac80Var instanceof pb80) {
                        p7m0 p7m0Var4 = ocjVar.f25029a;
                        do {
                            value2 = p7m0Var4.getValue();
                            value2.getClass();
                            oyg0Var.getClass();
                        } while (!p7m0Var4.m(value2, dd80.a((dd80) value2, false, false, false, false, false, false, null, null, false, 8187)));
                        return;
                    }
                    if (!(ac80Var instanceof zb80)) {
                        if (ac80Var instanceof ub80) {
                            p7m0 p7m0Var5 = ocjVar.f25029a;
                            do {
                                value = p7m0Var5.getValue();
                                value.getClass();
                                oyg0Var.getClass();
                            } while (!p7m0Var5.m(value, dd80.a((dd80) value, false, true, false, false, false, false, null, null, false, 8187)));
                            return;
                        }
                        if (ac80Var instanceof xb80) {
                            i3t0.A(this, this.i0, ((xb80) ac80Var).f40590a, null, null, 6);
                            return;
                        }
                        if (ac80Var instanceof wb80) {
                            i3t0.A(this, this.i0, ebc.n0(((wb80) ac80Var).f38863a), null, null, 6);
                            return;
                        }
                        boolean z9 = ac80Var instanceof gb80;
                        ?? r11 = this.o;
                        if (z9) {
                            Iterable iterable = (List) r11.a("CLEAR_GROUPS_LIST_ITEM");
                            if (iterable == null) {
                                iterable = iun.f15405a;
                            }
                            agp agpVar = agp.OTHER;
                            ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                            Iterator it5 = iterable.iterator();
                            while (it5.hasNext()) {
                                arrayList.add(pfp.b((FavoriteGroupHeaderUiItem) it5.next()));
                            }
                            r13.getClass();
                            s1p s1pVar = r13.f11237a;
                            yni0 yni0Var = new yni0();
                            yni0Var.add(new j1p("other", (byte) 0));
                            ArrayList arrayList2 = new ArrayList();
                            for (Object obj5 : arrayList) {
                                if (((ofp) obj5) != ofp.UNKNOWN) {
                                    arrayList2.add(obj5);
                                }
                            }
                            if (!arrayList2.isEmpty()) {
                                yni0Var.add(new j1p(CollectionsKt.b0(arrayList2, null, null, null, new e4p((byte) 11), 31), (byte) 1));
                            }
                            s1pVar.a(cui0.a(yni0Var), 3188L);
                            bt2[] bt2VarArr = bt2.f3160a;
                            ArrayList arrayList3 = new ArrayList(r3d.q(iterable, 10));
                            Iterator it6 = iterable.iterator();
                            while (it6.hasNext()) {
                                arrayList3.add(pfp.a((FavoriteGroupHeaderUiItem) it6.next()));
                            }
                            s31Var.getClass();
                            s31Var.f31532a.a("bet_favor_clear_decline", xp20.f(new Pair("menu", "other"), new Pair("option", CollectionsKt.b0(arrayList3, null, null, null, new e4p((byte) 25), 31))));
                            r11.e("CLEAR_GROUPS_LIST_ITEM", iun.f15405a);
                            return;
                        }
                        if (!(ac80Var instanceof fb80)) {
                            if (!(ac80Var instanceof vb80)) {
                                if (ac80Var instanceof lb80) {
                                    S();
                                    return;
                                } else {
                                    t9f.b();
                                    return;
                                }
                            }
                            List list6 = ((vb80) ac80Var).f37129a;
                            G(ad80.f666a);
                            r11.e("CLEAR_GROUPS_LIST_ITEM", list6);
                            agp agpVar2 = agp.OTHER;
                            ArrayList arrayList4 = new ArrayList(r3d.q(list6, 10));
                            Iterator it7 = list6.iterator();
                            while (it7.hasNext()) {
                                arrayList4.add(pfp.b((FavoriteGroupHeaderUiItem) it7.next()));
                            }
                            r13.getClass();
                            s1p s1pVar2 = r13.f11237a;
                            yni0 yni0Var2 = new yni0();
                            yni0Var2.add(new j1p("other", (byte) 0));
                            ArrayList arrayList5 = new ArrayList();
                            for (Object obj6 : arrayList4) {
                                if (((ofp) obj6) != ofp.UNKNOWN) {
                                    arrayList5.add(obj6);
                                }
                            }
                            if (!arrayList5.isEmpty()) {
                                yni0Var2.add(new j1p(CollectionsKt.b0(arrayList5, null, null, null, new e4p((byte) 12), 31), (byte) 1));
                            }
                            s1pVar2.a(cui0.a(yni0Var2), 3187L);
                            bt2[] bt2VarArr2 = bt2.f3160a;
                            ArrayList arrayList6 = new ArrayList(r3d.q(list6, 10));
                            Iterator it8 = list6.iterator();
                            while (it8.hasNext()) {
                                arrayList6.add(pfp.a((FavoriteGroupHeaderUiItem) it8.next()));
                            }
                            s31Var.getClass();
                            s31Var.f31532a.a("bet_favor_clear_call", xp20.f(new Pair("menu", "other"), new Pair("option", CollectionsKt.b0(arrayList6, null, null, null, new e4p((byte) 26), 31))));
                            return;
                        }
                        List list7 = (List) r11.a("CLEAR_GROUPS_LIST_ITEM");
                        if (list7 == null) {
                            list7 = iun.f15405a;
                        }
                        if (list7.isEmpty()) {
                            return;
                        }
                        if (list7.isEmpty()) {
                            obj2 = "option";
                            str = "CLEAR_GROUPS_LIST_ITEM";
                            list = list7;
                            sac.V(jiu0.a(this), new k4p(1, this, ccp.class, "handleFavoriteClickError", "handleFavoriteClickError(Ljava/lang/Throwable;)V", 0, (byte) 12), new ibp(this, b), mneVar.f22085a, new mbp(this, list, null), 8);
                        } else {
                            Iterator it9 = list7.iterator();
                            while (true) {
                                if (!it9.hasNext()) {
                                    obj2 = "option";
                                    str = "CLEAR_GROUPS_LIST_ITEM";
                                    list = list7;
                                    sac.V(jiu0.a(this), new k4p(1, this, ccp.class, "handleFavoriteClickError", "handleFavoriteClickError(Ljava/lang/Throwable;)V", 0, (byte) 12), new ibp(this, b), mneVar.f22085a, new mbp(this, list, null), 8);
                                } else if (((FavoriteGroupHeaderUiItem) it9.next()) instanceof FavoriteGroupHeaderUiItem.All) {
                                    obj2 = "option";
                                    sac.V(jiu0.a(this), new k4p(1, this, ccp.class, "handleFavoriteClickError", "handleFavoriteClickError(Ljava/lang/Throwable;)V", 0, (byte) 9), null, mneVar.f22085a, new atj(this, yjeVar, (byte) 3), 10);
                                    list = list7;
                                    str = "CLEAR_GROUPS_LIST_ITEM";
                                } else {
                                    b = b;
                                    yjeVar = yjeVar;
                                }
                            }
                        }
                        agp agpVar3 = agp.OTHER;
                        ArrayList arrayList7 = new ArrayList(r3d.q(list, 10));
                        Iterator it10 = list.iterator();
                        while (it10.hasNext()) {
                            arrayList7.add(pfp.b((FavoriteGroupHeaderUiItem) it10.next()));
                        }
                        r13.b(agpVar3, arrayList7);
                        bt2[] bt2VarArr3 = bt2.f3160a;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list, 10));
                        Iterator it11 = list.iterator();
                        while (it11.hasNext()) {
                            arrayList8.add(pfp.a((FavoriteGroupHeaderUiItem) it11.next()));
                        }
                        s31Var.getClass();
                        s31Var.f31532a.a("bet_favor_clear_done", xp20.f(new Pair("menu", "other"), new Pair(obj2, CollectionsKt.b0(arrayList8, null, null, null, new e4p((byte) 24), 31))));
                        r11.e(str, iun.f15405a);
                        return;
                    }
                    boolean z10 = ((zb80) ac80Var).f44103a;
                    p7m0 p7m0Var6 = ocjVar.f25029a;
                    while (true) {
                        Object value6 = p7m0Var6.getValue();
                        value6.getClass();
                        oyg0Var.getClass();
                        boolean z11 = z10;
                        if (p7m0Var6.m(value6, dd80.a((dd80) value6, false, false, z10, false, false, false, null, null, false, 8183))) {
                            return;
                        } else {
                            z10 = z11;
                        }
                    }
                }
            }
        }
    }
}
