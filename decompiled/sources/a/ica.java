package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ica implements jca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z1i f14526a;

    public final boolean equals(Object obj) {
        if (obj instanceof ica) {
            return this.f14526a.equals(((ica) obj).f14526a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f14526a.hashCode();
    }

    public final String toString() {
        return "SmallCardNoTeamLogo(model=" + this.f14526a + Separators.RPAREN;
    }
}
