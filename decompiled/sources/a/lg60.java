package a;

/* JADX INFO: loaded from: classes3.dex */
public final class lg60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qni0 f19992a;
    public final pbt b;

    public lg60(qni0 qni0Var, pbt pbtVar) {
        qni0Var.getClass();
        this.f19992a = qni0Var;
        this.b = pbtVar;
    }

    public final void a(double d) {
        this.f19992a.a(d);
        this.b.f26724a.n = d;
        j5t.a(Double.valueOf(d), "localBalanceDiff");
    }
}
