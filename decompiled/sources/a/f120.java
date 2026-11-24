package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.statistic.match_progress.match_progress_cricket.presentation.screen.MatchProgressCricketScreen;
import org.xplatform.statistic.match_progress.match_progress_main.presentation.screen.MatchProgressStatisticRefactoredScreen;
import org.xplatform.statistic.player.impl.player.players_statistic.presentation.screen.PlayersStatisticsScreen;
import org.xplatform.statistic.player.impl.player.players_statistic_cricket.presentation.screen.PlayersStatisticsCricketScreen;
import org.xplatform.statistic.stage.api.domain.TypeStageId;
import org.xplatform.statistic.stage.impl.stagetable.presentation.main.screen.StageTableScreen;

/* JADX INFO: loaded from: classes6.dex */
public final class f120 extends i3t0 {
    public static final /* synthetic */ int p0 = 0;
    public final wyu A;
    public final mne B;
    public final bst C;
    public final cge0 D;
    public final kki E;
    public final g9m0 F;
    public final y2m0 G;
    public final nai H;
    public final e1u I;
    public final s2m0 J;
    public final s9m0 K;
    public final jtj L;
    public final jru M;
    public final xfu N;
    public final x4u O;
    public final pru P;
    public final xuz Q;
    public final gl5 R;
    public final g9m0 S;
    public final atz T;
    public final ddk U;
    public final nek V;
    public final ddk W;
    public final xak X;
    public final uuz Y;
    public final tqt Z;
    public final jwu a0;
    public final f7u b0;
    public final vjp c0;
    public final fhj d0;
    public final ocl e0;
    public final nek f0;
    public c4m0 g0;
    public bby h0;
    public c4m0 i0;
    public bby j0;
    public bby k0;
    public bby l0;
    public bby m0;
    public bby n0;
    public final String o;
    public final LinkedHashMap o0;
    public final long p;
    public final a7q q;
    public final i1w0 r;
    public final oeg0 s;
    public final duj t;
    public final zqu u;
    public final rl70 v;
    public final u58 w;
    public final ix0 x;
    public final ctf0 y;
    public final m1e z;

    public f120(String str, long j, a7q a7qVar, i1w0 i1w0Var, oeg0 oeg0Var, duj dujVar, zqu zquVar, rl70 rl70Var, u58 u58Var, ix0 ix0Var, ctf0 ctf0Var, m1e m1eVar, wyu wyuVar, uyu uyuVar, mne mneVar, bst bstVar, cge0 cge0Var, kki kkiVar, g9m0 g9m0Var, y2m0 y2m0Var, nai naiVar, e1u e1uVar, s2m0 s2m0Var, s9m0 s9m0Var, jtj jtjVar, jru jruVar, xfu xfuVar, x4u x4uVar, pru pruVar, xuz xuzVar, gl5 gl5Var, g9m0 g9m0Var2, atz atzVar, ddk ddkVar, nek nekVar, ddk ddkVar2, xak xakVar, uuz uuzVar, tqt tqtVar, jwu jwuVar, f7u f7uVar, weu weuVar, vjp vjpVar, qzt qztVar, fhj fhjVar, r9u r9uVar, ocl oclVar, nek nekVar2) {
        oeg0Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        wyuVar.getClass();
        r9uVar.getClass();
        kup kupVar = new kup(wyuVar, weuVar, str, qztVar, ctf0Var, fhjVar, j, pruVar);
        xuh xuhVar = new xuh(oclVar, r9uVar, (byte) 6);
        rwj rwjVar = mneVar.f22085a;
        super(null, kupVar, xuhVar, cvm0.p(rwjVar, rwjVar), null);
        this.o = str;
        this.p = j;
        this.q = a7qVar;
        this.r = i1w0Var;
        this.s = oeg0Var;
        this.t = dujVar;
        this.u = zquVar;
        this.v = rl70Var;
        this.w = u58Var;
        this.x = ix0Var;
        this.y = ctf0Var;
        this.z = m1eVar;
        this.A = wyuVar;
        this.B = mneVar;
        this.C = bstVar;
        this.D = cge0Var;
        this.E = kkiVar;
        this.F = g9m0Var;
        this.G = y2m0Var;
        this.H = naiVar;
        this.I = e1uVar;
        this.J = s2m0Var;
        this.K = s9m0Var;
        this.L = jtjVar;
        this.M = jruVar;
        this.N = xfuVar;
        this.O = x4uVar;
        this.P = pruVar;
        this.Q = xuzVar;
        this.R = gl5Var;
        this.S = g9m0Var2;
        this.T = atzVar;
        this.U = ddkVar;
        this.V = nekVar;
        this.W = ddkVar2;
        this.X = xakVar;
        this.Y = uuzVar;
        this.Z = tqtVar;
        this.a0 = jwuVar;
        this.b0 = f7uVar;
        this.c0 = vjpVar;
        this.d0 = fhjVar;
        this.e0 = oclVar;
        this.f0 = nekVar2;
        this.o0 = new LinkedHashMap();
        yje yjeVar = null;
        byte b = 4;
        fnq fnqVar = new fnq(uyuVar.f36509a.h(), new xr10((Object) this, yjeVar, (byte) 1), b);
        bvc bvcVarA = jiu0.a(this);
        rwj rwjVar2 = mneVar.f22085a;
        sac.T(fnqVar, d5c.S(bvcVarA, rwjVar2), d120.h);
        sac.V(jiu0.a(this), new w020(this, (byte) 24), null, rwjVar2, new a120(this, yjeVar, (byte) 5), 10);
        sac.T(new fnq(f7uVar.n(str), new khx((Object) this, (Object) qztVar.a(), yjeVar, (byte) 9), b), d5c.S(jiu0.a(this), rwjVar2), c120.h);
        W(true);
    }

