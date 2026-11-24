package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hkb0 implements okb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13199a;

    public hkb0(long j) {
        this.f13199a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hkb0) && this.f13199a == ((hkb0) obj).f13199a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f13199a);
    }

    public final String toString() {
        return axq.h(this.f13199a, "OnHighRatedChampItemClick(champId=", Separators.RPAREN);
    }
}
