package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class pkh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bmh0 f27134a;
    public final x6q0 b;
    public final xx30 c;
    public final boolean d;

    public pkh0(bmh0 bmh0Var, x6q0 x6q0Var, xx30 xx30Var, boolean z) {
        this.f27134a = bmh0Var;
        this.b = x6q0Var;
        this.c = xx30Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pkh0)) {
            return false;
        }
        pkh0 pkh0Var = (pkh0) obj;
        return this.f27134a.equals(pkh0Var.f27134a) && this.b.equals(pkh0Var.b) && this.c == pkh0Var.c && this.d == pkh0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.f27134a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SecretQuestionCellItemUiModel(secretQuestionItem=" + this.f27134a + ", textFieldBasicMultilineUiModel=" + this.b + ", itemPosition=" + this.c + ", isFocus=" + this.d + Separators.RPAREN;
    }
}
