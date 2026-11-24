package a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qbg0 implements qbl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28445a;
    public final /* synthetic */ ubg0 b;

    public /* synthetic */ qbg0(ubg0 ubg0Var, byte b) {
        this.f28445a = b;
        this.b = ubg0Var;
    }

    @Override // a.qbl
    public final double e(double d) {
        byte b = this.f28445a;
        ubg0 ubg0Var = this.b;
        switch (b) {
            case 0:
                return l1e0.b(ubg0Var.k.e(d), ubg0Var.e, ubg0Var.f);
            default:
                return ubg0Var.n.e(l1e0.b(d, ubg0Var.e, ubg0Var.f));
        }
    }
}
