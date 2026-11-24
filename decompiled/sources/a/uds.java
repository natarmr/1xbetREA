package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class uds extends wds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35493a;

    public uds(String str) {
        this.f35493a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uds) && this.f35493a.equals(((uds) obj).f35493a);
    }

    public final int hashCode() {
        return this.f35493a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamTwoSecondPlayerLogoUrlChanged(url=", this.f35493a, Separators.RPAREN);
    }
}
