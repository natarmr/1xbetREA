package a;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class u3c0 implements ncs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hxg0 f34990a;
    public final hxg0 b;
    public final pnk c = new pnk();
    public final AtomicBoolean d = new AtomicBoolean(false);

    public u3c0(hxg0 hxg0Var) {
        this.f34990a = hxg0Var;
        this.b = hxg0Var;
    }

    @Override // a.ncs0
    public final void a(int i, fq80 fq80Var) {
        h().a(i, fq80Var);
    }

    @Override // a.ncs0
    public final void b(long j, int i, int i2, int i3, mcs0 mcs0Var) {
        h().b(j, i, i2, i3, mcs0Var);
    }

    @Override // a.ncs0
    public final void c(androidx.media3.common.b bVar) {
        this.f34990a.c(bVar);
    }

    @Override // a.ncs0
    public final void d(fq80 fq80Var, int i, int i2) {
        h().d(fq80Var, i, i2);
    }

    @Override // a.ncs0
    public final int e(bbj bbjVar, int i, boolean z) {
        return h().e(bbjVar, i, z);
    }

    @Override // a.ncs0
    public final int g(bbj bbjVar, int i, boolean z) {
        return h().g(bbjVar, i, z);
    }

    public final ncs0 h() {
        return this.d.get() ? this.c : this.b;
    }

    @Override // a.ncs0
    public final void f(long j) {
    }
}
