package a;

import java.util.Arrays;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class iwj0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15494a;
    public final /* synthetic */ xxj0 b;

    public /* synthetic */ iwj0(xxj0 xxj0Var, byte b) {
        this.f15494a = b;
        this.b = xxj0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15494a;
        onb0 onb0Var = onb0.f25539a;
        xxj0 xxj0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                xxj0Var.c.b(th, new jwj0(xxj0Var, (byte) 1));
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                if (!(th2 instanceof CancellationException)) {
                    xxj0Var.Q(xxj0Var.o0.f24244a ? wvo0.f39847a : zvo0.f45068a);
                    xxj0Var.P(onb0Var);
                }
                break;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                xxj0Var.c.b(th3, new jwj0(xxj0Var, (byte) 2));
                break;
            case 3:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                xxj0Var.c.b(th4, new ogj0((byte) 20));
                break;
            case 4:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                xxj0 xxj0Var2 = this.b;
                xxj0Var2.c.b(th5, new nfj0(2, xxj0Var2, xxj0.class, "handleAdvanceError", "handleAdvanceError(Ljava/lang/Throwable;Ljava/lang/String;)V", 0, (byte) 3));
                break;
            case 5:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                if (!(th6 instanceof CancellationException)) {
                    xxj0Var.P(onb0Var);
                }
                break;
            default:
                ((m97) obj).getClass();
                xxj0Var.q0.f(new tuj0(new xdk0(pek0.f26859a, xxj0Var.m.b.a(R.string.bet_error_coef_block, Arrays.copyOf(new Object[0], 0)), null, null, jdk0.f16332a, Integer.valueOf(R.drawable.ic_snack_lock), 76)));
                break;
        }
        return Unit.f46060a;
    }
}
