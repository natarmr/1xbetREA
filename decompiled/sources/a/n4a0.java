package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class n4a0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f22891a;
    public final String b;
    public final String c;
    public final String d;
    public final ArrayList e;

    public n4a0(long j, String str, String str2, String str3, ArrayList arrayList) {
        this.f22891a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n4a0)) {
            return false;
        }
        n4a0 n4a0Var = (n4a0) obj;
        return this.f22891a == n4a0Var.f22891a && this.b.equals(n4a0Var.b) && this.c.equals(n4a0Var.c) && this.d.equals(n4a0Var.d) && this.e.equals(n4a0Var.e);
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof n4a0) && (p6t0Var2 instanceof n4a0) && ((n4a0) p6t0Var).f22891a == ((n4a0) p6t0Var2).f22891a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return this.e.hashCode() + ua80.b(ua80.b(ua80.b(Long.hashCode(this.f22891a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof n4a0) || !(p6t0Var2 instanceof n4a0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        n4a0 n4a0Var = (n4a0) p6t0Var;
        n4a0 n4a0Var2 = (n4a0) p6t0Var2;
        k9x.G(linkedHashSet, new m4a0(n4a0Var.b), new m4a0(n4a0Var2.b));
        k9x.G(linkedHashSet, new k4a0(n4a0Var.c), new k4a0(n4a0Var2.c));
        k9x.G(linkedHashSet, new j4a0(n4a0Var.d), new j4a0(n4a0Var2.d));
        k9x.G(linkedHashSet, new l4a0(n4a0Var.e), new l4a0(n4a0Var2.e));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("Name(value=", this.b, Separators.RPAREN);
        String strL2 = kng0.l("HeroName(value=", this.c, Separators.RPAREN);
        String strL3 = kng0.l("HeroIcon(value=", this.d, Separators.RPAREN);
        String strO = hne.o("Kills(value=", Separators.RPAREN, this.e);
        StringBuilder sbO = axq.o(this.f22891a, "PlayerKillsUiModel(id=", ", name=", strL);
        f140.v(sbO, ", heroName=", strL2, ", heroIcon=", strL3);
        return rw2.o(sbO, ", kills=", strO, Separators.RPAREN);
    }
}
