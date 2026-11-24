package a;

import android.gov.nist.core.Separators;
import java.net.ConnectException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes5.dex */
public final class i1d0 implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iw20 f13992a;

    public i1d0(iw20 iw20Var) {
        this.f13992a = iw20Var;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) throws Throwable {
        Object g0g0Var;
        Throwable unknownHostException;
        Request request = realInterceptorChain.e;
        try {
            e0g0 e0g0Var = j0g0.b;
            o1d0 o1d0Var = (o1d0) ((y1d0) this.f13992a.f15470a).f41850a.f15729a.getValue();
            o1d0Var.getClass();
            if (o1d0Var instanceof n1d0) {
                List listJ = q3d.j("/ProphylaxisStatus/v2/mobile", "/ProphylaxisStatus/v1/technicalProblems");
                if (listJ == null || !listJ.isEmpty()) {
                    Iterator it = listJ.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (StringsKt.O(request.f46108a.b(), (String) it.next(), false)) {
                                g0g0Var = realInterceptorChain.b(request);
                            }
                        }
                    }
                }
                ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ulx.f35894a;
                request.getClass();
                Response.Builder builder = new Response.Builder();
                builder.c = 2288;
                ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$2 = ResponseBody.f46113a;
                builder.g = ResponseBody.Companion.a("", null);
                builder.b = Protocol.HTTP_1_1;
                builder.d = "";
                builder.f46112a = request;
                g0g0Var = builder.a();
            } else {
                g0g0Var = realInterceptorChain.b(request);
            }
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
