package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class hl30 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13238a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public hl30(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f13238a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = str7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl30)) {
            return false;
        }
        hl30 hl30Var = (hl30) obj;
        return this.f13238a == hl30Var.f13238a && this.b.equals(hl30Var.b) && this.c.equals(hl30Var.c) && this.d.equals(hl30Var.d) && this.e.equals(hl30Var.e) && this.f.equals(hl30Var.f) && this.g.equals(hl30Var.g) && this.h.equals(hl30Var.h);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof hl30) && (p6t0Var2 instanceof hl30)) {
            return ((hl30) p6t0Var).b.equals(((hl30) p6t0Var2).b);
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.h.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(Integer.hashCode(this.f13238a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbR = vqd.r(this.f13238a, "MedalsStatisticUiModel(rank=", ", teamId=", this.b, ", title=");
        f140.v(sbR, this.c, ", image=", this.d, ", goldMedals=");
        f140.v(sbR, this.e, ", silverMedals=", this.f, ", bronzeMedals=");
        return ua80.m(sbR, this.g, ", totalMedals=", this.h, Separators.RPAREN);
    }
}
