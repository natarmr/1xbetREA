package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36955a;
    public final /* synthetic */ y8 b;

    public /* synthetic */ v8(y8 y8Var, byte b) {
        this.f36955a = b;
        this.b = y8Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f36955a;
        y8 y8Var = this.b;
        switch (b) {
            case 0:
                f240 f240Var = (f240) obj;
                qek0 qek0Var = y8.P1;
                f240Var.getClass();
                y8Var.H0().E(f240Var);
                break;
            case 1:
                z140 z140Var = (z140) obj;
                qek0 qek0Var2 = y8.P1;
                z140Var.getClass();
                y8Var.H0().F(z140Var);
                break;
            case 2:
                d240 d240Var = (d240) obj;
                qek0 qek0Var3 = y8.P1;
                d240Var.getClass();
                y8Var.H0().H(d240Var);
                break;
            default:
                c240 c240Var = (c240) obj;
                qek0 qek0Var4 = y8.P1;
                c240Var.getClass();
                y8Var.H0().G(c240Var);
                break;
        }
        return Unit.f46060a;
    }
}
