package a;

import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes5.dex */
public final class ovq0 implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hse0 f25936a;
    public final okt0 b;
    public final y9o0 c;

    public ovq0(hse0 hse0Var, okt0 okt0Var, y9o0 y9o0Var) {
        this.f25936a = hse0Var;
        this.b = okt0Var;
        this.c = y9o0Var;
    }

    public static Response b(String str, Request request, RealInterceptorChain realInterceptorChain) {
        Request request2 = realInterceptorChain.e;
        Request.Builder builderA = request2.a();
        Headers.Builder builder = new Headers.Builder();
        builder.b(request2.c);
        Headers headers = request.c;
        String strB = headers.b("X-Auth");
        if (strB == null || strB.length() <= 0) {
            String strB2 = headers.b("Authorization");
            if (strB2 != null && strB2.length() > 0) {
                builder.e("Authorization", str);
            }
        } else {
            builder.e("X-Auth", str);
        }
        builderA.c = _HeadersCommonKt.d(_HeadersCommonKt.b(builder));
        return realInterceptorChain.b(new Request(builderA));
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) throws j7t0, fpd0 {
        String strB;
        String str;
        Request request = realInterceptorChain.e;
        request.getClass();
        HttpUrl httpUrl = request.f46108a;
        Headers headers = request.c;
        if (headers.b("X-Auth") != null || headers.b("Authorization") != null) {
            Object objB = request.b(sre0.f32672a.b(Object.class));
            if (!Intrinsics.d(objB != null ? objB.getClass() : null, lwf.class)) {
                String strB2 = headers.b("X-Auth");
                if ((strB2 != null && strB2.length() == 0) || ((strB = headers.b("Authorization")) != null && strB.length() == 0)) {
                    throw new j7t0("TOKEN IS EMPTY " + httpUrl);
                }
                okt0 okt0Var = this.b;
                String strA = ((btt0) okt0Var.b).a();
                String strC = ((btt0) okt0Var.f25422a).f3200a.c("refresh_token", "");
                boolean z = strA.length() == 0;
                boolean z2 = strC.length() == 0;
                if (!z && !z2) {
                    mvq0 mvq0Var = new mvq0(this, strA, null);
                    kotlin.coroutines.g gVar = kotlin.coroutines.g.f46065a;
                    String str2 = (String) eeq.U(gVar, mvq0Var);
                    Response responseB = !Intrinsics.d(str2, strA) ? b(str2, request, realInterceptorChain) : realInterceptorChain.b(request);
                    if (responseB.d != 401) {
                        return responseB;
                    }
                    responseB.close();
                    return b((String) eeq.U(gVar, new nvq0(this, strA, null)), request, realInterceptorChain);
                }
                if (z && z2) {
                    str = "LAST_AND_REFRESH_TOKEN_EMPTY";
                } else {
                    str = z ? "LAST_TOKEN_EMPTY" : "REFRESH_TOKEN_EMPTY";
                }
                String str3 = "Reason: " + str + " | URL: " + httpUrl;
                this.c.a(str3);
                throw new fpd0(str3);
            }
        }
        return realInterceptorChain.b(request);
    }
}
