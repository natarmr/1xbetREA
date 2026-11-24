package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class rmp implements smp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f30753a;
    public final long b;
    public final aj00 c;
    public final String d;

    public rmp(long j, long j2, aj00 aj00Var, String str) {
        aj00Var.getClass();
        str.getClass();
        this.f30753a = j;
        this.b = j2;
        this.c = aj00Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rmp)) {
            return false;
        }
        rmp rmpVar = (rmp) obj;
        return this.f30753a == rmpVar.f30753a && this.b == rmpVar.b && Intrinsics.d(this.c, rmpVar.c) && Intrinsics.d(this.d, rmpVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + rw2.b(Long.hashCode(this.f30753a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = kng0.q(this.f30753a, "SubItemClicked(id=", ", sportId=");
        sbQ.append(this.b);
        sbQ.append(", typeExpress=");
        sbQ.append(this.c);
        return rw2.o(sbQ, ", title=", this.d, Separators.RPAREN);
    }
}
