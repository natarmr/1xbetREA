package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class oqe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f25683a;
    public final String b;
    public final int c;
    public final String d;
    public final long e;
    public final String f;
    public final int g;
    public final int h;
    public final String i;

    public oqe(int i, String str, int i2, String str2, long j, String str3, int i3, int i4, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f25683a = i;
        this.b = str;
        this.c = i2;
        this.d = str2;
        this.e = j;
        this.f = str3;
        this.g = i3;
        this.h = i4;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqe)) {
            return false;
        }
        oqe oqeVar = (oqe) obj;
        return this.f25683a == oqeVar.f25683a && Intrinsics.d(this.b, oqeVar.b) && this.c == oqeVar.c && Intrinsics.d(this.d, oqeVar.d) && this.e == oqeVar.e && Intrinsics.d(this.f, oqeVar.f) && this.g == oqeVar.g && this.h == oqeVar.h && Intrinsics.d(this.i, oqeVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + twn.a(this.h, twn.a(this.g, ua80.b(rw2.b(ua80.b(twn.a(this.c, ua80.b(Integer.hashCode(this.f25683a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f25683a, "CountryEntity(id=", ", name=", this.b, ", phoneCode=");
        kng0.w(this.c, ", countryCode=", this.d, ", currencyId=", sbR);
        kng0.z(sbR, this.e, ", countryImage=", this.f);
        rw2.s(this.g, this.h, ", phoneMaskMaxLength=", ", phoneMaskMinLength=", sbR);
        return rw2.o(sbR, ", phoneMask=", this.i, Separators.RPAREN);
    }
}
