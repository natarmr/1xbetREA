package a;

/* JADX INFO: loaded from: classes.dex */
public final class bw9 implements jot0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cw9 f3314a;
    public final tpt0 b;
    public final p7d c;
    public pot0 d;

    public bw9(cw9 cw9Var, tpt0 tpt0Var, p7d p7dVar) {
        this.f3314a = cw9Var;
        this.b = tpt0Var;
        this.c = p7dVar;
    }

    @Override // a.jot0
    public final void b(pot0 pot0Var) {
        this.d = pot0Var;
        if (pot0Var != null) {
            p7d p7dVar = this.c;
            cw9 cw9Var = this.f3314a;
            p7dVar.f(cw9Var);
            p7dVar.b(cw9Var, this.b.e);
            cw9Var.b(pot0Var, false);
        }
    }

    @Override // a.jot0
    public final void reset() {
        cw9 cw9Var = this.f3314a;
        synchronized (cw9Var.b) {
            try {
                odd oddVar = cw9Var.d;
                if (oddVar != null) {
                    cw9Var.d = null;
                    oddVar.b0(new c44("The camera control has became inactive.", (byte) 1));
                }
                odd oddVar2 = cw9Var.e;
                if (oddVar2 != null) {
                    cw9Var.e = null;
                    oddVar2.b0(new c44("The camera control has became inactive.", (byte) 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.c.f(this.f3314a);
    }
}
