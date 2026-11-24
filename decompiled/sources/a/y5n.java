package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class y5n extends bnn0 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ float j;
    public final /* synthetic */ float k;
    public final /* synthetic */ rah0 l;
    public final /* synthetic */ float m;
    public final /* synthetic */ vne n;
    public final /* synthetic */ t33 o;
    public final /* synthetic */ t33 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5n(float f, float f2, rah0 rah0Var, float f3, vne vneVar, t33 t33Var, t33 t33Var2, yje yjeVar) {
        super(2, yjeVar);
        this.j = f;
        this.k = f2;
        this.l = rah0Var;
        this.m = f3;
        this.n = vneVar;
        this.o = t33Var;
        this.p = t33Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        y5n y5nVar = new y5n(this.j, this.k, this.l, this.m, this.n, this.o, this.p, yjeVar);
        y5nVar.i = obj;
        return y5nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y5n) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        vne vneVar = (vne) this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        float f = this.k;
        float f2 = this.j;
        rah0 rah0Var = this.l;
        qjj.W(this.n, null, null, new pt8(rah0Var, l1e0.d((int) ((((f / 2.0f) + f2) - (rah0Var.b.l() / 2.0f)) + this.m), 0, rah0Var.f.l()), null, (byte) 1), 3);
        qjj.W(vneVar, null, null, new ly7(this.o, f2, null, (byte) 2), 3);
        qjj.W(vneVar, null, null, new ly7(this.p, f, null, (byte) 3), 3);
        return Unit.f46060a;
    }
}
