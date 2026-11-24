package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class b1u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1825a;
    public final long b;
    public final String c;
    public final String d;
    public final List e;

    public b1u0(int i, long j, String str, String str2, List list) {
        list.getClass();
        this.f1825a = i;
        this.b = j;
        this.c = str;
        this.d = str2;
        this.e = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1u0)) {
            return false;
        }
        b1u0 b1u0Var = (b1u0) obj;
        return this.f1825a == b1u0Var.f1825a && this.b == b1u0Var.b && this.c.equals(b1u0Var.c) && this.d.equals(b1u0Var.d) && Intrinsics.d(this.e, b1u0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(rw2.b(Integer.hashCode(this.f1825a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f1825a, this.b, "ValorantStatisticMatchesTeamModel(id=", ", feedId=");
        f140.v(sbQ, ", name=", this.c, ", image=", this.d);
        return ohs0.s(sbQ, ", players=", this.e, Separators.RPAREN);
    }
}
