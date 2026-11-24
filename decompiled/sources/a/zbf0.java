package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class zbf0 extends bnn0 implements Function2 {
    public final /* synthetic */ ocf0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbf0(ocf0 ocf0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = ocf0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new zbf0(this.i, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((zbf0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        int i = ocf0.z0;
        ocf0 ocf0Var = this.i;
        ocf0Var.k0();
        ocf0Var.b0.d(new pbf0(ocf0Var, (byte) 7));
        return Unit.f46060a;
    }
}
