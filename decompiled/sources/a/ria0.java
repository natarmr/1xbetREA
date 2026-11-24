package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ria0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30532a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public ria0(boolean z, boolean z2, String str, int i) {
        this.f30532a = i;
        this.b = str;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ria0)) {
            return false;
        }
        ria0 ria0Var = (ria0) obj;
        return this.f30532a == ria0Var.f30532a && this.b.equals(ria0Var.b) && this.c == ria0Var.c && this.d == ria0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(Integer.hashCode(this.f30532a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", isSelected=", Separators.RPAREN, vqd.r(this.f30532a, "PlayersStatisticFilterItemUiModel(id=", ", title=", this.b, ", showSeparator="), this.c, this.d);
    }
}
