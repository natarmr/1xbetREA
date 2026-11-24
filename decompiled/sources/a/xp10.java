package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xp10 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final xp10 f41247a = new xp10(1, h1r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/mailing/impl/databinding/FragmentMailingManagementBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.bottomBar;
        DsBottomBar dsBottomBar = (DsBottomBar) yum0.f(view, R.id.bottomBar);
        if (dsBottomBar != null) {
            i = R.id.errorView;
            DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.errorView);
            if (dSLottieEmptyContainer != null) {
                i = R.id.progressBar;
                FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.progressBar);
                if (frameLayout != null) {
                    i = R.id.recyclerView;
                    RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recyclerView);
                    if (recyclerView != null) {
                        i = R.id.toolbar;
                        DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.toolbar);
                        if (dsNavigationBar != null) {
                            return new h1r((ConstraintLayout) view, dsBottomBar, dSLottieEmptyContainer, frameLayout, recyclerView, dsNavigationBar);
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
