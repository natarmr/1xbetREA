package a;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y8u0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final y8u0 f42212a = new y8u0(1, l6r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/verification/options/impl/databinding/FragmentVerificationOptionsBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.lottieEmptyView;
        LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieEmptyView);
        if (lottieView != null) {
            i = R.id.progress;
            View viewF = yum0.f(view, R.id.progress);
            if (viewF != null) {
                ProgressBar progressBar = (ProgressBar) viewF;
                nq8 nq8Var = new nq8(progressBar, progressBar, (byte) 20);
                i = R.id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recyclerView);
                if (recyclerView != null) {
                    i = R.id.toolbar;
                    MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.toolbar);
                    if (materialToolbar != null) {
                        return new l6r((ConstraintLayout) view, lottieView, nq8Var, recyclerView, materialToolbar);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
