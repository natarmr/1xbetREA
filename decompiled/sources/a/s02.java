package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class s02 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31391a;
    public final String b;

    public s02(String str, String str2) {
        this.f31391a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s02)) {
            return false;
        }
        s02 s02Var = (s02) obj;
        return this.f31391a.equals(s02Var.f31391a) && this.b.equals(s02Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f31391a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("AimPlayersSelectedPlayersState(firstTeamSelectedPlayerId=", this.f31391a, ", secondTeamSelectedPlayerId=", this.b, Separators.RPAREN);
    }
}
