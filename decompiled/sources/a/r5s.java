package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class r5s implements u5s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f29903a;
    public final long b;

    public r5s(long j, long j2) {
        this.f29903a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r5s)) {
            return false;
        }
        r5s r5sVar = (r5s) obj;
        return this.f29903a == r5sVar.f29903a && znq0.e(this.b, r5sVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f29903a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f29903a, "SearchLive(gameId=", ", timerValue=", znq0.h(this.b));
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
