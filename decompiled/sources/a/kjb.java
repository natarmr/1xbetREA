package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class kjb implements njb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f7v0 f18379a;

    public kjb(f7v0 f7v0Var) {
        this.f18379a = f7v0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kjb) && this.f18379a == ((kjb) obj).f18379a;
    }

    public final int hashCode() {
        return this.f18379a.hashCode();
    }

    public final String toString() {
        return "OnLeaderboardClick(weightClass=" + this.f18379a + Separators.RPAREN;
    }
}
