package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class upq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36079a;
    public final int b;
    public final long c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final double k;
    public final List l;

    public upq0(int i, int i2, long j, String str, long j2, String str2, String str3, String str4, String str5, int i3, double d, List list) {
        list.getClass();
        this.f36079a = i;
        this.b = i2;
        this.c = j;
        this.d = str;
        this.e = j2;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = i3;
        this.k = d;
        this.l = list;
    }

    public static upq0 a(upq0 upq0Var, ArrayList arrayList) {
        return new upq0(upq0Var.f36079a, upq0Var.b, upq0Var.c, upq0Var.d, upq0Var.e, upq0Var.f, upq0Var.g, upq0Var.h, upq0Var.i, upq0Var.j, upq0Var.k, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upq0)) {
            return false;
        }
        upq0 upq0Var = (upq0) obj;
        return this.f36079a == upq0Var.f36079a && this.b == upq0Var.b && this.c == upq0Var.c && this.d.equals(upq0Var.d) && this.e == upq0Var.e && this.f.equals(upq0Var.f) && this.g.equals(upq0Var.g) && this.h.equals(upq0Var.h) && this.i.equals(upq0Var.i) && this.j == upq0Var.j && Double.compare(this.k, upq0Var.k) == 0 && Intrinsics.d(this.l, upq0Var.l);
    }

    public final int hashCode() {
        return this.l.hashCode() + brm0.d(this.k, twn.a(this.j, ua80.b(ua80.b(ua80.b(ua80.b(rw2.b(ua80.b(rw2.b(twn.a(this.b, Integer.hashCode(this.f36079a) * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31), 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("TirageGameModel(number=", this.f36079a, ", period=", ", sportId=", this.b);
        kng0.z(sbT, this.c, ", score=", this.d);
        kng0.A(sbT, ", startDate=", this.e, ", firstOpponent=");
        f140.v(sbT, this.f, ", secondOpponent=", this.g, ", firstOpponentLogoUrl=");
        f140.v(sbT, this.h, ", secondOpponentLogoUrl=", this.i, ", eventResults=");
        sbT.append(this.j);
        sbT.append(", total=");
        sbT.append(this.k);
        return ohs0.s(sbT, ", betOutcomeModelList=", this.l, Separators.RPAREN);
    }
}
