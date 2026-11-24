package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class vgt0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37398a;
    public final /* synthetic */ xgt0 b;

    public /* synthetic */ vgt0(xgt0 xgt0Var, byte b) {
        this.f37398a = b;
        this.b = xgt0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        iun iunVar;
        byte b = this.f37398a;
        xgt0 xgt0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                oyg0 oyg0Var = xgt0Var.f;
                ocj ocjVar = xgt0Var.i;
                if (th instanceof ff5) {
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                        oyg0Var.getClass();
                        iunVar = iun.f15405a;
                        iunVar.getClass();
                    } while (!p7m0Var.m(value2, new sgt0(iunVar, false, false)));
                } else {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                        oyg0Var.getClass();
                    } while (!p7m0Var2.m(value, sgt0.a((sgt0) value, false, true)));
                }
                break;
            default:
                th.getClass();
                xgt0Var.r.b(th, new ggt0(xgt0Var, (byte) 1));
                break;
        }
        return Unit.f46060a;
    }
}
