package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class jv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17182a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final c6q0 f;

    public jv(boolean z, String str, String str2, boolean z2, boolean z3, c6q0 c6q0Var) {
        this.f17182a = z;
        this.b = str;
        this.c = str2;
        this.d = z2;
        this.e = z3;
        this.f = c6q0Var;
    }

    public static jv a(jv jvVar, boolean z, String str, String str2, boolean z2, boolean z3, c6q0 c6q0Var, int i) {
        if ((i & 1) != 0) {
            z = jvVar.f17182a;
        }
        boolean z4 = z;
        if ((i & 2) != 0) {
            str = jvVar.b;
        }
        String str3 = str;
        if ((i & 4) != 0) {
            str2 = jvVar.c;
        }
        String str4 = str2;
        if ((i & 8) != 0) {
            z2 = jvVar.d;
        }
        boolean z5 = z2;
        if ((i & 16) != 0) {
            z3 = jvVar.e;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            c6q0Var = jvVar.f;
        }
        jvVar.getClass();
        return new jv(z4, str3, str4, z5, z6, c6q0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jv)) {
            return false;
        }
        jv jvVar = (jv) obj;
        return this.f17182a == jvVar.f17182a && this.b.equals(jvVar.b) && this.c.equals(jvVar.c) && this.d == jvVar.d && this.e == jvVar.e && this.f.equals(jvVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + brm0.e(brm0.e(ua80.b(ua80.b(Boolean.hashCode(this.f17182a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("UiState(loading=", ", openButtonTitle=", this.b, this.f17182a, ", inputAuthenticatorCode=");
        brm0.C(this.c, ", enableConfirmButton=", ", networkConnected=", sbQ, this.d);
        sbQ.append(this.e);
        sbQ.append(", textFieldBasicUiModel=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
