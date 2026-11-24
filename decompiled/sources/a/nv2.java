package a;

/* JADX INFO: loaded from: classes.dex */
public final class nv2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f24170a;
    public Object b;
    public float c = Float.NaN;
    public final /* synthetic */ rv2 d;

    public nv2(rv2 rv2Var) {
        this.d = rv2Var;
    }

    public final void a(float f, float f2) {
        rv2 rv2Var = this.d;
        pz40 pz40Var = rv2Var.c;
        agk0 agk0Var = rv2Var.f;
        float fL = agk0Var.l();
        agk0Var.m(f);
        rv2Var.g.m(f2);
        if (Float.isNaN(fL)) {
            return;
        }
        boolean z = f >= fL;
        hgk0 hgk0Var = (hgk0) pz40Var;
        if (agk0Var.l() == rv2Var.d().d(hgk0Var.getValue())) {
            Object objB = rv2Var.d().b(agk0Var.l() + (z ? 1.0f : -1.0f), z);
            if (objB == null) {
                objB = hgk0Var.getValue();
            }
            if (z) {
                this.f24170a = hgk0Var.getValue();
                this.b = objB;
            } else {
                this.f24170a = objB;
                this.b = hgk0Var.getValue();
            }
        } else {
            Object objB2 = rv2Var.d().b(agk0Var.l(), false);
            if (objB2 == null) {
                objB2 = hgk0Var.getValue();
            }
            Object objB3 = rv2Var.d().b(agk0Var.l(), true);
            if (objB3 == null) {
                objB3 = hgk0Var.getValue();
            }
            this.f24170a = objB2;
            this.b = objB3;
        }
        vtj vtjVarD = rv2Var.d();
        Object obj = this.f24170a;
        obj.getClass();
        float fD = vtjVarD.d(obj);
        vtj vtjVarD2 = rv2Var.d();
        Object obj2 = this.b;
        obj2.getClass();
        this.c = Math.abs(fD - vtjVarD2.d(obj2));
        if (Math.abs(agk0Var.l() - rv2Var.d().d(hgk0Var.getValue())) >= this.c / 2.0f) {
            Object value = z ? this.b : this.f24170a;
            if (value == null) {
                value = hgk0Var.getValue();
            }
            ((hgk0) pz40Var).setValue(value);
        }
    }
}
