package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class lm5 implements pm5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ql5 f20280a;
    public final ke b;
    public final boolean c;

    public lm5(ke keVar, ql5 ql5Var, boolean z) {
        this.f20280a = ql5Var;
        this.b = keVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm5)) {
            return false;
        }
        lm5 lm5Var = (lm5) obj;
        return this.f20280a.equals(lm5Var.f20280a) && this.b.equals(lm5Var.b) && this.c == lm5Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.f20280a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(balance=");
        sb.append(this.f20280a);
        sb.append(", accountInfo=");
        sb.append(this.b);
        sb.append(", changeBalanceAvailable=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
