package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xyt0 implements zyt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41722a;

    public final boolean equals(Object obj) {
        if (obj instanceof xyt0) {
            return this.f41722a == ((xyt0) obj).f41722a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f41722a);
    }

    public final String toString() {
        return axq.h(this.f41722a, "TeamFavoriteClick(value=", Separators.RPAREN);
    }
}
