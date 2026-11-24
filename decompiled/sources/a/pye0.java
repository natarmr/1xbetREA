package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class pye0 extends bnn0 implements Function2 {
    public final /* synthetic */ eze0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pye0(eze0 eze0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = eze0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new pye0(this.i, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((pye0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        int i = eze0.y0;
        eze0 eze0Var = this.i;
        eze0Var.m0();
        eze0Var.c0.d(new eye0(eze0Var, (byte) 8));
        return Unit.f46060a;
    }
}
