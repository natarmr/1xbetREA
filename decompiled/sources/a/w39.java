package a;

import android.gov.nist.core.Separators;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;
import org.xplatform.game_broadcasting.api.presentation.models.GameVideoUiConfig;

/* JADX INFO: loaded from: classes5.dex */
public final class w39 implements y39 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GameBroadcastingParams f38490a;
    public final GameVideoUiConfig b;

    public w39(GameBroadcastingParams gameBroadcastingParams, GameVideoUiConfig gameVideoUiConfig) {
        this.f38490a = gameBroadcastingParams;
        this.b = gameVideoUiConfig;
        dja djaVar = dja.PENALTY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w39)) {
            return false;
        }
        w39 w39Var = (w39) obj;
        return this.f38490a.equals(w39Var.f38490a) && this.b.equals(w39Var.b);
    }

    @Override // a.y39
    public final dja getKey() {
        return dja.BROADCASTING_VIDEO;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f38490a.hashCode() * 31);
    }

    public final String toString() {
        return "LiveVideo(params=" + this.f38490a + ", gameConfig=" + this.b + Separators.RPAREN;
    }
}
