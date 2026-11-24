package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yye implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43462a;
    public final /* synthetic */ gze b;

    public /* synthetic */ yye(gze gzeVar, byte b) {
        this.f43462a = b;
        this.b = gzeVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        ytb0 ytb0Var;
        Object value2;
        ytb0 ytb0Var2;
        Object value3;
        ytb0 ytb0Var3;
        byte b = this.f43462a;
        gze gzeVar = this.b;
        switch (b) {
            case 0:
                kdi kdiVar = gzeVar.K1;
                if (kdiVar != null) {
                    return kdiVar;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                usd usdVar = gze.S1;
                qg20 qg20VarI0 = gzeVar.I0();
                ((lye) qg20VarI0.g0.f23572a.f10647a).getClass();
                p7m0 p7m0Var = qg20VarI0.r1;
                do {
                    value = p7m0Var.getValue();
                    ytb0Var = (ytb0) value;
                } while (!p7m0Var.m(value, ytb0Var != null ? ytb0.a(ytb0Var, 5) : new ytb0(false, true, false)));
                return Unit.f46060a;
            case 2:
                usd usdVar2 = gze.S1;
                gzeVar.I0().c0();
                qcc.Q(gzeVar);
                return Unit.f46060a;
            case 3:
                usd usdVar3 = gze.S1;
                p7m0 p7m0Var2 = gzeVar.I0().r1;
                do {
                    value2 = p7m0Var2.getValue();
                    ytb0Var2 = (ytb0) value2;
                } while (!p7m0Var2.m(value2, ytb0Var2 != null ? ytb0.a(ytb0Var2, 6) : new ytb0(true, false, false)));
                return Unit.f46060a;
            case 4:
                usd usdVar4 = gze.S1;
                gzeVar.I0().c0();
                qcc.Q(gzeVar);
                return Unit.f46060a;
            case 5:
                usd usdVar5 = gze.S1;
                p7m0 p7m0Var3 = gzeVar.I0().r1;
                do {
                    value3 = p7m0Var3.getValue();
                    ytb0Var3 = (ytb0) value3;
                } while (!p7m0Var3.m(value3, ytb0Var3 != null ? ytb0.a(ytb0Var3, 2) : new ytb0(true, false, true)));
                return Unit.f46060a;
            default:
                usd usdVar6 = gze.S1;
                gzeVar.I0().c0();
                qcc.Q(gzeVar);
                return Unit.f46060a;
        }
    }
}
