package a;

import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes2.dex */
public class l1e0 extends k1e0 {
    public static double b(double d, double d2, double d3) {
        if (d2 <= d3) {
            if (d < d2) {
                return d2;
            }
            return d > d3 ? d3 : d;
        }
        StringBuilder sbP = brm0.p(d3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        sbP.append(d2);
        sbP.append('.');
        throw new IllegalArgumentException(sbP.toString());
    }

    public static float c(float f, float f2, float f3) {
        if (f2 <= f3) {
            if (f < f2) {
                return f2;
            }
            return f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int d(int i, int i2, int i3) {
        if (i2 <= i3) {
            if (i < i2) {
                return i2;
            }
            return i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int e(int i, IntRange intRange) {
        intRange.getClass();
        int i2 = intRange.b;
        int i3 = intRange.f46068a;
        if (intRange instanceof dvc) {
            return ((Number) g(Integer.valueOf(i), (cvc) ((dvc) intRange))).intValue();
        }
        if (intRange.isEmpty()) {
            e9d0.f(46, "Cannot coerce value to an empty range: ", intRange);
            return 0;
        }
        if (i < Integer.valueOf(i3).intValue()) {
            return Integer.valueOf(i3).intValue();
        }
        return i > Integer.valueOf(i2).intValue() ? Integer.valueOf(i2).intValue() : i;
    }

    public static long f(long j, long j2, long j3) {
        if (j2 <= j3) {
            if (j < j2) {
                return j2;
            }
            return j > j3 ? j3 : j;
        }
        StringBuilder sbQ = kng0.q(j3, "Cannot coerce value to an empty range: maximum ", " is less than minimum ");
        sbQ.append(j2);
        sbQ.append('.');
        throw new IllegalArgumentException(sbQ.toString());
    }

    public static Comparable g(Comparable comparable, cvc cvcVar) {
        boolean zA = cvcVar.a();
        float f = cvcVar.b;
        float f2 = cvcVar.f5023a;
        if (zA) {
            e9d0.f(46, "Cannot coerce value to an empty range: ", cvcVar);
            return null;
        }
        if (!cvcVar.b(comparable, Float.valueOf(f2)) || cvcVar.b(Float.valueOf(f2), comparable)) {
            return (!cvcVar.b(Float.valueOf(f), comparable) || cvcVar.b(comparable, Float.valueOf(f))) ? comparable : Float.valueOf(f);
        }
        return Float.valueOf(f2);
    }

    public static Comparable h(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        comparable.getClass();
        if (comparable2 == null || comparable3 == null) {
            if (comparable2 != null && comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable3 != null && comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        } else {
            if (comparable2.compareTo(comparable3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + comparable3 + " is less than minimum " + comparable2 + '.');
            }
            if (comparable.compareTo(comparable2) < 0) {
                return comparable2;
            }
            if (comparable.compareTo(comparable3) > 0) {
                return comparable3;
            }
        }
        return comparable;
    }

    public static kotlin.ranges.a i(int i, int i2) {
        kotlin.ranges.a.d.getClass();
        return new kotlin.ranges.a(i, i2, -1);
    }

    public static int j(IntRange intRange, e1e0 e1e0Var) {
        e1e0Var.getClass();
        try {
            return k7x.T(e1e0Var, intRange);
        } catch (IllegalArgumentException e) {
            v4i0.o(e.getMessage());
            return 0;
        }
    }

    public static kotlin.ranges.a k(IntRange intRange) {
        jkx jkxVar = kotlin.ranges.a.d;
        int i = intRange.b;
        int i2 = intRange.f46068a;
        int i3 = -intRange.c;
        jkxVar.getClass();
        return new kotlin.ranges.a(i, i2, i3);
    }

    public static o710 l(r710 r710Var, long j) {
        r710Var.getClass();
        k1e0.a(j > 0, Long.valueOf(j));
        n710 n710Var = o710.d;
        long j2 = r710Var.f24763a;
        long j3 = r710Var.b;
        if (r710Var.c <= 0) {
            j = -j;
        }
        long j4 = j;
        n710Var.getClass();
        return new o710(j2, j3, j4);
    }

    public static kotlin.ranges.a m(int i, IntRange intRange) {
        intRange.getClass();
        k1e0.a(i > 0, Integer.valueOf(i));
        jkx jkxVar = kotlin.ranges.a.d;
        int i2 = intRange.f46068a;
        int i3 = intRange.b;
        if (intRange.c <= 0) {
            i = -i;
        }
        jkxVar.getClass();
        return new kotlin.ranges.a(i2, i3, i);
    }

    public static r710 n(long j) {
        if (j > Long.MIN_VALUE) {
            return new r710(0L, j - 1);
        }
        r710.e.getClass();
        return r710.f;
    }

    public static IntRange o(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new IntRange(i, i2 - 1, 1);
        }
        IntRange.e.getClass();
        return IntRange.f;
    }
}
