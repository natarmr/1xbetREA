package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;
import org.xplatform.uikit.components.authorization_buttons.DsAuthorizationButtons;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bw10 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bw10 f3303a = new bw10(1, j1r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/main_menu/impl/databinding/FragmentMainMenuContainerBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.accountSelection;
        DsAccountSelection dsAccountSelection = (DsAccountSelection) yum0.f(view, R.id.accountSelection);
        if (dsAccountSelection != null) {
            i = R.id.authorizationButtons;
            DsAuthorizationButtons dsAuthorizationButtons = (DsAuthorizationButtons) yum0.f(view, R.id.authorizationButtons);
            if (dsAuthorizationButtons != null) {
                i = R.id.barrier;
                if (((Barrier) yum0.f(view, R.id.barrier)) != null) {
                    i = R.id.menuFragmentContainer;
                    if (((FragmentContainerView) yum0.f(view, R.id.menuFragmentContainer)) != null) {
                        i = R.id.profileToolbar;
                        DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.profileToolbar);
                        if (dsNavigationBar != null) {
                            i = R.id.progressLayout;
                            FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.progressLayout);
                            if (frameLayout != null) {
                                i = R.id.sessionTimer;
                                View viewF = yum0.f(view, R.id.sessionTimer);
                                if (viewF != null) {
                                    d5e0 d5e0VarA = d5e0.a(viewF);
                                    i = R.id.toolbar;
                                    DsNavigationBar dsNavigationBar2 = (DsNavigationBar) yum0.f(view, R.id.toolbar);
                                    if (dsNavigationBar2 != null) {
                                        i = R.id.toolbarBarrier;
                                        if (((Barrier) yum0.f(view, R.id.toolbarBarrier)) != null) {
                                            return new j1r((ConstraintLayout) view, dsAccountSelection, dsAuthorizationButtons, dsNavigationBar, frameLayout, d5e0VarA, dsNavigationBar2);
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
