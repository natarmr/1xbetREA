package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class t3q implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f33281a;
    public final String b;
    public final boolean c;
    public final long d;
    public final String e;
    public final boolean f;
    public final int g;
    public final int h;
    public final boolean i;

    public t3q(long j, String str, boolean z, long j2, String str2, boolean z2, int i, int i2, boolean z3) {
        str.getClass();
        this.f33281a = j;
        this.b = str;
        this.c = z;
        this.d = j2;
        this.e = str2;
        this.f = z2;
        this.g = i;
        this.h = i2;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3q)) {
            return false;
        }
        t3q t3qVar = (t3q) obj;
        return this.f33281a == t3qVar.f33281a && Intrinsics.d(this.b, t3qVar.b) && this.c == t3qVar.c && this.d == t3qVar.d && this.e.equals(t3qVar.e) && this.f == t3qVar.f && this.g == t3qVar.g && this.h == t3qVar.h && this.i == t3qVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + twn.a(this.h, twn.a(this.g, brm0.e(ua80.b(rw2.b(brm0.e(ua80.b(Long.hashCode(this.f33281a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f33281a, "FilterSportsItemUiModel(id=", ", name=", this.b);
        rz4.A(sbO, ", isCyber=", this.c, ", subSportId=");
        kng0.z(sbO, this.d, ", imageUrl=", this.e);
        cs0.v(this.g, ", expanded=", ", totalChamps=", sbO, this.f);
        dw9.v(this.h, ", selectedChamps=", ", selectedSport=", sbO, this.i);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
