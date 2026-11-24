package a;

/* JADX INFO: loaded from: classes6.dex */
public final class p0n implements r0n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26160a;
    public final fgm b;
    public final long c;
    public final boolean d;

    public p0n(long j, fgm fgmVar, long j2, boolean z, int i) {
        z = (i & 8) != 0 ? false : z;
        this.f26160a = j;
        this.b = fgmVar;
        this.c = j2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0n)) {
            return false;
        }
        p0n p0nVar = (p0n) obj;
        return this.f26160a == p0nVar.f26160a && this.b == p0nVar.b && this.c == p0nVar.c && this.d == p0nVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(rw2.b((this.b.hashCode() + (Long.hashCode(this.f26160a) * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timer(timerMilliSeconds=");
        sb.append(this.f26160a);
        sb.append(", timerDirection=");
        sb.append(this.b);
        kng0.A(sb, ", requestedMsAt=", this.c, ", hasPrematchTimer=");
        return rw2.p(sb, this.d, ", isTimerRun=true)");
    }
}
