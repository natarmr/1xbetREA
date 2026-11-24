package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
public final class vgf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btt0 f37378a;
    public final tgf b;
    public final fgf c;
    public final kwd d;

    public vgf(btt0 btt0Var, tgf tgfVar, fgf fgfVar, kwd kwdVar, kud kudVar) {
        this.f37378a = btt0Var;
        this.b = tgfVar;
        this.c = fgfVar;
        this.d = kwdVar;
    }

    /* JADX WARN: Code duplicated, block: B:113:0x025f  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v3, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    public final Object a(double d, long j, zje zjeVar, csr csrVar) {
        ugf ugfVar;
        kwd kwdVar;
        csr csrVarA;
        String str;
        List list;
        lnm0 lnm0Var;
        ?? arrayList;
        Map mapM;
        ?? arrayList2;
        List listT0;
        if (zjeVar instanceof ugf) {
            ugfVar = (ugf) zjeVar;
            int i = ugfVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ugfVar.l = i - Integer.MIN_VALUE;
            } else {
                ugfVar = new ugf(this, zjeVar);
            }
        } else {
            ugfVar = new ugf(this, zjeVar);
        }
        ugf ugfVar2 = ugfVar;
        Object obj = ugfVar2.j;
        wne wneVar = wne.f39444a;
        int i2 = ugfVar2.l;
        String str2 = null;
        if (i2 == 0) {
            z1x.P(obj);
            String strA = this.f37378a.a();
            kwd kwdVar2 = this.d;
            ugfVar2.i = kwdVar2;
            ugfVar2.l = 1;
            Object objA = this.b.a(d, j, ugfVar2, csrVar, strA);
            if (objA == wneVar) {
                return wneVar;
            }
            kwdVar = kwdVar2;
            obj = objA;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kwdVar = ugfVar2.i;
            z1x.P(obj);
        }
        bhf bhfVar = (bhf) obj;
        kwdVar.getClass();
        bhfVar.getClass();
        Long l = bhfVar.f2603a;
        if (l == null) {
            jf4.k(null);
            return null;
        }
        long jLongValue = l.longValue();
        Double d2 = bhfVar.f;
        double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
        rk10 rk10Var = bhfVar.b;
        if (rk10Var != null) {
            rk10.Companion.getClass();
            csrVarA = qk10.a(rk10Var);
        } else {
            csrVarA = csr.e;
        }
        csr csrVar2 = csrVarA;
        Double d3 = bhfVar.e;
        double dDoubleValue2 = d3 != null ? d3.doubleValue() : 0.0d;
        jhf jhfVar = bhfVar.g;
        if (jhfVar == null) {
            jf4.k(null);
            return null;
        }
        List<ghf> list2 = jhfVar.f16523a;
        int i3 = 2;
        if (list2 != null) {
            int i4 = 10;
            ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
            for (ghf ghfVar : list2) {
                ghfVar.getClass();
                List<List> list3 = ghfVar.f11295a;
                if (list3 == null) {
                    String str3 = str2;
                    jf4.k(str3);
                    return str3;
                }
                ArrayList arrayList4 = new ArrayList(r3d.q(list3, i4));
                for (List list4 : list3) {
                    ArrayList arrayList5 = new ArrayList(r3d.q(list4, i4));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        int iIntValue = ((Number) it.next()).intValue();
                        ohf.b.getClass();
                        String str4 = str2;
                        ohf ohfVar = (ohf) ohf.c.get(Integer.valueOf(iIntValue));
                        if (ohfVar == null) {
                            jf4.k(str4);
                            return str4;
                        }
                        arrayList5.add(ohfVar);
                        str2 = str4;
                    }
                    arrayList4.add(arrayList5);
                }
                String str5 = str2;
                List<eif> list5 = ghfVar.b;
                if (list5 != null) {
                    arrayList = new ArrayList(r3d.q(list5, i4));
                    for (eif eifVar : list5) {
                        eifVar.getClass();
                        Double d4 = eifVar.f7856a;
                        double dDoubleValue3 = d4 != null ? d4.doubleValue() : 0.0d;
                        Integer num = eifVar.b;
                        if (num != null) {
                            std stdVar = ohf.b;
                            int iIntValue2 = num.intValue();
                            stdVar.getClass();
                            ohf ohfVar2 = (ohf) ohf.c.get(Integer.valueOf(iIntValue2));
                            if (ohfVar2 != null) {
                                Double d5 = eifVar.c;
                                double dDoubleValue4 = d5 != null ? d5.doubleValue() : 0.0d;
                                List list6 = eifVar.d;
                                if (list6 == null) {
                                    jf4.k(str5);
                                    return str5;
                                }
                                ArrayList arrayList6 = new ArrayList(r3d.q(list6, i4));
                                Iterator it2 = list6.iterator();
                                while (it2.hasNext()) {
                                    List listT1 = CollectionsKt.t0((List) it2.next());
                                    if (listT1.size() != i3) {
                                        jf4.o("List must be length of 2");
                                        return str5;
                                    }
                                    arrayList6.add(new Pair(listT1.get(0), listT1.get(1)));
                                    i3 = 2;
                                }
                                arrayList.add(new bif(dDoubleValue3, ohfVar2, dDoubleValue4, arrayList6));
                                i3 = 2;
                                i4 = 10;
                            }
                        }
                        jf4.k(str5);
                        return str5;
                    }
                }
                arrayList = iun.f15405a;
                Map map = ghfVar.c;
                if (map != null) {
                    ArrayList arrayList7 = new ArrayList(map.size());
                    for (Map.Entry entry : map.entrySet()) {
                        String str6 = (String) entry.getKey();
                        List list7 = (List) entry.getValue();
                        if (str6 == null) {
                            jf4.k(str5);
                            return str5;
                        }
                        int i5 = Integer.parseInt(str6);
                        if (list7 == null || (listT0 = CollectionsKt.t0(list7)) == null) {
                            arrayList2 = iun.f15405a;
                        } else {
                            arrayList2 = new ArrayList(r3d.q(listT0, 10));
                            Iterator it3 = listT0.iterator();
                            while (it3.hasNext()) {
                                int iIntValue3 = ((Number) it3.next()).intValue();
                                ohf.b.getClass();
                                ohf ohfVar3 = (ohf) ohf.c.get(Integer.valueOf(iIntValue3));
                                if (ohfVar3 == null) {
                                    jf4.k(str5);
                                    return str5;
                                }
                                arrayList2.add(ohfVar3);
                            }
                        }
                        arrayList7.add(new Pair(Integer.valueOf(i5), arrayList2));
                    }
                    mapM = xp20.m(arrayList7);
                    if (mapM == null) {
                        mapM = lun.f20680a;
                        mapM.getClass();
                    }
                } else {
                    mapM = lun.f20680a;
                    mapM.getClass();
                }
                arrayList3.add(new dhf(arrayList4, arrayList, mapM));
                str2 = str5;
                i3 = 2;
                i4 = 10;
            }
            str = str2;
            list = arrayList3;
        } else {
            str = null;
            list = iun.f15405a;
        }
        khf khfVar = new khf(list);
        Double d6 = bhfVar.d;
        double dDoubleValue5 = d6 != null ? d6.doubleValue() : 0.0d;
        nff nffVar = bhfVar.c;
        if (nffVar == null) {
            jf4.k(str);
            return str;
        }
        int iOrdinal = nffVar.ordinal();
        if (iOrdinal == 0) {
            lnm0Var = lnm0.c;
        } else if (iOrdinal == 1) {
            lnm0Var = lnm0.d;
        } else {
            if (iOrdinal != 2) {
                t9f.b();
                return str;
            }
            lnm0Var = lnm0.e;
        }
        lgf lgfVar = new lgf(jLongValue, dDoubleValue, csrVar2, dDoubleValue2, khfVar, dDoubleValue5, lnm0Var);
        this.c.f9489a = lgfVar;
        return lgfVar;
    }
}
