package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class imd0 implements qmd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15019a;

    public imd0(long j) {
        this.f15019a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof imd0) && this.f15019a == ((imd0) obj).f15019a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15019a);
    }

    public final String toString() {
        return axq.h(this.f15019a, "OpenPaymentScreen(balanceId=", Separators.RPAREN);
    }
}
