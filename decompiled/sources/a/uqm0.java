package a;

/* JADX INFO: loaded from: classes.dex */
public final class uqm0 implements sqm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f36126a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public boolean g;

    @Override // a.sqm0
    public final float a() {
        return this.d;
    }

    @Override // a.sqm0
    public final boolean b() {
        return this.g;
    }

    @Override // a.sqm0
    public final float getInterpolation(float f) {
        float f2 = this.e;
        if (f > f2) {
            this.g = true;
            return this.f36126a;
        }
        if (f <= f2) {
            this.d = (this.c * f) + this.b;
        }
        return ((((this.c * f) / 2.0f) + this.b) * f) + this.f;
    }
}
