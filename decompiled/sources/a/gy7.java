package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class gy7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12113a;
    public final /* synthetic */ t33 b;
    public final /* synthetic */ t33 c;
    public final /* synthetic */ t33 d;

    public /* synthetic */ gy7(t33 t33Var, t33 t33Var2, t33 t33Var3, byte b) {
        this.f12113a = b;
        this.b = t33Var;
        this.c = t33Var2;
        this.d = t33Var3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f12113a;
        t33 t33Var = this.d;
        t33 t33Var2 = this.c;
        t33 t33Var3 = this.b;
        uag0 uag0Var = (uag0) obj;
        uag0Var.getClass();
        switch (b) {
            case 0:
                uag0Var.w(((Number) t33Var3.d()).floatValue());
                uag0Var.y(((Number) t33Var3.d()).floatValue());
                uag0Var.v(((Number) t33Var2.d()).floatValue());
                uag0Var.I(((Number) t33Var.d()).floatValue());
                break;
            default:
                uag0Var.b(((Number) t33Var3.d()).floatValue());
                uag0Var.H(((Number) t33Var2.d()).floatValue());
                uag0Var.w(((Number) t33Var.d()).floatValue());
                uag0Var.y(((Number) t33Var.d()).floatValue());
                break;
        }
        return Unit.f46060a;
    }
}
