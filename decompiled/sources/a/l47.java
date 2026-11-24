package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l47 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19390a;
    public final /* synthetic */ q47 b;

    public /* synthetic */ l47(q47 q47Var, byte b) {
        this.f19390a = b;
        this.b = q47Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f19390a;
        q47 q47Var = this.b;
        switch (b) {
            case 0:
                gl5 gl5Var = q47.U1;
                q47Var.I0().x(v27.f36669a);
                ywq ywqVar = q47Var.R1;
                Unit unit = Unit.f46060a;
                ywqVar.a(unit);
                return unit;
            case 1:
                gl5 gl5Var2 = q47.U1;
                q47Var.I0().x(u27.f34932a);
                return Unit.f46060a;
            case 2:
                gl5 gl5Var3 = q47.U1;
                q47Var.I0().x(u17.f34889a);
                return Unit.f46060a;
            case 3:
                gl5 gl5Var4 = q47.U1;
                q47Var.I0().x(v17.f36615a);
                return Unit.f46060a;
            case 4:
                gl5 gl5Var5 = q47.U1;
                q47Var.I0().x(p27.f26237a);
                return Unit.f46060a;
            default:
                pii piiVar = q47Var.L1;
                if (piiVar != null) {
                    return new q0h0(piiVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
        }
    }
}
