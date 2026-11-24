package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gms implements ims {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11554a;

    public gms(long j) {
        this.f11554a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gms) && this.f11554a == ((gms) obj).f11554a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11554a);
    }

    public final String toString() {
        return axq.h(this.f11554a, "TeamFavoriteClick(teamId=", Separators.RPAREN);
    }
}
