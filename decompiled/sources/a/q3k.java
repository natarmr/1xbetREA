package a;

/* JADX INFO: loaded from: classes2.dex */
public abstract class q3k extends p3k {
    public final kzj0 b;

    public q3k(kzj0 kzj0Var) {
        this.b = kzj0Var;
    }

    @Override // a.kzj0
    /* JADX INFO: renamed from: n0 */
    public final kzj0 k0(boolean z) {
        return z == U() ? this : this.b.k0(z).m0(K());
    }

    @Override // a.tft0
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final kzj0 m0(ays0 ays0Var) {
        ays0Var.getClass();
        return ays0Var != K() ? new nzj0(this, ays0Var) : this;
    }

    @Override // a.p3k
    public final kzj0 p0() {
        return this.b;
    }
}
