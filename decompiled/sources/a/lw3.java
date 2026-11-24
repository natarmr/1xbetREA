package a;

/* JADX INFO: loaded from: classes6.dex */
public final class lw3 implements ow3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20743a;

    public /* synthetic */ lw3(byte b) {
        this.f20743a = b;
    }

    @Override // a.ow3
    public final void b(w6k w6kVar, int i, int[] iArr, k6z k6zVar, int[] iArr2) {
        int i2 = 0;
        switch (this.f20743a) {
            case 0:
                int length = iArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i2 < length) {
                    int i5 = iArr[i2];
                    iArr2[i3] = i4;
                    i4 += i5;
                    i2++;
                    i3++;
                }
                break;
            case 1:
                int i6 = 0;
                for (int i7 : iArr) {
                    i6 += i7;
                }
                int i8 = i - i6;
                int length2 = iArr.length;
                int i9 = 0;
                while (i2 < length2) {
                    int i10 = iArr[i2];
                    iArr2[i9] = i8;
                    i8 += i10;
                    i2++;
                    i9++;
                }
                break;
            case 2:
                uc9.a0(i, iArr, iArr2, false);
                break;
            case 3:
                if (k6zVar == k6z.f17794a) {
                    int i11 = 0;
                    for (int i12 : iArr) {
                        i11 += i12;
                    }
                    int i13 = i - i11;
                    int length3 = iArr.length;
                    int i14 = 0;
                    while (i2 < length3) {
                        int i15 = iArr[i2];
                        iArr2[i14] = i13;
                        i13 += i15;
                        i2++;
                        i14++;
                    }
                } else {
                    for (int length4 = iArr.length - 1; -1 < length4; length4--) {
                        int i16 = iArr[length4];
                        iArr2[length4] = i2;
                        i2 += i16;
                    }
                }
                break;
            default:
                if (k6zVar == k6z.f17794a) {
                    int length5 = iArr.length;
                    int i17 = 0;
                    int i18 = 0;
                    while (i2 < length5) {
                        int i19 = iArr[i2];
                        iArr2[i17] = i18;
                        i18 += i19;
                        i2++;
                        i17++;
                    }
                } else {
                    int length6 = iArr.length;
                    int i20 = 0;
                    while (i2 < length6) {
                        i20 += iArr[i2];
                        i2++;
                    }
                    int i21 = i - i20;
                    for (int length7 = iArr.length - 1; -1 < length7; length7--) {
                        int i22 = iArr[length7];
                        iArr2[length7] = i21;
                        i21 += i22;
                    }
                }
                break;
        }
    }

    public final String toString() {
        switch (this.f20743a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "AbsoluteArrangement#SpaceAround";
            case 3:
                return "Arrangement#End";
            default:
                return "Arrangement#Start";
        }
    }
}
