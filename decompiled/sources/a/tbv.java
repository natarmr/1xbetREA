package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class tbv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f33687a;
    public final int[] b;

    public tbv(float[] fArr, int[] iArr) {
        this.f33687a = fArr;
        this.b = iArr;
    }

    public final void a(tbv tbvVar) {
        int i = 0;
        while (true) {
            int[] iArr = tbvVar.b;
            if (i >= iArr.length) {
                return;
            }
            this.f33687a[i] = tbvVar.f33687a[i];
            this.b[i] = iArr[i];
            i++;
        }
    }

    public final tbv b(float[] fArr) {
        int iS;
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            float f = fArr[i];
            float[] fArr2 = this.f33687a;
            int iBinarySearch = Arrays.binarySearch(fArr2, f);
            int[] iArr2 = this.b;
            if (iBinarySearch >= 0) {
                iS = iArr2[iBinarySearch];
            } else {
                int i2 = -(iBinarySearch + 1);
                if (i2 == 0) {
                    iS = iArr2[0];
                } else if (i2 == iArr2.length - 1) {
                    iS = iArr2[iArr2.length - 1];
                } else {
                    int i3 = i2 - 1;
                    float f2 = fArr2[i3];
                    iS = mbc.S(iArr2[i3], (f - f2) / (fArr2[i2] - f2), iArr2[i2]);
                }
            }
            iArr[i] = iS;
        }
        return new tbv(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tbv.class != obj.getClass()) {
            return false;
        }
        tbv tbvVar = (tbv) obj;
        return Arrays.equals(this.f33687a, tbvVar.f33687a) && Arrays.equals(this.b, tbvVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (Arrays.hashCode(this.f33687a) * 31);
    }
}
