package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class uvc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36341a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final bp5 h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public uvc(int i, String str, String str2, String str3, String str4, String str5, String str6, bp5 bp5Var, String str7, String str8, String str9, String str10) {
        str7.getClass();
        str8.getClass();
        this.f36341a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = bp5Var;
        this.i = str7;
        this.j = str8;
        this.k = str9;
        this.l = str10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uvc)) {
            return false;
        }
        uvc uvcVar = (uvc) obj;
        return this.f36341a == uvcVar.f36341a && this.b.equals(uvcVar.b) && this.c.equals(uvcVar.c) && this.d.equals(uvcVar.d) && this.e.equals(uvcVar.e) && this.f.equals(uvcVar.f) && this.g.equals(uvcVar.g) && this.h == uvcVar.h && Intrinsics.d(this.i, uvcVar.i) && Intrinsics.d(this.j, uvcVar.j) && this.k.equals(uvcVar.k) && this.l.equals(uvcVar.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + ua80.b(ua80.b(ua80.b((this.h.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f36341a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g)) * 31, 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f36341a, "CmsBannerModel(bannerId=", ", mainImageUrl=", this.b, ", previewImageUrl=");
        f140.v(sbR, this.c, ", bigSquareImageUrl=", this.d, ", verticalImageUrl=");
        f140.v(sbR, this.e, ", horizontalImageUrl=", this.f, ", squareImageUrl=");
        sbR.append(this.g);
        sbR.append(", type=");
        sbR.append(this.h);
        sbR.append(", header=");
        f140.v(sbR, this.i, ", subHeader=", this.j, ", content=");
        return ua80.m(sbR, this.k, ", deeplink=", this.l, Separators.RPAREN);
    }
}
