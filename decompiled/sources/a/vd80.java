package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class vd80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be80 f37219a;
    public final td80 b;
    public final int c;
    public final List d;

    public vd80(be80 be80Var, td80 td80Var, int i, List list) {
        this.f37219a = be80Var;
        this.b = td80Var;
        this.c = i;
        this.d = list;
    }

    public static vd80 a(vd80 vd80Var, be80 be80Var, int i, ArrayList arrayList) {
        td80 td80Var = vd80Var.b;
        vd80Var.getClass();
        return new vd80(be80Var, td80Var, i, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd80)) {
            return false;
        }
        vd80 vd80Var = (vd80) obj;
        return this.f37219a == vd80Var.f37219a && this.b == vd80Var.b && this.c == vd80Var.c && this.d.equals(vd80Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c, (this.b.hashCode() + (this.f37219a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "OutcomesBlockModel(outcomesCheckBoxState=" + this.f37219a + ", outcomeType=" + this.b + ", selectedOutcomesCount=" + this.c + ", outcomesChipsList=" + this.d + Separators.RPAREN;
    }
}
