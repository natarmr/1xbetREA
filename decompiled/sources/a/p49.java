package a;

import android.gov.nist.core.Separators;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;

/* JADX INFO: loaded from: classes5.dex */
public final class p49 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GameBroadcastingParams f26341a;

    public p49(GameBroadcastingParams gameBroadcastingParams) {
        this.f26341a = gameBroadcastingParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p49) && this.f26341a.equals(((p49) obj).f26341a);
    }

    public final int hashCode() {
        return this.f26341a.hashCode();
    }

    public final String toString() {
        return "LiveVideo(params=" + this.f26341a + Separators.RPAREN;
    }
}
