package a;

/* JADX INFO: loaded from: classes6.dex */
public final class kum implements mum {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18917a;
    public final long b;

    public kum(long j, long j2) {
        fgm fgmVar = fgm.f9498a;
        this.f18917a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kum)) {
            return false;
        }
        kum kumVar = (kum) obj;
        if (this.f18917a != kumVar.f18917a) {
            return false;
        }
        fgm fgmVar = fgm.f9498a;
        return this.b == kumVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + brm0.e(rw2.b((fgm.b.hashCode() + (Long.hashCode(this.f18917a) * 31)) * 31, 31, this.b), 31, false);
    }

    public final String toString() {
        fgm fgmVar = fgm.b;
        StringBuilder sb = new StringBuilder("Timer(timerMilliSeconds=");
        sb.append(this.f18917a);
        sb.append(", timerDirection=");
        sb.append(fgmVar);
        return rw2.n(sb, this.b, ", requestedMsAt=", ", hasPrematchTimer=false, isTimerRun=true)");
    }
}
