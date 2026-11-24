package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class gkb0 implements okb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11437a;

    public gkb0(long j) {
        this.f11437a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gkb0) && this.f11437a == ((gkb0) obj).f11437a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f11437a);
    }

    public final String toString() {
        return axq.h(this.f11437a, "OnHighRatedChampFavoriteClick(champId=", Separators.RPAREN);
    }
}
