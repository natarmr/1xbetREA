package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class l0k implements u0k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f19207a;

    public final boolean equals(Object obj) {
        if (obj instanceof l0k) {
            return this.f19207a == ((l0k) obj).f19207a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f19207a);
    }

    public final String toString() {
        return axq.h(this.f19207a, "OnPayInClicked(balanceId=", Separators.RPAREN);
    }
}
