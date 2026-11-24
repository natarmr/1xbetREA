package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18838a;
    public final String b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public kt(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.f18838a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = z2;
        this.f = z3;
    }

    public static kt a(kt ktVar, String str, String str2, String str3, boolean z, int i) {
        if ((i & 1) != 0) {
            str = ktVar.f18838a;
        }
        String str4 = str;
        if ((i & 2) != 0) {
            str2 = ktVar.b;
        }
        String str5 = str2;
        boolean z2 = (i & 4) != 0 ? ktVar.c : true;
        if ((i & 8) != 0) {
            str3 = ktVar.d;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            z = ktVar.e;
        }
        boolean z3 = z;
        boolean z4 = (i & 32) != 0 ? ktVar.f : false;
        ktVar.getClass();
        str6.getClass();
        return new kt(str4, str5, str6, z2, z3, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kt)) {
            return false;
        }
        kt ktVar = (kt) obj;
        return this.f18838a.equals(ktVar.f18838a) && this.b.equals(ktVar.b) && this.c == ktVar.c && this.d.equals(ktVar.d) && this.e == ktVar.e && this.f == ktVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(ua80.b(brm0.e(ua80.b(this.f18838a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("AddPinCodeState(firstEnteredPinCode=", this.f18838a, ", secondEnteredPinCode=", this.b, ", firstPinCodeEntered=");
        f140.s(", errorMessage=", this.d, ", showShakeAnimation=", sbN, this.c);
        return ohs0.p(", showProgress=", Separators.RPAREN, sbN, this.e, this.f);
    }
}
