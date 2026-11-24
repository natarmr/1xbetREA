package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class fzl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w88 f10413a;
    public final int b;
    public final long c;

    public fzl0(w88 w88Var, int i, long j) {
        this.f10413a = w88Var;
        this.b = i;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fzl0)) {
            return false;
        }
        fzl0 fzl0Var = (fzl0) obj;
        return this.f10413a.equals(fzl0Var.f10413a) && this.b == fzl0Var.b && this.c == fzl0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + twn.a(this.b, this.f10413a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StageItemModel(blockPrize=");
        sb.append(this.f10413a);
        sb.append(", crmNecessaryPoints=");
        sb.append(this.b);
        sb.append(", crmStageId=");
        return brm0.k(this.c, Separators.RPAREN, sb);
    }
}
