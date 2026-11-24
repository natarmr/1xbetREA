package okhttp3.internal.http1;

import a.c99;
import a.csj;
import a.e9d0;
import a.emk0;
import a.f99;
import a.fmq0;
import a.h97;
import a.hny;
import a.jf4;
import a.njk0;
import a.qwq;
import a.s5k0;
import a.t99;
import a.u99;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.parser.TokenNames;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.BufferedSocket;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.StatusLine;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b¨\u0006\t"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "KnownLengthSink", "ChunkedSink", "AbstractSource", "FixedLengthSource", "ChunkedSource", "UnknownLengthSource", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Headers f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final OkHttpClient f46175a;
    public final ExchangeCodec.Carrier b;
    public final BufferedSocket c;
    public byte d;
    public final HeadersReader e;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b¢\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "La/emk0;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public abstract class AbstractSource implements emk0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HttpUrl f46176a;
        public final qwq b;
        public boolean c;
        public final /* synthetic */ Http1ExchangeCodec d;

        public AbstractSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            httpUrl.getClass();
            this.d = http1ExchangeCodec;
            this.f46176a = httpUrl;
            this.b = new qwq(http1ExchangeCodec.c.b().h());
        }

        @Override // a.emk0
        public long Y(f99 f99Var, long j) throws IOException {
            Http1ExchangeCodec http1ExchangeCodec = this.d;
            f99Var.getClass();
            try {
                return http1ExchangeCodec.c.b().Y(f99Var, j);
            } catch (IOException e) {
                http1ExchangeCodec.b.c();
                a(Http1ExchangeCodec.f);
                throw e;
            }
        }

        public final void a(Headers headers) {
            OkHttpClient okHttpClient;
            CookieJar cookieJar;
            headers.getClass();
            Http1ExchangeCodec http1ExchangeCodec = this.d;
            byte b = http1ExchangeCodec.d;
            if (b == 6) {
                return;
            }
            if (b != 5) {
                hny.s(http1ExchangeCodec.d, "state: ");
                return;
            }
            qwq qwqVar = this.b;
            fmq0 fmq0Var = qwqVar.e;
            qwqVar.e = fmq0.d;
            fmq0Var.a();
            fmq0Var.b();
            http1ExchangeCodec.d = (byte) 6;
            if (headers.size() <= 0 || (okHttpClient = http1ExchangeCodec.f46175a) == null || (cookieJar = okHttpClient.j) == null) {
                return;
            }
            HttpHeaders.d(cookieJar, this.f46176a, headers);
        }

        @Override // a.emk0
        public final fmq0 h() {
            return this.b;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSink;", "La/s5k0;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ChunkedSink implements s5k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final qwq f46177a;
        public boolean b;

        public ChunkedSink() {
            this.f46177a = new qwq(Http1ExchangeCodec.this.c.a().h());
        }

        @Override // a.s5k0
        public final void F0(f99 f99Var, long j) {
            if (this.b) {
                jf4.n("closed");
                return;
            }
            if (j == 0) {
                return;
            }
            t99 t99VarA = Http1ExchangeCodec.this.c.a();
            t99VarA.I0(j);
            t99VarA.D(Separators.NEWLINE);
            t99VarA.F0(f99Var, j);
            t99VarA.D(Separators.NEWLINE);
        }

        @Override // a.s5k0, java.io.Closeable, java.lang.AutoCloseable
        public final synchronized void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            Http1ExchangeCodec.this.c.a().D("0\r\n\r\n");
            Http1ExchangeCodec.this.c.a().flush();
            qwq qwqVar = this.f46177a;
            fmq0 fmq0Var = qwqVar.e;
            qwqVar.e = fmq0.d;
            fmq0Var.a();
            fmq0Var.b();
            Http1ExchangeCodec.this.d = (byte) 3;
        }

        @Override // a.s5k0, java.io.Flushable
        public final synchronized void flush() {
            if (this.b) {
                return;
            }
            Http1ExchangeCodec.this.c.a().flush();
        }

        @Override // a.s5k0
        public final fmq0 h() {
            return this.f46177a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$ChunkedSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class ChunkedSource extends AbstractSource {
        public long e;
        public boolean f;
        public final /* synthetic */ Http1ExchangeCodec g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ChunkedSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl) {
            super(http1ExchangeCodec, httpUrl);
            httpUrl.getClass();
            this.g = http1ExchangeCodec;
            this.e = -1L;
            this.f = true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x00c1, code lost:
        
            if (r16.f == false) goto L37;
         */
        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, a.emk0
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final long Y(a.f99 r17, long r18) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 291
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http1.Http1ExchangeCodec.ChunkedSource.Y(a.f99, long):long");
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean zG;
            if (this.c) {
                return;
            }
            if (this.f) {
                TimeZone timeZone = _UtilJvmKt.f46122a;
                TimeUnit.MILLISECONDS.getClass();
                try {
                    zG = _UtilJvmKt.g(this, 100);
                } catch (IOException unused) {
                    zG = false;
                }
                if (!zG) {
                    this.g.b.c();
                    a(Http1ExchangeCodec.f);
                }
            }
            this.c = true;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$Companion;", "", "", "NO_CHUNK_YET", "J", "", "STATE_IDLE", TokenNames.I, "STATE_OPEN_REQUEST_BODY", "STATE_WRITING_REQUEST_BODY", "STATE_READ_RESPONSE_HEADERS", "STATE_OPEN_RESPONSE_BODY", "STATE_READING_RESPONSE_BODY", "STATE_CLOSED", "Lokhttp3/Headers;", "TRAILERS_RESPONSE_BODY_TRUNCATED", "Lokhttp3/Headers;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$FixedLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class FixedLengthSource extends AbstractSource {
        public long e;
        public final /* synthetic */ Http1ExchangeCodec f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FixedLengthSource(Http1ExchangeCodec http1ExchangeCodec, HttpUrl httpUrl, long j) {
            super(http1ExchangeCodec, httpUrl);
            httpUrl.getClass();
            this.f = http1ExchangeCodec;
            this.e = j;
            if (j == 0) {
                a(Headers.b);
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, a.emk0
        public final long Y(f99 f99Var, long j) throws IOException {
            f99Var.getClass();
            if (j < 0) {
                c99.s(h97.h(j, "byteCount < 0: "));
                return 0L;
            }
            if (this.c) {
                jf4.n("closed");
                return 0L;
            }
            long j2 = this.e;
            if (j2 == 0) {
                return -1L;
            }
            long jY = super.Y(f99Var, Math.min(j2, j));
            if (jY == -1) {
                this.f.b.c();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                a(Http1ExchangeCodec.f);
                throw protocolException;
            }
            long j3 = this.e - jY;
            this.e = j3;
            if (j3 == 0) {
                a(Headers.b);
            }
            return jY;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            boolean zG;
            if (this.c) {
                return;
            }
            if (this.e != 0) {
                TimeZone timeZone = _UtilJvmKt.f46122a;
                TimeUnit.MILLISECONDS.getClass();
                try {
                    zG = _UtilJvmKt.g(this, 100);
                } catch (IOException unused) {
                    zG = false;
                }
                if (!zG) {
                    this.f.b.c();
                    a(Http1ExchangeCodec.f);
                }
            }
            this.c = true;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$KnownLengthSink;", "La/s5k0;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class KnownLengthSink implements s5k0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final qwq f46178a;
        public boolean b;

        public KnownLengthSink() {
            this.f46178a = new qwq(Http1ExchangeCodec.this.c.a().h());
        }

        @Override // a.s5k0
        public final void F0(f99 f99Var, long j) {
            if (this.b) {
                jf4.n("closed");
            } else {
                _UtilCommonKt.a(f99Var.b, 0L, j);
                Http1ExchangeCodec.this.c.a().F0(f99Var, j);
            }
        }

        @Override // a.s5k0, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.b) {
                return;
            }
            this.b = true;
            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
            http1ExchangeCodec.c.a().flush();
            qwq qwqVar = this.f46178a;
            fmq0 fmq0Var = qwqVar.e;
            qwqVar.e = fmq0.d;
            fmq0Var.a();
            fmq0Var.b();
            http1ExchangeCodec.d = (byte) 3;
        }

        @Override // a.s5k0, java.io.Flushable
        public final void flush() {
            if (this.b) {
                return;
            }
            Http1ExchangeCodec.this.c.a().flush();
        }

        @Override // a.s5k0
        public final fmq0 h() {
            return this.f46178a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/http1/Http1ExchangeCodec$UnknownLengthSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec$AbstractSource;", "Lokhttp3/internal/http1/Http1ExchangeCodec;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class UnknownLengthSource extends AbstractSource {
        public boolean e;

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, a.emk0
        public final long Y(f99 f99Var, long j) throws IOException {
            f99Var.getClass();
            if (j < 0) {
                c99.s(h97.h(j, "byteCount < 0: "));
                return 0L;
            }
            if (this.c) {
                jf4.n("closed");
                return 0L;
            }
            if (this.e) {
                return -1L;
            }
            long jY = super.Y(f99Var, j);
            if (jY != -1) {
                return jY;
            }
            this.e = true;
            a(Headers.b);
            return -1L;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            if (this.c) {
                return;
            }
            if (!this.e) {
                a(Http1ExchangeCodec.f);
            }
            this.c = true;
        }
    }

    static {
        Headers headers = Headers.b;
        f = Headers.Companion.a("OkHttp-Response-Body", "Truncated");
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, ExchangeCodec.Carrier carrier, BufferedSocket bufferedSocket) {
        bufferedSocket.getClass();
        this.f46175a = okHttpClient;
        this.b = carrier;
        this.c = bufferedSocket;
        this.e = new HeadersReader(bufferedSocket.b());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void a() {
        this.c.a().flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final emk0 b(Response response) {
        boolean zA = HttpHeaders.a(response);
        Request request = response.f46111a;
        if (!zA) {
            return k(request.f46108a, 0L);
        }
        String strB = response.f.b("Transfer-Encoding");
        if (strB == null) {
            strB = null;
        }
        if ("chunked".equalsIgnoreCase(strB)) {
            HttpUrl httpUrl = request.f46108a;
            if (this.d == 4) {
                this.d = (byte) 5;
                return new ChunkedSource(this, httpUrl);
            }
            e9d0.p(this.d, "state: ");
            return null;
        }
        long jE = _UtilJvmKt.e(response);
        if (jE != -1) {
            return k(request.f46108a, jE);
        }
        HttpUrl httpUrl2 = request.f46108a;
        if (this.d != 4) {
            e9d0.p(this.d, "state: ");
            return null;
        }
        this.d = (byte) 5;
        this.b.c();
        httpUrl2.getClass();
        return new UnknownLengthSource(this, httpUrl2);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final long c(Response response) {
        if (!HttpHeaders.a(response)) {
            return 0L;
        }
        String strB = response.f.b("Transfer-Encoding");
        if (strB == null) {
            strB = null;
        }
        if ("chunked".equalsIgnoreCase(strB)) {
            return -1L;
        }
        return _UtilJvmKt.e(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void cancel() {
        this.b.cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final s5k0 d(Request request, long j) {
        request.getClass();
        if ("chunked".equalsIgnoreCase(request.c.b("Transfer-Encoding"))) {
            if (this.d == 1) {
                this.d = (byte) 2;
                return new ChunkedSink();
            }
            e9d0.p(this.d, "state: ");
            return null;
        }
        if (j == -1) {
            jf4.n("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.d == 1) {
            this.d = (byte) 2;
            return new KnownLengthSink();
        }
        e9d0.p(this.d, "state: ");
        return null;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void e(Request request) {
        request.getClass();
        Proxy.Type type = this.b.getK().b.type();
        type.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append(request.b);
        sb.append(' ');
        HttpUrl httpUrl = request.f46108a;
        if (httpUrl.f() || type != Proxy.Type.HTTP) {
            String strB = httpUrl.b();
            String strD = httpUrl.d();
            if (strD != null) {
                strB = strB + '?' + strD;
            }
            sb.append(strB);
        } else {
            sb.append(httpUrl);
        }
        sb.append(" HTTP/1.1");
        m(request.c, sb.toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final boolean f() {
        return this.d == 6;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final Response.Builder g(boolean z) throws IOException {
        HeadersReader headersReader = this.e;
        u99 u99Var = headersReader.f46174a;
        byte b = this.d;
        if (b != 0 && b != 1 && b != 2 && b != 3) {
            e9d0.p(this.d, "state: ");
            return null;
        }
        try {
            String strA = u99Var.A(headersReader.b);
            headersReader.b -= (long) strA.length();
            StatusLine statusLineA = StatusLine.Companion.a(strA);
            int i = statusLineA.b;
            Response.Builder builder = new Response.Builder();
            Protocol protocol = statusLineA.f46173a;
            protocol.getClass();
            builder.b = protocol;
            builder.c = i;
            String str = statusLineA.c;
            str.getClass();
            builder.d = str;
            Headers.Builder builder2 = new Headers.Builder();
            while (true) {
                String strA2 = u99Var.A(headersReader.b);
                headersReader.b -= (long) strA2.length();
                if (strA2.length() == 0) {
                    break;
                }
                int iU = StringsKt.U(':', 1, 4, strA2);
                if (iU != -1) {
                    _HeadersCommonKt.a(builder2, strA2.substring(0, iU), strA2.substring(iU + 1));
                } else if (strA2.charAt(0) == ':') {
                    _HeadersCommonKt.a(builder2, "", strA2.substring(1));
                } else {
                    _HeadersCommonKt.a(builder2, "", strA2);
                }
            }
            builder.f = _HeadersCommonKt.d(_HeadersCommonKt.b(builder2));
            if (z && i == 100) {
                return null;
            }
            if (i == 100) {
                this.d = (byte) 3;
                return builder;
            }
            if (102 > i || i >= 200) {
                this.d = (byte) 4;
                return builder;
            }
            this.d = (byte) 3;
            return builder;
        } catch (EOFException e) {
            csj.c("unexpected end of stream on ".concat(this.b.getK().f46114a.i.h()), e);
            return null;
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final void h() {
        this.c.a().flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public final njk0 i() {
        return this.c;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    /* JADX INFO: renamed from: j, reason: from getter */
    public final ExchangeCodec.Carrier getB() {
        return this.b;
    }

    public final emk0 k(HttpUrl httpUrl, long j) {
        if (this.d == 4) {
            this.d = (byte) 5;
            return new FixedLengthSource(this, httpUrl, j);
        }
        e9d0.p(this.d, "state: ");
        return null;
    }

    public final void l(Response response) {
        long jE = _UtilJvmKt.e(response);
        if (jE == -1) {
            return;
        }
        emk0 emk0VarK = k(response.f46111a.f46108a, jE);
        _UtilJvmKt.g(emk0VarK, Integer.MAX_VALUE);
        ((FixedLengthSource) emk0VarK).close();
    }

    public final void m(Headers headers, String str) {
        if (this.d != 0) {
            e9d0.p(this.d, "state: ");
            return;
        }
        BufferedSocket bufferedSocket = this.c;
        bufferedSocket.a().D(str).D(Separators.NEWLINE);
        int size = headers.size();
        for (int i = 0; i < size; i++) {
            bufferedSocket.a().D(_HeadersCommonKt.c(headers, i)).D(": ").D(_HeadersCommonKt.e(headers, i)).D(Separators.NEWLINE);
        }
        bufferedSocket.a().D(Separators.NEWLINE);
        this.d = (byte) 1;
    }
}
