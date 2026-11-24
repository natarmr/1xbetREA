package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class icw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f14556a;

    public icw0(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.f14556a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static icw0 a(byte[] bArr) {
        if (bArr == null) {
            hny.u("data must be non-null");
            return null;
        }
        int length = bArr.length;
        if (length > bArr.length) {
            length = bArr.length;
        }
        return new icw0(bArr, length);
    }

    public final byte[] b() {
        byte[] bArr = this.f14556a;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof icw0) {
            return Arrays.equals(((icw0) obj).f14556a, this.f14556a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f14556a);
    }

    public final String toString() {
        return kng0.l("Bytes(", zcm0.s(this.f14556a), Separators.RPAREN);
    }
}
