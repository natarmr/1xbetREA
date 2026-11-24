package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public final class clp implements qlp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4571a;
    public final long b;
    public final int c;
    public boolean d = false;
    public final aj00 e;
    public final int f;

    public clp(String str, long j, int i, aj00 aj00Var, int i2) {
        this.f4571a = str;
        this.b = j;
        this.c = i;
        this.e = aj00Var;
        this.f = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clp)) {
            return false;
        }
        clp clpVar = (clp) obj;
        return this.f4571a.equals(clpVar.f4571a) && this.b == clpVar.b && this.c == clpVar.c && this.d == clpVar.d && this.e.equals(clpVar.e) && this.f == clpVar.f;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof clp) && (p6t0Var2 instanceof clp)) {
            return ((clp) p6t0Var).e.equals(((clp) p6t0Var2).e);
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + ((this.e.hashCode() + brm0.e(twn.a(this.c, brm0.e(twn.a(0, rw2.b(ua80.b(Long.hashCode(-2L) * 31, 31, this.f4571a), 31, this.b), 31), 31, true), 31), 31, this.d)) * 31);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof clp) && (p6t0Var2 instanceof clp)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            k9x.G(linkedHashSet, new blp(((clp) p6t0Var).c), new blp(((clp) p6t0Var2).c));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        String strE = ua80.e(this.c, "GamesCount(value=", Separators.RPAREN);
        boolean z = this.d;
        StringBuilder sbO = f140.o(this.b, "FeedsChampLiveExpressSubItem(id=-2, title=", this.f4571a, ", sportId=");
        w6x.z(", subSportId=0, live=true, gamesCount=", strE, ", lastInGroup=", sbO, z);
        sbO.append(", expressType=");
        sbO.append(this.e);
        sbO.append(", expressIconRes=");
        sbO.append(this.f);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
