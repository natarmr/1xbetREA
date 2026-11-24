package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class gif0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11343a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public gif0(String str, String str2, boolean z, boolean z2) {
        this.f11343a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public static gif0 a(gif0 gif0Var, String str, boolean z, boolean z2, int i) {
        String str2 = gif0Var.f11343a;
        if ((i & 2) != 0) {
            str = gif0Var.b;
        }
        if ((i & 4) != 0) {
            z = gif0Var.c;
        }
        gif0Var.getClass();
        return new gif0(str2, str, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gif0)) {
            return false;
        }
        gif0 gif0Var = (gif0) obj;
        return this.f11343a.equals(gif0Var.f11343a) && this.b.equals(gif0Var.b) && this.c == gif0Var.c && this.d == gif0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(this.f11343a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", isErrorAnimate=", Separators.RPAREN, b1j.n("RemovePinCodeState(currentPicCode=", this.f11343a, ", enteredPinCode=", this.b, ", isError="), this.c, this.d);
    }
}
