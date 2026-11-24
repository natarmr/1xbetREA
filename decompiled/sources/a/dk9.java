package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.CacheControl;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
public final class dk9 implements Interceptor {
    public static final List b = q3d.j("Accept", "Authorization", "X-Auth", "X-Language", "X-FCountry", "X-Country", "fcountry", "country");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yi9 f6219a;

    public dk9(yi9 yi9Var) {
        yi9Var.getClass();
        this.f6219a = yi9Var;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        String strB;
        String strB2;
        Object objInvoke;
        lu00 lu00Var;
        Request request = realInterceptorChain.e;
        request.getClass();
        fk9 fk9Var = (fk9) request.b(sre0.f32672a.b(fk9.class));
        if (fk9Var != null) {
            String str = request.b;
            Headers headers = request.c;
            if (Intrinsics.d(str, "GET") && kotlin.text.c.x(request.f46108a.f46100a, "http", false) && (((strB = headers.b("Accept")) == null || !StringsKt.O(strB, "text/event-stream", false)) && ((strB2 = headers.b("Upgrade")) == null || !StringsKt.O(strB2, "websocket", false)))) {
                String strB0 = CollectionsKt.b0(b, HiAnalyticsConstant.REPORT_VAL_SEPARATOR, null, null, new d38(request, (byte) 21), 30);
                HttpUrl httpUrl = request.f46108a;
                StringBuilder sb = new StringBuilder(httpUrl.b());
                if (httpUrl.d() != null) {
                    sb.append(Separators.QUESTION);
                    sb.append(httpUrl.d());
                }
                String string = sb.toString();
                String strValueOf = String.valueOf((request.b + Separators.COLON + string + Separators.COLON + strB0).hashCode());
                yi9 yi9Var = this.f6219a;
                ng0 ng0Var = new ng0(fk9Var, this, strValueOf, realInterceptorChain, request, (byte) 4);
                yi9Var.getClass();
                strValueOf.getClass();
                lu00 lu00Var2 = (lu00) yi9Var.f42676a.get(strValueOf);
                if (lu00Var2 == null) {
                    synchronized (yi9Var.f42676a) {
                        lu00Var = (lu00) yi9Var.f42676a.get(strValueOf);
                        if (lu00Var == null) {
                            lu00Var = new lu00();
                            yi9Var.f42676a.put(strValueOf, lu00Var);
                        }
                    }
                    lu00Var2 = lu00Var;
                }
                try {
                    lu00Var2.b.incrementAndGet();
                    synchronized (lu00Var2.f20651a) {
                        objInvoke = ng0Var.invoke();
                    }
                    if (lu00Var2.b.decrementAndGet() == 0) {
                        synchronized (yi9Var.f42676a) {
                        }
                    }
                    return (Response) objInvoke;
                } catch (Throwable th) {
                    if (lu00Var2.b.decrementAndGet() != 0) {
                        throw th;
                    }
                    synchronized (yi9Var.f42676a) {
                        throw th;
                    }
                }
            }
        }
        return realInterceptorChain.b(request);
    }

    public final Response b(String str, Request request, RealInterceptorChain realInterceptorChain) {
        Throwable th;
        Response responseB = realInterceptorChain.b(request);
        ResponseBody responseBody = responseB.g;
        u99 d = responseBody.getD();
        d.G(Long.MAX_VALUE);
        f99 f99VarD = d.g().d();
        MediaType b2 = responseBody.getB();
        long c = responseBody.getC();
        CacheControl cacheControlA = responseB.a();
        boolean z = (cacheControlA.b || cacheControlA.f46078a || cacheControlA.c <= 0) ? false : responseB.q;
        yi9 yi9Var = this.f6219a;
        if (z) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = responseB.a().c * 1000;
            ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1 = ResponseBody.f46113a;
            ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$2 = new ResponseBody$Companion$asResponseBody$1(b2, c, f99VarD.d());
            Response.Builder builderC = responseB.c();
            builderC.g = responseBody$Companion$asResponseBody$2;
            String strValueOf = String.valueOf(jCurrentTimeMillis);
            strValueOf.getClass();
            builderC.f.e("X-Cache-CreatedAt", strValueOf);
            Response responseA = builderC.a();
            yi9Var.getClass();
            str.getClass();
            DiskLruCache.Editor editorEdit$default = DiskLruCache.edit$default(yi9Var.a(), str, 0L, 2, null);
            if (editorEdit$default != null) {
                try {
                    Request request2 = responseA.f46111a;
                    si9 si9Var = new si9(request2.f46108a.i, request2.b, responseA.b, responseA.d, responseA.c, responseA.f, System.currentTimeMillis(), j);
                    yae0 yae0Var = new yae0(editorEdit$default.d(0));
                    yae0Var.D(si9Var.toString());
                    yae0Var.flush();
                    yae0Var.close();
                    u99 d2 = responseA.g.getD();
                    try {
                        yae0 yae0Var2 = new yae0(editorEdit$default.d(1));
                        yae0Var2.P(d2);
                        yae0Var2.flush();
                        yae0Var2.close();
                        try {
                            d2.close();
                            th = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                        if (d2 != null) {
                            try {
                                d2.close();
                            } catch (Throwable th4) {
                                tjo.a(th3, th4);
                            }
                        }
                        th = th3;
                    }
                    if (th != null) {
                        throw th;
                    }
                    editorEdit$default.b();
                    yi9Var.a().flush();
                } catch (Throwable th5) {
                    th5.printStackTrace();
                    editorEdit$default.a();
                    yi9Var.a().remove(str);
                    yi9Var.a().flush();
                }
            }
        } else {
            yi9Var.getClass();
            str.getClass();
            yi9Var.a().remove(str);
            yi9Var.a().flush();
        }
        Response.Builder builderC2 = responseB.c();
        ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$3 = ResponseBody.f46113a;
        builderC2.g = new ResponseBody$Companion$asResponseBody$1(b2, c, f99VarD.d());
        return builderC2.a();
    }
}
