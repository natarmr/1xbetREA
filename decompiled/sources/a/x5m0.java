package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class x5m0 extends bnn0 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ t33 j;
    public final /* synthetic */ zsf k;
    public final /* synthetic */ t33 l;
    public final /* synthetic */ float m;
    public final /* synthetic */ t33 n;
    public final /* synthetic */ float o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5m0(t33 t33Var, zsf zsfVar, t33 t33Var2, float f, t33 t33Var3, float f2, yje yjeVar) {
        super(2, yjeVar);
        this.j = t33Var;
        this.k = zsfVar;
        this.l = t33Var2;
        this.m = f;
        this.n = t33Var3;
        this.o = f2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        x5m0 x5m0Var = new x5m0(this.j, this.k, this.l, this.m, this.n, this.o, yjeVar);
        x5m0Var.i = obj;
        return x5m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((x5m0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        vne vneVar = (vne) this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        qjj.W(vneVar, null, null, new w5m0(this.j, this.k, this.l, this.m, this.n, this.o, null), 3);
        return Unit.f46060a;
    }
}
