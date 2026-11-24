package a;

import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class q5p extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q5p f28163a = new q5p(1, xzq.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/favorites/impl/databinding/FragmentFavoriteChampsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.errorView;
        DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.errorView);
        if (dSLottieEmptyContainer != null) {
            i = R.id.navigationBar;
            DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
            if (dsNavigationBarBasic != null) {
                i = R.id.rvChamps;
                RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.rvChamps);
                if (recyclerView != null) {
                    return new xzq((LinearLayout) view, dSLottieEmptyContainer, dsNavigationBarBasic, recyclerView);
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
