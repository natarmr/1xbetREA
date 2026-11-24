package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class zx7 implements u12 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f45144a;
    public final float b;

    public zx7(float f, float f2) {
        this.f45144a = f;
        this.b = f2;
    }

    @Override // a.u12
    public final long a(long j, long j2, k6z k6zVar) {
        float f = (((int) (j2 >> 32)) - ((int) (j >> 32))) / 2.0f;
        float f2 = (((int) (j2 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f;
        k6z k6zVar2 = k6z.f17794a;
        float f3 = this.f45144a;
        if (k6zVar != k6zVar2) {
            f3 *= -1.0f;
        }
        float f4 = (1.0f + this.b) * f2;
        int iRound = Math.round((f3 + 1.0f) * f);
        return (((long) Math.round(f4)) & 4294967295L) | (((long) iRound) << 32);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx7)) {
            return false;
        }
        zx7 zx7Var = (zx7) obj;
        return Float.compare(this.f45144a, zx7Var.f45144a) == 0 && Float.compare(this.b, zx7Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.f45144a) * 31);
    }

    public final String toString() {
        return rw2.i(this.f45144a, this.b, "BiasAlignment(horizontalBias=", ", verticalBias=", Separators.RPAREN);
    }
}
