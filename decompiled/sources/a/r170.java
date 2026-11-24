package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class r170 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29664a;
    public final gy30 b;
    public final boolean c;

    public r170(int i, gy30 gy30Var, boolean z) {
        this.f29664a = i;
        this.b = gy30Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r170)) {
            return false;
        }
        r170 r170Var = (r170) obj;
        return this.f29664a == r170Var.f29664a && this.b.equals(r170Var.b) && this.c == r170Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.f29664a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneXGamesPromoItemUiModel(id=");
        sb.append(this.f29664a);
        sb.append(", style=");
        sb.append(this.b);
        sb.append(", underMaintenance=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
