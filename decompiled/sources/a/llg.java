package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class llg implements plg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20246a;

    public llg(long j) {
        this.f20246a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof llg) && this.f20246a == ((llg) obj).f20246a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20246a);
    }

    public final String toString() {
        return axq.h(this.f20246a, "ChampFavoriteClick(champId=", Separators.RPAREN);
    }
}
