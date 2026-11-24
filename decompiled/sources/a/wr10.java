package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.loader.LoaderView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wr10 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final wr10 f39618a = new wr10(1, vyq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/callback/impl/databinding/FragmentCallbackBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.loaderCallback;
        LoaderView loaderView = (LoaderView) yum0.f(view, R.id.loaderCallback);
        if (loaderView != null) {
            i = R.id.navigationBar;
            DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
            if (dsNavigationBar != null) {
                i = R.id.segments;
                ComposeView composeView = (ComposeView) yum0.f(view, R.id.segments);
                if (composeView != null) {
                    i = R.id.topBarContainer;
                    if (((LinearLayout) yum0.f(view, R.id.topBarContainer)) != null) {
                        i = R.id.viewPager;
                        ViewPager2 viewPager2 = (ViewPager2) yum0.f(view, R.id.viewPager);
                        if (viewPager2 != null) {
                            return new vyq((ConstraintLayout) view, loaderView, dsNavigationBar, composeView, viewPager2);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
