package a;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ur50 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ur50 f36148a = new ur50(1, d2r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/promotions/news/impl/databinding/FragmentNewsCatalogBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.catalog_items;
        RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.catalog_items);
        if (recyclerView != null) {
            i = R.id.empty_view;
            LottieView lottieView = (LottieView) yum0.f(view, R.id.empty_view);
            if (lottieView != null) {
                i = R.id.navigationBar;
                DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
                if (dsNavigationBarBasic != null) {
                    i = R.id.progress;
                    View viewF = yum0.f(view, R.id.progress);
                    if (viewF != null) {
                        ProgressBar progressBar = (ProgressBar) viewF;
                        return new d2r(new nq8(progressBar, progressBar, (byte) 20), (ConstraintLayout) view, recyclerView, lottieView, dsNavigationBarBasic);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
