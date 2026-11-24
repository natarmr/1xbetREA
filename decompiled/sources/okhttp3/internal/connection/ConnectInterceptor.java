package okhttp3.internal.connection;

import a.fmq0;
import a.ohq;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http1.Http1ExchangeCodec;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2ExchangeCodec;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/connection/ConnectInterceptor;", "Lokhttp3/Interceptor;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConnectInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ConnectInterceptor f46136a = new ConnectInterceptor();

    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) throws IOException {
        ExchangeCodec http1ExchangeCodec;
        RealCall realCall = realInterceptorChain.f46172a;
        synchronized (realCall) {
            if (!realCall.q) {
                throw new IllegalStateException("released");
            }
            if (realCall.n || realCall.m || realCall.p || realCall.o) {
                throw new IllegalStateException("Check failed.");
            }
        }
        ExchangeFinder exchangeFinder = realCall.i;
        exchangeFinder.getClass();
        RealConnection realConnectionA = exchangeFinder.a();
        OkHttpClient okHttpClient = realCall.f46144a;
        realConnectionA.getClass();
        BufferedSocket bufferedSocket = realConnectionA.h;
        Http2Connection http2Connection = realConnectionA.j;
        if (http2Connection != null) {
            http1ExchangeCodec = new Http2ExchangeCodec(okHttpClient, realConnectionA, realInterceptorChain, http2Connection);
        } else {
            realConnectionA.e.setSoTimeout(realInterceptorChain.g);
            fmq0 fmq0VarH = bufferedSocket.b().h();
            long j = realInterceptorChain.g;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            fmq0VarH.g(j, timeUnit);
            bufferedSocket.a().h().g(realInterceptorChain.h, timeUnit);
            http1ExchangeCodec = new Http1ExchangeCodec(okHttpClient, realConnectionA, bufferedSocket);
        }
        Exchange exchange = new Exchange(realCall, exchangeFinder, http1ExchangeCodec);
        realCall.l = exchange;
        realCall.s = exchange;
        synchronized (realCall) {
            realCall.m = true;
            realCall.n = true;
        }
        if (!realCall.r) {
            return RealInterceptorChain.a(realInterceptorChain, 0, exchange, null, 2097149).b(realInterceptorChain.e);
        }
        ohq.l("Canceled");
        return null;
    }
}
