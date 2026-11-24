package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class jgj implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16482a;
    public final /* synthetic */ ngj b;

    public /* synthetic */ jgj(ngj ngjVar, byte b) {
        this.f16482a = b;
        this.b = ngjVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f16482a;
        yje yjeVar = null;
        ngj ngjVar = this.b;
        switch (b) {
            case 0:
                usd usdVar = ngj.n2;
                xgj xgjVarW0 = ngjVar.W0();
                xgjVarW0.h.f(qgj.f28687a);
                ouu ouuVar = xgjVarW0.b;
                ouu.o(ouuVar, new xa50(), null, 4);
                ((qe50) ouuVar.b).a(new xa50(), false);
                return Unit.f46060a;
            case 1:
                fiu0 fiu0Var = ngjVar.j2;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 2:
                usd usdVar2 = ngj.n2;
                return ngjVar.p0();
            default:
                usd usdVar3 = ngj.n2;
                xgj xgjVarW1 = ngjVar.W0();
                qjj.W(jiu0.a(xgjVarW1), xgjVarW1.e.b, null, new igb((Object) xgjVarW1, yjeVar, (byte) 29), 2);
                return Unit.f46060a;
        }
    }
}
