package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.swiperefreshlayout.SwipeRefreshLayout;
import org.xplatform.uikit.components.authorization_buttons.DsAuthorizationButtons;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p1w extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1w f26224a = new p1w(1, t1w.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/bethistory/impl/databinding/HistoryFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.appBar;
        AppBarLayout appBarLayout = (AppBarLayout) yum0.f(view, R.id.appBar);
        if (appBarLayout != null) {
            i = R.id.auth_buttons_view;
            DsAuthorizationButtons dsAuthorizationButtons = (DsAuthorizationButtons) yum0.f(view, R.id.auth_buttons_view);
            if (dsAuthorizationButtons != null) {
                i = R.id.bg_swipe_progress;
                View viewF = yum0.f(view, R.id.bg_swipe_progress);
                if (viewF != null) {
                    i = R.id.cl_actions;
                    ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(view, R.id.cl_actions);
                    if (constraintLayout != null) {
                        i = R.id.cl_balance;
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) yum0.f(view, R.id.cl_balance);
                        if (constraintLayout2 != null) {
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) view;
                            i = R.id.cl_need_auth_container;
                            ConstraintLayout constraintLayout4 = (ConstraintLayout) yum0.f(view, R.id.cl_need_auth_container);
                            if (constraintLayout4 != null) {
                                i = R.id.content;
                                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) yum0.f(view, R.id.content);
                                if (coordinatorLayout != null) {
                                    i = R.id.frame_progress;
                                    FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.frame_progress);
                                    if (frameLayout != null) {
                                        i = R.id.historyToolbar;
                                        DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.historyToolbar);
                                        if (dsNavigationBar != null) {
                                            i = R.id.iv_date;
                                            if (((ImageView) yum0.f(view, R.id.iv_date)) != null) {
                                                i = R.id.iv_pay_in;
                                                if (((ImageView) yum0.f(view, R.id.iv_pay_in)) != null) {
                                                    i = R.id.iv_sale;
                                                    if (((ImageView) yum0.f(view, R.id.iv_sale)) != null) {
                                                        i = R.id.ll_date;
                                                        LinearLayout linearLayout = (LinearLayout) yum0.f(view, R.id.ll_date);
                                                        if (linearLayout != null) {
                                                            i = R.id.ll_pay_in;
                                                            LinearLayout linearLayout2 = (LinearLayout) yum0.f(view, R.id.ll_pay_in);
                                                            if (linearLayout2 != null) {
                                                                i = R.id.ll_sale;
                                                                LinearLayout linearLayout3 = (LinearLayout) yum0.f(view, R.id.ll_sale);
                                                                if (linearLayout3 != null) {
                                                                    i = R.id.lottieEmptyView;
                                                                    LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieEmptyView);
                                                                    if (lottieView != null) {
                                                                        i = R.id.progress_bar_history;
                                                                        if (((ProgressBar) yum0.f(view, R.id.progress_bar_history)) != null) {
                                                                            i = R.id.rvHistory;
                                                                            RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.rvHistory);
                                                                            if (recyclerView != null) {
                                                                                i = R.id.swipeRefreshView;
                                                                                SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) yum0.f(view, R.id.swipeRefreshView);
                                                                                if (swipeRefreshLayout != null) {
                                                                                    i = R.id.toolbarLayout;
                                                                                    if (((CollapsingToolbarLayout) yum0.f(view, R.id.toolbarLayout)) != null) {
                                                                                        i = R.id.tv_balance_money;
                                                                                        TextView textView = (TextView) yum0.f(view, R.id.tv_balance_money);
                                                                                        if (textView != null) {
                                                                                            i = R.id.tv_balance_name;
                                                                                            TextView textView2 = (TextView) yum0.f(view, R.id.tv_balance_name);
                                                                                            if (textView2 != null) {
                                                                                                i = R.id.tv_date;
                                                                                                TextView textView3 = (TextView) yum0.f(view, R.id.tv_date);
                                                                                                if (textView3 != null) {
                                                                                                    i = R.id.tv_pay_in;
                                                                                                    if (((TextView) yum0.f(view, R.id.tv_pay_in)) != null) {
                                                                                                        i = R.id.tv_sale;
                                                                                                        if (((TextView) yum0.f(view, R.id.tv_sale)) != null) {
                                                                                                            i = R.id.tv_show_all_balances;
                                                                                                            if (((TextView) yum0.f(view, R.id.tv_show_all_balances)) != null) {
                                                                                                                return new t1w(constraintLayout3, appBarLayout, dsAuthorizationButtons, viewF, constraintLayout, constraintLayout2, constraintLayout4, coordinatorLayout, frameLayout, dsNavigationBar, linearLayout, linearLayout2, linearLayout3, lottieView, recyclerView, swipeRefreshLayout, textView, textView2, textView3);
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
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
