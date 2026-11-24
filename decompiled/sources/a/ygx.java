package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class ygx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udl0 f42608a;
    public final long b;
    public final String c;
    public final String d;
    public final boolean e;
    public final int f;
    public final y9q0 g;

    public ygx(udl0 udl0Var, long j, String str, String str2, boolean z, int i, y9q0 y9q0Var) {
        this.f42608a = udl0Var;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = z;
        this.f = i;
        this.g = y9q0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ygx)) {
            return false;
        }
        ygx ygxVar = (ygx) obj;
        return this.f42608a == ygxVar.f42608a && this.b == ygxVar.b && this.c.equals(ygxVar.c) && this.d.equals(ygxVar.d) && this.e == ygxVar.e && this.f == ygxVar.f && this.g.equals(ygxVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + twn.a(this.f, brm0.e(ua80.b(ua80.b(rw2.b(this.f42608a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsightsMarketGroupHeaderUiModel(sportGameType=");
        sb.append(this.f42608a);
        sb.append(", marketGroupId=");
        sb.append(this.b);
        f140.v(sb, ", title=", this.c, ", subTitle=", this.d);
        cs0.v(this.f, ", isExpanded=", ", countMarkets=", sb, this.e);
        sb.append(", textStyle=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
