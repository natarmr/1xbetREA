package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class lu20 implements qu20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f20653a;
    public final long b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public lu20(ArrayList arrayList, long j, String str, boolean z, boolean z2, boolean z3) {
        this.f20653a = arrayList;
        this.b = j;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    @Override // a.qu20
    public final long a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu20)) {
            return false;
        }
        lu20 lu20Var = (lu20) obj;
        return this.f20653a.equals(lu20Var.f20653a) && this.b == lu20Var.b && this.c.equals(lu20Var.c) && this.d == lu20Var.d && this.e == lu20Var.e && this.f == lu20Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(brm0.e(ua80.b(rw2.b(this.f20653a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Category(eventBets=");
        sb.append(this.f20653a);
        sb.append(", marketGroupId=");
        sb.append(this.b);
        w6x.z(", marketGroupName=", this.c, ", hasSpecialSign=", sb, this.d);
        w6x.A(", hasOptionbet=", ", hasEachWay=", sb, this.e, this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
