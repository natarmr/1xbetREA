package a;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c3x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f3700a = b(1, 0);
    public static final byte[] b;
    public static final byte[] c;
    public static final byte[] d;
    public static final byte[] e;
    public static final byte[] f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public static final byte[] j;
    public static final byte[] k;
    public static final byte[] l;
    public static final byte[] m;
    public static final byte[] n;
    public static final byte[] o;

    static {
        b(1, 2);
        b = b(2, 32);
        c = b(2, 16);
        d = b(2, 17);
        e = b(2, 18);
        b(2, 25722);
        f = b(2, 1);
        g = b(2, 2);
        h = b(2, 3);
        i = b(2, 1);
        j = b(2, 2);
        k = b(2, 3);
        l = new byte[0];
        Charset charset = x7x0.f40437a;
        m = "KEM".getBytes(charset);
        n = "HPKE".getBytes(charset);
        o = "HPKE-v1".getBytes(charset);
    }

    public static int a(d0x0 d0x0Var) {
        if (d0x0Var == d0x0.f) {
            return 32;
        }
        if (d0x0Var == d0x0.c) {
            return 65;
        }
        if (d0x0Var == d0x0.d) {
            return 97;
        }
        if (d0x0Var == d0x0.e) {
            return 133;
        }
        if (d0x0Var == d0x0.g) {
            return 1120;
        }
        jf4.o("Unable to determine KEM-encoding length for ".concat(String.valueOf(d0x0Var)));
        return 0;
    }

    public static byte[] b(int i2, int i3) {
        if (i2 > 4 || i2 < 0) {
            jf4.o("capacity must be between 0 and 4");
            return null;
        }
        if (i3 < 0 || (i2 < 4 && i3 >= (1 << (i2 << 3)))) {
            jf4.o("value too large");
            return null;
        }
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) (i3 >> (((i2 - i4) - 1) * 8));
        }
        return bArr;
    }

    public static int c(d0x0 d0x0Var) throws GeneralSecurityException {
        if (d0x0Var == d0x0.f || d0x0Var == d0x0.c) {
            return 32;
        }
        if (d0x0Var == d0x0.d) {
            return 48;
        }
        if (d0x0Var == d0x0.e) {
            return 66;
        }
        if (d0x0Var == d0x0.g) {
            return 32;
        }
        hny.o("Unrecognized HPKE KEM identifier");
        return 0;
    }
}
