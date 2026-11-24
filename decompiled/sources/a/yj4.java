package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.login.core.presentation.model.AuthDataErrorModel;
import org.xplatform.login.core.presentation.model.AuthDataModel;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class yj4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42724a;
    public final /* synthetic */ hk4 b;
    public final /* synthetic */ AuthDataModel c;

    public /* synthetic */ yj4(hk4 hk4Var, AuthDataModel authDataModel, byte b) {
        this.f42724a = b;
        this.b = hk4Var;
        this.c = authDataModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f42724a;
        AuthDataModel authDataModel = this.c;
        hk4 hk4Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                hk4Var.P(new AuthDataErrorModel(th, authDataModel));
                break;
            default:
                th.getClass();
                if (th instanceof k6a) {
                    hk4Var.R();
                } else {
                    hk4Var.P(new AuthDataErrorModel(th, authDataModel));
                }
                break;
        }
        return Unit.f46060a;
    }
}
