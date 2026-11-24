package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import org.xplatform.ui_core.viewcomponents.imageview.RoundCornerImageView;

/* JADX INFO: loaded from: classes.dex */
public final class tsx implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f34484a;
    public final FlexboxLayout b;
    public final FlexboxLayout c;
    public final ImageView d;
    public final ImageView e;
    public final RoundCornerImageView f;
    public final RoundCornerImageView g;
    public final ScrollView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;

    public tsx(ConstraintLayout constraintLayout, FlexboxLayout flexboxLayout, FlexboxLayout flexboxLayout2, ImageView imageView, ImageView imageView2, RoundCornerImageView roundCornerImageView, RoundCornerImageView roundCornerImageView2, ScrollView scrollView, TextView textView, TextView textView2, TextView textView3) {
        this.f34484a = constraintLayout;
        this.b = flexboxLayout;
        this.c = flexboxLayout2;
        this.d = imageView;
        this.e = imageView2;
        this.f = roundCornerImageView;
        this.g = roundCornerImageView2;
        this.h = scrollView;
        this.i = textView;
        this.j = textView2;
        this.k = textView3;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f34484a;
    }
}
