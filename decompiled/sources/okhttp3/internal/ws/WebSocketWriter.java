package okhttp3.internal.ws;

import a.bkb;
import a.d99;
import a.f99;
import a.jf4;
import a.ohq;
import a.qg9;
import a.t99;
import a.uvh0;
import a.uzj;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/ws/WebSocketWriter;", "Ljava/io/Closeable;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WebSocketWriter implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t99 f46233a;
    public final Random b;
    public final boolean c;
    public final boolean d;
    public final short e;
    public final f99 f;
    public final f99 g;
    public boolean h;
    public MessageDeflater i;
    public final byte[] j;
    public final d99 k;

    /* JADX WARN: Type inference failed for: r2v1, types: [int, short] */
    public WebSocketWriter(t99 t99Var, Random random, boolean z, boolean z2, long j) {
        t99Var.getClass();
        this.f46233a = t99Var;
        this.b = random;
        this.c = z;
        this.d = z2;
        this.e = (int) j;
        this.f = new f99();
        this.g = t99Var.g();
        this.j = new byte[4];
        this.k = new d99();
    }

    public final void a(int i, qg9 qg9Var) {
        if (this.h) {
            ohq.l("closed");
            return;
        }
        int iE = qg9Var.e();
        if (iE > 125) {
            jf4.o("Payload size must be less than or equal to 125");
            return;
        }
        f99 f99Var = this.g;
        f99Var.V(i | 128);
        f99Var.V(iE | 128);
        byte[] bArr = this.j;
        bArr.getClass();
        this.b.nextBytes(bArr);
        f99Var.U(bArr, bArr.length);
        if (iE > 0) {
            long j = f99Var.b;
            f99Var.T(qg9Var);
            d99 d99Var = this.k;
            d99Var.getClass();
            f99Var.H(d99Var);
            d99Var.c(j);
            WebSocketProtocol.b(d99Var, bArr);
            d99Var.close();
        }
        this.f46233a.flush();
    }

    public final void c(qg9 qg9Var) throws IOException {
        int i;
        if (this.h) {
            ohq.l("closed");
            return;
        }
        f99 f99Var = this.f;
        f99Var.T(qg9Var);
        if (!this.c || qg9Var.f28671a.length < this.e) {
            i = 129;
        } else {
            MessageDeflater messageDeflater = this.i;
            if (messageDeflater == null) {
                messageDeflater = new MessageDeflater(this.d);
                this.i = messageDeflater;
            }
            uzj uzjVar = messageDeflater.d;
            f99 f99Var2 = messageDeflater.b;
            if (f99Var2.b != 0) {
                jf4.o("Failed requirement.");
                return;
            }
            if (messageDeflater.f46224a) {
                messageDeflater.c.reset();
            }
            uzjVar.F0(f99Var, f99Var.b);
            uzjVar.flush();
            qg9 qg9Var2 = MessageDeflaterKt.f46225a;
            if (f99Var2.F(qg9Var2.e(), f99Var2.b - ((long) qg9Var2.f28671a.length), qg9Var2)) {
                long j = f99Var2.b - 4;
                d99 d99Var = new d99();
                f99Var2.H(d99Var);
                try {
                    d99Var.a(j);
                    d99Var.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        bkb.E(d99Var, th);
                        throw th2;
                    }
                }
            } else {
                f99Var2.V(0);
            }
            f99Var.F0(f99Var2, f99Var2.b);
            i = 193;
        }
        long j2 = f99Var.b;
        f99 f99Var3 = this.g;
        f99Var3.V(i);
        if (j2 <= 125) {
            f99Var3.V(((int) j2) | 128);
        } else if (j2 <= 65535) {
            f99Var3.V(254);
            f99Var3.a0((int) j2);
        } else {
            f99Var3.V(255);
            uvh0 uvh0VarS = f99Var3.S(8);
            byte[] bArr = uvh0VarS.f36348a;
            int i2 = uvh0VarS.c;
            bArr[i2] = (byte) ((j2 >>> 56) & 255);
            bArr[i2 + 1] = (byte) ((j2 >>> 48) & 255);
            bArr[i2 + 2] = (byte) ((j2 >>> 40) & 255);
            bArr[i2 + 3] = (byte) ((j2 >>> 32) & 255);
            bArr[i2 + 4] = (byte) ((j2 >>> 24) & 255);
            bArr[i2 + 5] = (byte) ((j2 >>> 16) & 255);
            bArr[i2 + 6] = (byte) ((j2 >>> 8) & 255);
            bArr[i2 + 7] = (byte) (j2 & 255);
            uvh0VarS.c = i2 + 8;
            f99Var3.b += 8;
        }
        byte[] bArr2 = this.j;
        bArr2.getClass();
        this.b.nextBytes(bArr2);
        f99Var3.U(bArr2, bArr2.length);
        if (j2 > 0) {
            d99 d99Var2 = this.k;
            d99Var2.getClass();
            f99Var.H(d99Var2);
            d99Var2.c(0L);
            WebSocketProtocol.b(d99Var2, bArr2);
            d99Var2.close();
        }
        f99Var3.F0(f99Var, j2);
        this.f46233a.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        MessageDeflater messageDeflater = this.i;
        if (messageDeflater != null) {
            _UtilCommonKt.b(messageDeflater);
        }
        _UtilCommonKt.b(this.f46233a);
    }
}
