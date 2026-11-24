package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class le70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19887a;
    public final /* synthetic */ oe70 b;

    public /* synthetic */ le70(oe70 oe70Var, byte b) {
        this.f19887a = b;
        this.b = oe70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f19887a;
        oe70 oe70Var = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = oe70.Q1;
                i1w0 i1w0VarF = a4n0.f(oe70Var);
                u6i u6iVar = oe70Var.L1;
                if (u6iVar != null) {
                    return new ry3(i1w0VarF, u6iVar);
                }
                Intrinsics.h("mainGameViewModelFactory");
                throw null;
            case 1:
                iiy[] iiyVarArr2 = oe70.Q1;
                qf70 qf70VarH0 = oe70Var.H0();
                sac.V(jiu0.a(qf70VarH0), new cf70(1, qf70VarH0, qf70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 6), null, qf70VarH0.v.b, new kf70(qf70VarH0, null, (byte) 0), 10);
                return Unit.f46060a;
            case 2:
                iiy[] iiyVarArr3 = oe70.Q1;
                oe70Var.H0().C();
                return Unit.f46060a;
            case 3:
                iiy[] iiyVarArr4 = oe70.Q1;
                oe70Var.H0().C();
                return Unit.f46060a;
            case 4:
                iiy[] iiyVarArr5 = oe70.Q1;
                qf70 qf70VarH1 = oe70Var.H0();
                p7m0 p7m0Var = qf70VarH1.M;
                Boolean bool = Boolean.TRUE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                p7m0 p7m0Var2 = qf70VarH1.L;
                Boolean bool2 = Boolean.FALSE;
                p7m0Var2.getClass();
                p7m0Var2.o(null, bool2);
                return Unit.f46060a;
            default:
                iiy[] iiyVarArr6 = oe70.Q1;
                oe70Var.H0().D();
                return Unit.f46060a;
        }
    }
}
