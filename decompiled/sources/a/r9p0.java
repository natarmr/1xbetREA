package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class r9p0 implements v9p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30096a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final w9p0 g;
    public final float h;
    public final int i;
    public final int j;
    public final List k;

    public r9p0(long j, String str, String str2, String str3, String str4, String str5, w9p0 w9p0Var, float f, int i, int i2, List list) {
        list.getClass();
        this.f30096a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = w9p0Var;
        this.h = f;
        this.i = i;
        this.j = i2;
        this.k = list;
    }

    @Override // a.v9p0
    public final String a() {
        return this.c;
    }

    @Override // a.v9p0
    public final String b() {
        return this.d;
    }

    @Override // a.v9p0
    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r9p0)) {
            return false;
        }
        r9p0 r9p0Var = (r9p0) obj;
        return this.f30096a == r9p0Var.f30096a && this.b.equals(r9p0Var.b) && this.c.equals(r9p0Var.c) && this.d.equals(r9p0Var.d) && this.e.equals(r9p0Var.e) && this.f.equals(r9p0Var.f) && this.g == r9p0Var.g && Float.compare(this.h, r9p0Var.h) == 0 && this.i == r9p0Var.i && this.j == r9p0Var.j && Intrinsics.d(this.k, r9p0Var.k);
    }

    @Override // a.v9p0
    public final long getId() {
        return this.f30096a;
    }

    public final int hashCode() {
        return this.k.hashCode() + twn.a(this.j, twn.a(this.i, defpackage.c.a((this.g.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(Long.hashCode(this.f30096a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31, this.h, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f30096a, "Dota(id=", ", nickname=", this.b);
        f140.v(sbO, ", realName=", this.c, ", image=", this.d);
        f140.v(sbO, ", country=", this.e, ", countryImageS3=", this.f);
        sbO.append(", position=");
        sbO.append(this.g);
        sbO.append(", kda=");
        sbO.append(this.h);
        rw2.s(this.i, this.j, ", gpm=", ", xpm=", sbO);
        return ohs0.s(sbO, ", bestHeroes=", this.k, Separators.RPAREN);
    }
}
