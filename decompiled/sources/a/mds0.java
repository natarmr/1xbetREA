package a;

/* JADX INFO: loaded from: classes.dex */
public final class mds0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21613a;
    public final long b;
    public final boolean c;

    public mds0(long j, boolean z, long j2) {
        this.f21613a = j;
        this.b = j2;
        this.c = z;
    }

    public final mds0 a(mds0 mds0Var) {
        return new mds0(ne60.f(this.f21613a, mds0Var.f21613a), this.c || mds0Var.c, Math.max(this.b, mds0Var.b));
    }
}
