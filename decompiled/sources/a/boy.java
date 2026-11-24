package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class boy implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f2954a;
    public final String b;
    public final String c;
    public final int d;

    public boy(int i, long j, String str, String str2) {
        this.f2954a = j;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof boy)) {
            return false;
        }
        boy boyVar = (boy) obj;
        return this.f2954a == boyVar.f2954a && this.b.equals(boyVar.b) && this.c.equals(boyVar.c) && this.d == boyVar.d;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        return (p6t0Var instanceof boy) && (p6t0Var2 instanceof boy) && ((boy) p6t0Var).f2954a == ((boy) p6t0Var2).f2954a;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ua80.b(ua80.b(Long.hashCode(this.f2954a) * 31, 31, this.b), 31, this.c);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof boy) || !(p6t0Var2 instanceof boy)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boy boyVar = (boy) p6t0Var;
        boy boyVar2 = (boy) p6t0Var2;
        k9x.G(linkedHashSet, new yny(boyVar.b), new yny(boyVar2.b));
        k9x.G(linkedHashSet, new aoy(boyVar.c), new aoy(boyVar2.c));
        k9x.G(linkedHashSet, new zny(boyVar.d), new zny(boyVar2.d));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("HeroIcon(value=", this.b, Separators.RPAREN);
        String strL2 = kng0.l("NumberOfKills(value=", this.c, Separators.RPAREN);
        String strE = ua80.e(this.d, "KillsTextColor(value=", Separators.RPAREN);
        StringBuilder sbO = axq.o(this.f2954a, "KillUiModel(id=", ", heroIcon=", strL);
        f140.v(sbO, ", numberOfKills=", strL2, ", killsTextColor=", strE);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
