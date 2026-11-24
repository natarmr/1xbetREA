package a;

/* JADX INFO: loaded from: classes6.dex */
public final class lca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19790a;
    public final long b;
    public final long c;
    public final long d;

    public lca(long j, long j2, long j3, long j4) {
        this.f19790a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final lca a(long j, long j2, long j3, long j4) {
        return new lca(j != 16 ? j : this.f19790a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof lca)) {
            return false;
        }
        lca lcaVar = (lca) obj;
        long j = lcaVar.f19790a;
        int i = y3d.h;
        return h2t0.a(this.f19790a, j) && h2t0.a(this.b, lcaVar.b) && h2t0.a(this.c, lcaVar.c) && h2t0.a(this.d, lcaVar.d);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.d) + rw2.b(rw2.b(Long.hashCode(this.f19790a) * 31, 31, this.b), 31, this.c);
    }
}
