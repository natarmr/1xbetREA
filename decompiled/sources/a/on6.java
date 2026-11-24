package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class on6 implements qn6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ojp0 f25531a;

    public on6(ojp0 ojp0Var) {
        this.f25531a = ojp0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof on6) && this.f25531a.equals(((on6) obj).f25531a);
    }

    public final int hashCode() {
        return this.f25531a.hashCode();
    }

    public final String toString() {
        return "OnTeamSelected(teamSelectorModel=" + this.f25531a + Separators.RPAREN;
    }
}
