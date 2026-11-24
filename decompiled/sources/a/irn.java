package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class irn implements mrn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f15266a;

    public irn(double d) {
        this.f15266a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof irn) && Double.compare(this.f15266a, ((irn) obj).f15266a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f15266a);
    }

    public final String toString() {
        return "CloseBottomSheet(changedSum=" + this.f15266a + Separators.RPAREN;
    }
}
