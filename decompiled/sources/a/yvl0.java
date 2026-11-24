package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class yvl0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43326a;
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
    public final int o;

    public yvl0(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, List list) {
        list.getClass();
        this.f43326a = str;
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
        this.o = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yvl0)) {
            return false;
        }
        yvl0 yvl0Var = (yvl0) obj;
        return this.f43326a.equals(yvl0Var.f43326a) && this.b.equals(yvl0Var.b) && this.c.equals(yvl0Var.c) && this.d.equals(yvl0Var.d) && this.e.equals(yvl0Var.e) && this.f.equals(yvl0Var.f) && this.g.equals(yvl0Var.g) && this.h.equals(yvl0Var.h) && this.i.equals(yvl0Var.i) && this.j.equals(yvl0Var.j) && this.k.equals(yvl0Var.k) && this.l.equals(yvl0Var.l) && this.m.equals(yvl0Var.m) && Intrinsics.d(this.n, yvl0Var.n) && this.o == yvl0Var.o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + dw9.a(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(this.f43326a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31, this.k), 31, this.l), 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("StadiumInfoModel(address=", this.f43326a, ", name=", this.b, ", capacity=");
        f140.v(sbN, this.c, ", covering=", this.d, ", city=");
        f140.v(sbN, this.e, ", architect=", this.f, ", oldName=");
        f140.v(sbN, this.g, ", category=", this.h, ", history=");
        f140.v(sbN, this.i, ", opened=", this.j, ", zipCode=");
        f140.v(sbN, this.k, ", phone=", this.l, ", website=");
        cs0.y(this.m, ", imageList=", ", countryId=", sbN, this.n);
        return rz4.j(this.o, Separators.RPAREN, sbN);
    }
}
