package okhttp3.internal;

import kotlin.Metadata;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UnreadableResponseBodyKt {
    public static final Response a(Response response) {
        response.getClass();
        Response.Builder builderC = response.c();
        ResponseBody responseBody = response.g;
        builderC.g = new UnreadableResponseBody(responseBody.getB(), responseBody.getC());
        return builderC.a();
    }
}
