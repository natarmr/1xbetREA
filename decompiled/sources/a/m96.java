package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class m96 implements o96 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4i f21396a;

    public final boolean equals(Object obj) {
        if (obj instanceof m96) {
            return this.f21396a.equals(((m96) obj).f21396a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f21396a.hashCode();
    }

    public final String toString() {
        return rz4.l("MediumCardSmallTeamLogo(model=", this.f21396a, Separators.RPAREN);
    }
}
