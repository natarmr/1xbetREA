package okhttp3.internal.http;

import a.tjo;
import a.yae0;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.UnreadableResponseBody;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/Interceptor;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class CallServerInterceptor implements Interceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final CallServerInterceptor f46169a = new CallServerInterceptor();

    /* JADX WARN: Code duplicated, block: B:112:0x0239 A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:115:0x00ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00f8 A[Catch: IOException -> 0x0104, TryCatch #1 {IOException -> 0x0104, blocks: (B:49:0x00ef, B:51:0x00f8, B:54:0x0107, B:62:0x012c, B:64:0x0135, B:65:0x013e, B:66:0x0157, B:71:0x0169, B:77:0x0177, B:78:0x017e, B:80:0x0181, B:83:0x018b, B:88:0x0196, B:90:0x01cd, B:92:0x01de, B:95:0x01e8, B:102:0x01ff, B:105:0x020c, B:106:0x0230, B:97:0x01ee, B:89:0x01b8), top: B:115:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0135 A[Catch: IOException -> 0x0104, TryCatch #1 {IOException -> 0x0104, blocks: (B:49:0x00ef, B:51:0x00f8, B:54:0x0107, B:62:0x012c, B:64:0x0135, B:65:0x013e, B:66:0x0157, B:71:0x0169, B:77:0x0177, B:78:0x017e, B:80:0x0181, B:83:0x018b, B:88:0x0196, B:90:0x01cd, B:92:0x01de, B:95:0x01e8, B:102:0x01ff, B:105:0x020c, B:106:0x0230, B:97:0x01ee, B:89:0x01b8), top: B:115:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0166  */
    /* JADX WARN: Code duplicated, block: B:71:0x0169 A[Catch: IOException -> 0x0104, TryCatch #1 {IOException -> 0x0104, blocks: (B:49:0x00ef, B:51:0x00f8, B:54:0x0107, B:62:0x012c, B:64:0x0135, B:65:0x013e, B:66:0x0157, B:71:0x0169, B:77:0x0177, B:78:0x017e, B:80:0x0181, B:83:0x018b, B:88:0x0196, B:90:0x01cd, B:92:0x01de, B:95:0x01e8, B:102:0x01ff, B:105:0x020c, B:106:0x0230, B:97:0x01ee, B:89:0x01b8), top: B:115:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0171  */
    /* JADX WARN: Code duplicated, block: B:74:0x0173  */
    /* JADX WARN: Code duplicated, block: B:76:0x0176  */
    /* JADX WARN: Code duplicated, block: B:77:0x0177 A[Catch: IOException -> 0x0104, TryCatch #1 {IOException -> 0x0104, blocks: (B:49:0x00ef, B:51:0x00f8, B:54:0x0107, B:62:0x012c, B:64:0x0135, B:65:0x013e, B:66:0x0157, B:71:0x0169, B:77:0x0177, B:78:0x017e, B:80:0x0181, B:83:0x018b, B:88:0x0196, B:90:0x01cd, B:92:0x01de, B:95:0x01e8, B:102:0x01ff, B:105:0x020c, B:106:0x0230, B:97:0x01ee, B:89:0x01b8), top: B:115:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0181 A[Catch: IOException -> 0x0104, TryCatch #1 {IOException -> 0x0104, blocks: (B:49:0x00ef, B:51:0x00f8, B:54:0x0107, B:62:0x012c, B:64:0x0135, B:65:0x013e, B:66:0x0157, B:71:0x0169, B:77:0x0177, B:78:0x017e, B:80:0x0181, B:83:0x018b, B:88:0x0196, B:90:0x01cd, B:92:0x01de, B:95:0x01e8, B:102:0x01ff, B:105:0x020c, B:106:0x0230, B:97:0x01ee, B:89:0x01b8), top: B:115:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0189  */
    /* JADX WARN: Code duplicated, block: B:85:0x0191  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b8 A[Catch: IOException -> 0x0104, TryCatch #1 {IOException -> 0x0104, blocks: (B:49:0x00ef, B:51:0x00f8, B:54:0x0107, B:62:0x012c, B:64:0x0135, B:65:0x013e, B:66:0x0157, B:71:0x0169, B:77:0x0177, B:78:0x017e, B:80:0x0181, B:83:0x018b, B:88:0x0196, B:90:0x01cd, B:92:0x01de, B:95:0x01e8, B:102:0x01ff, B:105:0x020c, B:106:0x0230, B:97:0x01ee, B:89:0x01b8), top: B:115:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:92:0x01de A[Catch: IOException -> 0x0104, TryCatch #1 {IOException -> 0x0104, blocks: (B:49:0x00ef, B:51:0x00f8, B:54:0x0107, B:62:0x012c, B:64:0x0135, B:65:0x013e, B:66:0x0157, B:71:0x0169, B:77:0x0177, B:78:0x017e, B:80:0x0181, B:83:0x018b, B:88:0x0196, B:90:0x01cd, B:92:0x01de, B:95:0x01e8, B:102:0x01ff, B:105:0x020c, B:106:0x0230, B:97:0x01ee, B:89:0x01b8), top: B:115:0x00ef }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ee A[Catch: IOException -> 0x0104, TryCatch #1 {IOException -> 0x0104, blocks: (B:49:0x00ef, B:51:0x00f8, B:54:0x0107, B:62:0x012c, B:64:0x0135, B:65:0x013e, B:66:0x0157, B:71:0x0169, B:77:0x0177, B:78:0x017e, B:80:0x0181, B:83:0x018b, B:88:0x0196, B:90:0x01cd, B:92:0x01de, B:95:0x01e8, B:102:0x01ff, B:105:0x020c, B:106:0x0230, B:97:0x01ee, B:89:0x01b8), top: B:115:0x00ef }] */
    @Override // okhttp3.Interceptor
    public final Response a(RealInterceptorChain realInterceptorChain) throws IOException {
        boolean z;
        Response.Builder builderE;
        IOException iOException;
        Response.Builder builderE2;
        Response responseA;
        int i;
        boolean z2;
        Response responseA2;
        Request request;
        String strB;
        String strB2;
        boolean z3;
        Response.Builder builder;
        Exchange exchange = realInterceptorChain.d;
        exchange.getClass();
        Request request2 = realInterceptorChain.e;
        RequestBody requestBody = request2.d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z4 = false;
        boolean z5 = HttpMethod.a(request2.b) && requestBody != null;
        boolean zEqualsIgnoreCase = "upgrade".equalsIgnoreCase(request2.c.b("Connection"));
        try {
            exchange.h(request2);
            if (z5) {
                if ("100-continue".equalsIgnoreCase(request2.c.b("Expect"))) {
                    try {
                        exchange.c.h();
                        builderE = exchange.e(true);
                        try {
                            exchange.f46140a.eventListener.B(exchange.f46140a);
                            builder = builderE;
                            z = false;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            if (e instanceof ConnectionShutdownException) {
                                throw e;
                            }
                            throw e;
                        }
                    } catch (IOException e2) {
                        exchange.f46140a.eventListener.u(exchange.f46140a, e2);
                        exchange.f(e2);
                        throw e2;
                    }
                } else {
                    z = true;
                    builder = null;
                }
                try {
                    if (builder == null) {
                        requestBody.getClass();
                        yae0 yae0Var = new yae0(exchange.b(request2));
                        requestBody.d(yae0Var);
                        yae0Var.close();
                    } else {
                        RealCall realCall = exchange.f46140a;
                        int i2 = RealCall.u;
                        realCall.e(exchange, true, false, false, false, null);
                        if (!(exchange.c().j != null)) {
                            exchange.c.getB().c();
                        }
                    }
                    builderE = builder;
                } catch (IOException e3) {
                    e = e3;
                    builderE = builder;
                    if (e instanceof ConnectionShutdownException) {
                        throw e;
                    }
                    throw e;
                }
            } else {
                RealCall realCall2 = exchange.f46140a;
                int i3 = RealCall.u;
                realCall2.e(exchange, true, false, false, false, null);
                z = true;
                builderE = null;
            }
            try {
                exchange.c.a();
                builderE2 = builderE;
                iOException = null;
                while (true) {
                    if (i != 100 && (102 > i || i >= 200)) {
                        break;
                    }
                    Response.Builder builderE3 = exchange.e(false);
                    builderE3.getClass();
                    if (z) {
                        exchange.f46140a.eventListener.B(exchange.f46140a);
                    }
                    builderE3.f46112a = request2;
                    builderE3.e = exchange.c().f;
                    builderE3.l = jCurrentTimeMillis;
                    builderE3.m = System.currentTimeMillis();
                    responseA = builderE3.a();
                    i = responseA.d;
                }
            } catch (IOException e4) {
                try {
                    exchange.f46140a.eventListener.u(exchange.f46140a, e4);
                    exchange.f(e4);
                    throw e4;
                } catch (IOException e5) {
                    e = e5;
                    if ((e instanceof ConnectionShutdownException) || !exchange.d) {
                        throw e;
                    }
                    Response.Builder builder2 = builderE;
                    iOException = e;
                    builderE2 = builder2;
                    if (builderE2 == null) {
                        try {
                            builderE2 = exchange.e(false);
                            builderE2.getClass();
                            if (z) {
                                exchange.f46140a.eventListener.B(exchange.f46140a);
                                z = false;
                            }
                        } catch (IOException e6) {
                            if (iOException == null) {
                                throw e6;
                            }
                            tjo.a(iOException, e6);
                            throw iOException;
                        }
                    }
                    builderE2.f46112a = request2;
                    builderE2.e = exchange.c().f;
                    builderE2.l = jCurrentTimeMillis;
                    builderE2.m = System.currentTimeMillis();
                    responseA = builderE2.a();
                    i = responseA.d;
                    while (true) {
                        if (i != 100) {
                            break;
                        }
                        Response.Builder builderE4 = exchange.e(false);
                        builderE4.getClass();
                        if (z) {
                            exchange.f46140a.eventListener.B(exchange.f46140a);
                        }
                        builderE4.f46112a = request2;
                        builderE4.e = exchange.c().f;
                        builderE4.l = jCurrentTimeMillis;
                        builderE4.m = System.currentTimeMillis();
                        responseA = builderE4.a();
                        i = responseA.d;
                    }
                    exchange.f46140a.eventListener.A(exchange.f46140a, responseA);
                    if (i == 101) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (exchange.c().j != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
                        }
                    }
                    if (z2) {
                        strB2 = responseA.f.b("Connection");
                        if (strB2 == null) {
                            strB2 = null;
                        }
                        if ("upgrade".equalsIgnoreCase(strB2)) {
                            z4 = true;
                        }
                    }
                    if (zEqualsIgnoreCase) {
                        RealResponseBody realResponseBodyD = exchange.d(responseA);
                        Response.Builder builderC = responseA.c();
                        builderC.g = realResponseBodyD;
                        builderC.o = new CallServerInterceptor$intercept$1();
                        responseA2 = builderC.a();
                    } else {
                        RealResponseBody realResponseBodyD2 = exchange.d(responseA);
                        Response.Builder builderC2 = responseA.c();
                        builderC2.g = realResponseBodyD2;
                        builderC2.o = new CallServerInterceptor$intercept$1();
                        responseA2 = builderC2.a();
                    }
                    request = responseA2.f46111a;
                    request.getClass();
                    if ("close".equalsIgnoreCase(request.c.b("Connection"))) {
                        exchange.c.getB().c();
                    } else {
                        strB = responseA2.f.b("Connection");
                        if (strB == null) {
                            strB = null;
                        }
                        if ("close".equalsIgnoreCase(strB)) {
                            exchange.c.getB().c();
                        }
                    }
                    if (i == 204) {
                        throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + responseA2.g.getC());
                    }
                    throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + responseA2.g.getC());
                    return responseA2;
                }
            }
        } catch (IOException e7) {
            e = e7;
            z = true;
            builderE = null;
        }
        if (builderE2 == null) {
            builderE2 = exchange.e(false);
            builderE2.getClass();
            if (z) {
                exchange.f46140a.eventListener.B(exchange.f46140a);
                z = false;
            }
        }
        builderE2.f46112a = request2;
        builderE2.e = exchange.c().f;
        builderE2.l = jCurrentTimeMillis;
        builderE2.m = System.currentTimeMillis();
        responseA = builderE2.a();
        i = responseA.d;
        exchange.f46140a.eventListener.A(exchange.f46140a, responseA);
        if (i == 101) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (exchange.c().j != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z3) {
                throw new ProtocolException("Unexpected 101 code on HTTP/2 connection");
            }
        }
        if (z2) {
            strB2 = responseA.f.b("Connection");
            if (strB2 == null) {
                strB2 = null;
            }
            if ("upgrade".equalsIgnoreCase(strB2)) {
                z4 = true;
            }
        }
        if (zEqualsIgnoreCase || !z4) {
            RealResponseBody realResponseBodyD3 = exchange.d(responseA);
            Response.Builder builderC3 = responseA.c();
            builderC3.g = realResponseBodyD3;
            builderC3.o = new CallServerInterceptor$intercept$1();
            responseA2 = builderC3.a();
        } else {
            Response.Builder builderC4 = responseA.c();
            builderC4.g = new UnreadableResponseBody(responseA.g.getB(), responseA.g.getC());
            builderC4.h = exchange.g();
            responseA2 = builderC4.a();
        }
        request = responseA2.f46111a;
        request.getClass();
        if ("close".equalsIgnoreCase(request.c.b("Connection"))) {
            exchange.c.getB().c();
        } else {
            strB = responseA2.f.b("Connection");
            if (strB == null) {
                strB = null;
            }
            if ("close".equalsIgnoreCase(strB)) {
                exchange.c.getB().c();
            }
        }
        if ((i == 204 && i != 205) || responseA2.g.getC() <= 0) {
            return responseA2;
        }
        throw new ProtocolException("HTTP " + i + " had non-zero Content-Length: " + responseA2.g.getC());
    }
}
