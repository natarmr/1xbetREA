package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zi5 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44425a;
    public final /* synthetic */ ej5 b;

    public /* synthetic */ zi5(ej5 ej5Var, byte b) {
        this.f44425a = b;
        this.b = ej5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44425a;
        byte b2 = 1;
        ej5 ej5Var = this.b;
        switch (b) {
            case 0:
                l9i l9iVar = ej5Var.L1;
                if (l9iVar != null) {
                    return new t0h0(l9iVar, a4n0.f(ej5Var));
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                bj5 bj5Var = ej5.V1;
                ej5Var.H0().C(true);
                return Unit.f46060a;
            case 2:
                bj5 bj5Var2 = ej5.V1;
                return new vb3(ej5Var, (byte) 1);
            case 3:
                bj5 bj5Var3 = ej5.V1;
                zi5 zi5Var = new zi5(ej5Var, (byte) 6);
                zi5 zi5Var2 = new zi5(ej5Var, (byte) 7);
                zi5 zi5Var3 = new zi5(ej5Var, b2);
                f33 f33Var = new f33((byte) 9);
                sy2 sy2Var = new sy2((byte) 18);
                yb3 yb3Var = new yb3();
                yb3Var.f42323a = zi5Var;
                yb3Var.b = zi5Var2;
                yb3Var.c = f33Var;
                yb3Var.d = zi5Var3;
                yb3Var.e = sy2Var;
                yb3Var.f = xb3.c;
                return yb3Var;
            case 4:
                bj5 bj5Var4 = ej5.V1;
                ej5Var.H0().a();
                return Unit.f46060a;
            case 5:
                bj5 bj5Var5 = ej5.V1;
                ej5Var.H0().z();
                return Unit.f46060a;
            case 6:
                bj5 bj5Var6 = ej5.V1;
                ej5Var.H0().C(true);
                return Unit.f46060a;
            default:
                bj5 bj5Var7 = ej5.V1;
                ej5Var.H0().C(false);
                return Unit.f46060a;
        }
    }
}
