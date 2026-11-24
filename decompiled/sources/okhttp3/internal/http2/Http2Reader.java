package okhttp3.internal.http2;

import a.axq;
import a.emk0;
import a.f140;
import a.f99;
import a.fmq0;
import a.l1e0;
import a.ohq;
import a.qg9;
import a.qx3;
import a.twn;
import a.u99;
import a.ua80;
import a.wqv;
import a.zae0;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal.concurrent.TaskQueue;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http2/Http2Reader;", "Ljava/io/Closeable;", "ContinuationSource", "Handler", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Http2Reader implements Closeable {
    public static final Logger d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u99 f46191a;
    public final ContinuationSource b;
    public final Hpack.Reader c;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Companion;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static int a(int i, int i2, int i3) throws IOException {
            if ((i2 & 8) != 0) {
                i--;
            }
            if (i3 <= i) {
                return i - i3;
            }
            ohq.l(f140.j(i3, "PROTOCOL_ERROR padding ", i, " > remaining length "));
            return 0;
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$ContinuationSource;", "La/emk0;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ContinuationSource implements emk0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u99 f46192a;
        public int b;
        public int c;
        public int d;
        public int e;

        public ContinuationSource(u99 u99Var) {
            u99Var.getClass();
            this.f46192a = u99Var;
        }

        @Override // a.emk0
        public final long Y(f99 f99Var, long j) throws IOException {
            int i;
            int i2;
            f99Var.getClass();
            do {
                int i3 = this.d;
                u99 u99Var = this.f46192a;
                if (i3 == 0) {
                    u99Var.skip(this.e);
                    this.e = 0;
                    if ((this.b & 4) == 0) {
                        i = this.c;
                        int iO = _UtilCommonKt.o(u99Var);
                        this.d = iO;
                        int i4 = u99Var.readByte() & 255;
                        this.b = u99Var.readByte() & 255;
                        Logger logger = Http2Reader.d;
                        if (logger.isLoggable(Level.FINE)) {
                            qg9 qg9Var = Http2.f46185a;
                            logger.fine(Http2.b(true, this.c, iO, i4, this.b));
                        }
                        i2 = u99Var.readInt() & Integer.MAX_VALUE;
                        this.c = i2;
                        if (i4 != 9) {
                            ohq.l(f140.i(i4, " != TYPE_CONTINUATION"));
                            return 0L;
                        }
                    }
                } else {
                    long jY = u99Var.Y(f99Var, Math.min(j, i3));
                    if (jY != -1) {
                        this.d -= (int) jY;
                        return jY;
                    }
                }
                return -1L;
            } while (i2 == i);
            ohq.l("TYPE_CONTINUATION streamId changed");
            return 0L;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
        }

        @Override // a.emk0
        public final fmq0 h() {
            return this.f46192a.h();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lokhttp3/internal/http2/Http2Reader$Handler;", "", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Handler {
    }

    static {
        Logger logger = Logger.getLogger(Http2.class.getName());
        logger.getClass();
        d = logger;
    }

    public Http2Reader(u99 u99Var) {
        u99Var.getClass();
        this.f46191a = u99Var;
        ContinuationSource continuationSource = new ContinuationSource(u99Var);
        this.b = continuationSource;
        this.c = new Hpack.Reader(continuationSource);
    }

    /* JADX WARN: Code duplicated, block: B:172:0x026a  */
    /* JADX WARN: Code duplicated, block: B:174:0x026e  */
    /* JADX WARN: Code duplicated, block: B:224:0x0101 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:75:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x0143  */
    public final boolean a(boolean z, Http2Connection.ReaderRunnable readerRunnable) throws Exception {
        int i;
        qg9 qg9VarQ0;
        Http2Connection http2Connection;
        Logger logger = d;
        u99 u99Var = this.f46191a;
        try {
            u99Var.h0(9L);
            int iO = _UtilCommonKt.o(u99Var);
            if (iO > 16384) {
                ohq.l(twn.m(iO, "FRAME_SIZE_ERROR: "));
                return false;
            }
            int i2 = u99Var.readByte() & 255;
            byte b = u99Var.readByte();
            int i3 = b & 255;
            int i4 = u99Var.readInt() & Integer.MAX_VALUE;
            if (i2 != 8 && logger.isLoggable(Level.FINE)) {
                logger.fine(Http2.b(true, i4, iO, i2, i3));
            }
            if (z && i2 != 4) {
                ohq.r(Http2.a(i2), "Expected a SETTINGS frame but was ");
                return false;
            }
            ErrorCode errorCode = null;
            switch (i2) {
                case 0:
                    if (i4 == 0) {
                        ohq.l("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                        return false;
                    }
                    boolean z2 = (b & 1) != 0;
                    if ((b & 32) != 0) {
                        ohq.l("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                        return false;
                    }
                    int i5 = (b & 8) != 0 ? u99Var.readByte() & 255 : 0;
                    readerRunnable.a(z2, i4, u99Var, Companion.a(iO, i3, i5));
                    u99Var.skip(i5);
                    return true;
                case 1:
                    if (i4 == 0) {
                        ohq.l("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                        return false;
                    }
                    boolean z3 = (b & 1) != 0;
                    int i6 = (b & 8) != 0 ? u99Var.readByte() & 255 : 0;
                    if ((b & 32) != 0) {
                        d(readerRunnable, i4);
                        iO -= 5;
                    }
                    readerRunnable.b(i4, c(Companion.a(iO, i3, i6), i6, i3, i4), z3);
                    return true;
                case 2:
                    if (iO != 5) {
                        ohq.l(ua80.e(iO, "TYPE_PRIORITY length: ", " != 5"));
                        return false;
                    }
                    if (i4 != 0) {
                        d(readerRunnable, i4);
                        return true;
                    }
                    ohq.l("TYPE_PRIORITY streamId == 0");
                    return false;
                case 3:
                    if (iO != 4) {
                        ohq.l(ua80.e(iO, "TYPE_RST_STREAM length: ", " != 4"));
                        return false;
                    }
                    if (i4 == 0) {
                        ohq.l("TYPE_RST_STREAM streamId == 0");
                        return false;
                    }
                    int i7 = u99Var.readInt();
                    ErrorCode.b.getClass();
                    for (ErrorCode errorCode2 : ErrorCode.values()) {
                        if (errorCode2.f46179a == i7) {
                            errorCode = errorCode2;
                            if (errorCode != null) {
                                readerRunnable.h(i4, errorCode);
                                return true;
                            }
                            ohq.l(twn.m(i7, "TYPE_RST_STREAM unexpected error code: "));
                            return false;
                        }
                    }
                    if (errorCode != null) {
                        readerRunnable.h(i4, errorCode);
                        return true;
                    }
                    ohq.l(twn.m(i7, "TYPE_RST_STREAM unexpected error code: "));
                    return false;
                case 4:
                    if (i4 != 0) {
                        ohq.l("TYPE_SETTINGS streamId != 0");
                        return false;
                    }
                    if ((b & 1) != 0) {
                        if (iO != 0) {
                            ohq.l("FRAME_SIZE_ERROR ack frame should be empty!");
                            return false;
                        }
                        return true;
                    }
                    if (iO % 6 != 0) {
                        ohq.l(twn.m(iO, "TYPE_SETTINGS length % 6 != 0: "));
                        return false;
                    }
                    Settings settings = new Settings();
                    kotlin.ranges.a aVarM = l1e0.m(6, l1e0.o(0, iO));
                    int i8 = aVarM.f46068a;
                    int i9 = aVarM.b;
                    int i10 = aVarM.c;
                    if ((i10 > 0 && i8 <= i9) || (i10 < 0 && i9 <= i8)) {
                        while (true) {
                            short s = u99Var.readShort();
                            byte[] bArr = _UtilCommonKt.f46121a;
                            int i11 = s & 65535;
                            i = u99Var.readInt();
                            if (i11 != 2) {
                                if (i11 != 4) {
                                    if (i11 == 5 && (i < 16384 || i > 16777215)) {
                                    }
                                } else if (i < 0) {
                                    ohq.l("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                    return false;
                                }
                            } else if (i != 0 && i != 1) {
                                ohq.l("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                return false;
                            }
                            settings.b(i11, i);
                            if (i8 != i9) {
                                i8 += i10;
                            }
                        }
                        ohq.l(twn.m(i, "PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: "));
                        return false;
                    }
                    Http2Connection http2Connection2 = Http2Connection.this;
                    TaskQueue.c(http2Connection2.h, axq.n(new StringBuilder(), http2Connection2.c, " applyAndAckSettings"), 0L, new wqv(readerRunnable, settings, (byte) 13), 6);
                    return true;
                case 5:
                    if (i4 == 0) {
                        ohq.l("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                        return false;
                    }
                    int i12 = (b & 8) != 0 ? u99Var.readByte() & 255 : 0;
                    readerRunnable.g(u99Var.readInt() & Integer.MAX_VALUE, c(Companion.a(iO - 4, i3, i12), i12, i3, i4));
                    return true;
                case 6:
                    if (iO != 8) {
                        ohq.l(twn.m(iO, "TYPE_PING length != 8: "));
                        return false;
                    }
                    if (i4 == 0) {
                        readerRunnable.c(u99Var.readInt(), u99Var.readInt(), (b & 1) != 0);
                        return true;
                    }
                    ohq.l("TYPE_PING streamId != 0");
                    return false;
                case 7:
                    if (iO < 8) {
                        ohq.l(twn.m(iO, "TYPE_GOAWAY length < 8: "));
                        return false;
                    }
                    if (i4 != 0) {
                        ohq.l("TYPE_GOAWAY streamId != 0");
                        return false;
                    }
                    int i13 = u99Var.readInt();
                    int i14 = u99Var.readInt();
                    int i15 = iO - 8;
                    ErrorCode.b.getClass();
                    for (ErrorCode errorCode3 : ErrorCode.values()) {
                        if (errorCode3.f46179a == i14) {
                            errorCode = errorCode3;
                            if (errorCode != null) {
                                ohq.l(twn.m(i14, "TYPE_GOAWAY unexpected error code: "));
                                return false;
                            }
                            qg9VarQ0 = qg9.d;
                            if (i15 > 0) {
                                qg9VarQ0 = u99Var.q0(i15);
                            }
                            qg9VarQ0.getClass();
                            qg9VarQ0.e();
                            http2Connection = Http2Connection.this;
                            synchronized (http2Connection) {
                                Object[] array = http2Connection.b.values().toArray(new Http2Stream[0]);
                                http2Connection.f = true;
                            }
                            for (Http2Stream http2Stream : (Http2Stream[]) array) {
                                if (http2Stream.f46193a <= i13 && http2Stream.i()) {
                                    ErrorCode errorCode4 = ErrorCode.REFUSED_STREAM;
                                    synchronized (http2Stream) {
                                        if (http2Stream.h() == null) {
                                            http2Stream.l = errorCode4;
                                            http2Stream.notifyAll();
                                        }
                                        break;
                                    }
                                    Http2Connection.this.d(http2Stream.f46193a);
                                }
                            }
                            return true;
                        }
                    }
                    if (errorCode != null) {
                        ohq.l(twn.m(i14, "TYPE_GOAWAY unexpected error code: "));
                        return false;
                    }
                    qg9VarQ0 = qg9.d;
                    if (i15 > 0) {
                        qg9VarQ0 = u99Var.q0(i15);
                    }
                    qg9VarQ0.getClass();
                    qg9VarQ0.e();
                    http2Connection = Http2Connection.this;
                    synchronized (http2Connection) {
                        Object[] array2 = http2Connection.b.values().toArray(new Http2Stream[0]);
                        http2Connection.f = true;
                        while (i < r2) {
                            if (http2Stream.f46193a <= i13) {
                            }
                        }
                        return true;
                    }
                case 8:
                    try {
                        if (iO != 4) {
                            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + iO);
                        }
                        long j = 2147483647L & ((long) u99Var.readInt());
                        if (j == 0) {
                            throw new IOException("windowSizeIncrement was 0");
                        }
                        if (logger.isLoggable(Level.FINE)) {
                            logger.fine(Http2.c(i4, iO, j, true));
                        }
                        Http2Connection http2Connection3 = Http2Connection.this;
                        if (i4 == 0) {
                            synchronized (http2Connection3) {
                                http2Connection3.v += j;
                                http2Connection3.notifyAll();
                            }
                            return true;
                        }
                        Http2Stream http2StreamC = http2Connection3.c(i4);
                        if (http2StreamC != null) {
                            synchronized (http2StreamC) {
                                http2StreamC.e += j;
                                if (j > 0) {
                                    http2StreamC.notifyAll();
                                }
                                break;
                            }
                            return true;
                        }
                        return true;
                    } catch (Exception e) {
                        logger.fine(Http2.b(true, i4, iO, 8, i3));
                        throw e;
                    }
                default:
                    u99Var.skip(iO);
                    return true;
            }
        } catch (EOFException unused) {
        }
    }

    public final List c(int i, int i2, int i3, int i4) throws IOException {
        ContinuationSource continuationSource = this.b;
        continuationSource.d = i;
        continuationSource.e = i2;
        continuationSource.b = i3;
        continuationSource.c = i4;
        Hpack.Reader reader = this.c;
        zae0 zae0Var = reader.d;
        while (!zae0Var.v0()) {
            byte b = zae0Var.readByte();
            byte[] bArr = _UtilCommonKt.f46121a;
            int i5 = b & 255;
            if (i5 == 128) {
                ohq.l("index == 0");
                return null;
            }
            if ((b & 128) == 128) {
                int iF = reader.f(i5, 127);
                int i6 = iF - 1;
                if (i6 >= 0) {
                    Header[] headerArr = Hpack.f46182a;
                    if (i6 <= headerArr.length - 1) {
                        reader.a(headerArr[i6]);
                    }
                }
                int length = reader.f + 1 + (i6 - Hpack.f46182a.length);
                if (length >= 0) {
                    Header[] headerArr2 = reader.e;
                    if (length < headerArr2.length) {
                        Header header = headerArr2[length];
                        header.getClass();
                        reader.a(header);
                    }
                }
                ohq.l(twn.m(iF, "Header index too large "));
                return null;
            }
            if (i5 == 64) {
                Header[] headerArr3 = Hpack.f46182a;
                qg9 qg9VarE = reader.e();
                Hpack.a(qg9VarE);
                reader.d(new Header(qg9VarE, reader.e()));
            } else if ((b & 64) == 64) {
                reader.d(new Header(reader.c(reader.f(i5, 63) - 1), reader.e()));
            } else if ((b & 32) == 32) {
                int iF2 = reader.f(i5, 31);
                reader.f46183a = iF2;
                if (iF2 < 0 || iF2 > 4096) {
                    throw new IOException("Invalid dynamic table size update " + reader.f46183a);
                }
                int i7 = reader.h;
                if (iF2 < i7) {
                    if (iF2 == 0) {
                        Header[] headerArr4 = reader.e;
                        qx3.l(0, headerArr4.length, null, headerArr4);
                        reader.f = reader.e.length - 1;
                        reader.g = 0;
                        reader.h = 0;
                    } else {
                        reader.b(i7 - iF2);
                    }
                }
            } else if (i5 == 16 || i5 == 0) {
                Header[] headerArr5 = Hpack.f46182a;
                qg9 qg9VarE2 = reader.e();
                Hpack.a(qg9VarE2);
                reader.a(new Header(qg9VarE2, reader.e()));
            } else {
                reader.a(new Header(reader.c(reader.f(i5, 15) - 1), reader.e()));
            }
        }
        ArrayList arrayList = reader.b;
        List listL0 = CollectionsKt.L0(arrayList);
        arrayList.clear();
        reader.c = 0L;
        return listL0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f46191a.close();
    }

    public final void d(Http2Connection.ReaderRunnable readerRunnable, int i) {
        u99 u99Var = this.f46191a;
        u99Var.readInt();
        u99Var.readByte();
        byte[] bArr = _UtilCommonKt.f46121a;
    }
}
