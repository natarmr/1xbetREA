package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class g2l implements h2l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10564a;

    public final boolean equals(Object obj) {
        if (obj instanceof g2l) {
            return this.f10564a.equals(((g2l) obj).f10564a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f10564a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamLightNumber(value=", this.f10564a, Separators.RPAREN);
    }
}
