package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p68 implements Cloneable {
    public static final int[] c = new int[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f26442a;
    public int b;

    public p68(int i) {
        this.b = i;
        this.f26442a = new int[(i + 31) / 32];
    }

    public final void a(boolean z) {
        c(this.b + 1);
        if (z) {
            int[] iArr = this.f26442a;
            int i = this.b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.b++;
    }

    public final void b(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            jf4.o("Num bits must be between 0 and 32");
            return;
        }
        int i3 = this.b;
        c(i3 + i2);
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            if (((1 << i4) & i) != 0) {
                int[] iArr = this.f26442a;
                int i5 = i3 / 32;
                iArr[i5] = iArr[i5] | (1 << (i3 & 31));
            }
            i3++;
        }
        this.b = i3;
    }

    public final void c(int i) {
        if (i > this.f26442a.length * 32) {
            int[] iArr = new int[(((int) Math.ceil(i / 0.75f)) + 31) / 32];
            int[] iArr2 = this.f26442a;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            this.f26442a = iArr;
        }
    }

    public final Object clone() {
        int[] iArr = (int[]) this.f26442a.clone();
        int i = this.b;
        p68 p68Var = new p68();
        p68Var.f26442a = iArr;
        p68Var.b = i;
        return p68Var;
    }

    public final boolean d(int i) {
        return (this.f26442a[i / 32] & (1 << (i & 31))) != 0;
    }

    public final int e(int i) {
        int i2 = this.b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (-(1 << (i & 31))) & this.f26442a[i3];
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f26442a;
            if (i3 == iArr.length) {
                return this.b;
            }
            i4 = iArr[i3];
        }
        return Math.min(Integer.numberOfTrailingZeros(i4) + (i3 * 32), this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p68)) {
            return false;
        }
        p68 p68Var = (p68) obj;
        return this.b == p68Var.b && Arrays.equals(this.f26442a, p68Var.f26442a);
    }

    public final int f(int i) {
        int i2 = this.b;
        if (i >= i2) {
            return i2;
        }
        int i3 = i / 32;
        int i4 = (-(1 << (i & 31))) & (~this.f26442a[i3]);
        while (i4 == 0) {
            i3++;
            int[] iArr = this.f26442a;
            if (i3 == iArr.length) {
                return this.b;
            }
            i4 = ~iArr[i3];
        }
        return Math.min(Integer.numberOfTrailingZeros(i4) + (i3 * 32), this.b);
    }

    public final int g() {
        return (this.b + 7) / 8;
    }

    public final boolean h(int i, int i2) {
        if (i2 < i || i < 0 || i2 > this.b) {
            e9d0.o();
            return false;
        }
        if (i2 != i) {
            int i3 = i2 - 1;
            int i4 = i / 32;
            int i5 = i3 / 32;
            int i6 = i4;
            while (i6 <= i5) {
                if ((((2 << (i6 >= i5 ? 31 & i3 : 31)) - (1 << (i6 > i4 ? 0 : i & 31))) & this.f26442a[i6]) != 0) {
                    return false;
                }
                i6++;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f26442a) + (this.b * 31);
    }

    public final void i() {
        int[] iArr = new int[this.f26442a.length];
        int i = (this.b - 1) / 32;
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i - i3] = Integer.reverse(this.f26442a[i3]);
        }
        int i4 = this.b;
        int i5 = i2 * 32;
        if (i4 != i5) {
            int i6 = i5 - i4;
            int i7 = iArr[0] >>> i6;
            for (int i8 = 1; i8 < i2; i8++) {
                int i9 = iArr[i8];
                iArr[i8 - 1] = i7 | (i9 << (32 - i6));
                i7 = i9 >>> i6;
            }
            iArr[i] = i7;
        }
        this.f26442a = iArr;
    }

    public final void j(int i) {
        int[] iArr = this.f26442a;
        int i2 = i / 32;
        iArr[i2] = (1 << (i & 31)) | iArr[i2];
    }

    public final String toString() {
        int i = this.b;
        StringBuilder sb = new StringBuilder((i / 8) + i + 1);
        for (int i2 = 0; i2 < this.b; i2++) {
            if ((i2 & 7) == 0) {
                sb.append(' ');
            }
            sb.append(d(i2) ? 'X' : '.');
        }
        return sb.toString();
    }

    public p68() {
        this.b = 0;
        this.f26442a = c;
    }
}
