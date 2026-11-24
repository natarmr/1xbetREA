package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class anm0 implements cnm0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l3i f1163a;

    public final boolean equals(Object obj) {
        if (obj instanceof anm0) {
            return this.f1163a.equals(((anm0) obj).f1163a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1163a.hashCode();
    }

    public final String toString() {
        return "MediumCardSmallTeamLogo(model=" + this.f1163a + Separators.RPAREN;
    }
}
