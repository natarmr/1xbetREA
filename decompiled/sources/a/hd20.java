package a;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hd20 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f12849a;
    public final /* synthetic */ rg20 b;

    public /* synthetic */ hd20(rg20 rg20Var, byte b) {
        this.f12849a = b;
        this.b = rg20Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f12849a;
        rg20 rg20Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                rg20Var.p.b(th, new gd20(rg20Var, (byte) 1));
                break;
            case 1:
                th.getClass();
                v3c.N(rg20Var.U);
                if (!(th instanceof CancellationException)) {
                    p7m0 p7m0Var = rg20Var.I;
                    p7m0Var.getClass();
                    p7m0Var.o(null, de20.f5926a);
                    p7m0 p7m0Var2 = rg20Var.J;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, ae20.f706a);
                }
                break;
            default:
                th.getClass();
                rg20Var.p.b(th, new gd20(rg20Var, (byte) 2));
                i8i.D("promocode", "", rg20Var.t.b, "betkit_bet_error");
                rg20Var.L.f(ie20.f14612a);
                break;
        }
        return Unit.f46060a;
    }
}
