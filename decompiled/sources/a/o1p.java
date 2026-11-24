package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class o1p extends bnn0 implements Function2 {
    public /* synthetic */ long i;
    public final /* synthetic */ long j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1p(long j, yje yjeVar) {
        super(2, yjeVar);
        this.j = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        o1p o1pVar = new o1p(this.j, yjeVar);
        o1pVar.i = ((Number) obj).longValue();
        return o1pVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((o1p) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        long j = this.i;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        return Boolean.valueOf(j > this.j);
    }
}
