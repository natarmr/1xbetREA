package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class bnm0 implements cnm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k3i f2891a;

    public final boolean equals(Object obj) {
        if (obj instanceof bnm0) {
            return this.f2891a.equals(((bnm0) obj).f2891a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2891a.hashCode();
    }

    public final String toString() {
        return "SmallCardNoTeamLogo(model=" + this.f2891a + Separators.RPAREN;
    }
}
