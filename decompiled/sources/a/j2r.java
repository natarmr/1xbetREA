package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.appbar.MaterialToolbar;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes4.dex */
public final class j2r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f15795a;
    public final ImageView b;
    public final TextView c;
    public final LottieView d;
    public final ImageView e;
    public final TextView f;
    public final AppCompatImageView g;
    public final ConstraintLayout h;
    public final TextView i;
    public final ImageView j;
    public final MaterialToolbar k;
    public final TextView l;

    public j2r(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, LottieView lottieView, ImageView imageView2, TextView textView2, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout2, TextView textView3, ImageView imageView3, MaterialToolbar materialToolbar, TextView textView4) {
        this.f15795a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = lottieView;
        this.e = imageView2;
        this.f = textView2;
        this.g = appCompatImageView;
        this.h = constraintLayout2;
        this.i = textView3;
        this.j = imageView3;
        this.k = materialToolbar;
        this.l = textView4;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f15795a;
    }
}