    public final long M(jam0 jam0Var) {
        long jCurrentTimeMillis;
        long jLongValue;
        LinkedHashMap linkedHashMap = this.o0;
        Long l = (Long) linkedHashMap.get(jam0Var);
        if (l != null) {
            jLongValue = l.longValue();
            if ((System.currentTimeMillis() + 10000) - jLongValue >= 10000) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            linkedHashMap.put(jam0Var, Long.valueOf(jLongValue));
            return jLongValue;
        }
        jCurrentTimeMillis = System.currentTimeMillis();
        jLongValue = jCurrentTimeMillis + 10000;
        linkedHashMap.put(jam0Var, Long.valueOf(jLongValue));
        return jLongValue;
    }

    public final h1z N(jam0 jam0Var, boolean z) {
        n3q n3qVar;
        long j;
        int iOrdinal = jam0Var.ordinal();
        if (iOrdinal == 4) {
            n3qVar = n3q.f22862a;
        } else if (iOrdinal != 5) {
            n3qVar = iOrdinal != 6 ? n3q.f22862a : n3q.c;
        } else {
            n3qVar = n3q.b;
        }
        hxs0 hxs0VarC = this.N.c(n3qVar);
        ufp0 ufp0Var = ((v020) D()).h.h;
        ufp0 ufp0Var2 = ((v020) D()).h.i;
        v5l0 v5l0VarE = this.c0.e();
        ctf0 ctf0Var = this.y;
        ctf0Var.getClass();
        ArrayList arrayList = hxs0VarC.f13827a.f32862a;
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            j = this.p;
            if (!zHasNext) {
                break;
            }
            arrayList2.add(yyw.f0((qk80) it.next(), jam0Var, z, ctf0Var, j, v5l0VarE));
        }
        ArrayList arrayList3 = hxs0VarC.b.f32862a;
        ArrayList arrayList4 = new ArrayList(r3d.q(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            arrayList4.add(yyw.f0((qk80) it2.next(), jam0Var, z, ctf0Var, j, v5l0VarE));
        }
        return new h1z(z, ufp0Var, arrayList2, ufp0Var2, arrayList4);
    }

