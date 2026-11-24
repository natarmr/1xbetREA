package okhttp3.logging;

import a.bkb;
import a.brm0;
import a.dw9;
import a.f99;
import a.hjv;
import a.kng0;
import a.u99;
import a.xun;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import defpackage.c;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.IsProbablyUtf8Kt;
import okhttp3.internal.UnreadableResponseBody;
import okhttp3.internal._HeadersCommonKt;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "Level", "Logger", "Companion", "logging-interceptor"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HttpLoggingInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f46234a;
    public volatile xun b;
    public volatile xun c;
    public volatile Level d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Companion;", "", "logging-interceptor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "logging-interceptor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Level {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Level f46235a;
        public static final Level b;
        public static final Level c;
        public static final Level d;
        public static final /* synthetic */ Level[] e;

        static {
            Level level = new Level("NONE", 0);
            f46235a = level;
            Level level2 = new Level("BASIC", 1);
            b = level2;
            Level level3 = new Level("HEADERS", 2);
            c = level3;
            Level level4 = new Level("BODY", 3);
            d = level4;
            e = new Level[]{level, level2, level3, level4};
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) e.clone();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "Companion", "logging-interceptor"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Logger {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Logger f46236a = new Companion.DefaultLogger();

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DefaultLogger", "logging-interceptor"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion$DefaultLogger;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logging-interceptor"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class DefaultLogger implements Logger {
                @Override // okhttp3.logging.HttpLoggingInterceptor.Logger
                public final void a(String str) {
                    Platform platform = Platform.f46208a;
                    Platform.f46208a.k(4, str, null);
                }
            }
        }

        void a(String str);
    }

    public HttpLoggingInterceptor(Logger logger) {
        this.f46234a = logger;
        xun xunVar = xun.f41520a;
        this.b = xunVar;
        this.c = xunVar;
        this.d = Level.f46235a;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x03a9  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fe A[LOOP:0: B:45:0x00fc->B:46:0x00fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x019c  */
    /* JADX WARN: Code duplicated, block: B:85:0x0224  */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x0224, please report this as an issue */
    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) throws Exception {
        boolean z;
        String str;
        Long lValueOf;
        Charset charsetA;
        int size;
        int i;
        Long lValueOf2;
        Charset charsetA2;
        Level level = this.d;
        Request request = realInterceptorChain.e;
        if (level == Level.f46235a) {
            return realInterceptorChain.b(request);
        }
        boolean z2 = true;
        boolean z3 = level == Level.d;
        if (!z3 && level != Level.c) {
            z2 = false;
        }
        RequestBody requestBody = request.d;
        Exchange exchange = realInterceptorChain.d;
        RealConnection realConnectionC = exchange != null ? exchange.c() : null;
        StringBuilder sb = new StringBuilder("--> ");
        sb.append(request.b);
        sb.append(' ');
        HttpUrl httpUrl = request.f46108a;
        httpUrl.getClass();
        this.c.getClass();
        sb.append(httpUrl.i);
        String str2 = Separators.SP;
        sb.append(realConnectionC != null ? Separators.SP + realConnectionC.g : "");
        String string = sb.toString();
        if (!z2 && requestBody != null) {
            StringBuilder sbT = brm0.t(string, " (");
            sbT.append(requestBody.a());
            sbT.append("-byte body)");
            string = sbT.toString();
        }
        this.f46234a.a(string);
        if (z2) {
            Headers headers = request.c;
            if (requestBody != null) {
                MediaType b = requestBody.getD();
                z = z3;
                if (b != null && headers.b("Content-Type") == null) {
                    this.f46234a.a("Content-Type: " + b);
                }
                if (requestBody.a() != -1 && headers.b("Content-Length") == null) {
                    this.f46234a.a("Content-Length: " + requestBody.a());
                }
                size = headers.size();
                for (i = 0; i < size; i++) {
                    b(headers, i);
                }
                if (z || requestBody == null) {
                    this.f46234a.a("--> END " + request.b);
                } else {
                    String strB = request.c.b("Content-Encoding");
                    if (strB != null && !strB.equalsIgnoreCase("identity") && !strB.equalsIgnoreCase("gzip")) {
                        this.f46234a.a("--> END " + request.b + " (encoded body omitted)");
                    } else if (requestBody.c()) {
                        this.f46234a.a("--> END " + request.b + " (one-shot body omitted)");
                    } else {
                        f99 f99Var = new f99();
                        requestBody.d(f99Var);
                        if ("gzip".equalsIgnoreCase(headers.b("Content-Encoding"))) {
                            lValueOf2 = Long.valueOf(f99Var.b);
                            hjv hjvVar = new hjv(f99Var);
                            try {
                                f99Var = new f99();
                                f99Var.P(hjvVar);
                                hjvVar.close();
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    bkb.E(hjvVar, th);
                                    throw th2;
                                }
                            }
                        } else {
                            lValueOf2 = null;
                        }
                        MediaType b2 = requestBody.getD();
                        if (b2 != null) {
                            Regex regex = MediaType.e;
                            charsetA2 = b2.a(null);
                            if (charsetA2 == null) {
                                charsetA2 = Charsets.UTF_8;
                            }
                        } else {
                            charsetA2 = Charsets.UTF_8;
                        }
                        this.f46234a.a("");
                        boolean zA = IsProbablyUtf8Kt.a(f99Var);
                        Logger logger = this.f46234a;
                        if (!zA) {
                            logger.a("--> END " + request.b + " (binary " + requestBody.a() + "-byte body omitted)");
                        } else if (lValueOf2 != null) {
                            logger.a("--> END " + request.b + " (" + f99Var.b + "-byte, " + lValueOf2.longValue() + "-gzipped-byte body)");
                        } else {
                            logger.a(f99Var.H0(charsetA2));
                            this.f46234a.a("--> END " + request.b + " (" + requestBody.a() + "-byte body)");
                        }
                    }
                }
            } else {
                z = z3;
                z2 = z2;
                str2 = Separators.SP;
            }
            size = headers.size();
            while (i < size) {
                b(headers, i);
            }
            if (z) {
                this.f46234a.a("--> END " + request.b);
            } else {
                this.f46234a.a("--> END " + request.b);
            }
        } else {
            z = z3;
            z2 = z2;
            str2 = Separators.SP;
        }
        long jNanoTime = System.nanoTime();
        try {
            Response responseB = realInterceptorChain.b(request);
            long jNanoTime2 = (System.nanoTime() - jNanoTime) / 1000000;
            ResponseBody responseBody = responseB.g;
            responseBody.getClass();
            long c = responseBody.getC();
            String strO = c != -1 ? dw9.o(c, "-byte") : "unknown-length";
            Logger logger2 = this.f46234a;
            StringBuilder sb2 = new StringBuilder("<-- " + responseB.d);
            if (responseB.c.length() > 0) {
                str = str2;
                sb2.append(str + responseB.c);
            } else {
                str = str2;
            }
            StringBuilder sb3 = new StringBuilder(str);
            HttpUrl httpUrl2 = responseB.f46111a.f46108a;
            httpUrl2.getClass();
            this.c.getClass();
            c.i(sb3, jNanoTime2, httpUrl2.i, " (");
            sb3.append("ms");
            sb2.append(sb3.toString());
            if (!z2) {
                sb2.append(", " + strO + " body");
            }
            sb2.append(Separators.RPAREN);
            logger2.a(sb2.toString());
            if (z2) {
                Headers headers2 = responseB.f;
                int size2 = headers2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    b(headers2, i2);
                }
                if (z && HttpHeaders.a(responseB)) {
                    String strB2 = responseB.f.b("Content-Encoding");
                    if (strB2 != null && !strB2.equalsIgnoreCase("identity") && !strB2.equalsIgnoreCase("gzip")) {
                        this.f46234a.a("<-- END HTTP (encoded body omitted)");
                        return responseB;
                    }
                    MediaType b3 = responseB.g.getB();
                    if (b3 != null && Intrinsics.d(b3.b, ParameterNames.TEXT) && Intrinsics.d(b3.c, "event-stream")) {
                        this.f46234a.a("<-- END HTTP (streaming)");
                        return responseB;
                    }
                    if (responseBody instanceof UnreadableResponseBody) {
                        this.f46234a.a("<-- END HTTP (unreadable body)");
                        return responseB;
                    }
                    u99 d = responseBody.getD();
                    d.G(Long.MAX_VALUE);
                    long jNanoTime3 = (System.nanoTime() - jNanoTime) / 1000000;
                    f99 f99VarG = d.g();
                    if ("gzip".equalsIgnoreCase(headers2.b("Content-Encoding"))) {
                        lValueOf = Long.valueOf(f99VarG.b);
                        hjv hjvVar2 = new hjv(f99VarG.d());
                        try {
                            f99VarG = new f99();
                            f99VarG.P(hjvVar2);
                            hjvVar2.close();
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                bkb.E(hjvVar2, th3);
                                throw th4;
                            }
                        }
                    } else {
                        lValueOf = null;
                    }
                    MediaType b4 = responseBody.getB();
                    if (b4 != null) {
                        Regex regex2 = MediaType.e;
                        charsetA = b4.a(null);
                        if (charsetA == null) {
                            charsetA = Charsets.UTF_8;
                        }
                    } else {
                        charsetA = Charsets.UTF_8;
                    }
                    if (!IsProbablyUtf8Kt.a(f99VarG)) {
                        this.f46234a.a("");
                        Logger logger3 = this.f46234a;
                        StringBuilder sbQ = kng0.q(jNanoTime3, "<-- END HTTP (", "ms, binary ");
                        sbQ.append(f99VarG.b);
                        sbQ.append("-byte body omitted)");
                        logger3.a(sbQ.toString());
                        return responseB;
                    }
                    if (c != 0) {
                        this.f46234a.a("");
                        this.f46234a.a(f99VarG.d().H0(charsetA));
                    }
                    Logger logger4 = this.f46234a;
                    StringBuilder sb4 = new StringBuilder(brm0.k(f99VarG.b, "-byte", kng0.q(jNanoTime3, "<-- END HTTP (", "ms, ")));
                    if (lValueOf != null) {
                        sb4.append(", " + lValueOf.longValue() + "-gzipped-byte");
                    }
                    sb4.append(" body)");
                    logger4.a(sb4.toString());
                    return responseB;
                }
                this.f46234a.a("<-- END HTTP");
            }
            return responseB;
        } catch (Exception e) {
            long jNanoTime4 = (System.nanoTime() - jNanoTime) / 1000000;
            StringBuilder sb5 = new StringBuilder(str2);
            HttpUrl httpUrl3 = request.f46108a;
            httpUrl3.getClass();
            this.c.getClass();
            c.i(sb5, jNanoTime4, httpUrl3.i, " (");
            sb5.append("ms)");
            this.f46234a.a(("<-- HTTP FAILED: " + e + '.').concat(sb5.toString()));
            throw e;
        }
    }

    public final void b(Headers headers, int i) {
        xun xunVar = this.b;
        _HeadersCommonKt.c(headers, i);
        xunVar.getClass();
        String strE = _HeadersCommonKt.e(headers, i);
        this.f46234a.a(_HeadersCommonKt.c(headers, i) + ": " + strE);
    }

    public /* synthetic */ HttpLoggingInterceptor() {
        this(Logger.f46236a);
    }
}
