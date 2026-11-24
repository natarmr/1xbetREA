package a;

import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class tdw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f33791a;
    public int b;
    public Object c;

    public static tdw0 h(InputStream inputStream, int i) {
        if (i <= 0) {
            jf4.o("bufferSize must be > 0");
            return null;
        }
        if (inputStream != null) {
            return new sdw0(inputStream, i);
        }
        rdw0 rdw0Var = new rdw0(vew0.f37305a);
        try {
            rdw0Var.a(0);
            return rdw0Var;
        } catch (zew0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int j(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long k(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public static long n(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static wjw0 o(byte[] bArr, int i, int i2) {
        wjw0 wjw0Var = new wjw0(bArr, i, i2);
        try {
            wjw0Var.q(i2);
            return wjw0Var;
        } catch (qkw0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public abstract int A();

    public abstract long B();

    public abstract int C();

    public abstract long D();

    public abstract int E();

    public abstract int F();

    public abstract long G();

    public abstract int H();

    public abstract long I();

    public abstract boolean J();

    public abstract long K();

    public abstract String L();

    public abstract String M();

    public abstract long N();

    public abstract pdw0 O();

    public abstract long P();

    public abstract byte[] Q();

    public abstract int R();

    public abstract long S();

    public abstract int T();

    public abstract vjw0 U();

    public abstract int V();

    public abstract String W();

    public abstract long X();

    public abstract String Y();

    public abstract int Z();

    public abstract int a(int i);

    public abstract long a0();

    public abstract void b(int i);

    public abstract boolean b0();

    public abstract int c();

    public abstract int c0();

    public abstract boolean d();

    public abstract boolean d0();

    public abstract int e();

    public abstract long e0();

    public abstract int f(byte[] bArr, int i, int i2);

    public abstract void g(int i);

    public void i() throws zew0 {
        boolean zU;
        do {
            int iM = m();
            if (iM == 0) {
                return;
            }
            int i = this.f33791a;
            int i2 = this.b;
            if (i + i2 >= 100) {
                itt0.x("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                return;
            } else {
                this.b = i2 + 1;
                zU = u(iM);
                this.b--;
            }
        } while (zU);
    }

    public abstract double l();

    public abstract int m();

    public abstract float p();

    public abstract int q(int i);

    public abstract void r(int i);

    public abstract int s();

    public abstract void t(int i);

    public abstract boolean u(int i);

    public abstract double v();

    public abstract int w();

    public abstract void x(int i);

    public abstract float y();

    public abstract int z();
}
