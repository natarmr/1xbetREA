package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class d210 implements f210 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5335a;

    public final boolean equals(Object obj) {
        if (obj instanceof d210) {
            return this.f5335a == ((d210) obj).f5335a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5335a);
    }

    public final String toString() {
        return axq.h(this.f5335a, "TeamFavoriteClick(value=", Separators.RPAREN);
    }
}
