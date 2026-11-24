package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class dig implements jig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f6136a;

    public dig(long j) {
        this.f6136a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dig) && this.f6136a == ((dig) obj).f6136a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f6136a);
    }

    public final String toString() {
        return axq.h(this.f6136a, "OnChampClick(champId=", Separators.RPAREN);
    }
}
