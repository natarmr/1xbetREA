package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class g5k0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10724a;
    public final /* synthetic */ k5k0 b;

    public /* synthetic */ g5k0(k5k0 k5k0Var, byte b) {
        this.f10724a = b;
        this.b = k5k0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f10724a;
        k5k0 k5k0Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                cge0 cge0Var = k5k0Var.x;
                esp0 esp0Var = ((b5k0) k5k0Var.D()).d;
                String str = esp0Var != null ? esp0Var.e : null;
                if (str == null) {
                    str = "";
                }
                long j = k5k0Var.D;
                cge0Var.getClass();
                k0w0Var.h(cge0.g(str, j, true));
                break;
            default:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var = k5k0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    k5k0Var.f.getClass();
                } while (!p7m0Var.m(value, b5k0.a((b5k0) value, null, null, null, false, true, false, 15)));
                break;
        }
        return Unit.f46060a;
    }
}
