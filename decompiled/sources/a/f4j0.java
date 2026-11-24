package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class f4j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8916a;
    public final double b;
    public final e4j0 c;
    public final e4j0 d;
    public final e4j0 e;
    public final boolean f;
    public final String g;

    public f4j0(long j, double d, e4j0 e4j0Var, e4j0 e4j0Var2, e4j0 e4j0Var3, boolean z, String str) {
        this.f8916a = j;
        this.b = d;
        this.c = e4j0Var;
        this.d = e4j0Var2;
        this.e = e4j0Var3;
        this.f = z;
        this.g = str;
    }

    public static f4j0 a(f4j0 f4j0Var, long j, double d, e4j0 e4j0Var, e4j0 e4j0Var2, e4j0 e4j0Var3, boolean z, String str, int i) {
        if ((i & 1) != 0) {
            j = f4j0Var.f8916a;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            d = f4j0Var.b;
        }
        double d2 = d;
        if ((i & 4) != 0) {
            e4j0Var = f4j0Var.c;
        }
        return new f4j0(j2, d2, e4j0Var, (i & 8) != 0 ? f4j0Var.d : e4j0Var2, (i & 16) != 0 ? f4j0Var.e : e4j0Var3, (i & 32) != 0 ? f4j0Var.f : z, (i & 64) != 0 ? f4j0Var.g : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f4j0)) {
            return false;
        }
        f4j0 f4j0Var = (f4j0) obj;
        return this.f8916a == f4j0Var.f8916a && Double.compare(this.b, f4j0Var.b) == 0 && this.c.equals(f4j0Var.c) && this.d.equals(f4j0Var.d) && this.e.equals(f4j0Var.e) && this.f == f4j0Var.f && this.g.equals(f4j0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + brm0.e((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + brm0.d(this.b, Long.hashCode(this.f8916a) * 31, 31)) * 31)) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f8916a, "SettingsMakeBetQuickBetStateModel(balanceId=", ", minValue=");
        sbQ.append(this.b);
        sbQ.append(", firstItem=");
        sbQ.append(this.c);
        sbQ.append(", secondItem=");
        sbQ.append(this.d);
        sbQ.append(", thirdItem=");
        sbQ.append(this.e);
        hne.u(", hasQuickBetToggleEnabled=", ", subTitle=", this.g, sbQ, this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
