package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class g6h implements n6h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f10764a;

    public g6h(long j) {
        this.f10764a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g6h) && this.f10764a == ((g6h) obj).f10764a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f10764a);
    }

    public final String toString() {
        return axq.h(this.f10764a, "OnCategorySelected(marketTypeId=", Separators.RPAREN);
    }
}
