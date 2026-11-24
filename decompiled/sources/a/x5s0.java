package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class x5s0 implements y5s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hqt0 f40334a;
    public final z1s0 b;

    public x5s0(hqt0 hqt0Var, z1s0 z1s0Var) {
        this.f40334a = hqt0Var;
        this.b = z1s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5s0)) {
            return false;
        }
        x5s0 x5s0Var = (x5s0) obj;
        return this.f40334a == x5s0Var.f40334a && this.b == x5s0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f40334a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTournamentButtonClick(buttonAction=" + this.f40334a + ", tournamentKind=" + this.b + Separators.RPAREN;
    }
}
