package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class c4z implements f4z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f3746a;
    public final long b;

    public c4z(long j, long j2) {
        this.f3746a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4z)) {
            return false;
        }
        c4z c4zVar = (c4z) obj;
        return this.f3746a == c4zVar.f3746a && znq0.e(this.b, c4zVar.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.f3746a) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f3746a, "Continue(gameId=", ", timerValue=", znq0.h(this.b));
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
