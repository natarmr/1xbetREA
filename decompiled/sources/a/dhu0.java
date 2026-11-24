package a;

import android.view.View;
import android.widget.ImageView;
import org.xplatform.game_broadcasting.impl.presentation.views.GameBroadcastingControlPanelView;

/* JADX INFO: loaded from: classes4.dex */
public final class dhu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GameBroadcastingControlPanelView f6109a;
    public final ImageView b;
    public final ImageView c;
    public final ImageView d;
    public final ImageView e;
    public final ImageView f;

    public dhu0(GameBroadcastingControlPanelView gameBroadcastingControlPanelView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5) {
        this.f6109a = gameBroadcastingControlPanelView;
        this.b = imageView;
        this.c = imageView2;
        this.d = imageView3;
        this.e = imageView4;
        this.f = imageView5;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f6109a;
    }
}
