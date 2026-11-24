package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class wx7 implements u12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f39917a;
    public final float b;

    public wx7(float f, float f2) {
        this.f39917a = f;
        this.b = f2;
    }

    @Override // a.u12
    public final long a(long j, long j2, k6z k6zVar) {
        long j3 = (((long) (((int) (j2 >> 32)) - ((int) (j >> 32)))) << 32) | (((long) (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L)))) & 4294967295L);
        float f = (this.f39917a + 1.0f) * (((int) (j3 >> 32)) / 2.0f);
        return (((long) Math.round((1.0f + this.b) * (((int) (j3 & 4294967295L)) / 2.0f))) & 4294967295L) | (((long) Math.round(f)) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wx7)) {
            return false;
        }
        wx7 wx7Var = (wx7) obj;
        return Float.compare(this.f39917a, wx7Var.f39917a) == 0 && Float.compare(this.b, wx7Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f39917a) * 31);
    }

    public final String toString() {
        return rw2.i(this.f39917a, this.b, "BiasAbsoluteAlignment(horizontalBias=", ", verticalBias=", Separators.RPAREN);
    }
}
