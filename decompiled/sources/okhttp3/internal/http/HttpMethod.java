package okhttp3.internal.http;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HttpMethod {
    public static final boolean a(String str) {
        str.getClass();
        return (Intrinsics.d(str, "GET") || Intrinsics.d(str, "HEAD")) ? false : true;
    }
}
