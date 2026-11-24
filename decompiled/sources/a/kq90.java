package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class kq90 implements nq90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18711a;
    public final boolean b;
    public final String c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final cm90 h;
    public final String i;

    public kq90(int i, long j, cm90 cm90Var, String str, String str2, String str3, String str4, String str5, boolean z) {
        str2.getClass();
        str4.getClass();
        cm90Var.getClass();
        str5.getClass();
        this.f18711a = i;
        this.b = z;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = str3;
        this.g = str4;
        this.h = cm90Var;
        this.i = str5;
    }

    @Override // a.nq90
    public final boolean a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kq90)) {
            return false;
        }
        kq90 kq90Var = (kq90) obj;
        return this.f18711a == kq90Var.f18711a && this.b == kq90Var.b && this.c.equals(kq90Var.c) && Intrinsics.d(this.d, kq90Var.d) && this.e == kq90Var.e && this.f.equals(kq90Var.f) && Intrinsics.d(this.g, kq90Var.g) && Intrinsics.d(this.h, kq90Var.h) && Intrinsics.d(this.i, kq90Var.i);
    }

    @Override // a.nq90
    public final int getId() {
        return this.f18711a;
    }

    @Override // a.nq90
    public final String getTitle() {
        return this.c;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ua80.b(ua80.b(rw2.b(ua80.b(ua80.b(brm0.e(Integer.hashCode(this.f18711a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31);
    }

    public final String toString() {
        StringBuilder sbL = h97.l(this.f18711a, "Phone(id=", ", isRecommend=", ", title=", this.b);
        f140.v(sbL, this.c, ", countryName=", this.d, ", currencyId=");
        kng0.z(sbL, this.e, ", imageUrl=", this.f);
        sbL.append(", phoneCode=");
        sbL.append(this.g);
        sbL.append(", phoneMask=");
        sbL.append(this.h);
        return rw2.o(sbL, ", countryCode=", this.i, Separators.RPAREN);
    }
}
