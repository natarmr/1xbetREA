package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class za30 implements db30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f44050a;
    public final String b;

    public za30(String str, String str2) {
        this.f44050a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof za30)) {
            return false;
        }
        za30 za30Var = (za30) obj;
        return this.f44050a.equals(za30Var.f44050a) && this.b.equals(za30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f44050a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("MultiTeams(leftTeamTitle=", this.f44050a, ", rightTeamTitle=", this.b, Separators.RPAREN);
    }
}
