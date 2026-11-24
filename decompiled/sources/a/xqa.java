package a;

import android.gov.nist.core.Separators;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;

/* JADX INFO: loaded from: classes5.dex */
public final class xqa implements ara {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GameBroadcastingParams f41306a;

    public xqa(GameBroadcastingParams gameBroadcastingParams) {
        dja djaVar = dja.PENALTY;
        this.f41306a = gameBroadcastingParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqa)) {
            return false;
        }
        dja djaVar = dja.PENALTY;
        return this.f41306a.equals(((xqa) obj).f41306a);
    }

    @Override // a.cja
    public final dja getType() {
        return dja.BROADCASTING_ZONE;
    }

    public final int hashCode() {
        return this.f41306a.hashCode() + (dja.BROADCASTING_ZONE.hashCode() * 31);
    }

    public final String toString() {
        return "Player(type=" + dja.BROADCASTING_ZONE + ", params=" + this.f41306a + Separators.RPAREN;
    }
}
