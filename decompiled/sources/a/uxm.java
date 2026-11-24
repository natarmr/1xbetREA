package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class uxm implements wxm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36447a;
    public final long b;
    public final boolean c;

    public uxm(long j, boolean z, long j2) {
        fgm fgmVar = fgm.f9498a;
        this.f36447a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uxm)) {
            return false;
        }
        uxm uxmVar = (uxm) obj;
        if (this.f36447a != uxmVar.f36447a) {
            return false;
        }
        fgm fgmVar = fgm.f9498a;
        return this.b == uxmVar.b && this.c == uxmVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(rw2.b((fgm.b.hashCode() + (Long.hashCode(this.f36447a) * 31)) * 31, 31, this.b), 31, true);
    }

    public final String toString() {
        fgm fgmVar = fgm.b;
        StringBuilder sb = new StringBuilder("Timer(timerMilliSeconds=");
        sb.append(this.f36447a);
        sb.append(", timerDirection=");
        sb.append(fgmVar);
        kng0.A(sb, ", requestedMsAt=", this.b, ", isTimerRun=true, hasPrematchTimer=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
