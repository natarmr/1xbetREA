package a;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cd20 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4141a;
    public final /* synthetic */ qg20 b;

    public /* synthetic */ cd20(qg20 qg20Var, byte b) {
        this.f4141a = b;
        this.b = qg20Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f4141a;
        qg20 qg20Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                qg20Var.t.b(th, new gm10((byte) 29));
                break;
            case 1:
                th.getClass();
                qg20 qg20Var2 = this.b;
                qg20Var2.t.b(th, new e000(2, qg20Var2, qg20.class, "handleAdvanceError", "handleAdvanceError(Ljava/lang/Throwable;Ljava/lang/String;)V", 0, (byte) 17));
                break;
            case 2:
                th.getClass();
                if (!(th instanceof CancellationException)) {
                    qg20Var.e0(hnb0.f13344a);
                }
                break;
            case 3:
                th.getClass();
                qg20Var.t.b(th, new ed20(qg20Var, (byte) 1));
                break;
            case 4:
                th.getClass();
                qg20Var.t.b(th, new ed20(qg20Var, (byte) 3));
                break;
            default:
                th.getClass();
                qg20Var.t.b(th, new fd20((byte) 0));
                break;
        }
        return Unit.f46060a;
    }
}
