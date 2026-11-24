package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class e8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f7349a;
    public final /* synthetic */ l8 b;

    public /* synthetic */ e8(l8 l8Var, byte b) {
        this.f7349a = b;
        this.b = l8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f7349a;
        l8 l8Var = this.b;
        switch (b) {
            case 0:
                f240 f240Var = (f240) obj;
                pek0 pek0Var = l8.P1;
                f240Var.getClass();
                l8Var.H0().E(f240Var);
                break;
            case 1:
                z140 z140Var = (z140) obj;
                pek0 pek0Var2 = l8.P1;
                z140Var.getClass();
                l8Var.H0().F(z140Var);
                break;
            case 2:
                d240 d240Var = (d240) obj;
                pek0 pek0Var3 = l8.P1;
                d240Var.getClass();
                l8Var.H0().H(d240Var);
                break;
            default:
                c240 c240Var = (c240) obj;
                pek0 pek0Var4 = l8.P1;
                c240Var.getClass();
                l8Var.H0().G(c240Var);
                break;
        }
        return Unit.f46060a;
    }
}
