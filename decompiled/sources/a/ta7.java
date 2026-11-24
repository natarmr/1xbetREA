package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ta7 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33601a;
    public final /* synthetic */ wa7 b;

    public /* synthetic */ ta7(wa7 wa7Var, byte b) {
        this.f33601a = b;
        this.b = wa7Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f33601a;
        wa7 wa7Var = this.b;
        switch (b) {
            case 0:
                kj5 kj5Var = wa7.U1;
                wa7Var.I0().x(p97.f26594a);
                return Unit.f46060a;
            case 1:
                kj5 kj5Var2 = wa7.U1;
                wa7Var.I0().x(x97.f40496a);
                return Unit.f46060a;
            case 2:
                x9i x9iVar = wa7Var.N1;
                if (x9iVar != null) {
                    return new q0h0(x9iVar);
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 3:
                kj5 kj5Var3 = wa7.U1;
                wa7Var.I0().x(q97.f28334a);
                return Unit.f46060a;
            case 4:
                kj5 kj5Var4 = wa7.U1;
                wa7Var.I0().x(u97.f35270a);
                return Unit.f46060a;
            case 5:
                kj5 kj5Var5 = wa7.U1;
                wa7Var.I0().x(da7.f5733a);
                ywq ywqVar = wa7Var.R1;
                Unit unit = Unit.f46060a;
                ywqVar.a(unit);
                return unit;
            case 6:
                kj5 kj5Var6 = wa7.U1;
                wa7Var.I0().x(ca7.f3994a);
                return Unit.f46060a;
            case 7:
                kj5 kj5Var7 = wa7.U1;
                wa7Var.I0().x(ja7.f16175a);
                return Unit.f46060a;
            default:
                kj5 kj5Var8 = wa7.U1;
                wa7Var.I0().x(o97.f24865a);
                return Unit.f46060a;
        }
    }
}
