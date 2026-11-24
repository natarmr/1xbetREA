package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class v89 extends pm80 {
    public final e900 f;
    public float g = 1.0f;
    public a4d h;

    public v89(e900 e900Var) {
        this.f = e900Var;
    }

    @Override // a.pm80
    public final boolean a(float f) {
        this.g = f;
        return true;
    }

    @Override // a.pm80
    public final boolean b(a4d a4dVar) {
        this.h = a4dVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v89) {
            return this.f.equals(((v89) obj).f);
        }
        return false;
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0039  */
    @Override // a.pm80
    public final long i() {
        float fAbs;
        e900 e900Var = this.f;
        long j = e900Var.f;
        long j2 = e900Var.e;
        int i = (int) (j2 >> 32);
        float fAbs2 = Float.NaN;
        if (Math.abs(Float.intBitsToFloat(i)) <= Float.MAX_VALUE) {
            int i2 = (int) (j >> 32);
            if (Math.abs(Float.intBitsToFloat(i2)) <= Float.MAX_VALUE) {
                fAbs = Math.abs(Float.intBitsToFloat(i) - Float.intBitsToFloat(i2));
            } else {
                fAbs = Float.NaN;
            }
        } else {
            fAbs = Float.NaN;
        }
        int i3 = (int) (j2 & 4294967295L);
        if (Math.abs(Float.intBitsToFloat(i3)) <= Float.MAX_VALUE) {
            int i4 = (int) (j & 4294967295L);
            if (Math.abs(Float.intBitsToFloat(i4)) <= Float.MAX_VALUE) {
                fAbs2 = Math.abs(Float.intBitsToFloat(i3) - Float.intBitsToFloat(i4));
            }
        }
        return (((long) Float.floatToRawIntBits(fAbs)) << 32) | (((long) Float.floatToRawIntBits(fAbs2)) & 4294967295L);
    }

    @Override // a.pm80
    public final void j(fhl fhlVar) {
        fhl.r(fhlVar, this.f, 0L, 0L, this.g, null, this.h, 0, 86);
    }

    public final String toString() {
        return "BrushPainter(brush=" + this.f + Separators.RPAREN;
    }
}
