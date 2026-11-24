package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.security.api.presentation.models.ConfirmationNewPlaceResultType;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class aj4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f956a;
    public final /* synthetic */ cj4 b;

    public /* synthetic */ aj4(cj4 cj4Var, byte b) {
        this.f956a = b;
        this.b = cj4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f956a;
        cj4 cj4Var = this.b;
        switch (b) {
            case 0:
                iqt0 iqt0Var = (iqt0) obj;
                gfk0 gfk0Var = cj4.U1;
                iqt0Var.getClass();
                cj4Var.G0().x(new zh4(iqt0Var));
                break;
            case 1:
                x5q0 x5q0Var = (x5q0) obj;
                gfk0 gfk0Var2 = cj4.U1;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    k3t0 k3t0VarG0 = cj4Var.G0();
                    String str = ((w5q0) x5q0Var).f38596a;
                    str.getClass();
                    k3t0VarG0.x(new ji4(str));
                }
                break;
            case 2:
                x5q0 x5q0Var2 = (x5q0) obj;
                gfk0 gfk0Var3 = cj4.U1;
                x5q0Var2.getClass();
                if (x5q0Var2 instanceof w5q0) {
                    k3t0 k3t0VarG1 = cj4Var.G0();
                    String str2 = ((w5q0) x5q0Var2).f38596a;
                    str2.getClass();
                    k3t0VarG1.x(new ii4(str2));
                }
                break;
            case 3:
                String str3 = (String) obj;
                gfk0 gfk0Var4 = cj4.U1;
                str3.getClass();
                cj4Var.G0().x(new ki4(str3));
                break;
            case 4:
                ConfirmationNewPlaceResultType confirmationNewPlaceResultType = (ConfirmationNewPlaceResultType) obj;
                gfk0 gfk0Var5 = cj4.U1;
                confirmationNewPlaceResultType.getClass();
                cj4Var.G0().x(new bi4(confirmationNewPlaceResultType));
                break;
            default:
                gfk0 gfk0Var6 = cj4.U1;
                cj4Var.G0().x(new hi4((ghk0) obj));
                break;
        }
        return Unit.f46060a;
    }
}
