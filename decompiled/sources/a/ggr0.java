package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ggr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j83 f11265a;
    public final j83 b;
    public final String c;

    public ggr0(j83 j83Var, j83 j83Var2, String str) {
        str.getClass();
        this.f11265a = j83Var;
        this.b = j83Var2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggr0)) {
            return false;
        }
        ggr0 ggr0Var = (ggr0) obj;
        return this.f11265a.equals(ggr0Var.f11265a) && this.b.equals(ggr0Var.b) && Intrinsics.d(this.c, ggr0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.f(this.b, this.f11265a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotalCellUiModel(teamOneScore=");
        sb.append((Object) this.f11265a);
        sb.append(", teamTwoScore=");
        sb.append((Object) this.b);
        sb.append(", cellTitle=");
        return axq.n(sb, this.c, Separators.RPAREN);
    }
}
