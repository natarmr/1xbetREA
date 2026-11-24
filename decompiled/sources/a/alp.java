package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class alp implements qlp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1079a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public alp(boolean z, boolean z2, String str, int i) {
        str.getClass();
        this.f1079a = str;
        this.b = i;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof alp)) {
            return false;
        }
        alp alpVar = (alp) obj;
        return Intrinsics.d(this.f1079a, alpVar.f1079a) && this.b == alpVar.b && this.c == alpVar.c && this.d == alpVar.d;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof alp) && (p6t0Var2 instanceof alp);
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(twn.a(this.b, brm0.e(twn.a(0, rw2.b(ua80.b(Long.hashCode(-2L) * 31, 31, this.f1079a), 31, 0L), 31), 31, true), 31), 31, this.c);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof alp) && (p6t0Var2 instanceof alp)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            alp alpVar = (alp) p6t0Var;
            alp alpVar2 = (alp) p6t0Var2;
            k9x.G(linkedHashSet, new zkp(alpVar.b), new zkp(alpVar2.b));
            k9x.G(linkedHashSet, new ykp(alpVar.d), new ykp(alpVar2.d));
            if (!linkedHashSet.isEmpty()) {
                return linkedHashSet;
            }
        }
        return null;
    }

    public final String toString() {
        return twn.q(", expanded=", defpackage.c.d("Expanded(value=", Separators.RPAREN, this.d), Separators.RPAREN, b1j.n("FeedsChampLiveExpressGroupItem(id=-2, title=", this.f1079a, ", sportId=0, subSportId=0, live=true, gamesCount=", ua80.e(this.b, "GamesCount(value=", Separators.RPAREN), ", top="), this.c);
    }
}
