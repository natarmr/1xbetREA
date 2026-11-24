package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes6.dex */
public final class i0t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int[] f13964a = new int[10];
    public int[] b = new int[10];
    public int c = 0;
    public int[] d = new int[10];
    public float[] e = new float[10];
    public int f = 0;
    public int[] g = new int[5];
    public String[] h = new String[5];
    public int i = 0;
    public int[] j = new int[4];
    public boolean[] k = new boolean[4];
    public int l = 0;

    public final void a(float f, int i) {
        int i2 = this.f;
        int[] iArr = this.d;
        if (i2 >= iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.e;
            this.e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.f;
        iArr2[i3] = i;
        float[] fArr2 = this.e;
        this.f = i3 + 1;
        fArr2[i3] = f;
    }

    public final void b(int i, int i2) {
        int i3 = this.c;
        int[] iArr = this.f13964a;
        if (i3 >= iArr.length) {
            this.f13964a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.b;
            this.b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f13964a;
        int i4 = this.c;
        iArr3[i4] = i;
        int[] iArr4 = this.b;
        this.c = i4 + 1;
        iArr4[i4] = i2;
    }

    public final void c(int i, String str) {
        int i2 = this.i;
        int[] iArr = this.g;
        if (i2 >= iArr.length) {
            this.g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.h;
            this.h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.g;
        int i3 = this.i;
        iArr2[i3] = i;
        String[] strArr2 = this.h;
        this.i = i3 + 1;
        strArr2[i3] = str;
    }

    public final void d(l0t0 l0t0Var) {
        for (int i = 0; i < this.c; i++) {
            l0t0Var.c(this.f13964a[i], this.b[i]);
        }
        for (int i2 = 0; i2 < this.f; i2++) {
            l0t0Var.d(this.e[i2], this.d[i2]);
        }
        for (int i3 = 0; i3 < this.i; i3++) {
            l0t0Var.e(this.g[i3], this.h[i3]);
        }
        for (int i4 = 0; i4 < this.l; i4++) {
            int i5 = this.j[i4];
            boolean z = this.k[i4];
            l0t0Var.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TypedBundle{mCountInt=");
        sb.append(this.c);
        sb.append(", mCountFloat=");
        sb.append(this.f);
        sb.append(", mCountString=");
        sb.append(this.i);
        sb.append(", mCountBoolean=");
        return brm0.n(sb, this.l, '}');
    }
}
