package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class zsf implements ghn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f44903a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public zsf(float f, float f2, float f3, float f4) {
        int iV;
        this.f44903a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        if (!((Float.isNaN(f) || Float.isNaN(f2) || Float.isNaN(f3) || Float.isNaN(f4)) ? false : true)) {
            StringBuilder sbS = dw9.s(f, f2, "Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", ", ", ", ");
            sbS.append(f3);
            sbS.append(", ");
            sbS.append(f4);
            sbS.append(Separators.DOT);
            fsb0.a(sbS.toString());
        }
        float[] fArr = new float[5];
        float f5 = (f2 - 0.0f) * 3.0f;
        float f6 = (f4 - f2) * 3.0f;
        float f7 = (1.0f - f4) * 3.0f;
        double d = f5;
        double d2 = f6;
        double d3 = f7;
        double d4 = d2 * 2.0d;
        double d5 = (d - d4) + d3;
        if (d5 == 0.0d) {
            iV = d2 == d3 ? 0 : cwr0.V((float) ((d4 - d3) / (d4 - (d3 * 2.0d))), fArr, 0);
        } else {
            double d6 = -Math.sqrt((d2 * d2) - (d3 * d));
            double d7 = (-d) + d2;
            int iV2 = cwr0.V((float) ((-(d6 + d7)) / d5), fArr, 0);
            int iV3 = cwr0.V((float) ((d6 - d7) / d5), fArr, iV2) + iV2;
            if (iV3 > 1) {
                float f8 = fArr[0];
                float f9 = fArr[1];
                if (f8 > f9) {
                    fArr[0] = f9;
                    fArr[1] = f8;
                } else if (f8 == f9) {
                    iV = iV3 - 1;
                }
                iV = iV3;
            } else {
                iV = iV3;
            }
        }
        float f10 = (f6 - f5) * 2.0f;
        int iV4 = cwr0.V((-f10) / (((f7 - f6) * 2.0f) - f10), fArr, iV) + iV;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i = 0; i < iV4; i++) {
            float f11 = fArr[i];
            float f12 = (((((((((f2 - f4) * 3.0f) + 1.0f) - 0.0f) * f11) + (((f4 - (f2 * 2.0f)) + 0.0f) * 3.0f)) * f11) + f5) * f11) + 0.0f;
            fMin = Math.min(fMin, f12);
            fMax = Math.max(fMax, f12);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.e = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0092 A[PHI: r3
  0x0092: PHI (r3v26 float) = (r3v5 float), (r3v16 float), (r3v21 float), (r3v30 float), (r3v35 float) binds: [B:128:0x0236, B:117:0x0206, B:92:0x01bb, B:47:0x00e5, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0162 A[PHI: r12
  0x0162: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:68:0x0160, B:81:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // a.ghn
    public final float a(float f) {
        float f2;
        if (f <= 0.0f || f >= 1.0f) {
            return f;
        }
        float fMax = Math.max(f, 1.1920929E-7f);
        float f3 = 0.0f - fMax;
        float f4 = this.f44903a;
        float f5 = f4 - fMax;
        float f6 = this.c;
        float f7 = f6 - fMax;
        double d = f3;
        float f8 = 0.0f;
        double d2 = ((d - (((double) f5) * 2.0d)) + ((double) f7)) * 3.0d;
        double d3 = ((double) (f5 - f3)) * 3.0d;
        double d4 = (((double) (f5 - f7)) * 3.0d) + ((double) (-f3)) + ((double) (1.0f - fMax));
        float f9 = Float.NaN;
        if (Math.abs(d4 - 0.0d) >= 1.0E-7d) {
            double d5 = d2 / d4;
            double d6 = d3 / d4;
            double d7 = d / d4;
            double d8 = ((d6 * 3.0d) - (d5 * d5)) / 9.0d;
            double d9 = ((d7 * 27.0d) + ((((2.0d * d5) * d5) * d5) - ((9.0d * d5) * d6))) / 54.0d;
            double d10 = d8 * d8 * d8;
            double d11 = (d9 * d9) + d10;
            double d12 = d5 / 3.0d;
            if (d11 < 0.0d) {
                double dSqrt = Math.sqrt(-d10);
                double d13 = (-d9) / dSqrt;
                if (d13 < -1.0d) {
                    d13 = -1.0d;
                }
                if (d13 > 1.0d) {
                    d13 = 1.0d;
                }
                double dAcos = Math.acos(d13);
                double dI = l7x.I((float) dSqrt) * 2.0f;
                float fCos = (float) ((Math.cos(dAcos / 3.0d) * dI) - d12);
                float f10 = fCos < 0.0f ? 0.0f : fCos;
                if (f10 > 1.0f) {
                    f10 = 1.0f;
                }
                if (Math.abs(f10 - fCos) > 1.05E-6f) {
                    f10 = Float.NaN;
                }
                if (Float.isNaN(f10)) {
                    float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dI) - d12);
                    f10 = fCos2 < 0.0f ? 0.0f : fCos2;
                    if (f10 > 1.0f) {
                        f10 = 1.0f;
                    }
                    if (Math.abs(f10 - fCos2) > 1.05E-6f) {
                        f10 = Float.NaN;
                    }
                    if (Float.isNaN(f10)) {
                        float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dI) - d12);
                        if (fCos3 >= 0.0f) {
                            f8 = fCos3;
                        }
                        f2 = f8 > 1.0f ? 1.0f : f8;
                        if (Math.abs(f2 - fCos3) <= 1.05E-6f) {
                            f9 = f2;
                        }
                    } else {
                        f9 = f10;
                    }
                } else {
                    f9 = f10;
                }
            } else if (d11 == 0.0d) {
                float f11 = -l7x.I((float) d9);
                float f12 = (float) d12;
                float f13 = (f11 * 2.0f) - f12;
                float f14 = f13 < 0.0f ? 0.0f : f13;
                if (f14 > 1.0f) {
                    f14 = 1.0f;
                }
                if (Math.abs(f14 - f13) > 1.05E-6f) {
                    f14 = Float.NaN;
                }
                if (Float.isNaN(f14)) {
                    float f15 = (-f11) - f12;
                    if (f15 >= 0.0f) {
                        f8 = f15;
                    }
                    f2 = f8 > 1.0f ? 1.0f : f8;
                    if (Math.abs(f2 - f15) <= 1.05E-6f) {
                        f9 = f2;
                    }
                } else {
                    f9 = f14;
                }
            } else {
                double dSqrt2 = Math.sqrt(d11);
                float fI = (float) (((double) (l7x.I((float) ((-d9) + dSqrt2)) - l7x.I((float) (d9 + dSqrt2)))) - d12);
                if (fI >= 0.0f) {
                    f8 = fI;
                }
                f2 = f8 > 1.0f ? 1.0f : f8;
                if (Math.abs(f2 - fI) <= 1.05E-6f) {
                    f9 = f2;
                }
            }
        } else if (Math.abs(d2 - 0.0d) >= 1.0E-7d) {
            double dSqrt3 = Math.sqrt((d3 * d3) - ((4.0d * d2) * d));
            double d14 = d2 * 2.0d;
            float f16 = (float) ((dSqrt3 - d3) / d14);
            float f17 = f16 < 0.0f ? 0.0f : f16;
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            if (Math.abs(f17 - f16) > 1.05E-6f) {
                f17 = Float.NaN;
            }
            if (Float.isNaN(f17)) {
                float f18 = (float) (((-d3) - dSqrt3) / d14);
                if (f18 >= 0.0f) {
                    f8 = f18;
                }
                f2 = f8 > 1.0f ? 1.0f : f8;
                if (Math.abs(f2 - f18) <= 1.05E-6f) {
                    f9 = f2;
                }
            } else {
                f9 = f17;
            }
        } else if (Math.abs(d3 - 0.0d) >= 1.0E-7d) {
            float f19 = (float) ((-d) / d3);
            if (f19 >= 0.0f) {
                f8 = f19;
            }
            f2 = f8 > 1.0f ? 1.0f : f8;
            if (Math.abs(f2 - f19) <= 1.05E-6f) {
                f9 = f2;
            }
        }
        boolean zIsNaN = Float.isNaN(f9);
        float f20 = this.d;
        float f21 = this.b;
        if (zIsNaN) {
            StringBuilder sbS = dw9.s(f4, f21, "The cubic curve with parameters (", ", ", ", ");
            vqd.v(sbS, f6, ", ", f20, ") has no solution at ");
            sbS.append(f);
            throw new IllegalArgumentException(sbS.toString());
        }
        float f22 = ((((((f21 - f20) + 0.33333334f) * f9) + (f20 - (2.0f * f21))) * f9) + f21) * 3.0f * f9;
        float f23 = this.e;
        if (f22 < f23) {
            f22 = f23;
        }
        float f24 = this.f;
        return f22 > f24 ? f24 : f22;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zsf)) {
            return false;
        }
        zsf zsfVar = (zsf) obj;
        return this.f44903a == zsfVar.f44903a && this.b == zsfVar.b && this.c == zsfVar.c && this.d == zsfVar.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + defpackage.c.a(defpackage.c.a(Float.hashCode(this.f44903a) * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        StringBuilder sbS = dw9.s(this.f44903a, this.b, "CubicBezierEasing(a=", ", b=", ", c=");
        sbS.append(this.c);
        sbS.append(", d=");
        sbS.append(this.d);
        sbS.append(Separators.RPAREN);
        return sbS.toString();
    }
}
