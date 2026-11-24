package a;

import android.gov.nist.core.Separators;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;

/* JADX INFO: loaded from: classes5.dex */
public final class x39 implements y39 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GameBroadcastingParams f40206a;

    public x39(GameBroadcastingParams gameBroadcastingParams) {
        this.f40206a = gameBroadcastingParams;
        dja djaVar = dja.PENALTY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x39) && this.f40206a.equals(((x39) obj).f40206a);
    }

    @Override // a.y39
    public final dja getKey() {
        return dja.BROADCASTING_ZONE;
    }

    public final int hashCode() {
        return this.f40206a.hashCode();
    }

    public final String toString() {
        return "OneXZone(params=" + this.f40206a + Separators.RPAREN;
    }
}
