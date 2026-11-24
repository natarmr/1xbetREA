package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xi40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f40926a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final int k;
    public final int l;
    public final int m;
    public final List n;

    public xi40(long j, String str, String str2, String str3, String str4, long j2, int i, int i2, int i3, float f, int i4, int i5, int i6, List list) {
        list.getClass();
        this.f40926a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = j2;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = f;
        this.k = i4;
        this.l = i5;
        this.m = i6;
        this.n = list;
    }

    public final boolean a() {
        return this.f <= 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi40)) {
            return false;
        }
        xi40 xi40Var = (xi40) obj;
        return this.f40926a == xi40Var.f40926a && this.b.equals(xi40Var.b) && this.c.equals(xi40Var.c) && this.d.equals(xi40Var.d) && this.e.equals(xi40Var.e) && this.f == xi40Var.f && this.g == xi40Var.g && this.h == xi40Var.h && this.i == xi40Var.i && Float.compare(this.j, xi40Var.j) == 0 && this.k == xi40Var.k && this.l == xi40Var.l && this.m == xi40Var.m && Intrinsics.d(this.n, xi40Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + twn.a(this.m, twn.a(this.l, twn.a(this.k, defpackage.c.a(twn.a(this.i, twn.a(this.h, twn.a(this.g, rw2.b(ua80.b(ua80.b(ua80.b(ua80.b(Long.hashCode(this.f40926a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31), 31), this.j, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f40926a, "MlbbHeroModel(heroId=", ", heroName=", this.b);
        f140.v(sbO, ", heroImage=", this.c, ", heroBwImage=", this.d);
        hne.B(sbO, ", playerName=", this.e, ", respawnTimer=");
        ua80.v(sbO, this.f, ", positionX=", this.g);
        rw2.s(this.h, this.i, ", positionY=", ", level=", sbO);
        sbO.append(", gold=");
        sbO.append(this.j);
        sbO.append(", kills=");
        sbO.append(this.k);
        rw2.s(this.l, this.m, ", deaths=", ", assists=", sbO);
        return ohs0.s(sbO, ", items=", this.n, Separators.RPAREN);
    }
}
