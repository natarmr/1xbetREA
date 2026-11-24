package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class k1v0 implements uqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17548a;
    public final int b;
    public final String c;
    public final boolean d;
    public final String e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public final String i;
    public final boolean j;

    public k1v0(String str, int i, String str2, boolean z, String str3, boolean z2, String str4, boolean z3, String str5, boolean z4) {
        this.f17548a = str;
        this.b = i;
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
        if (!(obj instanceof k1v0)) {
            return false;
        }
        k1v0 k1v0Var = (k1v0) obj;
        return this.f17548a.equals(k1v0Var.f17548a) && this.b == k1v0Var.b && this.c.equals(k1v0Var.c) && this.d == k1v0Var.d && this.e.equals(k1v0Var.e) && this.f == k1v0Var.f && this.g.equals(k1v0Var.g) && this.h == k1v0Var.h && this.i.equals(k1v0Var.i) && this.j == k1v0Var.j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.j) + ua80.b(brm0.e(ua80.b(brm0.e(ua80.b(brm0.e(ua80.b(twn.a(this.b, this.f17548a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "WeatherInfoUiModel(location=", this.f17548a, ", weatherIcon=", ", temperature=");
        brm0.C(this.c, ", hasTemperatureInfo=", ", windSpeed=", sbP, this.d);
        brm0.C(this.e, ", hasWindInfo=", ", pressure=", sbP, this.f);
        brm0.C(this.g, ", hasPressureInfo=", ", humidity=", sbP, this.h);
        return defpackage.c.c(this.i, ", hasHumidityInfo=", Separators.RPAREN, sbP, this.j);
    }
}
