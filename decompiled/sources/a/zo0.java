package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class zo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lh80 f44696a;
    public final lh80 b;
    public final yo0 c;

    public zo0(lh80 lh80Var, lh80 lh80Var2, yo0 yo0Var) {
        this.f44696a = lh80Var;
        this.b = lh80Var2;
        this.c = yo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zo0)) {
            return false;
        }
        zo0 zo0Var = (zo0) obj;
        return this.f44696a.equals(zo0Var.f44696a) && this.b.equals(zo0Var.b) && this.c == zo0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f44696a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "AggregatorFilterItemPosition(innerPaddingValues=" + this.f44696a + ", outerPaddingValues=" + this.b + ", background=" + this.c + Separators.RPAREN;
    }
}
