package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yyt0 implements zyt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43484a;

    public final boolean equals(Object obj) {
        if (obj instanceof yyt0) {
            return this.f43484a == ((yyt0) obj).f43484a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f43484a);
    }

    public final String toString() {
        return axq.h(this.f43484a, "TournamentTableTabClick(value=", Separators.RPAREN);
    }
}
