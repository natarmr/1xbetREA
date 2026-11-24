package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.xplatform.game_broadcasting.impl.presentation.zone.GameZoneView;

/* JADX INFO: loaded from: classes4.dex */
public final class f0r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f8729a;
    public final GameZoneView b;
    public final TextView c;

    public f0r(FrameLayout frameLayout, GameZoneView gameZoneView, TextView textView) {
        this.f8729a = frameLayout;
        this.b = gameZoneView;
        this.c = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f8729a;
    }
}
