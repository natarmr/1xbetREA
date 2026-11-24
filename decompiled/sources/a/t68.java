package a;

/* JADX INFO: loaded from: classes2.dex */
public final class t68 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f33403a;
    public int b;
    public int c;

    public t68(byte[] bArr, int i, int i2) {
        this.f33403a = bArr;
        this.b = i;
        this.c = i2;
    }

    public int a() {
        return ((this.f33403a.length - this.b) * 8) - this.c;
    }

    public int b(int i) {
        int i2 = 0;
        if (i < 1 || i > 32 || i > a()) {
            jf4.o(String.valueOf(i));
            return 0;
        }
        int i3 = this.c;
        byte[] bArr = this.f33403a;
        if (i3 > 0) {
            int i4 = 8 - i3;
            int iMin = Math.min(i, i4);
            int i5 = i4 - iMin;
            int i6 = this.b;
            int i7 = (((255 >> (8 - iMin)) << i5) & bArr[i6]) >> i5;
            i -= iMin;
            int i8 = this.c + iMin;
            this.c = i8;
            if (i8 == 8) {
                this.c = 0;
                this.b = i6 + 1;
            }
            i2 = i7;
        }
        if (i <= 0) {
            return i2;
        }
        while (i >= 8) {
            int i9 = this.b;
            i2 = (i2 << 8) | (bArr[i9] & 255);
            this.b = i9 + 1;
            i -= 8;
        }
        if (i <= 0) {
            return i2;
        }
        int i10 = 8 - i;
        int i11 = (i2 << i) | ((((255 >> i10) << i10) & bArr[this.b]) >> i10);
        this.c += i;
        return i11;
    }

    public t68(byte[] bArr) {
        this.f33403a = bArr;
    }
}
