package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fis0 implements pis0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f9603a;

    public fis0(long j) {
        this.f9603a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fis0) && this.f9603a == ((fis0) obj).f9603a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f9603a);
    }

    public final String toString() {
        return axq.h(this.f9603a, "OnChipClick(chipId=", Separators.RPAREN);
    }
}
