package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gq90 implements nq90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11722a;
    public final boolean b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final cm90 g;
    public final String h;

    public gq90(int i, long j, cm90 cm90Var, String str, String str2, String str3, String str4, boolean z) {
        str.getClass();
        str3.getClass();
        cm90Var.getClass();
        str4.getClass();
        this.f11722a = i;
        this.b = z;
        this.c = str;
        this.d = j;
        this.e = str2;
        this.f = str3;
        this.g = cm90Var;
        this.h = str4;
    }

    @Override // a.nq90
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gq90)) {
            return false;
        }
        gq90 gq90Var = (gq90) obj;
        return this.f11722a == gq90Var.f11722a && this.b == gq90Var.b && Intrinsics.d(this.c, gq90Var.c) && this.d == gq90Var.d && this.e.equals(gq90Var.e) && Intrinsics.d(this.f, gq90Var.f) && Intrinsics.d(this.g, gq90Var.g) && Intrinsics.d(this.h, gq90Var.h);
    }

    @Override // a.nq90
    public final int getId() {
        return this.f11722a;
    }

    @Override // a.nq90
    public final String getTitle() {
        return this.c;
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + ua80.b(ua80.b(rw2.b(ua80.b(brm0.e(Integer.hashCode(this.f11722a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = h97.l(this.f11722a, "Country(id=", ", isRecommend=", ", title=", this.b);
        defpackage.c.i(sbL, this.d, this.c, ", currencyId=");
        f140.v(sbL, ", imageUrl=", this.e, ", phoneCode=", this.f);
        sbL.append(", phoneMask=");
        sbL.append(this.g);
        sbL.append(", countryCode=");
        sbL.append(this.h);
        sbL.append(Separators.RPAREN);
        return sbL.toString();
    }
}
