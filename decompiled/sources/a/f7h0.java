package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class f7h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final knf0 f9058a;
    public final d7h0 b;
    public final b7h0 c;
    public final btt0 d;

    public f7h0(knf0 knf0Var, d7h0 d7h0Var, b7h0 b7h0Var, btt0 btt0Var) {
        d7h0Var.getClass();
        b7h0Var.getClass();
        this.f9058a = knf0Var;
        this.b = d7h0Var;
        this.c = b7h0Var;
        this.d = btt0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v8, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r7v9 */
    public final Object a(double d, long j, zje zjeVar, csr csrVar) {
        e7h0 e7h0Var;
        j7h0 j7h0Var;
        ?? arrayList;
        a7h0 a7h0Var;
        z6h0 z6h0Var;
        if (zjeVar instanceof e7h0) {
            e7h0Var = (e7h0) zjeVar;
            int i = e7h0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                e7h0Var.k = i - Integer.MIN_VALUE;
            } else {
                e7h0Var = new e7h0(this, zjeVar);
            }
        } else {
            e7h0Var = new e7h0(this, zjeVar);
        }
        Object objA = e7h0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = e7h0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            String strA = this.d.a();
            String strC = this.f9058a.c();
            e7h0Var.k = 1;
            i6h0 i6h0Var = (i6h0) this.b.b.invoke();
            Double d2 = !csrVar.f4905a.f3145a.a() ? new Double(d) : null;
            bg8.Companion.getClass();
            objA = i6h0Var.a(strA, new uv5(j, ag8.a(csrVar), d2, strC), e7h0Var);
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
        i7h0 i7h0Var = (i7h0) ((q16) objA).a();
        Long l = i7h0Var.f14291a;
        if (l == null) {
            throw new ef5();
        }
        long jLongValue = l.longValue();
        Double d3 = i7h0Var.b;
        if (d3 == null) {
            throw new ef5();
        }
        double dDoubleValue = d3.doubleValue();
        String str = i7h0Var.d;
        if (Intrinsics.d(str, "2")) {
            j7h0Var = j7h0.f16040a;
        } else {
            if (!Intrinsics.d(str, "3")) {
                throw new ef5();
            }
            j7h0Var = j7h0.b;
        }
        j7h0 j7h0Var2 = j7h0Var;
        Double d4 = i7h0Var.c;
        double dDoubleValue2 = d4 != null ? d4.doubleValue() : 0.0d;
        Double d5 = i7h0Var.e;
        double dDoubleValue3 = d5 != null ? d5.doubleValue() : 0.0d;
        List<List> list = i7h0Var.f;
        if (list == null) {
            throw new ef5();
        }
        ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
        for (List list2 : list) {
            ArrayList arrayList3 = new ArrayList(r3d.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                switch (((Number) it.next()).intValue()) {
                    case 0:
                        z6h0Var = z6h0.f43867a;
                        break;
                    case 1:
                        z6h0Var = z6h0.b;
                        break;
                    case 2:
                        z6h0Var = z6h0.c;
                        break;
                    case 3:
                        z6h0Var = z6h0.d;
                        break;
                    case 4:
                        z6h0Var = z6h0.e;
                        break;
                    case 5:
                        z6h0Var = z6h0.f;
                        break;
                    case 6:
                        z6h0Var = z6h0.g;
                        break;
                    case 7:
                        z6h0Var = z6h0.h;
                        break;
                    case 8:
                        z6h0Var = z6h0.i;
                        break;
                    default:
                        throw new ef5();
                }
                arrayList3.add(z6h0Var);
            }
            arrayList2.add(arrayList3);
        }
        List list3 = i7h0Var.g;
        if (list3 != null) {
            arrayList = new ArrayList(r3d.q(list3, 10));
            Iterator it2 = list3.iterator();
            while (it2.hasNext()) {
                switch (((Number) it2.next()).intValue()) {
                    case 0:
                        a7h0Var = a7h0.f370a;
                        break;
                    case 1:
                        a7h0Var = a7h0.b;
                        break;
                    case 2:
                        a7h0Var = a7h0.c;
                        break;
                    case 3:
                        a7h0Var = a7h0.d;
                        break;
                    case 4:
                        a7h0Var = a7h0.e;
                        break;
                    case 5:
                        a7h0Var = a7h0.f;
                        break;
                    case 6:
                        a7h0Var = a7h0.g;
                        break;
                    case 7:
                        a7h0Var = a7h0.h;
                        break;
                    default:
                        throw new ef5();
                }
                arrayList.add(a7h0Var);
            }
        } else {
            arrayList = iun.f15405a;
        }
        return new c7h0(jLongValue, dDoubleValue, dDoubleValue2, dDoubleValue3, j7h0Var2, arrayList2, arrayList);
    }
}
