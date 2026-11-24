package a;

import android.gov.nist.core.Separators;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes3.dex */
public final class bl50 implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1e f2778a;
    public final iqi b;

    public bl50(m1e m1eVar, iqi iqiVar) {
        m1eVar.getClass();
        this.f2778a = m1eVar;
        this.b = iqiVar;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        Request request = realInterceptorChain.e;
        if (this.f2778a.c()) {
            return realInterceptorChain.b(b(realInterceptorChain));
        }
        request.getClass();
        return request.b(sre0.f32672a.b(fk9.class)) != null ? realInterceptorChain.b(request) : realInterceptorChain.b(b(realInterceptorChain));
    }

    public final Request b(RealInterceptorChain realInterceptorChain) throws Throwable {
        Object g0g0Var;
        Object obj;
        String str;
        Object g0g0Var2;
        Throwable unknownHostException;
        Request request = realInterceptorChain.e;
        iqi iqiVar = this.b;
        String str2 = request.f46108a.i;
        synchronized (iqiVar) {
            try {
                if (!Intrinsics.d(ujn.h, "https://mob-experience.space")) {
                    str = str2;
                    if (ujn.h.length() == 0) {
                    }
                }
                e0g0 e0g0Var = j0g0.b;
                String strC = ((twb0) ((wsb0) ((drm0) ((cad) iqiVar.c).b).f6568a)).f34643a.c("SAFE_DOMAIN", "");
                if (strC.length() == 0) {
                    throw new qtj(str2);
                }
                ujn.h = strC;
                g0g0Var = kotlin.text.c.r(str2, "https://mob-experience.space", strC, false);
                Throwable thA = j0g0.a(g0g0Var);
                if (thA == null) {
                    obj = g0g0Var;
                } else {
                    wti wtiVar = (wti) iqiVar.b;
                    new Exception(thA);
                    synchronized (wtiVar) {
                        ((twb0) ((wsb0) ((ilp0) wtiVar.b).f14992a)).f34643a.b().getInt("ATTEMPTS_VALUE", 0);
                        ((AtomicBoolean) wtiVar.c).compareAndSet(false, true);
                        ((twb0) ((wsb0) ((ilp0) wtiVar.b).f14992a)).f34643a.f(0, "ATTEMPTS_VALUE");
                        obj = str2;
                    }
                }
                str = (String) obj;
            } catch (Throwable th) {
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        }
        try {
            e0g0 e0g0Var3 = j0g0.b;
            if (str.length() <= 0 || str.equals(request.f46108a.i)) {
                g0g0Var2 = request;
            } else {
                Request.Builder builderA = request.a();
                builderA.d(str);
                g0g0Var2 = new Request(builderA);
            }
        } catch (Throwable th2) {
            e0g0 e0g0Var4 = j0g0.b;
            g0g0Var2 = new g0g0(th2);
        }
        Throwable thA2 = j0g0.a(g0g0Var2);
        if (thA2 == null) {
            return (Request) g0g0Var2;
        }
        if (thA2 instanceof UnknownHostException) {
            unknownHostException = new UnknownHostException("original: " + thA2.getMessage() + Separators.SP + thA2.getCause() + "additional: " + request.f46108a);
        } else if (thA2 instanceof ConnectException) {
            unknownHostException = new ConnectException("original: " + thA2.getMessage() + Separators.SP + thA2.getCause() + "additional: " + request.f46108a);
        } else if (thA2 instanceof SocketException) {
            unknownHostException = new SocketException("original: " + thA2.getMessage() + Separators.SP + thA2.getCause() + "additional: " + request.f46108a);
        } else {
            if (!(thA2 instanceof SocketTimeoutException)) {
                throw thA2;
            }
            unknownHostException = new SocketTimeoutException("original: " + thA2.getMessage() + Separators.SP + thA2.getCause() + "additional: " + request.f46108a);
        }
        throw unknownHostException;
    }
}
