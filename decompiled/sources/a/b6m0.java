package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class b6m0 extends bnn0 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ t33 j;
    public final /* synthetic */ zsf k;
    public final /* synthetic */ t33 l;
    public final /* synthetic */ t33 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ t33 o;
    public final /* synthetic */ float p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b6m0(t33 t33Var, zsf zsfVar, t33 t33Var2, t33 t33Var3, long j, t33 t33Var4, float f, yje yjeVar) {
        super(2, yjeVar);
        this.j = t33Var;
        this.k = zsfVar;
        this.l = t33Var2;
        this.m = t33Var3;
        this.n = j;
        this.o = t33Var4;
        this.p = f;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        b6m0 b6m0Var = new b6m0(this.j, this.k, this.l, this.m, this.n, this.o, this.p, yjeVar);
        b6m0Var.i = obj;
        return b6m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((b6m0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        vne vneVar = (vne) this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        t33 t33Var = this.j;
        zsf zsfVar = this.k;
        qjj.W(vneVar, null, null, new pxn(t33Var, zsfVar, null, (byte) 3), 3);
        qjj.W(vneVar, null, null, new pxn(this.l, zsfVar, null, (byte) 4), 3);
        qjj.W(vneVar, null, null, new oxn(this.m, this.n, zsfVar, null, (byte) 3), 3);
        qjj.W(vneVar, null, null, new v5m0(this.o, this.p, zsfVar, null, (byte) 2), 3);
        return Unit.f46060a;
    }
}
