package a;

import android.gov.nist.core.Separators;
import org.xplatform.sportgame.navigation.api.presentation.GameScreenGeneralParams;

/* JADX INFO: loaded from: classes3.dex */
public final class n8h0 implements e9h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GameScreenGeneralParams f23088a;

    public n8h0(GameScreenGeneralParams gameScreenGeneralParams) {
        this.f23088a = gameScreenGeneralParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8h0) && this.f23088a.equals(((n8h0) obj).f23088a);
    }

    public final int hashCode() {
        return this.f23088a.hashCode();
    }

    public final String toString() {
        return "HandleGameBackAction(gameScreenGeneralParams=" + this.f23088a + Separators.RPAREN;
    }
}
