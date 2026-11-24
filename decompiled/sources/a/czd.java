package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class czd implements dzd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5219a;

    public czd(String str) {
        this.f5219a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof czd) && this.f5219a.equals(((czd) obj).f5219a);
    }

    public final int hashCode() {
        return this.f5219a.hashCode();
    }

    public final String toString() {
        return kng0.l("ShowTokenExpiredAlert(text=", this.f5219a, Separators.RPAREN);
    }
}
