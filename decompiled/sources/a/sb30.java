package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sb30 implements ub30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31913a;

    public sb30(long j) {
        this.f31913a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sb30) && this.f31913a == ((sb30) obj).f31913a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f31913a);
    }

    public final String toString() {
        return axq.h(this.f31913a, "OnChipsClicked(chipsId=", Separators.RPAREN);
    }
}
