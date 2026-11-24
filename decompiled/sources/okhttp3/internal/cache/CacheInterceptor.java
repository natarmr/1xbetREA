package okhttp3.internal.cache;

import kotlin.Metadata;
import kotlin.text.c;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.UnreadableResponseBodyKt;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor;", "Lokhttp3/Interceptor;", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CacheInterceptor implements Interceptor {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static boolean a(String str) {
            return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
        }
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) throws Throwable {
        Headers headers;
        RealCall realCall = realInterceptorChain.f46172a;
        System.currentTimeMillis();
        Request request = realInterceptorChain.e;
        request.getClass();
        Throwable th = null;
        CacheStrategy cacheStrategy = new CacheStrategy(request, null);
        CacheControl cacheControlA = request.f;
        if (cacheControlA == null) {
            CacheControl cacheControl = CacheControl.n;
            cacheControlA = CacheControl.Companion.a(request.c);
            request.f = cacheControlA;
        }
        if (cacheControlA.j) {
            cacheStrategy = new CacheStrategy(null, null);
        }
        Request request2 = cacheStrategy.f46126a;
        Response response = cacheStrategy.b;
        if (request2 == null && response == null) {
            Response.Builder builder = new Response.Builder();
            Request request3 = realInterceptorChain.e;
            request3.getClass();
            builder.f46112a = request3;
            builder.b = Protocol.HTTP_1_1;
            builder.c = android.javax.sip.message.Response.SERVER_TIMEOUT;
            builder.d = "Unsatisfiable Request (only-if-cached)";
            builder.l = -1L;
            builder.m = System.currentTimeMillis();
            Response responseA = builder.a();
            realInterceptorChain.f46172a.eventListener.D(realCall, responseA);
            return responseA;
        }
        if (request2 == null) {
            response.getClass();
            Response.Builder builderC = response.c();
            Response responseA2 = UnreadableResponseBodyKt.a(response);
            Response.Builder.b("cacheResponse", responseA2);
            builderC.j = responseA2;
            Response responseA3 = builderC.a();
            realInterceptorChain.f46172a.eventListener.b(realCall, responseA3);
            return responseA3;
        }
        if (response != null) {
            realInterceptorChain.f46172a.eventListener.a(realCall, response);
        }
        Response responseB = realInterceptorChain.b(request2);
        if (response != null) {
            if (responseB.d == 304) {
                Response.Builder builderC2 = response.c();
                Headers headers2 = response.f;
                Headers headers3 = responseB.f;
                Headers.Builder builder2 = new Headers.Builder();
                int size = headers2.size();
                int i = 0;
                while (i < size) {
                    String strC = _HeadersCommonKt.c(headers2, i);
                    Throwable th2 = th;
                    String strE = _HeadersCommonKt.e(headers2, i);
                    if ("Warning".equalsIgnoreCase(strC)) {
                        headers = headers2;
                        if (c.x(strE, "1", false)) {
                        }
                        i++;
                        th = th2;
                        headers2 = headers;
                    } else {
                        headers = headers2;
                    }
                    if ("Content-Length".equalsIgnoreCase(strC) || "Content-Encoding".equalsIgnoreCase(strC) || "Content-Type".equalsIgnoreCase(strC) || !Companion.a(strC) || headers3.b(strC) == null) {
                        _HeadersCommonKt.a(builder2, strC, strE);
                    }
                    i++;
                    th = th2;
                    headers2 = headers;
                }
                Throwable th3 = th;
                int size2 = headers3.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String strC2 = _HeadersCommonKt.c(headers3, i2);
                    if (!"Content-Length".equalsIgnoreCase(strC2) && !"Content-Encoding".equalsIgnoreCase(strC2) && !"Content-Type".equalsIgnoreCase(strC2) && Companion.a(strC2)) {
                        _HeadersCommonKt.a(builder2, strC2, _HeadersCommonKt.e(headers3, i2));
                    }
                }
                builderC2.f = _HeadersCommonKt.d(_HeadersCommonKt.b(builder2));
                builderC2.l = responseB.l;
                builderC2.m = responseB.m;
                Response responseA4 = UnreadableResponseBodyKt.a(response);
                Response.Builder.b("cacheResponse", responseA4);
                builderC2.j = responseA4;
                Response responseA5 = UnreadableResponseBodyKt.a(responseB);
                Response.Builder.b("networkResponse", responseA5);
                builderC2.i = responseA5;
                builderC2.a();
                responseB.g.close();
                throw th3;
            }
            _UtilCommonKt.b(response.g);
        }
        Response.Builder builderC3 = responseB.c();
        Response responseA6 = response != null ? UnreadableResponseBodyKt.a(response) : null;
        Response.Builder.b("cacheResponse", responseA6);
        builderC3.j = responseA6;
        Response responseA7 = UnreadableResponseBodyKt.a(responseB);
        Response.Builder.b("networkResponse", responseA7);
        builderC3.i = responseA7;
        return builderC3.a();
    }
}
