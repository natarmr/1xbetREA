package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ejf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f7907a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public ejf0(String str, boolean z, boolean z2, boolean z3) {
        this.f7907a = z;
        this.b = str;
        this.c = z2;
        this.d = z3;
    }

    public static ejf0 a(ejf0 ejf0Var, boolean z, String str, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = ejf0Var.f7907a;
        }
        if ((i & 2) != 0) {
            str = ejf0Var.b;
        }
        if ((i & 4) != 0) {
            z2 = ejf0Var.c;
        }
        if ((i & 8) != 0) {
            z3 = ejf0Var.d;
        }
        ejf0Var.getClass();
        return new ejf0(str, z, z2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejf0)) {
            return false;
        }
        ejf0 ejf0Var = (ejf0) obj;
        return this.f7907a == ejf0Var.f7907a && this.b.equals(ejf0Var.b) && this.c == ejf0Var.c && this.d == ejf0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(Boolean.hashCode(this.f7907a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", networkConnected=", Separators.RPAREN, axq.q("UiState(loadingVisible=", ", removeAuthenticatorCode=", this.b, this.f7907a, ", enableConfirmButton="), this.c, this.d);
    }
}
