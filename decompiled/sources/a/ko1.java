package a;

import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ko1 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18607a;
    public final /* synthetic */ dp1 b;

    public /* synthetic */ ko1(dp1 dp1Var, byte b) {
        this.f18607a = b;
        this.b = dp1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        Object value2;
        Object value3;
        byte b = this.f18607a;
        dp1 dp1Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                dp1Var.x.b(th, new xg1((byte) 5));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                boolean z = th2 instanceof jfp;
                ctf0 ctf0Var = dp1Var.t;
                if (z) {
                    dp1Var.G(new zn1(ctf0Var.b.a(R.string.error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.casino_favorites_limit_error, Arrays.copyOf(new Object[0], 0)), ctf0Var.b.a(R.string.ok_new, Arrays.copyOf(new Object[0], 0))));
                } else {
                    dp1Var.G(new yn1(jwb.G(th2, ctf0Var)));
                }
                break;
            case 2:
                pb0 pb0Var = (pb0) obj;
                pb0Var.getClass();
                p7m0 p7m0Var = dp1Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                    dp1Var.f.getClass();
                } while (!p7m0Var.m(value, bo1.a((bo1) value, null, null, null, null, false, null, false, false, null, pb0Var.f26680a, false, 0L, 917503)));
                break;
            case 3:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var2 = dp1Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                    dp1Var.f.getClass();
                } while (!p7m0Var2.m(value2, bo1.a((bo1) value2, null, l8h0.f19604a, null, null, false, null, false, false, null, null, false, 0L, 1048573)));
                break;
            default:
                ((Throwable) obj).getClass();
                p7m0 p7m0Var3 = dp1Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    dp1Var.f.getClass();
                } while (!p7m0Var3.m(value3, bo1.a((bo1) value3, null, l8h0.f19604a, null, null, false, null, false, false, null, null, false, 0L, 1048573)));
                break;
        }
        return Unit.f46060a;
    }
}
