package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class lel0 {
    public static final kel0 Companion = new kel0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f19909a;
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
    public final String l;
    public final String m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;

    public /* synthetic */ lel0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        if (262143 != (i & 262143)) {
            m2x.I(i, 262143, jel0.f16380a.getDescriptor());
            throw null;
        }
        this.f19909a = str;
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
        this.l = str12;
        this.m = str13;
        this.n = str14;
        this.o = str15;
        this.p = str16;
        this.q = str17;
        this.r = str18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lel0)) {
            return false;
        }
        lel0 lel0Var = (lel0) obj;
        return Intrinsics.d(this.f19909a, lel0Var.f19909a) && Intrinsics.d(this.b, lel0Var.b) && Intrinsics.d(this.c, lel0Var.c) && Intrinsics.d(this.d, lel0Var.d) && Intrinsics.d(this.e, lel0Var.e) && Intrinsics.d(this.f, lel0Var.f) && Intrinsics.d(this.g, lel0Var.g) && Intrinsics.d(this.h, lel0Var.h) && Intrinsics.d(this.i, lel0Var.i) && Intrinsics.d(this.j, lel0Var.j) && Intrinsics.d(this.k, lel0Var.k) && Intrinsics.d(this.l, lel0Var.l) && Intrinsics.d(this.m, lel0Var.m) && Intrinsics.d(this.n, lel0Var.n) && Intrinsics.d(this.o, lel0Var.o) && Intrinsics.d(this.p, lel0Var.p) && Intrinsics.d(this.q, lel0Var.q) && Intrinsics.d(this.r, lel0Var.r);
    }

    public final int hashCode() {
        return this.r.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f19909a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o), 31, this.p), 31, this.q);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("SportImageModel(imageSmall=", this.f19909a, ", imagePopular=", this.b, ", background=");
        f140.v(sbN, this.c, ", backgroundTablet=", this.d, ", backgroundChampionsDefault=");
        f140.v(sbN, this.e, ", backgroundChampionsTabletDefault=", this.f, ", backgroundChampionsHeaderDefault=");
        f140.v(sbN, this.g, ", backgroundChampionsHeaderTabletDefault=", this.h, ", gameBackground=");
        f140.v(sbN, this.i, ", champSmall=", this.j, ", feedImageVertical=");
        f140.v(sbN, this.k, ", feedImageHorizontal=", this.l, ", feedImageSquare=");
        f140.v(sbN, this.m, ", disciplineIcon3D=", this.n, ", esportsEventFocusDisciplineHeader=");
        f140.v(sbN, this.o, ", esportsHeaderFocusDisciplineHeader=", this.p, ", defaultOpponentHeader=");
        return ua80.m(sbN, this.q, ", defaultOpponentHeaderTablet=", this.r, Separators.RPAREN);
    }

    public lel0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        this.f19909a = str;
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
        this.l = str12;
        this.m = str13;
        this.n = str14;
        this.o = str15;
        this.p = str16;
        this.q = str17;
        this.r = str18;
    }
}
