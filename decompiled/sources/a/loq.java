package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class loq extends bnn0 implements Function2 {
    public /* synthetic */ int i;

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        loq loqVar = new loq(2, yjeVar);
        loqVar.i = ((Number) obj).intValue();
        return loqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((loq) create(Integer.valueOf(((Number) obj).intValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        int i = this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        return Boolean.valueOf(i > 0);
    }
}
