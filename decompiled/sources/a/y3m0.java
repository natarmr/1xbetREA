package a;

/* JADX INFO: loaded from: classes5.dex */
public final class y3m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41959a;

    public y3m0(int i) {
        this.f41959a = i;
        if (i > 0) {
            return;
        }
        adx.a("grid with no rows/columns");
    }

    public final int[] a(int i, int i2) {
        int i3;
        int i4 = this.f41959a;
        int i5 = i - ((i4 - 1) * i2);
        int i6 = i5 / i4;
        int i7 = i5 % i4;
        int[] iArr = new int[i4];
        int i8 = 0;
        while (i8 < i4) {
            if (i6 < 0) {
                i3 = 0;
            } else {
                i3 = (i8 < i7 ? 1 : 0) + i6;
            }
            iArr[i8] = i3;
            i8++;
        }
        return iArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y3m0) {
            return this.f41959a == ((y3m0) obj).f41959a;
        }
        return false;
    }

    public final int hashCode() {
        return -this.f41959a;
    }
}
