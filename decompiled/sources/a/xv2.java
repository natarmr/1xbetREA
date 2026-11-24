package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xv2 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41536a;
    public final /* synthetic */ pu90 b;
    public final /* synthetic */ pu90 c;

    public /* synthetic */ xv2(pu90 pu90Var, pu90 pu90Var2, byte b) {
        this.f41536a = b;
        this.b = pu90Var;
        this.c = pu90Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f41536a;
        pu90 pu90Var = this.c;
        pu90 pu90Var2 = this.b;
        ou90 ou90Var = (ou90) obj;
        switch (b) {
            case 0:
                ou90Var.getClass();
                ou90Var.g(pu90Var2, 0, 0, 0.0f);
                ou90Var.g(pu90Var, 0, 0, 0.0f);
                break;
            case 1:
                ou90Var.getClass();
                ou90Var.g(pu90Var2, 0, 0, 0.0f);
                ou90Var.g(pu90Var, 0, 0, 0.0f);
                break;
            case 2:
                ou90Var.getClass();
                ou90Var.m(pu90Var2, 0, 0, 0.0f);
                ou90Var.m(pu90Var, pu90Var2.f27604a, 0, 0.0f);
                break;
            case 3:
                ou90Var.getClass();
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, 0, 0, 0.0f);
                }
                if (pu90Var != null) {
                    int i = pu90Var2 != null ? pu90Var2.f27604a : 0;
                    zcl zclVar = qmk.f28987a;
                    ou90Var.m(pu90Var, ou90Var.T(4.0f) + i, 0, 0.0f);
                }
                break;
            case 4:
                ou90Var.getClass();
                if (pu90Var2 != null) {
                    ou90Var.m(pu90Var2, 0, 0, 0.0f);
                }
                if (pu90Var != null) {
                    ou90Var.m(pu90Var, pu90Var2 != null ? pu90Var2.f27604a : 0, 0, 0.0f);
                }
                break;
            default:
                ou90Var.getClass();
                ou90Var.g(pu90Var2, 0, 0, 0.0f);
                if (pu90Var != null) {
                    ou90Var.g(pu90Var, 0, pu90Var2.b, 0.0f);
                }
                break;
        }
        return Unit.f46060a;
    }
}
