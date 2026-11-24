package a;

/* JADX INFO: loaded from: classes.dex */
public final class zag0 implements cfq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cfq f44067a;
    public final int b;

    public zag0(cfq cfqVar, int i) {
        this.f44067a = cfqVar;
        this.b = i;
    }

    @Override // a.j73
    public final p5u0 a(lxs0 lxs0Var) {
        return new v5u0(this.f44067a.a(lxs0Var), ((long) this.b) * 1000000);
    }
}
