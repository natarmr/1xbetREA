package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class iid0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14825a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public iid0(String str, String str2, boolean z, boolean z2) {
        this.f14825a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public static iid0 a(iid0 iid0Var, String str, boolean z, boolean z2, int i) {
        String str2 = iid0Var.f14825a;
        if ((i & 2) != 0) {
            str = iid0Var.b;
        }
        if ((i & 4) != 0) {
            z = iid0Var.c;
        }
        if ((i & 8) != 0) {
            z2 = iid0Var.d;
        }
        iid0Var.getClass();
        str.getClass();
        return new iid0(str2, str, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iid0)) {
            return false;
        }
        iid0 iid0Var = (iid0) obj;
        return this.f14825a.equals(iid0Var.f14825a) && this.b.equals(iid0Var.b) && this.c == iid0Var.c && this.d == iid0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(ua80.b(this.f14825a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return ohs0.p(", networkConnected=", Separators.RPAREN, b1j.n("UiState(question=", this.f14825a, ", answer=", this.b, ", confirmButtonEnabled="), this.c, this.d);
    }
}
