package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.segmented_control.DsSegmentedGroup;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f820 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f820 f9088a = new f820(1, ozq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/coupon/impl/databinding/FragmentCouponBetDsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.barrierBetType;
        if (((Barrier) yum0.f(view, R.id.barrierBetType)) != null) {
            i = R.id.bottomSheet;
            FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.bottomSheet);
            if (frameLayout != null) {
                i = R.id.btnChangeBetType;
                DsButton dsButton = (DsButton) yum0.f(view, R.id.btnChangeBetType);
                if (dsButton != null) {
                    i = R.id.btnSettings;
                    DsButton dsButton2 = (DsButton) yum0.f(view, R.id.btnSettings);
                    if (dsButton2 != null) {
                        i = R.id.btnUnAuthAction;
                        DsButton dsButton3 = (DsButton) yum0.f(view, R.id.btnUnAuthAction);
                        if (dsButton3 != null) {
                            i = R.id.btnWideUnAuthAction;
                            DsButton dsButton4 = (DsButton) yum0.f(view, R.id.btnWideUnAuthAction);
                            if (dsButton4 != null) {
                                i = R.id.clCollapsedContent;
                                ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(view, R.id.clCollapsedContent);
                                if (constraintLayout != null) {
                                    i = R.id.clExpandedContent;
                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) yum0.f(view, R.id.clExpandedContent);
                                    if (constraintLayout2 != null) {
                                        i = R.id.coefColapsedHeader;
                                        View viewF = yum0.f(view, R.id.coefColapsedHeader);
                                        if (viewF != null) {
                                            e0f e0fVarA = e0f.a(viewF);
                                            i = R.id.coefHeader;
                                            View viewF2 = yum0.f(view, R.id.coefHeader);
                                            if (viewF2 != null) {
                                                e0f e0fVarA2 = e0f.a(viewF2);
                                                i = R.id.divider;
                                                View viewF3 = yum0.f(view, R.id.divider);
                                                if (viewF3 != null) {
                                                    i = R.id.groupBetType;
                                                    Group group = (Group) yum0.f(view, R.id.groupBetType);
                                                    if (group != null) {
                                                        i = R.id.ivUnAuthEvents;
                                                        if (((ImageView) yum0.f(view, R.id.ivUnAuthEvents)) != null) {
                                                            i = R.id.llUnAuthCoef;
                                                            LinearLayout linearLayout = (LinearLayout) yum0.f(view, R.id.llUnAuthCoef);
                                                            if (linearLayout != null) {
                                                                i = R.id.llUnAuthEvents;
                                                                if (((LinearLayout) yum0.f(view, R.id.llUnAuthEvents)) != null) {
                                                                    i = R.id.oldCollapsedViewGroup;
                                                                    Group group2 = (Group) yum0.f(view, R.id.oldCollapsedViewGroup);
                                                                    if (group2 != null) {
                                                                        i = R.id.shimmerBetType;
                                                                        FrameLayout frameLayout2 = (FrameLayout) yum0.f(view, R.id.shimmerBetType);
                                                                        if (frameLayout2 != null) {
                                                                            i = R.id.shimmerUnAuthCoef;
                                                                            DsShimmerView dsShimmerView = (DsShimmerView) yum0.f(view, R.id.shimmerUnAuthCoef);
                                                                            if (dsShimmerView != null) {
                                                                                i = R.id.tabLayout;
                                                                                DsSegmentedGroup dsSegmentedGroup = (DsSegmentedGroup) yum0.f(view, R.id.tabLayout);
                                                                                if (dsSegmentedGroup != null) {
                                                                                    i = R.id.tvBetType;
                                                                                    if (((TextView) yum0.f(view, R.id.tvBetType)) != null) {
                                                                                        i = R.id.tvCoefChangeSubTitle;
                                                                                        TextView textView = (TextView) yum0.f(view, R.id.tvCoefChangeSubTitle);
                                                                                        if (textView != null) {
                                                                                            i = R.id.tvCoefChangingTitle;
                                                                                            if (((TextView) yum0.f(view, R.id.tvCoefChangingTitle)) != null) {
                                                                                                i = R.id.tvUnAuthCoef;
                                                                                                if (((TextView) yum0.f(view, R.id.tvUnAuthCoef)) != null) {
                                                                                                    i = R.id.tvUnAuthCoefValue;
                                                                                                    TextView textView2 = (TextView) yum0.f(view, R.id.tvUnAuthCoefValue);
                                                                                                    if (textView2 != null) {
                                                                                                        i = R.id.tvUnAuthEvents;
                                                                                                        if (((TextView) yum0.f(view, R.id.tvUnAuthEvents)) != null) {
                                                                                                            i = R.id.tvUnAuthEventsCount;
                                                                                                            TextView textView3 = (TextView) yum0.f(view, R.id.tvUnAuthEventsCount);
                                                                                                            if (textView3 != null) {
                                                                                                                i = R.id.vpContent;
                                                                                                                ViewPager2 viewPager2 = (ViewPager2) yum0.f(view, R.id.vpContent);
                                                                                                                if (viewPager2 != null) {
                                                                                                                    return new ozq((NestedScrollView) view, frameLayout, dsButton, dsButton2, dsButton3, dsButton4, constraintLayout, constraintLayout2, e0fVarA, e0fVarA2, viewF3, group, linearLayout, group2, frameLayout2, dsShimmerView, dsSegmentedGroup, textView, textView2, textView3, viewPager2);
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
