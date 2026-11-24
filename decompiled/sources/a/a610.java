package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a610 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f297a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final List f;
    public final d310 g;
    public final float h;
    public final List i;

    public a610(int i, int i2, int i3, int i4, int i5, List list, d310 d310Var, float f, List list2) {
        list.getClass();
        list2.getClass();
        this.f297a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = list;
        this.g = d310Var;
        this.h = f;
        this.i = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a610)) {
            return false;
        }
        a610 a610Var = (a610) obj;
        return this.f297a == a610Var.f297a && this.b == a610Var.b && this.c == a610Var.c && this.d == a610Var.d && this.e == a610Var.e && Intrinsics.d(this.f, a610Var.f) && this.g == a610Var.g && Float.compare(this.h, a610Var.h) == 0 && Intrinsics.d(this.i, a610Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + defpackage.c.a((this.g.hashCode() + dw9.a(twn.a(this.e, twn.a(this.d, twn.a(this.c, twn.a(this.b, Integer.hashCode(this.f297a) * 31, 31), 31), 31), 31), 31, this.f)) * 31, this.h, 31);
    }

    public final String toString() {
        StringBuilder sbT = dw9.t("LolTeamStatisticModel(kills=", this.f297a, ", towers=", ", inhibitors=", this.b);
        axq.r(this.c, this.d, ", barons=", ", dragons=", sbT);
        ohs0.v(this.e, ", dragonsDeadType=", ", side=", sbT, this.f);
        sbT.append(this.g);
        sbT.append(", goldCount=");
        sbT.append(this.h);
        sbT.append(", goldHistoryList=");
        return dw9.r(sbT, this.i, Separators.RPAREN);
    }
}
