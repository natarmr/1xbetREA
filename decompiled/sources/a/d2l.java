package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class d2l implements h2l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5361a;

    public final boolean equals(Object obj) {
        if (obj instanceof d2l) {
            return this.f5361a.equals(((d2l) obj).f5361a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5361a.hashCode();
    }

    public final String toString() {
        return kng0.l("TeamDarkNumber(value=", this.f5361a, Separators.RPAREN);
    }
}
