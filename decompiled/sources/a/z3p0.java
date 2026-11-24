package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class z3p0 implements a4p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xcp f43733a;

    public z3p0(xcp xcpVar) {
        this.f43733a = xcpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z3p0) && this.f43733a.equals(((z3p0) obj).f43733a);
    }

    public final int hashCode() {
        return this.f43733a.hashCode();
    }

    public final String toString() {
        return "OnSelectTeam(teamModel=" + this.f43733a + Separators.RPAREN;
    }
}
