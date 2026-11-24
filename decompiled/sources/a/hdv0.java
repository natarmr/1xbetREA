package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hdv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12890a;
    public final boolean b;
    public final fdv0 c;

    public hdv0(int i, boolean z, fdv0 fdv0Var) {
        this.f12890a = i;
        this.b = z;
        this.c = fdv0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hdv0)) {
            return false;
        }
        hdv0 hdv0Var = (hdv0) obj;
        return this.f12890a == hdv0Var.f12890a && this.b == hdv0Var.b && this.c.equals(hdv0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(Integer.hashCode(this.f12890a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbL = h97.l(this.f12890a, "WidgetButtonUiModel(icon=", ", badgeEnable=", ", action=", this.b);
        sbL.append(this.c);
        sbL.append(Separators.RPAREN);
        return sbL.toString();
    }
}
