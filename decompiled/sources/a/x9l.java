package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class x9l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c5l f40514a;
    public final smg b;
    public final ic6 c;
    public final ljg d;
    public final boolean e;

    public x9l(c5l c5lVar, smg smgVar, ic6 ic6Var, ljg ljgVar, boolean z) {
        this.f40514a = c5lVar;
        this.b = smgVar;
        this.c = ic6Var;
        this.d = ljgVar;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x9l)) {
            return false;
        }
        x9l x9lVar = (x9l) obj;
        return this.f40514a.equals(x9lVar.f40514a) && this.b.equals(x9lVar.b) && this.c.equals(x9lVar.c) && this.d.equals(x9lVar.d) && this.e == x9lVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.f40514a.hashCode() * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DotaStatisticModel(matchStatistic=");
        sb.append(this.f40514a);
        sb.append(", playersComposition=");
        sb.append(this.b);
        sb.append(", bestHeroes=");
        sb.append(this.c);
        sb.append(", lastMatchesInfoModel=");
        sb.append(this.d);
        sb.append(", hasStatistics=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
