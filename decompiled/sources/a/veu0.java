package a;

import android.util.Range;

/* JADX INFO: loaded from: classes.dex */
public final class veu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f37301a;
    public long b;
    public double c;
    public Range d;

    public veu0() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.d = range;
        this.c = ((Double) range.getUpper()).doubleValue();
        this.f37301a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0031  */
    public final void a(long j, long j2) {
        double dDoubleValue;
        x0x.A(j != -9223372036854775807L);
        x0x.A(j2 != -9223372036854775807L);
        long j3 = this.f37301a;
        if (j3 != -9223372036854775807L) {
            long j4 = this.b;
            if (j4 == -9223372036854775807L || j == j3) {
                dDoubleValue = ((Double) this.d.getUpper()).doubleValue();
            } else {
                dDoubleValue = (j2 - j4) / (j - j3);
            }
        } else {
            dDoubleValue = ((Double) this.d.getUpper()).doubleValue();
        }
        this.c = (((Double) this.d.clamp(Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d) + (this.c * 0.800000011920929d);
        this.f37301a = j;
        this.b = j2;
    }

    public final void b() {
        this.c = ((Double) this.d.getUpper()).doubleValue();
        this.f37301a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public final void c(float f) {
        x0x.A(f > 0.0f);
        this.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f)));
        b();
    }
}
