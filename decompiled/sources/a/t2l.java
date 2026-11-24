package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class t2l implements u2l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33221a;

    public final boolean equals(Object obj) {
        if (obj instanceof t2l) {
            return this.f33221a.equals(((t2l) obj).f33221a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33221a.hashCode();
    }

    public final String toString() {
        return kng0.l("SecondTeamImage(value=", this.f33221a, Separators.RPAREN);
    }
}
