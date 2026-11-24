package a;

/* JADX INFO: loaded from: classes5.dex */
public final class yx3 implements glq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f43402a;
    public float b;

    @Override // a.glq
    public float a(float f, long j) {
        return f * ((float) Math.exp(((j / 1000000) / 1000.0f) * this.b));
    }

    @Override // a.glq
    public float b(float f, float f2, long j) {
        float f3 = this.b;
        return ((f2 / f3) * ((float) Math.exp((f3 * (j / 1000000)) / 1000.0f))) + (f - (f2 / f3));
    }

    public rkq c(float f) {
        double d = d(f);
        double d2 = skq.f32364a;
        double d3 = d2 - 1.0d;
        return new rkq(f, (float) (Math.exp((d2 / d3) * d) * ((double) (this.f43402a * this.b))), (long) (Math.exp(d / d3) * 1000.0d));
    }

    public double d(float f) {
        float[] fArr = gz2.f12159a;
        return Math.log(((double) (Math.abs(f) * 0.35f)) / ((double) (this.f43402a * this.b)));
    }

    @Override // a.glq
    public float g() {
        return this.f43402a;
    }

    @Override // a.glq
    public long h(float f) {
        return ((long) ((((float) Math.log(this.f43402a / Math.abs(f))) * 1000.0f) / this.b)) * 1000000;
    }

    @Override // a.glq
    public float i(float f, float f2) {
        float fAbs = Math.abs(f2);
        float f3 = this.f43402a;
        if (fAbs <= f3) {
            return f;
        }
        double dLog = Math.log(Math.abs(f3 / f2));
        float f4 = this.b;
        return ((f2 / f4) * ((float) Math.exp((((double) f4) * ((dLog / ((double) f4)) * 1000.0d)) / 1000.0d))) + (f - (f2 / f4));
    }
}
