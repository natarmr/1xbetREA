package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class tkt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34113a;
    public final String b;
    public final int c;
    public final String d;
    public final long e;
    public final String f;

    public tkt(String str, int i, String str2, String str3, int i2, long j) {
        brm0.B(str, str2, str3);
        this.f34113a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = j;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tkt)) {
            return false;
        }
        tkt tktVar = (tkt) obj;
        return this.f34113a == tktVar.f34113a && Intrinsics.d(this.b, tktVar.b) && this.c == tktVar.c && Intrinsics.d(this.d, tktVar.d) && this.e == tktVar.e && Intrinsics.d(this.f, tktVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + rw2.b(ua80.b(twn.a(this.c, ua80.b(Integer.hashCode(this.f34113a) * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f34113a, "GeoCountryPartModel(id=", ", name=", this.b, ", phoneCode=");
        kng0.w(this.c, ", countryCode=", this.d, ", currencyId=", sbR);
        kng0.z(sbR, this.e, ", countryImage=", this.f);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
