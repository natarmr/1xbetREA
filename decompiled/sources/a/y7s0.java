package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class y7s0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boo0 f42168a;
    public final a4x b;
    public final a4x c;

    public y7s0(boo0 boo0Var, i4 i4Var, a4x a4xVar) {
        i4Var.getClass();
        a4xVar.getClass();
        this.f42168a = boo0Var;
        this.b = i4Var;
        this.c = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7s0)) {
            return false;
        }
        y7s0 y7s0Var = (y7s0) obj;
        return this.f42168a.equals(y7s0Var.f42168a) && Intrinsics.d(this.b, y7s0Var.b) && Intrinsics.d(this.c, y7s0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cs0.b(this.b, this.f42168a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TournamentTableUiModel(tabs=");
        sb.append(this.f42168a);
        sb.append(", infoColumns=");
        sb.append(this.b);
        sb.append(", statColumns=");
        return cs0.n(sb, this.c, Separators.RPAREN);
    }
}
