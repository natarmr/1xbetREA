package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vj70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37513a;
    public final /* synthetic */ yj70 b;

    public /* synthetic */ vj70(yj70 yj70Var, byte b) {
        this.f37513a = b;
        this.b = yj70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f37513a;
        yj70 yj70Var = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = yj70.O1;
                i1w0 i1w0VarF = a4n0.f(yj70Var);
                ofi ofiVar = yj70Var.L1;
                if (ofiVar != null) {
                    return new ry3(i1w0VarF, ofiVar);
                }
                Intrinsics.h("oneXGameEndGameViewModelFactory");
                throw null;
            default:
                iiy[] iiyVarArr2 = yj70.O1;
                jk70 jk70VarH0 = yj70Var.H0();
                sac.V(jiu0.a(jk70VarH0), new gk70(1, jk70VarH0, jk70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 2), null, jk70VarH0.e.b, new ek70(jk70VarH0, null, (byte) 2), 10);
                return Unit.f46060a;
        }
    }
}
