package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class qw3 implements pw3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f29416a;
    public final boolean b;
    public final rw3 c;
    public final float d;

    public qw3(float f, boolean z, rw3 rw3Var) {
        this.f29416a = f;
        this.b = z;
        this.c = rw3Var;
        this.d = f;
    }

    @Override // a.ow3, a.sw3
    public final float a() {
        return this.d;
    }

    @Override // a.ow3
    public final void b(w6k w6kVar, int i, int[] iArr, k6z k6zVar, int[] iArr2) {
        int i2;
        if (iArr.length == 0) {
            return;
        }
        int iT = w6kVar.T(this.f29416a);
        boolean z = this.b && k6zVar == k6z.b;
        if (z) {
            int length = iArr.length;
            int i3 = 0;
            int iMin = 0;
            int i4 = 0;
            while (i3 < length) {
                int iMax = Math.max(0, i - iArr[i3]);
                iArr2[i4] = iMax;
                iMin = Math.min(iT, iMax);
                i = iArr2[i4] - iMin;
                i3++;
                i4++;
            }
            i2 = i + iMin;
        } else {
            int length2 = iArr.length;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i5 < length2) {
                int i9 = iArr[i5];
                int iMin2 = Math.min(i6, i - i9);
                iArr2[i8] = iMin2;
                int iMin3 = Math.min(iT, (i - iMin2) - i9);
                int i10 = iArr2[i8] + i9 + iMin3;
                i5++;
                i7 = iMin3;
                i6 = i10;
                i8++;
            }
            i2 = i - (i6 - i7);
        }
        rw3 rw3Var = this.c;
        if (rw3Var == null || i2 <= 0) {
            return;
        }
        int iG = rw3Var.g(i2, k6zVar);
        if (z) {
            iG -= i2;
        }
        if (iG != 0) {
            int length3 = iArr2.length;
            for (int i11 = 0; i11 < length3; i11++) {
                iArr2[i11] = iArr2[i11] + iG;
            }
        }
    }

    @Override // a.sw3
    public final void c(w6k w6kVar, int i, int[] iArr, int[] iArr2) {
        b(w6kVar, i, iArr, k6z.f17794a, iArr2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw3)) {
            return false;
        }
        qw3 qw3Var = (qw3) obj;
        return ycl.b(this.f29416a, qw3Var.f29416a) && this.b == qw3Var.b && Intrinsics.d(this.c, qw3Var.c);
    }

    public final int hashCode() {
        int iE = brm0.e(Float.hashCode(this.f29416a) * 31, 31, this.b);
        rw3 rw3Var = this.c;
        return iE + (rw3Var == null ? 0 : rw3Var.hashCode());
    }

    public final String toString() {
        return (this.b ? "" : "Absolute") + "Arrangement#spacedAligned(" + ycl.c(this.f29416a) + ", " + this.c + Separators.RPAREN;
    }
}
