package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class eu7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bbw0 f8405a;
    public final zpp0 b;
    public final tga0 c;
    public final xyt d;
    public final knf0 e;
    public final us3 f;
    public final mne g;

    public eu7(bbw0 bbw0Var, zpp0 zpp0Var, tga0 tga0Var, xyt xytVar, knf0 knf0Var, us3 us3Var, mne mneVar) {
        zpp0Var.getClass();
        tga0Var.getClass();
        knf0Var.getClass();
        us3Var.getClass();
        this.f8405a = bbw0Var;
        this.b = zpp0Var;
        this.c = tga0Var;
        this.d = xytVar;
        this.e = knf0Var;
        this.f = us3Var;
        this.g = mneVar;
    }

    public static final void a(LinkedHashMap linkedHashMap, ws7 ws7Var, boolean z, String str, String str2, List list) {
        Iterator it;
        long j;
        List list2;
        String strC;
        Long l;
        if (list == null || list.isEmpty()) {
            return;
        }
        int i = 10;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it2 = list.iterator();
        while (true) {
            String str3 = "";
            if (!it2.hasNext()) {
                linkedHashMap.put(str2 == null ? "" : str2, arrayList);
                return;
            }
            sdo sdoVar = (sdo) it2.next();
            Long l2 = ws7Var.f39678a;
            long jLongValue = l2 != null ? l2.longValue() : -1L;
            Long l3 = ws7Var.b;
            long jLongValue2 = l3 != null ? l3.longValue() : -1L;
            sdoVar.getClass();
            str.getClass();
            List list3 = sdoVar.b;
            Long l4 = sdoVar.f32042a;
            long jLongValue3 = 0;
            if (list3 != null) {
                ArrayList arrayList2 = new ArrayList(r3d.q(list3, i));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    List list4 = (List) it3.next();
                    ArrayList arrayList3 = new ArrayList(r3d.q(list4, i));
                    ArrayList arrayList4 = arrayList3;
                    int i2 = 0;
                    for (Object obj : list4) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            q3d.p();
                            throw null;
                        }
                        rdo rdoVar = (rdo) obj;
                        long jLongValue4 = l4 != null ? l4.longValue() : 0L;
                        rdoVar.getClass();
                        ArrayList arrayList5 = arrayList4;
                        Long l5 = rdoVar.f30298a;
                        qdo qdoVar = rdoVar.f;
                        String str4 = rdoVar.e;
                        Iterator it4 = it2;
                        Double d = rdoVar.c;
                        Double d2 = rdoVar.b;
                        long jLongValue5 = l5 != null ? l5.longValue() : 0L;
                        double dDoubleValue = d2 != null ? d2.doubleValue() : 0.0d;
                        double dDoubleValue2 = d != null ? d.doubleValue() : 0.0d;
                        String strValueOf = d != null ? String.valueOf(d.doubleValue()) : null;
                        if (strValueOf == null) {
                            strValueOf = str3;
                        }
                        Boolean bool = rdoVar.d;
                        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
                        double d3 = dDoubleValue;
                        String str5 = str4 == null ? str3 : str4;
                        boolean z2 = zBooleanValue;
                        if (d2 == null || Intrinsics.d(str4, "SP")) {
                            strC = "SP";
                        } else if (str4 == null || str4.length() <= 0) {
                            pn40 pn40Var = pn40.f27267a;
                            strC = pn40.c(d2.doubleValue(), p3u0.e);
                        } else {
                            strC = str4;
                        }
                        long jLongValue6 = (qdoVar == null || (l = qdoVar.f28544a) == null) ? 0L : l.longValue();
                        String str6 = qdoVar != null ? qdoVar.b : null;
                        if (str6 == null) {
                            str6 = str3;
                        }
                        rh7 rh7Var = new rh7(jLongValue6, str6);
                        uoy uoyVar = z ? uoy.LIVE : uoy.LINE;
                        boolean z3 = d2 == null || Intrinsics.d(str4, "SP");
                        yfa0 yfa0Var = yfa0.INSTANCE;
                        ndo ndoVar = rdoVar.g;
                        List list5 = ndoVar != null ? ndoVar.f23344a : null;
                        if (list5 == null) {
                            list5 = iun.f15405a;
                        }
                        List list6 = ndoVar != null ? ndoVar.b : null;
                        if (list6 == null) {
                            list6 = iun.f15405a;
                        }
                        arrayList5.add(new ig7(i2, jLongValue5, jLongValue, d3, jLongValue4, dDoubleValue2, strValueOf, z2, str5, strC, rh7Var, uoyVar, z3, yfa0Var, false, 0L, new afo(list5, list6)));
                        arrayList4 = arrayList5;
                        i2 = i3;
                        it2 = it4;
                        str3 = str3;
                        it3 = it3;
                        jLongValue2 = jLongValue2;
                    }
                    arrayList2.add(arrayList4);
                    i = 10;
                }
                it = it2;
                j = jLongValue2;
                list2 = arrayList2;
            } else {
                it = it2;
                j = jLongValue2;
                list2 = iun.f15405a;
            }
            List list7 = list2;
            if (l4 != null) {
                jLongValue3 = l4.longValue();
            }
            arrayList.add(new h07(list7, jLongValue3, Intrinsics.d(sdoVar.c, Boolean.TRUE), str, z, jLongValue, j));
            it2 = it;
            i = 10;
        }
    }
}
