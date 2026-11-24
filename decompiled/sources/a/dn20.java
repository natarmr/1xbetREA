package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class dn20 extends bnn0 implements Function1 {
    public boolean i;
    public final /* synthetic */ on20 j;
    public final /* synthetic */ q4f k;
    public final /* synthetic */ double l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn20(on20 on20Var, q4f q4fVar, double d, yje yjeVar) {
        super(1, yjeVar);
        this.j = on20Var;
        this.k = q4fVar;
        this.l = d;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new dn20(this.j, this.k, this.l, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((dn20) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            Double d = new Double(this.l);
            this.i = true;
            int i = on20.m1;
            if (this.j.T0(this.k, d, this) == wneVar) {
                return wneVar;
            }
        } else {
            if (!z) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
