package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wws0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39900a;
    public final d280 b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public wws0(String str, d280 d280Var, int i, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        brm0.B(str, str3, str4);
        this.f39900a = str;
        this.b = d280Var;
        this.c = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        this.h = z2;
        this.i = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wws0)) {
            return false;
        }
        wws0 wws0Var = (wws0) obj;
        return Intrinsics.d(this.f39900a, wws0Var.f39900a) && Intrinsics.d(this.b, wws0Var.b) && this.c == wws0Var.c && this.d.equals(wws0Var.d) && Intrinsics.d(this.e, wws0Var.e) && Intrinsics.d(this.f, wws0Var.f) && this.g == wws0Var.g && this.h == wws0Var.h && this.i == wws0Var.i;
    }

    public final int hashCode() {
        int iHashCode = this.f39900a.hashCode() * 31;
        d280 d280Var = this.b;
        return Boolean.hashCode(this.i) + brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(twn.a(this.c, (iHashCode + (d280Var == null ? 0 : d280Var.hashCode())) * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V2(opponentLabel=");
        sb.append(this.f39900a);
        sb.append(", opponentIcon=");
        sb.append(this.b);
        sb.append(", redCardCounter=");
        kng0.w(this.c, ", gameScore=", this.d, ", setScore=", sb);
        f140.v(sb, this.e, ", resultScore=", this.f, ", resultScoreChanged=");
        ua80.u(", gameScoreChanged=", ", setScoreChanged=", sb, this.g, this.h);
        return rw2.p(sb, this.i, Separators.RPAREN);
    }
}
