package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class g6w extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ rrd j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ long m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6w(rrd rrdVar, long j, long j2, long j3, int i, int i2, yje yjeVar) {
        super(2, yjeVar);
        this.j = rrdVar;
        this.k = j;
        this.l = j2;
        this.m = j3;
        this.n = i;
        this.o = i2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new g6w(this.j, this.k, this.l, this.m, this.n, this.o, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g6w) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            rrd rrdVar = this.j;
            dpi0 dpi0Var = (dpi0) rrdVar.e;
            String strA = ((btt0) rrdVar.i).a();
            String strC = ((knf0) rrdVar.h).c();
            this.i = true;
            objA = ((tor0) ((lkr0) dpi0Var.f6468a).invoke()).a(strA, this.k, this.l, this.m, this.n, 0, this.o, strC, this);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
            objA = obj;
        }
        List<l2y> list = ((r2y) ((dx5) objA).a()).f29761a;
        if (list == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (l2y l2yVar : list) {
            l2yVar.getClass();
            n3w n3wVar = n3w.Q1;
            String str = l2yVar.c;
            if (str == null) {
                jf4.k(null);
                return null;
            }
            bj5 bj5Var = s77.b;
            String str2 = l2yVar.h;
            String str3 = str2 == null ? "" : str2;
            Long l = l2yVar.b;
            long jLongValue = l != null ? l.longValue() : 0L;
            qud qudVar = e4f.f7178a;
            Integer num = l2yVar.i;
            int iIntValue = num != null ? num.intValue() : 0;
            qudVar.getClass();
            e4f e4fVarE = qud.e(iIntValue);
            Double d = l2yVar.f;
            double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
            Double d2 = l2yVar.g;
            double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
            Integer num2 = l2yVar.e;
            q4f q4fVar = (num2 != null ? num2.intValue() : 0) == 8 ? q4f.y : q4f.b;
            String str4 = l2yVar.l;
            String str5 = str4 == null ? "" : str4;
            pxu pxuVar = l2yVar.m;
            arrayList.add(n3w.d(n3wVar, str, 0.0d, null, str3, jLongValue, e4fVarE, dDoubleValue, dDoubleValue2, str5, null, q4fVar, false, null, pxuVar != null ? dyb.n0(pxuVar) : hxu.h, null, -51432006, -1048579));
        }
        return arrayList;
    }
}
