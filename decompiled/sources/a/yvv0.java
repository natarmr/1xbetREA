package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class yvv0 extends bnn0 implements Function1 {
    public boolean i;
    public final /* synthetic */ glt0 j;
    public final /* synthetic */ float k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yvv0(glt0 glt0Var, float f, yje yjeVar) {
        super(1, yjeVar);
        this.j = glt0Var;
        this.k = f;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new yvv0(this.j, this.k, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((yvv0) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (z) {
            if (z) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        t33 t33Var = (t33) this.j.c;
        Float f = new Float(this.k);
        nul0 nul0Var = vwv0.f38173a;
        this.i = true;
        Object objA = t33.a(t33Var, f, nul0Var, null, null, this, 12);
        return objA == wneVar ? wneVar : objA;
    }
}
