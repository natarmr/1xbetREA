package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ro6 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ so6 j;
    public final /* synthetic */ ql5 k;
    public final /* synthetic */ String l;
    public final /* synthetic */ List m;
    public final /* synthetic */ jg7 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ long p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ double r;
    public final /* synthetic */ byte s;
    public final /* synthetic */ int t;
    public final /* synthetic */ byte u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public ro6(so6 so6Var, ql5 ql5Var, String str, List list, jg7 jg7Var, boolean z, long j, boolean z2, double d, int i, int i2, long j2, yje yjeVar) {
        super(2, yjeVar);
        this.j = so6Var;
        this.k = ql5Var;
        this.l = str;
        this.m = list;
        this.n = jg7Var;
        this.o = z;
        this.p = j;
        this.q = z2;
        this.r = d;
        this.s = i;
        this.t = i2;
        this.u = (int) j2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new ro6(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ro6) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        Double d;
        Double d2;
        Long l;
        so6 so6Var = this.j;
        knf0 knf0Var = so6Var.c;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            xr xrVar = so6Var.f32530a;
            String strA = so6Var.f.a();
            long j = this.k.f28916a;
            String strA2 = knf0Var.a();
            String strC = knf0Var.c();
            String strI0 = sj3.i0(this.l);
            knf0Var.getClass();
            knf0Var.getClass();
            List<d9a0> list = this.m;
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (d9a0 d9a0Var : list) {
                d9a0Var.getClass();
                arrayList.add(new j9a0(d9a0Var.f5691a, d9a0Var.d, String.valueOf(d9a0Var.f)));
            }
            jg7 jg7Var = this.n;
            yg20 yg20Var = new yg20(this.p, j, strA2, this.q, strI0, this.r, this.s, this.t, strC, this.u, arrayList, kotlin.collections.a.c(new iv6(String.valueOf(jg7Var.f16467a), String.valueOf(jg7Var.c), jg7Var.e)), this.o ? 1 : 2);
            this.i = true;
            objA = ((rn6) ((zo4) xrVar.b).invoke()).a(strA, yg20Var, this);
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
        bh20 bh20Var = (bh20) ((q16) objA).a();
        String str = bh20Var.f2584a;
        p1f p1fVar = bh20Var.c;
        if (str == null) {
            str = "";
        }
        long jLongValue = (p1fVar == null || (l = p1fVar.f26198a) == null) ? -1L : l.longValue();
        Double d3 = bh20Var.b;
        double dDoubleValue = 0.0d;
        double dDoubleValue2 = d3 != null ? d3.doubleValue() : 0.0d;
        String str2 = p1fVar != null ? p1fVar.b : null;
        String str3 = str2 != null ? str2 : "";
        double dDoubleValue3 = (p1fVar == null || (d2 = p1fVar.c) == null) ? 0.0d : d2.doubleValue();
        if (p1fVar != null && (d = p1fVar.d) != null) {
            dDoubleValue = d.doubleValue();
        }
        return new ch20(str, jLongValue, dDoubleValue2, str3, dDoubleValue3, dDoubleValue);
    }
}
