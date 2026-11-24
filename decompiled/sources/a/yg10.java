package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yg10 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42564a;
    public final /* synthetic */ xk80 b;
    public final /* synthetic */ int c;

    public /* synthetic */ yg10(xk80 xk80Var, int i, byte b) {
        this.f42564a = b;
        this.b = xk80Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f42564a;
        int i = this.c;
        xk80 xk80Var = this.b;
        switch (b) {
            case 0:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                float fL = xk80Var.l() + (xk80Var.k() - i);
                uag0Var.b(l7x.O(0.3f, 1.0f, 1.0f - l1e0.c(Math.abs(fL), 0.0f, 1.0f)));
                float fO = l7x.O(0.8f, 1.0f, 1.0f - l1e0.c(Math.abs(fL), 0.0f, 1.0f));
                uag0Var.w(fO);
                uag0Var.y(fO);
                break;
            default:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                yai0.f(abi0Var, xk80Var.k() == i);
                break;
        }
        return Unit.f46060a;
    }
}
