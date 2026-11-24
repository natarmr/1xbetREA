package a;

import android.gov.nist.core.Separators;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;

/* JADX INFO: loaded from: classes5.dex */
public final class htq extends ofs {
    public final ohm0 b;
    public final ank0 c;
    public final ank0 d;
    public final ank0 e;
    public final ank0 f;
    public final ank0 g;
    public final CardIdentity h;
    public final boolean i;

    public htq(ohm0 ohm0Var, ank0 ank0Var, ank0 ank0Var2, ank0 ank0Var3, ank0 ank0Var4, ank0 ank0Var5, CardIdentity cardIdentity, boolean z) {
        this.b = ohm0Var;
        this.c = ank0Var;
        this.d = ank0Var2;
        this.e = ank0Var3;
        this.f = ank0Var4;
        this.g = ank0Var5;
        this.h = cardIdentity;
        this.i = z;
    }

    @Override // a.ofs
    public final CardIdentity a() {
        return this.h;
    }

    @Override // a.ofs
    public final ofs b(CardIdentity cardIdentity) {
        return new htq(this.b, this.c, this.d, this.e, this.f, this.g, cardIdentity, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htq)) {
            return false;
        }
        htq htqVar = (htq) obj;
        return this.b.equals(htqVar.b) && this.c.equals(htqVar.c) && this.d.equals(htqVar.d) && this.e.equals(htqVar.e) && this.f.equals(htqVar.f) && this.g.equals(htqVar.g) && this.h.equals(htqVar.h) && this.i == htqVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + dw9.a(dw9.a(dw9.a(dw9.a(dw9.a(this.b.hashCode() * 31, 31, this.c.f1159a), 31, this.d.f1159a), 31, this.e.f1159a), 31, this.f.f1159a), 31, this.g.f1159a)) * 31);
    }

    public final String toString() {
        return "FootballZonesActivitiesUiModel(teamsInfoUiModel=" + this.b + ", gameScore=" + this.c + ", leftZoneActions=" + this.d + ", centralZoneActions=" + this.e + ", rightZoneActions=" + this.f + ", matchPeriodInfo=" + this.g + ", cardIdentity=" + this.h + ", rtlSupport=" + this.i + Separators.RPAREN;
    }
}
