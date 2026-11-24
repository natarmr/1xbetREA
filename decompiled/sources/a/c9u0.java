package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.verification.status.impl.navigation.VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class c9u0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3979a;
    public final /* synthetic */ i9u0 b;
    public final /* synthetic */ mbu0 c;

    public /* synthetic */ c9u0(i9u0 i9u0Var, mbu0 mbu0Var, byte b) {
        this.f3979a = b;
        this.b = i9u0Var;
        this.c = mbu0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f3979a;
        mbu0 mbu0Var = this.c;
        i9u0 i9u0Var = this.b;
        k0w0 k0w0Var = (k0w0) obj;
        switch (b) {
            case 0:
                k0w0Var.getClass();
                k0w0Var.k(new VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen(mbu0Var.f21524a, (r9u) ((es) i9u0Var.e.f14992a).k().f6568a));
                break;
            default:
                k0w0Var.getClass();
                k0w0Var.h(new VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen(mbu0Var.f21524a, (r9u) ((es) i9u0Var.e.f14992a).k().f6568a));
                break;
        }
        return Unit.f46060a;
    }
}
