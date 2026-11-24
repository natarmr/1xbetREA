package a;

import android.gov.nist.core.Separators;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;

/* JADX INFO: loaded from: classes5.dex */
public final class yca extends ofs {
    public final ank0 b;
    public final ohm0 c;
    public final int d;
    public final int e;
    public final ank0 f;
    public final ank0 g;
    public final boolean h;
    public final hg30 i;
    public final boolean j;
    public final CardIdentity k;
    public final boolean l;

    public yca(ank0 ank0Var, ohm0 ohm0Var, int i, int i2, ank0 ank0Var2, ank0 ank0Var3, boolean z, hg30 hg30Var, boolean z2, CardIdentity cardIdentity, boolean z3) {
        this.b = ank0Var;
        this.c = ohm0Var;
        this.d = i;
        this.e = i2;
        this.f = ank0Var2;
        this.g = ank0Var3;
        this.h = z;
        this.i = hg30Var;
        this.j = z2;
        this.k = cardIdentity;
        this.l = z3;
    }

    @Override // a.ofs
    public final CardIdentity a() {
        return this.k;
    }

    @Override // a.ofs
    public final ofs b(CardIdentity cardIdentity) {
        return new yca(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, cardIdentity, this.l);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yca)) {
            return false;
        }
        yca ycaVar = (yca) obj;
        return this.b.equals(ycaVar.b) && this.c.equals(ycaVar.c) && this.d == ycaVar.d && this.e == ycaVar.e && this.f.equals(ycaVar.f) && this.g.equals(ycaVar.g) && this.h == ycaVar.h && this.i.equals(ycaVar.i) && this.j == ycaVar.j && this.k.equals(ycaVar.k) && this.l == ycaVar.l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.l) + ((this.k.hashCode() + brm0.e((this.i.hashCode() + brm0.e(dw9.a(dw9.a(twn.a(this.e, twn.a(this.d, (this.c.hashCode() + (this.b.f1159a.hashCode() * 31)) * 31, 31), 31), 31, this.f.f1159a), 31, this.g.f1159a), 31, this.h)) * 31, 31, this.j)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardCommonLiveUiModel(score=");
        sb.append(this.b);
        sb.append(", teamsInfoUiModel=");
        sb.append(this.c);
        sb.append(", teamOneRedCards=");
        axq.r(this.d, this.e, ", teamTwoRedCards=", ", matchDescription=", sb);
        sb.append(this.f);
        sb.append(", matchPeriodInfo=");
        sb.append(this.g);
        sb.append(", hostsVsGuests=");
        sb.append(this.h);
        sb.append(", matchTimerUiModel=");
        sb.append(this.i);
        sb.append(", bettingDisabled=");
        sb.append(this.j);
        sb.append(", cardIdentity=");
        sb.append(this.k);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.l, Separators.RPAREN);
    }
}
