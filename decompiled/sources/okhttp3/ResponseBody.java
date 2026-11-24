package okhttp3;

import a.b1j;
import a.brm0;
import a.c99;
import a.f140;
import a.f99;
import a.h97;
import a.jf4;
import a.ohq;
import a.qg9;
import a.tjo;
import a.u99;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import okhttp3.internal.Internal;
import okhttp3.internal._UtilCommonKt;
import okhttp3.internal._UtilJvmKt;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "BomAwareReader", "Companion", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ResponseBody implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ResponseBody$Companion$asResponseBody$1 f46113a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class BomAwareReader extends Reader {
        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            throw null;
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) throws IOException {
            cArr.getClass();
            throw new IOException("Stream closed");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "Lokhttp3/ResponseBody;", "EMPTY", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public static ResponseBody$Companion$asResponseBody$1 a(String str, MediaType mediaType) {
            str.getClass();
            Pair pairA = Internal.a(mediaType);
            Charset charset = (Charset) pairA.f46059a;
            MediaType mediaType2 = (MediaType) pairA.b;
            f99 f99Var = new f99();
            charset.getClass();
            int length = str.length();
            str.getClass();
            if (length < 0) {
                c99.s(f140.j(length, "endIndex < beginIndex: ", 0, " < "));
            } else if (length > str.length()) {
                jf4.h(str.length(), b1j.m(length, "endIndex > string.length: ", " > "));
            } else if (charset.equals(Charsets.UTF_8)) {
                f99Var.b0(0, length, str);
            } else {
                byte[] bytes = str.substring(0, length).getBytes(charset);
                bytes.getClass();
                f99Var.U(bytes, bytes.length);
            }
            return new ResponseBody$Companion$asResponseBody$1(mediaType2, f99Var.b, f99Var);
        }
    }

    static {
        qg9 qg9Var = qg9.d;
        qg9Var.getClass();
        f99 f99Var = new f99();
        f99Var.T(qg9Var);
        f46113a = new ResponseBody$Companion$asResponseBody$1(null, qg9Var.f28671a.length, f99Var);
    }

    /* JADX INFO: renamed from: V0 */
    public abstract u99 getD();

    public final InputStream a() {
        return getD().a1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final byte[] c() throws IOException {
        long c = getC();
        byte[] th = null;
        if (c > 2147483647L) {
            ohq.l(h97.h(c, "Cannot buffer entire body for content length: "));
            return null;
        }
        u99 d = getD();
        try {
            byte[] bArrT0 = d.t0();
            try {
                d.close();
            } catch (Throwable th2) {
                th = th2;
            }
            byte[] bArr = th;
            th = bArrT0;
            th = bArr;
        } catch (Throwable th3) {
            th = th3;
            if (d != null) {
                try {
                    d.close();
                } catch (Throwable th4) {
                    tjo.a(th, th4);
                }
            }
        }
        if (th != 0) {
            throw th;
        }
        int length = th.length;
        if (c == -1 || c == length) {
            return th;
        }
        StringBuilder sbQ = brm0.q(length, c, "Content-Length (", ") and stream length (");
        sbQ.append(") disagree");
        throw new IOException(sbQ.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        _UtilCommonKt.b(getD());
    }

    /* JADX INFO: renamed from: d */
    public abstract long getC();

    /* JADX INFO: renamed from: e */
    public abstract MediaType getB();

    /* JADX WARN: Code duplicated, block: B:7:0x0013 A[Catch: all -> 0x0026, TryCatch #1 {all -> 0x0026, blocks: (B:3:0x0005, B:5:0x000b, B:8:0x0015, B:7:0x0013), top: B:24:0x0005 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final String k() {
        Charset charsetA;
        u99 d = getD();
        String th = null;
        try {
            MediaType b = getB();
            if (b != null) {
                Regex regex = MediaType.e;
                charsetA = b.a(null);
                if (charsetA == null) {
                    charsetA = Charsets.UTF_8;
                }
            } else {
                charsetA = Charsets.UTF_8;
            }
            String strH0 = d.H0(_UtilJvmKt.f(d, charsetA));
            try {
                d.close();
            } catch (Throwable th2) {
                th = th2;
            }
            String str = th;
            th = strH0;
            th = str;
        } catch (Throwable th3) {
            th = th3;
            if (d != null) {
                try {
                    d.close();
                } catch (Throwable th4) {
                    tjo.a(th, th4);
                }
            }
        }
        if (th == 0) {
            return th;
        }
        throw th;
    }
}
