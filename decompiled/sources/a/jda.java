package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;

/* JADX INFO: loaded from: classes5.dex */
public final class jda extends ofs {
    public final String b;
    public final String c;
    public final long d;
    public final String e;
    public final hg30 f;
    public final CardIdentity g;

    public jda(String str, String str2, long j, String str3, hg30 hg30Var, CardIdentity cardIdentity) {
        str2.getClass();
        str3.getClass();
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = str3;
        this.f = hg30Var;
        this.g = cardIdentity;
    }

    @Override // a.ofs
    public final CardIdentity a() {
        return this.g;
    }

    @Override // a.ofs
    public final ofs b(CardIdentity cardIdentity) {
        String str = this.c;
        str.getClass();
        String str2 = this.e;
        str2.getClass();
        return new jda(this.b, str, this.d, str2, this.f, cardIdentity);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jda)) {
            return false;
        }
        jda jdaVar = (jda) obj;
        return this.b.equals(jdaVar.b) && Intrinsics.d(this.c, jdaVar.c) && znq0.e(this.d, jdaVar.d) && Intrinsics.d(this.e, jdaVar.e) && this.f.equals(jdaVar.f) && this.g.equals(jdaVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ((this.f.hashCode() + ua80.b(rw2.b(ua80.b(this.b.hashCode() * 31, 31, this.c), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        String strH = znq0.h(this.d);
        StringBuilder sbN = b1j.n("CardCommonSingleGameUiModel(matchDescription=", this.b, ", matchName=", this.c, ", timeStart=");
        f140.v(sbN, strH, ", matchPeriodInfo=", this.e, ", matchTimerUiModel=");
        sbN.append(this.f);
        sbN.append(", cardIdentity=");
        sbN.append(this.g);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
