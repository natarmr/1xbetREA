package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;

/* JADX INFO: loaded from: classes5.dex */
public final class kfa extends ofs {
    public final String b;
    public final CardIdentity c;

    public kfa(String str, CardIdentity cardIdentity) {
        str.getClass();
        this.b = str;
        this.c = cardIdentity;
    }

    @Override // a.ofs
    public final CardIdentity a() {
        return this.c;
    }

    @Override // a.ofs
    public final ofs b(CardIdentity cardIdentity) {
        String str = this.b;
        str.getClass();
        return new kfa(str, cardIdentity);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kfa)) {
            return false;
        }
        kfa kfaVar = (kfa) obj;
        return Intrinsics.d(this.b, kfaVar.b) && this.c.equals(kfaVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "CardErrorUiModel(errorMessage=" + this.b + ", cardIdentity=" + this.c + Separators.RPAREN;
    }
}
