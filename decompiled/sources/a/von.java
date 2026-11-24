package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class von implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37775a;
    public final /* synthetic */ xon b;

    public /* synthetic */ von(xon xonVar, byte b) {
        this.f37775a = b;
        this.b = xonVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f37775a;
        xon xonVar = this.b;
        switch (b) {
            case 0:
                bek bekVar = xon.S1;
                fiu0 fiu0Var = xonVar.N1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                bek bekVar2 = xon.S1;
                xonVar.G0().x(fon.f9890a);
                return Unit.f46060a;
            case 2:
                bek bekVar3 = xon.S1;
                xonVar.G0().x(don.f6423a);
                return Unit.f46060a;
            default:
                bek bekVar4 = xon.S1;
                xonVar.G0().x(ynn.f42949a);
                return Unit.f46060a;
        }
    }
}
