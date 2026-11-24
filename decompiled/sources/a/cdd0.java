package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cdd0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4158a;

    public cdd0(long j) {
        this.f4158a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cdd0) && this.f4158a == ((cdd0) obj).f4158a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f4158a);
    }

    public final String toString() {
        return axq.h(this.f4158a, "TeamGames(teamId=", Separators.RPAREN);
    }
}
