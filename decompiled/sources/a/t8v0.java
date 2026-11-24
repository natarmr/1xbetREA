package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class t8v0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33532a;
    public final /* synthetic */ v8v0 b;

    public /* synthetic */ t8v0(v8v0 v8v0Var, byte b) {
        this.f33532a = b;
        this.b = v8v0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f33532a;
        v8v0 v8v0Var = this.b;
        switch (b) {
            case 0:
                bzs0 bzs0Var = v8v0.P1;
                fiu0 fiu0Var = v8v0Var.N1;
                if (fiu0Var != null) {
                    return fiu0Var;
                }
                Intrinsics.h("viewModelFactory");
                throw null;
            case 1:
                bzs0 bzs0Var2 = v8v0.P1;
                ((k3t0) v8v0Var.O1.getValue()).x(m8v0.f21388a);
                return Unit.f46060a;
            default:
                bzs0 bzs0Var3 = v8v0.P1;
                ((k3t0) v8v0Var.O1.getValue()).x(l8v0.f19622a);
                return Unit.f46060a;
        }
    }
}
