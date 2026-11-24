package a;

import android.gov.nist.core.Separators;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;

/* JADX INFO: loaded from: classes5.dex */
public final class mpd extends knd {
    public final ank0 b;
    public final ank0 c;
    public final CardIdentity d;

    public mpd(ank0 ank0Var, ank0 ank0Var2, CardIdentity cardIdentity) {
        this.b = ank0Var;
        this.c = ank0Var2;
        this.d = cardIdentity;
    }

    @Override // a.knd
    public final CardIdentity a() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpd)) {
            return false;
        }
        mpd mpdVar = (mpd) obj;
        return this.b.equals(mpdVar.b) && this.c.equals(mpdVar.c) && this.d.equals(mpdVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + dw9.a(this.b.f1159a.hashCode() * 31, 31, this.c.f1159a);
    }

    public final String toString() {
        return "CompressedCardSingleGameUiModel(matchName=" + this.b + ", matchBaseInfo=" + this.c + ", cardIdentity=" + this.d + Separators.RPAREN;
    }
}
