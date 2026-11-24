package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class sds extends wds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32045a;

    public sds(String str) {
        this.f32045a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof sds) && this.f32045a.equals(((sds) obj).f32045a);
    }

    public final int hashCode() {
        return this.f32045a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamTwoFirstPlayerLogoUrlChanged(url=", this.f32045a, Separators.RPAREN);
    }
}
