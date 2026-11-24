package a;

import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class c4v extends bnn0 implements Function2 {
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4v(long j, yje yjeVar) {
        super(2, yjeVar);
        this.i = j;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new c4v(this.i, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((c4v) create(Long.valueOf(((Number) obj).longValue()), (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        return new Long((this.i * 1000) - new Date().getTime());
    }
}
