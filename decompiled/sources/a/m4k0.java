package a;

import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m4k0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21175a;
    public final e4k0 b;
    public final String c;
    public final g4k0 d;
    public final int e;
    public final String f;
    public final String g;
    public final String h;
    public final int i;

    public m4k0(String str, e4k0 e4k0Var, String str2, g4k0 g4k0Var, int i, String str3, String str4, String str5, int i2) {
        str2.getClass();
        this.f21175a = str;
        this.b = e4k0Var;
        this.c = str2;
        this.d = g4k0Var;
        this.e = i;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4k0)) {
            return false;
        }
        m4k0 m4k0Var = (m4k0) obj;
        return this.f21175a.equals(m4k0Var.f21175a) && this.b.equals(m4k0Var.b) && Intrinsics.d(this.c, m4k0Var.c) && this.d.equals(m4k0Var.d) && this.e == m4k0Var.e && this.f.equals(m4k0Var.f) && this.g.equals(m4k0Var.g) && this.h.equals(m4k0Var.h) && this.i == m4k0Var.i;
    }

    @Override // a.p6t0
    public final boolean g(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if ((p6t0Var instanceof m4k0) && (p6t0Var2 instanceof m4k0)) {
            return ((m4k0) p6t0Var).f21175a.equals(((m4k0) p6t0Var2).f21175a);
        }
        return false;
    }

    @Override // a.p6t0
    public final boolean h(p6t0 p6t0Var, p6t0 p6t0Var2) {
        return rw2.y(p6t0Var, p6t0Var2, p6t0Var, p6t0Var2);
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + ua80.b(ua80.b(ua80.b(twn.a(this.e, (this.d.hashCode() + ua80.b((this.b.hashCode() + (this.f21175a.hashCode() * 31)) * 31, 31, this.c)) * 31, 31), 31, this.f), 31, this.g), 31, this.h);
    }

    @Override // a.p6t0
    public final Collection o(p6t0 p6t0Var, p6t0 p6t0Var2) {
        p6t0Var.getClass();
        p6t0Var2.getClass();
        if (!(p6t0Var instanceof m4k0) || !(p6t0Var2 instanceof m4k0)) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m4k0 m4k0Var = (m4k0) p6t0Var;
        m4k0 m4k0Var2 = (m4k0) p6t0Var2;
        k9x.G(linkedHashSet, m4k0Var.b, m4k0Var2.b);
        k9x.G(linkedHashSet, new f4k0(m4k0Var.c), new f4k0(m4k0Var2.c));
        k9x.G(linkedHashSet, m4k0Var.d, m4k0Var2.d);
        k9x.G(linkedHashSet, new h4k0(m4k0Var.e), new h4k0(m4k0Var2.e));
        k9x.G(linkedHashSet, new k4k0(m4k0Var.f), new k4k0(m4k0Var2.f));
        k9x.G(linkedHashSet, new j4k0(m4k0Var.g), new j4k0(m4k0Var2.g));
        k9x.G(linkedHashSet, new i4k0(m4k0Var.h), new i4k0(m4k0Var2.h));
        k9x.G(linkedHashSet, new d4k0(m4k0Var.i), new d4k0(m4k0Var2.i));
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return linkedHashSet;
    }

    public final String toString() {
        String strL = kng0.l("EnemyTeamTitle(value=", this.c, Separators.RPAREN);
        String strE = ua80.e(this.e, "ScoreBackground(value=", Separators.RPAREN);
        String strL2 = kng0.l("TournamentTitle(value=", this.f, Separators.RPAREN);
        String strL3 = kng0.l("TournamentDescription(value=", this.g, Separators.RPAREN);
        String strL4 = kng0.l("TournamentDate(value=", this.h, Separators.RPAREN);
        String strE2 = ua80.e(this.i, "Background(value=", Separators.RPAREN);
        StringBuilder sb = new StringBuilder("SingleTeamLastMatchesGameUiModel(id=");
        sb.append(this.f21175a);
        sb.append(", enemyTeamImage=");
        sb.append(this.b);
        sb.append(", enemyTeamTitle=");
        sb.append(strL);
        sb.append(", score=");
        sb.append(this.d);
        sb.append(", scoreBgRes=");
        f140.v(sb, strE, ", tournamentTitle=", strL2, ", tournamentDescription=");
        f140.v(sb, strL3, ", tournamentDate=", strL4, ", backgroundRes=");
        return axq.n(sb, strE2, Separators.RPAREN);
    }
}
