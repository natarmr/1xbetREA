package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b020 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b020 f1749a = new b020(1, g2r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/settings/impl/databinding/FragmentOfficeNewFaceliftBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i = R.id.navigationBar;
        DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
        if (dsNavigationBar != null) {
            i = R.id.settingsFragment;
            FragmentContainerView fragmentContainerView = (FragmentContainerView) yum0.f(view, R.id.settingsFragment);
            if (fragmentContainerView != null) {
                return new g2r(constraintLayout, dsNavigationBar, fragmentContainerView);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
