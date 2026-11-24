package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class kds extends wds {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18120a;

    public kds(String str) {
        this.f18120a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kds) && this.f18120a.equals(((kds) obj).f18120a);
    }

    public final int hashCode() {
        return this.f18120a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamOneFirstPlayerLogoUrlChanged(url=", this.f18120a, Separators.RPAREN);
    }
}
