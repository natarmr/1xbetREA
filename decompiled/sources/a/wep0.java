package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class wep0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xnp0 f39030a;
    public final String b;
    public final ArrayList c;

    public wep0(xnp0 xnp0Var, String str, ArrayList arrayList) {
        this.f39030a = xnp0Var;
        this.b = str;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wep0)) {
            return false;
        }
        wep0 wep0Var = (wep0) obj;
        return this.f39030a.equals(wep0Var.f39030a) && this.b.equals(wep0Var.b) && this.c.equals(wep0Var.c);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof wep0) && (p6t0Var2 instanceof wep0)) {
            return Intrinsics.d(((wep0) p6t0Var).f39030a.b, ((wep0) p6t0Var2).f39030a.b);
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.c.hashCode() + ua80.b(this.f39030a.hashCode() * 31, 31, this.b);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof wep0) || !(p6t0Var2 instanceof wep0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        wep0 wep0Var = (wep0) p6t0Var;
        wep0 wep0Var2 = (wep0) p6t0Var2;
        k9x.G(linkedHashSet, new tep0(wep0Var.f39030a), new tep0(wep0Var2.f39030a));
        k9x.G(linkedHashSet, new uep0(wep0Var.b), new uep0(wep0Var2.b));
        k9x.G(linkedHashSet, new sep0(wep0Var.c), new sep0(wep0Var2.c));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        return axq.n(b1j.n("TeamKillsStatisticUiModel(team=", "Team(value=" + this.f39030a + Separators.RPAREN, ", totalKills=", kng0.l("TotalKills(value=", this.b, Separators.RPAREN), ", killsStatistics="), hne.o("KillsStatistics(value=", Separators.RPAREN, this.c), Separators.RPAREN);
    }
}
