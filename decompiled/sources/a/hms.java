package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hms implements ims {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13322a;

    public hms(long j) {
        this.f13322a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hms) && this.f13322a == ((hms) obj).f13322a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13322a);
    }

    public final String toString() {
        return axq.h(this.f13322a, "TeamTitleClick(teamId=", Separators.RPAREN);
    }
}
