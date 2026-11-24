package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class uxo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bop0 f36451a;

    public uxo0(bop0 bop0Var) {
        this.f36451a = bop0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uxo0) && this.f36451a == ((uxo0) obj).f36451a;
    }

    public final int hashCode() {
        return this.f36451a.hashCode();
    }

    public final String toString() {
        return "TeamActionState(currentTeam=" + this.f36451a + Separators.RPAREN;
    }
}
