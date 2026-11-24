package a;

/* JADX INFO: loaded from: classes6.dex */
public final class qtm implements stm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29305a;

    public qtm(long j) {
        fgm fgmVar = fgm.f9498a;
        this.f29305a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qtm) || this.f29305a != ((qtm) obj).f29305a) {
            return false;
        }
        fgm fgmVar = fgm.f9498a;
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((fgm.b.hashCode() + (Long.hashCode(this.f29305a) * 31)) * 31);
    }

    public final String toString() {
        return "Timer(timerMilliSeconds=" + this.f29305a + ", timerDirection=" + fgm.b + ", isTimerRun=true)";
    }
}
