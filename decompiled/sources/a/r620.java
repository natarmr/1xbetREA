package a;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.make_bet.impl.presentation.view.OptionBetLabelView;
import org.xplatform.ui_core.AnimatedCoefficientView;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r620 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final r620 f29915a = new r620(1, s720.class, "inflate", "inflate(Landroid/view/LayoutInflater;)Lorg/xplatform/make_bet/impl/databinding/MakeBetBottomsheetFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        LayoutInflater layoutInflater = (LayoutInflater) obj;
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.make_bet_bottomsheet_fragment, (ViewGroup) null, false);
        int i = R.id.betInfoBackground;
        View viewF = yum0.f(viewInflate, R.id.betInfoBackground);
        if (viewF != null) {
            i = R.id.btnLogin;
            DsButton dsButton = (DsButton) yum0.f(viewInflate, R.id.btnLogin);
            if (dsButton != null) {
                i = R.id.btnRegistration;
                DsButton dsButton2 = (DsButton) yum0.f(viewInflate, R.id.btnRegistration);
                if (dsButton2 != null) {
                    i = R.id.btnSettings;
                    DsButton dsButton3 = (DsButton) yum0.f(viewInflate, R.id.btnSettings);
                    if (dsButton3 != null) {
                        i = R.id.coefShimmersGroup;
                        Group group = (Group) yum0.f(viewInflate, R.id.coefShimmersGroup);
                        if (group != null) {
                            i = R.id.coefView;
                            AnimatedCoefficientView animatedCoefficientView = (AnimatedCoefficientView) yum0.f(viewInflate, R.id.coefView);
                            if (animatedCoefficientView != null) {
                                i = R.id.coefViewsGroup;
                                Group group2 = (Group) yum0.f(viewInflate, R.id.coefViewsGroup);
                                if (group2 != null) {
                                    i = R.id.groupAuthContent;
                                    Group group3 = (Group) yum0.f(viewInflate, R.id.groupAuthContent);
                                    if (group3 != null) {
                                        i = R.id.groupAuthControls;
                                        Group group4 = (Group) yum0.f(viewInflate, R.id.groupAuthControls);
                                        if (group4 != null) {
                                            i = R.id.groupSettings;
                                            if (((Group) yum0.f(viewInflate, R.id.groupSettings)) != null) {
                                                i = R.id.ivAutoSub;
                                                if (((ImageView) yum0.f(viewInflate, R.id.ivAutoSub)) != null) {
                                                    i = R.id.layoutContent;
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(viewInflate, R.id.layoutContent);
                                                    if (constraintLayout != null) {
                                                        i = R.id.llAutoSub;
                                                        LinearLayout linearLayout = (LinearLayout) yum0.f(viewInflate, R.id.llAutoSub);
                                                        if (linearLayout != null) {
                                                            i = R.id.llBetInfo;
                                                            if (((LinearLayout) yum0.f(viewInflate, R.id.llBetInfo)) != null) {
                                                                i = R.id.maxCoefShimmer;
                                                                if (((DsShimmerView) yum0.f(viewInflate, R.id.maxCoefShimmer)) != null) {
                                                                    i = R.id.maxCoefView;
                                                                    AnimatedCoefficientView animatedCoefficientView2 = (AnimatedCoefficientView) yum0.f(viewInflate, R.id.maxCoefView);
                                                                    if (animatedCoefficientView2 != null) {
                                                                        i = R.id.optiCoefBackground;
                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) yum0.f(viewInflate, R.id.optiCoefBackground);
                                                                        if (constraintLayout2 != null) {
                                                                            i = R.id.optiCoefShimmer;
                                                                            if (((DsShimmerView) yum0.f(viewInflate, R.id.optiCoefShimmer)) != null) {
                                                                                i = R.id.optiCoefView;
                                                                                AnimatedCoefficientView animatedCoefficientView3 = (AnimatedCoefficientView) yum0.f(viewInflate, R.id.optiCoefView);
                                                                                if (animatedCoefficientView3 != null) {
                                                                                    i = R.id.optionBetLabel;
                                                                                    OptionBetLabelView optionBetLabelView = (OptionBetLabelView) yum0.f(viewInflate, R.id.optionBetLabel);
                                                                                    if (optionBetLabelView != null) {
                                                                                        i = R.id.optionBetLabelBottomSpacer;
                                                                                        Space space = (Space) yum0.f(viewInflate, R.id.optionBetLabelBottomSpacer);
                                                                                        if (space != null) {
                                                                                            i = R.id.snackBarContainer;
                                                                                            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) yum0.f(viewInflate, R.id.snackBarContainer);
                                                                                            if (coordinatorLayout != null) {
                                                                                                i = R.id.space;
                                                                                                if (((Space) yum0.f(viewInflate, R.id.space)) != null) {
                                                                                                    i = R.id.tabLayout;
                                                                                                    DsSegmentedGroup dsSegmentedGroup = (DsSegmentedGroup) yum0.f(viewInflate, R.id.tabLayout);
                                                                                                    if (dsSegmentedGroup != null) {
                                                                                                        i = R.id.tvAutoSub;
                                                                                                        if (((TextView) yum0.f(viewInflate, R.id.tvAutoSub)) != null) {
                                                                                                            i = R.id.tvBetName;
                                                                                                            TextView textView = (TextView) yum0.f(viewInflate, R.id.tvBetName);
                                                                                                            if (textView != null) {
                                                                                                                i = R.id.tvCoefChangeDesc;
                                                                                                                TextView textView2 = (TextView) yum0.f(viewInflate, R.id.tvCoefChangeDesc);
                                                                                                                if (textView2 != null) {
                                                                                                                    i = R.id.tvCoefChangeTitle;
                                                                                                                    if (((TextView) yum0.f(viewInflate, R.id.tvCoefChangeTitle)) != null) {
                                                                                                                        i = R.id.tvLoginDescription;
                                                                                                                        if (((TextView) yum0.f(viewInflate, R.id.tvLoginDescription)) != null) {
                                                                                                                            i = R.id.tvMaxCoefTitle;
                                                                                                                            if (((TextView) yum0.f(viewInflate, R.id.tvMaxCoefTitle)) != null) {
                                                                                                                                i = R.id.tvOptiCoefTitle;
                                                                                                                                if (((TextView) yum0.f(viewInflate, R.id.tvOptiCoefTitle)) != null) {
                                                                                                                                    i = R.id.tvSubgame;
                                                                                                                                    TextView textView3 = (TextView) yum0.f(viewInflate, R.id.tvSubgame);
                                                                                                                                    if (textView3 != null) {
                                                                                                                                        i = R.id.tvTeamsName;
                                                                                                                                        TextView textView4 = (TextView) yum0.f(viewInflate, R.id.tvTeamsName);
                                                                                                                                        if (textView4 != null) {
                                                                                                                                            i = R.id.viewSettings;
                                                                                                                                            View viewF2 = yum0.f(viewInflate, R.id.viewSettings);
                                                                                                                                            if (viewF2 != null) {
                                                                                                                                                i = R.id.vpContent;
                                                                                                                                                ViewPager2 viewPager2 = (ViewPager2) yum0.f(viewInflate, R.id.vpContent);
                                                                                                                                                if (viewPager2 != null) {
                                                                                                                                                    return new s720((NestedScrollView) viewInflate, viewF, dsButton, dsButton2, dsButton3, group, animatedCoefficientView, group2, group3, group4, constraintLayout, linearLayout, animatedCoefficientView2, constraintLayout2, animatedCoefficientView3, optionBetLabelView, space, coordinatorLayout, dsSegmentedGroup, textView, textView2, textView3, textView4, viewF2, viewPager2);
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
        hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }
}
