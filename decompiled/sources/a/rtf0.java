package a;

import java.util.LinkedHashMap;
import java.util.List;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes5.dex */
public final class rtf0 implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ony f31076a;
    public final List b;

    public rtf0(ony onyVar, List list) {
        onyVar.getClass();
        list.getClass();
        this.f31076a = onyVar;
        this.b = list;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        Response responseB = realInterceptorChain.b(realInterceptorChain.e);
        Request request = responseB.f46111a;
        if (this.b.contains(request.f46108a.b()) && responseB.q) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("requestUrl", ncy.c(request.f46108a.i));
            linkedHashMap.put("response", ncy.b(Integer.valueOf(responseB.d)));
            linkedHashMap.put("responseTime", ncy.b(Long.valueOf(responseB.m - responseB.l)));
            ((rny) this.f31076a).a("", new tny("request", xp20.n(linkedHashMap)));
        }
        return responseB;
    }
}
