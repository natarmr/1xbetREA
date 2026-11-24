package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class yqe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43072a;
    public final String b;
    public final int c;
    public final String d;
    public final long e;
    public final String f;
    public final int g;
    public final int h;
    public final String i;

    public yqe(int i, String str, int i2, String str2, long j, String str3, int i3, int i4, String str4) {
        cs0.x(str, str2, str3, str4);
        this.f43072a = i;
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
        if (!(obj instanceof yqe)) {
            return false;
        }
        yqe yqeVar = (yqe) obj;
        return this.f43072a == yqeVar.f43072a && Intrinsics.d(this.b, yqeVar.b) && this.c == yqeVar.c && Intrinsics.d(this.d, yqeVar.d) && this.e == yqeVar.e && Intrinsics.d(this.f, yqeVar.f) && this.g == yqeVar.g && this.h == yqeVar.h && Intrinsics.d(this.i, yqeVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + twn.a(this.h, twn.a(this.g, ua80.b(rw2.b(ua80.b(twn.a(this.c, ua80.b(Integer.hashCode(this.f43072a) * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31), 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f43072a, "CountryModel(id=", ", name=", this.b, ", phoneCode=");
        kng0.w(this.c, ", countryCode=", this.d, ", currencyId=", sbR);
        kng0.z(sbR, this.e, ", countryImage=", this.f);
        rw2.s(this.g, this.h, ", phoneMaskMinLength=", ", phoneMaskMaxLength=", sbR);
        return rw2.o(sbR, ", phoneMask=", this.i, Separators.RPAREN);
    }
}
