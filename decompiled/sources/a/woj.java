package a;

/* JADX INFO: loaded from: classes3.dex */
public final class woj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f39501a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;

    public woj(long j, long j2, long j3, long j4, boolean z) {
        this.f39501a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof woj)) {
            return false;
        }
        woj wojVar = (woj) obj;
        return this.f39501a == wojVar.f39501a && this.b == wojVar.b && this.c == wojVar.c && this.d == wojVar.d && this.e == wojVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(rw2.b(rw2.b(rw2.b(Long.hashCode(this.f39501a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f39501a, "SportGame(gameId=", ", subGameId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", sportId=", this.c, ", subSportId=");
        hne.t(this.d, ", live=", sbQ, this.e);
        sbQ.append(", hasBackStack=false)");
        return sbQ.toString();
    }
}
