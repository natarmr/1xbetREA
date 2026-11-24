package a;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ea6 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7452a;
    public final /* synthetic */ e9q0 b;

    public /* synthetic */ ea6(e9q0 e9q0Var, byte b) {
        this.f7452a = b;
        this.b = e9q0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        z8q0 z8q0Var;
        byte b = this.f7452a;
        byte b2 = 2;
        e9q0 e9q0Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(e9q0Var != null ? ((Boolean) new ea6(e9q0Var, b2).invoke()).booleanValue() : false);
            case 1:
                return Boolean.valueOf(e9q0Var != null ? ((Boolean) new ea6(e9q0Var, b2).invoke()).booleanValue() : false);
            default:
                j83 j83Var = e9q0Var.b;
                a9q0 a9q0Var = (a9q0) ((hgk0) e9q0Var.f7435a).getValue();
                return Boolean.valueOf(Intrinsics.d(j83Var, (a9q0Var == null || (z8q0Var = a9q0Var.f491a) == null) ? null : z8q0Var.f43981a));
        }
    }
}
