package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class sr20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f32656a;
    public final long b;
    public final String c;
    public final boolean d;
    public final long e;
    public final f07 f;

    public sr20(ArrayList arrayList, long j, String str, boolean z, long j2, f07 f07Var) {
        this.f32656a = arrayList;
        this.b = j;
        this.c = str;
        this.d = z;
        this.e = j2;
        this.f = f07Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr20)) {
            return false;
        }
        sr20 sr20Var = (sr20) obj;
        return this.f32656a.equals(sr20Var.f32656a) && this.b == sr20Var.b && this.c.equals(sr20Var.c) && this.d == sr20Var.d && this.e == sr20Var.e && this.f == sr20Var.f;
    }

    public final int hashCode() {
        int iB = rw2.b(brm0.e(ua80.b(rw2.b(this.f32656a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        f07 f07Var = this.f;
        return iB + (f07Var == null ? 0 : f07Var.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarketBetGroupModel(marketBets=");
        sb.append(this.f32656a);
        sb.append(", marketGroupId=");
        sb.append(this.b);
        w6x.z(", marketGroupName=", this.c, ", hasSpecialSign=", sb, this.d);
        kng0.A(sb, ", gameId=", this.e, ", infoType=");
        sb.append(this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
