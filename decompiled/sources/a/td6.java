package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class td6 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;
    public final /* synthetic */ Object m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(i89 i89Var, clz clzVar, df2 df2Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 10;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = df2Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.m;
        Object obj3 = this.l;
        switch (b) {
            case 0:
                lkz lkzVar = lkz.f20223a;
                return new td6((gmq) this.k, (clz) obj3, (ud6) obj2, yjeVar);
            case 1:
                lkz lkzVar2 = lkz.f20223a;
                return new td6((gmq) this.k, (clz) obj3, (vd6) obj2, yjeVar);
            case 2:
                lkz lkzVar3 = lkz.f20223a;
                return new td6((gmq) this.k, (clz) obj3, (ud6) obj2, yjeVar, (byte) 0);
            case 3:
                td6 td6Var = new td6(obj3, obj2, yjeVar, (byte) 3);
                td6Var.k = obj;
                return td6Var;
            case 4:
                lkz lkzVar4 = lkz.f20223a;
                return new td6((i89) this.k, (clz) obj3, (df2) obj2, yjeVar);
            case 5:
                lkz lkzVar5 = lkz.f20223a;
                return new td6((gmq) this.k, (clz) obj3, (do6) obj2, yjeVar);
            case 6:
                lkz lkzVar6 = lkz.f20223a;
                return new td6((gmq) this.k, (clz) obj3, (do6) obj2, yjeVar, (byte) 0);
            case 7:
                lkz lkzVar7 = lkz.f20223a;
                return new td6((gmq) this.k, (clz) obj3, (do6) obj2, yjeVar, (char) 0);
            case 8:
                lkz lkzVar8 = lkz.f20223a;
                return new td6((gmq) this.k, (clz) obj3, (do6) obj2, yjeVar, 0);
            case 9:
                lkz lkzVar9 = lkz.f20223a;
                return new td6((xae0) this.k, (clz) obj3, (yp6) obj2, yjeVar);
            case 10:
                lkz lkzVar10 = lkz.f20223a;
                return new td6((i89) this.k, (clz) obj3, (df2) obj2, yjeVar, (byte) 0);
            case 11:
                lkz lkzVar11 = lkz.f20223a;
                return new td6((gmq) this.k, (clz) obj3, (dr6) obj2, yjeVar);
            case 12:
                lkz lkzVar12 = lkz.f20223a;
                return new td6((gmq) this.k, (clz) obj3, (dr6) obj2, yjeVar, (byte) 0);
            case 13:
                lkz lkzVar13 = lkz.f20223a;
                return new td6((gmq) this.k, (clz) obj3, (dr6) obj2, yjeVar, (char) 0);
            case 14:
                lkz lkzVar14 = lkz.f20223a;
                return new td6((i89) this.k, (clz) obj3, (df2) obj2, yjeVar, (char) 0);
            case 15:
                lkz lkzVar15 = lkz.f20223a;
                return new td6((xae0) this.k, (clz) obj3, (qv3) obj2, yjeVar);
            case 16:
                lkz lkzVar16 = lkz.f20223a;
                return new td6((xae0) this.k, (clz) obj3, (it6) obj2, yjeVar);
            case 17:
                lkz lkzVar17 = lkz.f20223a;
                return new td6((gmq) this.k, (clz) obj3, (it6) obj2, yjeVar);
            case 18:
                lkz lkzVar18 = lkz.f20223a;
                return new td6((vae0) this.k, (clz) obj3, (wa) obj2, yjeVar);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                lkz lkzVar19 = lkz.f20223a;
                return new td6((xae0) this.k, (clz) obj3, (ot6) obj2, yjeVar);
            case 20:
                lkz lkzVar20 = lkz.f20223a;
                return new td6((xae0) this.k, (clz) obj3, (ot6) obj2, yjeVar, (byte) 0);
            case 21:
                lkz lkzVar21 = lkz.f20223a;
                return new td6((gmq) this.k, (clz) obj3, (ot6) obj2, yjeVar);
            case 22:
                lkz lkzVar22 = lkz.f20223a;
                return new td6((xae0) this.k, (clz) obj3, (pt6) obj2, yjeVar);
            case 23:
                lkz lkzVar23 = lkz.f20223a;
                return new td6((xae0) this.k, (clz) obj3, (ot6) obj2, yjeVar, (char) 0);
            case 24:
                lkz lkzVar24 = lkz.f20223a;
                return new td6((ewt) this.k, (clz) obj3, (ot6) obj2, yjeVar);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                lkz lkzVar25 = lkz.f20223a;
                return new td6((xae0) this.k, (clz) obj3, (ot6) obj2, yjeVar, 0);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                lkz lkzVar26 = lkz.f20223a;
                return new td6((gmq) this.k, (clz) obj3, (ot6) obj2, yjeVar, (byte) 0);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                lkz lkzVar27 = lkz.f20223a;
                return new td6((gmq) this.k, (clz) obj3, (yp6) obj2, yjeVar);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                lkz lkzVar28 = lkz.f20223a;
                return new td6((i89) this.k, (clz) obj3, (o47) obj2, yjeVar);
            default:
                td6 td6Var2 = new td6(obj3, obj2, yjeVar, (byte) 29);
                td6Var2.k = obj;
                return td6Var2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((td6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((td6) create((v1z) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:493:0x0a9a  */
    /* JADX WARN: Code duplicated, block: B:498:0x0aae  */
    /* JADX WARN: Code duplicated, block: B:560:0x0aa2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x0a94 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v33, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r8v34, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v35, types: [java.util.ArrayList] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Throwable {
        long j;
        Object objA;
        Throwable th;
        Object g0g0Var;
        ArrayList<xf6> arrayList;
        Iterator it;
        ArrayList arrayList2;
        boolean z;
        Object value;
        Object g0g0Var2;
        ArrayList arrayList3;
        tvm0 tvm0Var;
        ?? arrayList4;
        Long l;
        Integer num;
        Integer num2;
        Integer num3;
        Long l2;
        Object objG;
        Object obj2;
        byte b = this.i;
        byte b2 = 0;
        byte b3 = 10;
        Object obj3 = this.m;
        Object obj4 = this.l;
        byte b4 = 1;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    bq9 bq9VarB = hkb.B((gmq) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var = new ml5((ud6) obj3, (byte) 7);
                    this.j = true;
                    if (bq9VarB.c(ml5Var, this) == wneVar) {
                        return wneVar;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    bq9 bq9VarB2 = hkb.B((gmq) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var2 = new ml5((vd6) obj3, (byte) 8);
                    this.j = true;
                    if (bq9VarB2.c(ml5Var2, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    bq9 bq9VarB3 = hkb.B((gmq) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var3 = new ml5((ud6) obj3, (byte) 9);
                    this.j = true;
                    if (bq9VarB3.c(ml5Var3, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                yf6 yf6Var = (yf6) obj3;
                bl6 bl6Var = (bl6) obj4;
                jym0 jym0Var = bl6Var.g;
                yvf yvfVar = bl6Var.h;
                knf0 knf0Var = bl6Var.c;
                vne vneVar = (vne) this.k;
                wne wneVar4 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    int iA = bl6Var.b.a();
                    are areVar = yf6Var.f;
                    Integer num4 = areVar.b ? null : new Integer(areVar.f1342a);
                    int iB = knf0Var.b();
                    String strC = knf0Var.c();
                    knf0Var.getClass();
                    boolean z6 = yf6Var.d;
                    j = 0;
                    long j2 = yf6Var.e;
                    jo20 jo20Var = new jo20();
                    jo20Var.put("cfView", Integer.valueOf(iA));
                    if (num4 != null) {
                        jo20Var.put("country", num4);
                    }
                    jo20Var.put("fcountry", Integer.valueOf(iB));
                    jo20Var.put("lng", strC);
                    jo20Var.put("ref", 1);
                    if (z6 && j2 > 0) {
                        jo20Var.put("userId", Long.valueOf(j2));
                    }
                    jo20 jo20VarB = jo20Var.b();
                    try {
                        e0g0 e0g0Var = j0g0.b;
                        fvt0 fvt0Var = bl6Var.f2779a;
                        boolean z7 = yf6Var.c;
                        kg6 kg6VarE0 = tke.e0(yf6Var);
                        this.k = vneVar;
                        this.j = true;
                        objA = ((mf6) ((zm) fvt0Var.f10231a).invoke()).a(z7 ? "Live" : "Line", jo20VarB, kg6VarE0, this);
                        if (objA == wneVar4) {
                            return wneVar4;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        e0g0 e0g0Var2 = j0g0.b;
                        g0g0Var = new g0g0(th);
                    }
                } else {
                    if (!z5) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    try {
                        z1x.P(obj);
                        objA = obj;
                        j = 0;
                    } catch (Throwable th3) {
                        th = th3;
                        j = 0;
                        e0g0 e0g0Var3 = j0g0.b;
                        g0g0Var = new g0g0(th);
                    }
                }
                g0g0Var = (dx5) objA;
                e0g0 e0g0Var4 = j0g0.b;
                Throwable thA = j0g0.a(g0g0Var);
                if (thA != null) {
                    if (thA instanceof fhi0) {
                        return iun.f15405a;
                    }
                    throw thA;
                }
                List<ah6> list = (List) ((dx5) g0g0Var).a();
                ArrayList<xf6> arrayList5 = new ArrayList(r3d.q(list, 10));
                for (ah6 ah6Var : list) {
                    qg6 qg6Var = ah6Var.f858a;
                    long jLongValue = (qg6Var == null || (l2 = qg6Var.f28668a) == null) ? j : l2.longValue();
                    int iIntValue = (qg6Var == null || (num3 = qg6Var.b) == null) ? 0 : num3.intValue();
                    int iIntValue2 = (qg6Var == null || (num2 = qg6Var.c) == null) ? 0 : num2.intValue();
                    int iIntValue3 = (qg6Var == null || (num = qg6Var.d) == null) ? 0 : num.intValue();
                    String str = qg6Var != null ? qg6Var.e : null;
                    mh6 mh6Var = new mh6(iIntValue, iIntValue2, iIntValue3, jLongValue, str == null ? "" : str);
                    List<zg6> list2 = ah6Var.b;
                    if (list2 != null) {
                        arrayList4 = new ArrayList(r3d.q(list2, 10));
                        for (zg6 zg6Var : list2) {
                            Long l3 = zg6Var.f44329a;
                            yg6 yg6Var = zg6Var.c;
                            long jLongValue2 = l3 != null ? l3.longValue() : j;
                            Boolean bool = zg6Var.b;
                            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                            long jLongValue3 = (yg6Var == null || (l = yg6Var.f42572a) == null) ? j : l.longValue();
                            String str2 = yg6Var != null ? yg6Var.b : null;
                            if (str2 == null) {
                                str2 = "";
                            }
                            rh7 rh7Var = new rh7(jLongValue3, str2);
                            Double d = zg6Var.d;
                            double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
                            Double d2 = zg6Var.e;
                            double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
                            String str3 = zg6Var.f;
                            String str4 = str3 == null ? "" : str3;
                            Boolean bool2 = zg6Var.g;
                            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                            Long l4 = zg6Var.h;
                            long jLongValue4 = l4 != null ? l4.longValue() : j;
                            vg6 vg6Var = zg6Var.i;
                            List list3 = vg6Var != null ? vg6Var.b : null;
                            if (list3 == null) {
                                list3 = iun.f15405a;
                            }
                            List list4 = vg6Var != null ? vg6Var.f37367a : null;
                            if (list4 == null) {
                                list4 = iun.f15405a;
                            }
                            afo afoVar = new afo(list3, list4);
                            Long l5 = zg6Var.j;
                            long jLongValue5 = l5 != null ? l5.longValue() : j;
                            Long l6 = zg6Var.k;
                            arrayList4.add(new ei6(jLongValue2, zBooleanValue, rh7Var, dDoubleValue, dDoubleValue2, str4, zBooleanValue2, jLongValue4, afoVar, jLongValue5, l6 != null ? l6.longValue() : j));
                        }
                    } else {
                        arrayList4 = iun.f15405a;
                    }
                    arrayList5.add(new xf6(mh6Var, arrayList4));
                }
                List list5 = yf6Var.b;
                if (list5.isEmpty()) {
                    arrayList = arrayList5;
                } else {
                    arrayList = new ArrayList(r3d.q(arrayList5, 10));
                    for (xf6 xf6Var : arrayList5) {
                        ArrayList arrayList6 = new ArrayList();
                        for (Object obj5 : list5) {
                            if (((lh6) obj5).f20039a == xf6Var.f40777a.f21776a) {
                                arrayList6.add(obj5);
                            }
                        }
                        ArrayList arrayList7 = new ArrayList();
                        Iterator it2 = arrayList6.iterator();
                        while (it2.hasNext()) {
                            w3d.u(arrayList7, ((lh6) it2.next()).e);
                        }
                        List list6 = xf6Var.b;
                        ArrayList arrayList8 = new ArrayList(r3d.q(list6, 10));
                        Iterator it3 = list6.iterator();
                        while (it3.hasNext()) {
                            ei6 ei6Var = (ei6) it3.next();
                            if (arrayList7.isEmpty()) {
                                it = it3;
                                arrayList2 = arrayList7;
                                z = false;
                            } else {
                                Iterator it4 = arrayList7.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        fi6 fi6Var = (fi6) it4.next();
                                        it = it3;
                                        arrayList2 = arrayList7;
                                        if (fi6Var.f9574a == ei6Var.f7843a && fi6Var.c == ei6Var.c.f30476a && fi6Var.b == ei6Var.d) {
                                            z = true;
                                        } else {
                                            arrayList7 = arrayList2;
                                            it3 = it;
                                        }
                                    } else {
                                        it = it3;
                                        arrayList2 = arrayList7;
                                        z = false;
                                    }
                                }
                            }
                            if (ei6Var.b && z) {
                                ei6Var = new ei6(ei6Var.f7843a, false, ei6Var.c, ei6Var.d, ei6Var.e, ei6Var.f, ei6Var.g, ei6Var.h, ei6Var.i, ei6Var.j, ei6Var.k);
                            }
                            arrayList8.add(ei6Var);
                            arrayList7 = arrayList2;
                            it3 = it;
                            list5 = list5;
                        }
                        arrayList.add(new xf6(xf6Var.f40777a, arrayList8));
                        list5 = list5;
                    }
                }
                xi6 xi6Var = bl6Var.f;
                xi6Var.getClass();
                p7m0 p7m0Var = xi6Var.f40929a;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, new dh6(arrayList)));
                long j3 = yf6Var.f42525a;
                ArrayList arrayList9 = new ArrayList(r3d.q(arrayList, 10));
                for (xf6 xf6Var2 : arrayList) {
                    String str5 = xf6Var2.f40777a.e;
                    String str6 = str5.length() == 0 ? null : str5;
                    mh6 mh6Var2 = xf6Var2.f40777a;
                    long j4 = mh6Var2.f21776a;
                    int i = mh6Var2.c;
                    arrayList9.add(j4 == j3 ? new tvm0(str6, j4, j4, i) : new vvm0(str6, j4, j3, i));
                }
                HashSet hashSet = new HashSet();
                ArrayList arrayList10 = new ArrayList();
                for (Object obj6 : arrayList9) {
                    if (hashSet.add(Long.valueOf(((xvm0) obj6).getId()))) {
                        arrayList10.add(obj6);
                    }
                }
                if (!jym0Var.a().isEmpty()) {
                    try {
                        e0g0 e0g0Var5 = j0g0.b;
                        g0g0Var2 = yvfVar.a();
                    } catch (Throwable th4) {
                        e0g0 e0g0Var6 = j0g0.b;
                        g0g0Var2 = new g0g0(th4);
                    }
                    xvm0 xvm0Var = (xvm0) (g0g0Var2 instanceof g0g0 ? null : g0g0Var2);
                    if (xvm0Var == null || arrayList10.isEmpty()) {
                        arrayList3 = new ArrayList();
                        for (Object obj7 : arrayList10) {
                            if (obj7 instanceof tvm0) {
                                arrayList3.add(obj7);
                            }
                        }
                        tvm0Var = (tvm0) CollectionsKt.firstOrNull(arrayList3);
                        if (tvm0Var != null) {
                            yvfVar.b(tvm0Var);
                        }
                    } else {
                        Iterator it5 = arrayList10.iterator();
                        while (it5.hasNext()) {
                            if (((xvm0) it5.next()).getId() == xvm0Var.getId()) {
                            }
                        }
                        arrayList3 = new ArrayList();
                        while (r2.hasNext()) {
                            if (obj7 instanceof tvm0) {
                                arrayList3.add(obj7);
                            }
                        }
                        tvm0Var = (tvm0) CollectionsKt.firstOrNull(arrayList3);
                        if (tvm0Var != null) {
                            yvfVar.b(tvm0Var);
                        }
                    }
                    break;
                } else {
                    xvm0 xvm0Var2 = (xvm0) CollectionsKt.firstOrNull(arrayList10);
                    if (xvm0Var2 != null) {
                        yvfVar.b(xvm0Var2);
                    }
                }
                jym0Var.b(arrayList10);
                return arrayList;
            case 4:
                wne wneVar5 = wne.f39444a;
                boolean z8 = this.j;
                if (!z8) {
                    z1x.P(obj);
                    bq9 bq9VarB4 = hkb.B((i89) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var4 = new ml5((df2) obj3, b3);
                    this.j = true;
                    if (bq9VarB4.c(ml5Var4, this) == wneVar5) {
                        return wneVar5;
                    }
                } else {
                    if (!z8) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    bq9 bq9VarB5 = hkb.B((gmq) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var5 = new ml5((do6) obj3, (byte) 11);
                    this.j = true;
                    if (bq9VarB5.c(ml5Var5, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    bq9 bq9VarB6 = hkb.B((gmq) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var6 = new ml5((do6) obj3, (byte) 12);
                    this.j = true;
                    if (bq9VarB6.c(ml5Var6, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z11 = this.j;
                if (!z11) {
                    z1x.P(obj);
                    bq9 bq9VarB7 = hkb.B((gmq) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var7 = new ml5((do6) obj3, (byte) 13);
                    this.j = true;
                    if (bq9VarB7.c(ml5Var7, this) == wneVar8) {
                        return wneVar8;
                    }
                } else {
                    if (!z11) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z12 = this.j;
                if (!z12) {
                    z1x.P(obj);
                    bq9 bq9VarB8 = hkb.B((gmq) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var8 = new ml5((do6) obj3, (byte) 14);
                    this.j = true;
                    if (bq9VarB8.c(ml5Var8, this) == wneVar9) {
                        return wneVar9;
                    }
                } else {
                    if (!z12) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    bq9 bq9VarB9 = hkb.B((xae0) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var9 = new ml5((yp6) obj3, (byte) 15);
                    this.j = true;
                    if (bq9VarB9.c(ml5Var9, this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    bq9 bq9VarB10 = hkb.B((i89) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var10 = new ml5((df2) obj3, (byte) 16);
                    this.j = true;
                    if (bq9VarB10.c(ml5Var10, this) == wneVar11) {
                        return wneVar11;
                    }
                } else {
                    if (!z14) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    bq9 bq9VarB11 = hkb.B((gmq) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var11 = new ml5((dr6) obj3, (byte) 17);
                    this.j = true;
                    if (bq9VarB11.c(ml5Var11, this) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    bq9 bq9VarB12 = hkb.B((gmq) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var12 = new ml5((dr6) obj3, (byte) 18);
                    this.j = true;
                    if (bq9VarB12.c(ml5Var12, this) == wneVar13) {
                        return wneVar13;
                    }
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    bq9 bq9VarB13 = hkb.B((gmq) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var13 = new ml5((dr6) obj3, (byte) 19);
                    this.j = true;
                    if (bq9VarB13.c(ml5Var13, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    bq9 bq9VarB14 = hkb.B((i89) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var14 = new ml5((df2) obj3, (byte) 20);
                    this.j = true;
                    if (bq9VarB14.c(ml5Var14, this) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    bq9 bq9VarB15 = hkb.B((xae0) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var15 = new ml5((qv3) obj3, (byte) 21);
                    this.j = true;
                    if (bq9VarB15.c(ml5Var15, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    bq9 bq9VarB16 = hkb.B((xae0) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var16 = new ml5((it6) obj3, (byte) 22);
                    this.j = true;
                    if (bq9VarB16.c(ml5Var16, this) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                boolean z21 = this.j;
                if (!z21) {
                    z1x.P(obj);
                    bq9 bq9VarB17 = hkb.B((gmq) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var17 = new ml5((it6) obj3, (byte) 23);
                    this.j = true;
                    if (bq9VarB17.c(ml5Var17, this) == wneVar18) {
                        return wneVar18;
                    }
                } else {
                    if (!z21) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    bq9 bq9VarB18 = hkb.B((vae0) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var18 = new ml5((wa) obj3, (byte) 24);
                    this.j = true;
                    if (bq9VarB18.c(ml5Var18, this) == wneVar19) {
                        return wneVar19;
                    }
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    bq9 bq9VarB19 = hkb.B((xae0) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var19 = new ml5((ot6) obj3, (byte) 25);
                    this.j = true;
                    if (bq9VarB19.c(ml5Var19, this) == wneVar20) {
                        return wneVar20;
                    }
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    bq9 bq9VarB20 = hkb.B((xae0) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var20 = new ml5((ot6) obj3, (byte) 26);
                    this.j = true;
                    if (bq9VarB20.c(ml5Var20, this) == wneVar21) {
                        return wneVar21;
                    }
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    bq9 bq9VarB21 = hkb.B((gmq) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var21 = new ml5((ot6) obj3, (byte) 27);
                    this.j = true;
                    if (bq9VarB21.c(ml5Var21, this) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    bq9 bq9VarB22 = hkb.B((xae0) this.k, ((clz) obj4).x(), lkz.d);
                    ml5 ml5Var22 = new ml5((pt6) obj3, (byte) 28);
                    this.j = true;
                    if (bq9VarB22.c(ml5Var22, this) == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    bq9 bq9VarB23 = hkb.B((xae0) this.k, ((clz) obj4).x(), lkz.e);
                    ml5 ml5Var23 = new ml5((ot6) obj3, (byte) 29);
                    this.j = true;
                    if (bq9VarB23.c(ml5Var23, this) == wneVar24) {
                        return wneVar24;
                    }
                } else {
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                boolean z28 = this.j;
                if (!z28) {
                    z1x.P(obj);
                    bq9 bq9VarB24 = hkb.B((ewt) this.k, ((clz) obj4).x(), lkz.d);
                    qt6 qt6Var = new qt6((ot6) obj3, b2);
                    this.j = true;
                    if (bq9VarB24.c(qt6Var, this) == wneVar25) {
                        return wneVar25;
                    }
                } else {
                    if (!z28) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                boolean z29 = this.j;
                if (!z29) {
                    z1x.P(obj);
                    bq9 bq9VarB25 = hkb.B((xae0) this.k, ((clz) obj4).x(), lkz.d);
                    qt6 qt6Var2 = new qt6((ot6) obj3, b4);
                    this.j = true;
                    if (bq9VarB25.c(qt6Var2, this) == wneVar26) {
                        return wneVar26;
                    }
                } else {
                    if (!z29) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                boolean z30 = this.j;
                if (!z30) {
                    z1x.P(obj);
                    bq9 bq9VarB26 = hkb.B((gmq) this.k, ((clz) obj4).x(), lkz.d);
                    qt6 qt6Var3 = new qt6((ot6) obj3, (byte) 2);
                    this.j = true;
                    if (bq9VarB26.c(qt6Var3, this) == wneVar27) {
                        return wneVar27;
                    }
                } else {
                    if (!z30) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                boolean z31 = this.j;
                if (!z31) {
                    z1x.P(obj);
                    bq9 bq9VarB27 = hkb.B((gmq) this.k, ((clz) obj4).x(), lkz.d);
                    qt6 qt6Var4 = new qt6((yp6) obj3, (byte) 3);
                    this.j = true;
                    if (bq9VarB27.c(qt6Var4, this) == wneVar28) {
                        return wneVar28;
                    }
                } else {
                    if (!z31) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                boolean z32 = this.j;
                if (!z32) {
                    z1x.P(obj);
                    bq9 bq9VarB28 = hkb.B((i89) this.k, ((clz) obj4).x(), lkz.d);
                    qt6 qt6Var5 = new qt6((o47) obj3, (byte) 4);
                    this.j = true;
                    if (bq9VarB28.c(qt6Var5, this) == wneVar29) {
                        return wneVar29;
                    }
                } else {
                    if (!z32) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            default:
                mii0 mii0Var = (mii0) obj4;
                v1z v1zVar = (v1z) this.k;
                wne wneVar30 = wne.f39444a;
                boolean z33 = this.j;
                if (!z33) {
                    z1x.P(obj);
                    yzn0 yzn0Var = (yzn0) mii0Var.b;
                    String strA = ((btt0) mii0Var.c).a();
                    eb7 eb7Var = (eb7) obj3;
                    String strC2 = ((knf0) mii0Var.d).c();
                    Long l7 = v1zVar.f36657a;
                    List list7 = eb7Var.h;
                    int i2 = eb7Var.b;
                    long j5 = eb7Var.c;
                    ArrayList arrayList11 = eb7Var.f;
                    r47 hb7Var = list7 == null ? new hb7(strC2, i2, j5, 15, arrayList11, l7, true, false, eb7Var.g, eb7Var.f7505a) : new kb7(strC2, i2, j5, 15, arrayList11, l7, eb7Var.g, eb7Var.f7505a, list7);
                    this.k = null;
                    this.j = true;
                    objG = yzn0Var.g(strA, hb7Var, this);
                    obj2 = wneVar30;
                    if (objG != wneVar30) {
                    }
                    return obj2;
                }
                if (!z33) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                objG = obj;
                c57 c57Var = (c57) objG;
                List listA = c57Var.a();
                hv7 hv7Var = c57Var.f3757a;
                ArrayList arrayList12 = new ArrayList(r3d.q(listA, 10));
                Iterator it6 = listA.iterator();
                while (it6.hasNext()) {
                    arrayList12.add(tdc.f0((n97) it6.next()));
                }
                obj2 = arrayList12;
                if (unh0.n0(hv7Var).f20704a != -1) {
                    t47 t47Var = (t47) mii0Var.e;
                    t47Var.f33305a = null;
                    t47Var.f33305a = new mv7(unh0.n0(hv7Var));
                    obj2 = arrayList12;
                }
                return obj2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(i89 i89Var, clz clzVar, df2 df2Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 4;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = df2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(i89 i89Var, clz clzVar, df2 df2Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 14;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = df2Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(i89 i89Var, clz clzVar, o47 o47Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 28;
        lkz lkzVar = lkz.f20223a;
        this.k = i89Var;
        this.l = clzVar;
        this.m = o47Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(gmq gmqVar, clz clzVar, ud6 ud6Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 0;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ud6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(gmq gmqVar, clz clzVar, ud6 ud6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 2;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ud6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(gmq gmqVar, clz clzVar, vd6 vd6Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 1;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = vd6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(gmq gmqVar, clz clzVar, do6 do6Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 5;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = do6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(gmq gmqVar, clz clzVar, do6 do6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 6;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = do6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(gmq gmqVar, clz clzVar, do6 do6Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 7;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = do6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(gmq gmqVar, clz clzVar, do6 do6Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 8;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = do6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(gmq gmqVar, clz clzVar, yp6 yp6Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 27;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = yp6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(gmq gmqVar, clz clzVar, dr6 dr6Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 11;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = dr6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(gmq gmqVar, clz clzVar, dr6 dr6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 12;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = dr6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(gmq gmqVar, clz clzVar, dr6 dr6Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 13;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = dr6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(gmq gmqVar, clz clzVar, it6 it6Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 17;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = it6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(gmq gmqVar, clz clzVar, ot6 ot6Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 21;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ot6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(gmq gmqVar, clz clzVar, ot6 ot6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 26;
        lkz lkzVar = lkz.f20223a;
        this.k = gmqVar;
        this.l = clzVar;
        this.m = ot6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(ewt ewtVar, clz clzVar, ot6 ot6Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 24;
        lkz lkzVar = lkz.f20223a;
        this.k = ewtVar;
        this.l = clzVar;
        this.m = ot6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(vae0 vae0Var, clz clzVar, wa waVar, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 18;
        lkz lkzVar = lkz.f20223a;
        this.k = vae0Var;
        this.l = clzVar;
        this.m = waVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(xae0 xae0Var, clz clzVar, qv3 qv3Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 15;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = qv3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(xae0 xae0Var, clz clzVar, yp6 yp6Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 9;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = yp6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(xae0 xae0Var, clz clzVar, it6 it6Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 16;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = it6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(xae0 xae0Var, clz clzVar, ot6 ot6Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 19;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = ot6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(xae0 xae0Var, clz clzVar, ot6 ot6Var, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = (byte) 20;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = ot6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(xae0 xae0Var, clz clzVar, ot6 ot6Var, yje yjeVar, char c) {
        super(2, yjeVar);
        this.i = (byte) 23;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = ot6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(xae0 xae0Var, clz clzVar, ot6 ot6Var, yje yjeVar, int i) {
        super(2, yjeVar);
        this.i = (byte) 25;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = ot6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td6(xae0 xae0Var, clz clzVar, pt6 pt6Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 22;
        lkz lkzVar = lkz.f20223a;
        this.k = xae0Var;
        this.l = clzVar;
        this.m = pt6Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ td6(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.l = obj;
        this.m = obj2;
    }
}
