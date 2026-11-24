package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.onboarding.impl.navigation.OnBoardingScreens$TipsDialogScreen;
import org.xplatform.rules.impl.navigation.PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r240 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29712a;
    public final /* synthetic */ j340 b;
    public final /* synthetic */ String c;

    public /* synthetic */ r240(j340 j340Var, String str, byte b) {
        this.f29712a = b;
        this.b = j340Var;
        this.c = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f29712a;
        String str = this.c;
        j340 j340Var = this.b;
        k0w0 k0w0Var = (k0w0) obj;
        switch (b) {
            case 0:
                k0w0Var.getClass();
                j340Var.K0.getClass();
                k0w0Var.h(new PaymentInfoScreenFactoryImpl$getInfoWebFragmentScreen$1(str));
                break;
            default:
                k0w0Var.getClass();
                roq0 roq0Var = j340Var.W0;
                uuz uuzVar = fk60.b;
                roq0Var.getClass();
                k0w0Var.h(new OnBoardingScreens$TipsDialogScreen(14, str));
                break;
        }
        return Unit.f46060a;
    }
}
