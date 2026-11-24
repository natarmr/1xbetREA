package okhttp3.internal.ws;

import a.e8x;
import a.e9d0;
import a.f99;
import a.jf4;
import a.ohq;
import a.qg9;
import a.u99;
import a.zae0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader;", "Ljava/io/Closeable;", "FrameCallback", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebSocketReader implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u99 f46232a;
    public final FrameCallback b;
    public final boolean c;
    public final boolean d;
    public boolean e;
    public boolean f;
    public int g;
    public long h;
    public boolean i;
    public boolean j;
    public boolean k;
    public final f99 l;
    public final f99 m;
    public MessageInflater n;
    public final byte[] o;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lokhttp3/internal/ws/WebSocketReader$FrameCallback;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface FrameCallback {
        void b(String str);

        void c(qg9 qg9Var);

        void d(qg9 qg9Var);

        void e(qg9 qg9Var);

        void g(int i, String str);
    }

    public WebSocketReader(u99 u99Var, FrameCallback frameCallback, boolean z, boolean z2) {
        u99Var.getClass();
        this.f46232a = u99Var;
        this.b = frameCallback;
        this.c = z;
        this.d = z2;
        this.l = new f99();
        this.m = new f99();
        this.o = null;
    }

    public final void a() throws IOException {
        if (this.e) {
            jf4.n("closed");
            return;
        }
        d();
        if (this.j) {
            c();
            return;
        }
        int i = this.g;
        if (i != 1 && i != 2) {
            TimeZone timeZone = _UtilJvmKt.f46122a;
            String hexString = Integer.toHexString(i);
            hexString.getClass();
            throw new ProtocolException("Unknown opcode: ".concat(hexString));
        }
        while (!this.f) {
            long j = this.h;
            f99 f99Var = this.m;
            if (j > 0) {
                this.f46232a.A0(f99Var, j);
            }
            if (this.i) {
                if (this.k) {
                    MessageInflater messageInflater = this.n;
                    if (messageInflater == null) {
                        messageInflater = new MessageInflater(this.d);
                        this.n = messageInflater;
                    }
                    f99 f99Var2 = messageInflater.b;
                    if (f99Var2.b != 0) {
                        jf4.o("Failed requirement.");
                        return;
                    }
                    Inflater inflater = messageInflater.c;
                    if (inflater == null) {
                        inflater = new Inflater(true);
                        messageInflater.c = inflater;
                    }
                    e8x e8xVar = messageInflater.d;
                    if (e8xVar == null) {
                        e8xVar = new e8x(new zae0(f99Var2), inflater);
                        messageInflater.d = e8xVar;
                    }
                    if (messageInflater.f46226a) {
                        inflater.reset();
                    }
                    f99Var2.P(f99Var);
                    f99Var2.Z(65535);
                    long bytesRead = inflater.getBytesRead() + f99Var2.b;
                    do {
                        e8xVar.a(f99Var, Long.MAX_VALUE);
                        if (inflater.getBytesRead() >= bytesRead) {
                            break;
                        }
                    } while (!inflater.finished());
                    if (inflater.getBytesRead() < bytesRead) {
                        f99Var2.a();
                        e8xVar.close();
                        messageInflater.d = null;
                        messageInflater.c = null;
                    }
                }
                FrameCallback frameCallback = this.b;
                if (i == 1) {
                    frameCallback.b(f99Var.O());
                    return;
                } else {
                    frameCallback.e(f99Var.q0(f99Var.b));
                    return;
                }
            }
            while (!this.f) {
                d();
                if (!this.j) {
                    break;
                } else {
                    c();
                }
            }
            if (this.g != 0) {
                int i2 = this.g;
                TimeZone timeZone2 = _UtilJvmKt.f46122a;
                String hexString2 = Integer.toHexString(i2);
                hexString2.getClass();
                throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
            }
        }
        ohq.l("closed");
    }

    public final void c() throws ProtocolException, EOFException {
        short s;
        String strO;
        long j = this.h;
        f99 f99Var = this.l;
        if (j > 0) {
            this.f46232a.A0(f99Var, j);
        }
        int i = this.g;
        FrameCallback frameCallback = this.b;
        switch (i) {
            case 8:
                long j2 = f99Var.b;
                if (j2 == 1) {
                    e9d0.j("Malformed close payload length of 1.");
                    return;
                }
                if (j2 != 0) {
                    s = f99Var.readShort();
                    strO = f99Var.O();
                    String strA = WebSocketProtocol.a(s);
                    if (strA != null) {
                        e9d0.j(strA);
                        return;
                    }
                } else {
                    s = 1005;
                    strO = "";
                }
                frameCallback.g(s, strO);
                this.f = true;
                return;
            case 9:
                frameCallback.c(f99Var.q0(f99Var.b));
                return;
            case 10:
                frameCallback.d(f99Var.q0(f99Var.b));
                return;
            default:
                int i2 = this.g;
                TimeZone timeZone = _UtilJvmKt.f46122a;
                String hexString = Integer.toHexString(i2);
                hexString.getClass();
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.e = true;
        MessageInflater messageInflater = this.n;
        if (messageInflater != null) {
            _UtilCommonKt.b(messageInflater);
        }
        _UtilCommonKt.b(this.f46232a);
    }

    public final void d() throws IOException {
        boolean z;
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (this.f) {
            ohq.l("closed");
            return;
        }
        u99 u99Var = this.f46232a;
        long jH = u99Var.h().h();
        u99Var.h().b();
        try {
            byte b = u99Var.readByte();
            byte[] bArr = _UtilCommonKt.f46121a;
            u99Var.h().g(jH, timeUnit);
            int i = b & 15;
            this.g = i;
            boolean z2 = (b & 128) != 0;
            this.i = z2;
            boolean z3 = (b & 8) != 0;
            this.j = z3;
            if (z3 && !z2) {
                e9d0.j("Control frames must be final.");
                return;
            }
            boolean z4 = (b & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.c) {
                        e9d0.j("Unexpected rsv1 flag");
                        return;
                    }
                    z = true;
                }
                this.k = z;
            } else if (z4) {
                e9d0.j("Unexpected rsv1 flag");
                return;
            }
            if ((b & 32) != 0) {
                e9d0.j("Unexpected rsv2 flag");
                return;
            }
            if ((b & 16) != 0) {
                e9d0.j("Unexpected rsv3 flag");
                return;
            }
            byte b2 = u99Var.readByte();
            boolean z5 = (b2 & 128) != 0;
            if (z5) {
                e9d0.j("Server-sent frames must not be masked.");
                return;
            }
            long j = b2 & 127;
            this.h = j;
            if (j == 126) {
                j = u99Var.readShort() & 65535;
                this.h = j;
            } else if (j == 127) {
                j = u99Var.readLong();
                this.h = j;
                if (j < 0) {
                    long j2 = this.h;
                    TimeZone timeZone = _UtilJvmKt.f46122a;
                    String hexString = Long.toHexString(j2);
                    hexString.getClass();
                    throw new ProtocolException("Frame length 0x" + hexString + " > 0x7FFFFFFFFFFFFFFF");
                }
            }
            if (this.j && j > 125) {
                e9d0.j("Control frame must be less than 125B.");
            } else if (z5) {
                byte[] bArr2 = this.o;
                bArr2.getClass();
                u99Var.readFully(bArr2);
            }
        } catch (Throwable th) {
            u99Var.h().g(jH, timeUnit);
            throw th;
        }
    }
}
