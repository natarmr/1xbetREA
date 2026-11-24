package okhttp3.internal.http;

import a.hjv;
import a.zae0;
import kotlin.Metadata;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/BridgeInterceptor;", "Lokhttp3/Interceptor;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BridgeInterceptor implements Interceptor {
    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        CookieJar cookieJar = realInterceptorChain.l;
        Request request = realInterceptorChain.e;
        Request.Builder builderA = request.a();
        HttpUrl httpUrl = request.f46108a;
        Headers headers = request.c;
        RequestBody requestBody = request.d;
        if (requestBody != null) {
            MediaType d = requestBody.getD();
            if (d != null) {
                builderA.a("Content-Type", d.f46102a);
            }
            long jA = requestBody.a();
            if (jA != -1) {
                builderA.a("Content-Length", String.valueOf(jA));
                builderA.c.d("Transfer-Encoding");
            } else {
                builderA.a("Transfer-Encoding", "chunked");
                builderA.c.d("Content-Length");
            }
        }
        boolean z = false;
        if (headers.b("Host") == null) {
            builderA.a("Host", _UtilJvmKt.i(httpUrl, false));
        }
        if (headers.b("Connection") == null) {
            builderA.a("Connection", "Keep-Alive");
        }
        if (headers.b("Accept-Encoding") == null && headers.b("Range") == null) {
            builderA.a("Accept-Encoding", "gzip");
            z = true;
        }
        cookieJar.a(httpUrl).getClass();
        if (headers.b("User-Agent") == null) {
            builderA.a("User-Agent", "okhttp/5.5.1");
        }
        Request request2 = new Request(builderA);
        Response responseB = realInterceptorChain.b(request2);
        Headers headers2 = responseB.f;
        HttpHeaders.d(cookieJar, request2.f46108a, headers2);
        Response.Builder builderC = responseB.c();
        builderC.f46112a = request2;
        if (z) {
            String strB = headers2.b("Content-Encoding");
            if (strB == null) {
                strB = null;
            }
            if ("gzip".equalsIgnoreCase(strB) && HttpHeaders.a(responseB)) {
                hjv hjvVar = new hjv(responseB.g.getD());
                Headers.Builder builderD = _HeadersCommonKt.d(headers2);
                builderD.d("Content-Encoding");
                builderD.d("Content-Length");
                builderC.f = _HeadersCommonKt.d(_HeadersCommonKt.b(builderD));
                String strB2 = headers2.b("Content-Type");
                builderC.g = new RealResponseBody(strB2 != null ? strB2 : null, -1L, new zae0(hjvVar));
            }
        }
        return builderC.a();
    }
}
