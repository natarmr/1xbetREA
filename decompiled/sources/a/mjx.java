package a;

import com.google.firebase.perf.util.Timer;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* JADX INFO: loaded from: classes2.dex */
public final class mjx implements ResponseHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ResponseHandler f21917a;
    public final Timer b;
    public final ml50 c;

    public mjx(ResponseHandler responseHandler, Timer timer, ml50 ml50Var) {
        this.f21917a = responseHandler;
        this.b = timer;
        this.c = ml50Var;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final Object handleResponse(HttpResponse httpResponse) {
        this.c.m(this.b.a());
        this.c.g(httpResponse.getStatusLine().getStatusCode());
        Long lA = nl50.a(httpResponse);
        if (lA != null) {
            this.c.l(lA.longValue());
        }
        String strB = nl50.b(httpResponse);
        if (strB != null) {
            this.c.k(strB);
        }
        this.c.b();
        return this.f21917a.handleResponse(httpResponse);
    }
}
