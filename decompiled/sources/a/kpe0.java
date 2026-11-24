package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class kpe0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18671a;
    public final /* synthetic */ ppe0 b;

    public /* synthetic */ kpe0(ppe0 ppe0Var, byte b) {
        this.f18671a = b;
        this.b = ppe0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f18671a;
        yje yjeVar = null;
        ppe0 ppe0Var = this.b;
        switch (b) {
            case 0:
                zie0 zie0Var = ppe0.S1;
                ppe0Var.H0().f.B();
                return Unit.f46060a;
            case 1:
                fiu0 fiu0Var = ppe0Var.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            default:
                zie0 zie0Var2 = ppe0.S1;
                tpe0 tpe0VarH0 = ppe0Var.H0();
                p7m0 p7m0Var = tpe0VarH0.i;
                vpe0 vpe0Var = vpe0.b;
                p7m0Var.getClass();
                p7m0Var.o(null, vpe0Var);
                sac.V(jiu0.a(tpe0VarH0), new rpe0(tpe0VarH0, (byte) 0), null, null, new coc0(tpe0VarH0, yjeVar, (byte) 15), 14);
                return Unit.f46060a;
        }
    }
}
