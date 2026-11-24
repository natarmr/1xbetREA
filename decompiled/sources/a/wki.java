package a;

/* JADX INFO: loaded from: classes5.dex */
public final class wki implements dx10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final epi0 f39309a;
    public final rmd0 b;
    public final roi0 c;
    public final wsf0 d;

    public wki(roi0 roi0Var, wsf0 wsf0Var, rmd0 rmd0Var, epi0 epi0Var) {
        this.f39309a = epi0Var;
        this.b = rmd0Var;
        this.c = roi0Var;
        this.d = wsf0Var;
    }

    @Override // a.dx10
    public final zx10 a() {
        return new zx10(((xzp) this.f39309a.b).C());
    }

    @Override // a.dx10
    public final mnb b() {
        yqc yqcVarC = this.b.c();
        x1x.x(yqcVarC);
        rrc rrcVarX = ((qgd) this.c.f30839a).x();
        wsf0 wsf0Var = this.d;
        return new mnb(yqcVarC, rrcVarX, wsf0Var.b(), wsf0Var.q(), ((g45) wsf0Var.b).b(), wsf0Var.s(), (byte) 1);
    }
}
