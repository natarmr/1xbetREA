package a;

/* JADX INFO: loaded from: classes.dex */
public final class z960 {
    public static int g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44002a;
    public int b;
    public Object[] c;
    public int d;
    public y960 e;
    public float f;

    public static synchronized z960 a(int i, y960 y960Var) {
        z960 z960Var;
        z960Var = new z960();
        if (i <= 0) {
            throw new IllegalArgumentException("Object Pool must be instantiated with a capacity greater than 0!");
        }
        z960Var.b = i;
        z960Var.c = new Object[i];
        z960Var.d = 0;
        z960Var.e = y960Var;
        z960Var.f = 1.0f;
        z960Var.d();
        int i2 = g;
        z960Var.f44002a = i2;
        g = i2 + 1;
        return z960Var;
    }

    public final synchronized y960 b() {
        y960 y960Var;
        try {
            if (this.d == -1 && this.f > 0.0f) {
                d();
            }
            Object[] objArr = this.c;
            int i = this.d;
            y960Var = (y960) objArr[i];
            y960Var.f42230a = -1;
            this.d = i - 1;
        } catch (Throwable th) {
            throw th;
        }
        return y960Var;
    }

    public final synchronized void c(y960 y960Var) {
        try {
            int i = y960Var.f42230a;
            if (i != -1) {
                if (i == this.f44002a) {
                    throw new IllegalArgumentException("The object passed is already stored in this pool!");
                }
                throw new IllegalArgumentException("The object to recycle already belongs to poolId " + y960Var.f42230a + ".  Object cannot belong to two different pool instances simultaneously!");
            }
            int i2 = this.d + 1;
            this.d = i2;
            Object[] objArr = this.c;
            if (i2 >= objArr.length) {
                int i3 = this.b;
                int i4 = i3 * 2;
                this.b = i4;
                objArr = new Object[i4];
                for (int i5 = 0; i5 < i3; i5++) {
                    objArr[i5] = this.c[i5];
                }
                this.c = objArr;
            }
            y960Var.f42230a = this.f44002a;
            objArr[this.d] = y960Var;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void d() {
        float f = this.f;
        int i = this.b;
        int i2 = (int) (i * f);
        if (i2 < 1) {
            i = 1;
        } else if (i2 <= i) {
            i = i2;
        }
        for (int i3 = 0; i3 < i; i3++) {
            this.c[i3] = this.e.a();
        }
        this.d = i - 1;
    }
}
