package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class bws0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3342a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;
    public final boolean f;

    public bws0(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        this.f3342a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = z2;
        this.f = z3;
    }

    public static bws0 a(bws0 bws0Var, boolean z, String str, String str2, String str3, boolean z2, boolean z3, int i) {
        if ((i & 1) != 0) {
            z = bws0Var.f3342a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            str = bws0Var.b;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = bws0Var.c;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = bws0Var.d;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            z2 = bws0Var.e;
        }
        boolean z5 = z2;
        if ((i & 32) != 0) {
            z3 = bws0Var.f;
        }
        bws0Var.getClass();
        str6.getClass();
        return new bws0(str4, str5, str6, z4, z5, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bws0)) {
            return false;
        }
        bws0 bws0Var = (bws0) obj;
        return this.f3342a == bws0Var.f3342a && this.b.equals(bws0Var.b) && this.c.equals(bws0Var.c) && this.d.equals(bws0Var.d) && this.e == bws0Var.e && this.f == bws0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(ua80.b(ua80.b(ua80.b(Boolean.hashCode(this.f3342a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("UiState(loadingVisible=", ", authenticatorButtonTitle=", this.b, this.f3342a, ", inputAuthenticatorCode=");
        f140.v(sbQ, this.c, ", inputErrorMessage=", this.d, ", enableConfirmButton=");
        return ohs0.p(", networkConnected=", Separators.RPAREN, sbQ, this.e, this.f);
    }
}
