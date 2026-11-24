package a;

import java.math.RoundingMode;

/* JADX INFO: loaded from: classes.dex */
public abstract class sbl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f31941a = 0;

    static {
        Math.log(2.0d);
    }

    public static boolean a(double d) {
        if (kbc.Z(d)) {
            return d == 0.0d || 52 - Long.numberOfTrailingZeros(kbc.Y(d)) <= Math.getExponent(d);
        }
        return false;
    }

    public static boolean b(double d) {
        if (d > 0.0d && kbc.Z(d)) {
            long jY = kbc.Y(d);
            if ((jY & (jY - 1)) == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public static int c(double d) {
        boolean zB;
        RoundingMode roundingMode = RoundingMode.CEILING;
        boolean z = false;
        x0x.z("x must be positive and finite", d > 0.0d && kbc.Z(d));
        int exponent = Math.getExponent(d);
        if (Math.getExponent(d) < -1022) {
            return c(d * 4.503599627370496E15d) - 52;
        }
        switch (rbl.f30193a[roundingMode.ordinal()]) {
            case 1:
                n7x.z(b(d));
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 2:
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 3:
                z = !b(d);
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 4:
                z = exponent < 0;
                zB = b(d);
                z &= !zB;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 5:
                z = exponent >= 0;
                zB = b(d);
                z &= !zB;
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            case 6:
            case 7:
            case 8:
                double dLongBitsToDouble = Double.longBitsToDouble((Double.doubleToRawLongBits(d) & 4503599627370495L) | 4607182418800017408L);
                if (dLongBitsToDouble * dLongBitsToDouble > 2.0d) {
                    z = true;
                }
                if (z) {
                    return exponent + 1;
                }
                return exponent;
            default:
                throw new AssertionError();
        }
    }
}
