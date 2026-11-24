package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jip0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f16586a;
    public final String b;
    public final int c;
    public final int d;
    public final int e;
    public final String f;
    public final lmp0 g;
    public final String h;
    public final lmp0 i;
    public final String j;

    public jip0(int i, String str, int i2, int i3, int i4, String str2, lmp0 lmp0Var, String str3, lmp0 lmp0Var2, String str4) {
        brm0.B(str, str3, str4);
        this.f16586a = i;
        this.b = str;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = str2;
        this.g = lmp0Var;
        this.h = str3;
        this.i = lmp0Var2;
        this.j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jip0)) {
            return false;
        }
        jip0 jip0Var = (jip0) obj;
        return this.f16586a == jip0Var.f16586a && Intrinsics.d(this.b, jip0Var.b) && this.c == jip0Var.c && this.d == jip0Var.d && this.e == jip0Var.e && this.f.equals(jip0Var.f) && this.g.equals(jip0Var.g) && Intrinsics.d(this.h, jip0Var.h) && this.i.equals(jip0Var.i) && Intrinsics.d(this.j, jip0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ua80.b((this.g.hashCode() + ua80.b(twn.a(this.e, twn.a(this.d, twn.a(this.c, ua80.b(Integer.hashCode(this.f16586a) * 31, 31, this.b), 31), 31), 31), 31, this.f)) * 31, 31, this.h)) * 31);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f16586a, "TeamResultsModel(dateStart=", ", id=", this.b, ", score1=");
        axq.r(this.c, this.d, ", score2=", ", status=", sbR);
        kng0.w(this.e, ", stringStageTitle=", this.f, ", team1=", sbR);
        sbR.append(this.g);
        sbR.append(", team1Id=");
        sbR.append(this.h);
        sbR.append(", team2=");
        sbR.append(this.i);
        sbR.append(", team2Id=");
        sbR.append(this.j);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
