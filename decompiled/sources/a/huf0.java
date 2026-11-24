package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie.LottieView;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class huf0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final huf0 f13678a = new huf0(1, g4r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/responsible_game_impl/databinding/FragmentResponsibleGameBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.btnLogout;
        MaterialButton materialButton = (MaterialButton) yum0.f(view, R.id.btnLogout);
        if (materialButton != null) {
            i = R.id.btnRetry;
            MaterialButton materialButton2 = (MaterialButton) yum0.f(view, R.id.btnRetry);
            if (materialButton2 != null) {
                i = R.id.clLottieButtons;
                ConstraintLayout constraintLayout = (ConstraintLayout) yum0.f(view, R.id.clLottieButtons);
                if (constraintLayout != null) {
                    i = R.id.lottieEmptyView;
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
                                    return new g4r((ConstraintLayout) view, materialButton, materialButton2, constraintLayout, lottieView, nq8Var, recyclerView, materialToolbar);
                                }
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
