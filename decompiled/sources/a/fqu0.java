package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fqu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0g0 f9993a;
    public final j0g0 b;
    public final j0g0 c;

    public fqu0(j0g0 j0g0Var, j0g0 j0g0Var2, j0g0 j0g0Var3) {
        this.f9993a = j0g0Var;
        this.b = j0g0Var2;
        this.c = j0g0Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fqu0)) {
            return false;
        }
        fqu0 fqu0Var = (fqu0) obj;
        return this.f9993a.equals(fqu0Var.f9993a) && this.b.equals(fqu0Var.b) && this.c.equals(fqu0Var.c);
    }

    public final int hashCode() {
        return j0g0.b(this.c.f15681a) + twn.c(j0g0.b(this.f9993a.f15681a) * 31, 31, this.b.f15681a);
    }

    public final String toString() {
        return "VirtualGameCategoryScenarioModel(topDisciplines=" + this.f9993a + ", topChamps=" + this.b + ", liveTopEvents=" + this.c + Separators.RPAREN;
    }
}
