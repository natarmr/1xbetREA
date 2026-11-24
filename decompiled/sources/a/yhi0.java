package a;

import okhttp3.Interceptor;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes5.dex */
public final class yhi0 implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vby f42639a;

    public yhi0(vby vbyVar) {
        vbyVar.getClass();
        this.f42639a = vbyVar;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d A[Catch: Exception -> 0x0098, TryCatch #1 {Exception -> 0x0098, blocks: (B:10:0x002b, B:19:0x005b, B:27:0x0068, B:29:0x006c, B:32:0x0072, B:35:0x007f, B:37:0x0083, B:41:0x008a, B:43:0x0090, B:34:0x007d, B:23:0x0061, B:24:0x0064, B:21:0x005f, B:13:0x0030, B:15:0x0049), top: B:49:0x002b, inners: #0, #2 }] */
    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) throws zhi0 {
        uhi0 uhi0Var;
        String str;
        Response responseB = realInterceptorChain.b(realInterceptorChain.e);
        String str2 = responseB.c;
        int i = responseB.d;
        if (i == 204) {
            ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ulx.f35894a;
            Response.Builder builderC = responseB.c();
            builderC.c = android.javax.sip.message.Response.OK;
            ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$2 = ulx.f35894a;
            responseBody$Companion$asResponseBody$2.getClass();
            builderC.g = responseBody$Companion$asResponseBody$2;
            return builderC.a();
        }
        if (responseB.q) {
            return responseB;
        }
        vby vbyVar = this.f42639a;
        try {
            ResponseBody responseBody = responseB.g;
            Integer numValueOf = null;
            if (responseBody != null) {
                try {
                    String strK = responseBody.k();
                    vbyVar.getClass();
                    uhi0Var = ((xhi0) vbyVar.b(xhi0.Companion.serializer(), strK)).f40894a;
                    if (uhi0Var == null) {
                        uhi0Var = (uhi0) vbyVar.b(uhi0.Companion.serializer(), strK);
                    }
                    responseBody.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        bkb.E(responseBody, th);
                        throw th2;
                    }
                }
            } else {
                uhi0Var = null;
            }
            if (uhi0Var != null) {
                w0o w0oVar = uhi0Var.g;
                i2o i2oVar = w0oVar != null ? w0oVar.b : null;
                if (i2oVar != null) {
                    numValueOf = Integer.valueOf(i2oVar.getErrorCode());
                } else if (uhi0Var != null) {
                    numValueOf = uhi0Var.c;
                }
            } else if (uhi0Var != null) {
                numValueOf = uhi0Var.c;
            }
            if (uhi0Var == null || (str = uhi0Var.b) == null) {
                str = str2;
            }
            throw new zhi0(str, numValueOf != null ? numValueOf.intValue() : i, uhi0Var, Integer.valueOf(i));
        } catch (Exception unused) {
            throw new zhi0(str2, i, Integer.valueOf(i), 4);
        }
    }
}
