package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n1v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22771a;
    public final Integer b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final String i;
    public final boolean j;

    public n1v0(String str, Integer num, String str2, boolean z, String str3, boolean z2, String str4, boolean z3, String str5, boolean z4) {
        this.f22771a = str;
        this.b = num;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = z2;
        this.g = str4;
        this.h = z3;
        this.i = str5;
        this.j = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1v0)) {
            return false;
        }
        n1v0 n1v0Var = (n1v0) obj;
        return this.f22771a.equals(n1v0Var.f22771a) && Intrinsics.d(this.b, n1v0Var.b) && this.c.equals(n1v0Var.c) && this.d == n1v0Var.d && this.e.equals(n1v0Var.e) && this.f == n1v0Var.f && this.g.equals(n1v0Var.g) && this.h == n1v0Var.h && this.i.equals(n1v0Var.i) && this.j == n1v0Var.j;
    }

    public final int hashCode() {
        int iHashCode = this.f22771a.hashCode() * 31;
        Integer num = this.b;
        return Boolean.hashCode(this.j) + ua80.b(brm0.e(ua80.b(brm0.e(ua80.b(brm0.e(ua80.b((iHashCode + (num == null ? 0 : num.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbP = axq.p(this.b, "WeatherInfoUiModel(location=", this.f22771a, ", weatherIcon=", ", temperature=");
        brm0.C(this.c, ", hasTemperatureInfo=", ", windSpeed=", sbP, this.d);
        brm0.C(this.e, ", hasWindInfo=", ", pressure=", sbP, this.f);
        brm0.C(this.g, ", hasPressureInfo=", ", humidity=", sbP, this.h);
        return defpackage.c.c(this.i, ", hasHumidityInfo=", Separators.RPAREN, sbP, this.j);
    }
}
