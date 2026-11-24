package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ejv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f7925a;
    public final boolean b;
    public final boolean c;

    public ejv(n0x n0xVar, boolean z, boolean z2) {
        this.f7925a = n0xVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejv)) {
            return false;
        }
        ejv ejvVar = (ejv) obj;
        return this.f7925a.equals(ejvVar.f7925a) && this.b == ejvVar.b && this.c == ejvVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f7925a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GuiltyGearTeamUiModel(teamImage=");
        sb.append(this.f7925a);
        sb.append(", win=");
        sb.append(this.b);
        sb.append(", winVisibility=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
