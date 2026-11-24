package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class v3o0 implements x3o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k4i f36739a;

    public final boolean equals(Object obj) {
        if (obj instanceof v3o0) {
            return this.f36739a.equals(((v3o0) obj).f36739a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f36739a.hashCode();
    }

    public final String toString() {
        return rz4.l("MediumCardSmallTeamLogo(model=", this.f36739a, Separators.RPAREN);
    }
}
