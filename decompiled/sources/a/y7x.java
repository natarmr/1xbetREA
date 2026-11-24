package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class y7x extends bnn0 implements Function2 {
    public /* synthetic */ float i;

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        y7x y7xVar = new y7x(2, yjeVar);
        y7xVar.i = ((Number) obj).floatValue();
        return y7xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((y7x) create(Float.valueOf(((Number) obj).floatValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        return Boolean.valueOf(this.i > 0.0f);
    }
}
