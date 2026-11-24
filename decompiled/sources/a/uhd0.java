package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uhd0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35672a;
    public final /* synthetic */ xhd0 b;

    public /* synthetic */ uhd0(xhd0 xhd0Var, byte b) {
        this.f35672a = b;
        this.b = xhd0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f35672a;
        did0 did0Var = did0.f6133a;
        xhd0 xhd0Var = this.b;
        switch (b) {
            case 0:
                fl70 fl70Var = xhd0.S1;
                xhd0Var.H0().y(did0Var);
                return Unit.f46060a;
            case 1:
                fl70 fl70Var2 = xhd0.S1;
                xhd0Var.H0().y(did0Var);
                return Unit.f46060a;
            case 2:
                fl70 fl70Var3 = xhd0.S1;
                xhd0Var.H0().x();
                return Unit.f46060a;
            case 3:
                xhd0 xhd0Var2 = this.b;
                wdk0 wdk0Var = xhd0Var2.M1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH = xhd0Var2.H(R.string.network_error);
                strH.getClass();
                wdk0.k(wdk0Var, new xdk0(rek0Var, strH, null, null, null, null, 124), xhd0Var2, null, null, false, null, 1020);
                return Unit.f46060a;
            case 4:
                fl70 fl70Var4 = xhd0.S1;
                xhd0Var.H0().w();
                return Unit.f46060a;
            case 5:
                fl70 fl70Var5 = xhd0.S1;
                xhd0Var.H0().w();
                return Unit.f46060a;
            case 6:
                fl70 fl70Var6 = xhd0.S1;
                i1w0 i1w0VarF = a4n0.f(xhd0Var);
                pqi pqiVar = xhd0Var.K1;
                if (pqiVar != null) {
                    return new ry3(i1w0VarF, pqiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                fl70 fl70Var7 = xhd0.S1;
                xhd0Var.H0().w();
                return Unit.f46060a;
        }
    }
}
