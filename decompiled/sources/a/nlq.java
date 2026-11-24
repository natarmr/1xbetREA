package a;

/* JADX INFO: loaded from: classes.dex */
public final class nlq implements xkq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23740a;
    public final ghn b;
    public final long c;
    public final long d;

    public nlq(int i, int i2, ghn ghnVar) {
        this.f23740a = i;
        this.b = ghnVar;
        this.c = ((long) i) * 1000000;
        this.d = ((long) i2) * 1000000;
    }

    @Override // a.xkq
    public final float b(float f, float f2, float f3, long j) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 == 0) {
            return f3;
        }
        return (e(f, f2, f3, j4) - e(f, f2, f3, j4 - 1000000)) * 1000.0f;
    }

    @Override // a.xkq
    public final long d(float f, float f2, float f3) {
        return this.d + this.c;
    }

    @Override // a.xkq
    public final float e(float f, float f2, float f3, long j) {
        long j2 = j - this.d;
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = this.c;
        if (j2 > j3) {
            j2 = j3;
        }
        float fA = this.b.a(this.f23740a == 0 ? 1.0f : j2 / j3);
        return (f2 * fA) + ((1.0f - fA) * f);
    }
}
