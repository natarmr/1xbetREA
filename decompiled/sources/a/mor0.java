package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class mor0 extends bnn0 implements Function2 {
    public ywu i;
    public boolean j;
    public final /* synthetic */ ywu k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ long n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ ArrayList q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mor0(ywu ywuVar, long j, long j2, long j3, int i, int i2, ArrayList arrayList, yje yjeVar) {
        super(2, yjeVar);
        this.k = ywuVar;
        this.l = j;
        this.m = j2;
        this.n = j3;
        this.o = i;
        this.p = i2;
        this.q = arrayList;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new mor0(this.k, this.l, this.m, this.n, this.o, this.p, this.q, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((mor0) create((we60) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v4, types: [a.iun] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.util.ArrayList] */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        ywu ywuVar;
        Object objA;
        List arrayList;
        ?? arrayList2;
        wne wneVar = wne.f39444a;
        boolean z = this.j;
        ArrayList arrayList3 = null;
        if (!z) {
            z1x.P(obj);
            ywuVar = this.k;
            fck0 fck0Var = (fck0) ywuVar.b;
            String strA = ((btt0) ywuVar.d).a();
            String strC = ((knf0) ywuVar.c).c();
            this.i = ywuVar;
            this.j = true;
            objA = ((bor0) ((qir0) fck0Var.c).invoke()).a(strA, this.l, this.m, this.n, this.o, 0, this.p, strC, this);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ywu ywuVar2 = this.i;
            z1x.P(obj);
            ywuVar = ywuVar2;
            objA = obj;
        }
        List<m2y> list = ((s2y) ((dx5) objA).a()).f31528a;
        ywuVar.getClass();
        if (list != null && !list.isEmpty()) {
            ArrayList arrayList4 = new ArrayList();
            for (Object obj2 : list) {
                if (CollectionsKt.L(this.q, ((m2y) obj2).i)) {
                    arrayList4.add(obj2);
                }
            }
            list = arrayList4;
        }
        if (list != null) {
            ArrayList arrayList5 = new ArrayList(r3d.q(list, 10));
            for (m2y m2yVar : list) {
                m2yVar.getClass();
                String str = m2yVar.c;
                if (str == null) {
                    jf4.k(null);
                    return null;
                }
                String str2 = m2yVar.h;
                String str3 = str2 == null ? "" : str2;
                Long l = m2yVar.b;
                long jLongValue = l != null ? l.longValue() : 0L;
                Integer num = m2yVar.i;
                i0w i0wVarM = kkb.M(num != null ? num.intValue() : 0);
                Double d = m2yVar.f;
                double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
                Double d2 = m2yVar.g;
                double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
                Double d3 = m2yVar.j;
                double dDoubleValue3 = d3 != null ? d3.doubleValue() : 0.0d;
                Integer num2 = m2yVar.e;
                q4f q4fVar = (num2 != null && num2.intValue() == 8) ? q4f.y : q4f.b;
                String str4 = m2yVar.l;
                String str5 = str4 == null ? "" : str4;
                List<j0y> list2 = m2yVar.m;
                if (list2 != null) {
                    arrayList = new ArrayList();
                    for (j0y j0yVar : list2) {
                        List list3 = j0yVar.i;
                        if (list3 != null) {
                            arrayList2 = new ArrayList(r3d.q(list3, 10));
                            Iterator it = list3.iterator();
                            while (it.hasNext()) {
                                arrayList2.add(u4n0.w((g2y) it.next(), j0yVar));
                            }
                        } else {
                            arrayList2 = 0;
                        }
                        if (arrayList2 == 0) {
                            arrayList2 = iun.f15405a;
                        }
                        w3d.u(arrayList, arrayList2);
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = iun.f15405a;
                }
                List list4 = arrayList;
                pxu pxuVar = m2yVar.n;
                arrayList5.add(new z7y(str, q4fVar, dDoubleValue2, jLongValue, i0wVarM, dDoubleValue3, dDoubleValue, str3, list4, str5, pxuVar != null ? dyb.n0(pxuVar) : hxu.h));
            }
            arrayList3 = arrayList5;
        }
        return arrayList3 == null ? iun.f15405a : arrayList3;
    }
}
