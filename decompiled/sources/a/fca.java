package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fca implements jca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1i f9302a;

    public final boolean equals(Object obj) {
        if (obj instanceof fca) {
            return this.f9302a.equals(((fca) obj).f9302a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f9302a.hashCode();
    }

    public final String toString() {
        return "LargeCardLargeTeamLogo(model=" + this.f9302a + Separators.RPAREN;
    }
}
