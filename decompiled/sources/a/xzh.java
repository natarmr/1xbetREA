package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
public final class xzh implements a0i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f41753a;
    public final String b;
    public final String c;
    public final o0x d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;
    public final int j;
    public final String k;
    public final boolean l;
    public final String m;
    public final a4x n;

    public xzh(String str, String str2, String str3, n0x n0xVar, String str4, String str5, String str6, String str7, int i, int i2, String str8, boolean z, String str9, i4 i4Var) {
        ohs0.z(str, str2, str3, str6, str8);
        str9.getClass();
        i4Var.getClass();
        this.f41753a = str;
        this.b = str2;
        this.c = str3;
        this.d = n0xVar;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = i;
        this.j = i2;
        this.k = str8;
        this.l = z;
        this.m = str9;
        this.n = i4Var;
        if (i4Var.size() == 2) {
            return;
        }
        jf4.o("Failed requirement.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xzh)) {
            return false;
        }
        xzh xzhVar = (xzh) obj;
        return Intrinsics.d(this.f41753a, xzhVar.f41753a) && Intrinsics.d(this.b, xzhVar.b) && Intrinsics.d(this.c, xzhVar.c) && Intrinsics.d(this.d, xzhVar.d) && Intrinsics.d(this.e, xzhVar.e) && Intrinsics.d(this.f, xzhVar.f) && Intrinsics.d(this.g, xzhVar.g) && this.h.equals(xzhVar.h) && this.i == xzhVar.i && this.j == xzhVar.j && Intrinsics.d(this.k, xzhVar.k) && this.l == xzhVar.l && Intrinsics.d(this.m, xzhVar.m) && Intrinsics.d(this.n, xzhVar.n);
    }

    public final int hashCode() {
        int iA = twn.a(R.drawable.ic_glyph_chevron_right_small, ua80.b(ua80.b(this.f41753a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        o0x o0xVar = this.d;
        int iA2 = twn.a(R.drawable.ic_glyph_favourite_active, (iA + (o0xVar == null ? 0 : o0xVar.hashCode())) * 31, 31);
        String str = this.e;
        int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return this.n.hashCode() + ua80.b(brm0.e(ua80.b(twn.a(this.j, twn.a(this.i, ua80.b(ua80.b((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31), 31), 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Content(header=", this.f41753a, ", title=", this.b, ", subtitle=");
        twn.w(R.drawable.ic_glyph_chevron_right_small, this.c, ", infoIconResId=", ", levelImageLink=", sbN);
        sbN.append(this.d);
        sbN.append(", levelImagePlaceholderResId=");
        sbN.append(R.drawable.ic_glyph_favourite_active);
        sbN.append(", cashback=");
        f140.v(sbN, this.e, ", coef=", this.f, ", progressText=");
        f140.v(sbN, this.g, ", maxProgressText=", this.h, ", progress=");
        axq.r(this.i, this.j, ", maxProgress=", ", buttonText=", sbN);
        brm0.C(this.k, ", isLastLevel=", ", maxLevelText=", sbN, this.l);
        sbN.append(this.m);
        sbN.append(", backgroundGradientColors=");
        sbN.append(this.n);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
