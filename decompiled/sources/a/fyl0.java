package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fyl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oab f10363a;
    public final q9b b;
    public final iyl0 c;
    public final boolean d;

    public fyl0(oab oabVar, q9b q9bVar, iyl0 iyl0Var, boolean z) {
        this.f10363a = oabVar;
        this.b = q9bVar;
        this.c = iyl0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fyl0)) {
            return false;
        }
        fyl0 fyl0Var = (fyl0) obj;
        return this.f10363a == fyl0Var.f10363a && this.b == fyl0Var.b && this.c.equals(fyl0Var.c) && this.d == fyl0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f10363a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StageCellModel(type=" + this.f10363a + ", iconType=" + this.b + ", value=" + this.c + ", isOffset=" + this.d + Separators.RPAREN;
    }
}
