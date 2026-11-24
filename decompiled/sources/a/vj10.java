package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class vj10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37508a;
    public final lnm0 b;
    public final double c;
    public final double d;
    public final double e;
    public final long f;
    public final ws60 g;

    public vj10(List list, lnm0 lnm0Var, double d, double d2, double d3, long j, ws60 ws60Var) {
        list.getClass();
        this.f37508a = list;
        this.b = lnm0Var;
        this.c = d;
        this.d = d2;
        this.e = d3;
        this.f = j;
        this.g = ws60Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vj10)) {
            return false;
        }
        vj10 vj10Var = (vj10) obj;
        return Intrinsics.d(this.f37508a, vj10Var.f37508a) && this.b == vj10Var.b && Double.compare(this.c, vj10Var.c) == 0 && Double.compare(this.d, vj10Var.d) == 0 && Double.compare(this.e, vj10Var.e) == 0 && this.f == vj10Var.f && this.g.equals(vj10Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + rw2.b(brm0.d(this.e, brm0.d(this.d, brm0.d(this.c, (this.b.hashCode() + (this.f37508a.hashCode() * 31)) * 31, 31), 31), 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LuckyCardModel(result=");
        sb.append(this.f37508a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", winSum=");
        sb.append(this.c);
        ohs0.A(sb, this.d, ", newBalance=", ", coeff=");
        sb.append(this.e);
        kng0.A(sb, ", accountId=", this.f, ", card=");
        sb.append(this.g);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
