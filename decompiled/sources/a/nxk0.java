package a;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes3.dex */
public final class nxk0 implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wdu f24287a;

    public nxk0(wdu wduVar) {
        this.f24287a = wduVar;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        return realInterceptorChain.b((Request) eeq.U(kotlin.coroutines.g.f46065a, new mxk0(this, realInterceptorChain, null)));
    }
}
