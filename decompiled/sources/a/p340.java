package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p340 implements fmo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fmo f26282a;
    public final ccs0 b;

    public p340(fmo fmoVar, ccs0 ccs0Var) {
        this.f26282a = fmoVar;
        this.b = ccs0Var;
    }

    @Override // a.fmo
    public final void a() {
        this.f26282a.a();
    }

    @Override // a.fmo
    public final void b() {
        this.f26282a.b();
    }

    @Override // a.fmo
    public final boolean c(int i, long j) {
        return this.f26282a.c(i, j);
    }

    @Override // a.fmo
    public final int d() {
        return this.f26282a.d();
    }

    @Override // a.fmo
    public final void e() {
        this.f26282a.e();
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof p340)) {
            return this.b.equals(((p340) obj).b);
        }
        return false;
    }

    @Override // a.fmo
    public final androidx.media3.common.b f(int i) {
        return this.b.d[this.f26282a.g(i)];
    }

    @Override // a.fmo
    public final int g(int i) {
        return this.f26282a.g(i);
    }

    @Override // a.fmo
    public final boolean h(int i, long j) {
        return this.f26282a.h(i, j);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f26282a.hashCode() * 31);
    }

    @Override // a.fmo
    public final void i(float f) {
        this.f26282a.i(f);
    }

    @Override // a.fmo
    public final Object j() {
        return this.f26282a.j();
    }

    @Override // a.fmo
    public final void k() {
        this.f26282a.k();
    }

    @Override // a.fmo
    public final int l(int i) {
        return this.f26282a.l(i);
    }

    @Override // a.fmo
    public final int length() {
        return this.f26282a.length();
    }

    @Override // a.fmo
    public final void m(long j, long j2, long j3, List list, am30[] am30VarArr) {
        this.f26282a.m(j, j2, j3, list, am30VarArr);
    }

    @Override // a.fmo
    public final ccs0 n() {
        return this.b;
    }

    @Override // a.fmo
    public final void o(boolean z) {
        this.f26282a.o(z);
    }

    @Override // a.fmo
    public final int p(long j, List list) {
        return this.f26282a.p(j, list);
    }

    @Override // a.fmo
    public final int q() {
        return this.f26282a.q();
    }

    @Override // a.fmo
    public final androidx.media3.common.b r() {
        return this.b.d[this.f26282a.q()];
    }

    @Override // a.fmo
    public final int s() {
        return this.f26282a.s();
    }

    @Override // a.fmo
    public final boolean t(long j, yic yicVar, List list) {
        return this.f26282a.t(j, yicVar, list);
    }

    @Override // a.fmo
    public final void u() {
        this.f26282a.u();
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p340) {
            return this.f26282a.equals(((p340) obj).f26282a);
        }
        return false;
    }
}
