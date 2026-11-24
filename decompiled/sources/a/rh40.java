package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class rh40 implements uh40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30472a;
    public final String b;

    public rh40(String str, String str2) {
        this.f30472a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh40)) {
            return false;
        }
        rh40 rh40Var = (rh40) obj;
        return this.f30472a.equals(rh40Var.f30472a) && this.b.equals(rh40Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30472a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("OnSelectLineupPlayer(teamId=", this.f30472a, ", playerId=", this.b, Separators.RPAREN);
    }
}
