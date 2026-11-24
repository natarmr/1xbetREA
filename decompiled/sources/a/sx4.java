package a;

import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class sx4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32955a;
    public final /* synthetic */ fy4 b;

    public /* synthetic */ sx4(fy4 fy4Var, byte b) {
        this.f32955a = b;
        this.b = fy4Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f32955a;
        byte b2 = 0;
        fy4 fy4Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                fy4Var.i.b(th, new o33((byte) 26));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                if (!(th2 instanceof CancellationException)) {
                    qnb0 qnb0VarY = fy4Var.y();
                    p7m0 p7m0Var = fy4Var.h0;
                    p7m0Var.getClass();
                    p7m0Var.o(null, qnb0VarY);
                }
                break;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                if (!(th3 instanceof CancellationException)) {
                    fy4Var.H(fy4Var.W.f24244a ? wvo0.f39847a : zvo0.f45068a);
                    qnb0 qnb0VarY2 = fy4Var.y();
                    p7m0 p7m0Var2 = fy4Var.h0;
                    p7m0Var2.getClass();
                    p7m0Var2.o(null, qnb0VarY2);
                }
                break;
            case 3:
                ((m97) obj).getClass();
                fy4Var.a0.f(new fw4(new xdk0(pek0.f26859a, fy4Var.l.b.a(R.string.bet_error_coef_block, Arrays.copyOf(new Object[0], 0)), null, null, jdk0.f16332a, Integer.valueOf(R.drawable.ic_snack_lock), 76)));
                break;
            case 4:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                fy4Var.i.b(th4, new tx4(fy4Var, b2));
                break;
            default:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                fy4Var.i.b(th5, new o33((byte) 27));
                break;
        }
        return Unit.f46060a;
    }
}
