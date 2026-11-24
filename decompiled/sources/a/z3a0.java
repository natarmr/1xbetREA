package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z3a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43710a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final bre f;
    public final String g;
    public final List h;
    public final boolean i;
    public final String j;

    public z3a0(String str, String str2, int i, int i2, String str3, bre breVar, String str4, List list, boolean z, String str5) {
        str5.getClass();
        this.f43710a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
        this.f = breVar;
        this.g = str4;
        this.h = list;
        this.i = z;
        this.j = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3a0)) {
            return false;
        }
        z3a0 z3a0Var = (z3a0) obj;
        return this.f43710a.equals(z3a0Var.f43710a) && this.b.equals(z3a0Var.b) && this.c == z3a0Var.c && this.d == z3a0Var.d && this.e.equals(z3a0Var.e) && this.f.equals(z3a0Var.f) && this.g.equals(z3a0Var.g) && this.h.equals(z3a0Var.h) && this.i == z3a0Var.i && Intrinsics.d(this.j, z3a0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + brm0.e(dw9.a(ua80.b((this.f.hashCode() + ua80.b(twn.a(this.d, twn.a(this.c, ua80.b(this.f43710a.hashCode() * 31, 31, this.b), 31), 31), 31, this.e)) * 31, 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("PlayerHeatMapUiModel(id=", this.f43710a, ", name=", this.b, ", translationId=");
        axq.r(this.c, this.d, ", number=", ", shortName=", sbN);
        sbN.append(this.e);
        sbN.append(", country=");
        sbN.append(this.f);
        sbN.append(", image=");
        cs0.y(this.g, ", points=", ", checked=", sbN, this.h);
        return twn.q(", nameWithNumber=", this.j, Separators.RPAREN, sbN, this.i);
    }
}
