package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a1n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f78a;
    public final d280 b;
    public final int c;
    public final String d;
    public final String e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public a1n(String str, d280 d280Var, int i, String str2, String str3, String str4, boolean z, boolean z2, boolean z3) {
        brm0.B(str, str3, str4);
        this.f78a = str;
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
        if (!(obj instanceof a1n)) {
            return false;
        }
        a1n a1nVar = (a1n) obj;
        return Intrinsics.d(this.f78a, a1nVar.f78a) && Intrinsics.d(this.b, a1nVar.b) && this.c == a1nVar.c && this.d.equals(a1nVar.d) && Intrinsics.d(this.e, a1nVar.e) && Intrinsics.d(this.f, a1nVar.f) && this.g == a1nVar.g && this.h == a1nVar.h && this.i == a1nVar.i;
    }

    public final int hashCode() {
        int iHashCode = this.f78a.hashCode() * 31;
        d280 d280Var = this.b;
        return Boolean.hashCode(this.i) + brm0.e(brm0.e(ua80.b(ua80.b(ua80.b(twn.a(this.c, (iHashCode + (d280Var == null ? 0 : d280Var.hashCode())) * 31, 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("V2(opponentLabel=");
        sb.append(this.f78a);
        sb.append(", opponentIcon=");
        sb.append(this.b);
        sb.append(", redCardCounter=");
        kng0.w(this.c, ", gameScore=", this.d, ", setScore=", sb);
        f140.v(sb, this.e, ", resultScore=", this.f, ", resultScoreChanged=");
        ua80.u(", gameScoreChanged=", ", setScoreChanged=", sb, this.g, this.h);
        return rw2.p(sb, this.i, Separators.RPAREN);
    }
}
