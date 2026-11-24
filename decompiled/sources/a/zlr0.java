package a;

import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class zlr0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44595a;
    public final /* synthetic */ amr0 b;
    public final /* synthetic */ pmr0 c;

    public /* synthetic */ zlr0(amr0 amr0Var, pmr0 pmr0Var, byte b) {
        this.f44595a = b;
        this.b = amr0Var;
        this.c = pmr0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44595a;
        pmr0 pmr0Var = this.c;
        amr0 amr0Var = this.b;
        switch (b) {
            case 0:
                int i = pmr0Var.f27251a;
                int i2 = amr0.m2;
                vcc.f0(i120.V(new Pair("TotoBetTypeBottomSheetKey", Integer.valueOf(i))), amr0Var, "TotoBetTypeBottomSheetKey");
                amr0Var.x0();
                break;
            default:
                int i3 = pmr0Var.f27251a;
                int i4 = amr0.m2;
                vcc.f0(i120.V(new Pair("TotoBetTypeBottomSheetKey", Integer.valueOf(i3))), amr0Var, "TotoBetTypeBottomSheetKey");
                amr0Var.x0();
                break;
        }
        return Unit.f46060a;
    }
}
