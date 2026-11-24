package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class fyy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10381a;
    public final /* synthetic */ gyy b;

    public /* synthetic */ fyy(gyy gyyVar, byte b) {
        this.f10381a = b;
        this.b = gyyVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f10381a;
        gyy gyyVar = this.b;
        switch (b) {
            case 0:
                rqt rqtVar = gyy.P1;
                fiu0 fiu0Var = gyyVar.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                rqt rqtVar2 = gyy.P1;
                gyyVar.G0().x(yxy.f43444a);
                return Unit.f46060a;
            default:
                rqt rqtVar3 = gyy.P1;
                gyyVar.G0().x(xxy.f41680a);
                return Unit.f46060a;
        }
    }
}
