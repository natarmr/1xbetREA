package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class q2l implements u2l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28004a;

    public final boolean equals(Object obj) {
        if (obj instanceof q2l) {
            return this.f28004a.equals(((q2l) obj).f28004a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f28004a.hashCode();
    }

    public final String toString() {
        return kng0.l("FirstTeamImage(value=", this.f28004a, Separators.RPAREN);
    }
}
