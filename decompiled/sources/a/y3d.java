package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class y3d {
    public static final long b = fbc.f(4278190080L);
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final /* synthetic */ int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41946a;

    static {
        fbc.f(4282664004L);
        fbc.f(4287137928L);
        fbc.f(4291611852L);
        c = fbc.f(4294967295L);
        d = fbc.f(4294901760L);
        fbc.f(4278255360L);
        e = fbc.f(4278190335L);
        fbc.f(4294967040L);
        fbc.f(4278255615L);
        fbc.f(4294902015L);
        f = fbc.d(0);
        float[] fArr = a5d.f266a;
        g = fbc.c(0.0f, 0.0f, 0.0f, 0.0f, a5d.u);
    }

    public /* synthetic */ y3d(long j) {
        this.f41946a = j;
    }

    public static final /* synthetic */ y3d a(long j) {
        return new y3d(j);
    }

    public static final long b(long j, y4d y4dVar) {
        m2e m2eVarM;
        y4d y4dVarF = f(j);
        int i = y4dVarF.c;
        int i2 = y4dVar.c;
        if ((i | i2) < 0) {
            m2eVarM = qbc.M(y4dVarF, y4dVar);
        } else {
            ey40 ey40Var = n2e.f22794a;
            int i3 = i | (i2 << 6);
            Object objB = ey40Var.b(i3);
            if (objB == null) {
                objB = qbc.M(y4dVarF, y4dVar);
                ey40Var.j(i3, objB);
            }
            m2eVarM = (m2e) objB;
        }
        return m2eVarM.a(j);
    }

    public static long c(float f2, long j) {
        return fbc.c(h(j), g(j), e(j), f2, f(j));
    }

    public static final float d(long j) {
        float fU;
        float f2;
        long j2 = 63 & j;
        g2t0 g2t0Var = h2t0.b;
        if (j2 == 0) {
            fU = (float) qim0.u((j >>> 56) & 255);
            f2 = 255.0f;
        } else {
            fU = (float) qim0.u((j >>> 6) & 1023);
            f2 = 1023.0f;
        }
        return fU / f2;
    }

    public static final float e(long j) {
        int i;
        int i2;
        int i3;
        long j2 = 63 & j;
        g2t0 g2t0Var = h2t0.b;
        if (j2 == 0) {
            return ((float) qim0.u((j >>> 32) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 16) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - wkq.f39319a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final y4d f(long j) {
        float[] fArr = a5d.f266a;
        g2t0 g2t0Var = h2t0.b;
        return a5d.y[(int) (j & 63)];
    }

    public static final float g(long j) {
        int i;
        int i2;
        int i3;
        long j2 = 63 & j;
        g2t0 g2t0Var = h2t0.b;
        if (j2 == 0) {
            return ((float) qim0.u((j >>> 40) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 32) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - wkq.f39319a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static final float h(long j) {
        int i;
        int i2;
        int i3;
        long j2 = 63 & j;
        g2t0 g2t0Var = h2t0.b;
        if (j2 == 0) {
            return ((float) qim0.u((j >>> 48) & 255)) / 255.0f;
        }
        short s = (short) ((j >>> 48) & 65535);
        int i4 = Short.MIN_VALUE & s;
        int i5 = ((65535 & s) >>> 10) & 31;
        int i6 = s & 1023;
        if (i5 != 0) {
            int i7 = i6 << 13;
            if (i5 == 31) {
                i = 255;
                if (i7 != 0) {
                    i7 |= 4194304;
                }
            } else {
                i = i5 + 112;
            }
            int i8 = i;
            i2 = i7;
            i3 = i8;
        } else {
            if (i6 != 0) {
                float fIntBitsToFloat = Float.intBitsToFloat(i6 + 1056964608) - wkq.f39319a;
                return i4 == 0 ? fIntBitsToFloat : -fIntBitsToFloat;
            }
            i3 = 0;
            i2 = 0;
        }
        return Float.intBitsToFloat((i3 << 23) | (i4 << 16) | i2);
    }

    public static String i(long j) {
        float fH = h(j);
        float fG = g(j);
        float fE = e(j);
        float fD = d(j);
        String str = f(j).f41997a;
        StringBuilder sbS = dw9.s(fH, fG, "Color(", ", ", ", ");
        vqd.v(sbS, fE, ", ", fD, ", ");
        return axq.n(sbS, str, Separators.RPAREN);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y3d) {
            return this.f41946a == ((y3d) obj).f41946a;
        }
        return false;
    }

    public final int hashCode() {
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.f41946a);
    }

    public final String toString() {
        return i(this.f41946a);
    }
}
