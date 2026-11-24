package a;

import android.gov.nist.core.Separators;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;

/* JADX INFO: loaded from: classes5.dex */
public final class qca extends ofs {
    public final ank0 b;
    public final ank0 c;
    public final ohm0 d;
    public final ank0 e;
    public final ank0 f;
    public final CardIdentity g;
    public final boolean h;

    public qca(ank0 ank0Var, ank0 ank0Var2, ohm0 ohm0Var, ank0 ank0Var3, ank0 ank0Var4, CardIdentity cardIdentity, boolean z) {
        this.b = ank0Var;
        this.c = ank0Var2;
        this.d = ohm0Var;
        this.e = ank0Var3;
        this.f = ank0Var4;
        this.g = cardIdentity;
        this.h = z;
    }

    @Override // a.ofs
    public final CardIdentity a() {
        return this.g;
    }

    @Override // a.ofs
    public final ofs b(CardIdentity cardIdentity) {
        return new qca(this.b, this.c, this.d, this.e, this.f, cardIdentity, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qca)) {
            return false;
        }
        qca qcaVar = (qca) obj;
        return this.b.equals(qcaVar.b) && this.c.equals(qcaVar.c) && this.d.equals(qcaVar.d) && this.e.equals(qcaVar.e) && this.f.equals(qcaVar.f) && this.g.equals(qcaVar.g) && this.h == qcaVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ((this.g.hashCode() + dw9.a(dw9.a((this.d.hashCode() + dw9.a(this.b.f1159a.hashCode() * 31, 31, this.c.f1159a)) * 31, 31, this.e.f1159a), 31, this.f.f1159a)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardCommonCricketUiModel(matchDescription=");
        sb.append(this.b);
        sb.append(", matchPeriodInfo=");
        sb.append(this.c);
        sb.append(", teamsInfoUiModel=");
        sb.append(this.d);
        sb.append(", teamOneScore=");
        sb.append(this.e);
        sb.append(", teamTwoScore=");
        sb.append(this.f);
        sb.append(", cardIdentity=");
        sb.append(this.g);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.h, Separators.RPAREN);
    }
}
