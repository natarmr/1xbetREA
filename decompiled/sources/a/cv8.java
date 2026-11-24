package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cv8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lh80 f5019a;
    public final lh80 b;
    public final bv8 c;

    public cv8(lh80 lh80Var, lh80 lh80Var2, bv8 bv8Var) {
        this.f5019a = lh80Var;
        this.b = lh80Var2;
        this.c = bv8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cv8)) {
            return false;
        }
        cv8 cv8Var = (cv8) obj;
        return this.f5019a.equals(cv8Var.f5019a) && this.b.equals(cv8Var.b) && this.c == cv8Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f5019a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "BrandGamesFilterItemPosition(innerPaddingValues=" + this.f5019a + ", outerPaddingValues=" + this.b + ", background=" + this.c + Separators.RPAREN;
    }
}
