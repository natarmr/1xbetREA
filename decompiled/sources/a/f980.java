package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class f980 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9144a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public f980(String str, String str2, String str3, String str4, String str5, String str6, boolean z) {
        this.f9144a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f980)) {
            return false;
        }
        f980 f980Var = (f980) obj;
        return this.f9144a.equals(f980Var.f9144a) && this.b == f980Var.b && this.c.equals(f980Var.c) && this.d.equals(f980Var.d) && this.e.equals(f980Var.e) && this.f.equals(f980Var.f) && this.g.equals(f980Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(brm0.e(this.f9144a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, true);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("PhoneFieldUiModel(countryImageUrl=", this.f9144a, ", isCountryImageVisible=", this.b, ", countryCode=");
        f140.v(sbU, this.c, ", phoneMask=", this.d, ", phonePlaceholder=");
        f140.v(sbU, this.e, ", phoneError=", this.f, ", phoneCodeEnabled=true, phoneBody=");
        return axq.n(sbU, this.g, Separators.RPAREN);
    }
}
