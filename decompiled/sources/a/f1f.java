package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class f1f extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ Integer j;
    public final /* synthetic */ g45 k;
    public final /* synthetic */ q4f l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ int p;
    public final /* synthetic */ List q;
    public final /* synthetic */ boolean r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1f(Integer num, g45 g45Var, q4f q4fVar, long j, long j2, boolean z, int i, List list, boolean z2, yje yjeVar) {
        super(2, yjeVar);
        this.j = num;
        this.k = g45Var;
        this.l = q4fVar;
        this.m = j;
        this.n = j2;
        this.o = z;
        this.p = i;
        this.q = list;
        this.r = z2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new f1f(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f1f) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v13, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r12v14 */
    /* JADX WARN: Type inference failed for: r12v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r14v13, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r20v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r43v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v11, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v6, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r87v0, types: [java.util.List] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objI;
        ?? arrayList;
        List list;
        ?? arrayList2;
        vb9 vb9Var;
        ?? arrayList3;
        kb9 kb9Var;
        ?? arrayList4;
        Integer intOrNull;
        g45 g45Var = this.k;
        knf0 knf0Var = (knf0) g45Var.h;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        int i = 10;
        int i2 = 0;
        if (!z) {
            z1x.P(obj);
            Integer num = this.j;
            int iIntValue = num != null ? num.intValue() : knf0Var.b();
            int iA = this.l.a();
            List list2 = this.q;
            list2.getClass();
            String strA = knf0Var.a();
            String strC = knf0Var.c();
            knf0Var.getClass();
            knf0Var.getClass();
            strA.getClass();
            qu6 qu6VarO = (qu6) CollectionsKt.firstOrNull(list2);
            if (qu6VarO == null) {
                qu6VarO = j120.O();
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : list2) {
                Long lValueOf = Long.valueOf(((qu6) obj2).b);
                Object arrayList5 = linkedHashMap.get(lValueOf);
                if (arrayList5 == null) {
                    arrayList5 = new ArrayList();
                    linkedHashMap.put(lValueOf, arrayList5);
                }
                ((List) arrayList5).add(obj2);
            }
            ArrayList arrayList6 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                long jLongValue = ((Number) entry.getKey()).longValue();
                List<qu6> list3 = (List) entry.getValue();
                qu6 qu6Var = (qu6) CollectionsKt.firstOrNull(list3);
                ic9 ic9Var = qu6Var != null ? qu6Var.F : new ic9(i2, i2, i2, uyc.IDLE);
                nb9 nb9Var = new nb9(ic9Var.f14524a, ic9Var.c, ic9Var.b);
                ArrayList arrayList7 = new ArrayList(r3d.q(list3, i));
                for (qu6 qu6Var2 : list3) {
                    arrayList7.add(new ec9(qu6Var2.s, qu6Var2.t, qu6Var2.d, qu6Var2.f, qu6Var2.x));
                    nb9Var = nb9Var;
                }
                arrayList6.add(new hc9(jLongValue, nb9Var, arrayList7));
                i = 10;
                i2 = 0;
            }
            sht0 sht0Var = new sht0(strA, this.o, new yb9(qu6VarO.c, qu6VarO.e, arrayList6), strC, this.p, qu6VarO.w.f36034a, this.m, this.n, iIntValue, iA);
            ehf0 ehf0Var = (ehf0) g45Var.d;
            this.i = true;
            objI = ((vre) ((jwd) ehf0Var.c).invoke()).i(sht0Var, this);
            if (objI == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objI = obj;
        }
        wht0 wht0Var = (wht0) ((q16) objI).a();
        q4f q4fVar = ((ave) g45Var.c).f1521a;
        q4fVar.getClass();
        String str = wht0Var.B;
        int iIntValue2 = (str == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) ? 0 : intOrNull.intValue();
        Integer num2 = wht0Var.M;
        int iIntValue3 = num2 != null ? num2.intValue() : 0;
        Integer num3 = wht0Var.G;
        int iIntValue4 = num3 != null ? num3.intValue() : 0;
        Integer num4 = wht0Var.E;
        int iIntValue5 = num4 != null ? num4.intValue() : 0;
        List list4 = wht0Var.J;
        if (list4 != null) {
            arrayList = new ArrayList(r3d.q(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(p8a.f0((oq7) it.next(), this.r));
            }
        } else {
            arrayList = iun.f15405a;
        }
        ?? r43 = arrayList;
        Integer num5 = wht0Var.g0;
        int iIntValue6 = num5 != null ? num5.intValue() : 0;
        List list5 = wht0Var.a0;
        if (list5 == null) {
            list5 = iun.f15405a;
        }
        List list6 = list5;
        String str2 = wht0Var.K;
        String str3 = str2 == null ? "" : str2;
        Boolean bool = wht0Var.F;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        Integer num6 = wht0Var.H;
        int iIntValue7 = num6 != null ? num6.intValue() : 0;
        Integer num7 = wht0Var.h0;
        int iIntValue8 = num7 != null ? num7.intValue() : 0;
        Double d = wht0Var.z;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        String str4 = wht0Var.C;
        String str5 = str4 == null ? "" : str4;
        Integer num8 = wht0Var.X;
        int iIntValue9 = num8 != null ? num8.intValue() : 0;
        Integer num9 = wht0Var.u;
        int iIntValue10 = num9 != null ? num9.intValue() : 0;
        Integer num10 = wht0Var.v;
        int iIntValue11 = num10 != null ? num10.intValue() : 0;
        Integer num11 = wht0Var.A;
        int iIntValue12 = num11 != null ? num11.intValue() : 0;
        Boolean bool2 = wht0Var.Y;
        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
        Boolean bool3 = wht0Var.S;
        boolean zBooleanValue3 = bool3 != null ? bool3.booleanValue() : false;
        String str6 = wht0Var.R;
        String str7 = str6 == null ? "" : str6;
        Boolean bool4 = wht0Var.L;
        boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
        Integer num12 = wht0Var.T;
        int iIntValue13 = num12 != null ? num12.intValue() : 0;
        Boolean bool5 = wht0Var.Q;
        boolean zBooleanValue5 = bool5 != null ? bool5.booleanValue() : false;
        Integer num13 = wht0Var.N;
        int iIntValue14 = num13 != null ? num13.intValue() : 0;
        String str8 = wht0Var.O;
        String str9 = str8 == null ? "" : str8;
        Double d2 = wht0Var.f39183a;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        Double d3 = wht0Var.b;
        double dDoubleValue3 = d3 != null ? d3.doubleValue() : 0.0d;
        iun iunVar = iun.f15405a;
        Double d4 = wht0Var.j0;
        double dDoubleValue4 = d4 != null ? d4.doubleValue() : 0.0d;
        Double d5 = wht0Var.i0;
        double dDoubleValue5 = d5 != null ? d5.doubleValue() : 0.0d;
        List list7 = wht0Var.c;
        if (list7 != null) {
            ArrayList arrayList8 = new ArrayList(r3d.q(list7, 10));
            Iterator it2 = list7.iterator();
            while (it2.hasNext()) {
                arrayList8.add(knx.S((nn7) it2.next()));
            }
            list = arrayList8;
        } else {
            list = iunVar;
        }
        Boolean bool6 = wht0Var.d;
        boolean zBooleanValue6 = bool6 != null ? bool6.booleanValue() : false;
        Boolean bool7 = wht0Var.e;
        boolean zBooleanValue7 = bool7 != null ? bool7.booleanValue() : false;
        Double d6 = wht0Var.b0;
        double dDoubleValue6 = d6 != null ? d6.doubleValue() : 0.0d;
        String str10 = wht0Var.o0;
        Double d7 = wht0Var.c0;
        double dDoubleValue7 = d7 != null ? d7.doubleValue() : 0.0d;
        Boolean bool8 = wht0Var.f;
        boolean zBooleanValue8 = bool8 != null ? bool8.booleanValue() : false;
        Double d8 = wht0Var.i;
        double dDoubleValue8 = d8 != null ? d8.doubleValue() : 0.0d;
        List list8 = wht0Var.P;
        if (list8 != null) {
            arrayList2 = new ArrayList(r3d.q(list8, 10));
            Iterator it3 = list8.iterator();
            while (it3.hasNext()) {
                arrayList2.add(efx.P((hfc0) it3.next()));
            }
        } else {
            arrayList2 = iun.f15405a;
        }
        ?? r87 = arrayList2;
        Integer num14 = wht0Var.j;
        int iIntValue15 = num14 != null ? num14.intValue() : 0;
        Double d9 = wht0Var.l;
        double dDoubleValue9 = d9 != null ? d9.doubleValue() : 0.0d;
        Double d10 = wht0Var.k;
        double dDoubleValue10 = d10 != null ? d10.doubleValue() : 0.0d;
        String str11 = wht0Var.W;
        String str12 = str11 == null ? "" : str11;
        Boolean bool9 = wht0Var.m;
        boolean zBooleanValue9 = bool9 != null ? bool9.booleanValue() : false;
        ozc ozcVarR = kkb.R(wht0Var.r0, q4fVar);
        String str13 = wht0Var.g;
        String str14 = str13 == null ? "" : str13;
        List list9 = wht0Var.h;
        if (list9 == null) {
            list9 = iun.f15405a;
        }
        List list10 = list9;
        Integer num15 = wht0Var.n;
        int iIntValue16 = num15 != null ? num15.intValue() : 0;
        String str15 = wht0Var.o;
        String str16 = str15 == null ? "" : str15;
        Boolean bool10 = wht0Var.p;
        boolean zBooleanValue10 = bool10 != null ? bool10.booleanValue() : false;
        Integer num16 = wht0Var.q;
        int iIntValue17 = num16 != null ? num16.intValue() : 0;
        oxk0 oxk0VarL = p7x.L(wht0Var.t0);
        Double d11 = wht0Var.s;
        double dDoubleValue11 = d11 != null ? d11.doubleValue() : 0.0d;
        String str17 = wht0Var.t;
        String str18 = str17 == null ? "" : str17;
        Double d12 = wht0Var.v0;
        double dDoubleValue12 = d12 != null ? d12.doubleValue() : 0.0d;
        Boolean bool11 = wht0Var.u0;
        boolean zBooleanValue11 = bool11 != null ? bool11.booleanValue() : false;
        bc9 bc9Var = wht0Var.n0;
        if (bc9Var != null) {
            Long l = bc9Var.f2344a;
            if (l == null) {
                throw new ef5();
            }
            long jLongValue2 = l.longValue();
            Long l2 = bc9Var.d;
            long jLongValue3 = l2 != null ? l2.longValue() : 0L;
            List<ub9> list11 = bc9Var.c;
            if (list11 != null) {
                arrayList3 = new ArrayList(r3d.q(list11, 10));
                for (ub9 ub9Var : list11) {
                    Long l3 = ub9Var.f35369a;
                    long jLongValue4 = l3 != null ? l3.longValue() : 0L;
                    qb9 qb9Var = ub9Var.b;
                    if (qb9Var != null) {
                        Integer num17 = qb9Var.f28437a;
                        int iIntValue18 = num17 != null ? num17.intValue() : 0;
                        Integer num18 = qb9Var.b;
                        int iIntValue19 = num18 != null ? num18.intValue() : 0;
                        Integer num19 = qb9Var.c;
                        kb9Var = new kb9(iIntValue18, iIntValue19, num19 != null ? num19.intValue() : 0);
                    } else {
                        kb9Var = new kb9(0, 0, 0);
                    }
                    kb9 kb9Var2 = kb9Var;
                    List<jb9> list12 = ub9Var.c;
                    if (list12 != null) {
                        arrayList4 = new ArrayList(r3d.q(list12, 10));
                        for (jb9 jb9Var : list12) {
                            Long l4 = jb9Var.f16227a;
                            long jLongValue5 = l4 != null ? l4.longValue() : 0L;
                            Double d13 = jb9Var.b;
                            double dDoubleValue13 = d13 != null ? d13.doubleValue() : 0.0d;
                            String str19 = jb9Var.c;
                            String str20 = str19 == null ? "" : str19;
                            Long l5 = jb9Var.d;
                            long jLongValue6 = l5 != null ? l5.longValue() : 0L;
                            String str21 = jb9Var.e;
                            String str22 = str21 == null ? "" : str21;
                            Boolean bool12 = jb9Var.f;
                            arrayList4.add(new gb9(dDoubleValue13, jLongValue5, jLongValue6, str20, str22, bool12 != null ? bool12.booleanValue() : false));
                        }
                    } else {
                        arrayList4 = iun.f15405a;
                    }
                    ?? r20 = arrayList4;
                    String str23 = ub9Var.d;
                    arrayList3.add(new rb9(jLongValue4, kb9Var2, r20, str23 == null ? "" : str23));
                }
            } else {
                arrayList3 = iun.f15405a;
            }
            ?? r13 = arrayList3;
            Boolean bool13 = bc9Var.e;
            boolean zBooleanValue12 = bool13 != null ? bool13.booleanValue() : false;
            String str24 = bc9Var.f;
            String str25 = str24 == null ? "" : str24;
            Integer num20 = bc9Var.g;
            vb9Var = new vb9(num20 != null ? num20.intValue() : 0, jLongValue2, jLongValue3, str25, r13, zBooleanValue12);
        } else {
            vb9Var = null;
        }
        return new cit0(iIntValue2, iIntValue3, iIntValue4, iIntValue5, r43, 0, iIntValue6, list6, str3, zBooleanValue, iIntValue7, iIntValue8, dDoubleValue, str5, iIntValue9, iIntValue10, iIntValue11, iIntValue12, zBooleanValue2, zBooleanValue3, str7, zBooleanValue4, iIntValue13, zBooleanValue5, false, iIntValue14, str9, dDoubleValue2, dDoubleValue3, iunVar, dDoubleValue4, dDoubleValue5, list, zBooleanValue6, zBooleanValue7, dDoubleValue6, str10, dDoubleValue7, zBooleanValue8, dDoubleValue8, r87, iIntValue15, dDoubleValue10, dDoubleValue9, str12, zBooleanValue9, ozcVarR, str14, list10, iIntValue16, str16, zBooleanValue10, iIntValue17, oxk0VarL, dDoubleValue11, str18, dDoubleValue12, zBooleanValue11, vb9Var);
    }
}
