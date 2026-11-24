package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class a980 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f465a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public a980(int i, String str, String str2, String str3, String str4, boolean z) {
        brm0.B(str2, str3, str4);
        this.f465a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a980)) {
            return false;
        }
        a980 a980Var = (a980) obj;
        return this.f465a == a980Var.f465a && this.b.equals(a980Var.b) && Intrinsics.d(this.c, a980Var.c) && Intrinsics.d(this.d, a980Var.d) && Intrinsics.d(this.e, a980Var.e) && this.f == a980Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f465a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f465a, "CountryStateModel(countryId=", ", flagUrl=", this.b, ", phoneCode=");
        f140.v(sbR, this.c, ", rawPhoneMask=", this.d, ", phoneMask=");
        return defpackage.c.c(this.e, ", isCountryAllowed=", Separators.RPAREN, sbR, this.f);
    }
}
