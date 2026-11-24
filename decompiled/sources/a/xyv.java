package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes5.dex */
public final class xyv implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f41724a;
    public final FrameLayout b;
    public final FrameLayout c;
    public final ImageView d;
    public final RoundCornerImageView e;
    public final RoundCornerImageView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final TextView m;

    public xyv(ConstraintLayout constraintLayout, FrameLayout frameLayout, FrameLayout frameLayout2, ImageView imageView, RoundCornerImageView roundCornerImageView, RoundCornerImageView roundCornerImageView2, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7) {
        this.f41724a = constraintLayout;
        this.b = frameLayout;
        this.c = frameLayout2;
        this.d = imageView;
        this.e = roundCornerImageView;
        this.f = roundCornerImageView2;
        this.g = textView;
        this.h = textView2;
        this.i = textView3;
        this.j = textView4;
        this.k = textView5;
        this.l = textView6;
        this.m = textView7;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f41724a;
    }
}
