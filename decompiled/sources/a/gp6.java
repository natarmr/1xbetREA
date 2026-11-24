package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class gp6 implements ip6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d9a0 f11668a;

    public gp6(d9a0 d9a0Var) {
        this.f11668a = d9a0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gp6) && this.f11668a.equals(((gp6) obj).f11668a);
    }

    public final int hashCode() {
        return this.f11668a.hashCode();
    }

    public final String toString() {
        return "ShowTeamActionDialog(player=" + this.f11668a + Separators.RPAREN;
    }
}
