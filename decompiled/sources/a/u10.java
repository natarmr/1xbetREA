package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.verification.nomapay.impl.navigation.NomaPayWebScreens$NomaPayFragmentScreen;
import org.xplatform.verification.options.impl.navigation.VerificationOptionsScreens$VerificationOptionsFragmentScreen;
import org.xplatform.verification.sum_sub.impl.navigation.SumSubScreens$SumSubIframeFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class u10 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34880a;
    public final /* synthetic */ f20 b;

    public /* synthetic */ u10(f20 f20Var, byte b) {
        this.f34880a = b;
        this.b = f20Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        m7h0 verificationOptionsScreens$VerificationOptionsFragmentScreen;
        byte b = this.f34880a;
        f20 f20Var = this.b;
        switch (b) {
            case 0:
                ((Throwable) obj).getClass();
                f20Var.y(f20Var.D);
                break;
            case 1:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                svs0 svs0Var = mbu0.b;
                int i = f20Var.b;
                svs0Var.getClass();
                int iOrdinal = svs0.a(i).ordinal();
                if (iOrdinal == 1) {
                    l9u0 l9u0Var = f20Var.h;
                    svs0 svs0Var2 = mbu0.b;
                    verificationOptionsScreens$VerificationOptionsFragmentScreen = new VerificationOptionsScreens$VerificationOptionsFragmentScreen(-1, l9u0Var.f19674a);
                } else if (iOrdinal == 3) {
                    f20Var.m.getClass();
                    verificationOptionsScreens$VerificationOptionsFragmentScreen = new NomaPayWebScreens$NomaPayFragmentScreen();
                } else if (iOrdinal == 4) {
                    verificationOptionsScreens$VerificationOptionsFragmentScreen = ((clc) f20Var.n.f40584a.b).d().a();
                } else if (iOrdinal == 5) {
                    f20Var.l.getClass();
                    verificationOptionsScreens$VerificationOptionsFragmentScreen = new SumSubScreens$SumSubIframeFragmentScreen();
                } else if (iOrdinal != 6) {
                    verificationOptionsScreens$VerificationOptionsFragmentScreen = iOrdinal != 7 ? f20Var.i.a() : ((clc) f20Var.k.f16139a.b).d().a();
                } else {
                    verificationOptionsScreens$VerificationOptionsFragmentScreen = ((clc) ((bbw0) f20Var.j.f20148a).b).d().a();
                }
                k0w0Var.k(verificationOptionsScreens$VerificationOptionsFragmentScreen);
                break;
            default:
                ((Throwable) obj).getClass();
                f20Var.y(f20Var.D);
                break;
        }
        return Unit.f46060a;
    }
}
