package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class mvh0 extends bnn0 implements Function1 {
    public boolean i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ pvh0 l;
    public final /* synthetic */ oms0 m;
    public final /* synthetic */ float n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mvh0(Object obj, Object obj2, pvh0 pvh0Var, oms0 oms0Var, float f, yje yjeVar) {
        super(1, yjeVar);
        this.j = obj;
        this.k = obj2;
        this.l = pvh0Var;
        this.m = oms0Var;
        this.n = f;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new mvh0(this.j, this.k, this.l, this.m, this.n, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((mvh0) create((yje) obj)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        boolean z = this.i;
        if (!z) {
            z1x.P(obj);
            hnr hnrVar = new hnr(this.j, this.k, this.l, this.m, this.n, (yje) null);
            this.i = true;
            if (d5c.J(this, hnrVar) == wneVar) {
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
