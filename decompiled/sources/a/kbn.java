package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kbn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18022a;
    public final String b;
    public final String c;
    public final String d;
    public final cm90 e;
    public final boolean f;

    public kbn(int i, String str, String str2, String str3, cm90 cm90Var, boolean z) {
        str3.getClass();
        cm90Var.getClass();
        this.f18022a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = cm90Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbn)) {
            return false;
        }
        kbn kbnVar = (kbn) obj;
        return this.f18022a == kbnVar.f18022a && this.b.equals(kbnVar.b) && this.c.equals(kbnVar.c) && Intrinsics.d(this.d, kbnVar.d) && Intrinsics.d(this.e, kbnVar.e) && this.f == kbnVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f18022a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f18022a, "DualPhoneCountry(countryId=", ", name=", this.b, ", countryImage=");
        f140.v(sbR, this.c, ", telCode=", this.d, ", phoneMask=");
        sbR.append(this.e);
        sbR.append(", flagVisible=");
        sbR.append(this.f);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
