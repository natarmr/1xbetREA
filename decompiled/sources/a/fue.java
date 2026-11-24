package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fue {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10157a;
    public final String b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final String h;
    public final String i;
    public final String j;
    public final yse k;
    public final cue l;
    public final int m;
    public final j0d n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;

    public fue(String str, String str2, int i, String str3, String str4, String str5, boolean z, String str6, String str7, String str8, yse yseVar, cue cueVar, int i2, j0d j0dVar, String str9, String str10, String str11, String str12, String str13) {
        ohs0.z(str, str2, str5, str6, str7);
        ohs0.z(str8, str10, str11, str12, str13);
        this.f10157a = str;
        this.b = str2;
        this.c = i;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = z;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = yseVar;
        this.l = cueVar;
        this.m = i2;
        this.n = j0dVar;
        this.o = str9;
        this.p = str10;
        this.q = str11;
        this.r = str12;
        this.s = str13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fue)) {
            return false;
        }
        fue fueVar = (fue) obj;
        return Intrinsics.d(this.f10157a, fueVar.f10157a) && Intrinsics.d(this.b, fueVar.b) && this.c == fueVar.c && this.d.equals(fueVar.d) && this.e.equals(fueVar.e) && Intrinsics.d(this.f, fueVar.f) && this.g == fueVar.g && Intrinsics.d(this.h, fueVar.h) && Intrinsics.d(this.i, fueVar.i) && Intrinsics.d(this.j, fueVar.j) && this.k.equals(fueVar.k) && this.l.equals(fueVar.l) && this.m == fueVar.m && this.n == fueVar.n && this.o.equals(fueVar.o) && Intrinsics.d(this.p, fueVar.p) && Intrinsics.d(this.q, fueVar.q) && Intrinsics.d(this.r, fueVar.r) && Intrinsics.d(this.s, fueVar.s);
    }

    public final int hashCode() {
        return this.s.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b((this.n.hashCode() + twn.a(this.m, (this.l.hashCode() + ((this.k.hashCode() + ua80.b(ua80.b(ua80.b(brm0.e(ua80.b(ua80.b(ua80.b(twn.a(this.c, ua80.b(this.f10157a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j)) * 31)) * 31, 31)) * 31, 31, this.o), 31, this.p), 31, this.q), 31, this.r);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CouponCardUiModel(caption=", this.f10157a, ", tagText=", this.b, ", tagColor=");
        kng0.w(this.c, ", title=", this.d, ", subTitle=", sbN);
        f140.v(sbN, this.e, ", error=", this.f, ", live=");
        f140.s(", marketHeader=", this.h, ", marketDescription=", sbN, this.g);
        f140.v(sbN, this.i, ", marketCoefficient=", this.j, ", scoreUiModel=");
        sbN.append(this.k);
        sbN.append(", teamsUiModel=");
        sbN.append(this.l);
        sbN.append(", marketStyle=");
        sbN.append(this.m);
        sbN.append(", coefficientState=");
        sbN.append(this.n);
        sbN.append(", sportIconUrl=");
        f140.v(sbN, this.o, ", liveTagText=", this.p, ", autoSubText=");
        f140.v(sbN, this.q, ", optionBetText=", this.r, ", eachWayText=");
        return axq.n(sbN, this.s, Separators.RPAREN);
    }
}
