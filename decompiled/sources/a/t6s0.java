package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class t6s0 implements u6s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hqt0 f33435a;
    public final z1s0 b;

    public t6s0(hqt0 hqt0Var, z1s0 z1s0Var) {
        this.f33435a = hqt0Var;
        this.b = z1s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6s0)) {
            return false;
        }
        t6s0 t6s0Var = (t6s0) obj;
        return this.f33435a == t6s0Var.f33435a && this.b == t6s0Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f33435a.hashCode() * 31);
    }

    public final String toString() {
        return "OnTournamentButtonClick(buttonAction=" + this.f33435a + ", tournamentKind=" + this.b + Separators.RPAREN;
    }
}
