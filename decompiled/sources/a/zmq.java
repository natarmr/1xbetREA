package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class zmq extends bnn0 implements Function1 {
    public final /* synthetic */ long i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zmq(long j, yje yjeVar) {
        super(1, yjeVar);
        this.i = j;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        return new zmq(this.i, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((zmq) create((yje) obj)).invokeSuspend(Unit.f46060a);
        throw null;
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        throw new gmq0("Timed out waiting for " + ((Object) wen.m(this.i)), null);
    }
}
