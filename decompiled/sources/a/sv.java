package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sv implements xv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32843a;

    public sv(long j) {
        this.f32843a = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sv) && this.f32843a == ((sv) obj).f32843a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32843a);
    }

    public final String toString() {
        return axq.h(this.f32843a, "UpdateSelectedCurrency(currencyId=", Separators.RPAREN);
    }
}
