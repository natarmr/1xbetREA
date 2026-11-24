package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.feature.fin_bet.impl.presentation.view.FinBetView;
import org.xplatform.ui_core.viewcomponents.layouts.frame.ProgressBarWithSandClockNew;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f6q extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f6q f9025a = new f6q(1, j6q.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/feature/fin_bet/impl/databinding/FinBetFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.balanceGroup;
        Group group = (Group) yum0.f(view, R.id.balanceGroup);
        if (group != null) {
            i = R.id.content;
            Group group2 = (Group) yum0.f(view, R.id.content);
            if (group2 != null) {
                i = R.id.emptyView;
                FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.emptyView);
                if (frameLayout != null) {
                    i = R.id.finBetView;
                    FinBetView finBetView = (FinBetView) yum0.f(view, R.id.finBetView);
                    if (finBetView != null) {
                        i = R.id.graphProgressBar;
                        ProgressBarWithSandClockNew progressBarWithSandClockNew = (ProgressBarWithSandClockNew) yum0.f(view, R.id.graphProgressBar);
                        if (progressBarWithSandClockNew != null) {
                            i = R.id.ivBalancesArrowDown;
                            if (((AppCompatImageView) yum0.f(view, R.id.ivBalancesArrowDown)) != null) {
                                i = R.id.ivDeltaArrow;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) yum0.f(view, R.id.ivDeltaArrow);
                                if (appCompatImageView != null) {
                                    i = R.id.ivTitleArrowDown;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) yum0.f(view, R.id.ivTitleArrowDown);
                                    if (appCompatImageView2 != null) {
                                        i = R.id.lottieEv;
                                        LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieEv);
                                        if (lottieView != null) {
                                            i = R.id.navigationBar;
                                            DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
                                            if (dsNavigationBarBasic != null) {
                                                i = R.id.quickBetLayout;
                                                FrameLayout frameLayout2 = (FrameLayout) yum0.f(view, R.id.quickBetLayout);
                                                if (frameLayout2 != null) {
                                                    i = R.id.quickBetView;
                                                    View viewF = yum0.f(view, R.id.quickBetView);
                                                    if (viewF != null) {
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                        i = R.id.toolbarLayout;
                                                        if (((ConstraintLayout) yum0.f(view, R.id.toolbarLayout)) != null) {
                                                            i = R.id.tradeBarrier;
                                                            if (((Barrier) yum0.f(view, R.id.tradeBarrier)) != null) {
                                                                i = R.id.tradeInfoBack;
                                                                View viewF2 = yum0.f(view, R.id.tradeInfoBack);
                                                                if (viewF2 != null) {
                                                                    i = R.id.tvAllBalances;
                                                                    if (((TextView) yum0.f(view, R.id.tvAllBalances)) != null) {
                                                                        i = R.id.tvBalanceTitle;
                                                                        TextView textView = (TextView) yum0.f(view, R.id.tvBalanceTitle);
                                                                        if (textView != null) {
                                                                            i = R.id.tvBalanceValue;
                                                                            TextView textView2 = (TextView) yum0.f(view, R.id.tvBalanceValue);
                                                                            if (textView2 != null) {
                                                                                i = R.id.tvCurrentLevelValue;
                                                                                TextView textView3 = (TextView) yum0.f(view, R.id.tvCurrentLevelValue);
                                                                                if (textView3 != null) {
                                                                                    i = R.id.tvDeltaLevelValueTv;
                                                                                    TextView textView4 = (TextView) yum0.f(view, R.id.tvDeltaLevelValueTv);
                                                                                    if (textView4 != null) {
                                                                                        i = R.id.tvStartLevel;
                                                                                        if (((TextView) yum0.f(view, R.id.tvStartLevel)) != null) {
                                                                                            i = R.id.tvStartLevelValue;
                                                                                            TextView textView5 = (TextView) yum0.f(view, R.id.tvStartLevelValue);
                                                                                            if (textView5 != null) {
                                                                                                i = R.id.tvTitleInstrument;
                                                                                                TextView textView6 = (TextView) yum0.f(view, R.id.tvTitleInstrument);
                                                                                                if (textView6 != null) {
                                                                                                    i = R.id.tvTradeClosing;
                                                                                                    TextView textView7 = (TextView) yum0.f(view, R.id.tvTradeClosing);
                                                                                                    if (textView7 != null) {
                                                                                                        i = R.id.tvTradeClosingValue;
                                                                                                        TextView textView8 = (TextView) yum0.f(view, R.id.tvTradeClosingValue);
                                                                                                        if (textView8 != null) {
                                                                                                            return new j6q(constraintLayout, group, group2, frameLayout, finBetView, progressBarWithSandClockNew, appCompatImageView, appCompatImageView2, lottieView, dsNavigationBarBasic, frameLayout2, viewF, constraintLayout, viewF2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8);
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
