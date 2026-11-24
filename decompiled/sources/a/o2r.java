package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import org.xplatform.games_section.feature.daily_tournament.presentation.ForegroundImageView;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class o2r implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CoordinatorLayout f24545a;
    public final AppBarLayout b;
    public final ConstraintLayout c;
    public final FrameLayout d;
    public final CollapsingToolbarLayout e;
    public final ForegroundImageView f;
    public final ImageView g;
    public final DsSegmentedGroup h;
    public final MaterialToolbar i;
    public final TextView j;
    public final TextView k;
    public final ViewPager2 l;

    public o2r(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ConstraintLayout constraintLayout, FrameLayout frameLayout, CollapsingToolbarLayout collapsingToolbarLayout, ForegroundImageView foregroundImageView, ImageView imageView, DsSegmentedGroup dsSegmentedGroup, MaterialToolbar materialToolbar, TextView textView, TextView textView2, ViewPager2 viewPager2) {
        this.f24545a = coordinatorLayout;
        this.b = appBarLayout;
        this.c = constraintLayout;
        this.d = frameLayout;
        this.e = collapsingToolbarLayout;
        this.f = foregroundImageView;
        this.g = imageView;
        this.h = dsSegmentedGroup;
        this.i = materialToolbar;
        this.j = textView;
        this.k = textView2;
        this.l = viewPager2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f24545a;
    }
}
