package a;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.http.RealInterceptorChain;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class buc implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f3223a;
    public final /* synthetic */ Object b;

    public /* synthetic */ buc(Object obj, byte b) {
        this.f3223a = b;
        this.b = obj;
    }

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) {
        byte b = this.f3223a;
        Object obj = this.b;
        switch (b) {
            case 0:
                Request.Builder builderA = realInterceptorChain.e.a();
                builderA.a("User-Agent", (String) ((euc) obj).l.getValue());
                return realInterceptorChain.b(new Request(builderA));
            default:
                Request.Builder builderA2 = realInterceptorChain.e.a();
                builderA2.c.a("Version", "1xbet-prod-v260.1.0");
                String str = ((v8e) obj).f36978a;
                str.getClass();
                builderA2.c.a("User-Agent", str);
                return realInterceptorChain.b(new Request(builderA2));
        }
    }
}
