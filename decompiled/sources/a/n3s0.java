package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class n3s0 implements o3s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hqt0 f22865a;
    public final z1s0 b;

    public n3s0(hqt0 hqt0Var, z1s0 z1s0Var) {
        this.f22865a = hqt0Var;
        this.b = z1s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n3s0)) {
            return false;
        }
        n3s0 n3s0Var = (n3s0) obj;
        return this.f22865a == n3s0Var.f22865a && this.b == n3s0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f22865a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTournamentButtonClick(buttonAction=" + this.f22865a + ", tournamentKind=" + this.b + Separators.RPAREN;
    }
}
