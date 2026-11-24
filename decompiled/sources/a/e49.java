package a;

import org.xplatform.game_broadcasting.api.presentation.models.events.BroadcastingLandscapeVideoEvent;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e49 {
    public static final boolean a(BroadcastingLandscapeVideoEvent broadcastingLandscapeVideoEvent) {
        if (broadcastingLandscapeVideoEvent.equals(BroadcastingLandscapeVideoEvent.Fullscreen.f46693a)) {
            return true;
        }
        if (broadcastingLandscapeVideoEvent.equals(BroadcastingLandscapeVideoEvent.Stop.f46694a) || broadcastingLandscapeVideoEvent.equals(BroadcastingLandscapeVideoEvent.Windowed.f46695a)) {
            return false;
        }
        t9f.b();
        return false;
    }
}
