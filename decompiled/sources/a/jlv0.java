package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class jlv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b9a0 f16737a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final double h;
    public final double i;
    public final double j;
    public final double k;
    public final double l;
    public final int m;
    public final String n;
    public final String o;

    static {
        b9a0 b9a0Var = b9a0.g;
    }

    public jlv0(b9a0 b9a0Var, String str, String str2, String str3, int i, int i2, int i3, double d, double d2, double d3, double d4, double d5, int i4, String str4, String str5) {
        b9a0Var.getClass();
        this.f16737a = b9a0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = d;
        this.i = d2;
        this.j = d3;
        this.k = d4;
        this.l = d5;
        this.m = i4;
        this.n = str4;
        this.o = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlv0)) {
            return false;
        }
        jlv0 jlv0Var = (jlv0) obj;
        return Intrinsics.d(this.f16737a, jlv0Var.f16737a) && this.b.equals(jlv0Var.b) && this.c.equals(jlv0Var.c) && this.d.equals(jlv0Var.d) && this.e == jlv0Var.e && this.f == jlv0Var.f && this.g == jlv0Var.g && Double.compare(this.h, jlv0Var.h) == 0 && Double.compare(this.i, jlv0Var.i) == 0 && Double.compare(this.j, jlv0Var.j) == 0 && Double.compare(this.k, jlv0Var.k) == 0 && Double.compare(this.l, jlv0Var.l) == 0 && this.m == jlv0Var.m && this.n.equals(jlv0Var.n) && this.o.equals(jlv0Var.o);
    }

    public final int hashCode() {
        return this.o.hashCode() + ua80.b(twn.a(this.m, brm0.d(this.l, brm0.d(this.k, brm0.d(this.j, brm0.d(this.i, brm0.d(this.h, twn.a(this.g, twn.a(this.f, twn.a(this.e, ua80.b(ua80.b(ua80.b(this.f16737a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WinterGameResultModel(player=");
        sb.append(this.f16737a);
        sb.append(", position=");
        sb.append(this.b);
        sb.append(", totalTime=");
        f140.v(sb, this.c, ", diffTime=", this.d, ", shooting1=");
        axq.r(this.e, this.f, ", shooting2=", ", diffCircle=", sb);
        sb.append(this.g);
        sb.append(", totalScore=");
        sb.append(this.h);
        ohs0.A(sb, this.i, ", run1Meters=", ", run2Meters=");
        sb.append(this.j);
        ohs0.A(sb, this.k, ", score1=", ", score2=");
        rz4.w(sb, this.l, ", jumps=", this.m);
        f140.v(sb, ", run1Time=", this.n, ", run2Time=", this.o);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
