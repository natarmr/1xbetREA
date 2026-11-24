package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nlo implements sg00, wzn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23738a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nlo(int i, ly90 ly90Var, ly90 ly90Var2) {
        this.f23738a = i;
        this.b = ly90Var;
        this.c = ly90Var2;
    }

    @Override // a.sg00
    public void invoke(Object obj) {
        ly90 ly90Var = (ly90) this.b;
        ly90 ly90Var2 = (ly90) this.c;
        ky90 ky90Var = (ky90) obj;
        ky90Var.getClass();
        ky90Var.u(this.f23738a, ly90Var, ly90Var2);
    }

    @Override // a.wzn0
    public Object k() {
        wdu wduVar = (wdu) this.b;
        ((y3v) wduVar.e).v((q55) this.c, this.f23738a + 1, false);
        return null;
    }

    public /* synthetic */ nlo(wdu wduVar, q55 q55Var, int i) {
        this.b = wduVar;
        this.c = q55Var;
        this.f23738a = i;
    }
}
