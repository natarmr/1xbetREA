package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class jug0 {
    public static final jug0 k = new jug0(false, "", "", "", "", "", "", "", "", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f17152a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;

    public jug0(boolean z, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f17152a = z;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
        this.i = str8;
        this.j = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jug0)) {
            return false;
        }
        jug0 jug0Var = (jug0) obj;
        return this.f17152a == jug0Var.f17152a && this.b.equals(jug0Var.b) && this.c.equals(jug0Var.c) && this.d.equals(jug0Var.d) && this.e.equals(jug0Var.e) && this.f.equals(jug0Var.f) && this.g.equals(jug0Var.g) && this.h.equals(jug0Var.h) && this.i.equals(jug0Var.i) && this.j.equals(jug0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(Boolean.hashCode(this.f17152a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder sbQ = axq.q("SaleDataUiModel(hasAutoSale=", ", autoSaleValue=", this.b, this.f17152a, ", autoSaleStartValue=");
        f140.v(sbQ, this.c, ", autoSaleEndValue=", this.d, ", newBetValue=");
        f140.v(sbQ, this.e, ", newBetStartValue=", this.f, ", newBetEndValue=");
        f140.v(sbQ, this.g, ", paymentValue=", this.h, ", paymentStartValue=");
        return ua80.m(sbQ, this.i, ", paymentEndValue=", this.j, Separators.RPAREN);
    }
}
