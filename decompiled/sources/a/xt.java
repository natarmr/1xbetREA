package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class xt implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bop0 f41440a;
    public final int b;
    public final int c;

    public xt(bop0 bop0Var, int i, int i2) {
        this.f41440a = bop0Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt)) {
            return false;
        }
        xt xtVar = (xt) obj;
        return this.f41440a == xtVar.f41440a && this.b == xtVar.b && this.c == xtVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + twn.a(this.b, this.f41440a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AddTeamAdapterUiModel(team=");
        sb.append(this.f41440a);
        sb.append(", titleResId=");
        sb.append(this.b);
        sb.append(", iconResId=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
