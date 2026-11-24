package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class tsq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f34472a;
    public final j83 b;
    public final int c;

    public tsq(j83 j83Var, j83 j83Var2, int i) {
        this.f34472a = j83Var;
        this.b = j83Var2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tsq)) {
            return false;
        }
        tsq tsqVar = (tsq) obj;
        return this.f34472a.equals(tsqVar.f34472a) && this.b.equals(tsqVar.b) && this.c == tsqVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + brm0.f(this.b, this.f34472a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FootballCellUiModel(teamOneScore=");
        sb.append((Object) this.f34472a);
        sb.append(", teamTwoScore=");
        sb.append((Object) this.b);
        sb.append(", headerIcon=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
