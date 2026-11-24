package a;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j6y extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j6y f16013a = new j6y(1, j2r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/games_section/feature/jackpot/databinding/FragmentOneXGamesJackpotFgBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.back_layout;
        ImageView imageView = (ImageView) yum0.f(view, R.id.back_layout);
        if (imageView != null) {
            i = R.id.day;
            TextView textView = (TextView) yum0.f(view, R.id.day);
            if (textView != null) {
                i = R.id.empty_view;
                LottieView lottieView = (LottieView) yum0.f(view, R.id.empty_view);
                if (lottieView != null) {
                    i = R.id.front_layout;
                    ImageView imageView2 = (ImageView) yum0.f(view, R.id.front_layout);
                    if (imageView2 != null) {
                        i = R.id.gradient_top_layout;
                        if (((ImageView) yum0.f(view, R.id.gradient_top_layout)) != null) {
                            i = R.id.guideline_3;
                            if (((Guideline) yum0.f(view, R.id.guideline_3)) != null) {
                                i = R.id.hour;
                                TextView textView2 = (TextView) yum0.f(view, R.id.hour);
                                if (textView2 != null) {
                                    i = R.id.iv_rules;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(view, R.id.iv_rules);
                                    if (appCompatImageView != null) {
                                        i = R.id.jackpot_items;
                                        ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(view, R.id.jackpot_items);
                                        if (constraintLayout != null) {
                                            i = R.id.month;
                                            TextView textView3 = (TextView) yum0.f(view, R.id.month);
                                            if (textView3 != null) {
                                                i = R.id.picture_iv;
                                                ImageView imageView3 = (ImageView) yum0.f(view, R.id.picture_iv);
                                                if (imageView3 != null) {
                                                    i = R.id.toolbar;
                                                    MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.toolbar);
                                                    if (materialToolbar != null) {
                                                        i = R.id.tv_title;
                                                        if (((TextView) yum0.f(view, R.id.tv_title)) != null) {
                                                            i = R.id.week;
                                                            TextView textView4 = (TextView) yum0.f(view, R.id.week);
                                                            if (textView4 != null) {
                                                                return new j2r((ConstraintLayout) view, imageView, textView, lottieView, imageView2, textView2, appCompatImageView, constraintLayout, textView3, imageView3, materialToolbar, textView4);
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
