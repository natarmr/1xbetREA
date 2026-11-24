package a;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.TicketDividerWithShadowLayout;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class brb0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final brb0 f3072a = new brb0(1, a3r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/bethistory/impl/databinding/FragmentPowerbetBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.btnPowerbet;
        Button button = (Button) yum0.f(view, R.id.btnPowerbet);
        if (button != null) {
            i = R.id.clCoefChange;
            if (((ConstraintLayout) yum0.f(view, R.id.clCoefChange)) != null) {
                i = R.id.clPossibleWinChange;
                if (((ConstraintLayout) yum0.f(view, R.id.clPossibleWinChange)) != null) {
                    i = R.id.clStakeChange;
                    if (((ConstraintLayout) yum0.f(view, R.id.clStakeChange)) != null) {
                        i = R.id.clStakeSumChange;
                        if (((ConstraintLayout) yum0.f(view, R.id.clStakeSumChange)) != null) {
                            i = R.id.couponDivider;
                            if (((TicketDividerWithShadowLayout) yum0.f(view, R.id.couponDivider)) != null) {
                                i = R.id.couponHeaderDivider;
                                if (((TicketDividerWithShadowLayout) yum0.f(view, R.id.couponHeaderDivider)) != null) {
                                    i = R.id.errorView;
                                    LottieView lottieView = (LottieView) yum0.f(view, R.id.errorView);
                                    if (lottieView != null) {
                                        i = R.id.flBtnPowerbet;
                                        FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.flBtnPowerbet);
                                        if (frameLayout != null) {
                                            i = R.id.ivCoefChange;
                                            if (((ImageView) yum0.f(view, R.id.ivCoefChange)) != null) {
                                                i = R.id.ivPossibleWinChange;
                                                if (((ImageView) yum0.f(view, R.id.ivPossibleWinChange)) != null) {
                                                    i = R.id.ivStakeMarketTypeChange;
                                                    if (((ImageView) yum0.f(view, R.id.ivStakeMarketTypeChange)) != null) {
                                                        i = R.id.ivStakeSumChange;
                                                        if (((ImageView) yum0.f(view, R.id.ivStakeSumChange)) != null) {
                                                            i = R.id.ivStatus;
                                                            ImageView imageView = (ImageView) yum0.f(view, R.id.ivStatus);
                                                            if (imageView != null) {
                                                                i = R.id.llLive;
                                                                LinearLayout linearLayout = (LinearLayout) yum0.f(view, R.id.llLive);
                                                                if (linearLayout != null) {
                                                                    i = R.id.progressBar;
                                                                    ProgressBar progressBar = (ProgressBar) yum0.f(view, R.id.progressBar);
                                                                    if (progressBar != null) {
                                                                        i = R.id.scrollContent;
                                                                        NestedScrollView nestedScrollView = (NestedScrollView) yum0.f(view, R.id.scrollContent);
                                                                        if (nestedScrollView != null) {
                                                                            i = R.id.toolbar;
                                                                            DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.toolbar);
                                                                            if (dsNavigationBar != null) {
                                                                                i = R.id.tvChangeSectionTitle;
                                                                                if (((TextView) yum0.f(view, R.id.tvChangeSectionTitle)) != null) {
                                                                                    i = R.id.tvCoefChange;
                                                                                    if (((TextView) yum0.f(view, R.id.tvCoefChange)) != null) {
                                                                                        i = R.id.tvCoefNew;
                                                                                        TextView textView = (TextView) yum0.f(view, R.id.tvCoefNew);
                                                                                        if (textView != null) {
                                                                                            i = R.id.tvCoefOld;
                                                                                            TextView textView2 = (TextView) yum0.f(view, R.id.tvCoefOld);
                                                                                            if (textView2 != null) {
                                                                                                i = R.id.tvCouponCoef;
                                                                                                if (((TextView) yum0.f(view, R.id.tvCouponCoef)) != null) {
                                                                                                    i = R.id.tvCouponCoefValue;
                                                                                                    TextView textView3 = (TextView) yum0.f(view, R.id.tvCouponCoefValue);
                                                                                                    if (textView3 != null) {
                                                                                                        i = R.id.tvCouponDate;
                                                                                                        TextView textView4 = (TextView) yum0.f(view, R.id.tvCouponDate);
                                                                                                        if (textView4 != null) {
                                                                                                            i = R.id.tvCouponNumber;
                                                                                                            TextView textView5 = (TextView) yum0.f(view, R.id.tvCouponNumber);
                                                                                                            if (textView5 != null) {
                                                                                                                i = R.id.tvCouponType;
                                                                                                                TextView textView6 = (TextView) yum0.f(view, R.id.tvCouponType);
                                                                                                                if (textView6 != null) {
                                                                                                                    i = R.id.tvPossibleWin;
                                                                                                                    if (((TextView) yum0.f(view, R.id.tvPossibleWin)) != null) {
                                                                                                                        i = R.id.tvPossibleWinChange;
                                                                                                                        if (((TextView) yum0.f(view, R.id.tvPossibleWinChange)) != null) {
                                                                                                                            i = R.id.tvPossibleWinNew;
                                                                                                                            TextView textView7 = (TextView) yum0.f(view, R.id.tvPossibleWinNew);
                                                                                                                            if (textView7 != null) {
                                                                                                                                i = R.id.tvPossibleWinOld;
                                                                                                                                TextView textView8 = (TextView) yum0.f(view, R.id.tvPossibleWinOld);
                                                                                                                                if (textView8 != null) {
                                                                                                                                    i = R.id.tvPossibleWinValue;
                                                                                                                                    TextView textView9 = (TextView) yum0.f(view, R.id.tvPossibleWinValue);
                                                                                                                                    if (textView9 != null) {
                                                                                                                                        i = R.id.tvStake;
                                                                                                                                        if (((TextView) yum0.f(view, R.id.tvStake)) != null) {
                                                                                                                                            i = R.id.tvStakeChange;
                                                                                                                                            if (((TextView) yum0.f(view, R.id.tvStakeChange)) != null) {
                                                                                                                                                i = R.id.tvStakeMarketTypeNew;
                                                                                                                                                TextView textView10 = (TextView) yum0.f(view, R.id.tvStakeMarketTypeNew);
                                                                                                                                                if (textView10 != null) {
                                                                                                                                                    i = R.id.tvStakeMarketTypeOld;
                                                                                                                                                    TextView textView11 = (TextView) yum0.f(view, R.id.tvStakeMarketTypeOld);
                                                                                                                                                    if (textView11 != null) {
                                                                                                                                                        i = R.id.tvStakeSumChange;
                                                                                                                                                        if (((TextView) yum0.f(view, R.id.tvStakeSumChange)) != null) {
                                                                                                                                                            i = R.id.tvStakeSumNew;
                                                                                                                                                            TextView textView12 = (TextView) yum0.f(view, R.id.tvStakeSumNew);
                                                                                                                                                            if (textView12 != null) {
                                                                                                                                                                i = R.id.tvStakeSumOld;
                                                                                                                                                                TextView textView13 = (TextView) yum0.f(view, R.id.tvStakeSumOld);
                                                                                                                                                                if (textView13 != null) {
                                                                                                                                                                    i = R.id.tvStakeValue;
                                                                                                                                                                    TextView textView14 = (TextView) yum0.f(view, R.id.tvStakeValue);
                                                                                                                                                                    if (textView14 != null) {
                                                                                                                                                                        i = R.id.tvStatus;
                                                                                                                                                                        if (((TextView) yum0.f(view, R.id.tvStatus)) != null) {
                                                                                                                                                                            i = R.id.tvStatusValue;
                                                                                                                                                                            TextView textView15 = (TextView) yum0.f(view, R.id.tvStatusValue);
                                                                                                                                                                            if (textView15 != null) {
                                                                                                                                                                                i = R.id.viewShadow;
                                                                                                                                                                                View viewF = yum0.f(view, R.id.viewShadow);
                                                                                                                                                                                if (viewF != null) {
                                                                                                                                                                                    return new a3r((ConstraintLayout) view, button, lottieView, frameLayout, imageView, linearLayout, progressBar, nestedScrollView, dsNavigationBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, viewF);
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
