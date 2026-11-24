package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nbt0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23257a;
    public final /* synthetic */ obt0 b;

    public /* synthetic */ nbt0(obt0 obt0Var, byte b) {
        this.f23257a = b;
        this.b = obt0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f23257a;
        obt0 obt0Var = this.b;
        switch (b) {
            case 0:
                wxs0 wxs0Var = obt0.R1;
                fiu0 fiu0Var = obt0Var.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                wxs0 wxs0Var2 = obt0.R1;
                obt0Var.G0().x(cbt0.f4077a);
                return Unit.f46060a;
            default:
                wxs0 wxs0Var3 = obt0.R1;
                obt0Var.G0().x(bbt0.f2324a);
                return Unit.f46060a;
        }
    }
}
