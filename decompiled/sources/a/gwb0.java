package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class gwb0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f12019a;

    public gwb0(byte[] bArr) {
        this.f12019a = Arrays.copyOf(bArr, bArr.length);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        gwb0 gwb0Var = (gwb0) obj;
        byte[] bArr = this.f12019a;
        int length = bArr.length;
        byte[] bArr2 = gwb0Var.f12019a;
        if (length != bArr2.length) {
            return bArr.length - bArr2.length;
        }
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            byte b2 = gwb0Var.f12019a[i];
            if (b != b2) {
                return b - b2;
            }
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof gwb0) {
            return Arrays.equals(this.f12019a, ((gwb0) obj).f12019a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f12019a);
    }

    public final String toString() {
        return kbc.S(this.f12019a);
    }
}
