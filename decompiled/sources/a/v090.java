package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class v090 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v090 f36571a = new v090(1, j4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/security/impl/databinding/FragmentRestorePasswordScreenBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.bottomBarButtons;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.bottomBarButtons);
        if (dsBottomBar != null) {
            i = R.id.container;
            ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(view, R.id.container);
            if (constraintLayout != null) {
                i = R.id.navigationBar;
                DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
                if (dsNavigationBarBasic != null) {
                    i = R.id.progress;
                    FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.progress);
                    if (frameLayout != null) {
                        i = R.id.segmentTabContainer;
                        ComposeView composeView = (ComposeView) yum0.f(view, R.id.segmentTabContainer);
                        if (composeView != null) {
                            i = R.id.vpContent;
                            ViewPager viewPager = (ViewPager) yum0.f(view, R.id.vpContent);
                            if (viewPager != null) {
                                return new j4r((ConstraintLayout) view, dsBottomBar, constraintLayout, dsNavigationBarBasic, frameLayout, composeView, viewPager);
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
