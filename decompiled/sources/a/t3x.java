package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class t3x implements Serializable {
    public static final t3x c = new t3x(new int[0], 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f33289a;
    public final int b;

    public t3x(int[] iArr, int i) {
        this.f33289a = iArr;
        this.b = i;
    }

    public static t3x b(int... iArr) {
        x0x.z("the total number of elements must fit in an int", iArr.length <= 2147483646);
        int length = iArr.length + 1;
        int[] iArr2 = new int[length];
        iArr2[0] = 0;
        System.arraycopy(iArr, 0, iArr2, 1, iArr.length);
        return new t3x(iArr2, length);
    }

    public final int a(int i) {
        x0x.D(i, this.b);
        return this.f33289a[i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof t3x) {
            t3x t3xVar = (t3x) obj;
            int i = t3xVar.b;
            int i2 = this.b;
            if (i2 == i) {
                for (int i3 = 0; i3 < i2; i3++) {
                    if (a(i3) == t3xVar.a(i3)) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i = 0; i < this.b; i++) {
            iHashCode = (iHashCode * 31) + Integer.hashCode(this.f33289a[i]);
        }
        return iHashCode;
    }

    public final String toString() {
        int i = this.b;
        if (i == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(i * 5);
        sb.append('[');
        int[] iArr = this.f33289a;
        sb.append(iArr[0]);
        for (int i2 = 1; i2 < i; i2++) {
            sb.append(", ");
            sb.append(iArr[i2]);
        }
        sb.append(']');
        return sb.toString();
    }
}
