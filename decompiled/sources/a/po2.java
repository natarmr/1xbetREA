package a;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class po2 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final po2 f27311a = new po2(1, wyv.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/bethistory/impl/databinding/HistoryAlternativeInfoFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.lottieEmptyView;
        LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieEmptyView);
        if (lottieView != null) {
            i = R.id.progress;
            ProgressBar progressBar = (ProgressBar) yum0.f(view, R.id.progress);
            if (progressBar != null) {
                i = R.id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recyclerView);
                if (recyclerView != null) {
                    i = R.id.toolbar;
                    DsNavigationBar dsNavigationBar = (DsNavigationBar) yum0.f(view, R.id.toolbar);
                    if (dsNavigationBar != null) {
                        return new wyv((ConstraintLayout) view, lottieView, progressBar, recyclerView, dsNavigationBar);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
