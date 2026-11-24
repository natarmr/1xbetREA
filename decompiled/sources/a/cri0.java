package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cri0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4847a;
    public final /* synthetic */ uri0 b;

    public /* synthetic */ cri0(uri0 uri0Var, byte b) {
        this.f4847a = b;
        this.b = uri0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        we50 we50Var;
        byte b = this.f4847a;
        uri0 uri0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                uri0Var.w.f(fri0.f10020a);
                uri0Var.q.a(th);
                break;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                uri0Var.q.a(th2);
                uph0 uph0Var = new uph0(uri0Var, (byte) 16);
                ol60 ol60Var = uri0Var.w;
                duj dujVar = uri0Var.t;
                if ((th2 instanceof SocketTimeoutException) || (th2 instanceof UnknownHostException)) {
                    ol60Var.f(nri0.f24003a);
                } else if ((th2 instanceof zhi0) && ((zhi0) th2).c == i2o.TokenExpiredError) {
                    String message = th2.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    ol60Var.f(new jri0(message));
                } else {
                    dujVar.b(th2, uph0Var);
                }
                break;
            default:
                k0w0 k0w0Var = (k0w0) obj;
                k0w0Var.getClass();
                if (((d190) uri0Var.e.f16851a.f10448a).e == pwf0.b || (we50Var = uri0Var.i.c) == we50.c) {
                    k0w0Var.g();
                    k0w0Var.d();
                } else if (we50Var == we50.b) {
                    k0w0Var.c(iw20.f(uri0Var.n, nqh0.f23960a));
                } else {
                    k0w0Var.c(jh70.j(uri0Var.m, false));
                }
                break;
        }
        return Unit.f46060a;
    }
}
