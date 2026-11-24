package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class n4i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22900a;
    public final int b;
    public final String c;
    public final int d;
    public final String e;
    public final int f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public n4i0(String str, int i, String str2, int i2, String str3, int i3, String str4, String str5, String str6, String str7, String str8) {
        ohs0.z(str, str2, str3, str4, str5);
        brm0.B(str6, str7, str8);
        this.f22900a = str;
        this.b = i;
        this.c = str2;
        this.d = i2;
        this.e = str3;
        this.f = i3;
        this.g = str4;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4i0)) {
            return false;
        }
        n4i0 n4i0Var = (n4i0) obj;
        return Intrinsics.d(this.f22900a, n4i0Var.f22900a) && this.b == n4i0Var.b && Intrinsics.d(this.c, n4i0Var.c) && this.d == n4i0Var.d && Intrinsics.d(this.e, n4i0Var.e) && this.f == n4i0Var.f && Intrinsics.d(this.g, n4i0Var.g) && Intrinsics.d(this.h, n4i0Var.h) && Intrinsics.d(this.i, n4i0Var.i) && Intrinsics.d(this.j, n4i0Var.j) && Intrinsics.d(this.k, n4i0Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(twn.a(this.f, ua80.b(twn.a(this.d, ua80.b(twn.a(this.b, this.f22900a.hashCode() * 31, 31), 31, this.c), 31), 31, this.e), 31), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "SelectedPlayerAimUiModel(numberOfHeadShots=", this.f22900a, ", headShotsPercentage=", ", numberOfBodyShots=");
        twn.w(this.d, this.c, ", bodyShotsPercentage=", ", numberOfLegShots=", sbP);
        twn.w(this.f, this.e, ", legShotsPercentage=", ", partOfBodyTitle=", sbP);
        f140.v(sbP, this.g, ", headTitle=", this.h, ", bodyTitle=");
        f140.v(sbP, this.i, ", legTitle=", this.j, ", hitsTitle=");
        return axq.n(sbP, this.k, Separators.RPAREN);
    }
}
