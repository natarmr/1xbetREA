package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class j88 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zoe f16071a;
    public final boolean b;
    public final int c;
    public final String d;
    public final long e;
    public final String f;
    public final String g;
    public final String h;
    public final long i;
    public final t7s0 j;
    public final String k;

    public j88(zoe zoeVar, boolean z, int i, String str, long j, String str2, String str3, String str4, long j2, t7s0 t7s0Var, String str5) {
        this.f16071a = zoeVar;
        this.b = z;
        this.c = i;
        this.d = str;
        this.e = j;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = j2;
        this.j = t7s0Var;
        this.k = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j88)) {
            return false;
        }
        j88 j88Var = (j88) obj;
        return this.f16071a.equals(j88Var.f16071a) && this.b == j88Var.b && this.c == j88Var.c && this.d.equals(j88Var.d) && this.e == j88Var.e && this.f.equals(j88Var.f) && this.g.equals(j88Var.g) && this.h.equals(j88Var.h) && this.i == j88Var.i && this.j == j88Var.j && this.k.equals(j88Var.k);
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + rw2.b(ua80.b(ua80.b(ua80.b(rw2.b(ua80.b(twn.a(this.c, brm0.e(this.f16071a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockHeaderModel(counter=");
        sb.append(this.f16071a);
        sb.append(", hasStages=");
        sb.append(this.b);
        sb.append(", currencyId=");
        kng0.w(this.c, ", description=", this.d, ", endDate=", sb);
        kng0.z(sb, this.e, ", headerImage=", this.f);
        f140.v(sb, ", prizeTitle=", this.g, ", prizePool=", this.h);
        kng0.A(sb, ", startDate=", this.i, ", status=");
        sb.append(this.j);
        sb.append(", headerTitle=");
        sb.append(this.k);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
