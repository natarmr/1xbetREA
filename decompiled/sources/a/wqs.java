package a;

import android.gov.nist.core.Separators;
import org.xplatform.sportgame.classic.impl.presentation.legacy.models.CardIdentity;

/* JADX INFO: loaded from: classes5.dex */
public final class wqs {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xqs f39607a;
    public final int b;
    public final CardIdentity c;

    public wqs(xqs xqsVar, int i, CardIdentity cardIdentity) {
        this.f39607a = xqsVar;
        this.b = i;
        this.c = cardIdentity;
    }

    public static wqs a(wqs wqsVar, xqs xqsVar, int i, CardIdentity cardIdentity, int i2) {
        if ((i2 & 1) != 0) {
            xqsVar = wqsVar.f39607a;
        }
        if ((i2 & 2) != 0) {
            i = wqsVar.b;
        }
        if ((i2 & 4) != 0) {
            cardIdentity = wqsVar.c;
        }
        wqsVar.getClass();
        return new wqs(xqsVar, i, cardIdentity);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqs)) {
            return false;
        }
        wqs wqsVar = (wqs) obj;
        return this.f39607a == wqsVar.f39607a && this.b == wqsVar.b && this.c.equals(wqsVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f39607a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "GameScreenCardTabsModel(currentTab=" + this.f39607a + ", broadcastingPosition=" + this.b + ", cardIdentity=" + this.c + Separators.RPAREN;
    }
}
