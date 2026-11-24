package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.aggregator.impl.category.presentation.models.AggregatorProvidersFiltersUiModel;
import org.xplatform.aggregator.impl.category.presentation.models.FilterCategoryUiModel;
import org.xplatform.aggregator.impl.category.presentation.models.FilterItemUi;
import org.xplatform.aggregator.impl.category.presentation.models.PromotedCategoryUiModel;
import org.xplatform.aggregator.impl.category.presentation.models.SortingOptionUiModel;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class jt80 extends i3t0 {
    public static final /* synthetic */ int s0 = 0;
    public final u58 A;
    public final gg5 B;
    public final h03 C;
    public final fuu D;
    public final ali E;
    public final bbw0 F;
    public final mne G;
    public final duj H;
    public final ctf0 I;
    public final ix0 J;
    public final o470 K;
    public final pwi L;
    public final roq0 M;
    public final pyt N;
    public final bnt O;
    public final pmi P;
    public final dnt Q;
    public final kb0 R;
    public final f7u S;
    public final xr T;
    public final s31 U;
    public final m1e V;
    public final s91 W;
    public final cyu X;
    public final kd30 Y;
    public final eyg0 Z;
    public final cmt a0;
    public final String b0;
    public c4m0 c0;
    public bby d0;
    public c4m0 e0;
    public bby f0;
    public bby g0;
    public bby h0;
    public bby i0;
    public bby j0;
    public bby k0;
    public fk80 l0;
    public AggregatorProvidersFiltersUiModel m0;
    public r3q n0;
    public final long o;
    public List o0;
    public final oeg0 p;
    public Integer p0;
    public final soc q;
    public boolean q0;
    public final cu r;
    public boolean r0;
    public final xoc s;
    public final jdk0 t;
    public final irc u;
    public final xmt v;
    public final nc0 w;
    public final xoc x;
    public final irc y;
    public final pw70 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public jt80(long j, oeg0 oeg0Var, soc socVar, cu cuVar, xoc xocVar, jdk0 jdk0Var, irc ircVar, xmt xmtVar, nc0 nc0Var, xoc xocVar2, irc ircVar2, pw70 pw70Var, iqt iqtVar, kc60 kc60Var, u58 u58Var, gg5 gg5Var, h03 h03Var, fuu fuuVar, ali aliVar, bbw0 bbw0Var, pru pruVar, mne mneVar, duj dujVar, ctf0 ctf0Var, ix0 ix0Var, o470 o470Var, pwi pwiVar, roq0 roq0Var, pyt pytVar, bnt bntVar, pmi pmiVar, dnt dntVar, kb0 kb0Var, bzt bztVar, f7u f7uVar, xr xrVar, s31 s31Var, m1e m1eVar, s91 s91Var, cyu cyuVar, dmt dmtVar, kd30 kd30Var, eyg0 eyg0Var, cmt cmtVar) {
        oeg0Var.getClass();
        pw70Var.getClass();
        ctf0Var.getClass();
        m1eVar.getClass();
        s91Var.getClass();
        g090 g090VarP = cvm0.p(mneVar.c, mneVar.f22085a);
        yje yjeVar = null;
        super(new vs80(iqtVar, bztVar, pruVar, dmtVar, j), g090VarP, new v510(ctf0Var, (byte) 29), (yzn0) null);
        this.o = j;
        this.p = oeg0Var;
        this.q = socVar;
        this.r = cuVar;
        this.s = xocVar;
        this.t = jdk0Var;
        this.u = ircVar;
        this.v = xmtVar;
        this.w = nc0Var;
        this.x = xocVar2;
        this.y = ircVar2;
        this.z = pw70Var;
        this.A = u58Var;
        this.B = gg5Var;
        this.C = h03Var;
        this.D = fuuVar;
        this.E = aliVar;
        this.F = bbw0Var;
        this.G = mneVar;
        this.H = dujVar;
        this.I = ctf0Var;
        this.J = ix0Var;
        this.K = o470Var;
        this.L = pwiVar;
        this.M = roq0Var;
        this.N = pytVar;
        this.O = bntVar;
        this.P = pmiVar;
        this.Q = dntVar;
        this.R = kb0Var;
        this.S = f7uVar;
        this.T = xrVar;
        this.U = s31Var;
        this.V = m1eVar;
        this.W = s91Var;
        this.X = cyuVar;
        this.Y = kd30Var;
        this.Z = eyg0Var;
        this.a0 = cmtVar;
        this.b0 = as80.class.getSimpleName();
        this.m0 = AggregatorProvidersFiltersUiModel.d;
        this.o0 = iun.f15405a;
        dvj dvjVar = mneVar.b;
        i3t0.A(this, kb0Var, bb0.f2283a, dvjVar, null, 4);
        i3t0.F(this, kb0Var, null, new ws80(this, (byte) 3), new zc70((byte) 26), 117);
        X();
        V();
        byte b = 4;
        sac.T(new fnq(dtb.z(kc60Var.a(), 1), new zs80(this, yjeVar, (byte) 6), b), d5c.S(jiu0.a(this), dvjVar), it80.h);
        sac.T(new fnq(i120.W(m1eVar.b()), new ft80(this, yjeVar, b), b), d5c.S(jiu0.a(this), dvjVar), new zs80(this, yjeVar, (byte) 5));
    }

    public static FilterItemUi M(List list, List list2) {
        Object obj;
        Object next;
        Iterator it = list.iterator();
        do {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!list2.contains(((FilterItemUi) next).getF46281a()));
        FilterItemUi filterItemUi = (FilterItemUi) next;
        if (filterItemUi != null && !list2.isEmpty()) {
            return filterItemUi;
        }
        if (!list2.contains("9223372036854775807")) {
            return null;
        }
        for (Object obj2 : list) {
            if (Intrinsics.d(((FilterItemUi) obj2).getF46281a(), "0")) {
                obj = obj2;
                break;
            }
        }
        return (FilterItemUi) obj;
    }

    public static List P(List list, w3q w3qVar) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((FilterCategoryUiModel) obj).c == w3qVar) {
                arrayList.add(obj);
            }
        }
        List listQ0 = iun.f15405a;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            List list2 = ((FilterCategoryUiModel) it.next()).d;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                if (((FilterItemUi) obj2).getC()) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((FilterItemUi) it2.next()).getF46281a());
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (!Intrinsics.d((String) obj3, "0")) {
                    arrayList4.add(obj3);
                }
            }
            listQ0 = CollectionsKt.q0(listQ0, arrayList4);
        }
        return listQ0;
    }

    public static FilterItemUi Q(AggregatorProvidersFiltersUiModel aggregatorProvidersFiltersUiModel, ArrayList arrayList, String str) {
        Object next;
        Iterator it = aggregatorProvidersFiltersUiModel.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.d(((FilterCategoryUiModel) next).f46277a, str));
        FilterCategoryUiModel filterCategoryUiModel = (FilterCategoryUiModel) next;
        List list = filterCategoryUiModel != null ? filterCategoryUiModel.d : null;
        if (list == null) {
            list = iun.f15405a;
        }
        return M(list, arrayList);
    }

    public static List R(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((FilterItemUi) obj).getC()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((FilterItemUi) it.next()).getF46281a());
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (!Intrinsics.d((String) obj2, "0")) {
                arrayList3.add(obj2);
            }
        }
        return CollectionsKt.E0(1, arrayList3);
    }

    public final AggregatorProvidersFiltersUiModel N(List list, AggregatorProvidersFiltersUiModel aggregatorProvidersFiltersUiModel) {
        FilterCategoryUiModel filterCategoryUiModel = (FilterCategoryUiModel) CollectionsKt.firstOrNull(aggregatorProvidersFiltersUiModel.b);
        String str = filterCategoryUiModel != null ? filterCategoryUiModel.f46277a : null;
        this.t.getClass();
        AggregatorProvidersFiltersUiModel aggregatorProvidersFiltersUiModelD0 = j47.D0(list, jdk0.g(q3d.k(str), aggregatorProvidersFiltersUiModel, new w3q[0]));
        this.u.a(dwi0.P(aggregatorProvidersFiltersUiModelD0));
        return aggregatorProvidersFiltersUiModelD0;
    }

    public final lu0 O(long j) {
        Iterator it = ((rs80) D()).r.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (((mlr) it.next()).f22006a == j) {
                break;
            }
            i++;
        }
        int i2 = i + 1;
        List list = ((rs80) D()).x;
        List list2 = ((rs80) D()).y;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it2 = list.iterator();
        while (true) {
            long jLongValue = 0;
            if (!it2.hasNext()) {
                break;
            }
            Long lT0 = StringsKt.t0((String) it2.next());
            if (lT0 != null) {
                jLongValue = lT0.longValue();
            }
            arrayList.add(new g3z(jLongValue, "category"));
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            Long lT1 = StringsKt.t0((String) it3.next());
            arrayList2.add(new g3z(lT1 != null ? lT1.longValue() : 0L, "brand"));
        }
        Integer numValueOf = Integer.valueOf(i2);
        lc00 lc00VarB = kotlin.collections.a.b();
        lc00VarB.addAll(arrayList2);
        lc00VarB.addAll(arrayList);
        return new lu0(this.o, numValueOf, "aggregator_partition_screen", kotlin.collections.a.a(lc00VarB));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable S(zje zjeVar) {
        xs80 xs80Var;
        Serializable g0g0Var;
        Object next;
        if (zjeVar instanceof xs80) {
            xs80Var = (xs80) zjeVar;
            int i = xs80Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xs80Var.k = i - Integer.MIN_VALUE;
            } else {
                xs80Var = new xs80(this, zjeVar);
            }
        } else {
            xs80Var = new xs80(this, zjeVar);
        }
        Object objK = xs80Var.i;
        wne wneVar = wne.f39444a;
        int i2 = xs80Var.k;
        try {
            if (i2 == 0) {
                z1x.P(objK);
                e0g0 e0g0Var = j0g0.b;
                gmq gmqVarA = this.v.a(nw80.B.getId());
                xs80Var.k = 1;
                objK = ntb.K(gmqVarA, xs80Var);
                if (objK == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objK);
            }
            Iterator it = ((Iterable) objK).iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (StringsKt.W(((kr5) next).v));
            kr5 kr5Var = (kr5) next;
            g0g0Var = kr5Var != null ? kr5Var.v : null;
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            return null;
        }
        return g0g0Var;
    }

    public final List T() {
        return q3d.j(this.f0, this.g0, this.h0, this.i0, this.j0, this.k0);
    }

    public final int U() {
        Object next;
        String str;
        Long lT0;
        Iterator it = this.o0.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((PromotedCategoryUiModel) next).c);
        PromotedCategoryUiModel promotedCategoryUiModel = (PromotedCategoryUiModel) next;
        long jLongValue = (promotedCategoryUiModel == null || (str = promotedCategoryUiModel.f46279a) == null || (lT0 = StringsKt.t0(str)) == null) ? Long.MAX_VALUE : lT0.longValue();
        boolean z = ((rs80) D()).z;
        long j = this.o;
        if (z) {
            if (j == nw80.b.getId()) {
                return 44441;
            }
            return j == nw80.f24223a.getId() ? 44442 : 0;
        }
        if (j != nw80.b.getId()) {
            if (j == nw80.f24223a.getId()) {
                Integer num = this.p0;
                if (jLongValue == Long.MAX_VALUE) {
                    return 1221;
                }
                if (jLongValue == 75) {
                    return 1222;
                }
                if (jLongValue == 17) {
                    return 1223;
                }
                if (jLongValue == 94) {
                    return 1224;
                }
                if (jLongValue == 5) {
                    return 1225;
                }
                if (jLongValue == 31) {
                    return 1226;
                }
                if (jLongValue == 9) {
                    return 1227;
                }
                if (jLongValue == 15) {
                    return 1228;
                }
                if (jLongValue == 3) {
                    return 1229;
                }
                if (jLongValue == 93) {
                    return 1230;
                }
                if (jLongValue == 300) {
                    return 1143;
                }
                if (num != null) {
                    return num.intValue();
                }
            }
            return 0;
        }
        Integer num2 = this.p0;
        if (jLongValue == Long.MAX_VALUE) {
            return 1121;
        }
        if (jLongValue == 17) {
            return 1122;
        }
        if (jLongValue == 21) {
            return 1123;
        }
        if (jLongValue == 89) {
            return 1124;
        }
        if (jLongValue == 153) {
            return 1125;
        }
        if (jLongValue == 112) {
            return 1126;
        }
        if (jLongValue == 113) {
            return 1127;
        }
        if (jLongValue == 106) {
            return 1128;
        }
        if (jLongValue == 204) {
            return 1129;
        }
        if (jLongValue == 205) {
            return 1131;
        }
        if (jLongValue == 26) {
            return 1132;
        }
        if (jLongValue == 270) {
            return 1140;
        }
        if (jLongValue == 268) {
            return 1141;
        }
        if (jLongValue == 300) {
            return 1142;
        }
        if (num2 != null) {
            return num2.intValue();
        }
        return 0;
    }

    public final void V() {
        sac.V(jiu0.a(this), new ws80(this, (byte) 1), null, this.G.b, new wg0(this, null, (byte) 6), 10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable W(zje zjeVar) {
        ys80 ys80Var;
        if (zjeVar instanceof ys80) {
            ys80Var = (ys80) zjeVar;
            int i = ys80Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ys80Var.k = i - Integer.MIN_VALUE;
            } else {
                ys80Var = new ys80(this, zjeVar);
            }
        } else {
            ys80Var = new ys80(this, zjeVar);
        }
        Object objK = ys80Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ys80Var.k;
        if (i2 == 0) {
            z1x.P(objK);
            gmq gmqVarB = this.N.b(c9x.O(this.o));
            ys80Var.k = 1;
            objK = ntb.K(gmqVarB, ys80Var);
            if (objK == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objK);
        }
        Iterable iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(hew0.W((uvc) it.next()));
        }
        return arrayList;
    }

    public final void X() {
        Object value;
        c4m0 c4m0Var = this.c0;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        if (((rs80) D()).d) {
            this.q.b();
            this.c0 = sac.T(new fnq(this.E.o(), new zs80(this, yjeVar, (byte) 0), (byte) 4), d5c.S(jiu0.a(this), this.G.b), at80.h);
            return;
        }
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, rs80.a((rs80) value, false, false, false, false, false, false, false, null, null, null, null, xun.f41520a, null, null, null, null, null, false, null, 133955583)));
    }

    public final void Y(AggregatorScreenModel aggregatorScreenModel, r3q r3qVar) {
        Object value;
        Object value2;
        gmq p6dVar;
        Object value3;
        AggregatorScreenModel aggregatorScreenModel2 = ((rs80) D()).q;
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (aggregatorScreenModel2 == null) {
            p7m0 p7m0Var = ocjVar.f25029a;
            do {
                value3 = p7m0Var.getValue();
                value3.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var.m(value3, rs80.a((rs80) value3, false, false, false, false, false, false, false, null, null, aggregatorScreenModel, null, null, null, null, null, null, null, false, null, 134152191)));
        }
        if (((rs80) D()).g) {
            p7m0 p7m0Var2 = ocjVar.f25029a;
            do {
                value = p7m0Var2.getValue();
                value.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var2.m(value, rs80.a((rs80) value, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, 134217663)));
            this.n0 = r3qVar;
            List list = r3qVar.b;
            List list2 = r3qVar.c;
            long j = r3qVar.f29800a;
            byte b = 1;
            if (!list.isEmpty() || !list2.isEmpty()) {
                ap0 ap0Var = this.y.f15250a.b;
                iun iunVar = iun.f15405a;
                ap0Var.getClass();
                iunVar.getClass();
                ap0Var.d = true;
                ap0Var.f1227a.put(Long.valueOf(j), iunVar);
                if (!list.isEmpty()) {
                    this.s.f41210a.b.d = false;
                }
            }
            wr80 ur80Var = ((((rs80) D()).w instanceof ur80) && R(((ur80) ((rs80) D()).w).f36152a).isEmpty()) ? new ur80(this.o0) : ((rs80) D()).w;
            wr80 wr80Var = ur80Var;
            p7m0 p7m0Var3 = ocjVar.f25029a;
            do {
                value2 = p7m0Var3.getValue();
                value2.getClass();
                oyg0Var.getClass();
            } while (!p7m0Var3.m(value2, rs80.a((rs80) value2, false, false, false, false, false, false, false, null, null, null, null, null, null, null, wr80Var, null, null, false, null, 130023423)));
            mp0 mp0VarX = cjx.X(((rs80) D()).i);
            cu cuVar = this.r;
            ieu ieuVar = (ieu) cuVar.c;
            qgd qgdVar = (qgd) cuVar.b;
            yje yjeVar = null;
            if (list.isEmpty() && list2.isEmpty()) {
                p6dVar = ((b5c) cuVar.d).f1996a.b.d ? new hpt(qgd.K(qgdVar, j, null, 14), (byte) 1) : new xu3(ieuVar.d(j, mp0VarX), (byte) 2);
            } else {
                p6dVar = new p6d(qgd.K(qgdVar, j, list2, 2), ieuVar.d(j, mp0VarX), new sch(r3qVar, cuVar, yjeVar, b), b);
            }
            sac.T(new dnq(new fnq(u1c.J(p6dVar), new khx((Object) this, (Object) r3qVar, yjeVar, (byte) 24), (byte) 4), new qos((Object) this, yjeVar, (byte) 27), (byte) 0), d5c.S(jiu0.a(this), this.G.b), new zs80(this, yjeVar, b));
        }
    }

    public final void Z() {
        c4m0 c4m0Var = this.e0;
        yje yjeVar = null;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        fk80 fk80Var = this.l0;
        if (fk80Var != null) {
            fk80Var.d();
        }
        List list = ((rs80) D()).x;
        List list2 = ((rs80) D()).y;
        String str = ((rs80) D()).m;
        String str2 = str == null ? "" : str;
        String str3 = ((rs80) D()).n;
        k06 k06VarO = this.S.o(this.o, list, list2, str2, str3 == null ? "" : str3, "");
        bvc bvcVarA = jiu0.a(this);
        mne mneVar = this.G;
        fk80 fk80Var2 = new fk80(k06VarO, bvcVarA, mneVar.b);
        this.e0 = sac.T(new dnq(new fnq(fk80Var2.g, new zs80(this, yjeVar, (byte) 2), (byte) 4), new gbv(this, yjeVar, (byte) 16), (byte) 0), d5c.S(jiu0.a(this), mneVar.b), new zs80(this, yjeVar, (byte) 3));
        this.l0 = fk80Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a0(zje zjeVar) {
        bt80 bt80Var;
        if (zjeVar instanceof bt80) {
            bt80Var = (bt80) zjeVar;
            int i = bt80Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bt80Var.k = i - Integer.MIN_VALUE;
            } else {
                bt80Var = new bt80(this, zjeVar);
            }
        } else {
            bt80Var = new bt80(this, zjeVar);
        }
        Object objK = bt80Var.i;
        wne wneVar = wne.f39444a;
        int i2 = bt80Var.k;
        if (i2 == 0) {
            z1x.P(objK);
            gmq gmqVarA = this.v.a(this.o);
            bt80Var.k = 1;
            objK = ntb.K(gmqVarA, bt80Var);
            if (objK == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objK);
        }
        Iterable iterable = (Iterable) objK;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(hew0.V((kr5) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:139:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:140:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:142:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:143:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:145:0x03b1  */
    /* JADX WARN: Code duplicated, block: B:147:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:148:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:154:0x0405  */
    /* JADX WARN: Code duplicated, block: B:157:0x0421  */
    /* JADX WARN: Code duplicated, block: B:199:0x0157 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0433 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0149  */
    /* JADX WARN: Code duplicated, block: B:61:0x015c  */
    @Override // a.i3t0, a.k3t0
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final void x(lr80 lr80Var) {
        Object next;
        Object value;
        fh0 fh0Var;
        boolean z;
        ArrayList arrayList;
        String str;
        Iterator it;
        Object next2;
        FilterItemUi filterItemUi;
        int i;
        long j;
        String str2;
        Iterator it2;
        Object next3;
        mlr mlrVar;
        lr80Var.getClass();
        super.x(lr80Var);
        if (lr80Var instanceof uq80) {
            E();
            return;
        }
        boolean z2 = lr80Var instanceof zq80;
        xoc xocVar = this.s;
        long j2 = this.o;
        yje yjeVar = null;
        if (z2) {
            uo0.f35987a.remove(uo0.a(j2));
            ap0 ap0Var = this.x.f41210a.b;
            ap0Var.f1227a.clear();
            ap0Var.c = null;
            xocVar.f41210a.b.d = false;
            iun iunVar = iun.f15405a;
            iunVar.getClass();
            fuu fuuVar = this.D;
            fuuVar.getClass();
            fuuVar.f10183a.b.a(j2, iunVar);
            G(ms80.f22307a);
            return;
        }
        boolean z3 = lr80Var instanceof ar80;
        mne mneVar = this.G;
        if (z3) {
            int i2 = ((ar80) lr80Var).f1334a;
            if (((rs80) D()).t instanceof mr80) {
                this.j0 = bww.R(jiu0.a(this), this.j0, T(), mneVar.f22085a, null, null, new bh0(this, i2, yjeVar, (byte) 20), 56);
                return;
            }
            return;
        }
        if (lr80Var instanceof cr80) {
            cr80 cr80Var = (cr80) lr80Var;
            sac.V(jiu0.a(this), new ws80(this, (byte) 4), null, mneVar.b, new bk5(this, cr80Var.b, cr80Var.f4832a, null), 10);
            return;
        }
        boolean z4 = lr80Var instanceof er80;
        byte b = 5;
        ix0 ix0Var = this.J;
        String str3 = "aggregator_live";
        byte b2 = 1;
        if (z4) {
            long j3 = ((er80) lr80Var).f8268a;
            Iterator it3 = ((rs80) D()).r.iterator();
            int i3 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    i3 = -1;
                    break;
                }
                Iterator it4 = it3;
                if (((mlr) it3.next()).f22006a == j3) {
                    break;
                }
                i3++;
                it3 = it4;
            }
            Integer numValueOf = Integer.valueOf(i3);
            if (i3 < 0) {
                numValueOf = null;
            }
            Integer numE = numValueOf != null ? kng0.e(1, numValueOf) : null;
            int iU = U();
            Integer numValueOf2 = Integer.valueOf(iU);
            if (iU == 0) {
                numValueOf2 = null;
            }
            int iIntValue = numValueOf2 != null ? numValueOf2.intValue() : 0;
            if (j2 != nw80.b.getId()) {
                if (j2 == nw80.f24223a.getId()) {
                    str2 = "aggregator_live";
                } else {
                    j = j3;
                }
                it2 = ((rs80) D()).r.iterator();
                do {
                    if (it2.hasNext()) {
                        next3 = null;
                        break;
                    }
                    next3 = it2.next();
                } while (((mlr) next3).f22006a != j);
                mlrVar = (mlr) next3;
                if (mlrVar != null) {
                    this.i0 = bww.R(jiu0.a(this), this.i0, T(), mneVar.f22085a, new ws80(this, b), null, new wk70(this, mlrVar, yjeVar, (byte) 25), 40);
                    return;
                }
                return;
            }
            str2 = "aggregator_slots";
            ix0Var.a((int) j3, iIntValue, numE, str2, null);
            j = j3;
            this.A.q(str2, iIntValue, j, numE, null);
            it2 = ((rs80) D()).r.iterator();
            do {
                if (it2.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it2.next();
            } while (((mlr) next3).f22006a != j);
            mlrVar = (mlr) next3;
            if (mlrVar != null) {
                this.i0 = bww.R(jiu0.a(this), this.i0, T(), mneVar.f22085a, new ws80(this, b), null, new wk70(this, mlrVar, yjeVar, (byte) 25), 40);
                return;
            }
            return;
        }
        boolean z5 = lr80Var instanceof fr80;
        eb0 eb0Var = eb0.f7494a;
        if (z5) {
            i3t0.A(this, this.R, eb0Var, null, null, 6);
            sac.V(jiu0.a(this), new r580((byte) 29), null, mneVar.b, new ft80(this, yjeVar, b), 10);
            return;
        }
        if (lr80Var instanceof gr80) {
            fk80 fk80Var = this.l0;
            if (fk80Var != null) {
                fk80Var.a(false);
                return;
            }
            return;
        }
        if (lr80Var instanceof ir80) {
            c0();
            return;
        }
        if (lr80Var instanceof jr80) {
            wgh0 wgh0Var = wgh0.MY_AGGREGATOR;
            this.h0 = bww.R(jiu0.a(this), this.h0, T(), mneVar.f22085a, null, null, new gt80(this, null), 56);
            return;
        }
        if (lr80Var instanceof kr80) {
            this.g0 = bww.R(jiu0.a(this), this.g0, T(), mneVar.b, null, null, new ft80(this, yjeVar, b2), 56);
            return;
        }
        if (lr80Var instanceof hr80) {
            i3t0.A(this, this.R, eb0Var, mneVar.b, null, 4);
            return;
        }
        byte b3 = 2;
        if (lr80Var instanceof yq80) {
            this.f0 = bww.R(jiu0.a(this), this.f0, T(), mneVar.b, null, null, new ft80(this, yjeVar, b3), 56);
            return;
        }
        if (lr80Var instanceof vq80) {
            vq80 vq80Var = (vq80) lr80Var;
            Y(vq80Var.f37844a, vq80Var.b);
            return;
        }
        if (!(lr80Var instanceof br80)) {
            if (lr80Var instanceof dr80) {
                this.k0 = bww.R(jiu0.a(this), this.k0, T(), mneVar.f22085a, null, null, new gt80(this, yjeVar, b2), 56);
                return;
            }
            if (lr80Var instanceof xq80) {
                this.p.c().d(new ka70(this, (j2 == nw80.b.getId() || j2 != nw80.f24223a.getId()) ? "aggregator_slots" : "aggregator_live", (byte) 7));
                return;
            }
            if (!(lr80Var instanceof wq80)) {
                t9f.b();
                return;
            }
            if (!this.r0) {
                this.r0 = true;
                e0(0L);
            }
            if (j2 == nw80.b.getId()) {
                sac.V(jiu0.a(this), new r580((byte) 28), null, mneVar.b, new er60((i3t0) this, yjeVar, (byte) 13), 10);
            }
            i3t0.A(this, this.R, za0.f44045a, mneVar.b, null, 4);
            return;
        }
        long j4 = ((br80) lr80Var).f3067a;
        if (((rs80) D()).w instanceof vr80) {
            return;
        }
        Iterator it5 = ((ur80) ((rs80) D()).w).f36152a.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next = null;
                break;
            }
            next = it5.next();
            Long lT0 = StringsKt.t0(((FilterItemUi) next).getF46281a());
            if (lT0 != null && lT0.longValue() == j4) {
                break;
            }
        }
        FilterItemUi filterItemUi2 = (FilterItemUi) next;
        if (filterItemUi2 == null || filterItemUi2.getC()) {
            return;
        }
        H(new nb50(filterItemUi2, CollectionsKt.Y(filterItemUi2, this.o0), (byte) 6));
        this.p0 = ((Boolean) ((rs80) D()).A.f46059a).booleanValue() ? 0 : Integer.valueOf(Integer.parseInt(filterItemUi2.getF46281a()));
        p7m0 p7m0Var = this.i.f25029a;
        do {
            value = p7m0Var.getValue();
            value.getClass();
            this.f.getClass();
        } while (!p7m0Var.m(value, rs80.a((rs80) value, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, false, null, 100663295)));
        xocVar.f41210a.b.d = false;
        this.n0 = null;
        if (this.o0.isEmpty()) {
            return;
        }
        List<PromotedCategoryUiModel> list = this.o0;
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        for (PromotedCategoryUiModel promotedCategoryUiModel : list) {
            promotedCategoryUiModel.getClass();
            arrayList2.add(PromotedCategoryUiModel.a(promotedCategoryUiModel, false));
        }
        this.o0 = arrayList2;
        String f46279a = filterItemUi2.getF46281a();
        u58 u58Var = this.A;
        u58Var.getClass();
        kt2 kt2Var = u58Var.f35083a;
        f46279a.getClass();
        kt2Var.a("game_page_filter_call", wp20.b(new Pair("filter", f46279a)));
        nw80 nw80Var = nw80.b;
        if (j2 != nw80Var.getId()) {
            if (j2 == nw80.f24223a.getId()) {
            }
            if (j2 == nw80.f24223a.getId()) {
                fh0Var = fh0.LIVE;
            } else if (j2 == nw80Var.getId()) {
                fh0Var = fh0.SLOTS;
            } else {
                fh0Var = null;
            }
            if (fh0Var != null) {
                if (((Boolean) ((rs80) D()).A.f46059a).booleanValue()) {
                    i = 0;
                } else {
                    i = Integer.parseInt(filterItemUi2.getF46281a());
                }
                ix0Var.getClass();
                z = false;
                ix0Var.f15516a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p(fh0Var.f9520a, (byte) 0)}), 3076L);
            } else {
                z = false;
            }
            List<PromotedCategoryUiModel> list2 = this.o0;
            arrayList = new ArrayList(r3d.q(list2, 10));
            for (PromotedCategoryUiModel promotedCategoryUiModel2 : list2) {
                List listC = kotlin.collections.a.c(filterItemUi2);
                promotedCategoryUiModel2.getClass();
                str = promotedCategoryUiModel2.f46279a;
                listC.getClass();
                it = listC.iterator();
                do {
                    if (it.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it.next();
                } while (!Intrinsics.d(((FilterItemUi) next2).getF46281a(), str));
                filterItemUi = (FilterItemUi) next2;
                boolean z6 = promotedCategoryUiModel2.c;
                String str4 = promotedCategoryUiModel2.b;
                if (filterItemUi == null && Intrinsics.d(str, filterItemUi.getF46281a())) {
                    z6 = !z6 ? true : z;
                }
                arrayList.add(new PromotedCategoryUiModel(str, str4, promotedCategoryUiModel2.d, z6));
            }
            this.o0 = arrayList;
            sac.V(jiu0.a(this), new ws80(this, b3), null, mneVar.b, new gt80(this, yjeVar, (byte) 3), 10);
        }
        str3 = "aggregator_slots";
        i8i.D("screen", str3, kt2Var, "game_page_filter_call");
        if (j2 == nw80.f24223a.getId()) {
            fh0Var = fh0.LIVE;
        } else if (j2 == nw80Var.getId()) {
            fh0Var = fh0.SLOTS;
        } else {
            fh0Var = null;
        }
        if (fh0Var != null) {
            if (((Boolean) ((rs80) D()).A.f46059a).booleanValue()) {
                i = 0;
            } else {
                i = Integer.parseInt(filterItemUi2.getF46281a());
            }
            ix0Var.getClass();
            z = false;
            ix0Var.f15516a.a(tx3.l0(new k1p[]{new i1p(i, (byte) 2), new j1p(fh0Var.f9520a, (byte) 0)}), 3076L);
        } else {
            z = false;
        }
        List<PromotedCategoryUiModel> list3 = this.o0;
        arrayList = new ArrayList(r3d.q(list3, 10));
        while (r1.hasNext()) {
            List listC2 = kotlin.collections.a.c(filterItemUi2);
            promotedCategoryUiModel2.getClass();
            str = promotedCategoryUiModel2.f46279a;
            listC2.getClass();
            it = listC2.iterator();
            do {
                if (it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!Intrinsics.d(((FilterItemUi) next2).getF46281a(), str));
            filterItemUi = (FilterItemUi) next2;
            boolean z7 = promotedCategoryUiModel2.c;
            String str5 = promotedCategoryUiModel2.b;
            if (filterItemUi == null) {
            }
            arrayList.add(new PromotedCategoryUiModel(str, str5, promotedCategoryUiModel2.d, z7));
        }
        this.o0 = arrayList;
        sac.V(jiu0.a(this), new ws80(this, b3), null, mneVar.b, new gt80(this, yjeVar, (byte) 3), 10);
    }

    public final void c0() {
        List list = ((rs80) D()).x;
        List list2 = ((rs80) D()).y;
        h03 h03Var = this.C;
        h03Var.getClass();
        list.getClass();
        list2.getClass();
        jr0 jr0Var = (jr0) ((n4u) h03Var.b).b;
        yje yjeVar = null;
        byte b = 4;
        sac.T(new fnq(new d2c(dtb.U(ulb.L(new vsg0(new cr0(jr0Var, this.o, yjeVar, (byte) 0)), jr0Var.d.b), 1), h03Var, list, list2, (byte) 0), new ft80(this, yjeVar, (byte) 3), b), d5c.S(jiu0.a(this), this.G.b), new zs80(this, yjeVar, b));
    }

    public final void d0() {
        List<PromotedCategoryUiModel> list = this.o0;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (PromotedCategoryUiModel promotedCategoryUiModel : list) {
            promotedCategoryUiModel.getClass();
            arrayList.add(new ezc0(promotedCategoryUiModel.f46279a, promotedCategoryUiModel.b, promotedCategoryUiModel.c));
        }
        fuu fuuVar = this.D;
        fuuVar.getClass();
        fuuVar.f10183a.b.a(this.o, arrayList);
    }

    public final void e0(long j) {
        bby bbyVar = this.d0;
        if (bbyVar == null || !bbyVar.isActive()) {
            this.d0 = sac.f0(jiu0.a(this), j, TimeUnit.SECONDS, this.G.b, new ws80(this, (byte) 0), new gt80(this, null, (byte) 2), 32);
        }
    }

    /* JADX WARN: Code duplicated, block: B:164:0x03d9  */
    public final void f0(r3q r3qVar, AggregatorProvidersFiltersUiModel aggregatorProvidersFiltersUiModel) {
        Object next;
        AggregatorProvidersFiltersUiModel aggregatorProvidersFiltersUiModelD0;
        Object next2;
        boolean z;
        String str;
        boolean z2;
        Object next3;
        ArrayList arrayList;
        this.o0 = aggregatorProvidersFiltersUiModel.c;
        List list = r3qVar.b;
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(String.valueOf(((Number) it.next()).longValue()));
        }
        FilterItemUi filterItemUiQ = Q(aggregatorProvidersFiltersUiModel, arrayList2, "dopInfo2");
        FilterItemUi filterItemUiQ2 = Q(aggregatorProvidersFiltersUiModel, arrayList2, "dopInfo4");
        FilterItemUi filterItemUiQ3 = Q(aggregatorProvidersFiltersUiModel, arrayList2, "dopInfo5");
        FilterItemUi filterItemUiQ4 = Q(aggregatorProvidersFiltersUiModel, arrayList2, "dopInfo6");
        List list2 = r3qVar.c;
        Iterator it2 = aggregatorProvidersFiltersUiModel.b.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (((FilterCategoryUiModel) next).c != w3q.b);
        FilterCategoryUiModel filterCategoryUiModel = (FilterCategoryUiModel) next;
        List list3 = filterCategoryUiModel != null ? filterCategoryUiModel.d : null;
        if (list3 == null) {
            list3 = iun.f15405a;
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            FilterItemUi filterItemUiM = M(list3, kotlin.collections.a.c(String.valueOf(((Number) it3.next()).longValue())));
            if (filterItemUiM != null) {
                arrayList3.add(filterItemUiM);
            }
        }
        boolean z3 = false;
        List listZ = tx3.z(new FilterItemUi[]{filterItemUiQ, filterItemUiQ2, filterItemUiQ3, filterItemUiQ4});
        ArrayList arrayList4 = (ArrayList) listZ;
        boolean zIsEmpty = arrayList4.isEmpty();
        jdk0 jdk0Var = this.t;
        irc ircVar = this.u;
        if (!zIsEmpty && !arrayList3.isEmpty()) {
            AggregatorProvidersFiltersUiModel aggregatorProvidersFiltersUiModelN = N(listZ, aggregatorProvidersFiltersUiModel);
            w3q[] w3qVarArr = {w3q.b};
            iun iunVar = iun.f15405a;
            jdk0Var.getClass();
            aggregatorProvidersFiltersUiModelD0 = j47.D0(arrayList3, jdk0.g(iunVar, aggregatorProvidersFiltersUiModelN, w3qVarArr));
            ircVar.a(dwi0.P(aggregatorProvidersFiltersUiModelD0));
        } else if (!arrayList4.isEmpty()) {
            aggregatorProvidersFiltersUiModelD0 = N(listZ, aggregatorProvidersFiltersUiModel);
        } else if (arrayList3.isEmpty()) {
            aggregatorProvidersFiltersUiModelD0 = aggregatorProvidersFiltersUiModel;
        } else {
            w3q[] w3qVarArr2 = {w3q.b};
            iun iunVar2 = iun.f15405a;
            jdk0Var.getClass();
            aggregatorProvidersFiltersUiModelD0 = j47.D0(arrayList3, jdk0.g(iunVar2, aggregatorProvidersFiltersUiModel, w3qVarArr2));
            ircVar.a(dwi0.P(aggregatorProvidersFiltersUiModelD0));
        }
        List list4 = aggregatorProvidersFiltersUiModelD0.b;
        this.m0 = aggregatorProvidersFiltersUiModelD0;
        w3q w3qVar = w3q.f38514a;
        ArrayList arrayList5 = new ArrayList();
        for (Object obj : list4) {
            if (((FilterCategoryUiModel) obj).c == w3qVar) {
                arrayList5.add(obj);
            }
        }
        Collection collectionQ0 = iun.f15405a;
        Iterator it4 = arrayList5.iterator();
        while (it4.hasNext()) {
            List list5 = ((FilterCategoryUiModel) it4.next()).d;
            ArrayList arrayList6 = new ArrayList();
            for (Object obj2 : list5) {
                if (((FilterItemUi) obj2).getC()) {
                    arrayList6.add(obj2);
                }
            }
            ArrayList arrayList7 = new ArrayList(r3d.q(arrayList6, 10));
            Iterator it5 = arrayList6.iterator();
            while (it5.hasNext()) {
                arrayList7.add(((FilterItemUi) it5.next()).getF46281a());
            }
            ArrayList arrayList8 = new ArrayList();
            for (Object obj3 : arrayList7) {
                if (Intrinsics.d((String) obj3, "0")) {
                    arrayList8.add(obj3);
                }
            }
            collectionQ0 = CollectionsKt.q0(collectionQ0, arrayList8);
        }
        List listP = P(list4, w3q.f38514a);
        List listP2 = P(list4, w3q.b);
        w3q w3qVar2 = w3q.d;
        ArrayList arrayList9 = new ArrayList();
        for (Object obj4 : list4) {
            if (((FilterCategoryUiModel) obj4).c == w3qVar2) {
                arrayList9.add(obj4);
            }
        }
        ArrayList arrayList10 = new ArrayList();
        Iterator it6 = arrayList9.iterator();
        while (it6.hasNext()) {
            w3d.u(arrayList10, ((FilterCategoryUiModel) it6.next()).d);
        }
        ArrayList arrayList11 = new ArrayList();
        for (Object obj5 : arrayList10) {
            if (obj5 instanceof SortingOptionUiModel) {
                arrayList11.add(obj5);
            }
        }
        Iterator it7 = arrayList11.iterator();
        do {
            if (!it7.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it7.next();
        } while (!((SortingOptionUiModel) next2).c);
        SortingOptionUiModel sortingOptionUiModel = (SortingOptionUiModel) next2;
        boolean z4 = (listP.isEmpty() && listP2.isEmpty() && sortingOptionUiModel == null) ? false : true;
        boolean zIsEmpty2 = this.o0.isEmpty();
        oyg0 oyg0Var = this.f;
        ocj ocjVar = this.i;
        if (zIsEmpty2) {
            z = false;
            str = null;
        } else {
            if (collectionQ0.isEmpty() || !listP2.isEmpty() || z4) {
                str = null;
                List<PromotedCategoryUiModel> list6 = this.o0;
                if (z4) {
                    arrayList = new ArrayList(r3d.q(list6, 10));
                    for (PromotedCategoryUiModel promotedCategoryUiModel : list6) {
                        promotedCategoryUiModel.getClass();
                        arrayList.add(PromotedCategoryUiModel.a(promotedCategoryUiModel, false));
                    }
                    z = false;
                } else {
                    z = false;
                    arrayList = new ArrayList(r3d.q(list6, 10));
                    int i = 0;
                    for (Object obj6 : list6) {
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        PromotedCategoryUiModel promotedCategoryUiModel2 = (PromotedCategoryUiModel) obj6;
                        promotedCategoryUiModel2.getClass();
                        arrayList.add(new PromotedCategoryUiModel(promotedCategoryUiModel2.f46279a, promotedCategoryUiModel2.b, promotedCategoryUiModel2.d, i == 0));
                        i = i2;
                    }
                }
            } else {
                List list7 = this.o0;
                arrayList = new ArrayList(r3d.q(list7, 10));
                int i3 = 0;
                for (Object obj7 : list7) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        q3d.p();
                        throw null;
                    }
                    PromotedCategoryUiModel promotedCategoryUiModel3 = (PromotedCategoryUiModel) obj7;
                    promotedCategoryUiModel3.getClass();
                    String str2 = promotedCategoryUiModel3.f46279a;
                    arrayList.add(new PromotedCategoryUiModel(str2, promotedCategoryUiModel3.b, promotedCategoryUiModel3.d, Intrinsics.d(str2, "0")));
                    i3 = i4;
                    z3 = false;
                }
                str = null;
                z = z3;
            }
            this.o0 = arrayList;
            ur80 ur80Var = new ur80(arrayList);
            p7m0 p7m0Var = ocjVar.f25029a;
            while (true) {
                Object value = p7m0Var.getValue();
                value.getClass();
                oyg0Var.getClass();
                ur80 ur80Var2 = ur80Var;
                if (p7m0Var.m(value, rs80.a((rs80) value, false, false, false, false, false, false, false, null, null, null, null, null, null, null, ur80Var2, null, null, false, null, 130023423))) {
                    break;
                } else {
                    ur80Var = ur80Var2;
                }
            }
        }
        wr80 wr80Var = ((rs80) D()).w;
        if (wr80Var instanceof ur80) {
            Iterator it8 = ((ur80) wr80Var).f36152a.iterator();
            do {
                if (!it8.hasNext()) {
                    next3 = str;
                    break;
                }
                next3 = it8.next();
            } while (!((FilterItemUi) next3).getC());
            FilterItemUi filterItemUi = (FilterItemUi) next3;
            if (filterItemUi != null) {
                H(new dr50((Object) filterItemUi, (Object) listP2, (Object) wr80Var, (byte) 23));
            }
        }
        if (!Intrinsics.d(((rs80) D()).y, listP2) || !Intrinsics.d(((rs80) D()).x, listP)) {
            z2 = z;
        } else if (!Intrinsics.d(((rs80) D()).m, sortingOptionUiModel != null ? sortingOptionUiModel.e : str)) {
            z2 = z;
        } else if (Intrinsics.d(((rs80) D()).n, sortingOptionUiModel != null ? sortingOptionUiModel.f : str)) {
            z2 = true;
        } else {
            z2 = z;
        }
        H(new dr50((Object) sortingOptionUiModel, (Object) listP, (Object) listP2, (byte) 24));
        if (!z2) {
            Z();
        }
        g0();
        p7m0 p7m0Var2 = ocjVar.f25029a;
        while (true) {
            Object value2 = p7m0Var2.getValue();
            value2.getClass();
            oyg0 oyg0Var2 = oyg0Var;
            oyg0Var2.getClass();
            if (p7m0Var2.m(value2, rs80.a((rs80) value2, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, null, null, z4, null, 100663295))) {
                ircVar.a(dwi0.P(this.m0));
                return;
            }
            oyg0Var = oyg0Var2;
        }
    }

    public final void g0() {
        if (((rs80) D()).r.isEmpty() && !this.q0) {
            Z();
        } else {
            if (((rs80) D()).r.isEmpty()) {
                return;
            }
            H(new zc70((byte) 25));
        }
    }
}
