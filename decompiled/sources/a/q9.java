package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q9 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28322a;
    public final /* synthetic */ t9 b;

    public /* synthetic */ q9(t9 t9Var, byte b) {
        this.f28322a = b;
        this.b = t9Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f28322a;
        t9 t9Var = this.b;
        switch (b) {
            case 0:
                f240 f240Var = (f240) obj;
                gfk0 gfk0Var = t9.P1;
                f240Var.getClass();
                t9Var.H0().E(f240Var);
                break;
            case 1:
                z140 z140Var = (z140) obj;
                gfk0 gfk0Var2 = t9.P1;
                z140Var.getClass();
                t9Var.H0().F(z140Var);
                break;
            case 2:
                d240 d240Var = (d240) obj;
                gfk0 gfk0Var3 = t9.P1;
                d240Var.getClass();
                t9Var.H0().H(d240Var);
                break;
            default:
                c240 c240Var = (c240) obj;
                gfk0 gfk0Var4 = t9.P1;
                c240Var.getClass();
                t9Var.H0().G(c240Var);
                break;
        }
        return Unit.f46060a;
    }
}
