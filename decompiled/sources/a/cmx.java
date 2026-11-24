package a;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public abstract class cmx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f4629a;
    public static final byte[] b;

    static {
        Charset.forName("US-ASCII");
        f4629a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        b = bArr;
        ByteBuffer.wrap(bArr);
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
