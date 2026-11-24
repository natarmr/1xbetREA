package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class fe90 extends ie90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9396a;

    public fe90(String str) {
        this.f9396a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fe90) && this.f9396a.equals(((fe90) obj).f9396a);
    }

    public final int hashCode() {
        return this.f9396a.hashCode();
    }

    public final String toString() {
        return kng0.l("PeriodChanged(period=", this.f9396a, Separators.RPAREN);
    }
}
