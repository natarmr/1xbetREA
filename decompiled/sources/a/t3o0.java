package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class t3o0 implements x3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4i f33278a;

    public final boolean equals(Object obj) {
        if (obj instanceof t3o0) {
            return this.f33278a.equals(((t3o0) obj).f33278a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f33278a.hashCode();
    }

    public final String toString() {
        return rz4.l("LargeCardLargeTeamLogo(model=", this.f33278a, Separators.RPAREN);
    }
}
