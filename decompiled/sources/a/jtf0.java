package a;

import okhttp3.Response;
import okhttp3.ResponseBody$Companion$asResponseBody$1;

/* JADX INFO: loaded from: classes4.dex */
public final class jtf0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Response f17098a;
    public final Object b;

    public jtf0(Response response, Object obj) {
        this.f17098a = response;
        this.b = obj;
    }

    public static jtf0 a(ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1, Response response) {
        if (!response.q) {
            return new jtf0(response, null);
        }
        jf4.o("rawResponse should not be successful response");
        return null;
    }

    public final String toString() {
        return this.f17098a.toString();
    }
}
