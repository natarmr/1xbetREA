package a;

import android.gov.nist.core.Separators;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;

/* JADX INFO: loaded from: classes5.dex */
public final class q49 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GameBroadcastingParams f28086a;

    public q49(GameBroadcastingParams gameBroadcastingParams) {
        this.f28086a = gameBroadcastingParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q49) && this.f28086a.equals(((q49) obj).f28086a);
    }

    public final int hashCode() {
        return this.f28086a.hashCode();
    }

    public final String toString() {
        return "OneXZone(params=" + this.f28086a + Separators.RPAREN;
    }
}
