package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.security.api.presentation.models.ConfirmationNewPlaceResultType;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lfj0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19960a;
    public final /* synthetic */ ofj0 b;

    public /* synthetic */ lfj0(ofj0 ofj0Var, byte b) {
        this.f19960a = b;
        this.b = ofj0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f19960a;
        ofj0 ofj0Var = this.b;
        switch (b) {
            case 0:
                iqt0 iqt0Var = (iqt0) obj;
                cge0 cge0Var = ofj0.X1;
                iqt0Var.getClass();
                ofj0Var.H0().x(new jyi0(iqt0Var));
                break;
            case 1:
                String str = (String) obj;
                cge0 cge0Var2 = ofj0.X1;
                str.getClass();
                ofj0Var.H0().x(new ayi0(str));
                break;
            default:
                ConfirmationNewPlaceResultType confirmationNewPlaceResultType = (ConfirmationNewPlaceResultType) obj;
                cge0 cge0Var3 = ofj0.X1;
                confirmationNewPlaceResultType.getClass();
                ofj0Var.H0().x(new cyi0(confirmationNewPlaceResultType));
                break;
        }
        return Unit.f46060a;
    }
}
