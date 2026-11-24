package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class rq6 implements sq6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ojp0 f30916a;

    public rq6(ojp0 ojp0Var) {
        this.f30916a = ojp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rq6) && this.f30916a.equals(((rq6) obj).f30916a);
    }

    public final int hashCode() {
        return this.f30916a.hashCode();
    }

    public final String toString() {
        return "OnTeamSelected(teamSelectorModel=" + this.f30916a + Separators.RPAREN;
    }
}
