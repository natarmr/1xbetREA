package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class cws {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5095a;
    public final v5l0 b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final d9a0 i;
    public final d9a0 j;
    public final List k;
    public final List l;
    public final String m;
    public final String n;
    public final String o;
    public final boolean p;

    public cws(int i, v5l0 v5l0Var, String str, String str2, int i2, String str3, String str4, String str5, d9a0 d9a0Var, d9a0 d9a0Var2, lc00 lc00Var, lc00 lc00Var2, String str6, String str7, String str8, boolean z) {
        lc00Var.getClass();
        lc00Var2.getClass();
        str8.getClass();
        this.f5095a = i;
        this.b = v5l0Var;
        this.c = str;
        this.d = str2;
        this.e = i2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = d9a0Var;
        this.j = d9a0Var2;
        this.k = lc00Var;
        this.l = lc00Var2;
        this.m = str6;
        this.n = str7;
        this.o = str8;
        this.p = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cws)) {
            return false;
        }
        cws cwsVar = (cws) obj;
        return this.f5095a == cwsVar.f5095a && this.b == cwsVar.b && this.c.equals(cwsVar.c) && this.d.equals(cwsVar.d) && this.e == cwsVar.e && this.f.equals(cwsVar.f) && this.g.equals(cwsVar.g) && this.h.equals(cwsVar.h) && this.i.equals(cwsVar.i) && this.j.equals(cwsVar.j) && Intrinsics.d(this.k, cwsVar.k) && Intrinsics.d(this.l, cwsVar.l) && this.m.equals(cwsVar.m) && this.n.equals(cwsVar.n) && Intrinsics.d(this.o, cwsVar.o) && this.p == cwsVar.p;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.p) + ua80.b(ua80.b(ua80.b(dw9.a(dw9.a((this.j.hashCode() + ((this.i.hashCode() + ua80.b(ua80.b(ua80.b(twn.a(this.e, ua80.b(ua80.b(axq.c(this.b, Integer.hashCode(this.f5095a) * 31, 31), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h)) * 31)) * 31, 31, this.k), 31, this.l), 31, this.m), 31, this.n), 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GameUiModel(gameId=");
        sb.append(this.f5095a);
        sb.append(", cardStyle=");
        sb.append(this.b);
        sb.append(", sportIconUrl=");
        f140.v(sb, this.c, ", champ=", this.d, ", startTime=");
        kng0.w(this.e, ", rateFirst=", this.f, ", rateSecond=", sb);
        f140.v(sb, this.g, ", rateDraw=", this.h, ", firstPlayer=");
        sb.append(this.i);
        sb.append(", secondPlayer=");
        sb.append(this.j);
        sb.append(", teamOneImageList=");
        b1j.y(", teamTwoImageList=", ", winNameFirst=", sb, this.k, this.l);
        f140.v(sb, this.m, ", drawName=", this.n, ", winNameSecond=");
        return defpackage.c.c(this.o, ", is24HourFormat=", Separators.RPAREN, sb, this.p);
    }
}
