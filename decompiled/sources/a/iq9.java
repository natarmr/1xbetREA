package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class iq9 implements nq9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15198a;

    public iq9(long j) {
        this.f15198a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iq9) && this.f15198a == ((iq9) obj).f15198a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15198a);
    }

    public final String toString() {
        return axq.h(this.f15198a, "OnDeleteClicked(id=", Separators.RPAREN);
    }
}
