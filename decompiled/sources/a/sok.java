package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class sok implements hpk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32546a;

    public sok(long j) {
        this.f32546a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sok) && this.f32546a == ((sok) obj).f32546a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32546a);
    }

    public final String toString() {
        return axq.h(this.f32546a, "OnChampFavoriteClick(champId=", Separators.RPAREN);
    }
}
