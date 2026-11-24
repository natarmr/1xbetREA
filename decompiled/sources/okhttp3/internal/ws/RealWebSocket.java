package okhttp3.internal.ws;

import a.axq;
import a.e9d0;
import a.f99;
import a.gl5;
import a.hne;
import a.hny;
import a.jf4;
import a.mie0;
import a.njk0;
import a.p7d0;
import a.qg9;
import a.sbe0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.a;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.concurrent.Lockable;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.connection.BufferedSocketKt$asBufferedSocket$1;
import okhttp3.internal.connection.RealCall;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket;", "Lokhttp3/WebSocket;", "Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "Lokhttp3/internal/concurrent/Lockable;", "Message", "Close", "WriterTask", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RealWebSocket implements WebSocket, WebSocketReader.FrameCallback, Lockable {
    public static final List x = a.c(Protocol.HTTP_1_1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WebSocketListener f46227a;
    public final Random b;
    public final long c;
    public WebSocketExtensions d;
    public final short e;
    public final long f;
    public final String g;
    public RealCall h;
    public Task i;
    public WebSocketReader j;
    public WebSocketWriter k;
    public final TaskQueue l;
    public String m;
    public BufferedSocketKt$asBufferedSocket$1 n;
    public final ArrayDeque o;
    public final ArrayDeque p;
    public long q;
    public boolean r;
    public int s;
    public String t;
    public boolean u;
    public int v;
    public boolean w;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Close;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Close {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final short f46228a;
        public final qg9 b;
        public final long c;

        /* JADX WARN: Multi-variable type inference failed */
        public Close(int i, long j, qg9 qg9Var) {
            this.f46228a = i;
            this.b = qg9Var;
            this.c = j;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Companion;", "", "", "Lokhttp3/Protocol;", "ONLY_HTTP1", "Ljava/util/List;", "", "MAX_QUEUE_SIZE", "J", "CANCEL_AFTER_CLOSE_MILLIS", "DEFAULT_MINIMUM_DEFLATE_SIZE", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$Message;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Message {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final qg9 f46229a;

        public Message(qg9 qg9Var) {
            this.f46229a = qg9Var;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/RealWebSocket$WriterTask;", "Lokhttp3/internal/concurrent/Task;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class WriterTask extends Task {
        public WriterTask() {
            super(axq.n(new StringBuilder(), RealWebSocket.this.m, " writer"), true);
        }

        @Override // okhttp3.internal.concurrent.Task
        public final long b() {
            RealWebSocket realWebSocket = RealWebSocket.this;
            try {
                return realWebSocket.m() ? 0L : -1L;
            } catch (IOException e) {
                RealWebSocket.j(realWebSocket, e, null, 2);
                return -1L;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [int, short] */
    public RealWebSocket(TaskRunner taskRunner, Request request, WebSocketListener webSocketListener, Random random, long j, long j2, long j3) {
        taskRunner.getClass();
        this.f46227a = webSocketListener;
        this.b = random;
        this.c = j;
        this.d = null;
        this.e = (int) j2;
        this.f = j3;
        this.l = taskRunner.newQueue();
        this.o = new ArrayDeque();
        this.p = new ArrayDeque();
        this.s = -1;
        String str = request.b;
        if (!"GET".equals(str)) {
            hny.v(str, "Request must be GET: ");
            throw null;
        }
        qg9 qg9Var = qg9.d;
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        this.g = gl5.m(bArr).a();
    }

    public static void j(RealWebSocket realWebSocket, Exception exc, Response response, int i) {
        WebSocketWriter webSocketWriter;
        if ((i & 2) != 0) {
            response = null;
        }
        boolean z = (i & 4) == 0;
        mie0 mie0Var = new mie0();
        synchronized (realWebSocket) {
            try {
                if (realWebSocket.u) {
                    return;
                }
                realWebSocket.u = true;
                BufferedSocketKt$asBufferedSocket$1 bufferedSocketKt$asBufferedSocket$1 = realWebSocket.n;
                WebSocketWriter webSocketWriter2 = realWebSocket.k;
                mie0Var.f21842a = webSocketWriter2;
                realWebSocket.k = null;
                if (!z && webSocketWriter2 != null) {
                    TaskQueue.c(realWebSocket.l, realWebSocket.m + " writer close", 0L, new sbe0(mie0Var, (byte) 0), 2);
                }
                realWebSocket.l.g();
                try {
                    realWebSocket.f46227a.c(realWebSocket, exc, response);
                } finally {
                    if (bufferedSocketKt$asBufferedSocket$1 != null) {
                        bufferedSocketKt$asBufferedSocket$1.cancel();
                    }
                    if (z && (webSocketWriter = (WebSocketWriter) mie0Var.f21842a) != null) {
                        _UtilCommonKt.b(webSocketWriter);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // okhttp3.WebSocket
    public final boolean a(String str) {
        str.getClass();
        qg9 qg9Var = qg9.d;
        qg9 qg9VarI = gl5.i(str);
        synchronized (this) {
            if (!this.u && !this.r) {
                long j = this.q;
                byte[] bArr = qg9VarI.f28671a;
                if (((long) bArr.length) + j > 16777216) {
                    f(1001, null);
                    return false;
                }
                this.q = j + ((long) bArr.length);
                this.p.add(new Message(qg9VarI));
                l();
                return true;
            }
            return false;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void b(String str) {
        this.f46227a.d(this, str);
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final synchronized void c(qg9 qg9Var) {
        try {
            qg9Var.getClass();
            if (!this.u && (!this.r || !this.p.isEmpty())) {
                this.o.add(qg9Var);
                l();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final synchronized void d(qg9 qg9Var) {
        qg9Var.getClass();
        this.w = false;
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void e(qg9 qg9Var) {
        qg9Var.getClass();
    }

    @Override // okhttp3.WebSocket
    public final boolean f(int i, String str) {
        qg9 qg9VarI;
        long j = this.f;
        synchronized (this) {
            try {
                String strA = WebSocketProtocol.a(i);
                if (strA != null) {
                    throw new IllegalArgumentException(strA.toString());
                }
                if (str != null) {
                    qg9 qg9Var = qg9.d;
                    qg9VarI = gl5.i(str);
                    if (qg9VarI.f28671a.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                } else {
                    qg9VarI = null;
                }
                if (!this.u && !this.r) {
                    this.r = true;
                    this.p.add(new Close(i, j, qg9VarI));
                    l();
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // okhttp3.internal.ws.WebSocketReader.FrameCallback
    public final void g(int i, String str) {
        if (i == -1) {
            jf4.o("Failed requirement.");
            return;
        }
        synchronized (this) {
            if (this.s != -1) {
                throw new IllegalStateException("already closed");
            }
            this.s = i;
            this.t = str;
        }
        this.f46227a.b(this, i, str);
    }

    public final void h() {
        RealCall realCall = this.h;
        realCall.getClass();
        realCall.cancel();
    }

    public final njk0 i(Response response) throws ProtocolException {
        Headers headers = response.f;
        int i = response.d;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(axq.m(sb, response.c, '\''));
        }
        String strB = headers.b("Connection");
        if (strB == null) {
            strB = null;
        }
        if (!"Upgrade".equalsIgnoreCase(strB)) {
            throw new ProtocolException(hne.l('\'', "Expected 'Connection' header value 'Upgrade' but was '", strB));
        }
        String strB2 = headers.b("Upgrade");
        if (strB2 == null) {
            strB2 = null;
        }
        if (!"websocket".equalsIgnoreCase(strB2)) {
            throw new ProtocolException(hne.l('\'', "Expected 'Upgrade' header value 'websocket' but was '", strB2));
        }
        String strB3 = headers.b("Sec-WebSocket-Accept");
        if (strB3 == null) {
            strB3 = null;
        }
        qg9 qg9Var = qg9.d;
        String strA = gl5.i(this.g + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11").d("SHA-1").a();
        if (strA.equals(strB3)) {
            njk0 njk0Var = response.h;
            if (njk0Var != null) {
                return njk0Var;
            }
            e9d0.j("Web Socket socket missing: bad interceptor?");
            return null;
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strA + "' but was '" + strB3 + '\'');
    }

    public final void k() {
        int i;
        String str;
        WebSocketReader webSocketReader;
        boolean z;
        synchronized (this) {
            try {
                i = this.s;
                str = this.t;
                webSocketReader = this.j;
                this.j = null;
                if (this.r && this.p.isEmpty()) {
                    WebSocketWriter webSocketWriter = this.k;
                    if (webSocketWriter != null) {
                        this.k = null;
                        TaskQueue.c(this.l, this.m + " writer close", 0L, new p7d0(webSocketWriter, (byte) 24), 2);
                    }
                    this.l.g();
                }
                z = (this.u || this.k != null || this.s == -1) ? false : true;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            WebSocketListener webSocketListener = this.f46227a;
            str.getClass();
            webSocketListener.a(this, i, str);
        }
        if (webSocketReader != null) {
            _UtilCommonKt.b(webSocketReader);
        }
    }

    public final void l() {
        TimeZone timeZone = _UtilJvmKt.f46122a;
        Task task = this.i;
        if (task != null) {
            this.l.d(task, 0L);
        }
    }

    public final boolean m() {
        String str;
        int i;
        WebSocketWriter webSocketWriter;
        synchronized (this) {
            try {
                boolean z = false;
                if (this.u) {
                    return false;
                }
                WebSocketWriter webSocketWriter2 = this.k;
                Object objPoll = this.o.poll();
                Object obj = null;
                if (objPoll == null) {
                    Object objPoll2 = this.p.poll();
                    if (objPoll2 instanceof Close) {
                        i = this.s;
                        str = this.t;
                        if (i != -1) {
                            webSocketWriter = this.k;
                            this.k = null;
                            if (webSocketWriter != null && this.j == null) {
                                z = true;
                            }
                            this.l.g();
                        } else {
                            long j = ((Close) objPoll2).c;
                            TaskQueue.c(this.l, this.m + " cancel", TimeUnit.MILLISECONDS.toNanos(j), new p7d0(this, (byte) 23), 4);
                            webSocketWriter = null;
                        }
                    } else {
                        if (objPoll2 == null) {
                            return false;
                        }
                        str = null;
                        i = -1;
                        webSocketWriter = null;
                    }
                    obj = objPoll2;
                } else {
                    str = null;
                    i = -1;
                    webSocketWriter = null;
                }
                try {
                    if (objPoll != null) {
                        webSocketWriter2.getClass();
                        webSocketWriter2.a(10, (qg9) objPoll);
                    } else if (obj instanceof Message) {
                        webSocketWriter2.getClass();
                        webSocketWriter2.c(((Message) obj).f46229a);
                        synchronized (this) {
                            this.q -= (long) ((Message) obj).f46229a.f28671a.length;
                        }
                    } else {
                        if (!(obj instanceof Close)) {
                            throw new AssertionError();
                        }
                        webSocketWriter2.getClass();
                        short s = ((Close) obj).f46228a;
                        qg9 qg9Var = ((Close) obj).b;
                        qg9 qg9Var2 = qg9.d;
                        String strA = WebSocketProtocol.a(s);
                        if (strA != null) {
                            throw new IllegalArgumentException(strA.toString());
                        }
                        f99 f99Var = new f99();
                        f99Var.a0(s);
                        if (qg9Var != null) {
                            f99Var.T(qg9Var);
                        }
                        try {
                            webSocketWriter2.a(8, f99Var.q0(f99Var.b));
                            webSocketWriter2.h = true;
                            if (z) {
                                WebSocketListener webSocketListener = this.f46227a;
                                str.getClass();
                                webSocketListener.a(this, i, str);
                            }
                        } catch (Throwable th) {
                            webSocketWriter2.h = true;
                            throw th;
                        }
                    }
                    if (webSocketWriter != null) {
                        _UtilCommonKt.b(webSocketWriter);
                    }
                    return true;
                } catch (Throwable th2) {
                    if (webSocketWriter != null) {
                        _UtilCommonKt.b(webSocketWriter);
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
