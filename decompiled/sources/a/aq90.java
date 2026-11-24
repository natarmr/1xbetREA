package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class aq90 implements cq90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1287a;
    public final rqm b;

    public aq90(int i, rqm rqmVar) {
        this.f1287a = i;
        this.b = rqmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq90)) {
            return false;
        }
        aq90 aq90Var = (aq90) obj;
        return this.f1287a == aq90Var.f1287a && this.b.equals(aq90Var.b);
    }

    @Override // a.cq90
    public final Object getId() {
        return Integer.valueOf(this.f1287a);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f1287a) * 31);
    }

    public final String toString() {
        return "OptionUiModel(id=" + this.f1287a + ", model=" + this.b + Separators.RPAREN;
    }
}
