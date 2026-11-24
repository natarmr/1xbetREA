package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class dj0 implements gj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6161a;
    public final ti0 b;
    public final pc0 c;

    public dj0(String str, ti0 ti0Var, pc0 pc0Var) {
        this.f6161a = str;
        this.b = ti0Var;
        this.c = pc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj0)) {
            return false;
        }
        dj0 dj0Var = (dj0) obj;
        return this.f6161a.equals(dj0Var.f6161a) && this.b.equals(dj0Var.b) && this.c == dj0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f6161a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TournamentsMonthModel(id=" + this.f6161a + ", headerModel=" + this.b + ", layoutType=" + this.c + Separators.RPAREN;
    }
}
