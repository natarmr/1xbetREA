package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xdd0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40688a;
    public final /* synthetic */ bed0 b;

    public /* synthetic */ xdd0(bed0 bed0Var, byte b) {
        this.f40688a = b;
        this.b = bed0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f40688a;
        bed0 bed0Var = this.b;
        switch (b) {
            case 0:
                fl70 fl70Var = bed0.U1;
                bed0Var.H0().w();
                return Unit.f46060a;
            case 1:
                fl70 fl70Var2 = bed0.U1;
                bed0Var.H0().w();
                return Unit.f46060a;
            case 2:
                fl70 fl70Var3 = bed0.U1;
                i1w0 i1w0VarF = a4n0.f(bed0Var);
                kqi kqiVar = bed0Var.L1;
                if (kqiVar != null) {
                    return new ry3(i1w0VarF, kqiVar);
                }
                Intrinsics.h("pushNotifySettingsViewModelFactory");
                throw null;
            case 3:
                ywq ywqVar = bed0Var.R1;
                Unit unit = Unit.f46060a;
                ywqVar.a(unit);
                return unit;
            case 4:
                fl70 fl70Var4 = bed0.U1;
                bed0Var.G0().d.setChecked(false);
                return Unit.f46060a;
            case 5:
                ywq ywqVar2 = bed0Var.S1;
                Unit unit2 = Unit.f46060a;
                ywqVar2.a(unit2);
                return unit2;
            default:
                fl70 fl70Var5 = bed0.U1;
                bed0Var.G0().c.setChecked(false);
                return Unit.f46060a;
        }
    }
}
