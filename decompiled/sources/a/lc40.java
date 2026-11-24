package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lc40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xb40 f19783a;
    public final rqm b;
    public final boolean c;

    public lc40(xb40 xb40Var, rqm rqmVar, boolean z) {
        this.f19783a = xb40Var;
        this.b = rqmVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lc40)) {
            return false;
        }
        lc40 lc40Var = (lc40) obj;
        return this.f19783a == lc40Var.f19783a && this.b.equals(lc40Var.b) && this.c == lc40Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f19783a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetaHeroesRoleItemsUIModel(type=");
        sb.append(this.f19783a);
        sb.append(", settingCell=");
        sb.append(this.b);
        sb.append(", lastItem=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
