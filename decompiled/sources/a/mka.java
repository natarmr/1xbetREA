package a;

import android.gov.nist.core.Separators;
import java.util.List;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;

/* JADX INFO: loaded from: classes5.dex */
public final class mka extends ofs {
    public final ank0 b;
    public final List c;
    public final List d;
    public final String e;
    public final ank0 f;
    public final hg30 g;
    public final CardIdentity h;
    public final boolean i;

    public mka(ank0 ank0Var, List list, List list2, String str, ank0 ank0Var2, hg30 hg30Var, CardIdentity cardIdentity, boolean z) {
        this.b = ank0Var;
        this.c = list;
        this.d = list2;
        this.e = str;
        this.f = ank0Var2;
        this.g = hg30Var;
        this.h = cardIdentity;
        this.i = z;
    }

    @Override // a.ofs
    public final CardIdentity a() {
        return this.h;
    }

    @Override // a.ofs
    public final ofs b(CardIdentity cardIdentity) {
        return new mka(this.b, this.c, this.d, this.e, this.f, this.g, cardIdentity, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mka)) {
            return false;
        }
        mka mkaVar = (mka) obj;
        return this.b.equals(mkaVar.b) && this.c.equals(mkaVar.c) && this.d.equals(mkaVar.d) && this.e.equals(mkaVar.e) && this.f.equals(mkaVar.f) && this.g.equals(mkaVar.g) && this.h.equals(mkaVar.h) && this.i == mkaVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + ((this.g.hashCode() + dw9.a(ua80.b(dw9.a(dw9.a(this.b.f1159a.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f.f1159a)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardMultiTeamsLiveUiModel(score=");
        sb.append(this.b);
        sb.append(", teamOneMultiTeams=");
        sb.append(this.c);
        sb.append(", teamTwoMultiTeams=");
        h97.y(", matchDescription=", this.e, ", matchPeriodInfo=", sb, this.d);
        sb.append(this.f);
        sb.append(", matchTimerUiModel=");
        sb.append(this.g);
        sb.append(", cardIdentity=");
        sb.append(this.h);
        sb.append(", rtlSupport=");
        sb.append(this.i);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
