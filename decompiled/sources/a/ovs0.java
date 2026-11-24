package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ovs0 implements rvs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25940a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;

    public ovs0(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        this.f25940a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = str4;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ovs0)) {
            return false;
        }
        ovs0 ovs0Var = (ovs0) obj;
        return this.f25940a.equals(ovs0Var.f25940a) && this.b.equals(ovs0Var.b) && this.c.equals(ovs0Var.c) && this.d == ovs0Var.d && this.e == ovs0Var.e && this.f.equals(ovs0Var.f) && this.g == ovs0Var.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ua80.b(brm0.e(brm0.e(ua80.b(ua80.b(this.f25940a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("NewPlaceException(tokenAnswer=", this.f25940a, ", question=", this.b, ", userId=");
        brm0.C(this.c, ", hasAuthenticator=", ", smsSendConfirmation=", sbN, this.d);
        f140.s(", verificationQuestionType=", this.f, ", confirmationCodeNotRequired=", sbN, this.e);
        return rw2.p(sbN, this.g, Separators.RPAREN);
    }
}
