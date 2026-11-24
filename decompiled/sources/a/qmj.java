package a;

/* JADX INFO: loaded from: classes3.dex */
public final class qmj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28985a;
    public final String b;
    public final long c;

    public qmj(long j, long j2, String str) {
        this.f28985a = j;
        this.b = str;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qmj)) {
            return false;
        }
        qmj qmjVar = (qmj) obj;
        return this.f28985a == qmjVar.f28985a && this.b.equals(qmjVar.b) && this.c == qmjVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + rw2.b(ua80.b(Long.hashCode(this.f28985a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return rw2.n(axq.o(this.f28985a, "CyberTeamDetails(sportId=", ", teamName=", this.b), this.c, ", feedId=", ", hasBackStack=false)");
    }
}
