package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class v3p0 implements a4p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xcp f36741a;

    public v3p0(xcp xcpVar) {
        this.f36741a = xcpVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3p0) && this.f36741a.equals(((v3p0) obj).f36741a);
    }

    public final int hashCode() {
        return this.f36741a.hashCode();
    }

    public final String toString() {
        return "OnDeleteTeam(teamModel=" + this.f36741a + Separators.RPAREN;
    }
}
