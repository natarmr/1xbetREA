package a;

/* JADX INFO: loaded from: classes3.dex */
public final class mmj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22040a;
    public final long b;
    public final long c;
    public final boolean d;

    public mmj(long j, long j2, long j3, boolean z) {
        this.f22040a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmj)) {
            return false;
        }
        mmj mmjVar = (mmj) obj;
        return this.f22040a == mmjVar.f22040a && this.b == mmjVar.b && this.c == mmjVar.c && this.d == mmjVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + brm0.e(rw2.b(rw2.b(Long.hashCode(this.f22040a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f22040a, "CyberGame(gameId=", ", sportId=");
        sbQ.append(this.b);
        kng0.A(sbQ, ", subSportId=", this.c, ", live=");
        return rw2.p(sbQ, this.d, ", hasBackStack=false)");
    }
}
