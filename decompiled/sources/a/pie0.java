package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class pie0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27039a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final int g;
    public final int h;
    public final lmp0 i;
    public final lmp0 j;

    public pie0(String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, lmp0 lmp0Var, lmp0 lmp0Var2) {
        cs0.x(str, str2, str3, str4);
        this.f27039a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = lmp0Var;
        this.j = lmp0Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pie0)) {
            return false;
        }
        pie0 pie0Var = (pie0) obj;
        return Intrinsics.d(this.f27039a, pie0Var.f27039a) && Intrinsics.d(this.b, pie0Var.b) && Intrinsics.d(this.c, pie0Var.c) && Intrinsics.d(this.d, pie0Var.d) && this.e.equals(pie0Var.e) && this.f == pie0Var.f && this.g == pie0Var.g && this.h == pie0Var.h && this.i.equals(pie0Var.i) && this.j.equals(pie0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + twn.a(this.h, twn.a(this.g, twn.a(this.f, ua80.b(ua80.b(ua80.b(ua80.b(this.f27039a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31), 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("RefereeCardLastGameCurrentModel(team1Name=", this.f27039a, ", team2Name=", this.b, ", team1Image=");
        f140.v(sbN, this.c, ", team2Image=", this.d, ", stringStageTitle=");
        twn.w(this.f, this.e, ", score1=", ", score2=", sbN);
        axq.r(this.g, this.h, ", dateStart=", ", statistics1=", sbN);
        sbN.append(this.i);
        sbN.append(", statistics2=");
        sbN.append(this.j);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
