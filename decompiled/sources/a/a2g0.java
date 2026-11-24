package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class a2g0 implements c2g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f123a;

    public final boolean equals(Object obj) {
        if (obj instanceof a2g0) {
            return this.f123a == ((a2g0) obj).f123a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f123a);
    }

    public final String toString() {
        return axq.h(this.f123a, "OnFavoriteBtnClick(gameId=", Separators.RPAREN);
    }
}
