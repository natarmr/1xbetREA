package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ukk0 implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35831a;
    public float e;
    public int l;
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public boolean f = false;
    public final float[] g = new float[9];
    public final float[] h = new float[9];
    public kx3[] i = new kx3[16];
    public int j = 0;
    public int k = 0;

    public ukk0(int i) {
        this.l = i;
    }

    public final void a(kx3 kx3Var) {
        int i = 0;
        while (true) {
            int i2 = this.j;
            kx3[] kx3VarArr = this.i;
            if (i >= i2) {
                if (i2 >= kx3VarArr.length) {
                    kx3VarArr = (kx3[]) Arrays.copyOf(kx3VarArr, kx3VarArr.length * 2);
                    this.i = kx3VarArr;
                }
                int i3 = this.j;
                kx3VarArr[i3] = kx3Var;
                this.j = i3 + 1;
                return;
            }
            if (kx3VarArr[i] == kx3Var) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(kx3 kx3Var) {
        int i = this.j;
        int i2 = 0;
        while (i2 < i) {
            if (this.i[i2] == kx3Var) {
                while (i2 < i - 1) {
                    kx3[] kx3VarArr = this.i;
                    int i3 = i2 + 1;
                    kx3VarArr[i2] = kx3VarArr[i3];
                    i2 = i3;
                }
                this.j--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.l = 5;
        this.d = 0;
        this.b = -1;
        this.c = -1;
        this.e = 0.0f;
        this.f = false;
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2] = null;
        }
        this.j = 0;
        this.k = 0;
        this.f35831a = false;
        Arrays.fill(this.h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b - ((ukk0) obj).b;
    }

    public final void d(p900 p900Var, float f) {
        this.e = f;
        this.f = true;
        int i = this.j;
        this.c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].h(p900Var, this, false);
        }
        this.j = 0;
    }

    public final void e(p900 p900Var, kx3 kx3Var) {
        int i = this.j;
        for (int i2 = 0; i2 < i; i2++) {
            this.i[i2].i(p900Var, kx3Var, false);
        }
        this.j = 0;
    }

    public final String toString() {
        return "" + this.b;
    }
}
