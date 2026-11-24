package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class yo6 implements ip6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42969a;

    public yo6(String str) {
        this.f42969a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yo6) && this.f42969a.equals(((yo6) obj).f42969a);
    }

    public final int hashCode() {
        return this.f42969a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowBalanceErrorDialog(message=", this.f42969a, Separators.RPAREN);
    }
}
