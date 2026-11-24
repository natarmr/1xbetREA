package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class g4p implements e5p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a2n f10678a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;

    public g4p(a2n a2nVar, boolean z, boolean z2, boolean z3) {
        this.f10678a = a2nVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = a2nVar.getKey();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4p)) {
            return false;
        }
        g4p g4pVar = (g4p) obj;
        return this.f10678a.equals(g4pVar.f10678a) && this.b == g4pVar.b && this.c == g4pVar.c && this.d == g4pVar.d;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(brm0.e(this.f10678a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FavoriteCategoryEventCardUiModel(eventCard=");
        sb.append(this.f10678a);
        sb.append(", startMargin=");
        sb.append(this.b);
        sb.append(", endMargin=");
        return ohs0.p(", supportRtl=", Separators.RPAREN, sb, this.c, this.d);
    }
}
