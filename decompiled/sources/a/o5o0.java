package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class o5o0 implements s5o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4i f24697a;

    public final boolean equals(Object obj) {
        if (obj instanceof o5o0) {
            return this.f24697a.equals(((o5o0) obj).f24697a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f24697a.hashCode();
    }

    public final String toString() {
        return rz4.l("LargeCardLargeTeamLogo(model=", this.f24697a, Separators.RPAREN);
    }
}
