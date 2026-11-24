package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class hca implements jca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1i f12811a;

    public final boolean equals(Object obj) {
        if (obj instanceof hca) {
            return this.f12811a.equals(((hca) obj).f12811a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12811a.hashCode();
    }

    public final String toString() {
        return "MediumCardSmallTeamLogo(model=" + this.f12811a + Separators.RPAREN;
    }
}
