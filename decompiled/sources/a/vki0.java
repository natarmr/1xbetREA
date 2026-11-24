package a;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class vki0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vki0 f37575a = new vki0(1, c1r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/responsible_game_impl/databinding/FragmentLimitsSessionTimeBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.buttonSave;
        Button button = (Button) yum0.f(view, R.id.buttonSave);
        if (button != null) {
            i = R.id.flSave;
            FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.flSave);
            if (frameLayout != null) {
                i = R.id.lottieEmptyView;
                LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieEmptyView);
                if (lottieView != null) {
                    i = R.id.progress;
                    View viewF = yum0.f(view, R.id.progress);
                    if (viewF != null) {
                        FrameLayout frameLayout2 = (FrameLayout) viewF;
                        nq8 nq8Var = new nq8(frameLayout2, frameLayout2, (byte) 12);
                        i = R.id.recyclerView;
                        RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recyclerView);
                        if (recyclerView != null) {
                            i = R.id.toolbar;
                            MaterialToolbar materialToolbar = (MaterialToolbar) yum0.f(view, R.id.toolbar);
                            if (materialToolbar != null) {
                                return new c1r((ConstraintLayout) view, button, frameLayout, lottieView, nq8Var, recyclerView, materialToolbar);
                            }
                        }
                    }
                }
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
