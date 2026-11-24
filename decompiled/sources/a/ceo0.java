package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ceo0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4222a;
    public final String b;

    public ceo0(int i, String str) {
        this.f4222a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ceo0)) {
            return false;
        }
        ceo0 ceo0Var = (ceo0) obj;
        return this.f4222a == ceo0Var.f4222a && this.b.equals(ceo0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f4222a) * 31);
    }

    public final String toString() {
        return b1j.k("TabTopPlayerColumnUiModel(id=", kcm0.a(this.f4222a), ", shortTitle=", this.b, Separators.RPAREN);
    }
}
