package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class xs5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f41399a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public xs5(int i, String str, String str2, String str3, String str4, boolean z) {
        this.f41399a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs5)) {
            return false;
        }
        xs5 xs5Var = (xs5) obj;
        return this.f41399a == xs5Var.f41399a && this.b.equals(xs5Var.b) && this.c.equals(xs5Var.c) && this.d.equals(xs5Var.d) && this.e.equals(xs5Var.e) && this.f == xs5Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f41399a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f41399a, "BannerTypeModel(typeId=", ", typeName=", this.b, ", imageBack=");
        f140.v(sbR, this.c, ", imageFront=", this.d, ", imageMiddle=");
        return defpackage.c.c(this.e, ", popular=", Separators.RPAREN, sbR, this.f);
    }
}
