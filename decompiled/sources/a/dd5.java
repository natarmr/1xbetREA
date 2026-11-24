package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class dd5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5880a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;

    public dd5(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.f5880a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5)) {
            return false;
        }
        dd5 dd5Var = (dd5) obj;
        return this.f5880a.equals(dd5Var.f5880a) && this.b.equals(dd5Var.b) && this.c.equals(dd5Var.c) && this.d.equals(dd5Var.d) && this.e.equals(dd5Var.e) && this.f.equals(dd5Var.f) && this.g.equals(dd5Var.g) && this.h.equals(dd5Var.h) && this.i.equals(dd5Var.i) && this.j.equals(dd5Var.j) && this.k.equals(dd5Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f5880a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("BackgroundResourcesUrnModel(smallVideo=", this.f5880a, ", smallPreview=", this.b, ", smallImage=");
        f140.v(sbN, this.c, ", mediumVideo=", this.d, ", mediumPreview=");
        f140.v(sbN, this.e, ", mediumImage=", this.f, ", largeVideo=");
        f140.v(sbN, this.g, ", largePreview=", this.h, ", largeImage=");
        f140.v(sbN, this.i, ", logo=", this.j, ", partners=");
        return axq.n(sbN, this.k, Separators.RPAREN);
    }
}
