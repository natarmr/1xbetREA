package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class r3e0 implements s3e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ufp0 f29783a;
    public final ufp0 b;

    public r3e0(ufp0 ufp0Var, ufp0 ufp0Var2) {
        this.f29783a = ufp0Var;
        this.b = ufp0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r3e0)) {
            return false;
        }
        r3e0 r3e0Var = (r3e0) obj;
        return this.f29783a.equals(r3e0Var.f29783a) && this.b.equals(r3e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f29783a.hashCode() * 31);
    }

    public final String toString() {
        return "TwoTeamCell(teamModel=" + this.f29783a + ", pairTeamModel=" + this.b + Separators.RPAREN;
    }
}
