package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class c4d {
    public static final c4d h = new c4d(1, 2, 3, null, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3719a;
    public final int b;
    public final int c;
    public final byte[] d;
    public final int e;
    public final int f;
    public int g;

    static {
        hne.s(0, 1, 2, 3, 4);
        vtt0.H(5);
    }

    public c4d(int i, int i2, int i3, byte[] bArr, int i4, int i5) {
        this.f3719a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
        this.e = i4;
        this.f = i5;
    }

    public static String a(int i) {
        if (i == -1) {
            return "Unset color range";
        }
        if (i != 1) {
            return i != 2 ? twn.m(i, "Undefined color range ") : "Limited range";
        }
        return "Full range";
    }

    public static String b(int i) {
        if (i == -1) {
            return "Unset color space";
        }
        if (i == 6) {
            return "BT2020";
        }
        if (i != 1) {
            return i != 2 ? twn.m(i, "Undefined color space ") : "BT601";
        }
        return "BT709";
    }

    public static String c(int i) {
        if (i == -1) {
            return "Unset color transfer";
        }
        if (i == 10) {
            return "Gamma 2.2";
        }
        if (i == 1) {
            return "Linear";
        }
        if (i == 2) {
            return "sRGB";
        }
        if (i == 3) {
            return "SDR SMPTE 170M";
        }
        if (i != 6) {
            return i != 7 ? twn.m(i, "Undefined color transfer ") : "HLG";
        }
        return "ST2084 PQ";
    }

    public static boolean e(c4d c4dVar) {
        if (c4dVar == null) {
            return true;
        }
        int i = c4dVar.f3719a;
        if (i != -1 && i != 1 && i != 2) {
            return false;
        }
        int i2 = c4dVar.b;
        if (i2 != -1 && i2 != 2) {
            return false;
        }
        int i3 = c4dVar.c;
        if ((i3 != -1 && i3 != 3) || c4dVar.d != null) {
            return false;
        }
        int i4 = c4dVar.f;
        if (i4 != -1 && i4 != 8) {
            return false;
        }
        int i5 = c4dVar.e;
        return i5 == -1 || i5 == 8;
    }

    public static int f(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int g(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 4) {
            return 10;
        }
        if (i == 13) {
            return 2;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    public final boolean d() {
        return (this.f3719a == -1 || this.b == -1 || this.c == -1) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c4d.class == obj.getClass()) {
            c4d c4dVar = (c4d) obj;
            if (this.f3719a == c4dVar.f3719a && this.b == c4dVar.b && this.c == c4dVar.c && Arrays.equals(this.d, c4dVar.d) && this.e == c4dVar.e && this.f == c4dVar.f) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.g;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((Arrays.hashCode(this.d) + ((((((527 + this.f3719a) * 31) + this.b) * 31) + this.c) * 31)) * 31) + this.e) * 31) + this.f;
        this.g = iHashCode;
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ColorInfo(");
        sb.append(b(this.f3719a));
        sb.append(", ");
        sb.append(a(this.b));
        sb.append(", ");
        sb.append(c(this.c));
        sb.append(", ");
        sb.append(this.d != null);
        sb.append(", ");
        int i = this.e;
        sb.append(i != -1 ? f140.i(i, "bit Luma") : "NA");
        sb.append(", ");
        int i2 = this.f;
        return axq.n(sb, i2 != -1 ? f140.i(i2, "bit Chroma") : "NA", Separators.RPAREN);
    }
}
