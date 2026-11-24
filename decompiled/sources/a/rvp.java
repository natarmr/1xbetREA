package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class rvp implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31182a;
    public final /* synthetic */ svp b;

    public /* synthetic */ rvp(svp svpVar, byte b) {
        this.f31182a = b;
        this.b = svpVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31182a;
        svp svpVar = this.b;
        switch (b) {
            case 0:
                ddk ddkVar = svp.S1;
                fiu0 fiu0Var = svpVar.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                ddk ddkVar2 = svp.S1;
                svpVar.G0().x(avp.f1537a);
                return Unit.f46060a;
            default:
                ddk ddkVar3 = svp.S1;
                svpVar.G0().x(zup.f45019a);
                return Unit.f46060a;
        }
    }
}
