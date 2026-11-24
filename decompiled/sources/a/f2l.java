package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class f2l implements h2l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8817a;

    public final boolean equals(Object obj) {
        if (obj instanceof f2l) {
            return this.f8817a.equals(((f2l) obj).f8817a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f8817a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamLightHeroLogo(value=", this.f8817a, Separators.RPAREN);
    }
}
