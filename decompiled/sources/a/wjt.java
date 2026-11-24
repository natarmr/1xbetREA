package a;

/* JADX INFO: loaded from: classes2.dex */
public final class wjt {
    public static final wjt h = new wjt(4201, 4096, 1);
    public static final wjt i = new wjt(1033, 1024, 1);
    public static final wjt j;
    public static final wjt k;
    public static final wjt l;
    public static final wjt m;
    public static final wjt n;
    public static final wjt o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f39280a;
    public final int[] b;
    public final xjt c;
    public final xjt d;
    public final short e;
    public final short f;
    public final boolean g;

    static {
        wjt wjtVar = new wjt(67, 64, 1);
        j = wjtVar;
        k = new wjt(19, 16, 1);
        l = new wjt(285, 256, 0);
        wjt wjtVar2 = new wjt(301, 256, 1);
        m = wjtVar2;
        n = wjtVar2;
        o = wjtVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public wjt(int i2, int i3, int i4) {
        this.f = i2;
        this.e = i3;
        this.g = i4;
        this.f39280a = new int[i3];
        this.b = new int[i3];
        int i5 = 1;
        for (int i6 = 0; i6 < i3; i6++) {
            this.f39280a[i6] = i5;
            i5 *= 2;
            if (i5 >= i3) {
                i5 = (i5 ^ i2 ? 1 : 0) & (i3 - 1);
            }
        }
        for (int i7 = 0; i7 < i3 - 1; i7++) {
            this.b[this.f39280a[i7]] = i7;
        }
        this.c = new xjt(this, new int[]{0});
        this.d = new xjt(this, new int[]{1});
    }

    public final xjt a(int i2, int i3) {
        if (i2 < 0) {
            e9d0.o();
            return null;
        }
        if (i3 == 0) {
            return this.c;
        }
        int[] iArr = new int[i2 + 1];
        iArr[0] = i3;
        return new xjt(this, iArr);
    }

    public final int b(int i2) {
        if (i2 == 0) {
            throw new ArithmeticException();
        }
        return this.f39280a[(this.e - this.b[i2]) - 1];
    }

    public final int c(int i2, int i3) {
        if (i2 == 0 || i3 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        return this.f39280a[(iArr[i2] + iArr[i3]) % (this.e - 1)];
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GF(0x");
        sb.append(Integer.toHexString(this.f));
        sb.append(',');
        return brm0.n(sb, this.e, ')');
    }
}
