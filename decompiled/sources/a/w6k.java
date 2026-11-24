package a;

/* JADX INFO: loaded from: classes.dex */
public interface w6k {
    default long B(float f) {
        return o(s0(f));
    }

    default int B0(long j) {
        return Math.round(X(j));
    }

    default long G0(long j) {
        if (j == 9205357640488583168L) {
            return 9205357640488583168L;
        }
        float fW0 = w0(bdl.b(j));
        float fW1 = w0(bdl.a(j));
        return (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW1)) & 4294967295L);
    }

    default int T(float f) {
        float fW0 = w0(f);
        if (Float.isInfinite(fW0)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(fW0);
    }

    default float X(long j) {
        if (!eaq0.a(daq0.b(j), 4294967296L)) {
            zcx.b("Only Sp can convert to Px");
        }
        return w0(s(j));
    }

    float getDensity();

    default long o(float f) {
        float[] fArr = isq.f15318a;
        if (v0() < 1.03f) {
            return idm0.v(f / v0(), 4294967296L);
        }
        hsq hsqVarA = isq.a(v0());
        return idm0.v(hsqVarA != null ? hsqVarA.a(f) : f / v0(), 4294967296L);
    }

    default long p(long j) {
        if (j != 9205357640488583168L) {
            return qbc.i(s0(Float.intBitsToFloat((int) (j >> 32))), s0(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return 9205357640488583168L;
    }

    default float r0(int i) {
        return i / getDensity();
    }

    default float s(long j) {
        if (!eaq0.a(daq0.b(j), 4294967296L)) {
            zcx.b("Only Sp can convert to Px");
        }
        float[] fArr = isq.f15318a;
        if (v0() < 1.03f) {
            return v0() * daq0.c(j);
        }
        hsq hsqVarA = isq.a(v0());
        if (hsqVarA != null) {
            return hsqVarA.b(daq0.c(j));
        }
        return v0() * daq0.c(j);
    }

    default float s0(float f) {
        return f / getDensity();
    }

    float v0();

    default float w0(float f) {
        return getDensity() * f;
    }

    default long z(int i) {
        return o(r0(i));
    }
}
