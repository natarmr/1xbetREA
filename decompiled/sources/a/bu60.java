package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.games_section.feature.cashback.presentation.custom_view.CashbackCardView;
import org.xplatform.games_section.feature.cashback.presentation.custom_view.CashbackMiniCardView;
import org.xplatform.games_section.feature.cashback.presentation.custom_view.CashbackView;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class bu60 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bu60 f3216a = new bu60(1, aza.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/games_section/feature/cashback/databinding/CashbackFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.accountSelection;
        DsAccountSelection dsAccountSelection = (DsAccountSelection) yum0.f(view, R.id.accountSelection);
        if (dsAccountSelection != null) {
            i = R.id.app_bar;
            AppBarLayout appBarLayout = (AppBarLayout) yum0.f(view, R.id.app_bar);
            if (appBarLayout != null) {
                i = R.id.cash_back_loader;
                if (((ProgressBar) yum0.f(view, R.id.cash_back_loader)) != null) {
                    i = R.id.cash_back_progress;
                    CashbackCardView cashbackCardView = (CashbackCardView) yum0.f(view, R.id.cash_back_progress);
                    if (cashbackCardView != null) {
                        i = R.id.collapsing_toolbar;
                        CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) yum0.f(view, R.id.collapsing_toolbar);
                        if (collapsingToolbarLayout != null) {
                            i = R.id.dsLottieError;
                            DsLottieEmpty dsLottieEmpty = (DsLottieEmpty) yum0.f(view, R.id.dsLottieError);
                            if (dsLottieEmpty != null) {
                                i = R.id.first_cash_back;
                                CashbackMiniCardView cashbackMiniCardView = (CashbackMiniCardView) yum0.f(view, R.id.first_cash_back);
                                if (cashbackMiniCardView != null) {
                                    i = R.id.flProgress;
                                    FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.flProgress);
                                    if (frameLayout != null) {
                                        i = R.id.frame;
                                        if (((CoordinatorLayout) yum0.f(view, R.id.frame)) != null) {
                                            i = R.id.iv_info;
                                            if (((ImageView) yum0.f(view, R.id.iv_info)) != null) {
                                                i = R.id.layout_no_game_selected;
                                                ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(view, R.id.layout_no_game_selected);
                                                if (constraintLayout != null) {
                                                    i = R.id.lottie_error;
                                                    LottieView lottieView = (LottieView) yum0.f(view, R.id.lottie_error);
                                                    if (lottieView != null) {
                                                        i = R.id.one_x_bet_choice;
                                                        CashbackMiniCardView cashbackMiniCardView2 = (CashbackMiniCardView) yum0.f(view, R.id.one_x_bet_choice);
                                                        if (cashbackMiniCardView2 != null) {
                                                            i = R.id.one_x_choise;
                                                            if (((TextView) yum0.f(view, R.id.one_x_choise)) != null) {
                                                                i = R.id.scroll_content;
                                                                if (((ConstraintLayout) yum0.f(view, R.id.scroll_content)) != null) {
                                                                    i = R.id.scroll_view;
                                                                    NestedScrollView nestedScrollView = (NestedScrollView) yum0.f(view, R.id.scroll_view);
                                                                    if (nestedScrollView != null) {
                                                                        i = R.id.second_cash_back;
                                                                        CashbackMiniCardView cashbackMiniCardView3 = (CashbackMiniCardView) yum0.f(view, R.id.second_cash_back);
                                                                        if (cashbackMiniCardView3 != null) {
                                                                            i = R.id.toolbar;
                                                                            MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.toolbar);
                                                                            if (materialToolbar != null) {
                                                                                i = R.id.toolbarContainer;
                                                                                if (((AppBarLayout) yum0.f(view, R.id.toolbarContainer)) != null) {
                                                                                    i = R.id.toolbar_content_layout;
                                                                                    LinearLayout linearLayout = (LinearLayout) yum0.f(view, R.id.toolbar_content_layout);
                                                                                    if (linearLayout != null) {
                                                                                        i = R.id.user_choise;
                                                                                        if (((TextView) yum0.f(view, R.id.user_choise)) != null) {
                                                                                            i = R.id.view_cashback;
                                                                                            CashbackView cashbackView = (CashbackView) yum0.f(view, R.id.view_cashback);
                                                                                            if (cashbackView != null) {
                                                                                                return new aza((ConstraintLayout) view, dsAccountSelection, appBarLayout, cashbackCardView, collapsingToolbarLayout, dsLottieEmpty, cashbackMiniCardView, frameLayout, constraintLayout, lottieView, cashbackMiniCardView2, nestedScrollView, cashbackMiniCardView3, materialToolbar, linearLayout, cashbackView);
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
