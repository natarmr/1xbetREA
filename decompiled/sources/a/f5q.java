package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class f5q implements g5q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cny f8976a;

    public f5q(cny cnyVar) {
        this.f8976a = cnyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f5q) && this.f8976a == ((f5q) obj).f8976a;
    }

    public final int hashCode() {
        return this.f8976a.hashCode();
    }

    public final String toString() {
        return "OnSortChose(sortType=" + this.f8976a + Separators.RPAREN;
    }
}
