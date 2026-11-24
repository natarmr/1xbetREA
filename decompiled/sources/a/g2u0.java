package a;

import android.gov.nist.core.Separators;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g2u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f10579a;
    public final Map b;
    public final u1u0 c;
    public final List d;

    public g2u0(int i, Map map, u1u0 u1u0Var, List list) {
        list.getClass();
        this.f10579a = i;
        this.b = map;
        this.c = u1u0Var;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2u0)) {
            return false;
        }
        g2u0 g2u0Var = (g2u0) obj;
        return this.f10579a == g2u0Var.f10579a && this.b.equals(g2u0Var.b) && this.c == g2u0Var.c && Intrinsics.d(this.d, g2u0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ohs0.f(this.b, Integer.hashCode(this.f10579a) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ValoriantStatisticTeamModel(scoreTeam=" + this.f10579a + ", roundHistory=" + this.b + ", teamSide=" + this.c + ", playersStatistic=" + this.d + Separators.RPAREN;
    }
}
