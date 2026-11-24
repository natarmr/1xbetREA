package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class jkb0 implements okb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f16660a;

    public final boolean equals(Object obj) {
        if (obj instanceof jkb0) {
            return this.f16660a == ((jkb0) obj).f16660a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f16660a);
    }

    public final String toString() {
        return axq.h(this.f16660a, "OnPopularChampFavoriteClick(champId=", Separators.RPAREN);
    }
}
