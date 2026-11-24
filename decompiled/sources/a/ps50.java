package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ps50 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27498a;
    public final /* synthetic */ rs50 b;

    public /* synthetic */ ps50(rs50 rs50Var, byte b) {
        this.f27498a = b;
        this.b = rs50Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f27498a;
        rs50 rs50Var = this.b;
        switch (b) {
            case 0:
                atz atzVar = rs50.R1;
                fiu0 fiu0Var = rs50Var.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                atz atzVar2 = rs50.R1;
                rs50Var.G0().x(hs50.f13564a);
                return Unit.f46060a;
            default:
                atz atzVar3 = rs50.R1;
                rs50Var.G0().x(gs50.f11813a);
                return Unit.f46060a;
        }
    }
}
