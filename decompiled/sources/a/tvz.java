package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class tvz extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tvz f34625a = new tvz(1, y0r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/responsible_game_impl/databinding/FragmentLimitsBinding;", 0);

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
                FrameLayout frameLayout = (FrameLayout) viewF;
                nq8 nq8Var = new nq8(frameLayout, frameLayout, (byte) 12);
                i = R.id.recyclerView;
                RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recyclerView);
                if (recyclerView != null) {
                    i = R.id.toolbar;
                    MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.toolbar);
                    if (materialToolbar != null) {
                        return new y0r((ConstraintLayout) view, lottieView, nq8Var, recyclerView, materialToolbar);
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
