package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class lr5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20512a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final boolean j;
    public final oo5 k;
    public final or5 l;
    public final String m;
    public final String n;

    static {
        bj5 bj5Var = oo5.b;
        new lr5(0, "", "", "", "", "", "", "", new nr5(kr5.B), 256);
    }

    public lr5(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, oo5 oo5Var, or5 or5Var, String str9, String str10) {
        ohs0.z(str, str2, str3, str4, str5);
        this.f20512a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = z;
        this.k = oo5Var;
        this.l = or5Var;
        this.m = str9;
        this.n = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr5)) {
            return false;
        }
        lr5 lr5Var = (lr5) obj;
        return this.f20512a == lr5Var.f20512a && Intrinsics.d(this.b, lr5Var.b) && Intrinsics.d(this.c, lr5Var.c) && Intrinsics.d(this.d, lr5Var.d) && Intrinsics.d(this.e, lr5Var.e) && Intrinsics.d(this.f, lr5Var.f) && Intrinsics.d(this.g, lr5Var.g) && Intrinsics.d(this.h, lr5Var.h) && Intrinsics.d(this.i, lr5Var.i) && this.j == lr5Var.j && this.k == lr5Var.k && Intrinsics.d(this.l, lr5Var.l) && Intrinsics.d(this.m, lr5Var.m) && Intrinsics.d(this.n, lr5Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + ua80.b((this.l.hashCode() + ((this.k.hashCode() + brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f20512a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31)) * 31, 31, this.m);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f20512a, "BannerModelWrapper(bannerId=", ", squareImageUrl=", this.b, ", verticalImageUrl=");
        f140.v(sbR, this.c, ", horizontalImage=", this.d, ", title=");
        f140.v(sbR, this.e, ", subtitle=", this.f, ", content=");
        f140.v(sbR, this.g, ", deeplink=", this.h, ", siteLink=");
        brm0.C(this.i, ", action=", ", actionType=", sbR, this.j);
        sbR.append(this.k);
        sbR.append(", origin=");
        sbR.append(this.l);
        sbR.append(", translateId=");
        return ua80.m(sbR, this.m, ", info=", this.n, Separators.RPAREN);
    }

    public /* synthetic */ lr5(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, or5 or5Var, int i2) {
        this(i, str, str2, str3, str4, str5, str6, str7, "", false, oo5.ACTION_INFO, or5Var, "", "");
    }
}
