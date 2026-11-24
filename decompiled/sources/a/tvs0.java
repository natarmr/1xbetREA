package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tvs0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34617a;
    public final /* synthetic */ dws0 b;

    public /* synthetic */ tvs0(dws0 dws0Var, byte b) {
        this.f34617a = b;
        this.b = dws0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f34617a;
        dws0 dws0Var = this.b;
        Throwable th = (Throwable) obj;
        String str = (String) obj2;
        b1j.z(str, th);
        switch (b) {
            case 0:
                dws0Var.j.f(new yvs0(str));
                break;
            default:
                if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
                    dws0Var.j.f(zvs0.f45073a);
                } else if (th instanceof zhi0) {
                    dws0Var.j.f(new xvs0(new pvs0(((zhi0) th).c.getErrorCode(), str)));
                } else if (th instanceof fn50) {
                    fn50 fn50Var = (fn50) th;
                    dws0Var.j.f(new xvs0(new ovs0(fn50Var.f9817a, fn50Var.b, fn50Var.c, fn50Var.f, fn50Var.d, fn50Var.e, fn50Var.g)));
                } else {
                    dws0Var.c.c("Login error: " + th.getMessage(), th);
                    Class<?> cls = th.getClass();
                    String message = th.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    dws0Var.j.f(new xvs0(new nvs0(cls, message)));
                }
                break;
        }
        return Unit.f46060a;
    }
}
