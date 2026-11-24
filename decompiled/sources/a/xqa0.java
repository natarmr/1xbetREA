package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class xqa0 implements zqa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f41307a;
    public final long b;
    public final yi00 c;
    public final String d;

    public xqa0(long j, long j2, yi00 yi00Var, String str) {
        str.getClass();
        this.f41307a = j;
        this.b = j2;
        this.c = yi00Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqa0)) {
            return false;
        }
        xqa0 xqa0Var = (xqa0) obj;
        return this.f41307a == xqa0Var.f41307a && this.b == xqa0Var.b && this.c.equals(xqa0Var.c) && Intrinsics.d(this.d, xqa0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + twn.a(this.c.f42663a, rw2.b(Long.hashCode(this.f41307a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f41307a, "SubItemClicked(id=", ", sportId=");
        sbQ.append(this.b);
        sbQ.append(", typeExpress=");
        sbQ.append(this.c);
        return rw2.o(sbQ, ", title=", this.d, Separators.RPAREN);
    }
}
