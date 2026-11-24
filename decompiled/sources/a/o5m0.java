package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o5m0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24694a;
    public final /* synthetic */ t33 b;
    public final /* synthetic */ t33 c;

    public /* synthetic */ o5m0(t33 t33Var, t33 t33Var2, byte b) {
        this.f24694a = b;
        this.b = t33Var;
        this.c = t33Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f24694a;
        t33 t33Var = this.c;
        t33 t33Var2 = this.b;
        uag0 uag0Var = (uag0) obj;
        uag0Var.getClass();
        switch (b) {
            case 0:
                uag0Var.b(((Number) t33Var2.d()).floatValue());
                uag0Var.H(((Number) t33Var.d()).floatValue());
                break;
            case 1:
                uag0Var.b(((Number) t33Var2.d()).floatValue());
                uag0Var.H(((Number) t33Var.d()).floatValue());
                break;
            default:
                uag0Var.H(((Number) t33Var2.d()).floatValue());
                uag0Var.b(((Number) t33Var.d()).floatValue());
                break;
        }
        return Unit.f46060a;
    }
}
