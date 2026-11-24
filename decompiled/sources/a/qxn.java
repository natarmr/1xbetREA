package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final class qxn extends bnn0 implements Function2 {
    public /* synthetic */ Object i;
    public final /* synthetic */ t33 j;
    public final /* synthetic */ long k;
    public final /* synthetic */ zsf l;
    public final /* synthetic */ t33 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxn(t33 t33Var, long j, zsf zsfVar, t33 t33Var2, yje yjeVar) {
        super(2, yjeVar);
        this.j = t33Var;
        this.k = j;
        this.l = zsfVar;
        this.m = t33Var2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        qxn qxnVar = new qxn(this.j, this.k, this.l, this.m, yjeVar);
        qxnVar.i = obj;
        return qxnVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((qxn) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        vne vneVar = (vne) this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        t33 t33Var = this.j;
        long j = this.k;
        zsf zsfVar = this.l;
        qjj.W(vneVar, null, null, new oxn(t33Var, j, zsfVar, null, (byte) 0), 3);
        qjj.W(vneVar, null, null, new pxn(this.m, zsfVar, null, (byte) 0), 3);
        return Unit.f46060a;
    }
}
