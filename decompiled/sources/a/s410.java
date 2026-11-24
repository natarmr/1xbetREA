package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class s410 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31582a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final List n;
    public final List o;
    public final h510 p;
    public final List q;
    public final List r;

    public s410(long j, String str, String str2, String str3, String str4, String str5, int i, int i2, int i3, int i4, int i5, int i6, int i7, List list, List list2, h510 h510Var, List list3, List list4) {
        hne.C(list, list2, list3, list4);
        this.f31582a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
        this.l = i6;
        this.m = i7;
        this.n = list;
        this.o = list2;
        this.p = h510Var;
        this.q = list3;
        this.r = list4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s410)) {
            return false;
        }
        s410 s410Var = (s410) obj;
        return this.f31582a == s410Var.f31582a && this.b.equals(s410Var.b) && this.c.equals(s410Var.c) && this.d.equals(s410Var.d) && this.e.equals(s410Var.e) && this.f.equals(s410Var.f) && this.g == s410Var.g && this.h == s410Var.h && this.i == s410Var.i && this.j == s410Var.j && this.k == s410Var.k && this.l == s410Var.l && this.m == s410Var.m && Intrinsics.d(this.n, s410Var.n) && Intrinsics.d(this.o, s410Var.o) && this.p.equals(s410Var.p) && Intrinsics.d(this.q, s410Var.q) && Intrinsics.d(this.r, s410Var.r);
    }

    public final int hashCode() {
        return this.r.hashCode() + dw9.a((this.p.hashCode() + dw9.a(dw9.a(twn.a(this.m, twn.a(this.l, twn.a(this.k, twn.a(this.j, twn.a(this.i, twn.a(this.h, twn.a(this.g, ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(Long.hashCode(this.f31582a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31), 31), 31), 31), 31), 31), 31, this.n), 31, this.o)) * 31, 31, this.q);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f31582a, "LolStatisticMatchesMatchTeamPlayerModel(id=", ", name=", this.b);
        f140.v(sbO, ", imageS3=", this.c, ", heroName=", this.d);
        f140.v(sbO, ", heroImageS3=", this.e, ", position=", this.f);
        rw2.s(this.g, this.h, ", level=", ", kills=", sbO);
        rw2.s(this.i, this.j, ", deaths=", ", assists=", sbO);
        rw2.s(this.k, this.l, ", totalDamageDealt=", ", totalDamageTaken=", sbO);
        sbO.append(", minionsKilled=");
        sbO.append(this.m);
        sbO.append(", spells=");
        sbO.append(this.n);
        sbO.append(", items=");
        sbO.append(this.o);
        sbO.append(", trinket=");
        sbO.append(this.p);
        hne.v(", primaryRunes=", ", subRunes=", sbO, this.q, this.r);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
