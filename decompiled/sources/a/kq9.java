package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class kq9 implements nq9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18710a;

    public kq9(long j) {
        this.f18710a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kq9) && this.f18710a == ((kq9) obj).f18710a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f18710a);
    }

    public final String toString() {
        return axq.h(this.f18710a, "OnOpenOperatorRatingDialog(id=", Separators.RPAREN);
    }
}
