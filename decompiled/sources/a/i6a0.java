package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class i6a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f14230a;
    public final long b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public i6a0(ArrayList arrayList, long j, String str, boolean z, boolean z2, boolean z3) {
        this.f14230a = arrayList;
        this.b = j;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i6a0)) {
            return false;
        }
        i6a0 i6a0Var = (i6a0) obj;
        return this.f14230a.equals(i6a0Var.f14230a) && this.b == i6a0Var.b && this.c.equals(i6a0Var.c) && this.d == i6a0Var.d && this.e == i6a0Var.e && this.f == i6a0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + brm0.e(brm0.e(ua80.b(rw2.b(this.f14230a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlayerMarketGroupModel(eventBets=");
        sb.append(this.f14230a);
        sb.append(", marketGroupId=");
        sb.append(this.b);
        w6x.z(", marketGroupName=", this.c, ", expanded=", sb, this.d);
        w6x.A(", hasSpecialSign=", ", pinned=", sb, this.e, this.f);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
