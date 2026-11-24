package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class w0u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f38368a;
    public final long b;
    public final boolean c;
    public final b1u0 d;
    public final b1u0 e;
    public final List f;
    public final List g;

    public w0u0(int i, long j, boolean z, b1u0 b1u0Var, b1u0 b1u0Var2, List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f38368a = i;
        this.b = j;
        this.c = z;
        this.d = b1u0Var;
        this.e = b1u0Var2;
        this.f = list;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0u0)) {
            return false;
        }
        w0u0 w0u0Var = (w0u0) obj;
        return this.f38368a == w0u0Var.f38368a && this.b == w0u0Var.b && this.c == w0u0Var.c && this.d.equals(w0u0Var.d) && this.e.equals(w0u0Var.e) && Intrinsics.d(this.f, w0u0Var.f) && Intrinsics.d(this.g, w0u0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + dw9.a((this.e.hashCode() + ((this.d.hashCode() + brm0.e(rw2.b(Integer.hashCode(this.f38368a) * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f38368a, this.b, "ValorantStatisticMatchesModel(id=", ", tournamentId=");
        sbQ.append(", finished=");
        sbQ.append(this.c);
        sbQ.append(", team1=");
        sbQ.append(this.d);
        sbQ.append(", team2=");
        sbQ.append(this.e);
        sbQ.append(", matches=");
        sbQ.append(this.f);
        return ohs0.s(sbQ, ", teamsStatistics=", this.g, Separators.RPAREN);
    }
}
