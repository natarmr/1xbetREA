package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class jza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a570 f17401a;
    public final List b;
    public final double c;
    public final String d;
    public final double e;
    public final List f;
    public final double g;
    public final double h;
    public final double i;
    public final double j;
    public final long k;

    public jza(a570 a570Var, List list, double d, String str, double d2, List list2, double d3, double d4, double d5, double d6, long j) {
        list.getClass();
        str.getClass();
        list2.getClass();
        this.f17401a = a570Var;
        this.b = list;
        this.c = d;
        this.d = str;
        this.e = d2;
        this.f = list2;
        this.g = d3;
        this.h = d4;
        this.i = d5;
        this.j = d6;
        this.k = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jza)) {
            return false;
        }
        jza jzaVar = (jza) obj;
        return this.f17401a.equals(jzaVar.f17401a) && Intrinsics.d(this.b, jzaVar.b) && Double.compare(this.c, jzaVar.c) == 0 && Intrinsics.d(this.d, jzaVar.d) && Double.compare(this.e, jzaVar.e) == 0 && Intrinsics.d(this.f, jzaVar.f) && Double.compare(this.g, jzaVar.g) == 0 && Double.compare(this.h, jzaVar.h) == 0 && Double.compare(this.i, jzaVar.i) == 0 && Double.compare(this.j, jzaVar.j) == 0 && this.k == jzaVar.k;
    }

    public final int hashCode() {
        return Long.hashCode(this.k) + brm0.d(this.j, brm0.d(this.i, brm0.d(this.h, brm0.d(this.g, dw9.a(brm0.d(this.e, ua80.b(brm0.d(this.c, dw9.a(this.f17401a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31), 31, this.f), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CashbackModel(monthGame=");
        sb.append(this.f17401a);
        sb.append(", userGames=");
        sb.append(this.b);
        sb.append(", progress=");
        hne.w(sb, this.c, ", balanceInEuro=", this.d);
        ohs0.A(sb, this.e, ", balanceInCurrency=", ", userGamesPercentages=");
        sb.append(this.f);
        sb.append(", monthGamePercentage=");
        sb.append(this.g);
        ohs0.A(sb, this.h, ", betsInMonth=", ", limit=");
        sb.append(this.i);
        ohs0.A(sb, this.j, ", limitInEuro=", ", waitTimeSec=");
        return brm0.k(this.k, Separators.RPAREN, sb);
    }
}
