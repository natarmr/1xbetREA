package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yd90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f42423a;
    public final j83 b;
    public final String c;

    public yd90(j83 j83Var, j83 j83Var2, String str) {
        str.getClass();
        this.f42423a = j83Var;
        this.b = j83Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yd90)) {
            return false;
        }
        yd90 yd90Var = (yd90) obj;
        return this.f42423a.equals(yd90Var.f42423a) && this.b.equals(yd90Var.b) && Intrinsics.d(this.c, yd90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.f(this.b, this.f42423a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeriodCellUiModel(teamOneScore=");
        sb.append((Object) this.f42423a);
        sb.append(", teamTwoScore=");
        sb.append((Object) this.b);
        sb.append(", title=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
