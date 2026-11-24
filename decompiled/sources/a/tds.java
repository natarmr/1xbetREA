package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class tds extends wds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33784a;

    public tds(String str) {
        this.f33784a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tds) && this.f33784a.equals(((tds) obj).f33784a);
    }

    public final int hashCode() {
        return this.f33784a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamTwoLogoUrlChanged(url=", this.f33784a, Separators.RPAREN);
    }
}
