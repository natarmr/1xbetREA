package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pdp0 implements sdp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5a0 f26818a;

    public pdp0(g5a0 g5a0Var) {
        this.f26818a = g5a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pdp0) && this.f26818a.equals(((pdp0) obj).f26818a);
    }

    public final int hashCode() {
        return this.f26818a.hashCode();
    }

    public final String toString() {
        return "WithLogoOnly(playerLogo=" + this.f26818a + Separators.RPAREN;
    }
}
