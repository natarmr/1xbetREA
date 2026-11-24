package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ej0 implements gj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7883a;
    public final ti0 b;
    public final pc0 c;

    public ej0(String str, ti0 ti0Var, pc0 pc0Var) {
        this.f7883a = str;
        this.b = ti0Var;
        this.c = pc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej0)) {
            return false;
        }
        ej0 ej0Var = (ej0) obj;
        return this.f7883a.equals(ej0Var.f7883a) && this.b.equals(ej0Var.b) && this.c == ej0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f7883a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "UserTournamentsModel(id=" + this.f7883a + ", headerModel=" + this.b + ", layoutType=" + this.c + Separators.RPAREN;
    }
}
