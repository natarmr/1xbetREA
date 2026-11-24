package a;

/* JADX INFO: loaded from: classes.dex */
public final class on30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vn30 f25528a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public on30(vn30 vn30Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        x0x.A(!z4 || z2);
        x0x.A(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        x0x.A(z5);
        this.f25528a = vn30Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final on30 a(long j) {
        if (j == this.d) {
            return this;
        }
        return new on30(this.f25528a, this.b, this.c, j, this.e, this.f, this.g, this.h, this.i);
    }

    public final on30 b(long j, long j2) {
        if (j == this.b && j2 == this.c) {
            return this;
        }
        return new on30(this.f25528a, j, j2, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || on30.class != obj.getClass()) {
            return false;
        }
        on30 on30Var = (on30) obj;
        return this.b == on30Var.b && this.d == on30Var.d && this.e == on30Var.e && this.f == on30Var.f && this.g == on30Var.g && this.h == on30Var.h && this.i == on30Var.i && this.f25528a.equals(on30Var.f25528a);
    }

    public final int hashCode() {
        return ((((((((((((((this.f25528a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
