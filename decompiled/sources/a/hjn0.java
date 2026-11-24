package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.loader.DsLoader;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hjn0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hjn0 f13169a = new hjn0(1, m5r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/support/impl/databinding/FragmentSupportMenuBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.ffProgress;
        FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.ffProgress);
        if (frameLayout != null) {
            i = R.id.lLoader;
            if (((DsLoader) yum0.f(view, R.id.lLoader)) != null) {
                i = R.id.navigationBar;
                DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
                if (dsNavigationBar != null) {
                    i = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recycler_view);
                    if (recyclerView != null) {
                        return new m5r((ConstraintLayout) view, frameLayout, dsNavigationBar, recyclerView);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
