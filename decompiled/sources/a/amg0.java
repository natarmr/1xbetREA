package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class amg0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final amg0 f1107a = new amg0(1, cmg0.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/rules/impl/databinding/RulesFragmentOldBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.lottieErrorView;
        DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.lottieErrorView);
        if (dSLottieEmptyContainer != null) {
            i = R.id.navigationBar;
            DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.navigationBar);
            if (dsNavigationBar != null) {
                i = R.id.progress;
                FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.progress);
                if (frameLayout != null) {
                    i = R.id.recycler_view;
                    RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recycler_view);
                    if (recyclerView != null) {
                        return new cmg0((ConstraintLayout) view, dSLottieEmptyContainer, dsNavigationBar, frameLayout, recyclerView);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
