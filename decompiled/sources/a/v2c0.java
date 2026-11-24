package a;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes3.dex */
public final class v2c0 implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x2c0 f36676a;

    public v2c0(x2c0 x2c0Var) {
        x2c0Var.getClass();
        this.f36676a = x2c0Var;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        Request.Builder builderA = realInterceptorChain.e.a();
        m2c0 m2c0VarA = this.f36676a.a();
        if (m2c0VarA != null) {
            builderA.a("X-Country", m2c0VarA.c);
        }
        return realInterceptorChain.b(new Request(builderA));
    }
}
