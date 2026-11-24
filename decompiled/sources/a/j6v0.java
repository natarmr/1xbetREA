package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.games_section.feature.weekly_reward.presentation.custom_veiw.DaysProgressView;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j6v0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j6v0 f16009a = new j6v0(1, k2r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/games_section/feature/weekly_reward/databinding/FragmentOnexgamesWeeklyRewardBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.daysProgressView;
        DaysProgressView daysProgressView = (DaysProgressView) yum0.f(view, R.id.daysProgressView);
        if (daysProgressView != null) {
            i = R.id.info;
            AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(view, R.id.info);
            if (appCompatImageView != null) {
                i = R.id.ivBackground;
                ImageView imageView = (ImageView) yum0.f(view, R.id.ivBackground);
                if (imageView != null) {
                    i = R.id.lottieError;
                    LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieError);
                    if (lottieView != null) {
                        i = R.id.progress_view;
                        FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.progress_view);
                        if (frameLayout != null) {
                            i = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.toolbar);
                            if (materialToolbar != null) {
                                i = R.id.tvDayOfDay;
                                TextView textView = (TextView) yum0.f(view, R.id.tvDayOfDay);
                                if (textView != null) {
                                    i = R.id.tvDescription;
                                    TextView textView2 = (TextView) yum0.f(view, R.id.tvDescription);
                                    if (textView2 != null) {
                                        i = R.id.vpDays;
                                        ViewPager2 viewPager2 = (ViewPager2) yum0.f(view, R.id.vpDays);
                                        if (viewPager2 != null) {
                                            return new k2r((ConstraintLayout) view, daysProgressView, appCompatImageView, imageView, lottieView, frameLayout, materialToolbar, textView, textView2, viewPager2);
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
