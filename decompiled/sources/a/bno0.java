package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class bno0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ano0 f2894a;
    public final String b;
    public final String c;
    public final String d;

    public bno0(ano0 ano0Var, String str, String str2, String str3) {
        this.f2894a = ano0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bno0)) {
            return false;
        }
        bno0 bno0Var = (bno0) obj;
        return this.f2894a == bno0Var.f2894a && this.b.equals(bno0Var.b) && this.c.equals(bno0Var.c) && this.d.equals(bno0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(ua80.b(this.f2894a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Statistic(type=");
        sb.append(this.f2894a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", teamOneScore=");
        return ua80.m(sb, this.c, ", teamTwoScore=", this.d, Separators.RPAREN);
    }
}
