package a;

import android.gov.nist.core.Separators;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;

/* JADX INFO: loaded from: classes5.dex */
public final class poa implements soa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GameBroadcastingParams f27319a;

    public poa(GameBroadcastingParams gameBroadcastingParams) {
        dja djaVar = dja.PENALTY;
        this.f27319a = gameBroadcastingParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof poa)) {
            return false;
        }
        dja djaVar = dja.PENALTY;
        return this.f27319a.equals(((poa) obj).f27319a);
    }

    @Override // a.cja
    public final dja getType() {
        return dja.BROADCASTING_VIDEO;
    }

    public final int hashCode() {
        return this.f27319a.hashCode() + (dja.BROADCASTING_VIDEO.hashCode() * 31);
    }

    public final String toString() {
        return "Player(type=" + dja.BROADCASTING_VIDEO + ", params=" + this.f27319a + Separators.RPAREN;
    }
}
