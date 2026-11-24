package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23017a;
    public final /* synthetic */ pu90 b;
    public final /* synthetic */ int c;

    public /* synthetic */ n7(pu90 pu90Var, int i, byte b) {
        this.f23017a = b;
        this.b = pu90Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f23017a;
        int i = this.c;
        pu90 pu90Var = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.g(pu90Var, 0, -i, 0.0f);
                break;
            case 1:
                ou90Var.g(pu90Var, -i, 0, 0.0f);
                break;
            case 2:
                ou90Var.getClass();
                ou90Var.m(pu90Var, 0, i, 0.0f);
                break;
            case 3:
                ou90Var.getClass();
                ou90Var.m(pu90Var, -i, 0, 0.0f);
                break;
            case 4:
                ou90Var.getClass();
                ou90Var.m(pu90Var, 0, -i, 0.0f);
                break;
            case 5:
                ou90Var.getClass();
                ou90Var.m(pu90Var, 0, -i, 0.0f);
                break;
            case 6:
                ou90Var.getClass();
                ou90Var.m(pu90Var, 0, (i - pu90Var.b) / 2, 0.0f);
                break;
            case 7:
                ou90Var.getClass();
                ou90Var.g(pu90Var, 0, i - pu90Var.b, 0.0f);
                break;
            case 8:
                ou90Var.getClass();
                ou90Var.g(pu90Var, 0, -i, 0.0f);
                break;
            case 9:
                ou90Var.getClass();
                ou90Var.g(pu90Var, 0, -i, 0.0f);
                break;
            case 10:
                ou90Var.getClass();
                ou90Var.m(pu90Var, (pu90Var.f27604a / 2) - i, (pu90Var.b / 2) - i, 0.0f);
                break;
            case 11:
                ou90Var.getClass();
                ou90Var.m(pu90Var, 0, (i - pu90Var.b) / 2, 0.0f);
                break;
            case 12:
                ou90Var.getClass();
                ou90Var.m(pu90Var, (pu90Var.f27604a / 2) - i, (pu90Var.b / 2) - i, 0.0f);
                break;
            case 13:
                ou90Var.getClass();
                ou90Var.m(pu90Var, i, 0, 0.0f);
                break;
            case 14:
                ou90Var.getClass();
                ou90Var.m(pu90Var, 0, (i - pu90Var.b) / 2, 0.0f);
                break;
            case 15:
                ou90Var.getClass();
                ou90Var.g(pu90Var, 0, i, 0.0f);
                break;
            case 16:
                ou90Var.getClass();
                ou90Var.g(pu90Var, 0, -i, 0.0f);
                break;
            case 17:
                ou90Var.getClass();
                ou90Var.m(pu90Var, 0, (i - pu90Var.b) / 2, 0.0f);
                break;
            default:
                ou90Var.getClass();
                ou90Var.m(pu90Var, 0, -i, 0.0f);
                break;
        }
        return Unit.f46060a;
    }
}
