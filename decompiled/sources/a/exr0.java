package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class exr0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8593a;
    public final ywr0 b;
    public final cxr0 c;
    public final cxr0 d;
    public final boolean e;

    public exr0(String str, ywr0 ywr0Var, cxr0 cxr0Var, cxr0 cxr0Var2, boolean z) {
        this.f8593a = str;
        this.b = ywr0Var;
        this.c = cxr0Var;
        this.d = cxr0Var2;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof exr0)) {
            return false;
        }
        exr0 exr0Var = (exr0) obj;
        return this.f8593a.equals(exr0Var.f8593a) && this.b.equals(exr0Var.b) && this.c.equals(exr0Var.c) && this.d.equals(exr0Var.d) && this.e == exr0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f8593a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TournamentBracketMatchUiModel(matchId=");
        sb.append(this.f8593a);
        sb.append(", headerType=");
        sb.append(this.b);
        sb.append(", teamTop=");
        sb.append(this.c);
        sb.append(", teamBottom=");
        sb.append(this.d);
        sb.append(", containsSelectedTeam=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
