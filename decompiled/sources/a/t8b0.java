package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class t8b0 implements x8b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jkm f33505a;
    public final boolean b;
    public final boolean c;

    public t8b0(jkm jkmVar, boolean z, boolean z2) {
        this.f33505a = jkmVar;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8b0)) {
            return false;
        }
        t8b0 t8b0Var = (t8b0) obj;
        return this.f33505a.equals(t8b0Var.f33505a) && this.b == t8b0Var.b && this.c == t8b0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(this.f33505a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(lottieConfig=");
        sb.append(this.f33505a);
        sb.append(", emptyGamesEvents=");
        sb.append(this.b);
        sb.append(", underMaintenance=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
