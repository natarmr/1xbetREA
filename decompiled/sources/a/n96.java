package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class n96 implements o96 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j4i f23123a;

    public final boolean equals(Object obj) {
        if (obj instanceof n96) {
            return this.f23123a.equals(((n96) obj).f23123a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f23123a.hashCode();
    }

    public final String toString() {
        return "SmallCardNoTeamLogo(model=" + this.f23123a + Separators.RPAREN;
    }
}
