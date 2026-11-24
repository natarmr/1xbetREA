package okhttp3.internal.http2;

import a.e9d0;
import a.emk0;
import a.njk0;
import a.ohq;
import a.qg9;
import a.s5k0;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Http2ExchangeCodec implements ExchangeCodec {
    public static final List g = _UtilJvmKt.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List h = _UtilJvmKt.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RealConnection f46190a;
    public final RealInterceptorChain b;
    public final Http2Connection c;
    public volatile Http2Stream d;
    public final Protocol e;
    public volatile boolean f;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;", "", "", "CONNECTION", "Ljava/lang/String;", "HOST", "KEEP_ALIVE", "PROXY_CONNECTION", "TRANSFER_ENCODING", "TE", "ENCODING", "UPGRADE", "", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        http2Connection.getClass();
        this.f46190a = realConnection;
        this.b = realInterceptorChain;
        this.c = http2Connection;
        List list = okHttpClient.s;
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void a() throws SocketTimeoutException {
        Http2Stream http2Stream = this.d;
        http2Stream.getClass();
        http2Stream.i.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final emk0 b(Response response) {
        Http2Stream http2Stream = this.d;
        http2Stream.getClass();
        return http2Stream.h;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long c(Response response) {
        if (HttpHeaders.a(response)) {
            return _UtilJvmKt.e(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        this.f = true;
        Http2Stream http2Stream = this.d;
        if (http2Stream != null) {
            http2Stream.g(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final s5k0 d(Request request, long j) {
        request.getClass();
        Http2Stream http2Stream = this.d;
        http2Stream.getClass();
        return http2Stream.i;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void e(Request request) throws IOException {
        int i;
        Http2Stream http2Stream;
        boolean z;
        request.getClass();
        if (this.d != null) {
            return;
        }
        boolean z2 = request.d != null;
        Headers headers = request.c;
        ArrayList arrayList = new ArrayList(headers.size() + 4);
        arrayList.add(new Header(Header.f, request.b));
        qg9 qg9Var = Header.g;
        HttpUrl httpUrl = request.f46108a;
        httpUrl.getClass();
        String strB = httpUrl.b();
        String strD = httpUrl.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new Header(qg9Var, strB));
        String strB2 = request.c.b("Host");
        if (strB2 != null) {
            arrayList.add(new Header(Header.i, strB2));
        }
        arrayList.add(new Header(Header.h, httpUrl.f46100a));
        int size = headers.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strC = _HeadersCommonKt.c(headers, i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strC.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && _HeadersCommonKt.e(headers, i2).equals("trailers"))) {
                arrayList.add(new Header(lowerCase, _HeadersCommonKt.e(headers, i2)));
            }
        }
        Http2Connection http2Connection = this.c;
        http2Connection.getClass();
        boolean z3 = !z2;
        synchronized (http2Connection.x) {
            synchronized (http2Connection) {
                try {
                    if (http2Connection.e > 1073741823) {
                        http2Connection.e(ErrorCode.REFUSED_STREAM);
                    }
                    if (http2Connection.f) {
                        throw new ConnectionShutdownException();
                    }
                    i = http2Connection.e;
                    http2Connection.e = i + 2;
                    http2Stream = new Http2Stream(i, http2Connection, z3, false, null);
                    z = !z2 || http2Connection.u >= http2Connection.v || http2Stream.d >= http2Stream.e;
                    if (http2Stream.j()) {
                        http2Connection.b.put(Integer.valueOf(i), http2Stream);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            http2Connection.x.k(i, arrayList, z3);
        }
        if (z) {
            http2Connection.x.flush();
        }
        this.d = http2Stream;
        boolean z4 = this.f;
        Http2Stream http2Stream2 = this.d;
        if (z4) {
            http2Stream2.getClass();
            http2Stream2.g(ErrorCode.CANCEL);
            ohq.l("Canceled");
            return;
        }
        http2Stream2.getClass();
        Http2Stream.StreamTimeout streamTimeout = http2Stream2.j;
        long j = this.b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        streamTimeout.g(j, timeUnit);
        Http2Stream http2Stream3 = this.d;
        http2Stream3.getClass();
        http2Stream3.k.g(this.b.h, timeUnit);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final boolean f() {
        boolean z;
        Http2Stream http2Stream = this.d;
        if (http2Stream != null) {
            synchronized (http2Stream) {
                Http2Stream.FramingSource framingSource = http2Stream.h;
                z = framingSource.b && framingSource.d.v0();
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    @Override // okhttp3.internal.http.ExchangeCodec
    public final Response.Builder g(boolean z) throws IOException {
        int i;
        Headers headers;
        Http2Stream http2Stream = this.d;
        if (http2Stream == null) {
            ohq.l("stream wasn't created");
            return null;
        }
        synchronized (http2Stream) {
            while (true) {
                if (!http2Stream.f.isEmpty() || http2Stream.h() != null) {
                    break;
                }
                if (!z) {
                    http2Stream.b.getClass();
                    Http2Stream.FramingSink framingSink = http2Stream.i;
                    i = framingSink.c || framingSink.f46194a ? 1 : 0;
                }
                if (i != 0) {
                    http2Stream.j.i();
                }
                try {
                    try {
                        http2Stream.wait();
                        if (i != 0) {
                            http2Stream.j.l();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    if (i != 0) {
                        http2Stream.j.l();
                    }
                    throw th;
                }
            }
            if (http2Stream.f.isEmpty()) {
                IOException iOException = http2Stream.m;
                if (iOException != null) {
                    throw iOException;
                }
                ErrorCode errorCodeH = http2Stream.h();
                errorCodeH.getClass();
                throw new StreamResetException(errorCodeH);
            }
            Object objRemoveFirst = http2Stream.f.removeFirst();
            objRemoveFirst.getClass();
            headers = (Headers) objRemoveFirst;
        }
        Protocol protocol = this.e;
        Headers.Builder builder = new Headers.Builder();
        int size = headers.size();
        StatusLine statusLineA = null;
        for (i = 0; i < size; i++) {
            String strC = _HeadersCommonKt.c(headers, i);
            String strE = _HeadersCommonKt.e(headers, i);
            if (strC.equals(":status")) {
                statusLineA = StatusLine.Companion.a("HTTP/1.1 ".concat(strE));
            } else if (!h.contains(strC)) {
                _HeadersCommonKt.a(builder, strC, strE);
            }
        }
        if (statusLineA == null) {
            e9d0.j("Expected ':status' header not present");
            return null;
        }
        Response.Builder builder2 = new Response.Builder();
        builder2.b = protocol;
        builder2.c = statusLineA.b;
        String str = statusLineA.c;
        str.getClass();
        builder2.d = str;
        builder2.f = _HeadersCommonKt.d(_HeadersCommonKt.b(builder));
        if (z && builder2.c == 100) {
            return null;
        }
        return builder2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void h() {
        this.c.x.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final njk0 i() {
        Http2Stream http2Stream = this.d;
        http2Stream.getClass();
        return http2Stream;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: j */
    public final ExchangeCodec.Carrier getB() {
        return this.f46190a;
    }
}
