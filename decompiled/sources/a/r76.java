package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r76 implements t76 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4i f29963a;

    public final boolean equals(Object obj) {
        if (obj instanceof r76) {
            return this.f29963a.equals(((r76) obj).f29963a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29963a.hashCode();
    }

    public final String toString() {
        return rz4.l("MediumCardSmallTeamLogo(model=", this.f29963a, Separators.RPAREN);
    }
}
