package okhttp3.internal.http2;

import a.c99;
import a.f99;
import a.qx3;
import a.t99;
import a.twn;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.concurrent.Lockable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/internal/http2/Http2Writer;", "Ljava/io/Closeable;", "Lokhttp3/internal/concurrent/Lockable;", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Http2Writer implements Closeable, Lockable {
    public static final Logger f = Logger.getLogger(Http2.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t99 f46196a;
    public final f99 b;
    public int c;
    public boolean d;
    public final Hpack.Writer e;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/http2/Http2Writer$Companion;", "", "Ljava/util/logging/Logger;", "kotlin.jvm.PlatformType", "logger", "Ljava/util/logging/Logger;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    public Http2Writer(t99 t99Var) {
        t99Var.getClass();
        this.f46196a = t99Var;
        f99 f99Var = new f99();
        this.b = f99Var;
        this.c = 16384;
        this.e = new Hpack.Writer(f99Var);
    }

    public final void a(Settings settings) {
        settings.getClass();
        synchronized (this) {
            try {
                if (this.d) {
                    throw new IOException("closed");
                }
                int i = this.c;
                int i2 = settings.f46200a;
                if ((i2 & 32) != 0) {
                    i = settings.b[5];
                }
                this.c = i;
                if (((i2 & 2) != 0 ? settings.b[1] : -1) != -1) {
                    Hpack.Writer writer = this.e;
                    int iMin = Math.min((i2 & 2) != 0 ? settings.b[1] : -1, 16384);
                    int i3 = writer.d;
                    if (i3 != iMin) {
                        if (iMin < i3) {
                            writer.b = Math.min(writer.b, iMin);
                        }
                        writer.c = true;
                        writer.d = iMin;
                        int i4 = writer.h;
                        if (iMin < i4) {
                            if (iMin == 0) {
                                Header[] headerArr = writer.e;
                                qx3.l(0, headerArr.length, null, headerArr);
                                writer.f = writer.e.length - 1;
                                writer.g = 0;
                                writer.h = 0;
                            } else {
                                writer.a(i4 - iMin);
                            }
                        }
                    }
                }
                d(0, 0, 4, 1);
                this.f46196a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(boolean z, int i, f99 f99Var, int i2) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            d(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                t99 t99Var = this.f46196a;
                f99Var.getClass();
                t99Var.F0(f99Var, i2);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.d = true;
            this.f46196a.close();
        }
    }

    public final void d(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = f;
            if (logger.isLoggable(level)) {
                logger.fine(Http2.b(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.c) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.c + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            c99.s(twn.m(i, "reserved bit set: "));
            return;
        }
        byte[] bArr = _UtilCommonKt.f46121a;
        t99 t99Var = this.f46196a;
        t99Var.getClass();
        t99Var.writeByte((i2 >>> 16) & 255);
        t99Var.writeByte((i2 >>> 8) & 255);
        t99Var.writeByte(i2 & 255);
        t99Var.writeByte(i3 & 255);
        t99Var.writeByte(i4 & 255);
        t99Var.writeInt(i & Integer.MAX_VALUE);
    }

    public final void e(int i, ErrorCode errorCode, byte[] bArr) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            if (errorCode.f46179a == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            d(0, bArr.length + 8, 7, 0);
            this.f46196a.writeInt(i);
            this.f46196a.writeInt(errorCode.f46179a);
            if (bArr.length != 0) {
                this.f46196a.write(bArr);
            }
            this.f46196a.flush();
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            this.f46196a.flush();
        }
    }

    public final void k(int i, ArrayList arrayList, boolean z) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            this.e.d(arrayList);
            long j = this.b.b;
            long jMin = Math.min(this.c, j);
            int i2 = j == jMin ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            d(i, (int) jMin, 1, i2);
            this.f46196a.F0(this.b, jMin);
            if (j > jMin) {
                long j2 = j - jMin;
                while (j2 > 0) {
                    long jMin2 = Math.min(this.c, j2);
                    j2 -= jMin2;
                    d(i, (int) jMin2, 9, j2 == 0 ? 4 : 0);
                    this.f46196a.F0(this.b, jMin2);
                }
            }
        }
    }

    public final void l(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            d(0, 8, 6, z ? 1 : 0);
            this.f46196a.writeInt(i);
            this.f46196a.writeInt(i2);
            this.f46196a.flush();
        }
    }

    public final void n(int i, ErrorCode errorCode) {
        synchronized (this) {
            if (this.d) {
                throw new IOException("closed");
            }
            if (errorCode.f46179a == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            d(i, 4, 3, 0);
            this.f46196a.writeInt(errorCode.f46179a);
            this.f46196a.flush();
        }
    }

    public final void q(int i, long j) {
        synchronized (this) {
            try {
                if (this.d) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = f;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(Http2.c(i, 4, j, false));
                }
                d(i, 4, 8, 0);
                this.f46196a.writeInt((int) j);
                this.f46196a.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
