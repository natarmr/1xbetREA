package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class p76 implements t76 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4i f26492a;

    public final boolean equals(Object obj) {
        if (obj instanceof p76) {
            return this.f26492a.equals(((p76) obj).f26492a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26492a.hashCode();
    }

    public final String toString() {
        return rz4.l("LargeCardLargeTeamLogo(model=", this.f26492a, Separators.RPAREN);
    }
}
