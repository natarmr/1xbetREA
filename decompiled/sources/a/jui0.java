package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jui0 implements gwi0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17155a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final aib0 f;

    public jui0(String str, boolean z, boolean z2, boolean z3, boolean z4, aib0 aib0Var) {
        this.f17155a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = aib0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jui0)) {
            return false;
        }
        jui0 jui0Var = (jui0) obj;
        return this.f17155a.equals(jui0Var.f17155a) && this.b == jui0Var.b && this.c == jui0Var.c && this.d == jui0Var.d && this.e == jui0Var.e && this.f == jui0Var.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(brm0.e(brm0.e(brm0.e(this.f17155a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("SettingBlock(description=", this.f17155a, ", isChecked=", this.b, ", isEnabled=");
        ua80.u(", lastItem=", ", firstItem=", sbU, this.c, this.d);
        sbU.append(this.e);
        sbU.append(", type=");
        sbU.append(this.f);
        sbU.append(Separators.RPAREN);
        return sbU.toString();
    }
}
