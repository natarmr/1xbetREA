package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import org.xplatform.bonus_games.impl.core.presentation.views.ForegroundImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class ciu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f4432a;
    public final ImageView b;
    public final ForegroundImageView c;

    public ciu0(FrameLayout frameLayout, ImageView imageView, ForegroundImageView foregroundImageView) {
        this.f4432a = frameLayout;
        this.b = imageView;
        this.c = foregroundImageView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f4432a;
    }
}
