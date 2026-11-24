package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class cmp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4618a;
    public final String b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;

    public cmp0(String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8) {
        list.getClass();
        this.f4618a = str;
        this.b = str2;
        this.c = list;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cmp0)) {
            return false;
        }
        cmp0 cmp0Var = (cmp0) obj;
        return this.f4618a.equals(cmp0Var.f4618a) && this.b.equals(cmp0Var.b) && Intrinsics.d(this.c, cmp0Var.c) && this.d.equals(cmp0Var.d) && this.e.equals(cmp0Var.e) && this.f.equals(cmp0Var.f) && this.g.equals(cmp0Var.g) && this.h.equals(cmp0Var.h) && this.i.equals(cmp0Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(dw9.a(ua80.b(this.f4618a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("TeamStatisticsModel(teamName=", this.f4618a, ", teamIcon=", this.b, ", teamMatches=");
        h97.y(", numberOfMatches=", this.d, ", numberOfWins=", sbN, this.c);
        f140.v(sbN, this.e, ", numberOfDraws=", this.f, ", numberOfLoses=");
        f140.v(sbN, this.g, ", goalDifference=", this.h, ", points=");
        return axq.n(sbN, this.i, Separators.RPAREN);
    }
}
