package a;

import android.gov.nist.javax.sip.parser.TokenTypes;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class a01 extends i3t0 {
    public static final /* synthetic */ int M = 0;
    public final mne A;
    public final uf3 B;
    public final g2v C;
    public final cyu D;
    public final duj E;
    public final m1e F;
    public final iqt G;
    public final eyg0 H;
    public final ytt I;
    public c4m0 J;
    public bby K;
    public bby L;
    public final peg0 o;
    public final ouu p;
    public final i1w0 q;
    public final u58 r;
    public final s31 s;
    public final wdu t;
    public final ali u;
    public final ouu v;
    public final ort w;
    public final xex x;
    public final zn00 y;
    public final ctf0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a01(vzg0 vzg0Var, peg0 peg0Var, ouu ouuVar, i1w0 i1w0Var, u58 u58Var, s31 s31Var, wdu wduVar, ali aliVar, ouu ouuVar2, ort ortVar, xex xexVar, zn00 zn00Var, ctf0 ctf0Var, mne mneVar, uf3 uf3Var, g2v g2vVar, cyu cyuVar, duj dujVar, m1e m1eVar, iqt iqtVar, bzt bztVar, eyg0 eyg0Var, ytt yttVar, pru pruVar) {
        super(new hc0(pruVar, (byte) 2), cvm0.p(mneVar.c, mneVar.f22085a), new ce0(bztVar, (byte) 1), (yzn0) null);
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = peg0Var;
        this.p = ouuVar;
        this.q = i1w0Var;
        this.r = u58Var;
        this.s = s31Var;
        this.t = wduVar;
        this.u = aliVar;
        this.v = ouuVar2;
        this.w = ortVar;
        this.x = xexVar;
        this.y = zn00Var;
        this.z = ctf0Var;
        this.A = mneVar;
        this.B = uf3Var;
        this.C = g2vVar;
        this.D = cyuVar;
        this.E = dujVar;
        this.F = m1eVar;
        this.G = iqtVar;
        this.H = eyg0Var;
        this.I = yttVar;
    }

    public static ArrayList P(g9h0 g9h0Var) {
        Iterable iterable;
        if (g9h0Var instanceof b9h0) {
            iterable = ((b9h0) g9h0Var).f2209a;
        } else if (g9h0Var instanceof i8h0) {
            iterable = ((i8h0) g9h0Var).f14338a;
        } else {
            iterable = g9h0Var instanceof e8h0 ? ((e8h0) g9h0Var).f7372a : iun.f15405a;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj instanceof ly0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ly0) it.next()).d);
        }
        return arrayList2;
    }

    public static boolean T(j8b j8bVar) {
        long j = j8bVar.f16074a;
        if (j == -1) {
            return true;
        }
        long j2 = j8bVar.f;
        if (j2 == -1) {
            return true;
        }
        s0s s0sVar = s0s.ONE_X_LIVE_AGGREGATOR;
        return j == -1 || j2 == -1;
    }

    public static void V(a01 a01Var, boolean z) {
        bby bbyVar = a01Var.L;
        boolean z2 = bbyVar == null;
        if (bbyVar != null) {
            e3c.n(bbyVar);
        }
        a01Var.L = sac.V(jiu0.a(a01Var), new t90(1, a01Var, a01.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 26), null, a01Var.A.b, new wz0(z2, a01Var, z, null, (byte) 0), 10);
    }

    public final a4x M(List list, boolean z, boolean z2) {
        Iterator it;
        boolean z3;
        ot0 ot0Var;
        m0x m0xVar;
        ot0 ot0Var2;
        sso0 uqo0Var;
        nur murVar;
        a01 a01Var = this;
        jo20 jo20Var = new jo20();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            for (mlr mlrVar : ((j8b) it2.next()).c) {
                jo20Var.put(Long.valueOf(mlrVar.f22006a), mlrVar);
            }
        }
        jo20 jo20VarB = jo20Var.b();
        p7m0 p7m0Var = a01Var.i.f25029a;
        while (true) {
            Object value = p7m0Var.getValue();
            value.getClass();
            a01Var.f.getClass();
            if (p7m0Var.m(value, hz0.a((hz0) value, null, null, null, null, false, 0, jo20VarB, 895))) {
                break;
            }
            a01Var = this;
        }
        int i = 10;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            j8b j8bVar = (j8b) it3.next();
            ot0 ot0Var3 = ((hz0) a01Var.D()).i;
            boolean z4 = ((hz0) a01Var.D()).d;
            List list2 = ((hz0) a01Var.D()).e;
            j8bVar.getClass();
            list2.getClass();
            ctf0 ctf0Var = a01Var.z;
            ctf0Var.getClass();
            List<mlr> list3 = j8bVar.c;
            ArrayList arrayList2 = new ArrayList(r3d.q(list3, i));
            for (mlr mlrVar2 : list3) {
                if (list2.isEmpty()) {
                    it = it3;
                    z3 = false;
                    break;
                }
                Iterator it4 = list2.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        it = it3;
                        z3 = false;
                        break;
                    }
                    it = it3;
                    if (((mlr) it4.next()).f22006a == mlrVar2.f22006a) {
                        z3 = true;
                        break;
                    }
                    it3 = it;
                }
                Integer numValueOf = Integer.valueOf((int) j8bVar.f16074a);
                mlrVar2.getClass();
                boolean z5 = mlrVar2.k;
                int i2 = z4 ? R.drawable.ic_games_placeholder : R.drawable.ic_aggregator_placeholder;
                boolean z6 = mlrVar2.j;
                String strA = z5 ? ctf0Var.b.a(R.string.casino_promo_game_label, Arrays.copyOf(new Object[0], 0)) : z6 ? ctf0Var.b.a(R.string.casino_new_game_label, Arrays.copyOf(new Object[0], 0)) : "";
                long j = mlrVar2.f22006a;
                String str = mlrVar2.f;
                String str2 = mlrVar2.e;
                mtr mtrVar = new mtr(z2 ? z3 ? R.drawable.ic_favorites_slots_checked : R.drawable.ic_favorites_slots_unchecked : 0, z3);
                n0x n0xVar = new n0x(mlrVar2.g);
                m0x m0xVar2 = new m0x(i2, null, 6);
                if (strA.length() == 0) {
                    murVar = lur.f20686a;
                    m0xVar = m0xVar2;
                } else {
                    ot0 ot0Var4 = ot0.BACKGROUND_L;
                    if ((ot0Var3 == ot0Var4 && z5) || (ot0Var3 == (ot0Var = ot0.GRADIENT) && z5)) {
                        m0xVar = m0xVar2;
                    } else {
                        m0xVar = m0xVar2;
                        ot0 ot0Var5 = ot0.TRANSPARENCY;
                        if (ot0Var3 != ot0Var5 || !z5) {
                            if ((ot0Var3 == ot0Var4 && z6) || ((ot0Var3 == ot0Var && z6) || (ot0Var3 == ot0Var5 && z6))) {
                                d4d d4dVar = d4d.PRIMARY;
                                uqo0Var = new eqo0();
                            } else {
                                ot0 ot0Var6 = ot0.BACKGROUND_S;
                                uqo0Var = ((ot0Var3 == ot0Var6 && z5) || (ot0Var3 == (ot0Var2 = ot0.HORIZONTAL_BACKGROUND) && z5)) ? kro0.f18776a : ((ot0Var3 == ot0Var6 && z6) || (ot0Var3 == ot0Var2 && z6)) ? dqo0.f6527a : new uqo0(d4d.BACKGROUND);
                            }
                        }
                        murVar = new mur(strA, uqo0Var);
                    }
                    d4d d4dVar2 = d4d.PRIMARY;
                    uqo0Var = new lro0();
                    murVar = new mur(strA, uqo0Var);
                }
                arrayList2.add(new st0(j, str, str2, mtrVar, n0xVar, m0xVar, numValueOf, murVar));
                it3 = it;
                list2 = list2;
            }
            arrayList.add(new ly0(new zll(x4d0.g0(ot0Var3), new wll(o0s.f24443a), arrayList2), z, z4, j8bVar));
            a01Var = this;
            it3 = it3;
            i = 10;
        }
        return dyb.o0(arrayList);
    }

    public final Integer N(long j, long j2) {
        Object next;
        List list;
        Iterator it = P(((hz0) D()).b).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((j8b) next).f16074a != j2);
        j8b j8bVar = (j8b) next;
        if (j8bVar != null && (list = j8bVar.c) != null) {
            Iterator it2 = list.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                }
                if (((mlr) it2.next()).f22006a == j) {
                    break;
                }
                i++;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (i < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return kng0.e(1, numValueOf);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0096  */
    public final String O(mlr mlrVar, long j) {
        Object next;
        j8b j8bVar;
        Integer numE;
        List listA;
        List list;
        Object next2;
        g9h0 g9h0Var = ((hz0) D()).b;
        ArrayList arrayListP = P(g9h0Var);
        Iterator it = arrayListP.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((j8b) next).f16074a != j);
        j8b j8bVar2 = (j8b) next;
        if (j8bVar2 == null) {
            j8bVar = null;
        } else if (T(j8bVar2)) {
            j8bVar = j8bVar2;
        } else {
            Iterator it2 = arrayListP.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
                j8b j8bVar3 = (j8b) next2;
                if (j8bVar3.d == j8bVar2.d) {
                    long j2 = j8bVar3.f16074a;
                    if (j2 != -1 && j8bVar3.f == j2) {
                        break;
                    }
                }
            }
            j8bVar = (j8b) next2;
            if (j8bVar == null) {
                j8bVar = j8bVar2;
            }
        }
        if (j8bVar2 == null || (list = j8bVar2.c) == null) {
            numE = null;
        } else {
            Iterator it3 = list.iterator();
            int i = 0;
            while (true) {
                if (!it3.hasNext()) {
                    i = -1;
                    break;
                }
                if (((mlr) it3.next()).f22006a == mlrVar.f22006a) {
                    break;
                }
                i++;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (i < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                numE = kng0.e(1, numValueOf);
            } else {
                numE = null;
            }
        }
        if (g9h0Var instanceof b9h0) {
            listA = tx3.z(new g3z[]{new g3z(0L, mlrVar.q ? "smart_search" : "search"), j8bVar2 != null ? new g3z(j8bVar2.f16074a, "partition") : null});
        } else if ((g9h0Var instanceof i8h0) || (g9h0Var instanceof e8h0)) {
            lc00 lc00VarB = kotlin.collections.a.b();
            lc00VarB.add(new g3z(0L, this.G.f15225a.a() ? "placeholder_auth" : "placeholder_unauth"));
            if (j8bVar != null) {
                boolean zT = T(j8bVar);
                lc00VarB.add(new g3z(zT ? 824L : j8bVar.f, "category"));
                lc00VarB.add(new g3z(zT ? 0L : j8bVar.d, "partition"));
            }
            listA = kotlin.collections.a.a(lc00VarB);
        } else {
            listA = iun.f15405a;
        }
        return this.H.k(new lu0(0L, numE, "global_search", listA));
    }

    public final int Q(long j, String str) {
        Object next;
        Iterator it = P(((hz0) D()).b).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((j8b) next).f16074a != j);
        j8b j8bVar = (j8b) next;
        if (j8bVar != null && T(j8bVar)) {
            return TokenTypes.REFER_TO;
        }
        ctf0 ctf0Var = this.z;
        if (str != null) {
            return rsr0.X(ctf0Var, str);
        }
        if (j8bVar != null) {
            return rsr0.X(ctf0Var, j8bVar.b);
        }
        return 0;
    }

    public final void R(Throwable th) {
        Object value;
        if (th != null) {
            if ((th instanceof SocketTimeoutException) || (th instanceof ConnectException) || (th instanceof UnknownHostException)) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, hz0.a((hz0) value, null, new k8h0(false), null, null, false, 0, null, 1021)));
                return;
            }
            if (th instanceof jfp) {
                G(new fz0(this.z.b.a(R.string.casino_favorites_limit_error, Arrays.copyOf(new Object[0], 0))));
                return;
            }
        }
        sac.V(jiu0.a(this), new t90(1, this.E, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 24), null, this.A.f22085a, new pa((Object) this, (yje) null, (byte) 14), 10);
        this.E.a(th);
    }

    public final void S(Throwable th) {
        boolean z = th instanceof jfp;
        ctf0 ctf0Var = this.z;
        if (z) {
            G(new fz0(ctf0Var.b.a(R.string.casino_favorites_limit_error, Arrays.copyOf(new Object[0], 0))));
        } else {
            G(new ez0(jwb.G(th, ctf0Var)));
        }
    }

    public final void U(boolean z, boolean z2, boolean z3) {
        bby bbyVar = this.K;
        if (bbyVar != null) {
            e3c.n(bbyVar);
        }
        this.K = sac.V(jiu0.a(this), new t90(1, this, a01.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 25), null, this.A.b, new uz0(this, z, z3, z2, null), 10);
    }

    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        int i;
        jy0 jy0Var = (jy0) obj;
        jy0Var.getClass();
        super.x(jy0Var);
        if (jy0Var instanceof gy0) {
            gy0 gy0Var = (gy0) jy0Var;
            long j = gy0Var.f12102a;
            long j2 = gy0Var.b;
            String str = gy0Var.c;
            mlr mlrVar = (mlr) ((hz0) D()).h.get(Long.valueOf(j));
            if (mlrVar != null) {
                long j3 = mlrVar.f22006a;
                int iQ = Q(j2, str);
                p7m0 p7m0Var = this.i.f25029a;
                while (true) {
                    Object value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                    i = iQ;
                    if (p7m0Var.m(value, hz0.a((hz0) value, null, null, null, null, false, iQ, null, 959))) {
                        break;
                    }
                    j = j;
                    iQ = i;
                    j2 = j2;
                }
                g9h0 g9h0Var = ((hz0) D()).b;
                boolean z = g9h0Var instanceof b9h0;
                cyu cyuVar = this.D;
                if (z || (g9h0Var instanceof i8h0)) {
                    boolean z2 = mlrVar.q;
                    this.s.f31532a.a("search_results_click", xp20.f(new Pair("game_id", Long.valueOf(j3)), new Pair("point", z2 ? "aix" : "main_search")));
                    ((s1p) cyuVar.f5196a).a(tx3.l0(new k1p[]{new i1p((int) j3, (byte) 2), new j1p(z2 ? "aix" : "main_search", (byte) 0)}), 12231L);
                }
                Integer numN = N(j3, j2);
                s1p s1pVar = (s1p) cyuVar.f5196a;
                yni0 yni0Var = new yni0();
                yni0Var.add(new i1p((int) j3, (byte) 2));
                yni0Var.add(new i1p(i, (byte) 0));
                if (numN != null) {
                    yni0Var.add(new i1p(numN.intValue(), (byte) 1));
                }
                yni0Var.add(new j1p("search_aggregator_games", (byte) 0));
                s1pVar.a(cui0.a(yni0Var), 3019L);
                long j4 = j2;
                sac.V(jiu0.a(this), yz0.f43492a, null, null, new nz0(this, mlrVar, j4, i, null), 14);
                Integer numN2 = N(j, j4);
                u58 u58Var = this.r;
                u58Var.f35083a.a("game_aggregator_call", u58.a(u58Var, j, "search_aggregator_games", Integer.valueOf(i), null, numN2, null, 40));
                return;
            }
            return;
        }
        boolean z3 = jy0Var instanceof fy0;
        mne mneVar = this.A;
        yje yjeVar = null;
        if (z3) {
            fy0 fy0Var = (fy0) jy0Var;
            long j5 = fy0Var.f10337a;
            long j6 = fy0Var.b;
            boolean z4 = fy0Var.c;
            mlr mlrVar2 = (mlr) ((hz0) D()).h.get(Long.valueOf(j5));
            if (mlrVar2 != null) {
                int iQ2 = Q(j6, null);
                if (z4) {
                    sac.V(jiu0.a(this), new t90(1, this, a01.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 27), null, mneVar.b, new nz0(this, mlrVar2, iQ2, j6, null, (byte) 2), 10);
                    return;
                } else {
                    sac.V(jiu0.a(this), new t90(1, this, a01.class, "handleFavoriteError", "handleFavoriteError(Ljava/lang/Throwable;)V", 0, (byte) 23), null, mneVar.b, new nz0(this, mlrVar2, iQ2, j6, null, (byte) 0), 10);
                    return;
                }
            }
            return;
        }
        boolean z5 = jy0Var instanceof hy0;
        int i2 = 3;
        iqt iqtVar = this.G;
        if (z5) {
            boolean zA = iqtVar.f15225a.a();
            if (((hz0) D()).f13884a.length() >= 3) {
                V(this, zA);
                return;
            } else {
                U(zA, true, true);
                return;
            }
        }
        if (jy0Var instanceof ey0) {
            sac.V(jiu0.a(this), tz0.f34781a, null, mneVar.f22085a, new qa(this, ((ey0) jy0Var).f8602a, yjeVar, (byte) 15), 10);
            return;
        }
        if (jy0Var instanceof iy0) {
            G(dz0.f6917a);
            return;
        }
        if (jy0Var.equals(dy0.f6870a)) {
            e3c.n(this.J);
            this.J = sac.T(dub.e0(this.F.b(), this.w.a(), new c00(i120.W(new le0(new eu4(new ymq(new eo0((byte) 9), ((n8v) this.C.f10580a).f23108a, yjeVar, (byte) 0), (byte) 9), (byte) 1)), this, (byte) 1), iqtVar.f15225a.a() ? new dnq(this.u.o(), new oz0(i2, yjeVar, (byte) 0), (byte) 1) : new eu4(iun.f15405a, (byte) 12), new xz0(this, null)), d5c.S(jiu0.a(this), mneVar.f22085a), new i8(2, this, a01.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 4, (byte) 9));
        } else if (jy0Var.equals(cy0.f5149a)) {
            E();
        } else {
            t9f.b();
        }
    }
}
