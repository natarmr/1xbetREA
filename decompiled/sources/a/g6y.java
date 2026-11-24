package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class g6y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10789a;
    public final /* synthetic */ k6y b;

    public /* synthetic */ g6y(k6y k6yVar, byte b) {
        this.f10789a = b;
        this.b = k6yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f10789a;
        yje yjeVar = null;
        k6y k6yVar = this.b;
        switch (b) {
            case 0:
                sqt sqtVar = k6y.Q1;
                k6yVar.H0().w();
                return Unit.f46060a;
            case 1:
                sqt sqtVar2 = k6y.Q1;
                i1w0 i1w0VarF = a4n0.f(k6yVar);
                fji fjiVar = k6yVar.M1;
                if (fjiVar != null) {
                    return new ry3(i1w0VarF, fjiVar);
                }
                Intrinsics.h("jackpotViewModelFactory");
                throw null;
            default:
                sqt sqtVar3 = k6y.Q1;
                t6y t6yVarH0 = k6yVar.H0();
                t6yVarH0.q.f(l6y.f19531a);
                sac.V(jiu0.a(t6yVarH0), new djx((byte) 8), null, t6yVarH0.h.b, new e3p(t6yVarH0, yjeVar, (byte) 8), 10);
                return Unit.f46060a;
        }
    }
}
