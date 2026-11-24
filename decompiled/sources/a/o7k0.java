package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class o7k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n0q f24791a;
    public static final n0q b;
    public static final n0q c;
    public static final vqv0 d;
    public static final vqv0 e;
    public static final vqv0 f;
    public static final vqv0 g;
    public static final vqv0 h;
    public static final vqv0 i;

    static {
        dnk dnkVar = dnk.b;
        f24791a = new n0q(dnkVar, 1.0f);
        dnk dnkVar2 = dnk.f6373a;
        b = new n0q(dnkVar2, 1.0f);
        dnk dnkVar3 = dnk.c;
        c = new n0q(dnkVar3, 1.0f);
        xx7 xx7Var = gqw0.n;
        byte b2 = 29;
        byte b3 = 0;
        d = new vqv0(dnkVar, false, new ggt0(xx7Var, b2), xx7Var);
        xx7 xx7Var2 = gqw0.m;
        e = new vqv0(dnkVar, false, new ggt0(xx7Var2, b2), xx7Var2);
        yx7 yx7Var = gqw0.k;
        f = new vqv0(dnkVar2, false, new uqv0(yx7Var, b3), yx7Var);
        yx7 yx7Var2 = gqw0.j;
        g = new vqv0(dnkVar2, false, new uqv0(yx7Var2, b3), yx7Var2);
        zx7 zx7Var = gqw0.e;
        byte b4 = 1;
        h = new vqv0(dnkVar3, false, new uqv0(zx7Var, b4), zx7Var);
        zx7 zx7Var2 = gqw0.f11754a;
        i = new vqv0(dnkVar3, false, new uqv0(zx7Var2, b4), zx7Var2);
    }

    public static mm40 A(mm40 mm40Var, xx7 xx7Var, int i2) {
        if ((i2 & 1) != 0) {
            xx7Var = gqw0.n;
        }
        return z(mm40Var, xx7Var, false);
    }

    public static final mm40 a(mm40 mm40Var, float f2, float f3) {
        return mm40Var.e(new oft0(f2, f3));
    }

    public static mm40 b(mm40 mm40Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return a(mm40Var, f2, f3);
    }

    public static final mm40 c(mm40 mm40Var, float f2) {
        return mm40Var.e(f2 == 1.0f ? b : new n0q(dnk.f6373a, f2));
    }

    public static final mm40 d(mm40 mm40Var, float f2) {
        return mm40Var.e(f2 == 1.0f ? f24791a : new n0q(dnk.b, f2));
    }

    public static final mm40 e(mm40 mm40Var, float f2) {
        return mm40Var.e(new m7k0(0.0f, f2, 0.0f, f2, true, 5));
    }

    public static final mm40 f(mm40 mm40Var, float f2, float f3) {
        return mm40Var.e(new m7k0(0.0f, f2, 0.0f, f3, true, 5));
    }

    public static mm40 g(mm40 mm40Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return f(mm40Var, f2, f3);
    }

    public static final mm40 h(mm40 mm40Var, float f2) {
        return mm40Var.e(new m7k0(0.0f, f2, 0.0f, f2, false, 5));
    }

    public static final mm40 i(mm40 mm40Var, float f2) {
        return mm40Var.e(new m7k0(f2, f2, f2, f2, false));
    }

    public static final mm40 j(mm40 mm40Var, float f2, float f3) {
        return mm40Var.e(new m7k0(f2, f3, f2, f3, false));
    }

    public static mm40 k(mm40 mm40Var, float f2, float f3, float f4, float f5, int i2) {
        return mm40Var.e(new m7k0(f2, (i2 & 2) != 0 ? Float.NaN : f3, (i2 & 4) != 0 ? Float.NaN : f4, (i2 & 8) != 0 ? Float.NaN : f5, false));
    }

    public static final mm40 l(mm40 mm40Var, float f2) {
        return mm40Var.e(new m7k0(f2, 0.0f, f2, 0.0f, false, 10));
    }

    public static mm40 m(mm40 mm40Var, int i2) {
        return mm40Var.e(new m7k0((i2 & 1) != 0 ? Float.NaN : 50.0f, 0.0f, (i2 & 2) == 0 ? 80.0f : Float.NaN, 0.0f, false, 10));
    }

    public static final mm40 n(mm40 mm40Var, float f2) {
        return mm40Var.e(new m7k0(f2, f2, f2, f2, true));
    }

    public static final mm40 o(long j, mm40 mm40Var) {
        return p(mm40Var, bdl.b(j), bdl.a(j));
    }

    public static final mm40 p(mm40 mm40Var, float f2, float f3) {
        return mm40Var.e(new m7k0(f2, f3, f2, f3, true));
    }

    public static final mm40 q(mm40 mm40Var, float f2, float f3, float f4, float f5) {
        return mm40Var.e(new m7k0(f2, f3, f4, f5, true));
    }

    public static mm40 r(mm40 mm40Var, float f2, float f3, float f4, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        if ((i2 & 4) != 0) {
            f4 = Float.NaN;
        }
        return q(mm40Var, f2, f3, f4, (i2 & 8) == 0 ? 16.0f : Float.NaN);
    }

    public static final mm40 s(mm40 mm40Var, float f2) {
        return mm40Var.e(new m7k0(f2, 0.0f, f2, 0.0f, true, 10));
    }

    public static final mm40 t(mm40 mm40Var, float f2, float f3) {
        return mm40Var.e(new m7k0(f2, 0.0f, f3, 0.0f, true, 10));
    }

    public static mm40 u(mm40 mm40Var, float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = Float.NaN;
        }
        if ((i2 & 2) != 0) {
            f3 = Float.NaN;
        }
        return t(mm40Var, f2, f3);
    }

    public static final mm40 v(mm40 mm40Var, yx7 yx7Var, boolean z) {
        vqv0 vqv0Var;
        if (!Intrinsics.d(yx7Var, gqw0.k) || z) {
            vqv0Var = (!Intrinsics.d(yx7Var, gqw0.j) || z) ? new vqv0(dnk.f6373a, z, new uqv0((Object) yx7Var, (byte) 0), yx7Var) : g;
        } else {
            vqv0Var = f;
        }
        return mm40Var.e(vqv0Var);
    }

    public static mm40 w(mm40 mm40Var, yx7 yx7Var, boolean z, int i2) {
        if ((i2 & 1) != 0) {
            yx7Var = gqw0.k;
        }
        if ((i2 & 2) != 0) {
            z = false;
        }
        return v(mm40Var, yx7Var, z);
    }

    public static final mm40 x(mm40 mm40Var, u12 u12Var, boolean z) {
        vqv0 vqv0Var;
        if (!Intrinsics.d(u12Var, gqw0.e) || z) {
            vqv0Var = (!Intrinsics.d(u12Var, gqw0.f11754a) || z) ? new vqv0(dnk.c, z, new uqv0((Object) u12Var, (byte) 1), u12Var) : i;
        } else {
            vqv0Var = h;
        }
        return mm40Var.e(vqv0Var);
    }

    public static mm40 y(mm40 mm40Var, zx7 zx7Var, int i2) {
        if ((i2 & 1) != 0) {
            zx7Var = gqw0.e;
        }
        return x(mm40Var, zx7Var, false);
    }

    public static final mm40 z(mm40 mm40Var, xx7 xx7Var, boolean z) {
        vqv0 vqv0Var;
        if (!Intrinsics.d(xx7Var, gqw0.n) || z) {
            vqv0Var = (!Intrinsics.d(xx7Var, gqw0.m) || z) ? new vqv0(dnk.b, z, new ggt0(xx7Var, (byte) 29), xx7Var) : e;
        } else {
            vqv0Var = d;
        }
        return mm40Var.e(vqv0Var);
    }
}
