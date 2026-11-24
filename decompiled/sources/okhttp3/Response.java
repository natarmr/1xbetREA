package okhttp3;

import a.c99;
import a.e9d0;
import a.jf4;
import a.njk0;
import java.io.Closeable;
import kotlin.Metadata;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal.connection.Exchange;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/Response;", "Ljava/io/Closeable;", "Builder", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Response implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Request f46111a;
    public final Protocol b;
    public final String c;
    public final int d;
    public final Handshake e;
    public final Headers f;
    public final ResponseBody g;
    public final njk0 h;
    public final Response i;
    public final Response j;
    public final Response k;
    public final long l;
    public final long m;
    public final Exchange n;
    public final TrailersSource o;
    public CacheControl p;
    public final boolean q;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/Response$Builder;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Request f46112a;
        public Protocol b;
        public String d;
        public Handshake e;
        public njk0 h;
        public Response i;
        public Response j;
        public Response k;
        public long l;
        public long m;
        public Exchange n;
        public int c = -1;
        public ResponseBody g = ResponseBody.f46113a;
        public TrailersSource o = TrailersSource.f46116a;
        public Headers.Builder f = new Headers.Builder();

        public static void b(String str, Response response) {
            if (response != null) {
                if (response.i != null) {
                    c99.s(str.concat(".networkResponse != null"));
                } else if (response.j != null) {
                    c99.s(str.concat(".cacheResponse != null"));
                } else {
                    if (response.k == null) {
                        return;
                    }
                    c99.s(str.concat(".priorResponse != null"));
                }
            }
        }

        public final Response a() {
            int i = this.c;
            if (i < 0) {
                e9d0.p(this.c, "code < 0: ");
                return null;
            }
            Request request = this.f46112a;
            if (request == null) {
                jf4.n("request == null");
                return null;
            }
            Protocol protocol = this.b;
            if (protocol == null) {
                jf4.n("protocol == null");
                return null;
            }
            String str = this.d;
            if (str == null) {
                jf4.n("message == null");
                return null;
            }
            Handshake handshake = this.e;
            Headers.Builder builder = this.f;
            builder.getClass();
            return new Response(request, protocol, str, i, handshake, _HeadersCommonKt.b(builder), this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
        }
    }

    public Response(Request request, Protocol protocol, String str, int i, Handshake handshake, Headers headers, ResponseBody responseBody, njk0 njk0Var, Response response, Response response2, Response response3, long j, long j2, Exchange exchange, TrailersSource trailersSource) {
        request.getClass();
        protocol.getClass();
        str.getClass();
        responseBody.getClass();
        trailersSource.getClass();
        this.f46111a = request;
        this.b = protocol;
        this.c = str;
        this.d = i;
        this.e = handshake;
        this.f = headers;
        this.g = responseBody;
        this.h = njk0Var;
        this.i = response;
        this.j = response2;
        this.k = response3;
        this.l = j;
        this.m = j2;
        this.n = exchange;
        this.o = trailersSource;
        boolean z = false;
        if (200 <= i && i < 300) {
            z = true;
        }
        this.q = z;
    }

    public final CacheControl a() {
        CacheControl cacheControl = this.p;
        if (cacheControl != null) {
            return cacheControl;
        }
        CacheControl cacheControl2 = CacheControl.n;
        CacheControl cacheControlA = CacheControl.Companion.a(this.f);
        this.p = cacheControlA;
        return cacheControlA;
    }

    public final Builder c() {
        Builder builder = new Builder();
        builder.c = -1;
        builder.g = ResponseBody.f46113a;
        builder.o = TrailersSource.f46116a;
        builder.f46112a = this.f46111a;
        builder.b = this.b;
        builder.c = this.d;
        builder.d = this.c;
        builder.e = this.e;
        builder.f = _HeadersCommonKt.d(this.f);
        builder.g = this.g;
        builder.h = this.h;
        builder.i = this.i;
        builder.j = this.j;
        builder.k = this.k;
        builder.l = this.l;
        builder.m = this.m;
        builder.n = this.n;
        builder.o = this.o;
        return builder;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.g.close();
    }

    public final String toString() {
        return "Response{protocol=" + this.b + ", code=" + this.d + ", message=" + this.c + ", url=" + this.f46111a.f46108a + '}';
    }
}
