package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class v5f0 extends bnn0 implements Function2 {
    public final /* synthetic */ x5f0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5f0(x5f0 x5f0Var, yje yjeVar) {
        super(2, yjeVar);
        this.i = x5f0Var;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        return new v5f0(this.i, yjeVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((v5f0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        int i = x5f0.z0;
        x5f0 x5f0Var = this.i;
        x5f0Var.i0();
        i1w0 i1w0Var = x5f0Var.b0;
        i1w0Var.f("PICKER_DIALOG_PHONE_CODE_BY_MANUALLY_KEY", new z4f0(x5f0Var, (byte) 0));
        i1w0Var.d(new y4f0(x5f0Var, (byte) 10));
        return Unit.f46060a;
    }
}
