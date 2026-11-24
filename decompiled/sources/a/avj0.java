package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class avj0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1528a;
    public final /* synthetic */ jvj0 b;

    public /* synthetic */ avj0(jvj0 jvj0Var, byte b) {
        this.f1528a = b;
        this.b = jvj0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f1528a;
        jvj0 jvj0Var = this.b;
        switch (b) {
            case 0:
                zie0 zie0Var = jvj0.W1;
                jvj0Var.H0().c.clearFocus();
                xxj0 xxj0VarJ0 = jvj0Var.J0();
                xxj0VarJ0.N(jvj0.class.getSimpleName(), true, ((Boolean) xxj0VarJ0.w0.getValue()).booleanValue(), false);
                return Unit.f46060a;
            case 1:
                zie0 zie0Var2 = jvj0.W1;
                xxj0 xxj0VarJ1 = jvj0Var.J0();
                String simpleName = jvj0.class.getSimpleName();
                p7m0 p7m0Var = xxj0VarJ1.w0;
                Boolean bool = Boolean.TRUE;
                p7m0Var.getClass();
                p7m0Var.o(null, bool);
                xxj0VarJ1.N(simpleName, false, true, false);
                return Unit.f46060a;
            default:
                bli bliVar = jvj0Var.L1;
                if (bliVar != null) {
                    return bliVar;
                }
                Intrinsics.h("simpleBetViewModelFactory");
                throw null;
        }
    }
}
