package a;

import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody$Companion$asResponseBody$1;
import okhttp3.internal._HeadersCommonKt;

/* JADX INFO: loaded from: classes5.dex */
public abstract class mtf0 {
    public static final Response a(si9 si9Var, ResponseBody$Companion$asResponseBody$1 responseBody$Companion$asResponseBody$1) {
        Response.Builder builder = new Response.Builder();
        Request.Builder builder2 = new Request.Builder();
        builder2.d(si9Var.f32250a);
        builder2.b(si9Var.b, null);
        builder.f46112a = new Request(builder2);
        Protocol protocol = si9Var.c;
        protocol.getClass();
        builder.b = protocol;
        builder.c = si9Var.d;
        String str = si9Var.e;
        str.getClass();
        builder.d = str;
        builder.f = _HeadersCommonKt.d(si9Var.f);
        builder.g = responseBody$Companion$asResponseBody$1;
        return builder.a();
    }
}
