package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.login.core.presentation.model.AuthDataErrorModel;
import org.xplatform.login.core.presentation.model.AuthDataModel;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ug4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35606a;
    public final /* synthetic */ fh4 b;
    public final /* synthetic */ AuthDataModel c;

    public /* synthetic */ ug4(fh4 fh4Var, AuthDataModel authDataModel, byte b) {
        this.f35606a = b;
        this.b = fh4Var;
        this.c = authDataModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f35606a;
        AuthDataModel authDataModel = this.c;
        fh4 fh4Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                fh4Var.P(new AuthDataErrorModel(th, authDataModel));
                break;
            default:
                th.getClass();
                if (th instanceof k6a) {
                    fh4Var.T();
                } else {
                    fh4Var.P(new AuthDataErrorModel(th, authDataModel));
                }
                break;
        }
        return Unit.f46060a;
    }
}
