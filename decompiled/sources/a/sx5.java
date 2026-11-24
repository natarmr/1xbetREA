package a;

import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class sx5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32957a;
    public final char[] b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final byte[] g;
    public final boolean h;

    public sx5(String str, char[] cArr, byte[] bArr, boolean z) {
        this.f32957a = str;
        cArr.getClass();
        this.b = cArr;
        try {
            int length = cArr.length;
            RoundingMode roundingMode = RoundingMode.UNNECESSARY;
            int iY = g1x.y(length);
            this.d = iY;
            int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(iY);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.e = i;
            this.f = iY >> iNumberOfTrailingZeros;
            this.c = cArr.length - 1;
            this.g = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.f; i2++) {
                int i3 = this.d;
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                zArr[g1x.s(i2 * 8, i3)] = true;
            }
            this.h = z;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof sx5)) {
            return false;
        }
        sx5 sx5Var = (sx5) obj;
        return this.h == sx5Var.h && Arrays.equals(this.b, sx5Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.h ? 1231 : 1237);
    }

    public final String toString() {
        return this.f32957a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public sx5(String str, char[] cArr) {
        byte[] bArr = new byte[128];
        Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            if (c < 128) {
                if (bArr[c] == -1) {
                    bArr[c] = (byte) i;
                } else {
                    jf4.o(jtm0.p("Duplicate character: %s", Character.valueOf(c)));
                    throw null;
                }
            } else {
                jf4.o(jtm0.p("Non-ASCII character: %s", Character.valueOf(c)));
                throw null;
            }
        }
        this(str, cArr, bArr, false);
    }
}
