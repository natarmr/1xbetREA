package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class kk20 extends bnn0 implements Function2 {
    public /* synthetic */ double i;
    public final /* synthetic */ double j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kk20(double d, yje yjeVar) {
        super(2, yjeVar);
        this.j = d;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        kk20 kk20Var = new kk20(this.j, yjeVar);
        kk20Var.i = ((Number) obj).doubleValue();
        return kk20Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((kk20) create(Double.valueOf(((Number) obj).doubleValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        double d = this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        return Boolean.valueOf(!(d == this.j));
    }
}
