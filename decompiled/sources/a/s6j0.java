package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class s6j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f31706a;
    public final boolean b;
    public final boolean c;

    public s6j0(boolean z, boolean z2, boolean z3) {
        this.f31706a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6j0)) {
            return false;
        }
        s6j0 s6j0Var = (s6j0) obj;
        return this.f31706a == s6j0Var.f31706a && this.b == s6j0Var.b && this.c == s6j0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + brm0.e(Boolean.hashCode(this.f31706a) * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(f140.q("SettingsPinCodeState(pinCodeEnabled=", ", fingerPrintEnabled=", ", fingerPrintAvailable=", this.f31706a, this.b), this.c, Separators.RPAREN);
    }
}
