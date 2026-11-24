package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class lte implements ute {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20627a;

    public final boolean equals(Object obj) {
        if (obj instanceof lte) {
            return this.f20627a.equals(((lte) obj).f20627a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f20627a.hashCode();
    }

    public final String toString() {
        return kng0.l("MarketTitleText(value=", this.f20627a, Separators.RPAREN);
    }
}
