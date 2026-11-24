package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class kk30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18418a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public kk30(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f18418a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk30)) {
            return false;
        }
        kk30 kk30Var = (kk30) obj;
        return this.f18418a == kk30Var.f18418a && this.b.equals(kk30Var.b) && this.c.equals(kk30Var.c) && this.d.equals(kk30Var.d) && this.e.equals(kk30Var.e) && this.f.equals(kk30Var.f) && this.g.equals(kk30Var.g) && this.h.equals(kk30Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f18418a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f18418a, "MedalStatisticModel(rank=", ", teamId=", this.b, ", image=");
        f140.v(sbR, this.c, ", title=", this.d, ", goldMedals=");
        f140.v(sbR, this.e, ", silverMedals=", this.f, ", bronzeMedals=");
        return ua80.m(sbR, this.g, ", totalMedals=", this.h, Separators.RPAREN);
    }
}
