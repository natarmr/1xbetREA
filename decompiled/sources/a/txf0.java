package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class txf0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34697a;
    public final /* synthetic */ ayf0 b;

    public /* synthetic */ txf0(ayf0 ayf0Var, byte b) {
        this.f34697a = b;
        this.b = ayf0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34697a;
        ayf0 ayf0Var = this.b;
        switch (b) {
            case 0:
                eke0 eke0Var = ayf0.S1;
                nyf0 nyf0VarH0 = ayf0Var.H0();
                bby bbyVar = nyf0VarH0.D;
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                p7m0 p7m0Var = nyf0VarH0.G;
                Boolean bool = Boolean.FALSE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                return Unit.f46060a;
            case 1:
                eke0 eke0Var2 = ayf0.S1;
                i1w0 i1w0VarF = a4n0.f(ayf0Var);
                csi csiVar = ayf0Var.N1;
                if (csiVar != null) {
                    return new ry3(i1w0VarF, csiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                eke0 eke0Var3 = ayf0.S1;
                return ayf0Var.p0();
        }
    }
}
