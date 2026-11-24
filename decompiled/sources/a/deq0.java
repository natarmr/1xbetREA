package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class deq0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5962a;
    public final /* synthetic */ geq0 b;

    public /* synthetic */ deq0(geq0 geq0Var, byte b) {
        this.f5962a = b;
        this.b = geq0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f5962a;
        geq0 geq0Var = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = geq0.O1;
                i1w0 i1w0VarF = a4n0.f(geq0Var);
                fxi fxiVar = geq0Var.L1;
                if (fxiVar != null) {
                    return new ry3(i1w0VarF, fxiVar);
                }
                Intrinsics.h("tileMatchingGameEndGameViewModelFactory");
                throw null;
            default:
                iiy[] iiyVarArr2 = geq0.O1;
                oeq0 oeq0Var = (oeq0) geq0Var.M1.getValue();
                sac.V(jiu0.a(oeq0Var), new w6q0(1, oeq0Var, oeq0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, oeq0Var.e.b, new keq0(oeq0Var, null, (byte) 2), 10);
                return Unit.f46060a;
        }
    }
}
