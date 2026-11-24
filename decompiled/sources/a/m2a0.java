package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class m2a0 implements n2a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21047a;

    public m2a0(long j) {
        this.f21047a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m2a0) && this.f21047a == ((m2a0) obj).f21047a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f21047a);
    }

    public final String toString() {
        return axq.h(this.f21047a, "ShowSwapPlayersTeamDialog(playerId=", Separators.RPAREN);
    }
}
