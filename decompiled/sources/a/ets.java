package a;

import android.gov.nist.core.Separators;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;

/* JADX INFO: loaded from: classes5.dex */
public final class ets implements fts {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GameBroadcastingParams f8390a;

    public ets(GameBroadcastingParams gameBroadcastingParams) {
        this.f8390a = gameBroadcastingParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ets) && this.f8390a.equals(((ets) obj).f8390a);
    }

    public final int hashCode() {
        return this.f8390a.hashCode();
    }

    public final String toString() {
        return "Visible(gameBroadcastingParams=" + this.f8390a + Separators.RPAREN;
    }
}
