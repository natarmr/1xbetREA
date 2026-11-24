package a;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.lottie.LottieView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cr6 extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final cr6 f4827a = new cr6(1, zq6.class, "bind", "bind(Landroid/view/View;)Lorg/xplatform/bet_constructor/impl/databinding/BetConstructorGamesFragmentBinding;", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        View view = (View) obj;
        view.getClass();
        int i = R.id.btnMakeBet;
        MaterialButton materialButton = (MaterialButton) yum0.f(view, R.id.btnMakeBet);
        if (materialButton != null) {
            i = R.id.composeView;
            ComposeView composeView = (ComposeView) yum0.f(view, R.id.composeView);
            if (composeView != null) {
                i = R.id.flMakeBet;
                FrameLayout frameLayout = (FrameLayout) yum0.f(view, R.id.flMakeBet);
                if (frameLayout != null) {
                    i = R.id.flProgress;
                    FrameLayout frameLayout2 = (FrameLayout) yum0.f(view, R.id.flProgress);
                    if (frameLayout2 != null) {
                        i = R.id.lottieEmptyView;
                        LottieView lottieView = (LottieView) yum0.f(view, R.id.lottieEmptyView);
                        if (lottieView != null) {
                            i = R.id.navigationBar;
                            DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) yum0.f(view, R.id.navigationBar);
                            if (dsNavigationBarBasic != null) {
                                i = R.id.rvSportChips;
                                RecyclerView recyclerView = (RecyclerView) yum0.f(view, R.id.rvSportChips);
                                if (recyclerView != null) {
                                    return new zq6((ConstraintLayout) view, materialButton, composeView, frameLayout, frameLayout2, lottieView, dsNavigationBarBasic, recyclerView);
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
