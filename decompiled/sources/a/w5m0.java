package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class w5m0 extends bnn0 implements Function2 {
    public boolean i;
    public /* synthetic */ Object j;
    public final /* synthetic */ t33 k;
    public final /* synthetic */ zsf l;
    public final /* synthetic */ t33 m;
    public final /* synthetic */ float n;
    public final /* synthetic */ t33 o;
    public final /* synthetic */ float p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w5m0(t33 t33Var, zsf zsfVar, t33 t33Var2, float f, t33 t33Var3, float f2, yje yjeVar) {
        super(2, yjeVar);
        this.k = t33Var;
        this.l = zsfVar;
        this.m = t33Var2;
        this.n = f;
        this.o = t33Var3;
        this.p = f2;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        w5m0 w5m0Var = new w5m0(this.k, this.l, this.m, this.n, this.o, this.p, yjeVar);
        w5m0Var.j = obj;
        return w5m0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((w5m0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        vne vneVar = (vne) this.j;
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            this.j = vneVar;
            this.i = true;
            if (qcc.O(3000L, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        t33 t33Var = this.k;
        zsf zsfVar = this.l;
        qjj.W(vneVar, null, null, new pxn(t33Var, zsfVar, null, (byte) 1), 3);
        qjj.W(vneVar, null, null, new v5m0(this.m, this.n, zsfVar, null, (byte) 0), 3);
        qjj.W(vneVar, null, null, new v5m0(this.o, this.p, zsfVar, null, (byte) 1), 3);
        return Unit.f46060a;
    }
}
