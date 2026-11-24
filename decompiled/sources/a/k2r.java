package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.MaterialToolbar;
import org.xplatform.games_section.feature.weekly_reward.presentation.custom_veiw.DaysProgressView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes4.dex */
public final class k2r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f17588a;
    public final DaysProgressView b;
    public final AppCompatImageView c;
    public final ImageView d;
    public final LottieView e;
    public final FrameLayout f;
    public final MaterialToolbar g;
    public final TextView h;
    public final TextView i;
    public final ViewPager2 j;

    public k2r(ConstraintLayout constraintLayout, DaysProgressView daysProgressView, AppCompatImageView appCompatImageView, ImageView imageView, LottieView lottieView, FrameLayout frameLayout, MaterialToolbar materialToolbar, TextView textView, TextView textView2, ViewPager2 viewPager2) {
        this.f17588a = constraintLayout;
        this.b = daysProgressView;
        this.c = appCompatImageView;
        this.d = imageView;
        this.e = lottieView;
        this.f = frameLayout;
        this.g = materialToolbar;
        this.h = textView;
        this.i = textView2;
        this.j = viewPager2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f17588a;
    }
}
