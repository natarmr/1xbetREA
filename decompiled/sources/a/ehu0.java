package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.GameScreenToolbarView;

/* JADX INFO: loaded from: classes5.dex */
public final class ehu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final GameScreenToolbarView f7826a;
    public final ImageView b;
    public final ImageView c;
    public final ImageView d;
    public final TextView e;

    public ehu0(GameScreenToolbarView gameScreenToolbarView, ImageView imageView, ImageView imageView2, ImageView imageView3, TextView textView) {
        this.f7826a = gameScreenToolbarView;
        this.b = imageView;
        this.c = imageView2;
        this.d = imageView3;
        this.e = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f7826a;
    }
}
