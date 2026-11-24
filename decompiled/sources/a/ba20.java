package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class ba20 extends bnn0 implements Function2 {
    public boolean i;
    public final /* synthetic */ dgu j;
    public final /* synthetic */ String k;
    public final /* synthetic */ List l;
    public final /* synthetic */ jg7 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ long o;
    public final /* synthetic */ double p;
    public final /* synthetic */ byte q;
    public final /* synthetic */ byte r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public ba20(dgu dguVar, String str, List list, jg7 jg7Var, long j, long j2, double d, int i, long j3, yje yjeVar) {
        super(2, yjeVar);
        this.j = dguVar;
        this.k = str;
        this.l = list;
        this.m = jg7Var;
        this.n = j;
        this.o = j2;
        this.p = d;
        this.q = i;
        this.r = (int) j3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new ba20(this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ba20) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object objA;
        dgu dguVar = this.j;
        knf0 knf0Var = (knf0) dguVar.b;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            dq00 dq00Var = (dq00) dguVar.f6058a;
            String strA = ((btt0) dguVar.c).a();
            String strA2 = knf0Var.a();
            String strC = knf0Var.c();
            String strI0 = sj3.i0(this.k);
            knf0Var.getClass();
            knf0Var.getClass();
            List<d9a0> list = this.l;
            ArrayList arrayList = new ArrayList(r3d.q(list, 10));
            for (d9a0 d9a0Var : list) {
                d9a0Var.getClass();
                arrayList.add(new j9a0(d9a0Var.f5691a, d9a0Var.d, String.valueOf(d9a0Var.f)));
            }
            jg7 jg7Var = this.m;
            fj30 fj30Var = new fj30(this.n, this.o, strA2, strI0, this.p, this.q, strC, this.r, arrayList, kotlin.collections.a.c(new iv6(String.valueOf(jg7Var.f16467a), String.valueOf(jg7Var.c), jg7Var.e)));
            this.i = true;
            objA = ((n520) ((rx00) dq00Var.c).invoke()).a(strA, fj30Var, this);
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
        return ((q16) objA).a();
    }
}
