package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class oyc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f26055a;
    public Object b;

    public oyc(uhx0 uhx0Var, int i) {
        if (uhx0Var == null) {
            jf4.o("format options cannot be null");
            throw null;
        }
        if (i < 0) {
            jf4.o(b1j.h(i, "invalid index: ", new StringBuilder(String.valueOf(i).length() + 15)));
            throw null;
        }
        this.f26055a = i;
        this.b = uhx0Var;
    }

    public static int b(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public static long c(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public abstract String A();

    public abstract String B();

    public abstract int C();

    public abstract int D();

    public abstract long E();

    public abstract boolean F(int i);

    public void G() throws box {
        boolean zF;
        do {
            int iC = C();
            if (iC == 0) {
                return;
            }
            int i = this.f26055a;
            if (i >= 100) {
                throw new box("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            }
            this.f26055a = i + 1;
            zF = F(iC);
            this.f26055a--;
        } while (zF);
    }

    public void H(zdx0 zdx0Var, Object obj) {
        zdx0Var.c(Integer.valueOf(obj.hashCode()), rhx0.HEX, (uhx0) this.b);
    }

    public abstract void a(int i);

    public abstract int d();

    public abstract boolean e();

    public xiv0 h(xiv0 xiv0Var, List list) {
        xiv0Var.getClass();
        list.getClass();
        return xiv0Var;
    }

    public abstract void j(int i);

    public abstract int k(int i);

    public abstract boolean m();

    public abstract kg9 n();

    public abstract mg9 o();

    public abstract double p();

    public abstract int q();

    public abstract int r();

    public abstract long s();

    public abstract float t();

    public abstract int u();

    public abstract long v();

    public abstract int w();

    public abstract long x();

    public abstract int y();

    public abstract long z();

    public void f(div0 div0Var) {
    }

    public void g(div0 div0Var) {
    }

    public /* synthetic */ oyc() {
    }

    public oyc(int i) {
        this.f26055a = i;
    }

    public hcp0 i(div0 div0Var, hcp0 hcp0Var) {
        return hcp0Var;
    }
}
