package a;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class fmx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f9806a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        f9806a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new lyc(bArr, 0, 0, false).k(0);
        } catch (box e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static void a(Object obj, String str) {
        if (obj != null) {
            return;
        }
        hny.u(str);
    }

    public static int b(long j) {
        return (int) (j ^ (j >>> 32));
    }
}
