package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.verification.nomapay.impl.navigation.NomaPayWebScreens$NomaPayFragmentScreen;
import org.xplatform.verification.options.impl.navigation.VerificationOptionsScreens$VerificationOptionsFragmentScreen;
import org.xplatform.verification.sum_sub.impl.navigation.SumSubScreens$SumSubIframeFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m20 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21032a;
    public final /* synthetic */ s20 b;

    public /* synthetic */ m20(s20 s20Var, byte b) {
        this.f21032a = b;
        this.b = s20Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        m7h0 verificationOptionsScreens$VerificationOptionsFragmentScreen;
        byte b = this.f21032a;
        s20 s20Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                th.printStackTrace();
                s20Var.v();
                p7m0 p7m0Var = s20Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    s20Var.f.getClass();
                } while (!p7m0Var.m(value, k20.a((k20) value, null, e10.c, 59)));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                th2.printStackTrace();
                s20Var.v();
                p7m0 p7m0Var2 = s20Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    s20Var.f.getClass();
                } while (!p7m0Var2.m(value2, k20.a((k20) value2, null, e10.c, 59)));
                break;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                svs0 svs0Var = mbu0.b;
                int i = s20Var.o;
                svs0Var.getClass();
                int iOrdinal = svs0.a(i).ordinal();
                if (iOrdinal == 1) {
                    l9u0 l9u0Var = s20Var.s;
                    svs0 svs0Var2 = mbu0.b;
                    verificationOptionsScreens$VerificationOptionsFragmentScreen = new VerificationOptionsScreens$VerificationOptionsFragmentScreen(-1, l9u0Var.f19674a);
                } else if (iOrdinal == 3) {
                    s20Var.x.getClass();
                    verificationOptionsScreens$VerificationOptionsFragmentScreen = new NomaPayWebScreens$NomaPayFragmentScreen();
                } else if (iOrdinal == 4) {
                    verificationOptionsScreens$VerificationOptionsFragmentScreen = ((clc) s20Var.y.f40584a.b).d().a();
                } else if (iOrdinal == 5) {
                    s20Var.w.getClass();
                    verificationOptionsScreens$VerificationOptionsFragmentScreen = new SumSubScreens$SumSubIframeFragmentScreen();
                } else if (iOrdinal != 6) {
                    verificationOptionsScreens$VerificationOptionsFragmentScreen = iOrdinal != 7 ? s20Var.t.a() : ((clc) s20Var.v.f16139a.b).d().a();
                } else {
                    verificationOptionsScreens$VerificationOptionsFragmentScreen = ((clc) ((bbw0) s20Var.u.f20148a).b).d().a();
                }
                k0w0Var.k(verificationOptionsScreens$VerificationOptionsFragmentScreen);
                break;
        }
        return Unit.f46060a;
    }
}
