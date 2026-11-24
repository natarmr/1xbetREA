package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class lwx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FrameLayout f20785a;
    public final RoundCornerImageView b;
    public final TextView c;

    public lwx(FrameLayout frameLayout, RoundCornerImageView roundCornerImageView, TextView textView) {
        this.f20785a = frameLayout;
        this.b = roundCornerImageView;
        this.c = textView;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f20785a;
    }
}
