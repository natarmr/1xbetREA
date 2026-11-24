package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.login.core.presentation.model.AuthDataErrorModel;
import org.xplatform.login.core.presentation.model.AuthDataModel;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class tb4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33644a;
    public final /* synthetic */ kc4 b;
    public final /* synthetic */ AuthDataModel c;

    public /* synthetic */ tb4(kc4 kc4Var, AuthDataModel authDataModel, byte b) {
        this.f33644a = b;
        this.b = kc4Var;
        this.c = authDataModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f33644a;
        AuthDataModel authDataModel = this.c;
        kc4 kc4Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                if (th instanceof k6a) {
                    kc4Var.R();
                } else {
                    kc4Var.O(new AuthDataErrorModel(th, authDataModel));
                }
                break;
            default:
                th.getClass();
                kc4Var.O(new AuthDataErrorModel(th, authDataModel));
                break;
        }
        return Unit.f46060a;
    }
}
