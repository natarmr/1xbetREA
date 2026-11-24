package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class cyz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5200a;
    public final /* synthetic */ eyz b;

    public /* synthetic */ cyz(eyz eyzVar, byte b) {
        this.f5200a = b;
        this.b = eyzVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5200a;
        fxz fxzVar = fxz.f10335a;
        eyz eyzVar = this.b;
        switch (b) {
            case 0:
                evz evzVar = eyz.O1;
                fiu0 fiu0Var = eyzVar.K1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                evz evzVar2 = eyz.O1;
                eyzVar.G0().x(fxzVar);
                return Unit.f46060a;
            default:
                evz evzVar3 = eyz.O1;
                eyzVar.G0().x(fxzVar);
                return Unit.f46060a;
        }
    }
}
