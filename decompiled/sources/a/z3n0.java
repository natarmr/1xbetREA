package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class z3n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43729a;
    public final String b;

    public z3n0(String str, String str2) {
        this.f43729a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3n0)) {
            return false;
        }
        z3n0 z3n0Var = (z3n0) obj;
        return this.f43729a.equals(z3n0Var.f43729a) && this.b.equals(z3n0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f43729a.hashCode() * 31);
    }

    public final String toString() {
        return b1j.k("SubTeamModel(image=", this.f43729a, ", title=", this.b, Separators.RPAREN);
    }
}
