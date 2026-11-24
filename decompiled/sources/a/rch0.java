package a;

/* JADX INFO: loaded from: classes.dex */
public final class rch0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sch0 f30239a;

    public rch0(sch0 sch0Var) {
        this.f30239a = sch0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a(int i, long j) {
        sch0 sch0Var = this.f30239a;
        sch0Var.j = i;
        vf80 vf80Var = sch0Var.b;
        return (vf80Var == null || !sch0Var.b()) ? sch0Var.d(sch0Var.k, j, i) : vf80Var.c(j, sch0Var.j, sch0Var.m);
    }
}
