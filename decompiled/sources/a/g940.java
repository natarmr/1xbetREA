package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.feature.office.payment.impl.di.navigation.PaymentScreenFactoryImpl$getPaymentScreen$1;
import org.xplatform.support.api.navigation.SupportMenuScreenParams;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g940 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10894a;
    public final /* synthetic */ m940 b;
    public final /* synthetic */ long c;

    public /* synthetic */ g940(m940 m940Var, long j, byte b) {
        this.f10894a = b;
        this.b = m940Var;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f10894a;
        long j = this.c;
        m940 m940Var = this.b;
        k0w0 k0w0Var = (k0w0) obj;
        switch (b) {
            case 0:
                k0w0Var.getClass();
                s9m0 s9m0Var = m940Var.O;
                SupportMenuScreenParams supportMenuScreenParams = new SupportMenuScreenParams(true, pjn0.d, new SupportMenuScreenParams.AdditionalParams.CallbackParams(j));
                s9m0Var.getClass();
                k0w0Var.h(s9m0.f(supportMenuScreenParams));
                break;
            default:
                r990 r990Var = m940Var.L;
                efi efiVar = m940Var.M.f36881a;
                r990Var.getClass();
                k0w0Var.h(new PaymentScreenFactoryImpl$getPaymentScreen$1(r990Var, true, j));
                break;
        }
        return Unit.f46060a;
    }
}
