package okhttp3;

import a.azw;
import a.c99;
import a.jf4;
import a.kng0;
import a.q3d;
import a.sgy;
import a.sre0;
import a.y2;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import okhttp3.internal.EmptyTags;
import okhttp3.internal.Tags;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.http.HttpMethod;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Request;", "", "Builder", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Request {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpUrl f46108a;
    public final String b;
    public final Headers c;
    public final RequestBody d;
    public final Tags e;
    public CacheControl f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Request$Builder;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HttpUrl f46109a;
        public RequestBody d;
        public Tags e = EmptyTags.f46118a;
        public String b = "GET";
        public Headers.Builder c = new Headers.Builder();

        public final void a(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.c.e(str, str2);
        }

        public final void b(String str, RequestBody requestBody) {
            str.getClass();
            if (str.length() <= 0) {
                jf4.o("method.isEmpty() == true");
                return;
            }
            if (requestBody == null) {
                if (str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH") || str.equals("QUERY") || str.equals("REPORT")) {
                    c99.s(kng0.l("method ", str, " must have a request body."));
                    return;
                }
            } else if (!HttpMethod.a(str)) {
                c99.s(kng0.l("method ", str, " must not have a request body."));
                return;
            }
            this.b = str;
            this.d = requestBody;
        }

        public final void c(Class cls, Object obj) {
            cls.getClass();
            this.e = this.e.b(sre0.f32672a.b(cls), obj);
        }

        public final void d(String str) {
            str.getClass();
            if (c.x(str, "ws:", true)) {
                str = "http:".concat(str.substring(3));
            } else if (c.x(str, "wss:", true)) {
                str = "https:".concat(str.substring(4));
            }
            this.f46109a = HttpUrl.Companion.b(str);
        }
    }

    public Request(Builder builder) {
        HttpUrl httpUrl = builder.f46109a;
        if (httpUrl == null) {
            jf4.n("url == null");
            throw null;
        }
        this.f46108a = httpUrl;
        this.b = builder.b;
        Headers.Builder builder2 = builder.c;
        builder2.getClass();
        this.c = _HeadersCommonKt.b(builder2);
        this.d = builder.d;
        this.e = builder.e;
    }

    public final Builder a() {
        Builder builder = new Builder();
        builder.f46109a = this.f46108a;
        builder.b = this.b;
        builder.d = this.d;
        builder.e = this.e;
        builder.c = _HeadersCommonKt.d(this.c);
        return builder;
    }

    public final Object b(sgy sgyVar) {
        sgyVar.getClass();
        return azw.G(sgyVar).cast(this.e.a(sgyVar));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append("Request{method=");
        sb.append(this.b);
        sb.append(", url=");
        sb.append(this.f46108a);
        Headers headers = this.c;
        if (headers.size() != 0) {
            sb.append(", headers=[");
            Iterator<Pair<? extends String, ? extends String>> it = headers.iterator();
            int i = 0;
            while (true) {
                y2 y2Var = (y2) it;
                if (!y2Var.hasNext()) {
                    sb.append(']');
                    break;
                }
                Object next = y2Var.next();
                int i2 = i + 1;
                if (i < 0) {
                    q3d.p();
                    throw null;
                }
                Pair pair = (Pair) next;
                String str = (String) pair.f46059a;
                String str2 = (String) pair.b;
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                if (_UtilCommonKt.m(str)) {
                    str2 = "██";
                }
                sb.append(str2);
                i = i2;
            }
        }
        EmptyTags emptyTags = EmptyTags.f46118a;
        Tags tags = this.e;
        if (!Intrinsics.d(tags, emptyTags)) {
            sb.append(", tags=");
            sb.append(tags);
        }
        sb.append('}');
        return sb.toString();
    }
}
