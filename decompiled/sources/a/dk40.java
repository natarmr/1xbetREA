package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dk40 implements ek40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6215a;

    public final boolean equals(Object obj) {
        if (obj instanceof dk40) {
            return this.f6215a == ((dk40) obj).f6215a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6215a);
    }

    public final String toString() {
        return axq.h(this.f6215a, "TeamFavoriteClick(value=", Separators.RPAREN);
    }
}
