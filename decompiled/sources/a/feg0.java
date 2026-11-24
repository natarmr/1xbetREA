package a;

import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class feg0 implements vkn0, ukn0 {
    public static final TreeMap h = new TreeMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile String f9405a;
    public final long[] b;
    public final double[] c;
    public final String[] d;
    public final byte[][] e;
    public final int[] f;
    public int g;

    public feg0(int i) {
        int i2 = i + 1;
        this.f = new int[i2];
        this.b = new long[i2];
        this.c = new double[i2];
        this.d = new String[i2];
        this.e = new byte[i2][];
    }

    @Override // a.ukn0
    public final void i(byte[] bArr, int i) {
        bArr.getClass();
        this.f[i] = 5;
        this.e[i] = bArr;
    }

    @Override // a.ukn0
    public final void o(int i, long j) {
        this.f[i] = 2;
        this.b[i] = j;
    }

    @Override // a.ukn0
    public final void p(double d, int i) {
        this.f[i] = 3;
        this.c[i] = d;
    }

    @Override // a.vkn0
    public final String q() {
        String str = this.f9405a;
        if (str != null) {
            return str;
        }
        jf4.n("Required value was null.");
        return null;
    }

    @Override // a.ukn0
    public final void r0(int i, String str) {
        str.getClass();
        this.f[i] = 4;
        this.d[i] = str;
    }

    @Override // a.ukn0
    public final void s(int i) {
        this.f[i] = 1;
    }

    @Override // a.vkn0
    public final void y(ukn0 ukn0Var) {
        int i = this.g;
        if (1 > i) {
            return;
        }
        int i2 = 1;
        while (true) {
            int i3 = this.f[i2];
            if (i3 == 1) {
                ukn0Var.s(i2);
            } else if (i3 == 2) {
                ukn0Var.o(i2, this.b[i2]);
            } else if (i3 == 3) {
                ukn0Var.p(this.c[i2], i2);
            } else if (i3 == 4) {
                String str = this.d[i2];
                if (str == null) {
                    jf4.o("Required value was null.");
                    return;
                }
                ukn0Var.r0(i2, str);
            } else if (i3 == 5) {
                byte[] bArr = this.e[i2];
                if (bArr == null) {
                    jf4.o("Required value was null.");
                    return;
                }
                ukn0Var.i(bArr, i2);
            }
            if (i2 == i) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
