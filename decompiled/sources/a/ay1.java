package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ay1 implements by1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1649a;

    public ay1(long j) {
        this.f1649a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ay1) && this.f1649a == ((ay1) obj).f1649a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f1649a);
    }

    public final String toString() {
        return axq.h(this.f1649a, "OpenTournamentIfNeeded(bannerIdToOpen=", Separators.RPAREN);
    }
}
