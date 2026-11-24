package a;

import android.text.format.DateFormat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.xplatform.limits_africa.api.domain.LimitGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class s200 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a200 f31479a;
    public final knf0 b;
    public final btt0 c;
    public final us00 d;

    public s200(a200 a200Var, knf0 knf0Var, btt0 btt0Var, us00 us00Var) {
        a200Var.getClass();
        knf0Var.getClass();
        btt0Var.getClass();
        this.f31479a = a200Var;
        this.b = knf0Var;
        this.c = btt0Var;
        this.d = us00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r25v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r33v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.util.ArrayList] */
    public final Object a(zje zjeVar) {
        j200 j200Var;
        Object obj;
        ?? arrayList;
        ?? arrayList2;
        if (zjeVar instanceof j200) {
            j200Var = (j200) zjeVar;
            int i = j200Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                j200Var.k = i - Integer.MIN_VALUE;
            } else {
                j200Var = new j200(this, zjeVar);
            }
        } else {
            j200Var = new j200(this, zjeVar);
        }
        Object objA = j200Var.i;
        wne wneVar = wne.f39444a;
        int i2 = j200Var.k;
        String strG = null;
        if (i2 == 0) {
            z1x.P(objA);
            String strA = this.c.a();
            String strC = this.b.c();
            j200Var.k = 1;
            objA = this.f31479a.f100a.a(strA, strC, j200Var);
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
        l300 l300Var = (l300) ((dx5) objA).a();
        Iterable iterable = l300Var.f19338a;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList3) {
                    LimitGroupEnum limitGroupEnum = ((tn40) obj2).f34218a;
                    Object arrayList4 = linkedHashMap.get(limitGroupEnum);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        linkedHashMap.put(limitGroupEnum, arrayList4);
                    }
                    ((List) arrayList4).add(obj2);
                }
                Iterable<gjq0> iterable2 = l300Var.b;
                if (iterable2 == null) {
                    iterable2 = iun.f15405a;
                }
                ArrayList arrayList5 = new ArrayList(r3d.q(iterable2, 10));
                for (gjq0 gjq0Var : iterable2) {
                    gjq0Var.getClass();
                    bst bstVar = bsz.f3156a;
                    Integer num = gjq0Var.f11413a;
                    Long l = gjq0Var.b;
                    if (num == null) {
                        String str = strG;
                        jf4.k(str);
                        return str;
                    }
                    int iIntValue = num.intValue();
                    bstVar.getClass();
                    trz trzVarC = bst.c(iIntValue);
                    LimitGroupEnum limitGroupEnumB = n6x.B(trzVarC);
                    long jLongValue = l != null ? l.longValue() : 0L;
                    if (l != null) {
                        long jLongValue2 = l.longValue();
                        if (jLongValue2 == -1) {
                            strG = "";
                        } else {
                            rdj rdjVar = rdj.f30294a;
                            strG = rdj.g(new znq0(jLongValue2), efj.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(this.d)), false, 56);
                        }
                    }
                    String str2 = strG == null ? "" : strG;
                    Integer num2 = gjq0Var.c;
                    long jIntValue = num2 != null ? num2.intValue() : 0L;
                    Boolean bool = gjq0Var.d;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    Boolean bool2 = gjq0Var.e;
                    if (bool2 == null) {
                        jf4.k(strG);
                        return strG;
                    }
                    boolean zBooleanValue2 = bool2.booleanValue();
                    Boolean bool3 = gjq0Var.f;
                    if (bool3 == null) {
                        jf4.k(strG);
                        return strG;
                    }
                    boolean zBooleanValue3 = bool3.booleanValue();
                    gst gstVar = qrz.f29232a;
                    String str3 = gjq0Var.g;
                    if (str3 == null) {
                        jf4.k(strG);
                        return strG;
                    }
                    gstVar.getClass();
                    qrz qrzVarH = gst.h(str3);
                    List<p95> list = gjq0Var.h;
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (p95 p95Var : list) {
                            Object objI = p95Var != null ? q7x.I(p95Var) : strG;
                            if (objI != null) {
                                arrayList.add(objI);
                            }
                        }
                    } else {
                        arrayList = strG;
                    }
                    if (arrayList == 0) {
                        arrayList = iun.f15405a;
                    }
                    ?? r25 = arrayList;
                    Boolean bool4 = gjq0Var.i;
                    if (bool4 == null) {
                        jf4.k(strG);
                        return strG;
                    }
                    arrayList5.add(new oiq0(limitGroupEnumB, trzVarC, jLongValue, str2, jIntValue, zBooleanValue, zBooleanValue2, zBooleanValue3, qrzVarH, r25, bool4.booleanValue()));
                    strG = strG;
                }
                String str4 = strG;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj3 : arrayList5) {
                    LimitGroupEnum limitGroupEnum2 = ((oiq0) obj3).f25324a;
                    Object arrayList6 = linkedHashMap2.get(limitGroupEnum2);
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                        linkedHashMap2.put(limitGroupEnum2, arrayList6);
                    }
                    ((List) arrayList6).add(obj3);
                }
                gzz gzzVar = new gzz(linkedHashMap, linkedHashMap2);
                Iterable iterable3 = (List) linkedHashMap2.get(LimitGroupEnum.c);
                if (iterable3 == null) {
                    iterable3 = iun.f15405a;
                }
                for (Object obj4 : iterable3) {
                    if (((oiq0) obj4).b == miq0.f21857a) {
                        obj = obj4;
                        gtz.f11904a.f13549a = (oiq0) obj;
                        return gzzVar;
                    }
                }
                obj = str4;
                gtz.f11904a.f13549a = (oiq0) obj;
                return gzzVar;
            }
            ho40 ho40Var = (ho40) it.next();
            ho40Var.getClass();
            bst bstVar2 = bsz.f3156a;
            Integer num3 = ho40Var.f13377a;
            if (num3 == null) {
                jf4.k(null);
                return null;
            }
            int iIntValue2 = num3.intValue();
            bstVar2.getClass();
            trz trzVarC2 = bst.c(iIntValue2);
            LimitGroupEnum limitGroupEnumB2 = n6x.B(trzVarC2);
            String str5 = ho40Var.b;
            if (str5 == null) {
                jf4.k(null);
                return null;
            }
            Double d = ho40Var.c;
            String strValueOf = d != null ? String.valueOf(d.doubleValue()) : null;
            String str6 = strValueOf == null ? "" : strValueOf;
            Boolean bool5 = ho40Var.d;
            if (bool5 == null) {
                jf4.k(null);
                return null;
            }
            boolean zBooleanValue4 = bool5.booleanValue();
            Boolean bool6 = ho40Var.e;
            if (bool6 == null) {
                jf4.k(null);
                return null;
            }
            boolean zBooleanValue5 = bool6.booleanValue();
            Boolean bool7 = ho40Var.f;
            if (bool7 == null) {
                jf4.k(null);
                return null;
            }
            boolean zBooleanValue6 = bool7.booleanValue();
            gst gstVar2 = qrz.f29232a;
            String str7 = ho40Var.g;
            if (str7 == null) {
                jf4.k(null);
                return null;
            }
            gstVar2.getClass();
            qrz qrzVarH2 = gst.h(str7);
            Long l2 = ho40Var.h;
            long jLongValue3 = l2 != null ? l2.longValue() : 0L;
            Long l3 = ho40Var.i;
            long jLongValue4 = l3 != null ? l3.longValue() : 0L;
            Long l4 = ho40Var.j;
            long jLongValue5 = l4 != null ? l4.longValue() : 0L;
            Integer num4 = ho40Var.k;
            String strValueOf2 = num4 != null ? String.valueOf(num4.intValue()) : null;
            String str8 = strValueOf2 == null ? "" : strValueOf2;
            Boolean bool8 = ho40Var.l;
            boolean zBooleanValue7 = bool8 != null ? bool8.booleanValue() : false;
            Integer num5 = ho40Var.m;
            String strValueOf3 = num5 != null ? String.valueOf(num5.intValue()) : null;
            String str9 = strValueOf3 == null ? "" : strValueOf3;
            Long l5 = ho40Var.n;
            long jLongValue6 = l5 != null ? l5.longValue() : 0L;
            List<p95> list2 = ho40Var.o;
            if (list2 != null) {
                arrayList2 = new ArrayList();
                for (p95 p95Var2 : list2) {
                    w85 w85VarI = p95Var2 != null ? q7x.I(p95Var2) : null;
                    if (w85VarI != null) {
                        arrayList2.add(w85VarI);
                    }
                }
            } else {
                arrayList2 = 0;
            }
            if (arrayList2 == 0) {
                arrayList2 = iun.f15405a;
            }
            ?? r33 = arrayList2;
            Boolean bool9 = ho40Var.p;
            if (bool9 == null) {
                jf4.k(null);
                return null;
            }
            arrayList3.add(new tn40(limitGroupEnumB2, trzVarC2, str5, str6, zBooleanValue4, zBooleanValue5, zBooleanValue6, qrzVarH2, jLongValue3, jLongValue4, jLongValue5, str8, zBooleanValue7, str9, jLongValue6, r33, bool9.booleanValue()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(zje zjeVar) {
        k200 k200Var;
        if (zjeVar instanceof k200) {
            k200Var = (k200) zjeVar;
            int i = k200Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                k200Var.k = i - Integer.MIN_VALUE;
            } else {
                k200Var = new k200(this, zjeVar);
            }
        } else {
            k200Var = new k200(this, zjeVar);
        }
        Object objC = k200Var.i;
        wne wneVar = wne.f39444a;
        int i2 = k200Var.k;
        if (i2 == 0) {
            z1x.P(objC);
            String strA = this.c.a();
            String strC = this.b.c();
            k200Var.k = 1;
            objC = this.f31479a.f100a.c(strA, strC, k200Var);
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
        List<g7i0> list = (List) ((dx5) objC).a();
        ArrayList arrayList = new ArrayList();
        for (g7i0 g7i0Var : list) {
            Integer num = g7i0Var.f10815a;
            String str = g7i0Var.b;
            d7i0 d7i0Var = (num == null || str == null) ? null : new d7i0(num.intValue(), str);
            if (d7i0Var != null) {
                arrayList.add(d7i0Var);
            }
        }
        return arrayList;
    }
}
