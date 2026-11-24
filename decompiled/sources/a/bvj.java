package a;

import android.gov.nist.core.Separators;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes3.dex */
public final class bvj implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bvj f3280a = new bvj();

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) throws Throwable {
        Object g0g0Var;
        Throwable unknownHostException;
        Request request = realInterceptorChain.e;
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = realInterceptorChain.b(request);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null) {
            return (Response) g0g0Var;
        }
        if (thA instanceof UnknownHostException) {
            unknownHostException = new UnknownHostException("original: " + thA.getMessage() + Separators.SP + thA.getCause() + "additional: " + request.f46108a);
        } else if (thA instanceof ConnectException) {
            unknownHostException = new ConnectException("original: " + thA.getMessage() + Separators.SP + thA.getCause() + "additional: " + request.f46108a);
        } else if (thA instanceof SocketException) {
            unknownHostException = new SocketException("original: " + thA.getMessage() + Separators.SP + thA.getCause() + "additional: " + request.f46108a);
        } else {
            if (!(thA instanceof SocketTimeoutException)) {
                throw thA;
            }
            unknownHostException = new SocketTimeoutException("original: " + thA.getMessage() + Separators.SP + thA.getCause() + "additional: " + request.f46108a);
        }
        throw unknownHostException;
    }
}
