package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class zvl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45064a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;
    public final String m;
    public final List n;

    public zvl0(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list) {
        list.getClass();
        this.f45064a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = str13;
        this.n = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvl0)) {
            return false;
        }
        zvl0 zvl0Var = (zvl0) obj;
        return this.f45064a.equals(zvl0Var.f45064a) && this.b.equals(zvl0Var.b) && this.c.equals(zvl0Var.c) && this.d.equals(zvl0Var.d) && this.e.equals(zvl0Var.e) && this.f.equals(zvl0Var.f) && this.g.equals(zvl0Var.g) && this.h.equals(zvl0Var.h) && this.i.equals(zvl0Var.i) && this.j.equals(zvl0Var.j) && this.k.equals(zvl0Var.k) && this.l.equals(zvl0Var.l) && this.m.equals(zvl0Var.m) && Intrinsics.d(this.n, zvl0Var.n);
    }

    public final int hashCode() {
        return this.n.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f45064a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("StadiumInfoModel(address=", this.f45064a, ", name=", this.b, ", capacity=");
        f140.v(sbN, this.c, ", covering=", this.d, ", city=");
        f140.v(sbN, this.e, ", architect=", this.f, ", oldName=");
        f140.v(sbN, this.g, ", category=", this.h, ", history=");
        f140.v(sbN, this.i, ", opened=", this.j, ", zipCode=");
        f140.v(sbN, this.k, ", phone=", this.l, ", website=");
        return rw2.m(this.m, ", imageList=", Separators.RPAREN, sbN, this.n);
    }
}
