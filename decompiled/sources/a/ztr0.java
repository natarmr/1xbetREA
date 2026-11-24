package a;

import android.gov.nist.core.Separators;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ztr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final he80 f44976a;
    public final List b;
    public final int c;
    public final int d;

    public ztr0(he80 he80Var, List list, int i, int i2) {
        this.f44976a = he80Var;
        this.b = list;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztr0)) {
            return false;
        }
        ztr0 ztr0Var = (ztr0) obj;
        return this.f44976a.equals(ztr0Var.f44976a) && this.b.equals(ztr0Var.b) && this.c == ztr0Var.c && this.d == ztr0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + twn.a(this.c, dw9.a(this.f44976a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TotoOutcomesSelectionState(header=");
        sb.append(this.f44976a);
        sb.append(", outcomesBlocksList=");
        sb.append(this.b);
        sb.append(", allOutcomesCount=");
        return w6x.o(this.c, this.d, ", selectedOutcomesCount=", Separators.RPAREN, sb);
    }
}
