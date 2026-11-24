package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class ixs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final znp0 f15559a;
    public final znp0 b;
    public final List c;
    public final int d;
    public final dgs e;

    public ixs0(znp0 znp0Var, znp0 znp0Var2, List list, int i, dgs dgsVar) {
        list.getClass();
        this.f15559a = znp0Var;
        this.b = znp0Var2;
        this.c = list;
        this.d = i;
        this.e = dgsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixs0)) {
            return false;
        }
        ixs0 ixs0Var = (ixs0) obj;
        return this.f15559a.equals(ixs0Var.f15559a) && this.b.equals(ixs0Var.b) && Intrinsics.d(this.c, ixs0Var.c) && this.d == ixs0Var.d && this.e.equals(ixs0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, dw9.a((this.b.hashCode() + (this.f15559a.hashCode() * 31)) * 31, 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TwoTeamGameUiModel(teamOne=");
        sb.append(this.f15559a);
        sb.append(", teamTwo=");
        sb.append(this.b);
        sb.append(", players=");
        brm0.v(this.d, ", sportId=", ", info=", sb, this.c);
        sb.append(this.e);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
