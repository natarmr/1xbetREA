package a;

import android.gov.nist.core.Separators;
import org.xplatform.game_broadcasting.api.presentation.models.events.BroadcastingLandscapeVideoEvent;

/* JADX INFO: loaded from: classes4.dex */
public final class sss implements uss {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BroadcastingLandscapeVideoEvent f32741a;

    public final boolean equals(Object obj) {
        if (obj instanceof sss) {
            return this.f32741a.equals(((sss) obj).f32741a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32741a.hashCode();
    }

    public final String toString() {
        return "OnFullScreenExitClick(videoEvent=" + this.f32741a + Separators.RPAREN;
    }
}
