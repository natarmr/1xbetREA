package a;

/* JADX INFO: loaded from: classes6.dex */
public final class y1n implements z1n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41864a;
    public final long b;
    public final boolean c;

    public y1n(long j, boolean z, long j2) {
        fgm fgmVar = fgm.f9498a;
        this.f41864a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1n)) {
            return false;
        }
        y1n y1nVar = (y1n) obj;
        if (this.f41864a != y1nVar.f41864a) {
            return false;
        }
        fgm fgmVar = fgm.f9498a;
        return this.b == y1nVar.b && this.c == y1nVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(rw2.b((fgm.b.hashCode() + (Long.hashCode(this.f41864a) * 31)) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        fgm fgmVar = fgm.b;
        StringBuilder sb = new StringBuilder("Timer(timerMilliSeconds=");
        sb.append(this.f41864a);
        sb.append(", timerDirection=");
        sb.append(fgmVar);
        kng0.A(sb, ", requestedMsAt=", this.b, ", hasPrematchTimer=");
        return rw2.p(sb, this.c, ", isTimerRun=true)");
    }
}
