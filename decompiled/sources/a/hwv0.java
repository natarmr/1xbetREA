package a;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class hwv0 implements pwv0, jff0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pwv0 f13784a;
    public final jgc b;
    public final fwv0 c;
    public final sje d;
    public final AtomicBoolean e;

    public hwv0(pwv0 pwv0Var, jgc jgcVar, fwv0 fwv0Var) {
        this.f13784a = pwv0Var;
        this.b = jgcVar;
        this.c = fwv0Var;
        kin0 kin0VarE = qem0.e();
        rwj rwjVar = tvk.f34603a;
        this.d = d5c.a(kotlin.coroutines.e.c(kin0VarE, ys10.f43147a.x()));
        this.e = new AtomicBoolean(false);
    }

    @Override // a.pwv0
    public final void a(ugd ugdVar) {
        this.f13784a.a(ugdVar);
    }

    @Override // a.pwv0
    public final void b() {
        this.f13784a.b();
    }

    @Override // a.pwv0
    public final void d(ugd ugdVar) {
        this.f13784a.d(ugdVar);
    }

    @Override // a.pwv0
    public final void e(ugd ugdVar) {
        this.f13784a.e(ugdVar);
    }

    @Override // a.jff0
    public final void f() {
        d5c.G(this.d, null);
    }

    @Override // a.jff0
    public final void g() {
        d5c.G(this.d, null);
    }

    @Override // a.jff0
    public final void c() {
    }
}
