package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class n7b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9l0 f23033a;
    public final dr5 b;
    public final oz60 c;
    public final td00 d;

    public n7b0(b9l0 b9l0Var, dr5 dr5Var, oz60 oz60Var, td00 td00Var) {
        this.f23033a = b9l0Var;
        this.b = dr5Var;
        this.c = oz60Var;
        this.d = td00Var;
    }

    public static n7b0 a(n7b0 n7b0Var, b9l0 b9l0Var, dr5 dr5Var, oz60 oz60Var, td00 td00Var, int i) {
        if ((i & 1) != 0) {
            b9l0Var = n7b0Var.f23033a;
        }
        if ((i & 2) != 0) {
            dr5Var = n7b0Var.b;
        }
        if ((i & 4) != 0) {
            oz60Var = n7b0Var.c;
        }
        if ((i & 8) != 0) {
            td00Var = n7b0Var.d;
        }
        n7b0Var.getClass();
        return new n7b0(b9l0Var, dr5Var, oz60Var, td00Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n7b0)) {
            return false;
        }
        n7b0 n7b0Var = (n7b0) obj;
        return this.f23033a.equals(n7b0Var.f23033a) && this.b.equals(n7b0Var.b) && this.c.equals(n7b0Var.c) && this.d.equals(n7b0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f23033a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PopularClassicHeadState(sportFilterState=" + this.f23033a + ", bannersState=" + this.b + ", oneXGamesState=" + this.c + ", specialEventsState=" + this.d + Separators.RPAREN;
    }
}
