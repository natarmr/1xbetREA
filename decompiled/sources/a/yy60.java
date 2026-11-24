package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class yy60 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43453a;
    public final /* synthetic */ ez60 b;

    public /* synthetic */ yy60(ez60 ez60Var, byte b) {
        this.f43453a = b;
        this.b = ez60Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f43453a;
        ez60 ez60Var = this.b;
        switch (b) {
            case 0:
                iiy[] iiyVarArr = ez60.S1;
                g670 g670VarH0 = ez60Var.H0();
                sac.V(jiu0.a(g670VarH0), new m570(g670VarH0, (byte) 1), null, g670VarH0.m.b, new w570(g670VarH0, null, (byte) 1), 10);
                return Unit.f46060a;
            case 1:
                fiu0 fiu0Var = ez60Var.M1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("sharedViewModelFactory");
                throw null;
            default:
                nmi nmiVar = ez60Var.L1;
                if (nmiVar != null) {
                    return new t0h0(nmiVar, a4n0.f(ez60Var));
                }
                Intrinsics.h("oneXGamesViewModelFactory");
                throw null;
        }
    }
}
