package a;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes2.dex */
public final class kqt0 implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xyj f18737a;

    public kqt0(xyj xyjVar) {
        this.f18737a = xyjVar;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        Request.Builder builderA = realInterceptorChain.e.a();
        builderA.a("User-Agent", (String) this.f18737a.d.getValue());
        return realInterceptorChain.b(new Request(builderA));
    }
}
