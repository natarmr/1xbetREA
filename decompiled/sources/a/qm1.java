package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class qm1 extends tm1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f28960a;
    public final s9s0 b;
    public final String c;
    public final boolean d;

    public qm1(long j, s9s0 s9s0Var, String str, boolean z) {
        str.getClass();
        this.f28960a = j;
        this.b = s9s0Var;
        this.c = str;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qm1)) {
            return false;
        }
        qm1 qm1Var = (qm1) obj;
        return this.f28960a == qm1Var.f28960a && this.b == qm1Var.b && Intrinsics.d(this.c, qm1Var.c) && this.d == qm1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ua80.b((this.b.hashCode() + (Long.hashCode(this.f28960a) * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TournamentsFullInfoScreen(tournamentId=");
        sb.append(this.f28960a);
        sb.append(", tournamentPage=");
        sb.append(this.b);
        w6x.z(", tournamentTitle=", this.c, ", openSingleGame=", sb, this.d);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
