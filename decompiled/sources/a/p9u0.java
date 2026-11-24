package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.verification.status.impl.navigation.VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class p9u0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26626a;
    public final /* synthetic */ q9u0 b;
    public final /* synthetic */ mbu0 c;

    public /* synthetic */ p9u0(q9u0 q9u0Var, mbu0 mbu0Var, byte b) {
        this.f26626a = b;
        this.b = q9u0Var;
        this.c = mbu0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f26626a;
        mbu0 mbu0Var = this.c;
        q9u0 q9u0Var = this.b;
        k0w0 k0w0Var = (k0w0) obj;
        switch (b) {
            case 0:
                k0w0Var.getClass();
                k0w0Var.k(new VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen(mbu0Var.f21524a, (r9u) ((es) q9u0Var.r.f14992a).k().f6568a));
                break;
            default:
                k0w0Var.getClass();
                k0w0Var.h(new VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen(mbu0Var.f21524a, (r9u) ((es) q9u0Var.r.f14992a).k().f6568a));
                break;
        }
        return Unit.f46060a;
    }
}
