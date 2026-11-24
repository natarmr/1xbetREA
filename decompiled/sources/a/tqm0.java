package a;

/* JADX INFO: loaded from: classes.dex */
public final class tqm0 extends ps40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vqm0 f34388a;
    public oul0 b;
    public sqm0 c;

    public tqm0() {
        vqm0 vqm0Var = new vqm0();
        this.f34388a = vqm0Var;
        this.c = vqm0Var;
    }

    @Override // a.ps40
    public final float a() {
        return this.c.a();
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return this.c.getInterpolation(f);
    }
}
