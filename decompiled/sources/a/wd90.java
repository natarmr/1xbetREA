package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class wd90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f38963a;
    public final j83 b;
    public final String c;

    public wd90(j83 j83Var, j83 j83Var2, String str) {
        this.f38963a = j83Var;
        this.b = j83Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd90)) {
            return false;
        }
        wd90 wd90Var = (wd90) obj;
        return this.f38963a.equals(wd90Var.f38963a) && this.b.equals(wd90Var.b) && this.c.equals(wd90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.f(this.b, this.f38963a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeriodCellUiModel(teamOneScore=");
        sb.append((Object) this.f38963a);
        sb.append(", teamTwoScore=");
        sb.append((Object) this.b);
        sb.append(", title=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
