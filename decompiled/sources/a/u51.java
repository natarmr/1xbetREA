package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentContainerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.tabbar.DsTabBar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class u51 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final u51 f35073a = new u51(1, i1r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/aggregator/impl/databinding/FragmentMainAggregatorBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.fragmentContainer;
        if (((FragmentContainerView) yum0.f(view, R.id.fragmentContainer)) != null) {
            i = R.id.tabBar;
            DsTabBar dsTabBar = (DsTabBar) yum0.f(view, R.id.tabBar);
            if (dsTabBar != null) {
                return new i1r((FrameLayout) view, dsTabBar);
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
