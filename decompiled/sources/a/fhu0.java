package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.media3.ui.PlayerView;
import org.xplatform.game_broadcasting.impl.presentation.video.GameVideoView;
import org.xplatform.game_broadcasting.impl.presentation.views.GameBroadcastingControlPanelView;

/* JADX INFO: loaded from: classes4.dex */
public final class fhu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GameVideoView f9560a;
    public final ImageView b;
    public final View c;
    public final ProgressBar d;
    public final ImageView e;
    public final PlayerView f;
    public final GameBroadcastingControlPanelView g;

    public fhu0(GameVideoView gameVideoView, ImageView imageView, View view, ProgressBar progressBar, ImageView imageView2, PlayerView playerView, GameBroadcastingControlPanelView gameBroadcastingControlPanelView) {
        this.f9560a = gameVideoView;
        this.b = imageView;
        this.c = view;
        this.d = progressBar;
        this.e = imageView2;
        this.f = playerView;
        this.g = gameBroadcastingControlPanelView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f9560a;
    }
}
