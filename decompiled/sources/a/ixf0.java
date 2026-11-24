package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ixf0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15541a;
    public final /* synthetic */ sxf0 b;

    public /* synthetic */ ixf0(sxf0 sxf0Var, byte b) {
        this.f15541a = b;
        this.b = sxf0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f15541a;
        final sxf0 sxf0Var = this.b;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                final byte b2 = 0;
                sxf0Var.p.b(th, new Function2() { // from class: a.jxf0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        byte b3 = b2;
                        sxf0 sxf0Var2 = sxf0Var;
                        Throwable th2 = (Throwable) obj2;
                        String str = (String) obj3;
                        switch (b3) {
                            case 0:
                                th2.getClass();
                                str.getClass();
                                sxf0Var2.t.f(new nxf0(str));
                                break;
                            default:
                                th2.getClass();
                                str.getClass();
                                sxf0Var2.t.f(new nxf0(str));
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
                break;
            default:
                duj dujVar = sxf0Var.p;
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                sxf0Var.j.a(th2);
                th2.printStackTrace();
                if ((th2 instanceof SocketTimeoutException) || (th2 instanceof UnknownHostException)) {
                    sxf0Var.t.f(oxf0.f26010a);
                } else {
                    final byte b3 = 1;
                    if ((th2 instanceof zhi0) && ((zhi0) th2).c == i2o.TokenExpiredError) {
                        joc jocVar = sxf0Var.o;
                        String message = th2.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        d190 d190Var = (d190) jocVar.f16851a.f10448a;
                        d190Var.getClass();
                        d190Var.g.g(message);
                    } else {
                        dujVar.b(th2, new Function2() { // from class: a.jxf0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                byte b4 = b3;
                                sxf0 sxf0Var2 = sxf0Var;
                                Throwable th3 = (Throwable) obj2;
                                String str = (String) obj3;
                                switch (b4) {
                                    case 0:
                                        th3.getClass();
                                        str.getClass();
                                        sxf0Var2.t.f(new nxf0(str));
                                        break;
                                    default:
                                        th3.getClass();
                                        str.getClass();
                                        sxf0Var2.t.f(new nxf0(str));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    }
                }
                break;
        }
        return Unit.f46060a;
    }
}
