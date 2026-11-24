package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zcw implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44185a;
    public final /* synthetic */ cdw b;

    public /* synthetic */ zcw(cdw cdwVar, byte b) {
        this.f44185a = b;
        this.b = cdwVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f44185a;
        cdw cdwVar = this.b;
        switch (b) {
            case 0:
                rqt rqtVar = cdw.R1;
                fiu0 fiu0Var = cdwVar.L1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                rqt rqtVar2 = cdw.R1;
                cdwVar.G0().x(ccw.f4131a);
                return Unit.f46060a;
            case 2:
                rqt rqtVar3 = cdw.R1;
                cdwVar.G0().x(gcw.f11080a);
                return Unit.f46060a;
            default:
                rqt rqtVar4 = cdw.R1;
                cdwVar.G0().x(fcw.f9330a);
                return Unit.f46060a;
        }
    }
}
