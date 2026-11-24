package a;

import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class qn10 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29012a;
    public final /* synthetic */ bo10 b;

    public /* synthetic */ qn10(bo10 bo10Var, byte b) {
        this.f29012a = b;
        this.b = bo10Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        byte b = this.f29012a;
        bo10 bo10Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                bo10Var.w(th);
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                bo10Var.A(bo10Var.Q, true);
                bo10Var.w(th2);
                break;
            case 2:
                long jLongValue = ((Long) obj).longValue();
                long j = jLongValue / 3600000;
                long millis = jLongValue - TimeUnit.HOURS.toMillis(j);
                long j2 = millis / 60000;
                xmq0 xmq0Var = new xmq0(j, j2, (millis - TimeUnit.MINUTES.toMillis(j2)) / 1000);
                p7m0 p7m0Var = bo10Var.y;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, snq0.a((snq0) value, null, xmq0Var, 1)));
                break;
            default:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                bo10Var.A(bo10Var.Q, true);
                bo10Var.w(th3);
                break;
        }
        return Unit.f46060a;
    }
}
