package a;

import android.gov.nist.core.Separators;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;

/* JADX INFO: loaded from: classes5.dex */
public final class cus extends dus {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CardIdentity f5000a;

    public cus(CardIdentity cardIdentity) {
        this.f5000a = cardIdentity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cus) && this.f5000a.equals(((cus) obj).f5000a);
    }

    public final int hashCode() {
        return this.f5000a.hashCode();
    }

    public final String toString() {
        return "InformationTabUiModel(currentCardIdentity=" + this.f5000a + Separators.RPAREN;
    }
}
