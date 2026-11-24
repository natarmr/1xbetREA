package a;

import android.gov.nist.core.Separators;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class sg9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f32150a;

    public sg9(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        this.f32150a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i);
    }

    public static sg9 a(byte[] bArr) {
        if (bArr != null) {
            return new sg9(bArr, bArr.length);
        }
        hny.u("data must be non-null");
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof sg9) {
            return Arrays.equals(((sg9) obj).f32150a, this.f32150a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f32150a);
    }

    public final String toString() {
        return "Bytes(" + kbc.S(this.f32150a) + Separators.RPAREN;
    }
}
