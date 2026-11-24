package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class khm implements thm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18300a;

    public khm(long j) {
        this.f18300a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof khm) && this.f18300a == ((khm) obj).f18300a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18300a);
    }

    public final String toString() {
        return axq.h(this.f18300a, "OnEventCardClick(gameId=", Separators.RPAREN);
    }
}
