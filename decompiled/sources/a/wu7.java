package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wu7 implements dv7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39776a;

    public wu7(String str) {
        this.f39776a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wu7) && this.f39776a.equals(((wu7) obj).f39776a);
    }

    public final int hashCode() {
        return this.f39776a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowBalanceErrorDialog(data=", this.f39776a, Separators.RPAREN);
    }
}
