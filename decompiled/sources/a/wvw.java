package a;

/* JADX INFO: loaded from: classes6.dex */
public final class wvw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39859a;
    public final long b;
    public final long c;
    public final long d;

    public wvw(long j, long j2, long j3, long j4) {
        this.f39859a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public final wvw a(long j, long j2, long j3, long j4) {
        return new wvw(j != 16 ? j : this.f39859a, j2 != 16 ? j2 : this.b, j3 != 16 ? j3 : this.c, j4 != 16 ? j4 : this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof wvw)) {
            return false;
        }
        wvw wvwVar = (wvw) obj;
        long j = wvwVar.f39859a;
        int i = y3d.h;
        return h2t0.a(this.f39859a, j) && h2t0.a(this.b, wvwVar.b) && h2t0.a(this.c, wvwVar.c) && h2t0.a(this.d, wvwVar.d);
    }

    public final int hashCode() {
        int i = y3d.h;
        g2t0 g2t0Var = h2t0.b;
        return Long.hashCode(this.d) + rw2.b(rw2.b(Long.hashCode(this.f39859a) * 31, 31, this.b), 31, this.c);
    }
}
