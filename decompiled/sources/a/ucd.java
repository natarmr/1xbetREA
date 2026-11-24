package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ucd implements vcd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35423a;

    public final boolean equals(Object obj) {
        if (obj instanceof ucd) {
            return this.f35423a.equals(((ucd) obj).f35423a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f35423a.hashCode();
    }

    public final String toString() {
        return kng0.l("Url(value=", this.f35423a, Separators.RPAREN);
    }
}
