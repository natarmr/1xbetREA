package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class z1g0 implements c2g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f43618a;

    public final boolean equals(Object obj) {
        if (obj instanceof z1g0) {
            return this.f43618a == ((z1g0) obj).f43618a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f43618a);
    }

    public final String toString() {
        return axq.h(this.f43618a, "OnAdditionalInfoExpandClick(gameId=", Separators.RPAREN);
    }
}
