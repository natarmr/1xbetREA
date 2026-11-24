package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes2.dex */
public final class e9i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7422a;
    public final boolean b;
    public final wui0 c;

    public e9i0(String str, boolean z, wui0 wui0Var) {
        this.f7422a = str;
        this.b = z;
        this.c = wui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9i0)) {
            return false;
        }
        e9i0 e9i0Var = (e9i0) obj;
        return this.f7422a.equals(e9i0Var.f7422a) && this.b == e9i0Var.b && this.c == e9i0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + brm0.e(this.f7422a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("SelfExclusionValueRsUiModel(title=", this.f7422a, ", isSelected=", this.b, ", position=");
        sbU.append(this.c);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
