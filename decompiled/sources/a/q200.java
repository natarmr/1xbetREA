package a;

import android.text.format.DateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.xplatform.limits_kenya.api.domain.LimitKenyaGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class q200 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c200 f27978a;
    public final btt0 b;
    public final knf0 c;
    public final us00 d;

    public q200(c200 c200Var, btt0 btt0Var, knf0 knf0Var, us00 us00Var) {
        c200Var.getClass();
        btt0Var.getClass();
        knf0Var.getClass();
        this.f27978a = c200Var;
        this.b = btt0Var;
        this.c = knf0Var;
        this.d = us00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r26v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r34v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.util.ArrayList] */
    public final Object a(boolean z, zje zjeVar) {
        g200 g200Var;
        Object obj;
        ?? arrayList;
        ?? arrayList2;
        if (zjeVar instanceof g200) {
            g200Var = (g200) zjeVar;
            int i = g200Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                g200Var.k = i - Integer.MIN_VALUE;
            } else {
                g200Var = new g200(this, zjeVar);
            }
        } else {
            g200Var = new g200(this, zjeVar);
        }
        Object objA = g200Var.i;
        wne wneVar = wne.f39444a;
        int i2 = g200Var.k;
        String strG = null;
        u8u u8uVar = jyz.f17382a;
        if (i2 == 0) {
            z1x.P(objA);
            izz izzVar = (izz) u8uVar.c;
            if (!z && izzVar != null) {
                return izzVar;
            }
            String strA = this.b.a();
            String strC = this.c.c();
            g200Var.k = 1;
            objA = this.f27978a.f3601a.a(strA, strC, g200Var);
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
        n300 n300Var = (n300) ((dx5) objA).a();
        Iterable iterable = n300Var.f22825a;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        ArrayList arrayList3 = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : arrayList3) {
                    LimitKenyaGroupEnum limitKenyaGroupEnum = ((rn40) obj2).f30770a;
                    Object arrayList4 = linkedHashMap.get(limitKenyaGroupEnum);
                    if (arrayList4 == null) {
                        arrayList4 = new ArrayList();
                        linkedHashMap.put(limitKenyaGroupEnum, arrayList4);
                    }
                    ((List) arrayList4).add(obj2);
                }
                Iterable<ijq0> iterable2 = n300Var.b;
                if (iterable2 == null) {
                    iterable2 = iun.f15405a;
                }
                ArrayList arrayList5 = new ArrayList(r3d.q(iterable2, 10));
                for (ijq0 ijq0Var : iterable2) {
                    ijq0Var.getClass();
                    sqt sqtVar = zrz.f44882a;
                    Integer num = ijq0Var.f14888a;
                    Long l = ijq0Var.b;
                    if (num == null) {
                        String str = strG;
                        jf4.k(str);
                        return str;
                    }
                    int iIntValue = num.intValue();
                    sqtVar.getClass();
                    vrz vrzVarC = sqt.c(iIntValue);
                    LimitKenyaGroupEnum limitKenyaGroupEnumO = b5x.O(vrzVarC);
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
                    Integer num2 = ijq0Var.c;
                    long jIntValue = num2 != null ? num2.intValue() : 0L;
                    Boolean bool = ijq0Var.d;
                    boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                    Boolean bool2 = ijq0Var.e;
                    if (bool2 == null) {
                        jf4.k(strG);
                        return strG;
                    }
                    boolean zBooleanValue2 = bool2.booleanValue();
                    Boolean bool3 = ijq0Var.f;
                    if (bool3 == null) {
                        jf4.k(strG);
                        return strG;
                    }
                    boolean zBooleanValue3 = bool3.booleanValue();
                    tqt tqtVar = nrz.f24028a;
                    String str3 = ijq0Var.g;
                    if (str3 == null) {
                        jf4.k(strG);
                        return strG;
                    }
                    tqtVar.getClass();
                    nrz nrzVarC = tqt.c(str3);
                    List<r95> list = ijq0Var.h;
                    if (list != null) {
                        arrayList = new ArrayList();
                        for (r95 r95Var : list) {
                            Object objJ = r95Var != null ? u7x.J(r95Var) : strG;
                            if (objJ != null) {
                                arrayList.add(objJ);
                            }
                        }
                    } else {
                        arrayList = strG;
                    }
                    if (arrayList == 0) {
                        arrayList = iun.f15405a;
                    }
                    ?? r26 = arrayList;
                    Boolean bool4 = ijq0Var.i;
                    if (bool4 == null) {
                        jf4.k(strG);
                        return strG;
                    }
                    arrayList5.add(new qiq0(limitKenyaGroupEnumO, vrzVarC, jLongValue, str2, jIntValue, zBooleanValue, zBooleanValue2, zBooleanValue3, nrzVarC, r26, bool4.booleanValue()));
                    strG = strG;
                }
                String str4 = strG;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Object obj3 : arrayList5) {
                    LimitKenyaGroupEnum limitKenyaGroupEnum2 = ((qiq0) obj3).f28804a;
                    Object arrayList6 = linkedHashMap2.get(limitKenyaGroupEnum2);
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                        linkedHashMap2.put(limitKenyaGroupEnum2, arrayList6);
                    }
                    ((List) arrayList6).add(obj3);
                }
                izz izzVar2 = new izz(linkedHashMap, linkedHashMap2);
                u8uVar.c = izzVar2;
                Iterable iterable3 = (List) linkedHashMap2.get(LimitKenyaGroupEnum.c);
                if (iterable3 == null) {
                    iterable3 = iun.f15405a;
                }
                for (Object obj4 : iterable3) {
                    if (((qiq0) obj4).b == liq0.f20118a) {
                        obj = obj4;
                        u8uVar.b = (qiq0) obj;
                        return izzVar2;
                    }
                }
                obj = str4;
                u8uVar.b = (qiq0) obj;
                return izzVar2;
            }
            jo40 jo40Var = (jo40) it.next();
            jo40Var.getClass();
            sqt sqtVar2 = zrz.f44882a;
            Integer num3 = jo40Var.f16841a;
            if (num3 == null) {
                jf4.k(null);
                return null;
            }
            int iIntValue2 = num3.intValue();
            sqtVar2.getClass();
            vrz vrzVarC2 = sqt.c(iIntValue2);
            LimitKenyaGroupEnum limitKenyaGroupEnumO2 = b5x.O(vrzVarC2);
            String str5 = jo40Var.b;
            if (str5 == null) {
                jf4.k(null);
                return null;
            }
            Double d = jo40Var.c;
            String strValueOf = d != null ? String.valueOf(d.doubleValue()) : null;
            String str6 = strValueOf == null ? "" : strValueOf;
            Boolean bool5 = jo40Var.d;
            if (bool5 == null) {
                jf4.k(null);
                return null;
            }
            boolean zBooleanValue4 = bool5.booleanValue();
            Boolean bool6 = jo40Var.e;
            if (bool6 == null) {
                jf4.k(null);
                return null;
            }
            boolean zBooleanValue5 = bool6.booleanValue();
            Boolean bool7 = jo40Var.f;
            if (bool7 == null) {
                jf4.k(null);
                return null;
            }
            boolean zBooleanValue6 = bool7.booleanValue();
            tqt tqtVar2 = nrz.f24028a;
            String str7 = jo40Var.g;
            if (str7 == null) {
                jf4.k(null);
                return null;
            }
            tqtVar2.getClass();
            nrz nrzVarC2 = tqt.c(str7);
            Long l2 = jo40Var.h;
            long jLongValue3 = l2 != null ? l2.longValue() : 0L;
            Long l3 = jo40Var.i;
            long jLongValue4 = l3 != null ? l3.longValue() : 0L;
            Long l4 = jo40Var.j;
            long jLongValue5 = l4 != null ? l4.longValue() : 0L;
            Integer num4 = jo40Var.k;
            String strValueOf2 = num4 != null ? String.valueOf(num4.intValue()) : null;
            String str8 = strValueOf2 == null ? "" : strValueOf2;
            Boolean bool8 = jo40Var.l;
            boolean zBooleanValue7 = bool8 != null ? bool8.booleanValue() : false;
            Integer num5 = jo40Var.m;
            String strValueOf3 = num5 != null ? String.valueOf(num5.intValue()) : null;
            String str9 = strValueOf3 == null ? "" : strValueOf3;
            Long l5 = jo40Var.n;
            long jLongValue6 = l5 != null ? l5.longValue() : 0L;
            List<r95> list2 = jo40Var.o;
            if (list2 != null) {
                arrayList2 = new ArrayList();
                for (r95 r95Var2 : list2) {
                    y85 y85VarJ = r95Var2 != null ? u7x.J(r95Var2) : null;
                    if (y85VarJ != null) {
                        arrayList2.add(y85VarJ);
                    }
                }
            } else {
                arrayList2 = 0;
            }
            if (arrayList2 == 0) {
                arrayList2 = iun.f15405a;
            }
            ?? r34 = arrayList2;
            Boolean bool9 = jo40Var.p;
            if (bool9 == null) {
                jf4.k(null);
                return null;
            }
            arrayList3.add(new rn40(limitKenyaGroupEnumO2, vrzVarC2, str5, str6, zBooleanValue4, zBooleanValue5, zBooleanValue6, nrzVarC2, jLongValue3, jLongValue4, jLongValue5, str8, zBooleanValue7, str9, jLongValue6, r34, bool9.booleanValue()));
        }
    }
}
