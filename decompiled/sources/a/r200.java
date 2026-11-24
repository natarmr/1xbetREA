package a;

import android.text.format.DateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xplatform.limits_ne.api.domain.LimitNeGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class r200 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d200 f29707a;
    public final ieu b;
    public final btt0 c;
    public final knf0 d;
    public final us00 e;

    public r200(d200 d200Var, ieu ieuVar, btt0 btt0Var, knf0 knf0Var, us00 us00Var) {
        d200Var.getClass();
        btt0Var.getClass();
        knf0Var.getClass();
        this.f29707a = d200Var;
        this.b = ieuVar;
        this.c = btt0Var;
        this.d = knf0Var;
        this.e = us00Var;
    }

    public static List c(LimitNeGroupEnum limitNeGroupEnum) {
        int iOrdinal = limitNeGroupEnum.ordinal();
        if (iOrdinal == 0) {
            return q3d.j(ge7.BET_LIMIT_1_DAY, ge7.BET_LIMIT_7_DAY, ge7.BET_LIMIT_30_DAY);
        }
        if (iOrdinal == 1) {
            return q3d.j(o7k.DEPOSIT_LIMIT_1_DAY, o7k.DEPOSIT_LIMIT_7_DAY, o7k.DEPOSIT_LIMIT_30_DAY);
        }
        if (iOrdinal == 2) {
            return q3d.j(oki0.SESSION_TIME_LIMIT_1_DAY, oki0.SESSION_TIME_LIMIT_7_DAY, oki0.SESSION_TIME_LIMIT_30_DAY);
        }
        if (iOrdinal == 3) {
            return kotlin.collections.a.c(g8i0.f10866a);
        }
        if (iOrdinal == 4) {
            return iun.f15405a;
        }
        t9f.b();
        return null;
    }

    public final void a(LimitNeGroupEnum limitNeGroupEnum) {
        limitNeGroupEnum.getClass();
        for (wrz wrzVar : c(limitNeGroupEnum)) {
            wrzVar.getClass();
            ((ConcurrentHashMap) this.b.b).remove(wrzVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x0213  */
    /* JADX WARN: Code duplicated, block: B:124:0x021a  */
    /* JADX WARN: Code duplicated, block: B:127:0x0220  */
    /* JADX WARN: Code duplicated, block: B:128:0x0227  */
    /* JADX WARN: Code duplicated, block: B:131:0x022d  */
    /* JADX WARN: Code duplicated, block: B:134:0x023c  */
    /* JADX WARN: Code duplicated, block: B:136:0x0244  */
    /* JADX WARN: Code duplicated, block: B:138:0x024a  */
    /* JADX WARN: Code duplicated, block: B:140:0x0252  */
    /* JADX WARN: Code duplicated, block: B:141:0x0255  */
    /* JADX WARN: Code duplicated, block: B:144:0x025d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0261  */
    /* JADX WARN: Code duplicated, block: B:153:0x0271  */
    /* JADX WARN: Code duplicated, block: B:155:0x0275  */
    /* JADX WARN: Code duplicated, block: B:157:0x027a  */
    /* JADX WARN: Code duplicated, block: B:159:0x027e  */
    /* JADX WARN: Code duplicated, block: B:162:0x0286  */
    /* JADX WARN: Code duplicated, block: B:163:0x028d  */
    /* JADX WARN: Code duplicated, block: B:166:0x0295  */
    /* JADX WARN: Code duplicated, block: B:167:0x029c  */
    /* JADX WARN: Code duplicated, block: B:170:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:172:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:174:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:179:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:219:0x026d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0269 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:221:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:222:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:223:0x02ba A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0278 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0105  */
    /* JADX WARN: Code duplicated, block: B:68:0x011e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v5, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9, types: [a.h8r] */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v2, types: [a.i8r] */
    /* JADX WARN: Type inference failed for: r29v3 */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [a.i8r] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [a.h8r] */
    /* JADX WARN: Type inference failed for: r9v22 */
    public final Object b(boolean z, zje zjeVar) {
        h200 h200Var;
        long j;
        String strG;
        Double d;
        double dDoubleValue;
        Boolean bool;
        boolean zBooleanValue;
        List<s95> list;
        ?? arrayList;
        Boolean bool2;
        boolean zBooleanValue2;
        Long l;
        long jLongValue;
        u8r u8rVar;
        ?? i8rVar;
        r8r r8rVar;
        h8r h8rVarQ;
        r8r r8rVar2;
        Object z85Var;
        Long l2;
        long jLongValue2;
        String str;
        String str2;
        ?? i8rVar2;
        ?? h8rVar;
        ?? h8rVar2;
        if (zjeVar instanceof h200) {
            h200Var = (h200) zjeVar;
            int i = h200Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                h200Var.k = i - Integer.MIN_VALUE;
            } else {
                h200Var = new h200(this, zjeVar);
            }
        } else {
            h200Var = new h200(this, zjeVar);
        }
        Object objA = h200Var.i;
        wne wneVar = wne.f39444a;
        int i2 = h200Var.k;
        String str3 = null;
        ieu ieuVar = this.b;
        if (i2 == 0) {
            z1x.P(objA);
            jzz jzzVar = (jzz) ieuVar.c;
            if (!z && jzzVar != null) {
                return jzzVar;
            }
            String strA = this.c.a();
            String strC = this.d.c();
            h200Var.k = 1;
            objA = this.f29707a.f5334a.a(strA, strC, h200Var);
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
        o300 o300Var = (o300) ((dx5) objA).a();
        Iterable iterable = o300Var.f24557a;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (true) {
            boolean z2 = false;
            if (!it.hasNext()) {
                String str4 = str3;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : arrayList2) {
                    LimitNeGroupEnum limitNeGroupEnum = ((sn40) obj).f32475a;
                    Object arrayList3 = linkedHashMap.get(limitNeGroupEnum);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(limitNeGroupEnum, arrayList3);
                    }
                    ((List) arrayList3).add(obj);
                }
                Iterable<jjq0> iterable2 = o300Var.b;
                if (iterable2 == null) {
                    iterable2 = iun.f15405a;
                }
                ArrayList arrayList4 = new ArrayList(r3d.q(iterable2, 10));
                for (jjq0 jjq0Var : iterable2) {
                    jjq0Var.getClass();
                    tqt tqtVar = asz.f1411a;
                    Integer num = jjq0Var.f16631a;
                    Long l3 = jjq0Var.d;
                    if (num == null) {
                        jf4.k(str4);
                        return str4;
                    }
                    int iIntValue = num.intValue();
                    tqtVar.getClass();
                    wrz wrzVarD = tqt.d(iIntValue);
                    art artVar = orz.f25758a;
                    String str5 = jjq0Var.c;
                    if (str5 == null) {
                        jf4.k(str4);
                        return str4;
                    }
                    artVar.getClass();
                    orz orzVarB = art.b(str5);
                    LimitNeGroupEnum limitNeGroupEnumM = q5x.M(wrzVarD);
                    long jLongValue3 = l3 != null ? l3.longValue() : 0L;
                    if (l3 != null) {
                        long jLongValue4 = l3.longValue();
                        rdj rdjVar = rdj.f30294a;
                        j = 0;
                        strG = rdj.g(new znq0(jLongValue4), efj.UNIVERSAL, Boolean.valueOf(DateFormat.is24HourFormat(this.e)), z2, 56);
                        if (strG == null) {
                        }
                        String str6 = strG;
                        d = jjq0Var.e;
                        if (d != null) {
                            dDoubleValue = d.doubleValue();
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        bool = jjq0Var.b;
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        } else {
                            zBooleanValue = z2;
                        }
                        list = jjq0Var.i;
                        if (list != null) {
                            arrayList = new ArrayList();
                            for (s95 s95Var : list) {
                                if (s95Var != null) {
                                    l2 = s95Var.f31837a;
                                    if (l2 != null) {
                                        jf4.k(str4);
                                        return str4;
                                    }
                                    if (l2.longValue() == j) {
                                        jLongValue2 = -9999;
                                    } else {
                                        jLongValue2 = l2.longValue();
                                    }
                                    str = s95Var.b;
                                    if (str != null) {
                                        jf4.k(str4);
                                        return str4;
                                    }
                                    str2 = s95Var.c;
                                    if (str2 != null) {
                                        jf4.k(str4);
                                        return str4;
                                    }
                                    z85Var = new z85(jLongValue2, str, str2);
                                } else {
                                    z85Var = str4;
                                }
                                if (z85Var != null) {
                                    arrayList.add(z85Var);
                                }
                            }
                        } else {
                            arrayList = str4;
                        }
                        if (arrayList == 0) {
                            arrayList = iun.f15405a;
                        }
                        ?? r29 = arrayList;
                        bool2 = jjq0Var.f;
                        if (bool2 != null) {
                            zBooleanValue2 = bool2.booleanValue();
                        } else {
                            zBooleanValue2 = false;
                        }
                        Long l4 = jjq0Var.g;
                        l = jjq0Var.h;
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = j;
                        }
                        u8rVar = jjq0Var.j;
                        if (u8rVar != null) {
                            r8rVar = u8rVar.f35244a;
                            if (r8rVar != null) {
                                jf4.k(str4);
                                return str4;
                            }
                            h8rVarQ = plc.Q(r8rVar);
                            r8rVar2 = u8rVar.b;
                            if (r8rVar2 != null) {
                                jf4.k(str4);
                                return str4;
                            }
                            i8rVar = new i8r(h8rVarQ, plc.Q(r8rVar2));
                        } else {
                            i8rVar = str4;
                        }
                        arrayList4.add(new riq0(limitNeGroupEnumM, wrzVarD, zBooleanValue, orzVarB, jLongValue3, str6, dDoubleValue, zBooleanValue2, l4, jLongValue, r29, i8rVar));
                        z2 = false;
                    } else {
                        j = 0;
                    }
                    if (wrzVarD == g8i0.f10866a && orzVarB == orz.b) {
                        jf4.k(str4);
                        return str4;
                    }
                    strG = "";
                    String str7 = strG;
                    d = jjq0Var.e;
                    if (d != null) {
                        dDoubleValue = d.doubleValue();
                    } else {
                        dDoubleValue = 0.0d;
                    }
                    bool = jjq0Var.b;
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    } else {
                        zBooleanValue = z2;
                    }
                    list = jjq0Var.i;
                    if (list != null) {
                        arrayList = new ArrayList();
                        while (r9.hasNext()) {
                            if (s95Var != null) {
                                l2 = s95Var.f31837a;
                                if (l2 != null) {
                                    jf4.k(str4);
                                    return str4;
                                }
                                if (l2.longValue() == j) {
                                    jLongValue2 = -9999;
                                } else {
                                    jLongValue2 = l2.longValue();
                                }
                                str = s95Var.b;
                                if (str != null) {
                                    jf4.k(str4);
                                    return str4;
                                }
                                str2 = s95Var.c;
                                if (str2 != null) {
                                    jf4.k(str4);
                                    return str4;
                                }
                                z85Var = new z85(jLongValue2, str, str2);
                            } else {
                                z85Var = str4;
                            }
                            if (z85Var != null) {
                                arrayList.add(z85Var);
                            }
                        }
                    } else {
                        arrayList = str4;
                    }
                    if (arrayList == 0) {
                        arrayList = iun.f15405a;
                    }
                    ?? r210 = arrayList;
                    bool2 = jjq0Var.f;
                    if (bool2 != null) {
                        zBooleanValue2 = bool2.booleanValue();
                    } else {
                        zBooleanValue2 = false;
                    }
                    Long l5 = jjq0Var.g;
                    l = jjq0Var.h;
                    if (l != null) {
                        jLongValue = l.longValue();
                    } else {
                        jLongValue = j;
                    }
                    u8rVar = jjq0Var.j;
                    if (u8rVar != null) {
                        r8rVar = u8rVar.f35244a;
                        if (r8rVar != null) {
                            jf4.k(str4);
                            return str4;
                        }
                        h8rVarQ = plc.Q(r8rVar);
                        r8rVar2 = u8rVar.b;
                        if (r8rVar2 != null) {
                            jf4.k(str4);
                            return str4;
                        }
                        i8rVar = new i8r(h8rVarQ, plc.Q(r8rVar2));
                    } else {
                        i8rVar = str4;
                    }
                    arrayList4.add(new riq0(limitNeGroupEnumM, wrzVarD, zBooleanValue, orzVarB, jLongValue3, str7, dDoubleValue, zBooleanValue2, l5, jLongValue, r210, i8rVar));
                    z2 = false;
                }
                List listJ = q3d.j(oki0.SESSION_TIME_LIMIT_1_DAY, oki0.SESSION_TIME_LIMIT_7_DAY, oki0.SESSION_TIME_LIMIT_30_DAY, g8i0.f10866a);
                int iA = wp20.a(r3d.q(arrayList4, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(iA);
                for (Object obj2 : arrayList4) {
                    linkedHashMap2.put(((riq0) obj2).b, obj2);
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = listJ.iterator();
                while (it2.hasNext()) {
                    riq0 riq0Var = (riq0) linkedHashMap2.get(it2.next());
                    if (riq0Var != null) {
                        arrayList5.add(riq0Var);
                    }
                }
                ArrayList arrayList6 = new ArrayList(arrayList4);
                Iterator it3 = arrayList5.iterator();
                while (it3.hasNext()) {
                    arrayList6.remove((riq0) it3.next());
                }
                ArrayList arrayListQ0 = CollectionsKt.q0(arrayList5, CollectionsKt.L0(arrayList6));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                for (Object obj3 : arrayListQ0) {
                    LimitNeGroupEnum limitNeGroupEnum2 = ((riq0) obj3).f30556a;
                    Object arrayList7 = linkedHashMap3.get(limitNeGroupEnum2);
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                        linkedHashMap3.put(limitNeGroupEnum2, arrayList7);
                    }
                    ((List) arrayList7).add(obj3);
                }
                jzz jzzVar2 = new jzz(linkedHashMap, linkedHashMap3);
                ieuVar.c = jzzVar2;
                return jzzVar2;
            }
            ko40 ko40Var = (ko40) it.next();
            ko40Var.getClass();
            tqt tqtVar2 = asz.f1411a;
            Integer num2 = ko40Var.f18613a;
            if (num2 == null) {
                String str8 = str3;
                jf4.k(str8);
                return str8;
            }
            int iIntValue2 = num2.intValue();
            tqtVar2.getClass();
            wrz wrzVarD2 = tqt.d(iIntValue2);
            LimitNeGroupEnum limitNeGroupEnumM2 = q5x.M(wrzVarD2);
            String str9 = ko40Var.b;
            if (str9 == null) {
                String str10 = str3;
                jf4.k(str10);
                return str10;
            }
            Boolean bool3 = ko40Var.c;
            if (bool3 == null) {
                String str11 = str3;
                jf4.k(str11);
                return str11;
            }
            boolean zBooleanValue3 = bool3.booleanValue();
            art artVar2 = orz.f25758a;
            String str12 = str3;
            String str13 = ko40Var.d;
            if (str13 == null) {
                jf4.k(str12);
                return str12;
            }
            artVar2.getClass();
            orz orzVarB2 = art.b(str13);
            Long l6 = ko40Var.e;
            long jLongValue5 = l6 != null ? l6.longValue() : 0L;
            Double d2 = ko40Var.f;
            double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
            Boolean bool4 = ko40Var.g;
            boolean zBooleanValue4 = bool4 != null ? bool4.booleanValue() : false;
            Long l7 = ko40Var.h;
            Long l8 = ko40Var.i;
            long jLongValue6 = l8 != null ? l8.longValue() : 0L;
            o8r o8rVar = ko40Var.j;
            if (o8rVar != null) {
                l8r l8rVar = o8rVar.f24844a;
                if (l8rVar != null) {
                    Double d3 = l8rVar.f19619a;
                    String str14 = l8rVar.b;
                    if (d3 == null || str14 == null) {
                        h8rVar = str12;
                    } else {
                        h8rVar = new h8r(str14, d3.doubleValue());
                    }
                } else {
                    h8rVar = str12;
                }
                l8r l8rVar2 = o8rVar.b;
                if (l8rVar2 != null) {
                    Double d4 = l8rVar2.f19619a;
                    String str15 = l8rVar2.b;
                    if (d4 == null || str15 == null) {
                        h8rVar2 = str12;
                    } else {
                        h8rVar2 = new h8r(str15, d4.doubleValue());
                    }
                } else {
                    h8rVar2 = str12;
                }
                i8rVar2 = (h8rVar == 0 || h8rVar2 == 0) ? str12 : new i8r(h8rVar, h8rVar2);
            } else {
                i8rVar2 = str12;
            }
            arrayList2.add(new sn40(limitNeGroupEnumM2, wrzVarD2, str9, zBooleanValue3, orzVarB2, jLongValue5, dDoubleValue2, zBooleanValue4, l7, jLongValue6, i8rVar2));
            str3 = str12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0071, code lost:
    
        if (r7 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e4, code lost:
    
        if (r12.f29707a.a(r14, r2, r0) == r1) goto L42;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0071 -> B:22:0x0075). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(org.xplatform.limits_ne.api.domain.LimitNeGroupEnum r13, a.zje r14) {
        /*
            Method dump skipped, instruction units count: 237
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.r200.d(org.xplatform.limits_ne.api.domain.LimitNeGroupEnum, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(LimitNeGroupEnum limitNeGroupEnum, zje zjeVar) {
        o200 o200Var;
        String str;
        Double d;
        List list;
        Object next;
        i8r i8rVar;
        if (zjeVar instanceof o200) {
            o200Var = (o200) zjeVar;
            int i = o200Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                o200Var.l = i - Integer.MIN_VALUE;
            } else {
                o200Var = new o200(this, zjeVar);
            }
        } else {
            o200Var = new o200(this, zjeVar);
        }
        Object obj = o200Var.j;
        wne wneVar = wne.f39444a;
        int i2 = o200Var.l;
        if (i2 == 0) {
            z1x.P(obj);
            List listC = c(limitNeGroupEnum);
            ArrayList arrayList = new ArrayList();
            ArrayList<oki0> arrayList2 = new ArrayList();
            for (Object obj2 : listC) {
                if (obj2 instanceof oki0) {
                    arrayList2.add(obj2);
                }
            }
            for (oki0 oki0Var : arrayList2) {
                oki0Var.getClass();
                ieu ieuVar = this.b;
                jzz jzzVar = (jzz) ieuVar.c;
                if (jzzVar == null || (list = (List) jzzVar.b.get(LimitNeGroupEnum.SESSION_TIME_LIMITS)) == null) {
                    str = null;
                } else {
                    Iterator it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!oki0Var.equals(((riq0) next).b));
                    riq0 riq0Var = (riq0) next;
                    if (riq0Var == null || (i8rVar = riq0Var.l) == null) {
                        str = null;
                    } else {
                        str = i8rVar.b.b;
                    }
                }
                if (str != null && (d = (Double) ((ConcurrentHashMap) ieuVar.b).get(oki0Var)) != null) {
                    double dDoubleValue = d.doubleValue();
                    if (str.equals("hour") && oki0Var != oki0.SESSION_TIME_LIMIT_1_DAY) {
                        dDoubleValue *= 24.0d;
                    }
                    arrayList.add(new tkq0((int) dDoubleValue, oki0Var.f25407a, str));
                }
            }
            String strA = this.c.a();
            pti0 pti0Var = new pti0(arrayList);
            o200Var.i = limitNeGroupEnum;
            o200Var.l = 1;
            if (this.f29707a.c(strA, pti0Var, o200Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            limitNeGroupEnum = o200Var.i;
            z1x.P(obj);
        }
        a(limitNeGroupEnum);
        return Unit.f46060a;
    }
}
