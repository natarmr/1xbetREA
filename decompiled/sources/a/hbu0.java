package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.feature.office.payment.impl.di.navigation.PaymentScreenFactoryImpl$getPaymentScreen$1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hbu0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12789a;
    public final /* synthetic */ lbu0 b;

    public /* synthetic */ hbu0(lbu0 lbu0Var, byte b) {
        this.f12789a = b;
        this.b = lbu0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        byte b = this.f12789a;
        lbu0 lbu0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                lbu0Var.v();
                p7m0 p7m0Var = lbu0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    lbu0Var.f.getClass();
                } while (!p7m0Var.m(value, ebu0.a((ebu0) value, null, x9u0.c, 59)));
                break;
            case 1:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                r990 r990Var = lbu0Var.v;
                efi efiVar = lbu0Var.x.f36881a;
                r990Var.getClass();
                k0w0Var.k(new PaymentScreenFactoryImpl$getPaymentScreen$1(r990Var, true, 0L));
                break;
            default:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                lbu0Var.v();
                p7m0 p7m0Var2 = lbu0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    lbu0Var.f.getClass();
                } while (!p7m0Var2.m(value2, ebu0.a((ebu0) value2, null, x9u0.c, 59)));
                break;
        }
        return Unit.f46060a;
    }
}
