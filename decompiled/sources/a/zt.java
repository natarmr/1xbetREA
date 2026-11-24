package a;

import java.io.IOException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Settings;
import okhttp3.internal.ws.RealWebSocket;
import okhttp3.internal.ws.WebSocketWriter;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zt implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44931a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zt(Object obj, long j, byte b) {
        this.f44931a = b;
        this.c = obj;
        this.b = j;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object value;
        boolean z;
        WebSocketWriter webSocketWriter;
        Object value2;
        ArrayList arrayList;
        Object value3;
        switch (this.f44931a) {
            case 0:
                cu cuVar = (cu) this.c;
                long j = this.b;
                p7m0 p7m0Var = ((y9n0) ((y3v) cuVar.c).b).f42258a;
                do {
                    value = p7m0Var.getValue();
                } while (!p7m0Var.m(value, eui0.h((Set) value, Long.valueOf(j))));
                return Unit.f46060a;
            case 1:
                return ((ijj0) ((t89) this.c)).b(this.b);
            case 2:
                ((vz40) this.c).f38283a = m5k0.a(this.b);
                return Unit.f46060a;
            case 3:
                ((uwe) this.c).invoke(new lc9(this.b));
                return Unit.f46060a;
            case 4:
                vzg0 vzg0Var = (vzg0) this.c;
                long jLongValue = this.b;
                iun iunVar = iun.f15405a;
                bs9 bs9Var = bs9.f3118a;
                Long l = (Long) vzg0Var.a("ANIMATED_ITEM_SAVED_KEY");
                if (l != null) {
                    jLongValue = l.longValue();
                }
                return new cs9(iunVar, bs9Var, false, jLongValue, null);
            case 5:
                Http2Connection http2Connection = (Http2Connection) this.c;
                long j2 = this.b;
                Settings settings = Http2Connection.A;
                synchronized (http2Connection) {
                    long j3 = http2Connection.m;
                    long j4 = http2Connection.l;
                    if (j3 < j4) {
                        z = true;
                    } else {
                        http2Connection.l = j4 + 1;
                        z = false;
                    }
                }
                if (!z) {
                    try {
                        http2Connection.x.l(1, 0, false);
                    } catch (IOException e) {
                        ErrorCode errorCode = ErrorCode.PROTOCOL_ERROR;
                        http2Connection.a(errorCode, errorCode, e);
                    }
                    break;
                } else {
                    ErrorCode errorCode2 = ErrorCode.PROTOCOL_ERROR;
                    http2Connection.a(errorCode2, errorCode2, null);
                    j2 = -1;
                }
                return Long.valueOf(j2);
            case 6:
                RealWebSocket realWebSocket = (RealWebSocket) this.c;
                long j5 = this.b;
                List list = RealWebSocket.x;
                synchronized (realWebSocket) {
                    try {
                        if (!realWebSocket.u && (webSocketWriter = realWebSocket.k) != null) {
                            int i = realWebSocket.w ? realWebSocket.v : -1;
                            realWebSocket.v++;
                            realWebSocket.w = true;
                            if (i != -1) {
                                StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                                sb.append(realWebSocket.c);
                                sb.append("ms (after ");
                                RealWebSocket.j(realWebSocket, new SocketTimeoutException(rz4.j(i - 1, " successful ping/pongs)", sb)), null, 2);
                            } else {
                                try {
                                    qg9 qg9Var = qg9.d;
                                    qg9Var.getClass();
                                    webSocketWriter.a(9, qg9Var);
                                } catch (IOException e2) {
                                    RealWebSocket.j(realWebSocket, e2, null, 2);
                                }
                            }
                            break;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return Long.valueOf(j5);
            case 7:
                lhf0 lhf0Var = (lhf0) this.c;
                long j6 = this.b;
                p7m0 p7m0Var2 = ((m0o0) lhf0Var.b).b.b;
                do {
                    value2 = p7m0Var2.getValue();
                    List listE = abp.e((kap) value2);
                    arrayList = new ArrayList();
                    for (Object obj : listE) {
                        if (((k8p) obj).f17883a != j6) {
                            arrayList.add(obj);
                        }
                    }
                } while (!p7m0Var2.m(value2, new iap(arrayList)));
                return Unit.f46060a;
            case 8:
                oif0 oif0Var = (oif0) this.c;
                long j7 = this.b;
                p7m0 p7m0Var3 = ((y9n0) ((y3v) oif0Var.b).b).f42258a;
                do {
                    value3 = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value3, eui0.e((Set) value3, Long.valueOf(j7))));
                return Unit.f46060a;
            default:
                w5z w5zVar = (w5z) this.c;
                long j8 = this.b;
                for (fzs0 fzs0Var : fzs0.c) {
                    fzs0Var.getClass();
                    ((on4) w5zVar.f38604a).d(fzs0Var, (((long) (fzs0Var.b() * 3600)) * 1000) + j8);
                    ((gst0) w5zVar.c).g(new mn4(fzs0Var.b(), false));
                }
                return Unit.f46060a;
        }
    }
}
