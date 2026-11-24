package a;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentContainerView;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.feature.balance_management_old.impl.presentation.view.TransactionButton;
import org.xplatform.uikit.components.account_info.DsAccountInfo;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cj5 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cj5 f4442a = new cj5(1, gyq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/feature/balancemanagement/impl/databinding/FragmentBalanceManagementBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.appBar;
        AppBarLayout appBarLayout = (AppBarLayout) yum0.f(view, R.id.appBar);
        if (appBarLayout != null) {
            i = R.id.balanceInfo;
            DsAccountInfo dsAccountInfo = (DsAccountInfo) yum0.f(view, R.id.balanceInfo);
            if (dsAccountInfo != null) {
                i = R.id.balanceInfoContainer;
                ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(view, R.id.balanceInfoContainer);
                if (constraintLayout != null) {
                    i = R.id.fragmentContainer;
                    if (((FragmentContainerView) yum0.f(view, R.id.fragmentContainer)) != null) {
                        i = R.id.grAppBarContent;
                        Group group = (Group) yum0.f(view, R.id.grAppBarContent);
                        if (group != null) {
                            i = R.id.layoutAppBarShimmers;
                            View viewF = yum0.f(view, R.id.layoutAppBarShimmers);
                            if (viewF != null) {
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) viewF;
                                int i2 = R.id.view1;
                                if (((DsShimmerView) yum0.f(viewF, R.id.view1)) != null) {
                                    i2 = R.id.view2;
                                    if (((DsShimmerView) yum0.f(viewF, R.id.view2)) != null) {
                                        i2 = R.id.view3;
                                        if (((DsShimmerView) yum0.f(viewF, R.id.view3)) != null) {
                                            i2 = R.id.view4;
                                            if (((DsShimmerView) yum0.f(viewF, R.id.view4)) != null) {
                                                ewe eweVar = new ewe(constraintLayout2, (byte) 8);
                                                i = R.id.navigationBar;
                                                DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
                                                if (dsNavigationBar != null) {
                                                    i = R.id.payInButton;
                                                    TransactionButton transactionButton = (TransactionButton) yum0.f(view, R.id.payInButton);
                                                    if (transactionButton != null) {
                                                        i = R.id.payOutButton;
                                                        TransactionButton transactionButton2 = (TransactionButton) yum0.f(view, R.id.payOutButton);
                                                        if (transactionButton2 != null) {
                                                            i = R.id.progress;
                                                            if (((ProgressBar) yum0.f(view, R.id.progress)) != null) {
                                                                return new gyq((ConstraintLayout) view, appBarLayout, dsAccountInfo, constraintLayout, group, eweVar, dsNavigationBar, transactionButton, transactionButton2);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                hny.u("Missing required view with ID: ".concat(viewF.getResources().getResourceName(i2)));
                                return null;
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
