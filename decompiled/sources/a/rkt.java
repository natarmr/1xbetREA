package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class rkt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f30664a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final boolean g;
    public final cm90 h;
    public final String i;

    public rkt(int i, long j, cm90 cm90Var, String str, String str2, String str3, String str4, String str5, boolean z) {
        str2.getClass();
        str3.getClass();
        cm90Var.getClass();
        this.f30664a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = str4;
        this.g = z;
        this.h = cm90Var;
        this.i = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rkt)) {
            return false;
        }
        rkt rktVar = (rkt) obj;
        return this.f30664a == rktVar.f30664a && this.b.equals(rktVar.b) && Intrinsics.d(this.c, rktVar.c) && Intrinsics.d(this.d, rktVar.d) && this.e == rktVar.e && this.f.equals(rktVar.f) && this.g == rktVar.g && Intrinsics.d(this.h, rktVar.h) && this.i.equals(rktVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + brm0.e(ua80.b(rw2.b(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f30664a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f30664a, "GeoCountryModel(id=", ", name=", this.b, ", phoneCode=");
        f140.v(sbR, this.c, ", countryCode=", this.d, ", currencyId=");
        kng0.z(sbR, this.e, ", flagUrl=", this.f);
        sbR.append(", top=");
        sbR.append(this.g);
        sbR.append(", phoneMask=");
        sbR.append(this.h);
        return rw2.o(sbR, ", text=", this.i, Separators.RPAREN);
    }
}
