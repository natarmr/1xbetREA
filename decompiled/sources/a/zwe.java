package a;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.layouts.linear.ShimmerListView;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;
import org.xplatform.uikit.components.authorization_buttons.DsAuthorizationButtons;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.left.DsCellLeftIcon;
import org.xplatform.uikit.components.cells.middle.DsCellMiddleTitle;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;
import org.xplatform.uikit.components.separator.DsSeparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zwe extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zwe f45102a = new zwe(1, pzq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/coupon/impl/databinding/FragmentCouponBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.accountSelection;
        DsAccountSelection dsAccountSelection = (DsAccountSelection) yum0.f(view, R.id.accountSelection);
        if (dsAccountSelection != null) {
            i = R.id.authButtonsView;
            DsAuthorizationButtons dsAuthorizationButtons = (DsAuthorizationButtons) yum0.f(view, R.id.authButtonsView);
            if (dsAuthorizationButtons != null) {
                i = R.id.clMakeBet;
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) yum0.f(view, R.id.clMakeBet);
                if (coordinatorLayout != null) {
                    i = R.id.composeView;
                    ComposeView composeView = (ComposeView) yum0.f(view, R.id.composeView);
                    if (composeView != null) {
                        i = R.id.couponLoaderProgress;
                        if (((ProgressBar) yum0.f(view, R.id.couponLoaderProgress)) != null) {
                            i = R.id.couponSearch;
                            DsMenuCell dsMenuCell = (DsMenuCell) yum0.f(view, R.id.couponSearch);
                            if (dsMenuCell != null) {
                                i = R.id.couponSearchTitle;
                                if (((DsCellMiddleTitle) yum0.f(view, R.id.couponSearchTitle)) != null) {
                                    i = R.id.couponTopSeparator;
                                    if (((DsSeparator) yum0.f(view, R.id.couponTopSeparator)) != null) {
                                        i = R.id.dayExpress;
                                        DsMenuCell dsMenuCell2 = (DsMenuCell) yum0.f(view, R.id.dayExpress);
                                        if (dsMenuCell2 != null) {
                                            i = R.id.dayExpressIcon;
                                            if (((DsCellLeftIcon) yum0.f(view, R.id.dayExpressIcon)) != null) {
                                                i = R.id.dayExpressTitle;
                                                if (((DsCellMiddleTitle) yum0.f(view, R.id.dayExpressTitle)) != null) {
                                                    i = R.id.dsEmptyView;
                                                    ComposeView composeView2 = (ComposeView) yum0.f(view, R.id.dsEmptyView);
                                                    if (composeView2 != null) {
                                                        i = R.id.flBottomSheetMakeBet;
                                                        FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.flBottomSheetMakeBet);
                                                        if (frameLayout != null) {
                                                            i = R.id.flLoader;
                                                            FrameLayout frameLayout2 = (FrameLayout) yum0.f(view, R.id.flLoader);
                                                            if (frameLayout2 != null) {
                                                                i = R.id.generateCoupon;
                                                                DsMenuCell dsMenuCell3 = (DsMenuCell) yum0.f(view, R.id.generateCoupon);
                                                                if (dsMenuCell3 != null) {
                                                                    i = R.id.generateCouponIcon;
                                                                    if (((DsCellLeftIcon) yum0.f(view, R.id.generateCouponIcon)) != null) {
                                                                        i = R.id.generateCouponTitle;
                                                                        if (((DsCellMiddleTitle) yum0.f(view, R.id.generateCouponTitle)) != null) {
                                                                            i = R.id.llEmpty;
                                                                            if (((LinearLayout) yum0.f(view, R.id.llEmpty)) != null) {
                                                                                i = R.id.navigationBar;
                                                                                DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
                                                                                if (dsNavigationBar != null) {
                                                                                    i = R.id.nsvOptionsScreen;
                                                                                    NestedScrollView nestedScrollView = (NestedScrollView) yum0.f(view, R.id.nsvOptionsScreen);
                                                                                    if (nestedScrollView != null) {
                                                                                        i = R.id.refillAccount;
                                                                                        DsMenuCell dsMenuCell4 = (DsMenuCell) yum0.f(view, R.id.refillAccount);
                                                                                        if (dsMenuCell4 != null) {
                                                                                            i = R.id.refillIcon;
                                                                                            DsCellLeftIcon dsCellLeftIcon = (DsCellLeftIcon) yum0.f(view, R.id.refillIcon);
                                                                                            if (dsCellLeftIcon != null) {
                                                                                                i = R.id.refillTitle;
                                                                                                DsCellMiddleTitle dsCellMiddleTitle = (DsCellMiddleTitle) yum0.f(view, R.id.refillTitle);
                                                                                                if (dsCellMiddleTitle != null) {
                                                                                                    i = R.id.rvCoupon;
                                                                                                    RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.rvCoupon);
                                                                                                    if (recyclerView != null) {
                                                                                                        i = R.id.searchIcon;
                                                                                                        if (((DsCellLeftIcon) yum0.f(view, R.id.searchIcon)) != null) {
                                                                                                            i = R.id.shimmerList;
                                                                                                            if (((ShimmerListView) yum0.f(view, R.id.shimmerList)) != null) {
                                                                                                                i = R.id.topContent;
                                                                                                                if (((LinearLayout) yum0.f(view, R.id.topContent)) != null) {
                                                                                                                    i = R.id.tvEmptyCoupon;
                                                                                                                    if (((TextView) yum0.f(view, R.id.tvEmptyCoupon)) != null) {
                                                                                                                        i = R.id.tvEmptyCouponDescription;
                                                                                                                        if (((TextView) yum0.f(view, R.id.tvEmptyCouponDescription)) != null) {
                                                                                                                            i = R.id.uploadCoupon;
                                                                                                                            DsMenuCell dsMenuCell5 = (DsMenuCell) yum0.f(view, R.id.uploadCoupon);
                                                                                                                            if (dsMenuCell5 != null) {
                                                                                                                                i = R.id.uploadCouponIcon;
                                                                                                                                if (((DsCellLeftIcon) yum0.f(view, R.id.uploadCouponIcon)) != null) {
                                                                                                                                    i = R.id.uploadCouponTitle;
                                                                                                                                    if (((DsCellMiddleTitle) yum0.f(view, R.id.uploadCouponTitle)) != null) {
                                                                                                                                        return new pzq((ConstraintLayout) view, dsAccountSelection, dsAuthorizationButtons, coordinatorLayout, composeView, dsMenuCell, dsMenuCell2, composeView2, frameLayout, frameLayout2, dsMenuCell3, dsNavigationBar, nestedScrollView, dsMenuCell4, dsCellLeftIcon, dsCellMiddleTitle, recyclerView, dsMenuCell5);
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
