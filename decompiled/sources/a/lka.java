package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;

/* JADX INFO: loaded from: classes5.dex */
public final class lka extends ofs {
    public final String b;
    public final List c;
    public final List d;
    public final String e;
    public final String f;
    public final hg30 g;
    public final CardIdentity h;
    public final boolean i;

    public lka(String str, List list, List list2, String str2, String str3, hg30 hg30Var, CardIdentity cardIdentity, boolean z) {
        str3.getClass();
        this.b = str;
        this.c = list;
        this.d = list2;
        this.e = str2;
        this.f = str3;
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
        String str = this.f;
        str.getClass();
        return new lka(this.b, this.c, this.d, this.e, str, this.g, cardIdentity, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lka)) {
            return false;
        }
        lka lkaVar = (lka) obj;
        return this.b.equals(lkaVar.b) && this.c.equals(lkaVar.c) && this.d.equals(lkaVar.d) && this.e.equals(lkaVar.e) && Intrinsics.d(this.f, lkaVar.f) && this.g.equals(lkaVar.g) && this.h.equals(lkaVar.h) && this.i == lkaVar.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + ((this.h.hashCode() + ((this.g.hashCode() + ua80.b(ua80.b(dw9.a(dw9.a(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("CardMultiTeamsLineUiModel(score=", this.b, ", teamOneMultiTeams=", this.c, ", teamTwoMultiTeams=");
        h97.y(", matchDescription=", this.e, ", matchPeriodInfo=", sbF, this.d);
        sbF.append(this.f);
        sbF.append(", matchTimerUiModel=");
        sbF.append(this.g);
        sbF.append(", cardIdentity=");
        sbF.append(this.h);
        sbF.append(", rtlSupport=");
        sbF.append(this.i);
        sbF.append(Separators.RPAREN);
        return sbF.toString();
    }
}
