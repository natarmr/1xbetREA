package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;

/* JADX INFO: loaded from: classes5.dex */
public final class wqa extends ofs {
    public final uqa b;
    public final uqa c;
    public final CardIdentity d;

    public wqa(uqa uqaVar, uqa uqaVar2, CardIdentity cardIdentity) {
        uqaVar2.getClass();
        this.b = uqaVar;
        this.c = uqaVar2;
        this.d = cardIdentity;
    }

    @Override // a.ofs
    public final CardIdentity a() {
        return this.d;
    }

    @Override // a.ofs
    public final ofs b(CardIdentity cardIdentity) {
        uqa uqaVar = this.c;
        uqaVar.getClass();
        return new wqa(this.b, uqaVar, cardIdentity);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqa)) {
            return false;
        }
        wqa wqaVar = (wqa) obj;
        return this.b.equals(wqaVar.b) && Intrinsics.d(this.c, wqaVar.c) && this.d.equals(wqaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "CardWithTimerUiModel(contentItem=" + this.b + ", timerItem=" + this.c + ", cardIdentity=" + this.d + Separators.RPAREN;
    }
}
