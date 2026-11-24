package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class mjq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21909a;
    public final String b;
    public final boolean c;
    public final wui0 d;

    public mjq0(wui0 wui0Var, String str, String str2, boolean z) {
        this.f21909a = str;
        this.b = str2;
        this.c = z;
        this.d = wui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjq0)) {
            return false;
        }
        mjq0 mjq0Var = (mjq0) obj;
        return this.f21909a.equals(mjq0Var.f21909a) && this.b.equals(mjq0Var.b) && this.c == mjq0Var.c && this.d == mjq0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(ua80.b(this.f21909a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TimeLimitValueUiModel(title=", this.f21909a, ", value=", this.b, ", isSelected=");
        sbN.append(this.c);
        sbN.append(", position=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
