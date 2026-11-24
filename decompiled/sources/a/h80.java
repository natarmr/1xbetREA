package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h80 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12601a;
    public final /* synthetic */ n80 b;

    public /* synthetic */ h80(n80 n80Var, byte b) {
        this.f12601a = b;
        this.b = n80Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f12601a;
        n80 n80Var = this.b;
        switch (b) {
            case 0:
                jdk0 jdk0Var = n80.U1;
                i1w0 i1w0VarF = a4n0.f(n80Var);
                j6i j6iVar = n80Var.L1;
                if (j6iVar != null) {
                    return new ry3(i1w0VarF, j6iVar);
                }
                Intrinsics.h("africanRouletteViewModelFactory");
                throw null;
            case 1:
                jdk0 jdk0Var2 = n80.U1;
                return new j80(n80Var);
            default:
                jdk0 jdk0Var3 = n80.U1;
                n80Var.H0().w();
                return Unit.f46060a;
        }
    }
}
