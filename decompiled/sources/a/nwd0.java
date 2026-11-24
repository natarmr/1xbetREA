package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class nwd0 implements owd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f24229a;

    public final boolean equals(Object obj) {
        if (obj instanceof nwd0) {
            return this.f24229a == ((nwd0) obj).f24229a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f24229a);
    }

    public final String toString() {
        return axq.h(this.f24229a, "TeamFavoriteClick(value=", Separators.RPAREN);
    }
}
