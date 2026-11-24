package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.xplatform.limits_ee.api.domain.LimitGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class p200 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b200 f26229a;
    public final btt0 b;
    public final knf0 c;
    public final ctf0 d;

    public p200(b200 b200Var, btt0 btt0Var, knf0 knf0Var, ctf0 ctf0Var) {
        b200Var.getClass();
        btt0Var.getClass();
        knf0Var.getClass();
        ctf0Var.getClass();
        this.f26229a = b200Var;
        this.b = btt0Var;
        this.c = knf0Var;
        this.d = ctf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x0231  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r31v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r38v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v10, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.util.ArrayList] */
    public final Object a(zje zjeVar) {
        f200 f200Var;
        Object obj;
        urz urzVar;
        String strG;
        ?? arrayList;
        urz urzVar2;
        ?? arrayList2;
        if (zjeVar instanceof f200) {
            f200Var = (f200) zjeVar;
            int i = f200Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                f200Var.k = i - Integer.MIN_VALUE;
            } else {
                f200Var = new f200(this, zjeVar);
            }
        } else {
            f200Var = new f200(this, zjeVar);
        }
        Object objA = f200Var.i;
        wne wneVar = wne.f39444a;
        int i2 = f200Var.k;
        String str = null;
        if (i2 == 0) {
            z1x.P(objA);
            String strA = this.b.a();
            String strC = this.c.c();
            f200Var.k = 1;
            objA = this.f26229a.f1833a.a(strA, strC, f200Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        m300 m300Var = (m300) ((dx5) objA).a();
        ctf0 ctf0Var = this.d;
        ctf0Var.getClass();
        Iterable iterable = m300Var.f21090a;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (true) {
            int i3 = 30;
            if (!it.hasNext()) {
                String str2 = str;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList3) {
                    LimitGroupEnum limitGroupEnum = ((qn40) obj2).f29014a;
                    Object obj3 = linkedHashMap.get(limitGroupEnum);
                    if (obj3 == null) {
                        ArrayList arrayList4 = new ArrayList();
                        linkedHashMap.put(limitGroupEnum, arrayList4);
                        obj3 = arrayList4;
                    }
                    ((List) obj3).add(obj2);
                }
                Iterable<hjq0> iterable2 = m300Var.b;
                if (iterable2 == null) {
                    iterable2 = iun.f15405a;
                }
                ArrayList arrayList5 = new ArrayList(r3d.q(iterable2, 10));
                for (hjq0 hjq0Var : iterable2) {
                    rqt rqtVar = yrz.f43144a;
                    Integer num = hjq0Var.f13172a;
                    Long l = hjq0Var.b;
                    if (num == null) {
                        jf4.k(str2);
                        return str2;
                    }
                    int iIntValue = num.intValue();
                    rqtVar.getClass();
                    yrz yrzVar = yrz.b;
                    if (iIntValue == -1) {
                        urzVar = yrzVar;
                    } else {
                        urz urzVar3 = l810.LOSE_LIMIT_7_DAY;
                        if (iIntValue != 11) {
                            urzVar3 = l810.LOSE_LIMIT_30_DAY;
                            if (iIntValue != 12) {
                                urzVar3 = kiq0.f18349a;
                                if (iIntValue != i3) {
                                    urzVar = yrzVar;
                                }
                            }
                        }
                        urzVar = urzVar3;
                    }
                    LimitGroupEnum limitGroupEnumZ = c3x.z(urzVar);
                    long jLongValue = l != null ? l.longValue() : 0L;
                    if (l != null) {
                        long jLongValue2 = l.longValue();
                        if (jLongValue2 == -1) {
                            strG = "";
                        } else {
                            rdj rdjVar = rdj.f30294a;
                            strG = rdj.g(new znq0(jLongValue2), efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), false, 56);
                        }
                    } else {
                        strG = str2;
                    }
                    String str3 = strG == null ? "" : strG;
                    Integer num2 = hjq0Var.c;
                    long jIntValue = num2 != null ? num2.intValue() : 0L;
                    Boolean bool = hjq0Var.d;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    Boolean bool2 = hjq0Var.e;
                    if (bool2 == null) {
                        jf4.k(str2);
                        return str2;
                    }
                    boolean zBooleanValue2 = bool2.booleanValue();
                    Boolean bool3 = hjq0Var.f;
                    if (bool3 == null) {
                        jf4.k(str2);
                        return str2;
                    }
                    boolean zBooleanValue3 = bool3.booleanValue();
                    sqt sqtVar = mrz.f22294a;
                    String str4 = hjq0Var.g;
                    if (str4 == null) {
                        jf4.k(str2);
                        return str2;
                    }
                    sqtVar.getClass();
                    mrz mrzVarB = sqt.b(str4);
                    List<q95> list = hjq0Var.h;
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (q95 q95Var : list) {
                            Object objH = q95Var != null ? r7x.H(q95Var, true) : str2;
                            if (objH != null) {
                                arrayList.add(objH);
                            }
                        }
                    } else {
                        arrayList = str2;
                    }
                    if (arrayList == 0) {
                        arrayList = iun.f15405a;
                    }
                    ?? r31 = arrayList;
                    Boolean bool4 = hjq0Var.i;
                    if (bool4 == null) {
                        jf4.k(str2);
                        return str2;
                    }
                    arrayList5.add(new piq0(limitGroupEnumZ, urzVar, jLongValue, str3, jIntValue, zBooleanValue, zBooleanValue2, zBooleanValue3, mrzVarB, r31, bool4.booleanValue()));
                    i3 = 30;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj4 : arrayList5) {
                    LimitGroupEnum limitGroupEnum2 = ((piq0) obj4).f27056a;
                    Object arrayList6 = linkedHashMap2.get(limitGroupEnum2);
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                        linkedHashMap2.put(limitGroupEnum2, arrayList6);
                    }
                    ((List) arrayList6).add(obj4);
                }
                hzz hzzVar = new hzz(linkedHashMap, linkedHashMap2);
                Iterable iterable3 = (List) linkedHashMap2.get(LimitGroupEnum.b);
                if (iterable3 == null) {
                    iterable3 = iun.f15405a;
                }
                for (Object obj5 : iterable3) {
                    if (((piq0) obj5).b == kiq0.f18349a) {
                        obj = obj5;
                        List list2 = (List) hzzVar.f13925a.get(LimitGroupEnum.f46747a);
                        edu eduVar = dvz.f6769a;
                        eduVar.b = list2;
                        eduVar.c = (piq0) obj;
                        return hzzVar;
                    }
                }
                obj = str2;
                List list3 = (List) hzzVar.f13925a.get(LimitGroupEnum.f46747a);
                edu eduVar2 = dvz.f6769a;
                eduVar2.b = list3;
                eduVar2.c = (piq0) obj;
                return hzzVar;
            }
            io40 io40Var = (io40) it.next();
            rqt rqtVar2 = yrz.f43144a;
            String str5 = str;
            Integer num3 = io40Var.f15102a;
            if (num3 == null) {
                jf4.k(str5);
                return str5;
            }
            int iIntValue2 = num3.intValue();
            rqtVar2.getClass();
            yrz yrzVar2 = yrz.b;
            if (iIntValue2 == -1) {
                urzVar2 = yrzVar2;
            } else {
                l810 l810Var = l810.LOSE_LIMIT_7_DAY;
                if (iIntValue2 == 11) {
                    urzVar2 = l810Var;
                } else {
                    l810 l810Var2 = l810.LOSE_LIMIT_30_DAY;
                    if (iIntValue2 == 12) {
                        urzVar2 = l810Var2;
                    } else {
                        urzVar2 = kiq0.f18349a;
                        if (iIntValue2 != 30) {
                            urzVar2 = yrzVar2;
                        }
                    }
                }
            }
            if (!(urzVar2 instanceof l810)) {
                jf4.k(str5);
                return str5;
            }
            LimitGroupEnum limitGroupEnumZ2 = c3x.z(urzVar2);
            l810 l810Var3 = (l810) urzVar2;
            String str6 = io40Var.b;
            if (str6 == null) {
                jf4.k(str5);
                return str5;
            }
            Double d = io40Var.c;
            String strValueOf = d != null ? String.valueOf(d.doubleValue()) : str5;
            String str7 = strValueOf == null ? "" : strValueOf;
            Boolean bool5 = io40Var.d;
            if (bool5 == null) {
                jf4.k(str5);
                return str5;
            }
            boolean zBooleanValue4 = bool5.booleanValue();
            Boolean bool6 = io40Var.e;
            if (bool6 == null) {
                jf4.k(str5);
                return str5;
            }
            boolean zBooleanValue5 = bool6.booleanValue();
            Boolean bool7 = io40Var.f;
            if (bool7 == null) {
                jf4.k(str5);
                return str5;
            }
            boolean zBooleanValue6 = bool7.booleanValue();
            sqt sqtVar2 = mrz.f22294a;
            String str8 = io40Var.g;
            if (str8 == null) {
                jf4.k(str5);
                return str5;
            }
            sqtVar2.getClass();
            mrz mrzVarB2 = sqt.b(str8);
            Long l2 = io40Var.h;
            long jLongValue3 = l2 != null ? l2.longValue() : 0L;
            Long l3 = io40Var.i;
            long jLongValue4 = l3 != null ? l3.longValue() : 0L;
            Long l4 = io40Var.j;
            long jLongValue5 = l4 != null ? l4.longValue() : 0L;
            Long l5 = io40Var.k;
            long jLongValue6 = l5 != null ? l5.longValue() : 0L;
            Boolean bool8 = io40Var.l;
            boolean zBooleanValue7 = bool8 != null ? bool8.booleanValue() : false;
            Long l6 = io40Var.m;
            long jLongValue7 = l6 != null ? l6.longValue() : 0L;
            Long l7 = io40Var.n;
            long jLongValue8 = l7 != null ? l7.longValue() : 0L;
            List<q95> list4 = io40Var.o;
            if (list4 != null) {
                arrayList2 = new ArrayList();
                for (q95 q95Var2 : list4) {
                    Object objH2 = q95Var2 != null ? r7x.H(q95Var2, false) : str5;
                    if (objH2 != null) {
                        arrayList2.add(objH2);
                    }
                }
            } else {
                arrayList2 = str5;
            }
            if (arrayList2 == 0) {
                arrayList2 = iun.f15405a;
            }
            ?? r38 = arrayList2;
            Boolean bool9 = io40Var.p;
            if (bool9 == null) {
                jf4.k(str5);
                return str5;
            }
            arrayList3.add(new qn40(limitGroupEnumZ2, l810Var3, str6, str7, zBooleanValue4, zBooleanValue5, zBooleanValue6, mrzVarB2, jLongValue3, jLongValue4, jLongValue5, jLongValue6, zBooleanValue7, jLongValue7, jLongValue8, r38, bool9.booleanValue()));
            str = str5;
        }
    }
}
