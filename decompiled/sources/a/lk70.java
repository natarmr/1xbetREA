package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lk70 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20187a;
    public final /* synthetic */ ok70 b;

    public /* synthetic */ lk70(ok70 ok70Var, byte b) {
        this.f20187a = b;
        this.b = ok70Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f20187a;
        ok70 ok70Var = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = ok70.O1;
                i1w0 i1w0VarF = a4n0.f(ok70Var);
                v6i v6iVar = ok70Var.L1;
                if (v6iVar != null) {
                    return new ry3(i1w0VarF, v6iVar);
                }
                Intrinsics.h("oneXGameEndGameViewModelFactory");
                throw null;
            default:
                iiy[] iiyVarArr2 = ok70.O1;
                yk70 yk70VarH0 = ok70Var.H0();
                sac.V(jiu0.a(yk70VarH0), new gk70(1, yk70VarH0, yk70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 6), null, yk70VarH0.e.b, new uk70(yk70VarH0, null, (byte) 2), 10);
                return Unit.f46060a;
        }
    }
}
