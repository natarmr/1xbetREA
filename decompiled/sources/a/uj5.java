package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uj5 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35761a;
    public final /* synthetic */ dk5 b;

    public /* synthetic */ uj5(dk5 dk5Var, byte b) {
        this.f35761a = b;
        this.b = dk5Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f35761a;
        dk5 dk5Var = this.b;
        switch (b) {
            case 0:
                ffs0 ffs0Var = new ffs0(dk5Var.s, (List) dk5Var.U.getValue(), dk5Var.S(), dk5Var.e, f1t0.e0(dk5Var.c));
                dk5Var.O = ffs0Var;
                return ffs0Var;
            case 1:
                dk5Var.a();
                return Unit.f46060a;
            case 2:
                dk5Var.a();
                return Unit.f46060a;
            case 3:
                dk5Var.M(true);
                return Unit.f46060a;
            case 4:
                dk5Var.M(false);
                return Unit.f46060a;
            case 5:
                dk5Var.B();
                return Unit.f46060a;
            case 6:
                dk5Var.B();
                return Unit.f46060a;
            case 7:
                dk5Var.M(true);
                return Unit.f46060a;
            case 8:
                dk5Var.M(false);
                return Unit.f46060a;
            case 9:
                dk5Var.a();
                return Unit.f46060a;
            case 10:
                dk5Var.a();
                return Unit.f46060a;
            case 11:
                dk5Var.M(false);
                return Unit.f46060a;
            case 12:
                dk5Var.B();
                return Unit.f46060a;
            default:
                dk5Var.M(true);
                return Unit.f46060a;
        }
    }
}
