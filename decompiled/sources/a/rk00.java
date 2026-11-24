package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rk00 implements sk00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30623a;

    public rk00(String str) {
        this.f30623a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rk00) && this.f30623a.equals(((rk00) obj).f30623a);
    }

    public final int hashCode() {
        return this.f30623a.hashCode();
    }

    public final String toString() {
        return kng0.l("UpdateWebViewUserAgent(webViewUserAgent=", this.f30623a, Separators.RPAREN);
    }
}
