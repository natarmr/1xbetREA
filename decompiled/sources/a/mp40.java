package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class mp40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22161a;
    public final boolean b;
    public final wui0 c;

    public mp40(String str, boolean z, wui0 wui0Var) {
        this.f22161a = str;
        this.b = z;
        this.c = wui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mp40)) {
            return false;
        }
        mp40 mp40Var = (mp40) obj;
        return this.f22161a.equals(mp40Var.f22161a) && this.b == mp40Var.b && this.c == mp40Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f22161a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("MoneyLimitValueRsUiModel(value=", this.f22161a, ", isSelected=", this.b, ", position=");
        sbU.append(this.c);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
