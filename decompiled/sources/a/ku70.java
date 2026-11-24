package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ku70 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18899a;
    public final /* synthetic */ bv70 b;

    public /* synthetic */ ku70(bv70 bv70Var, byte b) {
        this.f18899a = b;
        this.b = bv70Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f18899a;
        bv70 bv70Var = this.b;
        switch (b) {
            case 0:
                ((Throwable) obj).getClass();
                bv70Var.R();
                break;
            default:
                ((Throwable) obj).getClass();
                bv70Var.G(xt70.f41451a);
                p7m0 p7m0Var = bv70Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    bv70Var.f.getClass();
                } while (!p7m0Var.m(value, hu70.a((hu70) value, 0, 0, false, false, false, false, false, false, false, false, null, false, false, true, "English", false, iun.f15405a, null, false, 1908719)));
                break;
        }
        return Unit.f46060a;
    }
}
