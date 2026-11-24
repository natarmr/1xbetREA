package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.security.api.presentation.models.ConfirmationNewPlaceResultType;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class pwi0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27713a;
    public final /* synthetic */ swi0 b;

    public /* synthetic */ pwi0(swi0 swi0Var, byte b) {
        this.f27713a = b;
        this.b = swi0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f27713a;
        swi0 swi0Var = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                gne0 gne0Var = swi0.X1;
                str.getClass();
                swi0Var.H0().x(new ayi0(str));
                break;
            case 1:
                iqt0 iqt0Var = (iqt0) obj;
                gne0 gne0Var2 = swi0.X1;
                iqt0Var.getClass();
                swi0Var.H0().x(new jyi0(iqt0Var));
                break;
            default:
                ConfirmationNewPlaceResultType confirmationNewPlaceResultType = (ConfirmationNewPlaceResultType) obj;
                gne0 gne0Var3 = swi0.X1;
                confirmationNewPlaceResultType.getClass();
                swi0Var.H0().x(new cyi0(confirmationNewPlaceResultType));
                break;
        }
        return Unit.f46060a;
    }
}
