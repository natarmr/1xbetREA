package a;

import android.view.View;
import android.widget.ProgressBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e8b0 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e8b0 f7365a = new e8b0(1, y2r.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/games_section/feature/popular_classic/databinding/FragmentPopularClassicOneXGamesBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.lottie;
        DSLottieEmptyContainer dSLottieEmptyContainer = (DSLottieEmptyContainer) yum0.f(view, R.id.lottie);
        if (dSLottieEmptyContainer != null) {
            i = R.id.progress;
            View viewF = yum0.f(view, R.id.progress);
            if (viewF != null) {
                ProgressBar progressBar = (ProgressBar) viewF;
                nq8 nq8Var = new nq8(progressBar, progressBar, (byte) 20);
                RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.recyclerOneXGamesPopularClassic);
                if (recyclerView != null) {
                    return new y2r((ConstraintLayout) view, dSLottieEmptyContainer, nq8Var, recyclerView);
                }
                i = R.id.recyclerOneXGamesPopularClassic;
            }
        }
        hny.u("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
