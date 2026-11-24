package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class aj0 implements gj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f951a;
    public final ti0 b;
    public final nw80 c;

    public aj0(String str, ti0 ti0Var, nw80 nw80Var) {
        this.f951a = str;
        this.b = ti0Var;
        this.c = nw80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aj0)) {
            return false;
        }
        aj0 aj0Var = (aj0) obj;
        return this.f951a.equals(aj0Var.f951a) && this.b.equals(aj0Var.b) && this.c == aj0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.f951a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "PromotionsCarouselModel(id=" + this.f951a + ", headerModel=" + this.b + ", partitionType=" + this.c + Separators.RPAREN;
    }
}
