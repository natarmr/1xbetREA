package a;

import android.view.View;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.facebook.shimmer.ShimmerFrameLayout;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoContainerView;
import org.xplatform.sportgame.classic.impl.presentation.legacy.views.matchinfo.MatchInfoTabsContainerView;
import org.xplatform.ui_core.circleindicator.CircleIndicator;
import org.xplatform.ui_core.viewcomponents.views.FrozenRecyclerView;

/* JADX INFO: loaded from: classes5.dex */
public final class zhu0 implements yfu0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MatchInfoContainerView f44411a;
    public final ComposeView b;
    public final CircleIndicator c;
    public final CircleIndicator d;
    public final ConstraintLayout e;
    public final MatchInfoTabsContainerView f;
    public final ImageView g;
    public final FrozenRecyclerView h;
    public final RecyclerView i;
    public final ShimmerFrameLayout j;
    public final ViewPager2 k;

    public zhu0(MatchInfoContainerView matchInfoContainerView, ComposeView composeView, CircleIndicator circleIndicator, CircleIndicator circleIndicator2, ConstraintLayout constraintLayout, MatchInfoTabsContainerView matchInfoTabsContainerView, ImageView imageView, FrozenRecyclerView frozenRecyclerView, RecyclerView recyclerView, ShimmerFrameLayout shimmerFrameLayout, ViewPager2 viewPager2) {
        this.f44411a = matchInfoContainerView;
        this.b = composeView;
        this.c = circleIndicator;
        this.d = circleIndicator2;
        this.e = constraintLayout;
        this.f = matchInfoTabsContainerView;
        this.g = imageView;
        this.h = frozenRecyclerView;
        this.i = recyclerView;
        this.j = shimmerFrameLayout;
        this.k = viewPager2;
    }

    @Override // a.yfu0
    public final View getRoot() {
        return this.f44411a;
    }
}
