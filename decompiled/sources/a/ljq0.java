package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class ljq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20165a;
    public final String b;
    public final boolean c;
    public final wui0 d;

    public ljq0(wui0 wui0Var, String str, String str2, boolean z) {
        this.f20165a = str;
        this.b = str2;
        this.c = z;
        this.d = wui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljq0)) {
            return false;
        }
        ljq0 ljq0Var = (ljq0) obj;
        return this.f20165a.equals(ljq0Var.f20165a) && this.b.equals(ljq0Var.b) && this.c == ljq0Var.c && this.d == ljq0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(ua80.b(this.f20165a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TimeLimitValueRsUiModel(title=", this.f20165a, ", value=", this.b, ", isSelected=");
        sbN.append(this.c);
        sbN.append(", position=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
