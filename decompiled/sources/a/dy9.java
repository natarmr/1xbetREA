package a;

/* JADX INFO: loaded from: classes.dex */
public final class dy9 implements f0x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cy9 f6882a;

    public dy9(cy9 cy9Var) {
        this.f6882a = cy9Var;
    }

    @Override // a.f0x
    public final int a() {
        return 0;
    }

    @Override // a.f0x
    public final int c() {
        int iE = hne.E(this.f6882a.c());
        if (iE == 1) {
            return 2;
        }
        if (iE != 2) {
            return iE != 3 ? 0 : 1;
        }
        return 3;
    }

    @Override // a.f0x
    public final eoo0 f() {
        return this.f6882a.f();
    }

    @Override // a.f0x
    public final void g(jko jkoVar) {
        this.f6882a.g(jkoVar);
    }

    @Override // a.f0x
    public final long h() {
        return this.f6882a.h();
    }
}
