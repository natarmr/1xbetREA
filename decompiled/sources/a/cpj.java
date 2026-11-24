package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cpj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4750a;

    public cpj(long j) {
        this.f4750a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cpj) && this.f4750a == ((cpj) obj).f4750a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4750a) + (Boolean.hashCode(false) * 31);
    }

    public final String toString() {
        return axq.h(this.f4750a, "TeamGames(hasBackStack=false, teamId=", Separators.RPAREN);
    }
}
