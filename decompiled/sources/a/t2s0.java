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
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.games_section.feature.daily_tournament.presentation.ForegroundImageView;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class t2s0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t2s0 f33231a = new t2s0(1, o2r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/games_section/feature/daily_tournament/databinding/FragmentPagerDailyTournamentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.action;
        if (((FloatingActionButton) yum0.f(view, R.id.action)) != null) {
            i = R.id.app_bar_layout;
            AppBarLayout appBarLayout = (AppBarLayout) yum0.f(view, R.id.app_bar_layout);
            if (appBarLayout != null) {
                i = R.id.cLayout2;
                ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(view, R.id.cLayout2);
                if (constraintLayout != null) {
                    i = R.id.clText;
                    FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.clText);
                    if (frameLayout != null) {
                        i = R.id.collapsingToolbarLayout;
                        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) yum0.f(view, R.id.collapsingToolbarLayout);
                        if (collapsingToolbarLayout != null) {
                            i = R.id.ivBanner;
                            ForegroundImageView foregroundImageView = (ForegroundImageView) yum0.f(view, R.id.ivBanner);
                            if (foregroundImageView != null) {
                                i = R.id.ivBannerPrize;
                                ImageView imageView = (ImageView) yum0.f(view, R.id.ivBannerPrize);
                                if (imageView != null) {
                                    i = R.id.segments;
                                    DsSegmentedGroup dsSegmentedGroup = (DsSegmentedGroup) yum0.f(view, R.id.segments);
                                    if (dsSegmentedGroup != null) {
                                        i = R.id.segmentsContainer;
                                        if (((FrameLayout) yum0.f(view, R.id.segmentsContainer)) != null) {
                                            i = R.id.text;
                                            if (((TextView) yum0.f(view, R.id.text)) != null) {
                                                i = R.id.toolbarNews;
                                                MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.toolbarNews);
                                                if (materialToolbar != null) {
                                                    i = R.id.tvPlace;
                                                    if (((TextView) yum0.f(view, R.id.tvPlace)) != null) {
                                                        i = R.id.tvPlaceValue;
                                                        TextView textView = (TextView) yum0.f(view, R.id.tvPlaceValue);
                                                        if (textView != null) {
                                                            i = R.id.tvPoints;
                                                            if (((TextView) yum0.f(view, R.id.tvPoints)) != null) {
                                                                i = R.id.tvPointsValue;
                                                                TextView textView2 = (TextView) yum0.f(view, R.id.tvPointsValue);
                                                                if (textView2 != null) {
                                                                    i = R.id.vpNewsViewPager;
                                                                    ViewPager2 viewPager2 = (ViewPager2) yum0.f(view, R.id.vpNewsViewPager);
                                                                    if (viewPager2 != null) {
                                                                        return new o2r((CoordinatorLayout) view, appBarLayout, constraintLayout, frameLayout, collapsingToolbarLayout, foregroundImageView, imageView, dsSegmentedGroup, materialToolbar, textView, textView2, viewPager2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
