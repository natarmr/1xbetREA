package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class inc0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15068a;
    public final /* synthetic */ qnc0 b;

    public /* synthetic */ inc0(qnc0 qnc0Var, byte b) {
        this.f15068a = b;
        this.b = qnc0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15068a;
        qnc0 qnc0Var = this.b;
        Throwable th = (Throwable) obj;
        switch (b) {
            case 0:
                th.getClass();
                if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
                    qnc0Var.x();
                } else {
                    ol60 ol60Var = qnc0Var.i;
                    String message = th.getMessage();
                    ol60Var.f(new mnc0(message != null ? message : ""));
                }
                break;
            default:
                th.getClass();
                ol60 ol60Var2 = qnc0Var.i;
                String message2 = th.getMessage();
                ol60Var2.f(new mnc0(message2 != null ? message2 : ""));
                break;
        }
        return Unit.f46060a;
    }
}
