package a;

import java.io.IOException;
import java.math.RoundingMode;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class ntw0 {
    public static final ktw0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final htw0 f24121a;
    public final Character b;
    public volatile ntw0 c;

    static {
        new ltw0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/");
        new ltw0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_");
        new ntw0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567");
        new ntw0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV");
        d = new ktw0(new htw0("base16()", new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'}));
    }

    public ntw0(htw0 htw0Var, Character ch) {
        this.f24121a = htw0Var;
        if (ch != null) {
            byte[] bArr = htw0Var.g;
            if (bArr.length > 61 && bArr[61] != -1) {
                jf4.o(tnq0.s("Padding character %s was already in alphabet", ch));
                throw null;
            }
        }
        this.b = ch;
    }

    public void a(StringBuilder sb, byte[] bArr, int i) {
        int i2 = 0;
        xsm0.B(0, i, bArr.length);
        while (i2 < i) {
            htw0 htw0Var = this.f24121a;
            b(sb, bArr, i2, Math.min(htw0Var.f, i - i2));
            i2 += htw0Var.f;
        }
    }

    public final void b(StringBuilder sb, byte[] bArr, int i, int i2) {
        xsm0.B(i, i + i2, bArr.length);
        htw0 htw0Var = this.f24121a;
        int i3 = htw0Var.f;
        int i4 = htw0Var.d;
        if (i2 > i3) {
            e9d0.o();
            return;
        }
        int i5 = 0;
        long j = 0;
        for (int i6 = 0; i6 < i2; i6++) {
            j = (j | ((long) (bArr[i + i6] & 255))) << 8;
        }
        int i7 = (i2 + 1) * 8;
        while (i5 < i2 * 8) {
            sb.append(htw0Var.b[((int) (j >>> ((i7 - i4) - i5))) & htw0Var.c]);
            i5 += i4;
        }
        if (this.b != null) {
            while (i5 < htw0Var.f * 8) {
                sb.append('=');
                i5 += i4;
            }
        }
    }

    public final String c(byte[] bArr, int i) {
        xsm0.B(0, i, bArr.length);
        htw0 htw0Var = this.f24121a;
        int i2 = htw0Var.f;
        RoundingMode roundingMode = RoundingMode.CEILING;
        StringBuilder sb = new StringBuilder(htw0Var.e * cvm0.r(i, i2));
        try {
            a(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            c99.l(e);
            return null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ntw0) {
            ntw0 ntw0Var = (ntw0) obj;
            if (this.f24121a.equals(ntw0Var.f24121a) && Objects.equals(this.b, ntw0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hashCode(this.b) ^ this.f24121a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BaseEncoding.");
        htw0 htw0Var = this.f24121a;
        sb.append(htw0Var);
        if (8 % htw0Var.d != 0) {
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

    public ntw0(String str, String str2) {
        this(new htw0(str, str2.toCharArray()), (Character) '=');
    }
}
