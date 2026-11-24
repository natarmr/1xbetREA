package a;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class vx5 {
    public static final ux5 d;
    public static final tx5 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sx5 f38184a;
    public final Character b;
    public volatile vx5 c;

    static {
        new ux5("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        d = new ux5("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new vx5("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new vx5("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        e = new tx5(new sx5("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0017  */
    public vx5(sx5 sx5Var, Character ch) {
        boolean z;
        this.f38184a = sx5Var;
        if (ch != null) {
            char cCharValue = ch.charValue();
            byte[] bArr = sx5Var.g;
            if (cCharValue >= bArr.length || bArr[cCharValue] == -1) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = true;
        }
        x0x.y("Padding character %s was already in alphabet", ch, z);
        this.b = ch;
    }

    public final String a(byte[] bArr, int i) {
        x0x.I(0, i, bArr.length);
        sx5 sx5Var = this.f38184a;
        int i2 = sx5Var.e;
        int i3 = sx5Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(g1x.s(i, i3) * i2);
        try {
            c(sb, bArr, i);
            return sb.toString();
        } catch (IOException e2) {
            c99.l(e2);
            return null;
        }
    }

    public final void b(StringBuilder sb, byte[] bArr, int i, int i2) {
        x0x.I(i, i + i2, bArr.length);
        sx5 sx5Var = this.f38184a;
        int i3 = sx5Var.f;
        int i4 = sx5Var.d;
        int i5 = 0;
        x0x.A(i2 <= i3);
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = ((i2 + 1) * 8) - i4;
        while (i5 < i2 * 8) {
            sb.append(sx5Var.b[((int) (j >>> (i7 - i5))) & sx5Var.c]);
            i5 += i4;
        }
        Character ch = this.b;
        if (ch != null) {
            while (i5 < sx5Var.f * 8) {
                sb.append(ch.charValue());
                i5 += i4;
            }
        }
    }

    public void c(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        x0x.I(0, i, bArr.length);
        while (i2 < i) {
            sx5 sx5Var = this.f38184a;
            b(sb, bArr, i2, Math.min(sx5Var.f, i - i2));
            i2 += sx5Var.f;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vx5) {
            vx5 vx5Var = (vx5) obj;
            if (this.f38184a.equals(vx5Var.f38184a) && Objects.equals(this.b, vx5Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) ^ this.f38184a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        sx5 sx5Var = this.f38184a;
        sb.append(sx5Var);
        if (8 % sx5Var.d != 0) {
            Character ch = this.b;
            if (ch == null) {
                sb.append(".omitPadding()");
            } else {
                sb.append(".withPadChar('");
                sb.append(ch);
                sb.append("')");
            }
        }
        return sb.toString();
    }

    public vx5(String str, String str2) {
        this(new sx5(str, str2.toCharArray()), (Character) '=');
    }
}
