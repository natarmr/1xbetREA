package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class ny7 extends bnn0 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ t33 j;
    public final /* synthetic */ float k;
    public final /* synthetic */ t33 l;
    public final /* synthetic */ t33 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ny7(t33 t33Var, float f, t33 t33Var2, t33 t33Var3, yje yjeVar) {
        super(2, yjeVar);
        this.j = t33Var;
        this.k = f;
        this.l = t33Var2;
        this.m = t33Var3;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        ny7 ny7Var = new ny7(this.j, this.k, this.l, this.m, yjeVar);
        ny7Var.i = obj;
        return ny7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ny7) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        vne vneVar = (vne) this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        yje yjeVar = null;
        byte b = 0;
        qjj.W(vneVar, null, null, new ly7(this.j, this.k, yjeVar, b), 3);
        qjj.W(vneVar, null, null, new my7(this.l, yjeVar, b), 3);
        return qjj.W(vneVar, null, null, new my7(this.m, yjeVar, (byte) 1), 3);
    }
}
