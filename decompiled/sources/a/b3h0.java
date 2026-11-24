package a;

/* JADX INFO: loaded from: classes.dex */
public final class b3h0 implements afv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vy40 f1905a;
    public afv b;

    @Override // a.afv
    public final ehf0 a() {
        afv afvVar = this.b;
        if (!(afvVar != null)) {
            xcx.b("GraphicsContext not provided");
        }
        return afvVar.a();
    }

    @Override // a.afv
    public final dfv b() {
        afv afvVar = this.b;
        if (afvVar == null) {
            xcx.b("GraphicsContext not provided");
        }
        dfv dfvVarB = afvVar.b();
        vy40 vy40Var = this.f1905a;
        if (vy40Var != null) {
            vy40Var.a(dfvVarB);
            return dfvVarB;
        }
        Object[] objArr = w960.f38764a;
        vy40 vy40Var2 = new vy40(1);
        vy40Var2.a(dfvVarB);
        this.f1905a = vy40Var2;
        return dfvVarB;
    }

    @Override // a.afv
    public final void c(dfv dfvVar) {
        afv afvVar = this.b;
        if (afvVar != null) {
            afvVar.c(dfvVar);
        }
    }

    public final void d() {
        vy40 vy40Var = this.f1905a;
        if (vy40Var != null) {
            Object[] objArr = vy40Var.f38232a;
            int i = vy40Var.b;
            for (int i2 = 0; i2 < i; i2++) {
                c((dfv) objArr[i2]);
            }
            vy40Var.d();
        }
    }
}
