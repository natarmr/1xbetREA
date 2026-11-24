package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class d22 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r68 f5336a;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final float g;
    public final e3g0 i;
    public final ArrayList b = new ArrayList(5);
    public final int[] h = new int[3];

    public d22(r68 r68Var, int i, int i2, int i3, int i4, float f, e3g0 e3g0Var) {
        this.f5336a = r68Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = f;
        this.i = e3g0Var;
    }

    public final boolean a(int[] iArr) {
        float f = this.g;
        float f2 = f / 2.0f;
        for (int i = 0; i < 3; i++) {
            if (Math.abs(f - iArr[i]) >= f2) {
                return false;
            }
        }
        return true;
    }

    public final c22 b(int i, int i2, int[] iArr) {
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = i3 + i4 + i5;
        float f = (i2 - i5) - (i4 / 2.0f);
        int i7 = (int) f;
        int i8 = i4 * 2;
        r68 r68Var = this.f5336a;
        int i9 = r68Var.b;
        int[] iArr2 = this.h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        int i10 = i;
        while (i10 >= 0 && r68Var.b(i7, i10)) {
            int i11 = iArr2[1];
            if (i11 > i8) {
                break;
            }
            iArr2[1] = i11 + 1;
            i10--;
        }
        float f2 = Float.NaN;
        if (i10 >= 0 && iArr2[1] <= i8) {
            while (i10 >= 0 && !r68Var.b(i7, i10)) {
                int i12 = iArr2[0];
                if (i12 > i8) {
                    break;
                }
                iArr2[0] = i12 + 1;
                i10--;
            }
            if (iArr2[0] <= i8) {
                int i13 = i + 1;
                while (i13 < i9 && r68Var.b(i7, i13)) {
                    int i14 = iArr2[1];
                    if (i14 > i8) {
                        break;
                    }
                    iArr2[1] = i14 + 1;
                    i13++;
                }
                if (i13 != i9 && iArr2[1] <= i8) {
                    while (i13 < i9 && !r68Var.b(i7, i13)) {
                        int i15 = iArr2[2];
                        if (i15 > i8) {
                            break;
                        }
                        iArr2[2] = i15 + 1;
                        i13++;
                    }
                    int i16 = iArr2[2];
                    if (i16 <= i8 && Math.abs(((iArr2[0] + iArr2[1]) + i16) - i6) * 5 < i6 * 2 && a(iArr2)) {
                        f2 = (i13 - iArr2[2]) - (iArr2[1] / 2.0f);
                    }
                }
            }
        }
        if (Float.isNaN(f2)) {
            return null;
        }
        float f3 = ((iArr[0] + iArr[1]) + iArr[2]) / 3.0f;
        ArrayList<c22> arrayList = this.b;
        for (c22 c22Var : arrayList) {
            float f4 = c22Var.c;
            float f5 = c22Var.f5402a;
            float f6 = c22Var.b;
            if (Math.abs(f2 - f6) <= f3 && Math.abs(f - f5) <= f3) {
                float fAbs = Math.abs(f3 - f4);
                if (fAbs <= 1.0f || fAbs <= f4) {
                    return new c22((f5 + f) / 2.0f, (f6 + f2) / 2.0f, (c22Var.c + f3) / 2.0f);
                }
            }
        }
        c22 c22Var2 = new c22(f, f2, f3);
        arrayList.add(c22Var2);
        e3g0 e3g0Var = this.i;
        if (e3g0Var == null) {
            return null;
        }
        e3g0Var.a(c22Var2);
        return null;
    }
}
