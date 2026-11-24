package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nh40 implements uh40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23516a;

    public final boolean equals(Object obj) {
        if (obj instanceof nh40) {
            return this.f23516a == ((nh40) obj).f23516a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f23516a);
    }

    public final String toString() {
        return axq.h(this.f23516a, "OnPlayersStatisticTabClick(value=", Separators.RPAREN);
    }
}
