package a;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class h7q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final btt0 f12588a;
    public final a7q b;
    public final q6q c;
    public final dev d;
    public final knf0 e;
    public final mne f;

    public h7q(btt0 btt0Var, a7q a7qVar, q6q q6qVar, dev devVar, knf0 knf0Var, mne mneVar) {
        btt0Var.getClass();
        q6qVar.getClass();
        devVar.getClass();
        knf0Var.getClass();
        this.f12588a = btt0Var;
        this.b = a7qVar;
        this.c = q6qVar;
        this.d = devVar;
        this.e = knf0Var;
        this.f = mneVar;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v2, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.ArrayList] */
    public final Object a(int i, int i2, ocq ocqVar, int i3, zje zjeVar) {
        b7q b7qVar;
        int i4;
        ?? arrayList;
        ?? arrayList2;
        ?? arrayList3;
        List<vbq> list;
        String strValueOf;
        Long l;
        Double d;
        Double d2;
        Boolean bool;
        Float f;
        Float f2;
        Integer num;
        Integer num2;
        Integer num3;
        Integer num4;
        List list2;
        if (zjeVar instanceof b7q) {
            b7qVar = (b7q) zjeVar;
            int i5 = b7qVar.k;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                b7qVar.k = i5 - Integer.MIN_VALUE;
            } else {
                b7qVar = new b7q(this, zjeVar);
            }
        } else {
            b7qVar = new b7q(this, zjeVar);
        }
        b7q b7qVar2 = b7qVar;
        Object objB = b7qVar2.i;
        wne wneVar = wne.f39444a;
        int i6 = b7qVar2.k;
        if (i6 == 0) {
            z1x.P(objB);
            int iOrdinal = ocqVar.ordinal();
            if (iOrdinal == 0) {
                i4 = 1;
            } else {
                if (iOrdinal != 1) {
                    t9f.b();
                    return null;
                }
                i4 = 2;
            }
            String strC = this.e.c();
            b7qVar2.k = 1;
            objB = ((y5q) ((wgn) this.b.f384a).invoke()).b(i, i2, i4, i3, strC, b7qVar2);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i6 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        rbq rbqVar = (rbq) objB;
        rbqVar.getClass();
        ecq ecqVar = rbqVar.f30201a;
        gcq gcqVarP = plc.P(ecqVar != null ? ecqVar.f7578a : null);
        if (ecqVar == null || (list2 = ecqVar.b) == null) {
            arrayList = iun.f15405a;
        } else {
            arrayList = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(vic.I((bcq) it.next()));
            }
        }
        ?? r13 = arrayList;
        long jIntValue = (ecqVar == null || (num4 = ecqVar.c) == null) ? 0L : num4.intValue();
        long jIntValue2 = (ecqVar == null || (num3 = ecqVar.d) == null) ? 0L : num3.intValue();
        long jIntValue3 = (ecqVar == null || (num2 = ecqVar.e) == null) ? 0L : num2.intValue();
        long jIntValue4 = (ecqVar == null || (num = ecqVar.f) == null) ? 0L : num.intValue();
        float fFloatValue = 0.0f;
        xbq xbqVar = new xbq(gcqVarP, r13, jIntValue, jIntValue2, jIntValue3, jIntValue4, (ecqVar == null || (f2 = ecqVar.g) == null) ? 0.0f : f2.floatValue());
        ncq ncqVar = rbqVar.b;
        if (ncqVar != null && (f = ncqVar.f23306a) != null) {
            fFloatValue = f.floatValue();
        }
        gcq gcqVarP2 = plc.P(ncqVar != null ? ncqVar.c : null);
        boolean zBooleanValue = (ncqVar == null || (bool = ncqVar.d) == null) ? false : bool.booleanValue();
        if (ncqVar == null || (list = ncqVar.b) == null) {
            arrayList2 = iun.f15405a;
        } else {
            arrayList2 = new ArrayList(r3d.q(list, 10));
            for (vbq vbqVar : list) {
                double dDoubleValue = 0.0d;
                double dDoubleValue2 = (vbqVar == null || (d2 = vbqVar.b) == null) ? 0.0d : d2.doubleValue();
                if (vbqVar == null || (strValueOf = vbqVar.f37151a) == null) {
                    strValueOf = String.valueOf(dDoubleValue2);
                }
                String str = strValueOf;
                if (vbqVar != null && (d = vbqVar.c) != null) {
                    dDoubleValue = d.doubleValue();
                }
                double d3 = dDoubleValue;
                long jLongValue = (vbqVar == null || (l = vbqVar.d) == null) ? 0L : l.longValue();
                Integer num5 = vbqVar != null ? vbqVar.f : null;
                arrayList2.add(new sbq(str, dDoubleValue2, d3, jLongValue, (num5 != null && num5.intValue() == 1546) ? wbq.f38891a : (num5 != null && num5.intValue() == 1547) ? wbq.b : wbq.c));
            }
        }
        kcq kcqVar = new kcq(fFloatValue, arrayList2, gcqVarP2, zBooleanValue);
        List list3 = rbqVar.c;
        if (list3 != null) {
            arrayList3 = new ArrayList(r3d.q(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                arrayList3.add(plc.P((jcq) it2.next()));
            }
        } else {
            arrayList3 = iun.f15405a;
        }
        return new obq(xbqVar, kcqVar, arrayList3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable b(zje zjeVar) {
        e7q e7qVar;
        if (zjeVar instanceof e7q) {
            e7qVar = (e7q) zjeVar;
            int i = e7qVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                e7qVar.k = i - Integer.MIN_VALUE;
            } else {
                e7qVar = new e7q(this, zjeVar);
            }
        } else {
            e7qVar = new e7q(this, zjeVar);
        }
        Object objC = e7qVar.i;
        wne wneVar = wne.f39444a;
        int i2 = e7qVar.k;
        if (i2 == 0) {
            z1x.P(objC);
            String strC = this.e.c();
            e7qVar.k = 1;
            objC = ((y5q) ((wgn) this.b.f384a).invoke()).c(strC, e7qVar);
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
        Iterable iterable = (Iterable) objC;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(plc.P((jcq) it.next()));
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(long j, double d, double d2, double d3, boolean z, int i, long j2, double d4, String str, long j3, boolean z2, boolean z3, ql5 ql5Var, long j4, ezc ezcVar, int i2, boolean z4, int i3, zje zjeVar) {
        g7q g7qVar;
        String str2;
        Double d5;
        Double d6;
        if (zjeVar instanceof g7q) {
            g7qVar = (g7q) zjeVar;
            int i4 = g7qVar.k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                g7qVar.k = i4 - Integer.MIN_VALUE;
            } else {
                g7qVar = new g7q(this, zjeVar);
            }
        } else {
            g7qVar = new g7q(this, zjeVar);
        }
        Object objF = g7qVar.i;
        wne wneVar = wne.f39444a;
        int i5 = g7qVar.k;
        if (i5 == 0) {
            z1x.P(objF);
            long j5 = j3 != 0 ? j3 : ql5Var.f28916a;
            str.getClass();
            long j6 = i;
            List listC = kotlin.collections.a.c(new kbq(znq0.g(j), znq0.g(j2), z ? d2 : d3, j6, d, j6, z ? 1546 : 1547));
            knf0 knf0Var = this.e;
            knf0Var.getClass();
            String strC = knf0Var.c();
            String strA = knf0Var.a();
            strA.getClass();
            listC.getClass();
            ezcVar.getClass();
            nbq nbqVar = new nbq(Double.valueOf(d4), listC, 22, 1, strC, Integer.valueOf(ezcVar.f8665a), str, Long.valueOf(j4), Long.valueOf(j5), strA, Integer.valueOf(i2), Boolean.valueOf(z2), z4 ? 1 : 2, i3);
            String strA2 = this.f12588a.a();
            g7qVar.k = 1;
            objF = this.b.f(strA2, nbqVar, g7qVar);
            if (objF == wneVar) {
                return wneVar;
            }
        } else {
            if (i5 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objF);
        }
        fi7 fi7Var = (fi7) objF;
        fi7Var.getClass();
        Double d7 = fi7Var.f9575a;
        o1f o1fVar = fi7Var.c;
        double dDoubleValue = 0.0d;
        double dDoubleValue2 = d7 != null ? d7.doubleValue() : 0.0d;
        Long l = fi7Var.b;
        long jLongValue = l != null ? l.longValue() : 0L;
        if (o1fVar == null || (str2 = o1fVar.f24476a) == null) {
            str2 = "0.0";
        }
        double dDoubleValue3 = (o1fVar == null || (d6 = o1fVar.b) == null) ? 0.0d : d6.doubleValue();
        if (o1fVar != null && (d5 = o1fVar.c) != null) {
            dDoubleValue = d5.doubleValue();
        }
        return new yh7(dDoubleValue2, jLongValue, dDoubleValue3, str2, dDoubleValue);
    }
}
