package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class v28 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f36671a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public v28(String str, boolean z, boolean z2, boolean z3) {
        this.f36671a = z;
        this.b = str;
        this.c = z2;
        this.d = z3;
    }

    public static v28 a(v28 v28Var, String str, boolean z, boolean z2, int i) {
        boolean z3 = v28Var.f36671a;
        if ((i & 2) != 0) {
            str = v28Var.b;
        }
        if ((i & 4) != 0) {
            z = v28Var.c;
        }
        if ((i & 8) != 0) {
            z2 = v28Var.d;
        }
        v28Var.getClass();
        return new v28(str, z3, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v28)) {
            return false;
        }
        v28 v28Var = (v28) obj;
        return this.f36671a == v28Var.f36671a && this.b.equals(v28Var.b) && this.c == v28Var.c && this.d == v28Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(Boolean.hashCode(this.f36671a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", networkConnected=", Separators.RPAREN, axq.q("UiState(moreInfoVisible=", ", inputCode=", this.b, this.f36671a, ", enableButton="), this.c, this.d);
    }
}
