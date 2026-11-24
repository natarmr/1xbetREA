package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class aoa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1191a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;
    public final int g;
    public final boolean h;
    public final String i;
    public final String j;
    public final List k;
    public final List l;

    public aoa0(String str, String str2, int i, int i2, String str3, String str4, int i3, boolean z, String str5, String str6, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f1191a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
        this.f = str4;
        this.g = i3;
        this.h = z;
        this.i = str5;
        this.j = str6;
        this.k = list;
        this.l = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoa0)) {
            return false;
        }
        aoa0 aoa0Var = (aoa0) obj;
        return this.f1191a.equals(aoa0Var.f1191a) && this.b.equals(aoa0Var.b) && this.c == aoa0Var.c && this.d == aoa0Var.d && this.e.equals(aoa0Var.e) && this.f.equals(aoa0Var.f) && this.g == aoa0Var.g && this.h == aoa0Var.h && this.i.equals(aoa0Var.i) && this.j.equals(aoa0Var.j) && Intrinsics.d(this.k, aoa0Var.k) && Intrinsics.d(this.l, aoa0Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + dw9.a(ua80.b(ua80.b(brm0.e(twn.a(this.g, ua80.b(ua80.b(twn.a(this.d, twn.a(this.c, ua80.b(this.f1191a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i), 31, this.j), 31, this.k);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PointByPointsModel(teamOne=", this.f1191a, ", teamTwo=", this.b, ", scoreOne=");
        axq.r(this.c, this.d, ", scoreTwo=", ", subScoreOne=", sbN);
        f140.v(sbN, this.e, ", subScoreTwo=", this.f, ", server=");
        brm0.w(this.g, ", isLostServer=", ", advScoreOne=", sbN, this.h);
        f140.v(sbN, this.i, ", advScoreTwo=", this.j, ", points=");
        return kng0.n(", tieBreak=", Separators.RPAREN, sbN, this.k, this.l);
    }
}
