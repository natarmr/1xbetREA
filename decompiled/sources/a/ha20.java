package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class ha20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final abu f12705a;
    public final btt0 b;
    public final ave c;
    public final knf0 d;
    public final mne e;

    public ha20(abu abuVar, btt0 btt0Var, ave aveVar, knf0 knf0Var, mne mneVar) {
        btt0Var.getClass();
        aveVar.getClass();
        knf0Var.getClass();
        this.f12705a = abuVar;
        this.b = btt0Var;
        this.c = aveVar;
        this.d = knf0Var;
        this.e = mneVar;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0228  */
    /* JADX WARN: Code duplicated, block: B:106:0x022c  */
    /* JADX WARN: Code duplicated, block: B:108:0x0230  */
    /* JADX WARN: Code duplicated, block: B:109:0x0233  */
    /* JADX WARN: Code duplicated, block: B:111:0x0237  */
    /* JADX WARN: Code duplicated, block: B:130:0x027d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0283  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:146:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:149:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:151:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:153:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:158:0x031a  */
    /* JADX WARN: Code duplicated, block: B:162:0x0340  */
    /* JADX WARN: Code duplicated, block: B:165:0x0345 A[EDGE_INSN: B:165:0x0345->B:166:0x0347 BREAK  A[LOOP:3: B:35:0x0128->B:135:0x028b]] */
    /* JADX WARN: Code duplicated, block: B:168:0x034d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0366 A[LOOP:0: B:169:0x0360->B:171:0x0366, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:174:0x0384  */
    /* JADX WARN: Code duplicated, block: B:179:0x0298 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0294 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x0224 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x02bf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:193:0x02a7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x00de  */
    /* JADX WARN: Code duplicated, block: B:32:0x00fd A[LOOP:2: B:30:0x00f7->B:32:0x00fd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:37:0x0130  */
    /* JADX WARN: Code duplicated, block: B:39:0x0138  */
    /* JADX WARN: Code duplicated, block: B:41:0x0144  */
    /* JADX WARN: Code duplicated, block: B:43:0x0149  */
    /* JADX WARN: Code duplicated, block: B:44:0x014c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0162  */
    /* JADX WARN: Code duplicated, block: B:52:0x0166  */
    /* JADX WARN: Code duplicated, block: B:54:0x016d  */
    /* JADX WARN: Code duplicated, block: B:57:0x0174  */
    /* JADX WARN: Code duplicated, block: B:60:0x017e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0181  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r37v0, types: [java.util.List] */
    public final Serializable a(nw40 nw40Var, long j, boolean z, int i, zje zjeVar) throws rv40 {
        fa20 fa20Var;
        nw40 nw40Var2;
        int i2;
        long j2;
        boolean z2;
        byte b;
        boolean z3;
        nw40 nw40Var3;
        List list;
        ArrayList arrayList;
        ArrayList arrayList2;
        LinkedHashMap linkedHashMap;
        lie0 lie0Var;
        ArrayList arrayList3;
        Iterator it;
        LinkedHashMap linkedHashMap2;
        ArrayList arrayListR;
        Iterator it2;
        int i3;
        LinkedHashMap linkedHashMap3;
        Object objA;
        LinkedHashMap linkedHashMap4;
        lie0 lie0Var2;
        ArrayList arrayList4;
        Iterator it3;
        Long l;
        long jLongValue;
        Object next;
        int i4;
        q16 q16Var;
        boolean z4;
        Object obj;
        LinkedHashMap linkedHashMap5;
        i2o i2oVar;
        String str;
        gi7 gi7Var;
        String str2;
        String str3;
        Long l2;
        gi7 gi7Var2;
        String str4;
        gi7 gi7Var3;
        String str5;
        n1f n1fVar;
        Double d;
        double dDoubleValue;
        String str6;
        String str7;
        Long l3;
        ?? arrayList5;
        ArrayList arrayList6;
        Iterator it4;
        ArrayList arrayList7;
        if (zjeVar instanceof fa20) {
            fa20Var = (fa20) zjeVar;
            int i5 = fa20Var.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                fa20Var.q = i5 - Integer.MIN_VALUE;
            } else {
                fa20Var = new fa20(this, zjeVar);
            }
        } else {
            fa20Var = new fa20(this, zjeVar);
        }
        Object obj2 = fa20Var.o;
        wne wneVar = wne.f39444a;
        int i6 = fa20Var.q;
        ave aveVar = this.c;
        int i7 = 10;
        if (i6 == 0) {
            z1x.P(obj2);
            long jW0 = ibc.w0(j, bfn.MILLISECONDS);
            nw40Var2 = nw40Var;
            fa20Var.i = nw40Var2;
            fa20Var.l = j;
            fa20Var.m = z;
            i2 = i;
            fa20Var.n = i2 == true ? (byte) 1 : (byte) 0;
            fa20Var.q = 1;
            if (qcc.P(jW0, fa20Var) != wneVar) {
                j2 = j;
                z2 = z;
            }
            return wneVar;
        }
        if (i6 == 1) {
            byte b2 = fa20Var.n;
            z2 = fa20Var.m;
            j2 = fa20Var.l;
            nw40 nw40Var4 = fa20Var.i;
            z1x.P(obj2);
            i2 = b2;
            nw40Var2 = nw40Var4;
        } else if (i6 == 2) {
            b = fa20Var.n;
            z3 = fa20Var.m;
            j2 = fa20Var.l;
            nw40Var3 = fa20Var.i;
            z1x.P(obj2);
            list = (List) obj2;
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            linkedHashMap = new LinkedHashMap();
            lie0Var = new lie0();
            List list2 = nw40Var3.c;
            arrayList3 = new ArrayList(r3d.q(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
                List list3 = ((ouj0) it.next()).e;
                Iterator it5 = it;
                List list4 = list;
                arrayList6 = new ArrayList(r3d.q(list3, i7));
                it4 = list3.iterator();
                while (it4.hasNext()) {
                    axq.t(((ru6) it4.next()).f31110a, arrayList6);
                    linkedHashMap = linkedHashMap;
                }
                arrayList3.add(arrayList6);
                it = it5;
                list = list4;
                i7 = 10;
            }
            linkedHashMap2 = linkedHashMap;
            arrayListR = r3d.r(arrayList3);
            it2 = list.iterator();
            i3 = 0;
            while (true) {
                long jLongValue2 = 0;
                if (it2.hasNext()) {
                    linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        if (!StringsKt.W((String) entry.getValue())) {
                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        arrayList4 = new ArrayList(r3d.q(arrayList, 10));
                        it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            na20 na20Var = (na20) it3.next();
                            l = (Long) CollectionsKt.firstOrNull(na20Var.f23170a);
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            Iterator it6 = it3;
                            arrayList4.add(new l820(jLongValue, na20Var.b, na20Var.c));
                            it3 = it6;
                        }
                        aveVar.n.addAll(arrayList4);
                    }
                    if (!arrayList2.isEmpty()) {
                        aveVar.getClass();
                        aveVar.m.addAll(arrayList2);
                    }
                    fa20Var.i = null;
                    fa20Var.j = lie0Var;
                    fa20Var.k = linkedHashMap3;
                    fa20Var.l = j2;
                    fa20Var.m = z3;
                    fa20Var.n = b;
                    fa20Var.q = 3;
                    objA = aveVar.q.a(Boolean.TRUE, fa20Var);
                    if (objA != wne.f39444a) {
                        objA = Unit.f46060a;
                    }
                    if (objA != wneVar) {
                        linkedHashMap4 = linkedHashMap3;
                        lie0Var2 = lie0Var;
                        break;
                    }
                    return wneVar;
                }
                next = it2.next();
                i4 = i3 + 1;
                if (i3 >= 0) {
                    q3d.p();
                    throw null;
                }
                q16Var = (q16) next;
                z4 = q16Var.b;
                Iterator it7 = it2;
                obj = q16Var.d;
                if (!z4) {
                    gi7Var2 = (gi7) obj;
                    if (gi7Var2 != null) {
                        str4 = gi7Var2.d;
                    } else {
                        str4 = null;
                    }
                    if (str4 != null || str4.length() == 0) {
                        gi7Var3 = (gi7) q16Var.a();
                        str5 = gi7Var3.c;
                        n1fVar = gi7Var3.f;
                        if (str5 != null) {
                            jf4.k(null);
                            return null;
                        }
                        d = gi7Var3.b;
                        if (d != null) {
                            dDoubleValue = d.doubleValue();
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        double d2 = dDoubleValue;
                        Long l4 = gi7Var3.e;
                        long jLongValue3 = l4 != null ? l4.longValue() : 0L;
                        str6 = gi7Var3.d;
                        if (str6 == null) {
                            str7 = "";
                        } else {
                            str7 = str6;
                        }
                        if (n1fVar != null || (l3 = n1fVar.f22748a) == null) {
                            jf4.k(null);
                            return null;
                        }
                        long jLongValue4 = l3.longValue();
                        Double d3 = n1fVar.b;
                        if (d3 == null) {
                            jf4.k(null);
                            return null;
                        }
                        double dDoubleValue2 = d3.doubleValue();
                        String str8 = n1fVar.c;
                        String str9 = str8 == null ? "" : str8;
                        Boolean bool = gi7Var3.g;
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        Boolean bool2 = gi7Var3.h;
                        boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
                        Double d4 = n1fVar.d;
                        if (d4 == null) {
                            jf4.k(null);
                            return null;
                        }
                        double dDoubleValue3 = d4.doubleValue();
                        nwd nwdVar = q4f.f28094a;
                        Integer num = n1fVar.e;
                        if (num == null) {
                            jf4.k(null);
                            return null;
                        }
                        int iIntValue = num.intValue();
                        nwdVar.getClass();
                        q4f q4fVarA = nwd.a(iIntValue);
                        List list5 = n1fVar.f;
                        if (list5 != null) {
                            arrayList5 = new ArrayList(r3d.q(list5, 10));
                            Iterator it8 = list5.iterator();
                            while (it8.hasNext()) {
                                arrayList5.add(nia0.e0((qv6) it8.next()));
                            }
                        } else {
                            arrayList5 = 0;
                        }
                        if (arrayList5 == 0) {
                            arrayList5 = iun.f15405a;
                        }
                        arrayList2.add(new oa20(str5, d2, jLongValue3, str7, jLongValue4, dDoubleValue2, str9, zBooleanValue, zBooleanValue2, dDoubleValue3, q4fVarA, arrayList5));
                    } else {
                        if (q16Var.b) {
                            gi7Var = (gi7) obj;
                            if (gi7Var != null) {
                                str2 = gi7Var.d;
                            } else {
                                str2 = null;
                            }
                            if (str2 == null) {
                            }
                        }
                        linkedHashMap5 = linkedHashMap2;
                        List listC = kotlin.collections.a.c(arrayListR.get(i3));
                        i2oVar = (i2o) q16Var.c;
                        if (i2oVar == null) {
                            i2oVar = i2o.Error;
                        }
                        str = q16Var.f27936a;
                        if (str == null) {
                            str = "";
                        }
                        arrayList.add(new na20(listC, i2oVar, str));
                    }
                    linkedHashMap5 = linkedHashMap2;
                } else {
                    if (q16Var.b) {
                        gi7Var = (gi7) obj;
                        if (gi7Var != null) {
                            str2 = gi7Var.d;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null && str2.length() != 0) {
                            Object obj3 = arrayListR.get(i3);
                            if (gi7Var == null || (str3 = gi7Var.d) == null) {
                                str3 = "";
                            }
                            LinkedHashMap linkedHashMap6 = linkedHashMap2;
                            linkedHashMap6.put(obj3, str3);
                            linkedHashMap2 = linkedHashMap6;
                            if (lie0Var.f20100a == 0) {
                                if (gi7Var != null && (l2 = gi7Var.e) != null) {
                                    jLongValue2 = l2.longValue();
                                }
                                lie0Var.f20100a = jLongValue2;
                            }
                            linkedHashMap5 = linkedHashMap2;
                        }
                    }
                    linkedHashMap5 = linkedHashMap2;
                    List listC2 = kotlin.collections.a.c(arrayListR.get(i3));
                    i2oVar = (i2o) q16Var.c;
                    if (i2oVar == null) {
                        i2oVar = i2o.Error;
                    }
                    str = q16Var.f27936a;
                    if (str == null) {
                        str = "";
                    }
                    arrayList.add(new na20(listC2, i2oVar, str));
                }
                arrayListR = arrayListR;
                linkedHashMap2 = linkedHashMap5;
                i3 = i4;
                it2 = it7;
            }
        } else {
            if (i6 != 3) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashMap4 = fa20Var.k;
            lie0Var2 = fa20Var.j;
            z1x.P(obj2);
        }
        if (linkedHashMap4.isEmpty()) {
            throw new rv40(lie0Var2.f20100a, linkedHashMap4);
        }
        ArrayList arrayList8 = aveVar.m;
        ArrayList<l820> arrayList9 = aveVar.n;
        arrayList7 = new ArrayList(r3d.q(arrayList9, 10));
        for (l820 l820Var : arrayList9) {
            arrayList7.add(new na20(cs0.u(l820Var.f19589a), l820Var.b, l820Var.c));
        }
        return CollectionsKt.q0(arrayList8, arrayList7);
        dvj dvjVar = this.e.b;
        int i8 = i2;
        ebt ebtVar = new ebt(this, nw40Var2, z2, i8 == true ? 1 : 0, null);
        b = i8 == true ? 1 : 0;
        fa20Var.i = nw40Var2;
        fa20Var.l = j2;
        fa20Var.m = z2;
        fa20Var.n = b;
        fa20Var.q = 2;
        Object objD0 = qjj.d0(dvjVar, ebtVar, fa20Var);
        if (objD0 != wneVar) {
            nw40 nw40Var5 = nw40Var2;
            obj2 = objD0;
            z3 = z2;
            nw40Var3 = nw40Var5;
            list = (List) obj2;
            arrayList = new ArrayList();
            arrayList2 = new ArrayList();
            linkedHashMap = new LinkedHashMap();
            lie0Var = new lie0();
            List list6 = nw40Var3.c;
            arrayList3 = new ArrayList(r3d.q(list6, 10));
            it = list6.iterator();
            while (it.hasNext()) {
                List list7 = ((ouj0) it.next()).e;
                Iterator it9 = it;
                List list8 = list;
                arrayList6 = new ArrayList(r3d.q(list7, i7));
                it4 = list7.iterator();
                while (it4.hasNext()) {
                    axq.t(((ru6) it4.next()).f31110a, arrayList6);
                    linkedHashMap = linkedHashMap;
                }
                arrayList3.add(arrayList6);
                it = it9;
                list = list8;
                i7 = 10;
            }
            linkedHashMap2 = linkedHashMap;
            arrayListR = r3d.r(arrayList3);
            it2 = list.iterator();
            i3 = 0;
            while (true) {
                long jLongValue5 = 0;
                if (it2.hasNext()) {
                    linkedHashMap3 = new LinkedHashMap();
                    while (r3.hasNext()) {
                        if (!StringsKt.W((String) entry.getValue())) {
                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        arrayList4 = new ArrayList(r3d.q(arrayList, 10));
                        it3 = arrayList.iterator();
                        while (it3.hasNext()) {
                            na20 na20Var2 = (na20) it3.next();
                            l = (Long) CollectionsKt.firstOrNull(na20Var2.f23170a);
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            Iterator it10 = it3;
                            arrayList4.add(new l820(jLongValue, na20Var2.b, na20Var2.c));
                            it3 = it10;
                        }
                        aveVar.n.addAll(arrayList4);
                    }
                    if (!arrayList2.isEmpty()) {
                        aveVar.getClass();
                        aveVar.m.addAll(arrayList2);
                    }
                    fa20Var.i = null;
                    fa20Var.j = lie0Var;
                    fa20Var.k = linkedHashMap3;
                    fa20Var.l = j2;
                    fa20Var.m = z3;
                    fa20Var.n = b;
                    fa20Var.q = 3;
                    objA = aveVar.q.a(Boolean.TRUE, fa20Var);
                    if (objA != wne.f39444a) {
                        objA = Unit.f46060a;
                    }
                    if (objA != wneVar) {
                        linkedHashMap4 = linkedHashMap3;
                        lie0Var2 = lie0Var;
                        break;
                    }
                } else {
                    next = it2.next();
                    i4 = i3 + 1;
                    if (i3 >= 0) {
                        q3d.p();
                        throw null;
                    }
                    q16Var = (q16) next;
                    z4 = q16Var.b;
                    Iterator it11 = it2;
                    obj = q16Var.d;
                    if (!z4) {
                        gi7Var2 = (gi7) obj;
                        if (gi7Var2 != null) {
                            str4 = gi7Var2.d;
                        } else {
                            str4 = null;
                        }
                        if (str4 != null) {
                        }
                        gi7Var3 = (gi7) q16Var.a();
                        str5 = gi7Var3.c;
                        n1fVar = gi7Var3.f;
                        if (str5 != null) {
                            jf4.k(null);
                            return null;
                        }
                        d = gi7Var3.b;
                        if (d != null) {
                            dDoubleValue = d.doubleValue();
                        } else {
                            dDoubleValue = 0.0d;
                        }
                        double d5 = dDoubleValue;
                        Long l5 = gi7Var3.e;
                        long jLongValue6 = l5 != null ? l5.longValue() : 0L;
                        str6 = gi7Var3.d;
                        if (str6 == null) {
                            str7 = "";
                        } else {
                            str7 = str6;
                        }
                        if (n1fVar != null) {
                        }
                        jf4.k(null);
                        return null;
                    }
                    if (q16Var.b) {
                        gi7Var = (gi7) obj;
                        if (gi7Var != null) {
                            str2 = gi7Var.d;
                        } else {
                            str2 = null;
                        }
                        if (str2 == null) {
                        }
                    }
                    linkedHashMap5 = linkedHashMap2;
                    List listC3 = kotlin.collections.a.c(arrayListR.get(i3));
                    i2oVar = (i2o) q16Var.c;
                    if (i2oVar == null) {
                        i2oVar = i2o.Error;
                    }
                    str = q16Var.f27936a;
                    if (str == null) {
                        str = "";
                    }
                    arrayList.add(new na20(listC3, i2oVar, str));
                    arrayListR = arrayListR;
                    linkedHashMap2 = linkedHashMap5;
                    i3 = i4;
                    it2 = it11;
                }
            }
            if (linkedHashMap4.isEmpty()) {
                throw new rv40(lie0Var2.f20100a, linkedHashMap4);
            }
            ArrayList arrayList10 = aveVar.m;
            ArrayList<l820> arrayList11 = aveVar.n;
            arrayList7 = new ArrayList(r3d.q(arrayList11, 10));
            while (r1.hasNext()) {
                arrayList7.add(new na20(cs0.u(l820Var.f19589a), l820Var.b, l820Var.c));
            }
            return CollectionsKt.q0(arrayList10, arrayList7);
        }
        return wneVar;
    }
}
