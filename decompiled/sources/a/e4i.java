package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class e4i implements h4i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f7183a;
    public final long b;
    public final boolean c;

    public e4i(int i, long j, long j2, boolean z) {
        fgm fgmVar = fgm.f9498a;
        z = (i & 16) != 0 ? false : z;
        this.f7183a = j;
        this.b = j2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e4i)) {
            return false;
        }
        e4i e4iVar = (e4i) obj;
        if (this.f7183a != e4iVar.f7183a) {
            return false;
        }
        fgm fgmVar = fgm.f9498a;
        return this.b == e4iVar.b && this.c == e4iVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(rw2.b((fgm.b.hashCode() + (Long.hashCode(this.f7183a) * 31)) * 31, 31, this.b), 31, true);
    }

    public final String toString() {
        fgm fgmVar = fgm.b;
        StringBuilder sb = new StringBuilder("Timer(timerMilliSeconds=");
        sb.append(this.f7183a);
        sb.append(", timerDirection=");
        sb.append(fgmVar);
        kng0.A(sb, ", requestedMsAt=", this.b, ", isTimerRun=true, hasPrematchTimer=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
