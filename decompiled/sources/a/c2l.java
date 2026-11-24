package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class c2l implements h2l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3629a;

    public final boolean equals(Object obj) {
        if (obj instanceof c2l) {
            return this.f3629a.equals(((c2l) obj).f3629a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3629a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamDarkHeroLogo(value=", this.f3629a, Separators.RPAREN);
    }
}
