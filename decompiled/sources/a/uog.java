package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class uog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36012a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;
    public final String g;
    public final String h;
    public final byte i;
    public final String j;
    public final int k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final List p;
    public final String q;

    /* JADX WARN: Multi-variable type inference failed */
    public uog(int i, String str, String str2, String str3, String str4, boolean z, String str5, String str6, int i2, String str7, int i3, String str8, String str9, String str10, String str11, List list, String str12) {
        ohs0.z(str, str4, str9, str10, str11);
        list.getClass();
        this.f36012a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
        this.g = str5;
        this.h = str6;
        this.i = i2;
        this.j = str7;
        this.k = i3;
        this.l = str8;
        this.m = str9;
        this.n = str10;
        this.o = str11;
        this.p = list;
        this.q = str12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uog)) {
            return false;
        }
        uog uogVar = (uog) obj;
        return this.f36012a == uogVar.f36012a && Intrinsics.d(this.b, uogVar.b) && this.c.equals(uogVar.c) && this.d.equals(uogVar.d) && Intrinsics.d(this.e, uogVar.e) && this.f == uogVar.f && this.g.equals(uogVar.g) && this.h.equals(uogVar.h) && this.i == uogVar.i && this.j.equals(uogVar.j) && this.k == uogVar.k && this.l.equals(uogVar.l) && Intrinsics.d(this.m, uogVar.m) && Intrinsics.d(this.n, uogVar.n) && Intrinsics.d(this.o, uogVar.o) && Intrinsics.d(this.p, uogVar.p) && this.q.equals(uogVar.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + dw9.a(ua80.b(ua80.b(ua80.b(ua80.b(twn.a(this.k, ua80.b(twn.a(this.i, ua80.b(ua80.b(brm0.e(ua80.b(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f36012a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31), 31, this.j), 31), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f36012a, "CyberGameBannerModel(bannerId=", ", title=", this.b, ", description=");
        f140.v(sbR, this.c, ", ruleDescription=", this.d, ", image=");
        brm0.C(this.e, ", action=", ", deepLink=", sbR, this.f);
        f140.v(sbR, this.g, ", siteLink=", this.h, ", actionType=");
        kng0.w(this.i, ", translationId=", this.j, ", lotteryId=", sbR);
        kng0.w(this.k, ", smallImage=", this.l, ", squareImage=", sbR);
        f140.v(sbR, this.m, ", verticalImage=", this.n, ", horizontalImage=");
        cs0.y(this.o, ", types=", ", info=", sbR, this.p);
        return axq.n(sbR, this.q, Separators.RPAREN);
    }
}
