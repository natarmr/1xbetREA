package a;

/* JADX INFO: loaded from: classes.dex */
public final class wkq0 implements ixg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ixg0 f39320a;
    public final long b;

    public wkq0(ixg0 ixg0Var, long j) {
        this.f39320a = ixg0Var;
        this.b = j;
    }

    @Override // a.ixg0
    public final int a() {
        return this.f39320a.a();
    }

    @Override // a.ixg0
    public final int b(hsj hsjVar, wkj wkjVar, int i) {
        int iB = this.f39320a.b(hsjVar, wkjVar, i);
        if (iB == -4) {
            wkjVar.i += this.b;
        }
        return iB;
    }

    @Override // a.ixg0
    public final void c() {
        this.f39320a.c();
    }

    @Override // a.ixg0
    public final int d(long j) {
        return this.f39320a.d(j - this.b);
    }

    @Override // a.ixg0
    public final boolean isReady() {
        return this.f39320a.isReady();
    }
}
