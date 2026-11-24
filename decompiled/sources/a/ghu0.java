package a;

import android.view.View;
import android.widget.ProgressBar;
import org.xplatform.game_broadcasting.impl.presentation.views.GameBroadcastingControlPanelView;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneView;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneWebView;

/* JADX INFO: loaded from: classes4.dex */
public final class ghu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GameZoneView f11317a;
    public final View b;
    public final ProgressBar c;
    public final GameZoneWebView d;
    public final GameBroadcastingControlPanelView e;

    public ghu0(GameZoneView gameZoneView, View view, ProgressBar progressBar, GameZoneWebView gameZoneWebView, GameBroadcastingControlPanelView gameBroadcastingControlPanelView) {
        this.f11317a = gameZoneView;
        this.b = view;
        this.c = progressBar;
        this.d = gameZoneWebView;
        this.e = gameBroadcastingControlPanelView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f11317a;
    }
}
