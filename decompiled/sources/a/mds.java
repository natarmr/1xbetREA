package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class mds extends wds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21612a;

    public mds(String str) {
        this.f21612a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mds) && this.f21612a.equals(((mds) obj).f21612a);
    }

    public final int hashCode() {
        return this.f21612a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamOneSecondPlayerLogoUrlChanged(url=", this.f21612a, Separators.RPAREN);
    }
}
