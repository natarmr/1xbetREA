package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.feature.office.payment.impl.di.navigation.PaymentScreenFactoryImpl$getPaymentScreen$1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class oau0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24948a;
    public final /* synthetic */ abu0 b;

    public /* synthetic */ oau0(abu0 abu0Var, byte b) {
        this.f24948a = b;
        this.b = abu0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f24948a;
        abu0 abu0Var = this.b;
        switch (b) {
            case 0:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                r990 r990Var = abu0Var.k;
                efi efiVar = abu0Var.m.f36881a;
                r990Var.getClass();
                k0w0Var.k(new PaymentScreenFactoryImpl$getPaymentScreen$1(r990Var, true, 0L));
                break;
            case 1:
                ((Throwable) obj).getClass();
                abu0Var.z(abu0Var.C);
                break;
            default:
                ((Throwable) obj).getClass();
                abu0Var.z(abu0Var.C);
                break;
        }
        return Unit.f46060a;
    }
}