    public final vam0 O(jam0 jam0Var) {
        long jM = M(jam0Var);
        pdm pdmVar = pdm.c;
        return new vam0(ocl.b(this.e0, pb10.r1, pdmVar, 0, 0, R.string.data_retrieval_error, R.string.try_again_text, 0L, jM, 348));
    }

    public final boolean P(jam0 jam0Var) {
        Long l = (Long) this.o0.get(jam0Var);
        if (l != null) {
            return (System.currentTimeMillis() + 10000) - l.longValue() < 10000;
        }
        return false;
    }

    public final void Q() {
        bby bbyVar = this.j0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.j0 = sac.V(jiu0.a(this), new w020(this, (byte) 16), null, this.B.f22085a, new mt00((Object) this, (yje) null, (byte) 6), 10);
        }
    }

    public final void R() {
        bby bbyVar = this.l0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.l0 = sac.V(jiu0.a(this), new w020(this, (byte) 27), null, this.B.f22085a, new a120(this, null, (byte) 0), 10);
        }
    }

    public final void S() {
        bby bbyVar = this.m0;
        byte b = 1;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.m0 = sac.V(jiu0.a(this), new w020(this, (byte) 18), null, this.B.f22085a, new a120(this, null, b), 10);
        }
    }

    public final void T() {
        bby bbyVar = this.k0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.k0 = sac.V(jiu0.a(this), new w020(this, (byte) 26), null, this.B.f22085a, new a120(this, null, (byte) 2), 10);
        }
    }

    public final void U() {
        bby bbyVar = this.n0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.n0 = sac.V(jiu0.a(this), new w020(this, (byte) 28), null, this.B.f22085a, new a120(this, null, (byte) 3), 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v6 */
    public final void V(int i, ixs0 ixs0Var) {
        List list;
        Object value;
        List<pf90> list2;
        if (ixs0Var == null || (list = ixs0Var.e.d) == null || list.isEmpty() || list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((ess) it.next()).b.isEmpty()) {
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                Iterator it2 = list.iterator();
                int i2 = 0;
                while (true) {
                    ?? arrayList2 = 0;
                    arrayList2 = 0;
                    boolean z = true;
                    if (!it2.hasNext()) {
                        a4x a4xVarO0 = dyb.o0(arrayList);
                        ess essVar = (ess) CollectionsKt.W(i, list);
                        if (essVar != null && (list2 = essVar.b) != null) {
                            arrayList2 = new ArrayList(r3d.q(list2, 10));
                            for (pf90 pf90Var : list2) {
                                pf90Var.getClass();
                                String str = pf90Var.c;
                                String str2 = pf90Var.b;
                                Float fJ = kotlin.text.b.j(kotlin.text.c.r(str2, Separators.PERCENT, "", false));
                                float fFloatValue = fJ != null ? fJ.floatValue() : 0.0f;
                                Float fJ2 = kotlin.text.b.j(kotlin.text.c.r(str, Separators.PERCENT, "", false));
                                float fFloatValue2 = fJ2 != null ? fJ2.floatValue() : 0.0f;
                                float f = fFloatValue + fFloatValue2;
                                arrayList2.add(new s6x(f == 0.0f ? 0.0f : fFloatValue / f, f != 0.0f ? fFloatValue2 / f : 0.0f, pf90Var.f26890a, str2, str));
                            }
                        }
                        if (arrayList2 == 0) {
                            arrayList2 = iun.f15405a;
                        }
                        ehm0 ehm0VarA = ehm0.a(((v020) D()).p, false, i, new xam0(new rrb0(dyb.o0(arrayList2), a4xVarO0)), 1);
                        p7m0 p7m0Var = this.i.f25029a;
                        do {
                            value = p7m0Var.getValue();
                            value.getClass();
                            this.f.getClass();
                        } while (!p7m0Var.m(value, v020.a((v020) value, false, false, 0L, false, 0, null, null, null, null, null, null, null, null, ehm0VarA, null, null, null, null, null, null, 8355839)));
                        return;
                    }
                    Object next = it2.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        q3d.p();
                        throw null;
                    }
                    String str3 = ((ess) next).f8345a;
                    if (i != i2) {
                        z = false;
                    }
                    arrayList.add(new beo0(str3, 0, z));
                    i2 = i3;
                }
            }
        }
    }

    public final void W(boolean z) {
        Object value;
        c4m0 c4m0Var = this.i0;
        mne mneVar = this.B;
        yje yjeVar = null;
        if (c4m0Var == null || !c4m0Var.isActive()) {
            if (z) {
                p7m0 p7m0Var = this.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    this.f.getClass();
                } while (!p7m0Var.m(value, v020.a((v020) value, true, false, 0L, false, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388604)));
            }
            byte b = 4;
            this.i0 = sac.T(new fnq(this.b0.n(this.o), new z210(this, yjeVar, b), b), d5c.S(jiu0.a(this), mneVar.f22085a), z020.h);
        }
        bby bbyVar = this.h0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.h0 = sac.a0(jiu0.a(this), ibc.w0(30L, bfn.SECONDS), mneVar.f22085a, null, new a120(this, yjeVar, (byte) 6), 4);
        }
    }

    public final void X() {
        c4m0 c4m0Var = this.i0;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        c4m0 c4m0Var2 = this.g0;
        if (c4m0Var2 != null) {
            c4m0Var2.cancel(null);
        }
        bby bbyVar = this.h0;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        this.h0 = null;
        this.i0 = null;
        this.g0 = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        byte b;
        Object obj2;
        m7h0 playersStatisticsScreen;
        final f120 f120Var = this;
        bv30 bv30Var = (bv30) obj;
        bv30Var.getClass();
        byte b2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object[] objArr5 = 0;
        if (bv30Var instanceof bu30) {
            i1w0 i1w0VarC = f120Var.s.c();
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0VarC);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0VarC, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    return;
                } else {
                    i1w0VarC.a((oe50) pawVar.next());
                }
            }
        } else {
            boolean z = bv30Var instanceof au30;
            byte b3 = 10;
            byte b4 = 8;
            byte b5 = 14;
            byte b6 = 12;
            byte b7 = 9;
            byte b8 = 13;
            final byte b9 = 2;
            i1w0 i1w0Var = f120Var.r;
            if (z) {
                cz10 cz10Var = ((au30) bv30Var).f1460a.f6919a;
                byte b10 = cz10Var.b;
                f120Var.w.i(b10);
                ix0 ix0Var = f120Var.x;
                ix0Var.getClass();
                dgm0.c.getClass();
                Iterator it = dgm0.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    Object next = it.next();
                    if (((dgm0) next).f6049a == b10) {
                        obj2 = next;
                        break;
                    }
                }
                dgm0 dgm0Var = (dgm0) obj2;
                if (dgm0Var != null) {
                    ix0Var.f15516a.a(cui0.b(new j1p(dgm0Var.b, (byte) 0)), 3178L);
                }
                if (cz10Var instanceof sy10) {
                    i1w0Var.d(new w020(f120Var, b2));
                    return;
                }
                if (cz10Var instanceof bz10) {
                    i1w0Var.d(new w020(f120Var, b9));
                    return;
                }
                if (cz10Var instanceof vy10) {
                    i1w0Var.d(new w020(f120Var, b4));
                    return;
                }
                if (!(cz10Var instanceof ny10)) {
                    if (cz10Var instanceof by10) {
                        i1w0Var.d(new w020(f120Var, b7));
                        return;
                    }
                    if (cz10Var instanceof fy10) {
                        i1w0Var.d(new w020(f120Var, b3));
                        return;
                    }
                    if (cz10Var instanceof xy10) {
                        i1w0Var.d(new w020(f120Var, b6));
                        return;
                    }
                    if (cz10Var instanceof qy10) {
                        i1w0Var.d(new w020(f120Var, b8));
                        return;
                    }
                    if (cz10Var instanceof ly10) {
                        i1w0Var.d(new w020(f120Var, b5));
                        return;
                    }
                    if (cz10Var instanceof az10) {
                        i1w0Var.d(new w020(f120Var, (byte) 15));
                        return;
                    }
                    if (cz10Var instanceof iy10) {
                        i1w0Var.d(new w020(f120Var, (byte) 11));
                        return;
                    }
                    if (cz10Var instanceof hy10) {
                        ixs0 ixs0Var = ((v020) f120Var.D()).i;
                        if (ixs0Var != null) {
                            i1w0Var.d(new z08(f120Var, ixs0Var.d, b7));
                            return;
                        }
                        return;
                    }
                    if (cz10Var instanceof cy10) {
                        i1w0Var.d(new w020(f120Var, (byte) 17));
                        return;
                    }
                    if (cz10Var instanceof wy10) {
                        i1w0Var.d(new w020(f120Var, (byte) 19));
                        return;
                    }
                    if (cz10Var instanceof ky10) {
                        i1w0Var.d(new w020(f120Var, (byte) 23));
                        return;
                    }
                    if (cz10Var instanceof ry10) {
                        i1w0Var.d(new w020(f120Var, (byte) 25));
                        return;
                    }
                    if (cz10Var instanceof my10) {
                        i1w0Var.d(new w020(f120Var, (byte) 29));
                        return;
                    }
                    if (cz10Var instanceof oy10) {
                        final Object[] objArr6 = objArr5 == true ? 1 : 0;
                        i1w0Var.d(new Function1(f120Var) { // from class: a.y020
                            public final /* synthetic */ f120 b;

                            {
                                this.b = f120Var;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                byte b11 = objArr6;
                                f120 f120Var2 = this.b;
                                k0w0 k0w0Var = (k0w0) obj3;
                                switch (b11) {
                                    case 0:
                                        k0w0Var.getClass();
                                        xuz xuzVar = f120Var2.Q;
                                        String str = ((v020) f120Var2.D()).f;
                                        long j = f120Var2.p;
                                        xuzVar.getClass();
                                        k0w0Var.h(new MatchProgressStatisticRefactoredScreen(str, j));
                                        break;
                                    case 1:
                                        k0w0Var.getClass();
                                        xuz xuzVar2 = f120Var2.Q;
                                        String str2 = ((v020) f120Var2.D()).f;
                                        long j2 = f120Var2.p;
                                        xuzVar2.getClass();
                                        k0w0Var.h(new MatchProgressCricketScreen(str2, j2));
                                        break;
                                    default:
                                        k0w0Var.getClass();
                                        nai naiVar = f120Var2.H;
                                        TypeStageId.Game game = new TypeStageId.Game(((v020) f120Var2.D()).f);
                                        long j3 = f120Var2.p;
                                        ixs0 ixs0Var2 = ((v020) f120Var2.D()).i;
                                        String str3 = ixs0Var2 != null ? ixs0Var2.f15559a.f44686a : null;
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        long j4 = ((v020) f120Var2.D()).h.s;
                                        naiVar.getClass();
                                        k0w0Var.h(new StageTableScreen(game, j3, str3, j4));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        return;
                    }
                    if (cz10Var instanceof py10) {
                        final byte b11 = 1;
                        i1w0Var.d(new Function1(f120Var) { // from class: a.y020
                            public final /* synthetic */ f120 b;

                            {
                                this.b = f120Var;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                byte b12 = b11;
                                f120 f120Var2 = this.b;
                                k0w0 k0w0Var = (k0w0) obj3;
                                switch (b12) {
                                    case 0:
                                        k0w0Var.getClass();
                                        xuz xuzVar = f120Var2.Q;
                                        String str = ((v020) f120Var2.D()).f;
                                        long j = f120Var2.p;
                                        xuzVar.getClass();
                                        k0w0Var.h(new MatchProgressStatisticRefactoredScreen(str, j));
                                        break;
                                    case 1:
                                        k0w0Var.getClass();
                                        xuz xuzVar2 = f120Var2.Q;
                                        String str2 = ((v020) f120Var2.D()).f;
                                        long j2 = f120Var2.p;
                                        xuzVar2.getClass();
                                        k0w0Var.h(new MatchProgressCricketScreen(str2, j2));
                                        break;
                                    default:
                                        k0w0Var.getClass();
                                        nai naiVar = f120Var2.H;
                                        TypeStageId.Game game = new TypeStageId.Game(((v020) f120Var2.D()).f);
                                        long j3 = f120Var2.p;
                                        ixs0 ixs0Var2 = ((v020) f120Var2.D()).i;
                                        String str3 = ixs0Var2 != null ? ixs0Var2.f15559a.f44686a : null;
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        long j4 = ((v020) f120Var2.D()).h.s;
                                        naiVar.getClass();
                                        k0w0Var.h(new StageTableScreen(game, j3, str3, j4));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        return;
                    }
                    if (cz10Var instanceof yy10) {
                        i1w0Var.d(new Function1(f120Var) { // from class: a.y020
                            public final /* synthetic */ f120 b;

                            {
                                this.b = f120Var;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                byte b12 = b9;
                                f120 f120Var2 = this.b;
                                k0w0 k0w0Var = (k0w0) obj3;
                                switch (b12) {
                                    case 0:
                                        k0w0Var.getClass();
                                        xuz xuzVar = f120Var2.Q;
                                        String str = ((v020) f120Var2.D()).f;
                                        long j = f120Var2.p;
                                        xuzVar.getClass();
                                        k0w0Var.h(new MatchProgressStatisticRefactoredScreen(str, j));
                                        break;
                                    case 1:
                                        k0w0Var.getClass();
                                        xuz xuzVar2 = f120Var2.Q;
                                        String str2 = ((v020) f120Var2.D()).f;
                                        long j2 = f120Var2.p;
                                        xuzVar2.getClass();
                                        k0w0Var.h(new MatchProgressCricketScreen(str2, j2));
                                        break;
                                    default:
                                        k0w0Var.getClass();
                                        nai naiVar = f120Var2.H;
                                        TypeStageId.Game game = new TypeStageId.Game(((v020) f120Var2.D()).f);
                                        long j3 = f120Var2.p;
                                        ixs0 ixs0Var2 = ((v020) f120Var2.D()).i;
                                        String str3 = ixs0Var2 != null ? ixs0Var2.f15559a.f44686a : null;
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        long j4 = ((v020) f120Var2.D()).h.s;
                                        naiVar.getClass();
                                        k0w0Var.h(new StageTableScreen(game, j3, str3, j4));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        return;
                    }
                    if (cz10Var instanceof ty10) {
                        i1w0Var.d(new w020(f120Var, (byte) 1));
                        return;
                    }
                    if (cz10Var instanceof dy10) {
                        i1w0Var.d(new w020(f120Var, (byte) 3));
                        return;
                    }
                    if (cz10Var.equals(ey10.c)) {
                        i1w0Var.d(new w020(f120Var, (byte) 4));
                        return;
                    }
                    if (cz10Var.equals(gy10.c)) {
                        i1w0Var.d(new w020(f120Var, (byte) 5));
                        return;
                    } else if (cz10Var.equals(jy10.c)) {
                        i1w0Var.d(new w020(f120Var, (byte) 6));
                        return;
                    } else {
                        if (cz10Var.equals(uy10.c)) {
                            i1w0Var.d(new w020(f120Var, (byte) 7));
                            return;
                        }
                        return;
                    }
                }
                long j = f120Var.p;
                rl70 rl70Var = f120Var.v;
                if (j == 66) {
                    String str = ((v020) f120Var.D()).f;
                    rl70Var.getClass();
                    playersStatisticsScreen = new PlayersStatisticsCricketScreen(str, j);
                } else {
                    String str2 = ((v020) f120Var.D()).f;
                    rl70Var.getClass();
                    playersStatisticsScreen = new PlayersStatisticsScreen(str2, j);
                }
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
                if (playersStatisticsScreen instanceof DialogScreen) {
                    copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) playersStatisticsScreen)));
                } else {
                    copyOnWriteArrayListQ2.add(new c8d(y7d.f42146a, new w0w0(playersStatisticsScreen)));
                }
                ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorO;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar2.next());
                    }
                }
            } else {
                if (bv30Var instanceof eu30) {
                    f120Var.V(((eu30) bv30Var).f8399a, ((v020) f120Var.D()).i);
                    return;
                }
                if (!(bv30Var instanceof hu30)) {
                    if (bv30Var instanceof zt30) {
                        H(new u49(b6, ((zt30) bv30Var).f44937a, (boolean) (objArr4 == true ? 1 : 0)));
                        return;
                    }
                    byte b12 = 20;
                    if (bv30Var instanceof cu30) {
                        a0z a0zVar = ((cu30) bv30Var).f4969a;
                        X();
                        i3t0.K(this, null, null, new ffd(this, a0zVar, null, b12), 3);
                        return;
                    }
                    if (bv30Var instanceof yt30) {
                        yt30 yt30Var = (yt30) bv30Var;
                        int i = yt30Var.f43198a;
                        int iOrdinal = yt30Var.b.ordinal();
                        if (iOrdinal == 4) {
                            H(new u49(b8, i, (boolean) (objArr2 == true ? 1 : 0)));
                            return;
                        } else {
                            if (iOrdinal != 5) {
                                return;
                            }
                            H(new u49(b5, i, (boolean) (objArr3 == true ? 1 : 0)));
                            return;
                        }
                    }
                    if (bv30Var.equals(fu30.f10144a)) {
                        X();
                        return;
                    }
                    if (bv30Var.equals(gu30.f11912a)) {
                        c4m0 c4m0Var = this.g0;
                        if (c4m0Var != null) {
                            b = 1;
                            if (c4m0Var.isActive()) {
                                return;
                            }
                        } else {
                            b = 1;
                        }
                        yje yjeVar = null;
                        this.g0 = sac.T(new fnq(new dnq(this.z.b(), new qos(this, yjeVar, b8), b), new a120(this, yjeVar, (byte) 7), (byte) 4), d5c.S(jiu0.a(this), this.B.f22085a), e120.h);
                        return;
                    }
                    if (bv30Var.equals(du30.f6682a)) {
                        Q();
                        return;
                    }
                    byte b13 = 21;
                    if (!(bv30Var instanceof st30)) {
                        if (!(bv30Var instanceof tt30)) {
                            t9f.b();
                            return;
                        }
                        String str3 = ((tt30) bv30Var).f34493a;
                        if (str3.length() == 0) {
                            return;
                        }
                        i1w0Var.d(new u400(this, str3, b13));
                        return;
                    }
                    st30 st30Var = (st30) bv30Var;
                    if (!(st30Var instanceof ot30)) {
                        if (st30Var instanceof pt30) {
                            jam0 jam0Var = ((pt30) st30Var).f27545a;
                            int iOrdinal2 = jam0Var.ordinal();
                            if (iOrdinal2 == 0) {
                                i1w0Var.d(new w020(this, b12));
                                return;
                            }
                            if (iOrdinal2 == 1) {
                                i1w0Var.d(new w020(this, b13));
                                return;
                            }
                            byte b14 = 22;
                            if (iOrdinal2 == 2) {
                                i1w0Var.d(new w020(this, b14));
                                return;
                            } else {
                                if (iOrdinal2 == 4 || iOrdinal2 == 5 || iOrdinal2 == 6) {
                                    i1w0Var.d(new u400(this, jam0Var, b14));
                                    return;
                                }
                                return;
                            }
                        }
                        if (!(st30Var instanceof rt30)) {
                            if (!(st30Var instanceof qt30)) {
                                t9f.b();
                                return;
                            }
                            long j2 = ((qt30) st30Var).f29281a;
                            if (((v020) D()).o.b == 0) {
                                H(new a21((byte) 25, j2));
                                return;
                            } else {
                                H(new a21((byte) 26, j2));
                                return;
                            }
                        }
                        jam0 jam0Var2 = ((rt30) st30Var).f31060a;
                        vam0 vam0VarO = O(jam0Var2);
                        int iOrdinal3 = jam0Var2.ordinal();
                        if (iOrdinal3 == 0) {
                            H(new x020(vam0VarO, (byte) 5));
                            R();
                            return;
                        }
                        if (iOrdinal3 == 1) {
                            H(new x020(vam0VarO, (byte) 6));
                            S();
                            return;
                        }
                        if (iOrdinal3 == 2) {
                            H(new a21((byte) 27, M(jam0.c)));
                            U();
                            return;
                        } else {
                            if (iOrdinal3 == 4 || iOrdinal3 == 5 || iOrdinal3 == 6) {
                                H(new x020(vam0VarO, (byte) 7));
                                T();
                                return;
                            }
                            return;
                        }
                    }
                    switch (((ot30) st30Var).f25813a.ordinal()) {
                        case 0:
                            H(new gm10(b7));
                            if ((((v020) D()).n.d instanceof vam0) && ((v020) D()).n.f7815a) {
                                jam0 jam0Var3 = jam0.f16197a;
                                if (P(jam0Var3)) {
                                    H(new x020(O(jam0Var3), (byte) 1));
                                }
                            }
                            if (!(((v020) D()).n.d instanceof xam0) && ((v020) D()).n.f7815a) {
                                R();
                                break;
                            }
                            break;
                        case 1:
                            H(new gm10((byte) 11));
                            if ((((v020) D()).m.d instanceof vam0) && ((v020) D()).m.f7815a) {
                                jam0 jam0Var4 = jam0.b;
                                if (P(jam0Var4)) {
                                    H(new x020(O(jam0Var4), (byte) 3));
                                }
                            }
                            if (!(((v020) D()).m.d instanceof xam0) && ((v020) D()).m.f7815a) {
                                S();
                                break;
                            }
                            break;
                        case 2:
                            boolean z2 = ((v020) D()).o.g;
                            H(new obg((byte) 16, !z2));
                            if (!z2) {
                                if (((v020) D()).o.f || !P(jam0.c)) {
                                    U();
                                }
                            }
                            break;
                        case 3:
                            H(new gm10(b5));
                            V(((v020) D()).p.c, ((v020) D()).i);
                            break;
                        case 4:
                            H(new gm10(b4));
                            if ((((v020) D()).r.d instanceof vam0) && ((v020) D()).r.f7815a) {
                                jam0 jam0Var5 = jam0.e;
                                if (P(jam0Var5)) {
                                    H(new x020(O(jam0Var5), objArr == true ? 1 : 0));
                                }
                            }
                            if (!(((v020) D()).r.d instanceof xam0) && ((v020) D()).r.f7815a) {
                                T();
                                break;
                            }
                            break;
                        case 5:
                            H(new gm10(b6));
                            if ((((v020) D()).s.d instanceof vam0) && ((v020) D()).s.f7815a) {
                                jam0 jam0Var6 = jam0.e;
                                if (P(jam0Var6)) {
                                    H(new x020(O(jam0Var6), (byte) 4));
                                }
                            }
                            if (!(((v020) D()).s.d instanceof xam0) && ((v020) D()).s.f7815a) {
                                T();
                                break;
                            }
                            break;
                        case 6:
                            H(new gm10(b3));
                            if ((((v020) D()).t.d instanceof vam0) && ((v020) D()).t.f7815a) {
                                jam0 jam0Var7 = jam0.e;
                                if (P(jam0Var7)) {
                                    H(new x020(O(jam0Var7), b9));
                                }
                            }
                            if (!(((v020) D()).t.d instanceof xam0) && ((v020) D()).t.f7815a) {
                                T();
                                break;
                            }
                            break;
                        case 7:
                            H(new gm10(b8));
                            break;
                        default:
                            t9f.b();
                            break;
                    }
                    return;
                }
                int i2 = ((hu30) bv30Var).f13662a;
                p7m0 p7m0Var = f120Var.i.f25029a;
                while (true) {
                    Object value = p7m0Var.getValue();
                    value.getClass();
                    f120Var.f.getClass();
                    if (p7m0Var.m(value, v020.a((v020) value, false, false, 0L, false, i2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 8388543))) {
                        return;
                    } else {
                        f120Var = this;
                    }
                }
            }
        }
    }
}
