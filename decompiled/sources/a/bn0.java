package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class bn0 extends bnn0 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ dn0 j;
    public final /* synthetic */ long k;
    public final /* synthetic */ int l;
    public final /* synthetic */ lu0 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bn0(dn0 dn0Var, long j, int i, lu0 lu0Var, yje yjeVar) {
        super(2, yjeVar);
        this.j = dn0Var;
        this.k = j;
        this.l = i;
        this.m = lu0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        bn0 bn0Var = new bn0(this.j, this.k, this.l, this.m, yjeVar);
        bn0Var.i = obj;
        return bn0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((bn0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        vne vneVar = (vne) this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        lu0 lu0Var = this.m;
        dn0 dn0Var = this.j;
        c4m0 c4m0VarW = qjj.W(vneVar, null, null, new an0(dn0Var, this.k, this.l, lu0Var, null), 3);
        c4m0VarW.invokeOnCompletion(new fm0(dn0Var, (byte) 1));
        return c4m0VarW;
    }
}
