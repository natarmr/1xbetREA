package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g0e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10455a;
    public final long b;
    public final boolean c;
    public final k0e0 d;
    public final k0e0 e;
    public final List f;
    public final syd0 g;
    public final List h;

    public g0e0(int i, long j, boolean z, k0e0 k0e0Var, k0e0 k0e0Var2, List list, syd0 syd0Var, List list2) {
        list.getClass();
        list2.getClass();
        this.f10455a = i;
        this.b = j;
        this.c = z;
        this.d = k0e0Var;
        this.e = k0e0Var2;
        this.f = list;
        this.g = syd0Var;
        this.h = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0e0)) {
            return false;
        }
        g0e0 g0e0Var = (g0e0) obj;
        return this.f10455a == g0e0Var.f10455a && this.b == g0e0Var.b && this.c == g0e0Var.c && this.d.equals(g0e0Var.d) && this.e.equals(g0e0Var.e) && Intrinsics.d(this.f, g0e0Var.f) && this.g.equals(g0e0Var.g) && Intrinsics.d(this.h, g0e0Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + ((this.g.hashCode() + dw9.a((this.e.hashCode() + ((this.d.hashCode() + brm0.e(rw2.b(Integer.hashCode(this.f10455a) * 31, 31, this.b), 31, this.c)) * 31)) * 31, 31, this.f)) * 31);
    }

    public final String toString() {
        StringBuilder sbQ = vqd.q(this.f10455a, this.b, "RainbowStatisticMatchesModel(id=", ", tournamentId=");
        sbQ.append(", finished=");
        sbQ.append(this.c);
        sbQ.append(", team1=");
        sbQ.append(this.d);
        sbQ.append(", team2=");
        sbQ.append(this.e);
        sbQ.append(", matches=");
        sbQ.append(this.f);
        sbQ.append(", comparison=");
        sbQ.append(this.g);
        sbQ.append(", mapPicks=");
        sbQ.append(this.h);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
