package a;

/* JADX INFO: loaded from: classes.dex */
public final class g660 implements hms0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cns0 f10747a;
    public final u1x b;

    public g660(cns0 cns0Var, u1x u1xVar) {
        this.f10747a = cns0Var;
        this.b = u1xVar;
    }

    @Override // a.hms0
    public final void a() {
        u1x u1xVar = this.b;
        boolean z = u1xVar instanceof hhn0;
        cns0 cns0Var = this.f10747a;
        if (z) {
            cns0Var.onSuccess(((hhn0) u1xVar).f13073a);
        } else if (u1xVar instanceof r1o) {
            cns0Var.onError(((r1o) u1xVar).f29691a);
        } else {
            t9f.b();
        }
    }
}
