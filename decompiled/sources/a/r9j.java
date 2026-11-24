package a;

import android.gov.nist.core.Separators;
import org.xplatform.game_broadcasting.api.presentation.models.GameBroadcastingParams;

/* JADX INFO: loaded from: classes5.dex */
public final class r9j implements u9j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GameBroadcastingParams f30084a;

    public final boolean equals(Object obj) {
        if (obj instanceof r9j) {
            return this.f30084a.equals(((r9j) obj).f30084a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f30084a.hashCode();
    }

    public final String toString() {
        return "Player(params=" + this.f30084a + Separators.RPAREN;
    }
}
