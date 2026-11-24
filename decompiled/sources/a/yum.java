package a;

/* JADX INFO: loaded from: classes6.dex */
public final class yum implements zum {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43275a;

    public yum(long j) {
        fgm fgmVar = fgm.f9498a;
        this.f43275a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yum) || this.f43275a != ((yum) obj).f43275a) {
            return false;
        }
        fgm fgmVar = fgm.f9498a;
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ((fgm.b.hashCode() + (Long.hashCode(this.f43275a) * 31)) * 31);
    }

    public final String toString() {
        return "Timer(timerMilliSeconds=" + this.f43275a + ", timerDirection=" + fgm.b + ", isTimerRun=true)";
    }
}
