package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class w9t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t9t f38798a;
    public final btt0 b;

    public w9t(t9t t9tVar, btt0 btt0Var) {
        t9tVar.getClass();
        this.f38798a = t9tVar;
        this.b = btt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object a(long j, zje zjeVar) {
        u9t u9tVar;
        List list;
        if (zjeVar instanceof u9t) {
            u9tVar = (u9t) zjeVar;
            int i = u9tVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                u9tVar.k = i - Integer.MIN_VALUE;
            } else {
                u9tVar = new u9t(this, zjeVar);
            }
        } else {
            u9tVar = new u9t(this, zjeVar);
        }
        Object objA = u9tVar.i;
        wne wneVar = wne.f39444a;
        int i2 = u9tVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            String strA = this.b.a();
            d9t d9tVar = new d9t(j);
            u9tVar.k = 1;
            objA = ((d7t) this.f38798a.b.invoke()).a(strA, d9tVar, u9tVar);
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
        z9t z9tVar = (z9t) CollectionsKt.f0((List) ((nz5) objA).a());
        if (z9tVar == null) {
            jf4.k(null);
            return null;
        }
        Integer num = z9tVar.f44037a;
        int iIntValue = num != null ? num.intValue() : 0;
        List list2 = z9tVar.b;
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        List list3 = list2;
        Integer num2 = z9tVar.d;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        List list4 = z9tVar.f;
        if (list4 == null) {
            jf4.k(null);
            return null;
        }
        l9t l9tVar = z9tVar.h;
        if (l9tVar == null || (list = l9tVar.f19672a) == null) {
            jf4.k(null);
            return null;
        }
        List<h7t> list5 = l9tVar.b;
        if (list5 == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list5, 10));
        for (h7t h7tVar : list5) {
            h7tVar.getClass();
            Double d = h7tVar.f;
            double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
            Double d2 = h7tVar.e;
            double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
            Integer num3 = h7tVar.c;
            arrayList.add(new e7t(dDoubleValue, dDoubleValue2, num3 != null ? num3.intValue() : 0));
        }
        return new k7t(iIntValue, list3, iIntValue2, list4, list, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object b(double d, long j, zje zjeVar, csr csrVar) {
        v9t v9tVar;
        e9t e9tVar;
        List<z9t> list;
        Double d2;
        if (zjeVar instanceof v9t) {
            v9tVar = (v9t) zjeVar;
            int i = v9tVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                v9tVar.k = i - Integer.MIN_VALUE;
            } else {
                v9tVar = new v9t(this, zjeVar);
            }
        } else {
            v9tVar = new v9t(this, zjeVar);
        }
        Object objB = v9tVar.i;
        wne wneVar = wne.f39444a;
        int i2 = v9tVar.k;
        if (i2 == 0) {
            z1x.P(objB);
            String strA = this.b.a();
            Double d3 = new Double(d);
            if (csrVar.f4905a.f3145a.a()) {
                d3 = null;
            }
            r9t r9tVar = new r9t(j, d3);
            v9tVar.k = 1;
            objB = ((d7t) this.f38798a.b.invoke()).b(strA, r9tVar, v9tVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        r7t r7tVar = (r7t) ((nz5) objB).a();
        Double d4 = r7tVar.c;
        cat catVar = r7tVar.f;
        double dDoubleValue = d4 != null ? d4.doubleValue() : 0.0d;
        h9t h9tVar = r7tVar.d;
        if (h9tVar != null) {
            String str = h9tVar.f12693a;
            if (str == null) {
                str = "";
            }
            String str2 = h9tVar.b;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = h9tVar.c;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = h9tVar.d;
            e9tVar = new e9t(str, str2, str3, str4 != null ? str4 : "");
        } else {
            e9tVar = e9t.e;
        }
        e9t e9tVar2 = e9tVar;
        Double d5 = r7tVar.e;
        double dDoubleValue2 = d5 != null ? d5.doubleValue() : 0.0d;
        double dDoubleValue3 = (catVar == null || (d2 = catVar.f4029a) == null) ? 0.0d : d2.doubleValue();
        if (catVar == null || (list = catVar.b) == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (z9t z9tVar : list) {
            z9tVar.getClass();
            Integer num = z9tVar.f44037a;
            int iIntValue = num != null ? num.intValue() : 0;
            List list2 = z9tVar.b;
            if (list2 == null) {
                list2 = iun.f15405a;
            }
            List list3 = list2;
            Integer num2 = z9tVar.c;
            int iIntValue2 = num2 != null ? num2.intValue() : 0;
            Integer num3 = z9tVar.d;
            int iIntValue3 = num3 != null ? num3.intValue() : 0;
            Boolean bool = z9tVar.e;
            boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
            List list4 = z9tVar.f;
            if (list4 == null) {
                list4 = iun.f15405a;
            }
            List list5 = list4;
            Boolean bool2 = z9tVar.g;
            boolean zBooleanValue2 = bool2 != null ? bool2.booleanValue() : false;
            l9t l9tVar = z9tVar.h;
            if (l9tVar == null) {
                jf4.k(null);
                return null;
            }
            i9t i9tVarH0 = kbc.h0(l9tVar);
            l9t l9tVar2 = z9tVar.i;
            i9t i9tVarH1 = l9tVar2 != null ? kbc.h0(l9tVar2) : i9t.c;
            l9t l9tVar3 = z9tVar.j;
            arrayList.add(new n9t(iIntValue, list3, iIntValue2, iIntValue3, zBooleanValue, list5, zBooleanValue2, i9tVarH0, i9tVarH1, l9tVar3 != null ? kbc.h0(l9tVar3) : i9t.c));
        }
        Double d6 = r7tVar.b;
        double dDoubleValue4 = d6 != null ? d6.doubleValue() : 0.0d;
        Long l = r7tVar.f29994a;
        return new s9t(dDoubleValue, e9tVar2, dDoubleValue2, dDoubleValue3, arrayList, dDoubleValue4, l != null ? l.longValue() : 0L);
    }
}
