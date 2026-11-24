package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class lqc0 implements mqc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f20482a;

    public lqc0(long j) {
        this.f20482a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lqc0) && this.f20482a == ((lqc0) obj).f20482a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f20482a);
    }

    public final String toString() {
        return axq.h(this.f20482a, "OpenPromoCodeScreen(id=", Separators.RPAREN);
    }
}
