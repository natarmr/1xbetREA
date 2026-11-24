package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class q070 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27883a;
    public final ijl b;
    public final jjl c;

    public q070(boolean z, ijl ijlVar, jjl jjlVar) {
        this.f27883a = z;
        this.b = ijlVar;
        this.c = jjlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q070)) {
            return false;
        }
        q070 q070Var = (q070) obj;
        return this.f27883a == q070Var.f27883a && this.b == q070Var.b && this.c.equals(q070Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.f27883a) * 31)) * 31);
    }

    public final String toString() {
        return "OneXGamesPromoAccountSelectionUiModel(authorized=" + this.f27883a + ", dsAccountSelectionStyle=" + this.b + ", dsAccountSelectionUiModel=" + this.c + Separators.RPAREN;
    }
}
