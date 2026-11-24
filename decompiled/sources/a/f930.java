package a;

/* JADX INFO: loaded from: classes.dex */
public final class f930 implements mn30, ln30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vn30 f9136a;
    public final long b;
    public final lhf0 c;
    public e06 d;
    public mn30 e;
    public ln30 f;
    public long g = -9223372036854775807L;
    public boolean h;

    public f930(vn30 vn30Var, lhf0 lhf0Var, long j) {
        this.f9136a = vn30Var;
        this.c = lhf0Var;
        this.b = j;
    }

    @Override // a.ggi0
    public final void a(hgi0 hgi0Var) {
        ln30 ln30Var = this.f;
        String str = vtt0.f38024a;
        ln30Var.a(this);
    }

    @Override // a.hgi0
    public final long b() {
        mn30 mn30Var = this.e;
        String str = vtt0.f38024a;
        return mn30Var.b();
    }

    @Override // a.mn30
    public final long c(long j, gvh0 gvh0Var) {
        mn30 mn30Var = this.e;
        String str = vtt0.f38024a;
        return mn30Var.c(j, gvh0Var);
    }

    @Override // a.mn30
    public final long d(long j) {
        mn30 mn30Var = this.e;
        String str = vtt0.f38024a;
        return mn30Var.d(j);
    }

    @Override // a.hgi0
    public final boolean e() {
        mn30 mn30Var = this.e;
        return mn30Var != null && mn30Var.e();
    }

    @Override // a.ln30
    public final void f(mn30 mn30Var) {
        ln30 ln30Var = this.f;
        String str = vtt0.f38024a;
        ln30Var.f(this);
    }

    @Override // a.hgi0
    public final boolean g(yq00 yq00Var) {
        mn30 mn30Var = this.e;
        return mn30Var != null && mn30Var.g(yq00Var);
    }

    @Override // a.mn30
    public final long h() {
        mn30 mn30Var = this.e;
        String str = vtt0.f38024a;
        return mn30Var.h();
    }

    public final void i(vn30 vn30Var) {
        long j = this.g;
        if (j == -9223372036854775807L) {
            j = this.b;
        }
        e06 e06Var = this.d;
        e06Var.getClass();
        mn30 mn30VarA = e06Var.a(vn30Var, this.c, j);
        this.e = mn30VarA;
        if (this.h) {
            mn30VarA.k();
        }
        if (this.f != null) {
            this.e.r(this, j);
        }
    }

    @Override // a.mn30
    public final long j(fmo[] fmoVarArr, boolean[] zArr, ixg0[] ixg0VarArr, boolean[] zArr2, long j) {
        long j2 = this.g;
        if (j2 != -9223372036854775807L && j == this.b) {
            j = j2;
        }
        this.g = -9223372036854775807L;
        mn30 mn30Var = this.e;
        String str = vtt0.f38024a;
        return mn30Var.j(fmoVarArr, zArr, ixg0VarArr, zArr2, j);
    }

    @Override // a.mn30
    public final void k() {
        this.h = true;
        mn30 mn30Var = this.e;
        if (mn30Var != null) {
            mn30Var.k();
        }
    }

    @Override // a.mn30
    public final void l() {
        mn30 mn30Var = this.e;
        if (mn30Var != null) {
            mn30Var.l();
            return;
        }
        e06 e06Var = this.d;
        if (e06Var != null) {
            e06Var.i();
        }
    }

    @Override // a.mn30
    public final void m(long j) {
        mn30 mn30Var = this.e;
        String str = vtt0.f38024a;
        mn30Var.m(j);
    }

    @Override // a.mn30
    public final dcs0 p() {
        mn30 mn30Var = this.e;
        String str = vtt0.f38024a;
        return mn30Var.p();
    }

    @Override // a.mn30
    public final void r(ln30 ln30Var, long j) {
        this.f = ln30Var;
        mn30 mn30Var = this.e;
        if (mn30Var != null) {
            long j2 = this.g;
            if (j2 == -9223372036854775807L) {
                j2 = this.b;
            }
            mn30Var.r(this, j2);
        }
    }

    @Override // a.hgi0
    public final long s() {
        mn30 mn30Var = this.e;
        String str = vtt0.f38024a;
        return mn30Var.s();
    }

    @Override // a.hgi0
    public final void v(long j) {
        mn30 mn30Var = this.e;
        String str = vtt0.f38024a;
        mn30Var.v(j);
    }
}
