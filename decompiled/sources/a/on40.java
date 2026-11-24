package a;

/* JADX INFO: loaded from: classes2.dex */
public final class on40 {
    public static final on40 e = new on40();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f25530a = new int[929];
    public final int[] b = new int[929];
    public final j910 c;
    public final j910 d;

    public on40() {
        int i = 1;
        for (int i2 = 0; i2 < 929; i2++) {
            this.f25530a[i2] = i;
            i = (i * 3) % 929;
        }
        for (int i3 = 0; i3 < 928; i3++) {
            this.b[this.f25530a[i3]] = i3;
        }
        this.c = new j910(this, new int[]{0});
        this.d = new j910(this, new int[]{1});
    }

    public final int a(int i, int i2) {
        return (i + i2) % 929;
    }

    public final int b(int i) {
        if (i == 0) {
            throw new ArithmeticException();
        }
        return this.f25530a[928 - this.b[i]];
    }

    public final int c(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.b;
        return this.f25530a[(iArr[i] + iArr[i2]) % 928];
    }
}
